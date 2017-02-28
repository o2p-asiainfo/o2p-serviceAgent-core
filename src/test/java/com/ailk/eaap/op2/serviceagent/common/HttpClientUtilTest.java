package com.ailk.eaap.op2.serviceagent.common;

import java.io.IOException;
import java.io.Serializable;
import java.util.IdentityHashMap;
import java.util.Map;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>HttpClientUtilTest</code> contains tests for the class <code>{@link HttpClientUtil}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:35
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class HttpClientUtilTest {
	/**
	 * Run the String getQueryString(Map<String,String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testGetQueryString_1()
		throws Exception {
		Map<String, String> msgUrl = new IdentityHashMap();
		msgUrl.put("servicecode", "portInResponse");
		String jsonStr = getString();
		msgUrl.put("WEB_HUB_PARAMS", jsonStr);
		boolean transformEncode = false;

		String result = HttpClientUtil.getQueryString(msgUrl, transformEncode);
		System.out.print(result);
		// add additional test code here

	}

	private String getString() {

		String str = "{\"dara\":{\"requestBody\":{\"customerId\":\"3242342\",\"orderId\":\"32103112078101\",\"confirmedDate\":\"\",\"isUpdate\":\"false\",\"responseType\":\"2\",\"rejectInfo\":[{\"rejectCode\":\"339\",\"rejectReason\":\"reject339;null\"}],\"errorInfo\":[{\"errorCode\":\"339\",\"errorName\":\"reject339;null\",\"errorMsg\":\"339\"}]},\"header\":{\"code\":\"\",\"tenant\":\"21\",\"token\":\"\",\"value\":\"\",\"zone\":\"\"}}}";

		return str;
	}

	/**
	 * Run the String getQueryString(Map<String,String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testGetQueryString_2()
		throws Exception {
		Map<String, String> msgUrl = new IdentityHashMap();
		boolean transformEncode = true;

		String result = HttpClientUtil.getQueryString(msgUrl, transformEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getQueryString(Map<String,String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testGetQueryString_3()
		throws Exception {
		Map<String, String> msgUrl = new IdentityHashMap();
		boolean transformEncode = true;

		String result = HttpClientUtil.getQueryString(msgUrl, transformEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String sendObjFromServer(String,int,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendObjFromServer_1()
		throws Exception {
		String url = "";
		int timeout = 1;
		Serializable inputObj = new IOException();

		String result = HttpClientUtil.sendObjFromServer(url, timeout, inputObj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendObjFromServer(HttpClientUtil.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the String sendObjFromServer(String,int,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendObjFromServer_2()
		throws Exception {
		String url = "";
		int timeout = 1;
		Serializable inputObj = new IOException();

		String result = HttpClientUtil.sendObjFromServer(url, timeout, inputObj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendObjFromServer(HttpClientUtil.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the String sendObjFromServer(String,int,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendObjFromServer_3()
		throws Exception {
		String url = "";
		int timeout = 1;
		Serializable inputObj = new IOException();

		String result = HttpClientUtil.sendObjFromServer(url, timeout, inputObj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendObjFromServer(HttpClientUtil.java:157)
		assertNotNull(result);
	}

	/**
	 * Run the String sendRequest(MessageBO<?>,String,Map<String,String>,String,String,String,int,String,String,String,String,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendRequest_1()
		throws Exception {
		MessageBO<Object> messageBo = new MessageBO();
		String address = "";
		Map<String, String> reqHead = new IdentityHashMap();
		String msg = "";
		String contentType = "";
		String method = "";
		int timeout = 1;
		String servicename = "";
		String userName = "";
		String password = "";
		String proxyIP = "";
		String proxyPort = "";
		Object statusOgnl = new Object();
		Object needBreakOgnl = new Object();

		String result = HttpClientUtil.sendRequest(messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, statusOgnl, needBreakOgnl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRestOrHttpRequest(HttpClientUtil.java:474)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRequest(HttpClientUtil.java:497)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRequest(HttpClientUtil.java:196)
		assertNotNull(result);
	}

	/**
	 * Run the String sendRequest(MessageBO<?>,String,Map<String,String>,String,String,String,int,String,String,String,String,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendRequest_2()
		throws Exception {
		MessageBO<Object> messageBo = new MessageBO();
		String address = "";
		Map<String, String> reqHead = new IdentityHashMap();
		String msg = "";
		String contentType = "";
		String method = "";
		int timeout = 1;
		String servicename = "";
		String userName = "";
		String password = "";
		String proxyIP = "";
		String proxyPort = "";
		Object statusOgnl = new Object();
		Object needBreakOgnl = new Object();

		String result = HttpClientUtil.sendRequest(messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, statusOgnl, needBreakOgnl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRestOrHttpRequest(HttpClientUtil.java:474)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRequest(HttpClientUtil.java:497)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRequest(HttpClientUtil.java:196)
		assertNotNull(result);
	}

	/**
	 * Run the String sendRequest(MessageBO<?>,String,Map<String,String>,String,String,String,int,String,String,String,String,String,String,String,String,String,int,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendRequest_3()
		throws Exception {
		MessageBO<Object> messageBo = new MessageBO();
		String address = "";
		Map<String, String> reqHead = new IdentityHashMap();
		String msg = "";
		String contentType = "";
		String method = "";
		int timeout = 1;
		String servicename = "";
		String userName = "";
		String password = "";
		String proxyIP = "";
		String proxyPort = "";
		String trustStore = "";
		String trustStorePassword = "";
		String keyStore = "";
		String keyStorePassword = "";
		int port = 1;
		Object statusOgnl = new Object();
		Object needBreakOgnl = new Object();

		String result = HttpClientUtil.sendRequest(messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, trustStore, trustStorePassword, keyStore, keyStorePassword, port, statusOgnl, needBreakOgnl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRestOrHttpRequest(HttpClientUtil.java:474)
		//       at com.ailk.eaap.op2.serviceagent.common.HttpClientUtil.sendRequest(HttpClientUtil.java:497)
		assertNotNull(result);
	}

	/**
	 * Run the String webserviceSend(String,Map<String,String>,String,int,String,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testWebserviceSend_1()
		throws Exception {
		String address = "";
		Map<String, String> reqHead = new IdentityHashMap();
		String msg = "";
		int timeout = 1;
		String servicename = "";
		String returnparam = "";
		String username = "";
		String password = "";
		String proxyip = "";
		String port = "";

		String result = HttpClientUtil.webserviceSend(address, reqHead, msg, timeout, servicename, returnparam, username, password, proxyip, port);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String webserviceSend(String,Map<String,String>,String,int,String,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testWebserviceSend_2()
		throws Exception {
		String address = "";
		Map<String, String> reqHead = new IdentityHashMap();
		String msg = "";
		int timeout = 1;
		String servicename = "";
		String returnparam = "";
		String username = "";
		String password = "";
		String proxyip = "";
		String port = "";

		String result = HttpClientUtil.webserviceSend(address, reqHead, msg, timeout, servicename, returnparam, username, password, proxyip, port);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String webserviceSend(String,Map<String,String>,String,int,String,String,String,String,String,String,String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testWebserviceSend_3()
		throws Exception {
		String address = "";
		Map<String, String> reqHead = new IdentityHashMap();
		String msg = "";
		int timeout = 1;
		String servicename = "";
		String returnparam = "";
		String username = "";
		String password = "";
		String proxyip = "";
		String port = "";
		String trustStore = "";
		String trustStorePassword = "";
		String keyStore = "";
		String keyStorePassword = "";

		String result = HttpClientUtil.webserviceSend(address, reqHead, msg, timeout, servicename, returnparam, username, password, proxyip, port, trustStore, trustStorePassword, keyStore, keyStorePassword);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
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
	 * @generatedBy CodePro at 15-12-21 下午4:35
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
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HttpClientUtilTest.class);
	}
}