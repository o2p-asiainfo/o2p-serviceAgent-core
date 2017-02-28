package com.ailk.eaap.op2.serviceagent.protocol;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.validate.service.IProtocolValidateServ;
import com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>HttpControllerTest</code> contains tests for the class <code>{@link HttpController}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:36
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class HttpControllerTest {
	/**
	 * Run the HttpController() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:36
	 */
	@Test
	public void testHttpController_1()
		throws Exception {
		HttpController result = new HttpController();
		assertNotNull(result);
		// add additional test code here
	}


	/**
	 * Run the void initContractVersionKey(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:36
	 */
	@Test
	public void testInitContractVersionKey_1()
		throws Exception {
		HttpController fixture = new HttpController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String name = "";

		fixture.initContractVersionKey(messageBo, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initContractVersionKey(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:36
	 */
	@Test
	public void testInitContractVersionKey_2()
		throws Exception {
		HttpController fixture = new HttpController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String name = "";

		fixture.initContractVersionKey(messageBo, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initContractVersionKey(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:36
	 */
	@Test
	public void testInitContractVersionKey_3()
		throws Exception {
		HttpController fixture = new HttpController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String name = "";

		fixture.initContractVersionKey(messageBo, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initServiceKey(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:36
	 */
	@Test
	public void testInitServiceKey_1()
		throws Exception {
		HttpController fixture = new HttpController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String serviceCode = "";

		fixture.initServiceKey(messageBo, serviceCode);

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
	 * @generatedBy CodePro at 15-11-12 下午7:36
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
	 * @generatedBy CodePro at 15-11-12 下午7:36
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
	 * @generatedBy CodePro at 15-11-12 下午7:36
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HttpControllerTest.class);
	}
}