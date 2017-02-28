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
 * The class <code>BshScriptExecutorTest</code> contains tests for the class <code>{@link BshScriptExecutor}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:27
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class BshScriptExecutorTest {
	/**
	 * Run the BshScriptExecutor() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testBshScriptExecutor_1()
		throws Exception {
		BshScriptExecutor result = new BshScriptExecutor();
		assertNotNull(result);
		// add additional test code here
	}

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
		BshScriptExecutor fixture = new BshScriptExecutor();
		ScriptSource scriptSource = new ResourceScriptSource(new EncodedResource(new ClassPathResource("")));

		Object result = fixture.executeScript(scriptSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.ailk.eaap.integration.o2p.script.ScriptingException: Script source must not be empty
		//       at com.ailk.eaap.integration.o2p.script.jsr223.BshScriptExecutor.executeScript(BshScriptExecutor.java:52)
		//       at com.ailk.eaap.integration.o2p.script.jsr223.BshScriptExecutor.executeScript(BshScriptExecutor.java:20)
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
		BshScriptExecutor fixture = new BshScriptExecutor();
		ScriptSource scriptSource = new ResourceScriptSource(new EncodedResource(new ClassPathResource("")));
		Map<String, Object> variables = new IdentityHashMap();

		Object result = fixture.executeScript(scriptSource, variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.ailk.eaap.integration.o2p.script.ScriptingException: Script source must not be empty
		//       at com.ailk.eaap.integration.o2p.script.jsr223.BshScriptExecutor.executeScript(BshScriptExecutor.java:52)
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
		BshScriptExecutor fixture = new BshScriptExecutor();
		ScriptSource scriptSource = new ResourceScriptSource(new EncodedResource(new ClassPathResource("")));
		Map<String, Object> variables = new IdentityHashMap();

		Object result = fixture.executeScript(scriptSource, variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.ailk.eaap.integration.o2p.script.ScriptingException: Script source must not be empty
		//       at com.ailk.eaap.integration.o2p.script.jsr223.BshScriptExecutor.executeScript(BshScriptExecutor.java:52)
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
	public void testExecuteScript_4()
		throws Exception {
		BshScriptExecutor fixture = new BshScriptExecutor();
		ScriptSource scriptSource = new ResourceScriptSource(new EncodedResource(new ClassPathResource("")));
		Map<String, Object> variables = new IdentityHashMap();

		Object result = fixture.executeScript(scriptSource, variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.ailk.eaap.integration.o2p.script.ScriptingException: Script source must not be empty
		//       at com.ailk.eaap.integration.o2p.script.jsr223.BshScriptExecutor.executeScript(BshScriptExecutor.java:52)
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
		new org.junit.runner.JUnitCore().run(BshScriptExecutorTest.class);
	}
}