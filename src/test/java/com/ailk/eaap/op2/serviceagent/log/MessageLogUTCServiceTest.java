package com.ailk.eaap.op2.serviceagent.log;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.CtgLogs;
import com.ailk.eaap.op2.bo.EndpointInteraction;
import com.ailk.eaap.op2.bo.ExceptionLogs;
import com.ailk.eaap.op2.bo.LogMessageObject;
import com.ailk.eaap.op2.bo.OriLogClob;

/**
 * The class <code>MessageLogUTCServiceTest</code> contains tests for the class <code>{@link MessageLogUTCService}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:29
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MessageLogUTCServiceTest {
	/**
	 * Run the Object ConvertTimeToUTC(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testConvertTimeToUTC_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("true");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();

		Object result = fixture.ConvertTimeToUTC(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object ConvertTimeToUTC(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testConvertTimeToUTC_2()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();

		Object result = fixture.ConvertTimeToUTC(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ContractInteraction getContractInteraction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetContractInteraction_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());

		ContractInteraction result = fixture.getContractInteraction();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getResponseCode());
		assertEquals(null, result.getServiceLevel());
//		assertEquals(1, result.getTenantId());
		assertEquals(null, result.getContractVersion());
		assertEquals(null, result.getCenterFwd2DstTime());
		assertEquals(null, result.getCenterFwd2SrcTime());
		assertEquals(null, result.getCenterRecDstTime());
		assertEquals(null, result.getCenterRecReqTime());
		assertEquals(null, result.getSrcReqTime());
		assertEquals(null, result.getDstRecTime());
		assertEquals(null, result.getDstReplyTime());
		assertEquals(null, result.getSrcConfirmTime());
		assertEquals(null, result.getSrcResponseTime());
		assertEquals(null, result.getCreateTime());
		assertEquals(null, result.getQueueName());
		assertEquals(null, result.getSrcSysSign());
		assertEquals(null, result.getContractInteractionId());
		assertEquals(null, result.getBizFuncCode());
		assertEquals(null, result.getBizIntfCode());
		assertEquals(null, result.getRegSerCode());
		assertEquals(null, result.getRegSerVersion());
		assertEquals(null, result.getSrcTranId());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getSrcOrgCode());
		assertEquals(null, result.getDstOrgCode());
		assertEquals(null, result.getSrcSysCode());
		assertEquals(null, result.getDstSysCode());
		assertEquals(null, result.getTestFlag());
		assertEquals(null, result.getResponseType());
		assertEquals(null, result.getResponseDes());
		assertEquals(null, result.getTabSuffix());
		assertEquals(null, result.getSrcIp());
		assertEquals(0, result.getInputFileNum());
		assertEquals(0, result.getOutputSuccessFileNum());
		assertEquals(0, result.getOutputErrFileNum());
		assertEquals(null, result.getServiceStyle());
	}

	/**
	 * Run the CtgLogs getCtgLogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetCtgLogs_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());

		CtgLogs result = fixture.getCtgLogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDescriptor());
		assertEquals(null, result.getStatus());
		assertEquals(0, result.getTenantId());
		assertEquals(null, result.getCreateDate());
		assertEquals(null, result.getSrcSysSign());
		assertEquals(null, result.getContractInteractionId());
		assertEquals(null, result.getTabSuffix());
		assertEquals(null, result.getLogsSeq());
		assertEquals(null, result.getErrCode());
		assertEquals(null, result.getFunName());
		assertEquals(null, result.getErrorMsg());
	}

	/**
	 * Run the String getCtrUTCTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetCtrUTCTime_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());

		String result = fixture.getCtrUTCTime();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the EndpointInteraction getEndpointInteraction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetEndpointInteraction_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());

		EndpointInteraction result = fixture.getEndpointInteraction();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDescriptor());
		assertEquals(null, result.getCenterFwd2DstTime());
		assertEquals(null, result.getDstReplyTime());
		assertEquals(null, result.getCreateDate());
		assertEquals(null, result.getSrcSysSign());
		assertEquals(null, result.getContractInteractionId());
		assertEquals(null, result.getSrcTranId());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getDstOrgCode());
		assertEquals(null, result.getDstSysCode());
		assertEquals(null, result.getTabSuffix());
		assertEquals(null, result.getSrcIp());
		assertEquals(null, result.getEndpointInteractionId());
		assertEquals(null, result.getServiceId());
		assertEquals(null, result.getEndpointId());
		assertEquals(null, result.getReqOrRes());
		assertEquals(null, result.getQueueMsgId());
		assertEquals(null, result.getResQueue());
		assertEquals(null, result.getReqQueue());
		assertEquals(null, result.getEndPointSpec());
		assertEquals(0, result.getSuccessNum());
		assertEquals(0, result.getFailNum());
		assertEquals(null, result.getInMsg());
		assertEquals(null, result.getOutMsg());
	}

	/**
	 * Run the ExceptionLogs getExceptionLogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetExceptionLogs_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());

		ExceptionLogs result = fixture.getExceptionLogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getExceptionMessage());
		assertEquals(null, result.getCreateTime());
		assertEquals(null, result.getSrcSysSign());
		assertEquals(null, result.getContractInteractionId());
		assertEquals(null, result.getSrcTranId());
		assertEquals(null, result.getTabSuffix());
		assertEquals(null, result.getExceptionInstId());
		assertEquals(null, result.getExceptionSpecId());
		assertEquals(null, result.getStaffNbr());
	}

	/**
	 * Run the void getObjectList(LogMessageObject,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetObjectList_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		Object object = new Object();

		fixture.getObjectList(logObject, object);

		// add additional test code here
	}

	/**
	 * Run the void getObjectList(LogMessageObject,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetObjectList_2()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		Object object = new Object();

		fixture.getObjectList(logObject, object);

		// add additional test code here
	}

	/**
	 * Run the void getObjectList(LogMessageObject,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetObjectList_3()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		Object object = new Object();

		fixture.getObjectList(logObject, object);

		// add additional test code here
	}

	/**
	 * Run the void getObjectList(LogMessageObject,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetObjectList_4()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		Object object = new Object();

		fixture.getObjectList(logObject, object);

		// add additional test code here
	}

	/**
	 * Run the void getObjectList(LogMessageObject,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetObjectList_5()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		Object object = new Object();

		fixture.getObjectList(logObject, object);

		// add additional test code here
	}

	/**
	 * Run the OriLogClob getOriLogClob() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testGetOriLogClob_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());

		OriLogClob result = fixture.getOriLogClob();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getMsg());
		assertEquals(null, result.getCreateTime());
		assertEquals(null, result.getSrcSysSign());
		assertEquals(null, result.getContractInteractionId());
		assertEquals(null, result.getSrcTranId());
		assertEquals(null, result.getDstTranId());
		assertEquals(null, result.getSrcOrgCode());
		assertEquals(null, result.getDstOrgCode());
		assertEquals(null, result.getSrcSysCode());
		assertEquals(null, result.getDstSysCode());
		assertEquals(null, result.getTabSuffix());
		assertEquals(null, result.getSrcIp());
		assertEquals(null, result.getEndpointInteractionId());
		assertEquals(null, result.getReqOrRes());
		assertEquals(null, result.getOlcId());
		assertEquals(null, result.getEndPointId());
		assertEquals(null, result.getFailMsg());
	}

	/**
	 * Run the void setContractInteraction(ContractInteraction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetContractInteraction_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		ContractInteraction contractInteraction = new ContractInteraction();

		fixture.setContractInteraction(contractInteraction);

		// add additional test code here
	}

	/**
	 * Run the Object setContractInteractionObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetContractInteractionObjectList_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setContractInteractionList(new LinkedList());

		Object result = fixture.setContractInteractionObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setContractInteractionObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetContractInteractionObjectList_2()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setContractInteractionList(new LinkedList());

		Object result = fixture.setContractInteractionObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setContractInteractionObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetContractInteractionObjectList_3()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setContractInteractionList(new LinkedList());

		Object result = fixture.setContractInteractionObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCtgLogs(CtgLogs) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetCtgLogs_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		CtgLogs ctgLogs = new CtgLogs();

		fixture.setCtgLogs(ctgLogs);

		// add additional test code here
	}

	/**
	 * Run the Object setCtgLogsObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetCtgLogsObjectList_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setCtgLogsList(new LinkedList());

		Object result = fixture.setCtgLogsObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setCtgLogsObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetCtgLogsObjectList_2()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setCtgLogsList(new LinkedList());

		Object result = fixture.setCtgLogsObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setCtgLogsObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetCtgLogsObjectList_3()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setCtgLogsList(new LinkedList());

		Object result = fixture.setCtgLogsObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCtrUTCTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetCtrUTCTime_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		String ctrUTCTime = "";

		fixture.setCtrUTCTime(ctrUTCTime);

		// add additional test code here
	}

	/**
	 * Run the void setEndpointInteraction(EndpointInteraction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetEndpointInteraction_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		EndpointInteraction endpointInteraction = new EndpointInteraction();

		fixture.setEndpointInteraction(endpointInteraction);

		// add additional test code here
	}

	/**
	 * Run the Object setEndpointInteractionObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetEndpointInteractionObjectList_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setEndpointInteractionList(new LinkedList());

		Object result = fixture.setEndpointInteractionObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setEndpointInteractionObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetEndpointInteractionObjectList_2()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setEndpointInteractionList(new LinkedList());

		Object result = fixture.setEndpointInteractionObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setEndpointInteractionObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetEndpointInteractionObjectList_3()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setEndpointInteractionList(new LinkedList());

		Object result = fixture.setEndpointInteractionObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setExceptionLogs(ExceptionLogs) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetExceptionLogs_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		ExceptionLogs exceptionLogs = new ExceptionLogs();

		fixture.setExceptionLogs(exceptionLogs);

		// add additional test code here
	}

	/**
	 * Run the Object setExceptionLogsObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetExceptionLogsObjectList_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setExceptionLogsList(new LinkedList());

		Object result = fixture.setExceptionLogsObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setExceptionLogsObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetExceptionLogsObjectList_2()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setExceptionLogsList(new LinkedList());

		Object result = fixture.setExceptionLogsObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setExceptionLogsObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetExceptionLogsObjectList_3()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setExceptionLogsList(new LinkedList());

		Object result = fixture.setExceptionLogsObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setOriLogClob(OriLogClob) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetOriLogClob_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		OriLogClob oriLogClob = new OriLogClob();

		fixture.setOriLogClob(oriLogClob);

		// add additional test code here
	}

	/**
	 * Run the Object setOriLogClobObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetOriLogClobObjectList_1()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setOriLogClobList(new LinkedList());

		Object result = fixture.setOriLogClobObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setOriLogClobObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetOriLogClobObjectList_2()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setOriLogClobList(new LinkedList());

		Object result = fixture.setOriLogClobObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object setOriLogClobObjectList(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	@Test
	public void testSetOriLogClobObjectList_3()
		throws Exception {
		MessageLogUTCService fixture = new MessageLogUTCService();
		fixture.setContractInteraction(new ContractInteraction());
		fixture.setEndpointInteraction(new EndpointInteraction());
		fixture.setExceptionLogs(new ExceptionLogs());
		fixture.setCtrUTCTime("");
		fixture.setOriLogClob(new OriLogClob());
		fixture.setCtgLogs(new CtgLogs());
		LogMessageObject logObject = new LogMessageObject();
		logObject.setOriLogClobList(new LinkedList());

		Object result = fixture.setOriLogClobObjectList(logObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:29
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
	 * @generatedBy CodePro at 15-11-12 下午7:29
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
	 * @generatedBy CodePro at 15-11-12 下午7:29
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageLogUTCServiceTest.class);
	}
}