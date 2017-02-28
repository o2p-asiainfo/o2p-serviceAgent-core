package com.ailk.eaap.op2.serviceagent.protocol;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.validate.service.IProtocolValidateServ;
import com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>WebServiceControllerTest</code> contains tests for the class <code>{@link WebServiceController}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:53
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class WebServiceControllerTest {
	/**
	 * Run the WebServiceController() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testWebServiceController_1()
		throws Exception {
		WebServiceController result = new WebServiceController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getUpperSerVersion(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testGetUpperSerVersion_1()
		throws Exception {
		WebServiceController fixture = new WebServiceController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String pathInfo = "";

		String result = fixture.getUpperSerVersion(messageBo, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String getWsdlFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testGetWsdlFile_1()
		throws Exception {
		WebServiceController fixture = new WebServiceController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		String resourceAliss = "";
		String tentantCode = "";

		String result = fixture.getWsdlFile(resourceAliss, tentantCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ.<clinit>(ProtocolValidateServ.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the String getWsdlFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testGetWsdlFile_2()
		throws Exception {
		WebServiceController fixture = new WebServiceController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		String resourceAliss = "";
		String tentantCode = "";

		String result = fixture.getWsdlFile(resourceAliss, tentantCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String getWsdlFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testGetWsdlFile_3()
		throws Exception {
		WebServiceController fixture = new WebServiceController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		String resourceAliss = null;
		String tentantCode = "";

		String result = fixture.getWsdlFile(resourceAliss, tentantCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO<?>,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testInitServiceAndCvKey_1()
		throws Exception {
		WebServiceController fixture = new WebServiceController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String resourceAliss = "";
		String inType = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, resourceAliss, inType, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO<?>,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testInitServiceAndCvKey_2()
		throws Exception {
		WebServiceController fixture = new WebServiceController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String resourceAliss = "";
		String inType = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, resourceAliss, inType, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO<?>,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	@Test
	public void testInitServiceAndCvKey_3()
		throws Exception {
		WebServiceController fixture = new WebServiceController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String resourceAliss = "";
		String inType = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, resourceAliss, inType, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:53
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
	 * @generatedBy CodePro at 15-12-21 下午4:53
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
	 * @generatedBy CodePro at 15-12-21 下午4:53
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WebServiceControllerTest.class);
	}
}