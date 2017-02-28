package com.ailk.eaap.integration.o2p.script.jsr223;

import java.util.Date;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scripting.ScriptSource;
import org.springframework.util.Assert;

import com.ailk.eaap.integration.o2p.script.ScriptExecutor;
import com.ailk.eaap.integration.o2p.script.ScriptingException;

public abstract class AbstractScriptExecutor implements ScriptExecutor{
	protected final Log logger = LogFactory.getLog(this.getClass());

	protected final ScriptEngine scriptEngine;

	protected final String language;
	public AbstractScriptExecutor(String language) {
		Assert.hasText(language, "language must not be empty");
		this.language = language;

		scriptEngine = new ScriptEngineManager().getEngineByName(this.language);

		if (logger.isDebugEnabled()) {

			if (scriptEngine == null) {
				logger.error(invlalidLanguageMessage(this.language));
			}
			else {
				logger.debug("using script engine : " + scriptEngine.getFactory().getEngineName());
			}
		}
	}
	public Object executeScript(ScriptSource scriptSource) {
		return this.executeScript(scriptSource, null);
	}

	public Object executeScript(ScriptSource scriptSource, Map<String, Object> variables) {
		Object result = null;

		try {
			String script = scriptSource.getScriptAsString();
			Date start = new Date();
			if (logger.isDebugEnabled()) {
				logger.debug("executing script: " + script);
			}

			if (variables != null) {
				result = scriptEngine.eval(script, new SimpleBindings(variables));
			}
			else {
				result = scriptEngine.eval(script);
			}

			result = postProcess(result, scriptEngine, script);

			if (logger.isDebugEnabled()) {
				logger.debug("script executed in " + (new Date().getTime() - start.getTime()) + " ms");
			}
		}

		catch (Exception e) {
			throw new ScriptingException(e.getMessage(), e);
		}

		return result;
	}
	/**
	 * Subclasses may implement this to provide any special handling required
	 * @param result
	 * @param scriptEngine
	 * @param script
	 * @return modified result
	 */
	protected abstract Object postProcess(Object result, ScriptEngine scriptEngine, String script);

	private static String invlalidLanguageMessage(String language) {
		return new StringBuilder().append(ScriptEngineManager.class.getName())
				.append(" is unable to create a script engine for language '").append(language).append("'.\n")
				.append("This may be due to a missing language implementation or an invalid language name.").toString();
	}
}
