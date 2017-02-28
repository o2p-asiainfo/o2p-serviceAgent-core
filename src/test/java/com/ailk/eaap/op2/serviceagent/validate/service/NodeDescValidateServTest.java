package com.ailk.eaap.op2.serviceagent.validate.service;

import java.util.IdentityHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>NodeDescValidateServTest</code> contains tests for the class <code>{@link NodeDescValidateServ}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:17
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class NodeDescValidateServTest {
	/**
	 * Run the NodeDescValidateServ() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testNodeDescValidateServ_1()
		throws Exception {

		NodeDescValidateServ result = new NodeDescValidateServ();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testClear_1()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());

		fixture.clear();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ.<clinit>(NodeDescValidateServ.java:28)
		assertNotNull(result);
	}

	/**
	 * Run the IValidateServ getValidateServ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testGetValidateServ_1()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());

		IValidateServ result = fixture.getValidateServ();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testProcess_1()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testProcess_2()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testProcess_3()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
	}

	/**
	 * Run the void setValidateServ(IValidateServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testSetValidateServ_1()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		IValidateServ validateServ = new ValidateServ();

		fixture.setValidateServ(validateServ);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testSubtraThreadNum_1()
		throws Exception {
		NodeDescValidateServ fixture = new NodeDescValidateServ();
		fixture.setValidateServ(new ValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.NodeDescValidateServ
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
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
	 * @generatedBy CodePro at 15-12-21 下午5:17
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
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NodeDescValidateServTest.class);
	}
}