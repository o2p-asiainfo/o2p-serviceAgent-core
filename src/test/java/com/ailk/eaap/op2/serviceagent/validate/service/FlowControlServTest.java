package com.ailk.eaap.op2.serviceagent.validate.service;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>FlowControlServTest</code> contains tests for the class <code>{@link FlowControlServ}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:15
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class FlowControlServTest {
	/**
	 * Run the FlowControlServ() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testFlowControlServ_1()
		throws Exception {
		FlowControlServ result = new FlowControlServ();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void flowControl(MessageBO<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testFlowControl_1()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO<Object> msg = new MessageBO();

		fixture.flowControl(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the void flowControl(MessageBO<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testFlowControl_2()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO<Object> msg = new MessageBO();

		fixture.flowControl(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the void flowControl(MessageBO<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testFlowControl_3()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO<Object> msg = new MessageBO();

		fixture.flowControl(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the void flowControl(MessageBO<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testFlowControl_4()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO<Object> msg = new MessageBO();

		fixture.flowControl(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ.<clinit>(FlowControlServ.java:33)
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testSubtraThreadNum_1()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testSubtraThreadNum_2()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		String servId = "a";

		fixture.subtraThreadNum(servId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testSubtraThreadNum_3()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		String servId = "a";

		fixture.subtraThreadNum(servId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	@Test
	public void testSubtraThreadNum_4()
		throws Exception {
		FlowControlServ fixture = new FlowControlServ();
		fixture.setCacheService(new CacheServiceImpl());
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.FlowControlServ
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:15
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
	 * @generatedBy CodePro at 15-12-21 下午5:15
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
	 * @generatedBy CodePro at 15-12-21 下午5:15
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FlowControlServTest.class);
	}
}