package com.ailk.eaap.op2.serviceagent.route.service;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.common.JavaQueueHelper;

/**
 * The class <code>AsynProcessorTest</code> contains tests for the class <code>{@link AsynProcessor}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午8:06
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class AsynProcessorTest {
	/**
	 * Run the AsynProcessor() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:06
	 */
	@Test
	public void testAsynProcessor_1()
		throws Exception {
		AsynProcessor result = new AsynProcessor();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:06
	 */
	@Test
	public void testClear_1()
		throws Exception {
		AsynProcessor fixture = new AsynProcessor();
		fixture.setQueueIHelper(new JavaQueueHelper());

		fixture.clear();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.route.service.AsynProcessor.<clinit>(AsynProcessor.java:15)
	}

	/**
	 * Run the IQueueIHelper getQueueIHelper() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:06
	 */
	@Test
	public void testGetQueueIHelper_1()
		throws Exception {
		AsynProcessor fixture = new AsynProcessor();
		fixture.setQueueIHelper(new JavaQueueHelper());

		IQueueIHelper result = fixture.getQueueIHelper();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.AsynProcessor
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:06
	 */

	/**
	 * Run the void setQueueIHelper(IQueueIHelper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:06
	 */
	@Test
	public void testSetQueueIHelper_1()
		throws Exception {
		AsynProcessor fixture = new AsynProcessor();
		fixture.setQueueIHelper(new JavaQueueHelper());
		IQueueIHelper queueIHelper = new JavaQueueHelper();

		fixture.setQueueIHelper(queueIHelper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.AsynProcessor
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:06
	 */
	@Test
	public void testSubtraThreadNum_1()
		throws Exception {
		AsynProcessor fixture = new AsynProcessor();
		fixture.setQueueIHelper(new JavaQueueHelper());
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.AsynProcessor
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:06
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
	 * @generatedBy CodePro at 15-11-12 下午8:06
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
	 * @generatedBy CodePro at 15-11-12 下午8:06
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AsynProcessorTest.class);
	}
}