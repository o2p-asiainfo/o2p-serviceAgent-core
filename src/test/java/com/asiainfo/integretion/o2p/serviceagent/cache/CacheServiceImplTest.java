package com.asiainfo.integretion.o2p.serviceagent.cache;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.op2.bo.Tenant;
import net.rubyeye.xmemcached.MemcachedClient;

/**
 * The class <code>CacheServiceImplTest</code> contains tests for the class <code>{@link CacheServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:18
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class CacheServiceImplTest {
	/**
	 * Run the CacheServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheServiceImpl_1()
		throws Exception {
		CacheServiceImpl result = new CacheServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.o2p.common.cache.CacheCommon.<clinit>(CacheCommon.java:27)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_4()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_5()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_6()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_7()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_8()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addAll(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddAll_9()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		Integer tenantId = new Integer(1);

		fixture.addAll(tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
	}

	/**
	 * Run the void addByModuleName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddByModuleName_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addByModuleName(moduleName, tenantId);

		// add additional test code here
	}

	/**
	 * Run the void addByModuleName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddByModuleName_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addByModuleName(moduleName, tenantId);

		// add additional test code here
	}

	/**
	 * Run the void addByModuleName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddByModuleName_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addByModuleName(moduleName, tenantId);

		// add additional test code here
	}

	/**
	 * Run the void addObj(String,int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObj_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";
		int time = 1;
		Object obj = new Object();

		fixture.addObj(key, time, obj);

		// add additional test code here
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_4()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_5()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_6()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_7()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_8()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addObject(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddObject_9()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.addObject(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addObject(CacheServiceImpl.java:118)
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_4()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_5()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_6()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_7()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_8()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_9()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_10()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_11()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_12()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_13()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_14()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTenant_15()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addTenant();

		// add additional test code here
	}

	/**
	 * Run the void addToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddToken_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addToken();

		// add additional test code here
	}

	/**
	 * Run the void addTrans(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTrans_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String id = "";

		fixture.addTrans(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addTrans(CacheServiceImpl.java:311)
	}

	/**
	 * Run the void addTrans(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddTrans_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String id = "";

		fixture.addTrans(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addTrans(CacheServiceImpl.java:311)
	}

	/**
	 * Run the void addVersions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddVersions_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addVersions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addVersions(CacheServiceImpl.java:142)
	}

	/**
	 * Run the void addVersions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddVersions_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addVersions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addVersions(CacheServiceImpl.java:142)
	}

	/**
	 * Run the void addVersions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddVersions_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addVersions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addVersions(CacheServiceImpl.java:142)
	}

	/**
	 * Run the void addVersions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testAddVersions_4()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.addVersions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addVersions(CacheServiceImpl.java:142)
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = null;
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "MODULE_ALL_FORCE";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "MODULE_ALL_FORCE";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_4()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_5()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "MODULE_ALL";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addByModuleName(CacheServiceImpl.java:43)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.addAll(CacheServiceImpl.java:54)
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.cacheService(CacheServiceImpl.java:229)
		assertTrue(result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_6()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "MODULE_ALL_FORCE";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_7()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "MODULE_ALL_FORCE";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_8()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "MODULE_ALL_FORCE";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean cacheService(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testCacheService_9()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "MODULE_ALL_FORCE";
		Integer tenantId = new Integer(1);

		boolean result = fixture.cacheService(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<Tenant> getAllTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testGetAllTenant_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		List<Tenant> result = fixture.getAllTenant();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ICacheFactory<String, Object> getCacheFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testGetCacheFactory_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		ICacheFactory<String, Object> result = fixture.getCacheFactory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCacheClient());
		assertEquals(null, result.getLocalCacheClient());
		assertEquals(null, result.getRedis());
	}

	/**
	 * Run the Object getKey(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";
		Integer tenantId = new Integer(1);

		Object result = fixture.getKey(key, tenantId);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getObjByKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testGetObjByKey_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";

		Object result = fixture.getObjByKey(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MemcachedClient getRunTimeMemcachedClient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testGetRunTimeMemcachedClient_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		MemcachedClient result = fixture.getRunTimeMemcachedClient();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getTransactionIdCacheTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testGetTransactionIdCacheTime_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		int result = fixture.getTransactionIdCacheTime();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isNeedReload(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsNeedReload_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		boolean result = fixture.isNeedReload(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNeedReload(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsNeedReload_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		boolean result = fixture.isNeedReload(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNeedReload(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsNeedReload_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		boolean result = fixture.isNeedReload(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNeedReload(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsNeedReload_4()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		boolean result = fixture.isNeedReload(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNeedReload(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsNeedReload_5()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		boolean result = fixture.isNeedReload(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNeedReload(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsNeedReload_6()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		boolean result = fixture.isNeedReload(moduleName, tenantId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isTransExist(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsTransExist_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String transid = "";

		boolean result = fixture.isTransExist(transid);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTransExist(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsTransExist_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String transid = "";

		boolean result = fixture.isTransExist(transid);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTransExist(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testIsTransExist_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String transid = "";

		boolean result = fixture.isTransExist(transid);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_4()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_5()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_6()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_7()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_8()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_9()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_10()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_11()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_12()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_13()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_14()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_15()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void loadObjectsByKeyListName(String,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testLoadObjectsByKeyListName_16()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String moduleName = "";
		Integer tenantId = new Integer(1);

		fixture.loadObjectsByKeyListName(moduleName, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.o2p.common.cache.CacheCommon
		//       at com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl.loadObjectsByKeyListName(CacheServiceImpl.java:267)
	}

	/**
	 * Run the void reflushAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReflushAll_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.reflushAll();

		// add additional test code here
	}

	/**
	 * Run the void reflushAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReflushAll_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.reflushAll();

		// add additional test code here
	}

	/**
	 * Run the void reflushMemcache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReflushMemcache_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);

		fixture.reflushMemcache();

		// add additional test code here
	}

	/**
	 * Run the void removeKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testRemoveKey_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";

		fixture.removeKey(key);

		// add additional test code here
	}

	/**
	 * Run the void removeKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testRemoveKey_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";

		fixture.removeKey(key);

		// add additional test code here
	}

	/**
	 * Run the void replace(String,int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReplace_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";
		int time = 1;
		Object obj = new Object();

		fixture.replace(key, time, obj);

		// add additional test code here
	}

	/**
	 * Run the void replace(String,int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReplace_2()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";
		int time = 1;
		Object obj = new Object();

		fixture.replace(key, time, obj);

		// add additional test code here
	}

	/**
	 * Run the void replace(String,int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testReplace_3()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		String key = "";
		int time = 1;
		Object obj = new Object();

		fixture.replace(key, time, obj);

		// add additional test code here
	}

	/**
	 * Run the void setCacheFactory(ICacheFactory<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testSetCacheFactory_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		ICacheFactory<String, Object> cacheFactory = new CacheFactory();

		fixture.setCacheFactory(cacheFactory);

		// add additional test code here
	}

	/**
	 * Run the void setTransactionIdCacheTime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:18
	 */
	@Test
	public void testSetTransactionIdCacheTime_1()
		throws Exception {
		CacheServiceImpl fixture = new CacheServiceImpl();
		fixture.setCacheFactory(new CacheFactory());
		fixture.setTransactionIdCacheTime(1);
		int transactionIdCacheTime = 1;

		fixture.setTransactionIdCacheTime(transactionIdCacheTime);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(CacheServiceImplTest.class);
	}
}