package com.ailk.eaap.integration.o2p.script;

import java.util.Map;

import org.springframework.scripting.ScriptSource;

/**
 * 
 * @author zhuangyq
 *
 */
public interface ScriptExecutor {
	/**
	 * @param scriptSource
	 */
	public Object executeScript(ScriptSource scriptSource);
	
	/** 
	 * @param scriptSource
	 * @param variables -bind variable
	 */
	public Object executeScript(ScriptSource scriptSource,Map<String,Object> variables);
}
