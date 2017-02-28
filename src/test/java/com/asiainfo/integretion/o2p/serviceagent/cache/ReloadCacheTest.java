package com.asiainfo.integretion.o2p.serviceagent.cache;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.common.JavaQueueHelper;

/**
 * The class <code>ReloadCacheTest</code> contains tests for the class <code>{@link ReloadCache}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:18
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ReloadCacheTest {
	/**
	 * Run the ReloadCache() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_1()
		throws Exception {
		ReloadCache result = new ReloadCache();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean addAll(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());
		String tenantId = "";

		boolean result = fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertTrue(result);
	}

	/**
	 * Run the boolean cacheRefreshService(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheRefreshService_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());
		String tenantId = "";
		String moduleName = "";
		String serviceType = "";

		boolean result = fixture.cacheRefreshService(tenantId, moduleName, serviceType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertTrue(result);
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
		assertNotNull(result);
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_2()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_3()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("client");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_4()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("client");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_5()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("client");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_6()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("server");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_7()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("server");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_8()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("server");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_9()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("server");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_10()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_11()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_12()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_13()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_14()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_15()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_16()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void reloadCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReloadCache_17()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.reloadCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setDeapth(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testSetDeapth_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());
		String deapth = "";

		fixture.setDeapth(deapth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.common.JavaQueueHelper.<clinit>(JavaQueueHelper.java:12)
	}

	/**
	 * Run the void setJavaQueueHelper(IQueueIHelper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testSetJavaQueueHelper_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());
		IQueueIHelper javaQueueHelper = new JavaQueueHelper();

		fixture.setJavaQueueHelper(javaQueueHelper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void setServiceAgentMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testSetServiceAgentMode_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());
		String serviceAgentMode = "";

		fixture.setServiceAgentMode(serviceAgentMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.common.JavaQueueHelper
	}

	/**
	 * Run the void synCacheToDb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testSynCacheToDb_1()
		throws Exception {
		ReloadCache fixture = new ReloadCache();
		fixture.setDeapth("");
		fixture.setServiceAgentMode("");
		fixture.setJavaQueueHelper(new JavaQueueHelper());
		fixture.setCacheService(new CacheServiceImpl());
		int type = 1;

		fixture.synCacheToDb(type);

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
	 * @generatedBy CodePro at 15-12-21 下午5:18
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
	 * @generatedBy CodePro at 15-12-21 下午5:18
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
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReloadCacheTest.class);
	}
}