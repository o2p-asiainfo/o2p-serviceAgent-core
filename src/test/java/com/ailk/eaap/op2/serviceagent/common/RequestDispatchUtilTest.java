package com.ailk.eaap.op2.serviceagent.common;

import java.util.IdentityHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.util.ContentCachingResponseWrapper;

/**
 * The class <code>RequestDispatchUtilTest</code> contains tests for the class <code>{@link RequestDispatchUtil}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:35
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class RequestDispatchUtilTest {
	/**
	 * Run the String sendRequest(HttpServletResponse,MessageBO<?>,String,Map<String,String>,String,String,String,int,String,String,String,String,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendRequest_1()
		throws Exception {
		HttpServletResponse response = new ContentCachingResponseWrapper(new MockHttpServletResponse());
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

		String result = RequestDispatchUtil.sendRequest(response, messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, statusOgnl, needBreakOgnl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRestOrHttpRequest(RequestDispatchUtil.java:341)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRequest(RequestDispatchUtil.java:369)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRequest(RequestDispatchUtil.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String sendRequest(HttpServletResponse,MessageBO<?>,String,Map<String,String>,String,String,String,int,String,String,String,String,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendRequest_2()
		throws Exception {
		HttpServletResponse response = new ContentCachingResponseWrapper(new MockHttpServletResponse());
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

		String result = RequestDispatchUtil.sendRequest(response, messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, statusOgnl, needBreakOgnl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRestOrHttpRequest(RequestDispatchUtil.java:341)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRequest(RequestDispatchUtil.java:369)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRequest(RequestDispatchUtil.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String sendRequest(HttpServletResponse,MessageBO<?>,String,Map<String,String>,String,String,String,int,String,String,String,String,String,String,String,String,String,int,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:35
	 */
	@Test
	public void testSendRequest_3()
		throws Exception {
		HttpServletResponse response = new ContentCachingResponseWrapper(new MockHttpServletResponse());
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

		String result = RequestDispatchUtil.sendRequest(response, messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, trustStore, trustStorePassword, keyStore, keyStorePassword, port, statusOgnl, needBreakOgnl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9999' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRestOrHttpRequest(RequestDispatchUtil.java:341)
		//       at com.ailk.eaap.op2.serviceagent.common.RequestDispatchUtil.sendRequest(RequestDispatchUtil.java:369)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(RequestDispatchUtilTest.class);
	}
}