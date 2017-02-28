package com.ailk.eaap.integration.o2p.contractbody.service;

import static org.junit.Assert.assertNotNull;

import java.util.IdentityHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.validate.service.IProtocolValidateServ;
import com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ;
import com.ailk.eaap.op2.bo.Endpoint;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>ContractBodyServiceImplTest</code> contains tests for the class <code>{@link ContractBodyServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:23
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ContractBodyServiceImplTest {
	/**
	 * Run the ContractBodyServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testContractBodyServiceImpl_1()
		throws Exception {
		ContractBodyServiceImpl result = new ContractBodyServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ.<clinit>(ProtocolValidateServ.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_1()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_2()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_3()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_4()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_5()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_6()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_7()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_8()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_9()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_10()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_11()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_12()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_13()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_14()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_15()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setNodeValsByContractFormat(MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetNodeValsByContractFormat_16()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBO = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());

		fixture.setNodeValsByContractFormat(messageBO, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void setProtocolValidateSer(IProtocolValidateServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	@Test
	public void testSetProtocolValidateSer_1()
		throws Exception {
		ContractBodyServiceImpl fixture = new ContractBodyServiceImpl();
		fixture.setProtocolValidateSer(new ProtocolValidateServ());
		fixture.setCacheService(new CacheServiceImpl());
		IProtocolValidateServ protocolValidateSer = new ProtocolValidateServ();

		fixture.setProtocolValidateSer(protocolValidateSer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}


	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:23
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
	 * @generatedBy CodePro at 15-11-12 下午7:23
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
	 * @generatedBy CodePro at 15-11-12 下午7:23
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ContractBodyServiceImplTest.class);
	}
}