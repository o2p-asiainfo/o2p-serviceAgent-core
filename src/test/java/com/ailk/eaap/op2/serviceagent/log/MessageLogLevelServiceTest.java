package com.ailk.eaap.op2.serviceagent.log;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>MessageLogLevelServiceTest</code> contains tests for the class <code>{@link MessageLogLevelService}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:29
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MessageLogLevelServiceTest {
	/**
	 * Run the MessageLogLevelService() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testMessageLogLevelService_1()
		throws Exception {
		MessageLogLevelService result = new MessageLogLevelService();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getCurrentRunningStatus(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetCurrentRunningStatus_1()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();

		String result = fixture.getCurrentRunningStatus(bo);

		// add additional test code here
		assertEquals("NORMAL", result);
	}

	/**
	 * Run the String getCurrentRunningStatus(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetCurrentRunningStatus_2()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();

		String result = fixture.getCurrentRunningStatus(bo);

		// add additional test code here
		assertEquals("NORMAL", result);
	}

	/**
	 * Run the String getCurrentRunningStatus(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetCurrentRunningStatus_3()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();

		String result = fixture.getCurrentRunningStatus(bo);

		// add additional test code here
		assertEquals("NORMAL", result);
	}

	/**
	 * Run the String getSerLogLevel(SerInvokeIns) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetSerLogLevel_1()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns ins = null;

		String result = fixture.getSerLogLevel(ins);

		// add additional test code here
		assertEquals("All", result);
	}

	/**
	 * Run the String getSerLogLevel(SerInvokeIns) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetSerLogLevel_2()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns ins = new SerInvokeIns();
		ins.setLogLevel("");

		String result = fixture.getSerLogLevel(ins);

		// add additional test code here
		assertEquals("All", result);
	}

	/**
	 * Run the String getSerLogLevel(SerInvokeIns) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetSerLogLevel_3()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns ins = new SerInvokeIns();
		ins.setLogLevel("");

		String result = fixture.getSerLogLevel(ins);

		// add additional test code here
		assertEquals("All", result);
	}

	/**
	 * Run the boolean isLogOut(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testIsLogOut_1()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();

		boolean result = fixture.isLogOut(bo);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLogOut(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testIsLogOut_2()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();

		boolean result = fixture.isLogOut(bo);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLogOut(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testIsLogOut_3()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();

		boolean result = fixture.isLogOut(bo);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLogTypeOut(MessageBO,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testIsLogTypeOut_1()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();
		String logObjectType = "";

		boolean result = fixture.isLogTypeOut(bo, logObjectType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLogTypeOut(MessageBO,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testIsLogTypeOut_2()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();
		String logObjectType = "";

		boolean result = fixture.isLogTypeOut(bo, logObjectType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLogTypeOut(MessageBO,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testIsLogTypeOut_3()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO bo = new MessageBO();
		String logObjectType = "";

		boolean result = fixture.isLogTypeOut(bo, logObjectType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		MessageLogLevelService fixture = new MessageLogLevelService();
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
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
	 * @generatedBy CodePro at 15-11-12 下午7:29
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
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageLogLevelServiceTest.class);
	}
}