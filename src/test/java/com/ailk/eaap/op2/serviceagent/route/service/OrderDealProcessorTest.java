package com.ailk.eaap.op2.serviceagent.route.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>OrderDealProcessorTest</code> contains tests for the class <code>{@link OrderDealProcessor}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午8:08
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class OrderDealProcessorTest {
	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testClear_1()
		throws Exception {
		OrderDealProcessor fixture = new OrderDealProcessor();
		fixture.setCacheService(new CacheServiceImpl());

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		OrderDealProcessor fixture = new OrderDealProcessor();
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRunTimeMemcachedClient());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		OrderDealProcessor fixture = new OrderDealProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSubtraThreadNum_1()
		throws Exception {
		OrderDealProcessor fixture = new OrderDealProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
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
	 * @generatedBy CodePro at 15-11-12 下午8:08
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
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OrderDealProcessorTest.class);
	}
}