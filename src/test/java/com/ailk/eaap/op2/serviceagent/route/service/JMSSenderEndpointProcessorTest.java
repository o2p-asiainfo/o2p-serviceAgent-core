package com.ailk.eaap.op2.serviceagent.route.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.IdentityHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>JMSSenderEndpointProcessorTest</code> contains tests for the class <code>{@link JMSSenderEndpointProcessor}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午8:09
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class JMSSenderEndpointProcessorTest {
	/**
	 * Run the JMSSenderEndpointProcessor() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testJMSSenderEndpointProcessor_1()
		throws Exception {
		JMSSenderEndpointProcessor result = new JMSSenderEndpointProcessor();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testClear_1()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testProcess_1()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		Endpoint endpoint = new Endpoint();
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getService());
		assertEquals(null, result.getFormat());
		assertEquals(null, result.getScopeId());
		assertEquals(null, result.getExecutionContext());
		assertEquals(null, result.getSign());
		assertEquals(null, result.getServiceLevel());
		assertEquals(null, result.getHttpMethod());
		assertEquals(null, result.getSourceCode());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getServiceCode());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getReqTime());
		assertEquals(false, result.isNeedBreak());
		assertEquals(null, result.getServiceAgentMode());
		assertEquals(null, result.getAuthCode());
		assertEquals(null, result.getServiceAgentServerAddress());
		assertEquals(null, result.getReqorrsp());
		assertEquals(null, result.getRegServiceCode());
		assertEquals(null, result.getAccessToken());
		assertEquals(null, result.getSrcPlayload());
		assertEquals(null, result.getRegServiceVersion());
		assertEquals(null, result.getActionCode());
		assertEquals(null, result.getSrcorgcode());
		assertEquals(null, result.getRestFormString());
		assertEquals(null, result.getBusCode());
		assertEquals(null, result.getEAAPException());
		assertEquals(null, result.getDstSyscode());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("jmsCall: 9\r\n\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
		assertEquals(null, result.getContractBody());
		assertEquals("R", result.getRemoteFlag());
		assertEquals(null, result.getTempFileDirName());
		assertEquals(new Integer(1), result.getExceptionTryNum());
		assertEquals(false, result.isTaskFlag());
		assertEquals(null, result.getTaskCacheFlag());
		assertEquals(null, result.getTaskStyle());
		assertEquals(null, result.getRealIpAddress());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(null, result.getFailMsg());
		assertEquals(new Integer(0), result.getSuccessNum());
		assertEquals(new Integer(0), result.getInputFileNum());
		assertEquals(new Integer(0), result.getOutputSuccessFileNum());
		assertEquals(new Integer(0), result.getOutputErrFileNum());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getRspTime());
		assertEquals(null, result.getServiceStyle());
		assertEquals(null, result.getQueueName());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testProcess_2()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		Endpoint endpoint = new Endpoint();
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getService());
		assertEquals(null, result.getFormat());
		assertEquals(null, result.getScopeId());
		assertEquals(null, result.getExecutionContext());
		assertEquals(null, result.getSign());
		assertEquals(null, result.getServiceLevel());
		assertEquals(null, result.getHttpMethod());
		assertEquals(null, result.getSourceCode());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getServiceCode());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getReqTime());
		assertEquals(false, result.isNeedBreak());
		assertEquals(null, result.getServiceAgentMode());
		assertEquals(null, result.getAuthCode());
		assertEquals(null, result.getServiceAgentServerAddress());
		assertEquals(null, result.getReqorrsp());
		assertEquals(null, result.getRegServiceCode());
		assertEquals(null, result.getAccessToken());
		assertEquals(null, result.getSrcPlayload());
		assertEquals(null, result.getRegServiceVersion());
		assertEquals(null, result.getActionCode());
		assertEquals(null, result.getSrcorgcode());
		assertEquals(null, result.getRestFormString());
		assertEquals(null, result.getBusCode());
		assertEquals(null, result.getEAAPException());
		assertEquals(null, result.getDstSyscode());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("jmsCall: 9\r\n\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
		assertEquals(null, result.getContractBody());
		assertEquals("R", result.getRemoteFlag());
		assertEquals(null, result.getTempFileDirName());
		assertEquals(new Integer(1), result.getExceptionTryNum());
		assertEquals(false, result.isTaskFlag());
		assertEquals(null, result.getTaskCacheFlag());
		assertEquals(null, result.getTaskStyle());
		assertEquals(null, result.getRealIpAddress());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(null, result.getFailMsg());
		assertEquals(new Integer(0), result.getSuccessNum());
		assertEquals(new Integer(0), result.getInputFileNum());
		assertEquals(new Integer(0), result.getOutputSuccessFileNum());
		assertEquals(new Integer(0), result.getOutputErrFileNum());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getRspTime());
		assertEquals(null, result.getServiceStyle());
		assertEquals(null, result.getQueueName());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testProcess_3()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getService());
		assertEquals(null, result.getFormat());
		assertEquals(null, result.getScopeId());
		assertEquals(null, result.getExecutionContext());
		assertEquals(null, result.getSign());
		assertEquals(null, result.getServiceLevel());
		assertEquals(null, result.getHttpMethod());
		assertEquals(null, result.getSourceCode());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getServiceCode());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getReqTime());
		assertEquals(false, result.isNeedBreak());
		assertEquals(null, result.getServiceAgentMode());
		assertEquals(null, result.getAuthCode());
		assertEquals(null, result.getServiceAgentServerAddress());
		assertEquals(null, result.getReqorrsp());
		assertEquals(null, result.getRegServiceCode());
		assertEquals(null, result.getAccessToken());
		assertEquals(null, result.getSrcPlayload());
		assertEquals(null, result.getRegServiceVersion());
		assertEquals(null, result.getActionCode());
		assertEquals(null, result.getSrcorgcode());
		assertEquals(null, result.getRestFormString());
		assertEquals(null, result.getBusCode());
		assertEquals(null, result.getEAAPException());
		assertEquals(null, result.getDstSyscode());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("jmsCall: 9\r\n\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
		assertEquals(null, result.getContractBody());
		assertEquals("R", result.getRemoteFlag());
		assertEquals(null, result.getTempFileDirName());
		assertEquals(new Integer(1), result.getExceptionTryNum());
		assertEquals(false, result.isTaskFlag());
		assertEquals(null, result.getTaskCacheFlag());
		assertEquals(null, result.getTaskStyle());
		assertEquals(null, result.getRealIpAddress());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(null, result.getFailMsg());
		assertEquals(new Integer(0), result.getSuccessNum());
		assertEquals(new Integer(0), result.getInputFileNum());
		assertEquals(new Integer(0), result.getOutputSuccessFileNum());
		assertEquals(new Integer(0), result.getOutputErrFileNum());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getRspTime());
		assertEquals(null, result.getServiceStyle());
		assertEquals(null, result.getQueueName());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testProcess_4()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getService());
		assertEquals(null, result.getFormat());
		assertEquals(null, result.getScopeId());
		assertEquals(null, result.getExecutionContext());
		assertEquals(null, result.getSign());
		assertEquals(null, result.getServiceLevel());
		assertEquals(null, result.getHttpMethod());
		assertEquals(null, result.getSourceCode());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getServiceCode());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getReqTime());
		assertEquals(false, result.isNeedBreak());
		assertEquals(null, result.getServiceAgentMode());
		assertEquals(null, result.getAuthCode());
		assertEquals(null, result.getServiceAgentServerAddress());
		assertEquals(null, result.getReqorrsp());
		assertEquals(null, result.getRegServiceCode());
		assertEquals(null, result.getAccessToken());
		assertEquals(null, result.getSrcPlayload());
		assertEquals(null, result.getRegServiceVersion());
		assertEquals(null, result.getActionCode());
		assertEquals(null, result.getSrcorgcode());
		assertEquals(null, result.getRestFormString());
		assertEquals(null, result.getBusCode());
		assertEquals(null, result.getEAAPException());
		assertEquals(null, result.getDstSyscode());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("jmsCall: 9\r\n\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
		assertEquals(null, result.getContractBody());
		assertEquals("R", result.getRemoteFlag());
		assertEquals(null, result.getTempFileDirName());
		assertEquals(new Integer(1), result.getExceptionTryNum());
		assertEquals(false, result.isTaskFlag());
		assertEquals(null, result.getTaskCacheFlag());
		assertEquals(null, result.getTaskStyle());
		assertEquals(null, result.getRealIpAddress());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(null, result.getFailMsg());
		assertEquals(new Integer(0), result.getSuccessNum());
		assertEquals(new Integer(0), result.getInputFileNum());
		assertEquals(new Integer(0), result.getOutputSuccessFileNum());
		assertEquals(new Integer(0), result.getOutputErrFileNum());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getRspTime());
		assertEquals(null, result.getServiceStyle());
		assertEquals(null, result.getQueueName());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testProcess_5()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getService());
		assertEquals(null, result.getFormat());
		assertEquals(null, result.getScopeId());
		assertEquals(null, result.getExecutionContext());
		assertEquals(null, result.getSign());
		assertEquals(null, result.getServiceLevel());
		assertEquals(null, result.getHttpMethod());
		assertEquals(null, result.getSourceCode());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getServiceCode());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getReqTime());
		assertEquals(false, result.isNeedBreak());
		assertEquals(null, result.getServiceAgentMode());
		assertEquals(null, result.getAuthCode());
		assertEquals(null, result.getServiceAgentServerAddress());
		assertEquals(null, result.getReqorrsp());
		assertEquals(null, result.getRegServiceCode());
		assertEquals(null, result.getAccessToken());
		assertEquals(null, result.getSrcPlayload());
		assertEquals(null, result.getRegServiceVersion());
		assertEquals(null, result.getActionCode());
		assertEquals(null, result.getSrcorgcode());
		assertEquals(null, result.getRestFormString());
		assertEquals(null, result.getBusCode());
		assertEquals(null, result.getEAAPException());
		assertEquals(null, result.getDstSyscode());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("jmsCall: 9\r\n\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
		assertEquals(null, result.getContractBody());
		assertEquals("R", result.getRemoteFlag());
		assertEquals(null, result.getTempFileDirName());
		assertEquals(new Integer(1), result.getExceptionTryNum());
		assertEquals(false, result.isTaskFlag());
		assertEquals(null, result.getTaskCacheFlag());
		assertEquals(null, result.getTaskStyle());
		assertEquals(null, result.getRealIpAddress());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(null, result.getFailMsg());
		assertEquals(new Integer(0), result.getSuccessNum());
		assertEquals(new Integer(0), result.getInputFileNum());
		assertEquals(new Integer(0), result.getOutputSuccessFileNum());
		assertEquals(new Integer(0), result.getOutputErrFileNum());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getRspTime());
		assertEquals(null, result.getServiceStyle());
		assertEquals(null, result.getQueueName());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testProcess_6()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getService());
		assertEquals(null, result.getFormat());
		assertEquals(null, result.getScopeId());
		assertEquals(null, result.getExecutionContext());
		assertEquals(null, result.getSign());
		assertEquals(null, result.getServiceLevel());
		assertEquals(null, result.getHttpMethod());
		assertEquals(null, result.getSourceCode());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getServiceCode());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getReqTime());
		assertEquals(false, result.isNeedBreak());
		assertEquals(null, result.getServiceAgentMode());
		assertEquals(null, result.getAuthCode());
		assertEquals(null, result.getServiceAgentServerAddress());
		assertEquals(null, result.getReqorrsp());
		assertEquals(null, result.getRegServiceCode());
		assertEquals(null, result.getAccessToken());
		assertEquals(null, result.getSrcPlayload());
		assertEquals(null, result.getRegServiceVersion());
		assertEquals(null, result.getActionCode());
		assertEquals(null, result.getSrcorgcode());
		assertEquals(null, result.getRestFormString());
		assertEquals(null, result.getBusCode());
		assertEquals(null, result.getEAAPException());
		assertEquals(null, result.getDstSyscode());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("jmsCall: 9\r\n\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
		assertEquals(null, result.getContractBody());
		assertEquals("R", result.getRemoteFlag());
		assertEquals(null, result.getTempFileDirName());
		assertEquals(new Integer(1), result.getExceptionTryNum());
		assertEquals(false, result.isTaskFlag());
		assertEquals(null, result.getTaskCacheFlag());
		assertEquals(null, result.getTaskStyle());
		assertEquals(null, result.getRealIpAddress());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(null, result.getFailMsg());
		assertEquals(new Integer(0), result.getSuccessNum());
		assertEquals(new Integer(0), result.getInputFileNum());
		assertEquals(new Integer(0), result.getOutputSuccessFileNum());
		assertEquals(new Integer(0), result.getOutputErrFileNum());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getRspTime());
		assertEquals(null, result.getServiceStyle());
		assertEquals(null, result.getQueueName());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testProcess_7()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getService());
		assertEquals(null, result.getFormat());
		assertEquals(null, result.getScopeId());
		assertEquals(null, result.getExecutionContext());
		assertEquals(null, result.getSign());
		assertEquals(null, result.getServiceLevel());
		assertEquals(null, result.getHttpMethod());
		assertEquals(null, result.getSourceCode());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getServiceCode());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getReqTime());
		assertEquals(false, result.isNeedBreak());
		assertEquals(null, result.getServiceAgentMode());
		assertEquals(null, result.getAuthCode());
		assertEquals(null, result.getServiceAgentServerAddress());
		assertEquals(null, result.getReqorrsp());
		assertEquals(null, result.getRegServiceCode());
		assertEquals(null, result.getAccessToken());
		assertEquals(null, result.getSrcPlayload());
		assertEquals(null, result.getRegServiceVersion());
		assertEquals(null, result.getActionCode());
		assertEquals(null, result.getSrcorgcode());
		assertEquals(null, result.getRestFormString());
		assertEquals(null, result.getBusCode());
		assertEquals(null, result.getEAAPException());
		assertEquals(null, result.getDstSyscode());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("jmsCall: 9\r\n\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
		assertEquals(null, result.getContractBody());
		assertEquals("R", result.getRemoteFlag());
		assertEquals(null, result.getTempFileDirName());
		assertEquals(new Integer(1), result.getExceptionTryNum());
		assertEquals(false, result.isTaskFlag());
		assertEquals(null, result.getTaskCacheFlag());
		assertEquals(null, result.getTaskStyle());
		assertEquals(null, result.getRealIpAddress());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(null, result.getFailMsg());
		assertEquals(new Integer(0), result.getSuccessNum());
		assertEquals(new Integer(0), result.getInputFileNum());
		assertEquals(new Integer(0), result.getOutputSuccessFileNum());
		assertEquals(new Integer(0), result.getOutputErrFileNum());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getRspTime());
		assertEquals(null, result.getServiceStyle());
		assertEquals(null, result.getQueueName());
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
	}

	/**
	 * Run the void setJmsTemplateFactory(JmsTemplateFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testSetJmsTemplateFactory_1()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		JmsTemplateFactory jmsTemplateFactory = new JmsTemplateFactory();

		fixture.setJmsTemplateFactory(jmsTemplateFactory);

		// add additional test code here
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	@Test
	public void testSubtraThreadNum_1()
		throws Exception {
		JMSSenderEndpointProcessor fixture = new JMSSenderEndpointProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setJmsTemplateFactory(new JmsTemplateFactory());
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:09
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
	 * @generatedBy CodePro at 15-11-12 下午8:09
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
	 * @generatedBy CodePro at 15-11-12 下午8:09
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JMSSenderEndpointProcessorTest.class);
	}
}