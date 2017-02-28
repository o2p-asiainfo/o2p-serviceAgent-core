package com.ailk.eaap.op2.serviceagent.log;

import java.util.IdentityHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.Response;
import com.ailk.eaap.op2.logclient.log.service.ILogDealServ;
import com.ailk.eaap.op2.logclient.log.service.LogDealServ;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.LogMessageObject;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>MessageLogServiceTest</code> contains tests for the class <code>{@link MessageLogService}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:49
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MessageLogServiceTest {
	/**
	 * Run the MessageLogService() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testMessageLogService_1()
		throws Exception {
		MessageLogService result = new MessageLogService();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_2()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_3()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_4()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_5()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_6()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_7()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_8()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the void buildCtgLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildCtgLog_9()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.buildCtgLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildCtgLog(MessageLogService.java:150)
	}

	/**
	 * Run the LogMessageObject buildMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildMessageLog_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("client");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		LogMessageObject result = fixture.buildMessageLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildLogMessageObject(MessageLogService.java:471)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildMessageLog(MessageLogService.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the LogMessageObject buildMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildMessageLog_2()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("client");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		LogMessageObject result = fixture.buildMessageLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildLogMessageObject(MessageLogService.java:471)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildMessageLog(MessageLogService.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the LogMessageObject buildMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildMessageLog_3()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("client");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		LogMessageObject result = fixture.buildMessageLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildLogMessageObject(MessageLogService.java:471)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildMessageLog(MessageLogService.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the LogMessageObject buildMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildMessageLog_4()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		LogMessageObject result = fixture.buildMessageLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildLogMessageObject(MessageLogService.java:471)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildMessageLog(MessageLogService.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the LogMessageObject buildMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testBuildMessageLog_5()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("client");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		LogMessageObject result = fixture.buildMessageLog(messageBo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.getLogObjects(MessageLogLevelService.java:96)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogLevelService.isLogTypeOut(MessageLogLevelService.java:81)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildLogMessageObject(MessageLogService.java:471)
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.buildMessageLog(MessageLogService.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRunTimeMemcachedClient());
		assertEquals(null, result.getAllTenant());
	}

	/**
	 * Run the ILogDealServ getLogDealServ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testGetLogDealServ_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());

		ILogDealServ result = fixture.getLogDealServ();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMessageBoHisService getMessageBoHisSer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testGetMessageBoHisSer_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());

		IMessageBoHisService result = fixture.getMessageBoHisSer();

		// add additional test code here
		assertNotNull(result);
//		assertEquals(null, result.getLastReqMessageBo());
//		assertEquals(null, result.getLastRspMessageBo());
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testGetResponse_1()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = new Response();

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getResptype());
		assertEquals(null, result.getRespcode());
		assertEquals(null, result.getRespDesc());
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testGetResponse_2()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    <exception><code>9004</code><msg>segmentSign:13.null</msg><exceptionTrace>com.ailk.eaap.op2.common.EAAPException: segmentSign:13.null
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.getResponse(MessageLogService.java:624)
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testGetResponse_3()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    <exception><code>9004</code><msg>segmentSign:13.null</msg><exceptionTrace>com.ailk.eaap.op2.common.EAAPException: segmentSign:13.null
		//       at com.ailk.eaap.op2.serviceagent.log.MessageLogService.getResponse(MessageLogService.java:624)
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_4()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_5()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_6()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_7()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_8()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_9()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_10()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_11()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_12()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_13()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_14()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_15()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Response getResponse(MessageBO,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testGetResponse_16()
		throws Exception {
		MessageBO lastBo = new MessageBO();
		Response rsp = null;

		Response result = MessageLogService.getResponse(lastBo, rsp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getServiceAgentMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testGetServiceAgentMode_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());

		String result = fixture.getServiceAgentMode();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Endpoint queryFirstLogEndpoint(SerInvokeIns,Map<String,MessageBO>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testQueryFirstLogEndpoint_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns serInvokeIns = new SerInvokeIns();
		Map<String, MessageBO> map = new IdentityHashMap();

		Endpoint result = fixture.queryFirstLogEndpoint(serInvokeIns, map);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Endpoint queryFirstLogEndpoint(SerInvokeIns,Map<String,MessageBO>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testQueryFirstLogEndpoint_2()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns serInvokeIns = new SerInvokeIns();
		Map<String, MessageBO> map = new IdentityHashMap();

		Endpoint result = fixture.queryFirstLogEndpoint(serInvokeIns, map);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Endpoint queryFirstLogEndpoint(SerInvokeIns,Map<String,MessageBO>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testQueryFirstLogEndpoint_3()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns serInvokeIns = new SerInvokeIns();
		Map<String, MessageBO> map = new IdentityHashMap();

		Endpoint result = fixture.queryFirstLogEndpoint(serInvokeIns, map);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Endpoint queryFirstLogEndpoint(SerInvokeIns,Map<String,MessageBO>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testQueryFirstLogEndpoint_4()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns serInvokeIns = new SerInvokeIns();
		Map<String, MessageBO> map = new IdentityHashMap();

		Endpoint result = fixture.queryFirstLogEndpoint(serInvokeIns, map);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Endpoint queryFirstLogEndpoint(SerInvokeIns,Map<String,MessageBO>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testQueryFirstLogEndpoint_5()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns serInvokeIns = new SerInvokeIns();
		Map<String, MessageBO> map = new IdentityHashMap();

		Endpoint result = fixture.queryFirstLogEndpoint(serInvokeIns, map);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Endpoint queryFirstLogEndpoint(SerInvokeIns,Map<String,MessageBO>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testQueryFirstLogEndpoint_6()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		SerInvokeIns serInvokeIns = new SerInvokeIns();
		Map<String, MessageBO> map = new IdentityHashMap();

		Endpoint result = fixture.queryFirstLogEndpoint(serInvokeIns, map);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void sendMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSendMessageLog_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.sendMessageLog(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void sendMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSendMessageLog_2()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.sendMessageLog(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void sendMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSendMessageLog_3()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.sendMessageLog(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void sendMessageLog(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSendMessageLog_4()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageBO messageBo = new MessageBO();

		fixture.sendMessageLog(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
	}

	/**
	 * Run the void setLogDealServ(ILogDealServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSetLogDealServ_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		ILogDealServ logDealServ = new LogDealServ();

		fixture.setLogDealServ(logDealServ);

		// add additional test code here
	}

	/**
	 * Run the void setMessageBoHisSer(IMessageBoHisService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSetMessageBoHisSer_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		IMessageBoHisService messageBoHisSer = new MessageBoHisServiceImpl();

		fixture.setMessageBoHisSer(messageBoHisSer);

		// add additional test code here
	}

	/**
	 * Run the void setMessageLogLevelService(MessageLogLevelService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSetMessageLogLevelService_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		MessageLogLevelService messageLogLevelService = new MessageLogLevelService();

		fixture.setMessageLogLevelService(messageLogLevelService);

		// add additional test code here
	}

	/**
	 * Run the void setServiceAgentMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	@Test
	public void testSetServiceAgentMode_1()
		throws Exception {
		MessageLogService fixture = new MessageLogService();
		fixture.setMessageLogLevelService(new MessageLogLevelService());
		fixture.setLogDealServ(new LogDealServ());
		fixture.setServiceAgentMode("");
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setCacheService(new CacheServiceImpl());
		String serviceAgentMode = "";

		fixture.setServiceAgentMode(serviceAgentMode);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:49
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
	 * @generatedBy CodePro at 15-12-21 下午4:49
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
	 * @generatedBy CodePro at 15-12-21 下午4:49
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageLogServiceTest.class);
	}
}