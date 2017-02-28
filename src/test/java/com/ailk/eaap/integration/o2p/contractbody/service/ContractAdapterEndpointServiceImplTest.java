package com.ailk.eaap.integration.o2p.contractbody.service;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
import com.ailk.eaap.op2.bo.ContractAdapterEndpoint;
import com.ailk.eaap.op2.bo.TransformerRule;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>ContractAdapterEndpointServiceImplTest</code> contains tests for the class <code>{@link ContractAdapterEndpointServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:25
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ContractAdapterEndpointServiceImplTest {
	/**
	 * Run the ContractAdapterEndpointServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:25
	 */
	@Test
	public void testContractAdapterEndpointServiceImpl_1()
		throws Exception {
		ContractAdapterEndpointServiceImpl result = new ContractAdapterEndpointServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:25
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		ContractAdapterEndpointServiceImpl fixture = new ContractAdapterEndpointServiceImpl();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRunTimeMemcachedClient());
		assertEquals(null, result.getAllTenant());
	}

	/**
	 * Run the IMessageBoHisService getMessageBoHisSer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:25
	 */
	@Test
	public void testGetMessageBoHisSer_1()
		throws Exception {
		ContractAdapterEndpointServiceImpl fixture = new ContractAdapterEndpointServiceImpl();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());

		IMessageBoHisService result = fixture.getMessageBoHisSer();

		// add additional test code here
		assertNotNull(result);
//		assertEquals(null, result.getLastReqMessageBo());
//		assertEquals(null, result.getLastRspMessageBo());
	}

	/**
	 * Run the MessageBO<Object> replaceContractAdapterEndpoint(MessageBO<?>,TransformerRule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:25
	 */
	@Test
	public void testReplaceContractAdapterEndpoint_1()
		throws Exception {
		ContractAdapterEndpointServiceImpl fixture = new ContractAdapterEndpointServiceImpl();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO<?> bo = new MessageBO();
		TransformerRule transformerRule = new TransformerRule();
		transformerRule.setTransformerType(new Integer(1));
		transformerRule.setTransListContractAdapterEndpoint(null);
		transformerRule.setId(new Integer(1));

		MessageBO<?> result = fixture.replaceContractAdapterEndpoint(bo, transformerRule);

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
		assertEquals(null, result.getMsgBody());
		assertEquals(null, result.getContractBody());
		assertEquals(null, result.getCurrryRouteEndpoint());
		assertEquals(null, result.getSourceCode());
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
		assertEquals(null, result.getTransactionID());
		assertEquals(null, result.getContractVer());
		assertEquals(null, result.getSrcsyscode());
		assertEquals(null, result.getSrcComponent());
		assertEquals(null, result.getDstComponent());
		assertEquals(null, result.getIp());
		assertEquals(null, result.getApiname());
		assertEquals(null, result.getInType());
		assertEquals(null, result.getDstOrgID());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getSerInvokeIns());
		assertEquals(null, result.getDefaultTime());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getApp());
		assertEquals(null, result.getAppKey());
		assertEquals(null, result.getRestReqTime());
		assertEquals(null, result.getServiceCode());
		assertEquals("XML", result.getDataType());
		assertEquals(null, result.getRspType());
		assertEquals(null, result.getExceptionCode());
		assertEquals("", result.getOrgReqMsg());
		assertEquals("\r\n", result.toAllString());
		assertEquals(null, result.getRequestURL());
		assertEquals(new Integer(0), result.getFailNum());
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
	 * @generatedBy CodePro at 15-12-21 下午4:25
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		ContractAdapterEndpointServiceImpl fixture = new ContractAdapterEndpointServiceImpl();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
	}

	/**
	 * Run the void setMessageBoHisSer(IMessageBoHisService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:25
	 */
	@Test
	public void testSetMessageBoHisSer_1()
		throws Exception {
		ContractAdapterEndpointServiceImpl fixture = new ContractAdapterEndpointServiceImpl();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		IMessageBoHisService messageBoHisSer = new MessageBoHisServiceImpl();

		fixture.setMessageBoHisSer(messageBoHisSer);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:25
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
	 * @generatedBy CodePro at 15-12-21 下午4:25
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
	 * @generatedBy CodePro at 15-12-21 下午4:25
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ContractAdapterEndpointServiceImplTest.class);
	}
}