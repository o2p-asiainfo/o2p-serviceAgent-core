package com.ailk.eaap.op2.serviceagent.async;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.common.JavaQueueHelper;
import com.ailk.eaap.op2.serviceagent.route.service.EndpointProcessor;
import com.ailk.eaap.op2.serviceagent.route.service.FlatFileReaderEndpoint;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.serviceagent.route.service.RouteServ;

/**
 * The class <code>AsynThreadTest</code> contains tests for the class <code>{@link AsynThread}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:26
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class AsynThreadTest {
	/**
	 * Run the AsynThread(IQueueIHelper,IRouteServ,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testAsynThread_1()
		throws Exception {
		IQueueIHelper queueIHelper = new JavaQueueHelper();
		IRouteServ routeServ = new RouteServ();
		String defalutHead = "";

		AsynThread result = new AsynThread(queueIHelper, routeServ, defalutHead);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.common.JavaQueueHelper.<clinit>(JavaQueueHelper.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getCallEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testGetCallEndpointProcessor_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getCallEndpointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertNotNull(result);
	}

	/**
	 * Run the IQueueIHelper getQueueIHelper() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testGetQueueIHelper_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());

		IQueueIHelper result = fixture.getQueueIHelper();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertNotNull(result);
	}

	/**
	 * Run the IRouteServ getRouteServ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testGetRouteServ_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());

		IRouteServ result = fixture.getRouteServ();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertNotNull(result);
	}

	/**
	 * Run the boolean isRunflag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testIsRunflag_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());

		boolean result = fixture.isRunflag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertTrue(result);
	}


	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testRun_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(false);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setCallEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testSetCallEndpointProcessor_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor callEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setCallEndpointProcessor(callEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setQueueIHelper(IQueueIHelper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testSetQueueIHelper_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		IQueueIHelper queueIHelper = new JavaQueueHelper();

		fixture.setQueueIHelper(queueIHelper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setRouteServ(IRouteServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testSetRouteServ_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		IRouteServ routeServ = new RouteServ();

		fixture.setRouteServ(routeServ);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setRunflag(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	@Test
	public void testSetRunflag_1()
		throws Exception {
		AsynThread fixture = new AsynThread(new JavaQueueHelper(), new RouteServ(), "");
		fixture.setRunflag(true);
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		boolean runflag = true;

		fixture.setRunflag(runflag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:26
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
	 * @generatedBy CodePro at 15-11-12 下午7:26
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
	 * @generatedBy CodePro at 15-11-12 下午7:26
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AsynThreadTest.class);
	}
}