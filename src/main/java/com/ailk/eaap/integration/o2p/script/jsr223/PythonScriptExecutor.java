package com.ailk.eaap.integration.o2p.script.jsr223;

import javax.script.ScriptEngine;

public class PythonScriptExecutor extends AbstractScriptExecutor{

	public PythonScriptExecutor() {
		super("python"); 
	}
	
	@Override
	protected Object postProcess(Object result, ScriptEngine scriptEngine, String script) {
		Object newResult= result;
		if (newResult == null) {
			String returnVariableName = PythonVariableParser.parseReturnVariable(script);
			newResult = scriptEngine.get(returnVariableName);
		}
		return newResult;
	}
	
	public static class PythonVariableParser {
		public static String parseReturnVariable(String script){
			String[] lines = script.trim().split("\n");
			String lastLine = lines[lines.length -1];
			String[] tokens = lastLine.split("=");
			return tokens[0].trim();
		}
	}

}
