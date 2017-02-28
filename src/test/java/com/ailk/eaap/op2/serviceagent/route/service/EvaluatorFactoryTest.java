package com.ailk.eaap.op2.serviceagent.route.service;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.Evaluator;

/**
 * The class <code>EvaluatorFactoryTest</code> contains tests for the class <code>{@link EvaluatorFactory}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:01
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class EvaluatorFactoryTest {
	/**
	 * Run the EvaluatorFactory() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:01
	 */
	@Test
	public void testEvaluatorFactory_1()
		throws Exception {
		EvaluatorFactory result = new EvaluatorFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Evaluator getEvaluator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:01
	 */
	@Test
	public void testGetEvaluator_1()
		throws Exception {
		EvaluatorFactory fixture = new EvaluatorFactory();
		String evalName = "";

		Evaluator result = fixture.getEvaluator(evalName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: " is not supported!!"
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:449)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		//       at com.ailk.eaap.op2.serviceagent.route.service.EvaluatorFactory.createEvaluator(EvaluatorFactory.java:41)
		//       at com.ailk.eaap.op2.serviceagent.route.service.EvaluatorFactory.getEvaluator(EvaluatorFactory.java:28)
		assertNotNull(result);
	}

	/**
	 * Run the Evaluator getEvaluator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:01
	 */
	@Test
	public void testGetEvaluator_2()
		throws Exception {
		EvaluatorFactory fixture = new EvaluatorFactory();
		String evalName = "";

		Evaluator result = fixture.getEvaluator(evalName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: " is not supported!!"
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:449)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		//       at com.ailk.eaap.op2.serviceagent.route.service.EvaluatorFactory.createEvaluator(EvaluatorFactory.java:41)
		//       at com.ailk.eaap.op2.serviceagent.route.service.EvaluatorFactory.getEvaluator(EvaluatorFactory.java:28)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:01
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
	 * @generatedBy CodePro at 15-12-21 下午5:01
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
	 * @generatedBy CodePro at 15-12-21 下午5:01
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EvaluatorFactoryTest.class);
	}
}