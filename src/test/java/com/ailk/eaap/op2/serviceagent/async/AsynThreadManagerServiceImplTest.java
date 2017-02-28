package com.ailk.eaap.op2.serviceagent.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.common.JavaQueueHelper;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.serviceagent.route.service.RouteServ;

/**
 * The class <code>AsynThreadManagerServiceImplTest</code> contains tests for the class <code>{@link AsynThreadManagerServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:31
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class AsynThreadManagerServiceImplTest {
	/**
	 * Run the String getDefalutHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetDefalutHead_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		String result = fixture.getDefalutHead();

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
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetQueueIHelper_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

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
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetRouteServ_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		IRouteServ result = fixture.getRouteServ();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertNotNull(result);
	}

	/**
	 * Run the ExecutorService getSendMsgService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetSendMsgService_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		ExecutorService result = fixture.getSendMsgService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertNotNull(result);
	}

	/**
	 * Run the String getThreadNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetThreadNum_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		String result = fixture.getThreadNum();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertNotNull(result);
	}

	/**
	 * Run the void setDefalutHead(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetDefalutHead_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");
		String defalutHead = "";

		fixture.setDefalutHead(defalutHead);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setQueueIHelper(IQueueIHelper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetQueueIHelper_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");
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
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetRouteServ_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");
		IRouteServ routeServ = new RouteServ();

		fixture.setRouteServ(routeServ);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setSendMsgService(ExecutorService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetSendMsgService_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");
		ExecutorService sendMsgService = new ScheduledThreadPoolExecutor(1);

		fixture.setSendMsgService(sendMsgService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetThreadNum_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");
		String threadNum = "";

		fixture.setThreadNum(threadNum);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStart_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.common.JavaQueueHelper.<clinit>(JavaQueueHelper.java:12)
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStart_2()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStart_3()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStart_4()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStart_5()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStart_6()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStop_1()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStop_2()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testStop_3()
		throws Exception {
		AsynThreadManagerServiceImpl fixture = new AsynThreadManagerServiceImpl();
		fixture.setQueueIHelper(new JavaQueueHelper());
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		fixture.setDefalutHead("");
		fixture.setRouteServ(new RouteServ());
		fixture.setThreadNum("");

		fixture.stop();

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
	 * @generatedBy CodePro at 15-12-21 下午4:31
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
	 * @generatedBy CodePro at 15-12-21 下午4:31
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
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AsynThreadManagerServiceImplTest.class);
	}
}