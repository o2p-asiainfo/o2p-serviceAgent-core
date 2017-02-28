package com.ailk.eaap.op2.serviceagent.protocol;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.validate.service.IProtocolValidateServ;
import com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>RestControllerTest</code> contains tests for the class <code>{@link RestController}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:52
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class RestControllerTest {
	/**
	 * Run the RestController() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testRestController_1()
		throws Exception {
		RestController result = new RestController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ContractVersion getBaseContractVer(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetBaseContractVer_1()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String pathIndo = "";

		ContractVersion result = fixture.getBaseContractVer(messageBo, pathIndo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the ContractVersion getBaseContractVer(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetBaseContractVer_2()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String pathIndo = "/";

		ContractVersion result = fixture.getBaseContractVer(messageBo, pathIndo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the ContractVersion getBaseContractVer(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetBaseContractVer_3()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		String pathIndo = "/";

		ContractVersion result = fixture.getBaseContractVer(messageBo, pathIndo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

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
		RestController fixture = new RestController();
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
	 * Run the String getUpperSerVersion(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetUpperSerVersion_2()
		throws Exception {
		RestController fixture = new RestController();
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
	 * Run the String getUpperSerVersion(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetUpperSerVersion_3()
		throws Exception {
		RestController fixture = new RestController();
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
	 * Run the String getUpperSerVersion(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetUpperSerVersion_4()
		throws Exception {
		RestController fixture = new RestController();
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
	 * Run the String getUpperSerVersion(MessageBO<?>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testGetUpperSerVersion_5()
		throws Exception {
		RestController fixture = new RestController();
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
	 * Run the String initServiceAndCvKey(MessageBO,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitServiceAndCvKey_1()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlPath = "";
		String action = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, urlPath, action, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ.<clinit>(ProtocolValidateServ.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitServiceAndCvKey_2()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlPath = "";
		String action = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, urlPath, action, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitServiceAndCvKey_3()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlPath = "";
		String action = "";
		boolean isBase = false;

		String result = fixture.initServiceAndCvKey(messageBo, urlPath, action, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitServiceAndCvKey_4()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlPath = "";
		String action = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, urlPath, action, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitServiceAndCvKey_5()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlPath = "";
		String action = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, urlPath, action, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the String initServiceAndCvKey(MessageBO,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitServiceAndCvKey_6()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlPath = "";
		String action = "";
		boolean isBase = true;

		String result = fixture.initServiceAndCvKey(messageBo, urlPath, action, isBase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
		assertNotNull(result);
	}

	/**
	 * Run the void initUrlResource(MessageBO,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitUrlResource_1()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlResource = "";
		String pathInfo = "";

		fixture.initUrlResource(messageBo, urlResource, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initUrlResource(MessageBO,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitUrlResource_2()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlResource = "";
		String pathInfo = "";

		fixture.initUrlResource(messageBo, urlResource, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initUrlResource(MessageBO,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitUrlResource_3()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlResource = "";
		String pathInfo = "";

		fixture.initUrlResource(messageBo, urlResource, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initUrlResource(MessageBO,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitUrlResource_4()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlResource = "";
		String pathInfo = "";

		fixture.initUrlResource(messageBo, urlResource, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initUrlResource(MessageBO,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitUrlResource_5()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlResource = "";
		String pathInfo = "";

		fixture.initUrlResource(messageBo, urlResource, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void initUrlResource(MessageBO,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testInitUrlResource_6()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO messageBo = new MessageBO();
		String urlResource = "";
		String pathInfo = "";

		fixture.initUrlResource(messageBo, urlResource, pathInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void restJavaFieldInit(MessageBO<?>,ContractVersion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testRestJavaFieldInit_1()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		ContractVersion restBaseCv = new ContractVersion();
		restBaseCv.setReqContractFormat(new ContractFormat());

		fixture.restJavaFieldInit(messageBo, restBaseCv);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void restJavaFieldInit(MessageBO<?>,ContractVersion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testRestJavaFieldInit_2()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		ContractVersion restBaseCv = null;

		fixture.restJavaFieldInit(messageBo, restBaseCv);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProtocolValidateServ
	}

	/**
	 * Run the void restJavaFieldInit(MessageBO<?>,ContractVersion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:52
	 */
	@Test
	public void testRestJavaFieldInit_3()
		throws Exception {
		RestController fixture = new RestController();
		fixture.protocolValidateSer = new ProtocolValidateServ();
		fixture.cacheService = new CacheServiceImpl();
		MessageBO<Object> messageBo = new MessageBO();
		ContractVersion restBaseCv = new ContractVersion();
		restBaseCv.setReqContractFormat(new ContractFormat());

		fixture.restJavaFieldInit(messageBo, restBaseCv);

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
		new org.junit.runner.JUnitCore().run(RestControllerTest.class);
	}
}