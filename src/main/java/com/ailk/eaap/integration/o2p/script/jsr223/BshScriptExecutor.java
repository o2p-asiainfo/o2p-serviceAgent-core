package com.ailk.eaap.integration.o2p.script.jsr223;

import java.util.Date;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scripting.ScriptSource;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import bsh.Interpreter;

import com.ailk.eaap.integration.o2p.script.ScriptExecutor;
import com.ailk.eaap.integration.o2p.script.ScriptingException;


public class BshScriptExecutor implements ScriptExecutor{
	private final Log logger = LogFactory.getLog(this.getClass());
	
	public Object executeScript(ScriptSource scriptSource) {
		return this.executeScript(scriptSource, null);
	}

	public Object executeScript(ScriptSource scriptSource,
			Map<String, Object> variables) {
		Object result = null;
		try {
			String script = scriptSource.getScriptAsString();
			Assert.hasText(script, "Script source must not be empty");
			Interpreter interpreter = new Interpreter();
			Date start = new Date();
			if (logger.isDebugEnabled()) {
				logger.debug("executing script: " + script);
			}
			if (!CollectionUtils.isEmpty(variables)) {
				for (Map.Entry<String, Object> entry : variables.entrySet()) {
					interpreter.set(entry.getKey(), entry.getValue());
				}
				result = interpreter.eval(script);
			}
			else {
				result = interpreter.eval(script);
			}

			result = postProcess(result);

			if (logger.isDebugEnabled()) {
				logger.debug("script executed in " + (new Date().getTime() - start.getTime()) + " ms");
			}
		}

		catch (Exception e) {
			throw new ScriptingException(e.getMessage(), e);
		}

		return result;
	}

	private Object postProcess(Object result) {
		return result;
	}


}
