package com.ailk.eaap.integration.o2p.script.jsr223;

import java.util.IdentityHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.scripting.ScriptSource;
import org.springframework.scripting.support.ResourceScriptSource;

/**
 * The class <code>AbstractScriptExecutorTest</code> contains tests for the class <code>{@link AbstractScriptExecutor}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:27
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class AbstractScriptExecutorTest {
	/**
	 * Run the Object executeScript(ScriptSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testExecuteScript_1()
		throws Exception {
		AbstractScriptExecutor fixture = new PythonScriptExecutor();
		ScriptSource scriptSource = new ResourceScriptSource(new EncodedResource(new ClassPathResource("")));

		Object result = fixture.executeScript(scriptSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.ailk.eaap.integration.o2p.script.ScriptingException
		//       at com.ailk.eaap.integration.o2p.script.jsr223.AbstractScriptExecutor.executeScript(AbstractScriptExecutor.java:69)
		//       at com.ailk.eaap.integration.o2p.script.jsr223.AbstractScriptExecutor.executeScript(AbstractScriptExecutor.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Object executeScript(ScriptSource,Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testExecuteScript_2()
		throws Exception {
		AbstractScriptExecutor fixture = new PythonScriptExecutor();
		ScriptSource scriptSource = new ResourceScriptSource(new EncodedResource(new ClassPathResource("")));
		Map<String, Object> variables = null;

		Object result = fixture.executeScript(scriptSource, variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.ailk.eaap.integration.o2p.script.ScriptingException
		//       at com.ailk.eaap.integration.o2p.script.jsr223.AbstractScriptExecutor.executeScript(AbstractScriptExecutor.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object executeScript(ScriptSource,Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testExecuteScript_3()
		throws Exception {
		AbstractScriptExecutor fixture = new PythonScriptExecutor();
		ScriptSource scriptSource = new ResourceScriptSource(new EncodedResource(new ClassPathResource("")));
		Map<String, Object> variables = new IdentityHashMap();

		Object result = fixture.executeScript(scriptSource, variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.ailk.eaap.integration.o2p.script.ScriptingException
		//       at com.ailk.eaap.integration.o2p.script.jsr223.AbstractScriptExecutor.executeScript(AbstractScriptExecutor.java:69)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AbstractScriptExecutorTest.class);
	}
}