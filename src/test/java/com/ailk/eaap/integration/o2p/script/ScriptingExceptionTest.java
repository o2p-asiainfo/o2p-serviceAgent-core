package com.ailk.eaap.integration.o2p.script;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/**
 * The class <code>ScriptingExceptionTest</code> contains tests for the class <code>{@link ScriptingException}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:27
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ScriptingExceptionTest {
	/**
	 * Run the ScriptingException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testScriptingException_1()
		throws Exception {
		String description = "";

		ScriptingException result = new ScriptingException(description);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getCode());
		assertEquals(null, result.getFailedMessage());
		assertEquals(null, result.getCause());
		assertEquals("com.ailk.eaap.integration.o2p.script.ScriptingException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the ScriptingException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testScriptingException_2()
		throws Exception {
		String description = "";
		Throwable cause = new Throwable();

		ScriptingException result = new ScriptingException(description, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getCode());
		assertEquals(null, result.getFailedMessage());
		assertEquals("com.ailk.eaap.integration.o2p.script.ScriptingException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the ScriptingException(MessageBO<?>,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testScriptingException_3()
		throws Exception {
		MessageBO<Object> message = new MessageBO();
		int code = 1;
		String description = "";

		ScriptingException result = new ScriptingException(message, code, description);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getCode());
		assertEquals(null, result.getCause());
		assertEquals("com.ailk.eaap.integration.o2p.script.ScriptingException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
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
		new org.junit.runner.JUnitCore().run(ScriptingExceptionTest.class);
	}
}