package com.ailk.eaap.integration.o2p.script.jsr223;

import javax.script.ScriptEngine;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PythonScriptExecutorTest</code> contains tests for the class <code>{@link PythonScriptExecutor}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:27
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class PythonScriptExecutorTest {
	/**
	 * Run the PythonScriptExecutor() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testPythonScriptExecutor_1()
		throws Exception {

		PythonScriptExecutor result = new PythonScriptExecutor();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object postProcess(Object,ScriptEngine,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testPostProcess_1()
		throws Exception {
		PythonScriptExecutor fixture = new PythonScriptExecutor();
		Object result = null;
		ScriptEngine scriptEngine = null;
		String script = "";

		Object result2 = fixture.postProcess(result, scriptEngine, script);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.script.jsr223.PythonScriptExecutor.postProcess(PythonScriptExecutor.java:18)
		assertNotNull(result2);
	}

	/**
	 * Run the Object postProcess(Object,ScriptEngine,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testPostProcess_2()
		throws Exception {
		PythonScriptExecutor fixture = new PythonScriptExecutor();
		Object result = new Object();
		ScriptEngine scriptEngine = null;
		String script = "";

		Object result2 = fixture.postProcess(result, scriptEngine, script);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PythonScriptExecutorTest.class);
	}
}