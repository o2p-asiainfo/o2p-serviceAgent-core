package com.ailk.eaap.integration.o2p.script.jsr223;

import javax.script.ScriptEngine;

public class DefaultScriptExecutor extends AbstractScriptExecutor{

	public DefaultScriptExecutor(String language) {
		super(language);
	}

	@Override
	protected Object postProcess(Object result, ScriptEngine scriptEngine,
			String script) {
		return result;
	}

}
