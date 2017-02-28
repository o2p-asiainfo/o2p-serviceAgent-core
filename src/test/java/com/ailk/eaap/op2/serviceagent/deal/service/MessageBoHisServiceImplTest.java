//package com.ailk.eaap.op2.serviceagent.deal.service;
//
//import java.sql.Timestamp;
//import java.util.Map;
//import org.junit.*;
//import static org.junit.Assert.*;
//import com.ailk.eaap.op2.serviceagent.common.MessageBO;
//
///**
// * The class <code>MessageBoHisServiceImplTest</code> contains tests for the class <code>{@link MessageBoHisServiceImpl}</code>.
// *
// * @generatedBy CodePro at 15-12-21 下午4:48
// * @author wuwz
// * @version $Revision: 1.0 $
// */
//public class MessageBoHisServiceImplTest {
//	/**
//	 * Run the MessageBoHisServiceImpl() constructor test.
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testMessageBoHisServiceImpl_1()
//		throws Exception {
//		MessageBoHisServiceImpl result = new MessageBoHisServiceImpl();
//		assertNotNull(result);
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void addMessageBo(int,MessageBO,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testAddMessageBo_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//		MessageBO messageBo = new MessageBO();
//		String reqRspFlag = "";
//
//		fixture.addMessageBo(epId, messageBo, reqRspFlag);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void addTimestamp(int,Timestamp,String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testAddTimestamp_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//		Timestamp tStamp = new Timestamp(1L);
//		String reqRspFlag = "";
//
//		fixture.addTimestamp(epId, tStamp, reqRspFlag);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the MessageBO getLastReqMessageBo() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetLastReqMessageBo_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		MessageBO result = fixture.getLastReqMessageBo();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getLastReqMessageBo() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetLastReqMessageBo_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		MessageBO result = fixture.getLastReqMessageBo();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getLastRspMessageBo() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetLastRspMessageBo_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		MessageBO result = fixture.getLastRspMessageBo();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getLastRspMessageBo() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetLastRspMessageBo_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		MessageBO result = fixture.getLastRspMessageBo();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, MessageBO> getMessageBoMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetMessageBoMap_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		Map<String, MessageBO> result = fixture.getMessageBoMap();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.size());
//	}
//
//	/**
//	 * Run the Map<String, MessageBO> getMessageBoMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetMessageBoMap_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		Map<String, MessageBO> result = fixture.getMessageBoMap();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.size());
//	}
//
//	/**
//	 * Run the MessageBO getNextReqMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextReqMessageBo_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextReqMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getNextReqMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextReqMessageBo_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextReqMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getNextReqMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextReqMessageBo_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextReqMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getNextReqMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextReqMessageBo_4()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextReqMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getNextRspMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextRspMessageBo_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextRspMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getNextRspMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextRspMessageBo_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextRspMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getNextRspMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextRspMessageBo_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextRspMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getNextRspMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetNextRspMessageBo_4()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getNextRspMessageBo(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getPreReqMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetPreReqMessageBo_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getPreReqMessageBo(epId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.ArrayIndexOutOfBoundsException: -2
//		//       at java.util.ArrayList.get(ArrayList.java:324)
//		//       at com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl.getPreReqMessageBo(MessageBoHisServiceImpl.java:183)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the MessageBO getPreReqMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetPreReqMessageBo_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getPreReqMessageBo(epId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.ArrayIndexOutOfBoundsException: -2
//		//       at java.util.ArrayList.get(ArrayList.java:324)
//		//       at com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl.getPreReqMessageBo(MessageBoHisServiceImpl.java:183)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the MessageBO getPreReqMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetPreReqMessageBo_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getPreReqMessageBo(epId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.ArrayIndexOutOfBoundsException: -2
//		//       at java.util.ArrayList.get(ArrayList.java:324)
//		//       at com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl.getPreReqMessageBo(MessageBoHisServiceImpl.java:183)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the MessageBO getPreRspMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetPreRspMessageBo_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getPreRspMessageBo(epId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.ArrayIndexOutOfBoundsException: -2
//		//       at java.util.ArrayList.get(ArrayList.java:324)
//		//       at com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl.getPreRspMessageBo(MessageBoHisServiceImpl.java:200)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the MessageBO getPreRspMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetPreRspMessageBo_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getPreRspMessageBo(epId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.ArrayIndexOutOfBoundsException: -2
//		//       at java.util.ArrayList.get(ArrayList.java:324)
//		//       at com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl.getPreRspMessageBo(MessageBoHisServiceImpl.java:200)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the MessageBO getPreRspMessageBo(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetPreRspMessageBo_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getPreRspMessageBo(epId);
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this test:
//		//    java.lang.ArrayIndexOutOfBoundsException: -2
//		//       at java.util.ArrayList.get(ArrayList.java:324)
//		//       at com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl.getPreRspMessageBo(MessageBoHisServiceImpl.java:200)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByEndpointSpec_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getReqMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByEndpointSpec_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getReqMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByEndpointSpec_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getReqMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByEndpointSpec_4()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getReqMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByEpId(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByEpId_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getReqMessageBoByEpId(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByIndex_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getReqMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByIndex_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getReqMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByIndex_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getReqMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getReqMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetReqMessageBoByIndex_4()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getReqMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByEndpointSpec_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getRspMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByEndpointSpec_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getRspMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByEndpointSpec_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getRspMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByEndpointSpec(String) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByEndpointSpec_4()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		String endpointSpec = "";
//
//		MessageBO result = fixture.getRspMessageBoByEndpointSpec(endpointSpec);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByEpId(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByEpId_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int epId = 1;
//
//		MessageBO result = fixture.getRspMessageBoByEpId(epId);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByIndex_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getRspMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByIndex_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getRspMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByIndex_3()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getRspMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the MessageBO getRspMessageBoByIndex(int) method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetRspMessageBoByIndex_4()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//		int index = 1;
//
//		MessageBO result = fixture.getRspMessageBoByIndex(index);
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the Map<String, Timestamp> getTimeMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetTimeMap_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		Map<String, Timestamp> result = fixture.getTimeMap();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.size());
//	}
//
//	/**
//	 * Run the Map<String, Timestamp> getTimeMap() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testGetTimeMap_2()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		Map<String, Timestamp> result = fixture.getTimeMap();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.size());
//	}
//
//	/**
//	 * Run the void removeHis() method test.
//	 *
//	 * @throws Exception
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Test
//	public void testRemoveHis_1()
//		throws Exception {
//		MessageBoHisServiceImpl fixture = new MessageBoHisServiceImpl();
//
//		fixture.removeHis();
//
//		// add additional test code here
//	}
//
//	/**
//	 * Perform pre-test initialization.
//	 *
//	 * @throws Exception
//	 *         if the initialization fails for some reason
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@Before
//	public void setUp()
//		throws Exception {
//		// add additional set up code here
//	}
//
//	/**
//	 * Perform post-test clean-up.
//	 *
//	 * @throws Exception
//	 *         if the clean-up fails for some reason
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	@After
//	public void tearDown()
//		throws Exception {
//		// Add additional tear down code here
//	}
//
//	/**
//	 * Launch the test.
//	 *
//	 * @param args the command line arguments
//	 *
//	 * @generatedBy CodePro at 15-12-21 下午4:48
//	 */
//	public static void main(String[] args) {
//		new org.junit.runner.JUnitCore().run(MessageBoHisServiceImplTest.class);
//	}
//}