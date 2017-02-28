package com.ailk.eaap.op2.serviceagent.task;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.log.MessageLogService;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.serviceagent.route.service.RouteServ;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>TechTaskJobTest</code> contains tests for the class <code>{@link TechTaskJob}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:14
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class TechTaskJobTest {
	/**
	 * Run the TechTaskJob() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTechTaskJob_1()
		throws Exception {
		TechTaskJob result = new TechTaskJob();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.task.TechTaskJob.<clinit>(TechTaskJob.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the MessageLogService getMessageLogService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testGetMessageLogService_1()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		MessageLogService result = fixture.getMessageLogService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
		assertNotNull(result);
	}

	/**
	 * Run the IRouteServ getRouteServ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testGetRouteServ_1()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		IRouteServ result = fixture.getRouteServ();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void setMessageLogService(MessageLogService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetMessageLogService_1()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());
		MessageLogService messageLogService = new MessageLogService();

		fixture.setMessageLogService(messageLogService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void setRouteServ(IRouteServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetRouteServ_1()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());
		IRouteServ routeServ = new RouteServ();

		fixture.setRouteServ(routeServ);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void triggerJob() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTriggerJob_1()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.triggerJob();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void triggerJob() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTriggerJob_2()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.triggerJob();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void triggerJob() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTriggerJob_3()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.triggerJob();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void triggerJob() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTriggerJob_4()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.triggerJob();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void triggerJob() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTriggerJob_5()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.triggerJob();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Run the void triggerJob() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTriggerJob_6()
		throws Exception {
		TechTaskJob fixture = new TechTaskJob();
		fixture.setRouteServ(new RouteServ());
		fixture.setMessageLogService(new MessageLogService());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.triggerJob();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TechTaskJob
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
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
	 * @generatedBy CodePro at 15-12-21 下午5:14
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
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TechTaskJobTest.class);
	}
}