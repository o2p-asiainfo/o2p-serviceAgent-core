package com.ailk.eaap.integration.o2p.script.jsr223;

import java.util.HashMap;
import java.util.Map;

import com.ailk.eaap.integration.o2p.script.ScriptExecutor;

public class ScriptExecutorFactory {
	private static Map<String,ScriptExecutor> objectHolder = new HashMap<String,ScriptExecutor>();
	private boolean isSington = false;
	
	public void setSington(boolean isSington) {
		this.isSington = isSington;
	}
	
	protected void initScriptExecutor(){
		objectHolder.put("BeanShell", new BshScriptExecutor());
		objectHolder.put("bsh", new BshScriptExecutor());
		objectHolder.put("javascript", new DefaultScriptExecutor("javascript"));
	}

	public ScriptExecutor getScriptExecutor(String language) {
		if(!isSington){
			if (language.equalsIgnoreCase("BeanShell") || language.equalsIgnoreCase("bsh")){
				return new BshScriptExecutor();
			} 
			else if (language.equalsIgnoreCase("javascript") ||  language.equalsIgnoreCase("js")) {
				return new DefaultScriptExecutor(language);
			}
			return new DefaultScriptExecutor(language);
		}else{
			return getScriptExecutorSington(language);
		}

	}
	public ScriptExecutor getScriptExecutorSington(String language){
		return objectHolder.get(language);
	}
}
