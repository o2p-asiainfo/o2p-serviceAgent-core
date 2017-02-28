package com.ailk.eaap.op2.serviceagent.protocol.response;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate;
import com.ailk.eaap.op2.serviceagent.protocol.IFreeMarkerTemplate;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>ResponseTemplateImplTest</code> contains tests for the class <code>{@link ResponseTemplateImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:38
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ResponseTemplateImplTest {
	/**
	 * Run the ResponseTemplateImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponseTemplateImpl_1()
		throws Exception {
		ResponseTemplateImpl result = new ResponseTemplateImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_1()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_2()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = null;
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_3()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "";
		String transactionID = null;

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_4()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = null;
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_5()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "";
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_6()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "";
		String transactionID = null;

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_7()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "";
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_8()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String transactionID = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_9()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String transactionID = null;

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_10()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_11()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = null;
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_12()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = null;
		String transactionID = null;

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_13()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = null;
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_14()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "";
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_15()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "";
		String transactionID = null;

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void buildResponseMsg(MessageBO,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testBuildResponseMsg_16()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO messageBo = new MessageBO();
		String rspTime = "";
		String rspType = "";
		String rspCode = "";
		String rspDesc = "";
		String transactionID = "";

		fixture.buildResponseMsg(messageBo, rspTime, rspType, rspCode, rspDesc, transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void checkHeader(MessageBO<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testCheckHeader_1()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();

		fixture.checkHeader(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void checkHeader(MessageBO<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testCheckHeader_2()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();

		fixture.checkHeader(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void checkHeader(MessageBO<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testCheckHeader_3()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();

		fixture.checkHeader(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the boolean respTemplate(MessageBO,ContractFormat,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */

	/**
	 * Run the boolean respTemplate(MessageBO,ContractFormat,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */

	/**
	 * Run the boolean respTemplate(MessageBO,ContractFormat,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */

	/**
	 * Run the boolean respTemplate(MessageBO,ContractFormat,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */

	/**
	 * Run the boolean respTemplate(MessageBO,ContractFormat,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */

	/**
	 * Run the boolean respTemplate(MessageBO,ContractFormat,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_1()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_2()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_3()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_4()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_5()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_6()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_7()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_8()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_9()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_10()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_11()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_12()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_13()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_14()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_15()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void response(MessageBO<?>,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testResponse_16()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		MessageBO<Object> messageBo = new MessageBO();
		String code = "";
		String msg = "";

		fixture.response(messageBo, code, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:94)
		//       at freemarker.log.Log4JLoggerFactory.getLogger(Log4JLoggerFactory.java:65)
		//       at freemarker.log.Logger.getLogger(Logger.java:284)
		//       at freemarker.template.utility.SecurityUtilities.<clinit>(SecurityUtilities.java:67)
		//       at freemarker.ext.beans.BeansWrapper.<clinit>(BeansWrapper.java:147)
		//       at freemarker.template.ObjectWrapper.<clinit>(ObjectWrapper.java:69)
		//       at freemarker.core.Configurable.<init>(Configurable.java:139)
		//       at freemarker.template.Configuration.<init>(Configuration.java:142)
		//       at freemarker.template.Configuration.<clinit>(Configuration.java:127)
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the void setFreeMarkerTemplate(IFreeMarkerTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	@Test
	public void testSetFreeMarkerTemplate_1()
		throws Exception {
		ResponseTemplateImpl fixture = new ResponseTemplateImpl();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		IFreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate();

		fixture.setFreeMarkerTemplate(freeMarkerTemplate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}


	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:38
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
	 * @generatedBy CodePro at 15-11-12 下午7:38
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
	 * @generatedBy CodePro at 15-11-12 下午7:38
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResponseTemplateImplTest.class);
	}
}