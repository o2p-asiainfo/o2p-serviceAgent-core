package com.ailk.eaap.op2.serviceagent.protocol;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.validate.service.IProtocolValidateServ;
import com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>SocketControllerTest</code> contains tests for the class <code>{@link SocketController}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:52
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SocketControllerTest {
	/**
	 * Run the String getUpperSerVersion(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetUpperSerVersion_1()
		throws Exception {
		SocketController fixture = new SocketController();
		fixture.cacheService = new CacheServiceImpl();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		MessageBO<Object> messageBo = new MessageBO();
		String pathInfo = "";

		String result = fixture.getUpperSerVersion(messageBo, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ.<clinit>(ProtocolValidateServ.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the void initContractVersionKey(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitContractVersionKey_1()
		throws Exception {
		SocketController fixture = new SocketController();
		fixture.cacheService = new CacheServiceImpl();
		fixture.protocolValidateSer = new ProtocolValidateServ();
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
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitServiceKey_1()
		throws Exception {
		SocketController fixture = new SocketController();
		fixture.cacheService = new CacheServiceImpl();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		MessageBO<Object> messageBo = new MessageBO();
		String name = "";

		fixture.initServiceKey(messageBo, name);

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
	 * @generatedBy CodePro at 15-12-21 下午4:52
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
	 * @generatedBy CodePro at 15-12-21 下午4:52
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
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SocketControllerTest.class);
	}
}