package com.ailk.eaap.op2.serviceagent.common;

import java.util.IdentityHashMap;
import java.util.Map;
import org.dom4j.Node;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.integration.o2p.model.ContractBody;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.LogMessageObject;

/**
 * The class <code>MessageBOTest</code> contains tests for the class <code>{@link MessageBO}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:45
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MessageBOTest {
	/**
	 * Run the MessageBO() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testMessageBO_1()
		throws Exception {
		MessageBO result = new MessageBO();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testClone_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Object result = fixture.clone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Object clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testClone_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Object result = fixture.clone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getAccessToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetAccessToken_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getAccessToken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getActionCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetActionCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getActionCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getApiname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetApiname_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getApiname();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the App getApp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetApp_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		App result = fixture.getApp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getAppKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetAppKey_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getAppKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getAuthCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetAuthCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getAuthCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getBusCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetBusCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getBusCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the ContractBody getContractBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetContractBody_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		ContractBody result = fixture.getContractBody();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getContractVer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetContractVer_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getContractVer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the ContractVersion getContractVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetContractVersion_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		ContractVersion result = fixture.getContractVersion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the RouteEndpoint getCurrryRouteEndpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetCurrryRouteEndpoint_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		RouteEndpoint result = fixture.getCurrryRouteEndpoint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDataType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetDataType_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getDataType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDefaultTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetDefaultTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getDefaultTime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Component getDstComponent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetDstComponent_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Component result = fixture.getDstComponent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDstOrgID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetDstOrgID_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getDstOrgID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDstSyscode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetDstSyscode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getDstSyscode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDstTranId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetDstTranId_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getDstTranId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the EAAPException getEAAPException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetEAAPException_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		EAAPException result = fixture.getEAAPException();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getEndPointSpec() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetEndPointSpec_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getEndPointSpec();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getExceptionCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetExceptionCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getExceptionCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getExceptionTryNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetExceptionTryNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Integer result = fixture.getExceptionTryNum();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the ExecutionContext getExecutionContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetExecutionContext_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		ExecutionContext result = fixture.getExecutionContext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getFailMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetFailMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getFailMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getFailNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetFailNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Integer result = fixture.getFailNum();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getFormat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetFormat_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getFormat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getHttpMethod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetHttpMethod_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getHttpMethod();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getInType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetInType_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getInType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getInputFileNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetInputFileNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Integer result = fixture.getInputFileNum();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getIp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetIp_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getIp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the LogMessageObject getLogMessageObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetLogMessageObject_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		LogMessageObject result = fixture.getLogMessageObject();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getMessageMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetMessageMap_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Map<String, String> result = fixture.getMessageMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getMessageStr(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetMessageStr_1()
		throws Exception {
		String type = "JSON";
		String str = "";

		String result = MessageBO.getMessageStr(type, str);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.common.JsonUtil.<clinit>(JsonUtil.java:27)
		//       at com.ailk.eaap.op2.serviceagent.common.MessageBO.getMessageStr(MessageBO.java:550)
		assertNotNull(result);
	}

	/**
	 * Run the String getMessageStr(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetMessageStr_2()
		throws Exception {
		String type = "";
		String str = "";

		String result = MessageBO.getMessageStr(type, str);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Object getMsgBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetMsgBody_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Object result = fixture.getMsgBody();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> getMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetMsgHead_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Map<String, Object> result = fixture.getMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getOrgReqMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetOrgReqMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getOrgReqMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getOutputErrFileNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetOutputErrFileNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Integer result = fixture.getOutputErrFileNum();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getOutputSuccessFileNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetOutputSuccessFileNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Integer result = fixture.getOutputSuccessFileNum();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getQueueName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetQueueName_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getQueueName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRealIpAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRealIpAddress_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRealIpAddress();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRegServiceCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRegServiceCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRegServiceCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRegServiceVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRegServiceVersion_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRegServiceVersion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRemoteFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRemoteFlag_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRemoteFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Long getReqTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetReqTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Long result = fixture.getReqTime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getReqVersionMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetReqVersionMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Map<String, String> result = fixture.getReqVersionMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getReqorrsp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetReqorrsp_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getReqorrsp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRequestURL_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRequestURL();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getResponseDes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetResponseDes_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getResponseDes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRestFormString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRestFormString_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRestFormString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRestReqTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRestReqTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRestReqTime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRspTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRspTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRspTime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getRspType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRspType_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getRspType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getRspVersionMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetRspVersionMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Map<String, String> result = fixture.getRspVersionMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getScopeId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetScopeId_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getScopeId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the SerInvokeIns getSerInvokeIns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSerInvokeIns_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		SerInvokeIns result = fixture.getSerInvokeIns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Service getService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetService_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Service result = fixture.getService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getServiceAgentMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetServiceAgentMode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getServiceAgentMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getServiceAgentServerAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetServiceAgentServerAddress_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getServiceAgentServerAddress();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getServiceCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetServiceCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getServiceCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getServiceLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetServiceLevel_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getServiceLevel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getServiceStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetServiceStyle_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getServiceStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getSign() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSign_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getSign();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getSourceCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSourceCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getSourceCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the ContractInteraction getSourceContractInteraction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSourceContractInteraction_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		ContractInteraction result = fixture.getSourceContractInteraction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Component getSrcComponent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSrcComponent_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Component result = fixture.getSrcComponent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getSrcPlayload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSrcPlayload_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getSrcPlayload();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getSrcReqTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSrcReqTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getSrcReqTime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getSrcorgcode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSrcorgcode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getSrcorgcode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getSrcsyscode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSrcsyscode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getSrcsyscode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getSuccessNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSuccessNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Integer result = fixture.getSuccessNum();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Node getSvcnode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetSvcnode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Node result = fixture.getSvcnode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTaskCacheFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetTaskCacheFlag_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String[] result = fixture.getTaskCacheFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTaskCacheFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetTaskCacheFlag_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String[] result = fixture.getTaskCacheFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getTaskStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetTaskStyle_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getTaskStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Node getTcpnode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetTcpnode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Node result = fixture.getTcpnode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getTempFileDirName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetTempFileDirName_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getTempFileDirName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the Tenant getTenant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetTenant_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		Tenant result = fixture.getTenant();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getTransactionID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testGetTransactionID_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.getTransactionID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isNeedBreak() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testIsNeedBreak_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		boolean result = fixture.isNeedBreak();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isNeedBreak() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testIsNeedBreak_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(false);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		boolean result = fixture.isNeedBreak();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isTaskFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testIsTaskFlag_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		boolean result = fixture.isTaskFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isTaskFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testIsTaskFlag_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(false);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		boolean result = fixture.isTaskFlag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertTrue(result);
	}

	/**
	 * Run the void setAccessToken(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetAccessToken_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String accessToken = "";

		fixture.setAccessToken(accessToken);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setActionCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetActionCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String actionCode = "";

		fixture.setActionCode(actionCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setApiname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetApiname_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String apiname = "";

		fixture.setApiname(apiname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setApp(App) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetApp_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		App app = new App();

		fixture.setApp(app);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setAppKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetAppKey_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String appKey = "";

		fixture.setAppKey(appKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setAuthCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetAuthCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String authCode = "";

		fixture.setAuthCode(authCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setBusCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetBusCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String busCode = "";

		fixture.setBusCode(busCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setContractBody(ContractBody) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetContractBody_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		ContractBody contractBody = new ContractBody();

		fixture.setContractBody(contractBody);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setContractVer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetContractVer_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String contractVer = "";

		fixture.setContractVer(contractVer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setContractVersion(ContractVersion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetContractVersion_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		ContractVersion contractVersion = new ContractVersion();

		fixture.setContractVersion(contractVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setCurrryRouteEndpoint(RouteEndpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetCurrryRouteEndpoint_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		RouteEndpoint currryRouteEndpoint = new RouteEndpoint();

		fixture.setCurrryRouteEndpoint(currryRouteEndpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setDataType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetDataType_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String dataType = "";

		fixture.setDataType(dataType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setDefaultTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetDefaultTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String defaultTime = "";

		fixture.setDefaultTime(defaultTime);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setDstComponent(Component) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetDstComponent_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Component dstComponent = new Component();

		fixture.setDstComponent(dstComponent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setDstOrgID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetDstOrgID_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String dstOrgID = "";

		fixture.setDstOrgID(dstOrgID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setDstSyscode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetDstSyscode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String dstSyscode = "";

		fixture.setDstSyscode(dstSyscode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setDstTranId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetDstTranId_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String dstTranId = "";

		fixture.setDstTranId(dstTranId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setEAAPException(EAAPException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetEAAPException_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		EAAPException exception = new EAAPException("", "", "");

		fixture.setEAAPException(exception);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setEndPointSpec(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetEndPointSpec_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String endPointSpec = "";

		fixture.setEndPointSpec(endPointSpec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setExceptionCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetExceptionCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String exceptionCode = "";

		fixture.setExceptionCode(exceptionCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setExceptionTryNum(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetExceptionTryNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Integer exceptionTryNum = new Integer(1);

		fixture.setExceptionTryNum(exceptionTryNum);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setExecutionContext(ExecutionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetExecutionContext_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		ExecutionContext executionContext = new ExecutionContext();

		fixture.setExecutionContext(executionContext);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setFailMsg(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetFailMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String failMsg = "";

		fixture.setFailMsg(failMsg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setFailNum(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetFailNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Integer failNum = new Integer(1);

		fixture.setFailNum(failNum);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setFormat(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetFormat_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String format = "";

		fixture.setFormat(format);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setHttpMethod(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetHttpMethod_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String httpMethod = "";

		fixture.setHttpMethod(httpMethod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setInType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetInType_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String inType = "";

		fixture.setInType(inType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setInputFileNum(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetInputFileNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Integer inputFileNum = new Integer(1);

		fixture.setInputFileNum(inputFileNum);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setIp(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetIp_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String ip = "";

		fixture.setIp(ip);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setLogMessageObject(LogMessageObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetLogMessageObject_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		LogMessageObject logMessageObject = new LogMessageObject();

		fixture.setLogMessageObject(logMessageObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMessageMap(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMessageMap_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Map messageMap = new IdentityHashMap();

		fixture.setMessageMap(messageMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgBody(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgBody_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgBody(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp((String) null);
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_3()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode((String) null);
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_4()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode((String) null);
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_5()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID((String) null);
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_6()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode((String) null);
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode((String) null);
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID((String) null);
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp((String) null);
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_7()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode((String) null);
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_8()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode((String) null);
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_9()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion((ContractVersion) null);
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_10()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID((String) null);
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_11()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType((String) null);
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_12()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion((ContractVersion) null);
		fixture.setSrcsyscode("");
		fixture.setBusCode((String) null);
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType((String) null);
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode((String) null);
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID((String) null);
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_13()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion((ContractVersion) null);
		fixture.setSrcsyscode("");
		fixture.setBusCode((String) null);
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType((String) null);
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode((String) null);
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode((String) null);
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID((String) null);
		fixture.setTransactionID((String) null);
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp((String) null);
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_14()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion((ContractVersion) null);
		fixture.setSrcsyscode((String) null);
		fixture.setBusCode((String) null);
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType((String) null);
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode((String) null);
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID((String) null);
		fixture.setTransactionID((String) null);
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp((String) null);
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_15()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion((ContractVersion) null);
		fixture.setSrcsyscode((String) null);
		fixture.setBusCode((String) null);
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType((String) null);
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode((String) null);
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode((String) null);
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID((String) null);
		fixture.setTransactionID((String) null);
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_16()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion((ContractVersion) null);
		fixture.setSrcsyscode((String) null);
		fixture.setBusCode((String) null);
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType((String) null);
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode((String) null);
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode((String) null);
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID((String) null);
		fixture.setTransactionID((String) null);
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp((String) null);
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		fixture.setMsgHead();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setMsgHead(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetMsgHead_17()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Map<String, Object> msgHead = new IdentityHashMap();

		fixture.setMsgHead(msgHead);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setNeedBreak(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetNeedBreak_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		boolean needBreak = true;

		fixture.setNeedBreak(needBreak);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setOrgReqMsg(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetOrgReqMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String orgReqMsg = "";

		fixture.setOrgReqMsg(orgReqMsg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setOutputErrFileNum(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetOutputErrFileNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Integer outputErrFileNum = new Integer(1);

		fixture.setOutputErrFileNum(outputErrFileNum);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setOutputSuccessFileNum(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetOutputSuccessFileNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Integer outputSuccessFileNum = new Integer(1);

		fixture.setOutputSuccessFileNum(outputSuccessFileNum);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setQueueName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetQueueName_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String queueName = "";

		fixture.setQueueName(queueName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRealIpAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRealIpAddress_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String realIpAddress = "";

		fixture.setRealIpAddress(realIpAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRegServiceCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRegServiceCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String regServiceCode = "";

		fixture.setRegServiceCode(regServiceCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRegServiceVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRegServiceVersion_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String regServiceVersion = "";

		fixture.setRegServiceVersion(regServiceVersion);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRemoteFlag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRemoteFlag_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String remoteFlag = "";

		fixture.setRemoteFlag(remoteFlag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setReqTime(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetReqTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Long reqTime = new Long(1L);

		fixture.setReqTime(reqTime);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setReqVersionMsg(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetReqVersionMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Map<String, String> reqVersionMsg = new IdentityHashMap();

		fixture.setReqVersionMsg(reqVersionMsg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setReqorrsp(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetReqorrsp_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String reqorrsp = "";

		fixture.setReqorrsp(reqorrsp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRequestURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRequestURL_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String requestURL = "";

		fixture.setRequestURL(requestURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setResponseDes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetResponseDes_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String responseDes = "";

		fixture.setResponseDes(responseDes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRestFormString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRestFormString_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String restFormString = "";

		fixture.setRestFormString(restFormString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRspTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRspTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String rspTime = "";

		fixture.setRspTime(rspTime);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRspType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRspType_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String rspType = "";

		fixture.setRspType(rspType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setRspVersionMsg(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetRspVersionMsg_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Map<String, String> rspVersionMsg = new IdentityHashMap();

		fixture.setRspVersionMsg(rspVersionMsg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setScopeId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetScopeId_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String scopeId = "";

		fixture.setScopeId(scopeId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSerInvokeIns(SerInvokeIns) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSerInvokeIns_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		SerInvokeIns serInvokeIns = new SerInvokeIns();

		fixture.setSerInvokeIns(serInvokeIns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setService(Service) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetService_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Service service = new Service();

		fixture.setService(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setServiceAgentMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetServiceAgentMode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String serviceAgentMode = "";

		fixture.setServiceAgentMode(serviceAgentMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setServiceAgentServerAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetServiceAgentServerAddress_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String serviceAgentServerAddress = "";

		fixture.setServiceAgentServerAddress(serviceAgentServerAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setServiceCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetServiceCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String serviceCode = "";

		fixture.setServiceCode(serviceCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setServiceLevel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetServiceLevel_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String serviceLevel = "";

		fixture.setServiceLevel(serviceLevel);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setServiceStyle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetServiceStyle_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String serviceStyle = "";

		fixture.setServiceStyle(serviceStyle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSign(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSign_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String sign = "";

		fixture.setSign(sign);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSourceCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSourceCode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String sourceCode = "";

		fixture.setSourceCode(sourceCode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSourceContractInteraction(ContractInteraction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSourceContractInteraction_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		ContractInteraction sourceContractInteraction = new ContractInteraction();

		fixture.setSourceContractInteraction(sourceContractInteraction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSrcComponent(Component) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSrcComponent_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Component srcComponent = new Component();

		fixture.setSrcComponent(srcComponent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSrcPlayload(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSrcPlayload_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String srcPlayload = "";

		fixture.setSrcPlayload(srcPlayload);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSrcReqTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSrcReqTime_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String srcReqTime = "";

		fixture.setSrcReqTime(srcReqTime);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSrcorgcode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSrcorgcode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String srcorgcode = "";

		fixture.setSrcorgcode(srcorgcode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSrcsyscode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSrcsyscode_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String srcsyscode = "";

		fixture.setSrcsyscode(srcsyscode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setSuccessNum(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetSuccessNum_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Integer successNum = new Integer(1);

		fixture.setSuccessNum(successNum);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setTaskCacheFlag(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetTaskCacheFlag_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String[] taskCacheFlag = new String[] {};

		fixture.setTaskCacheFlag(taskCacheFlag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setTaskCacheFlag(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetTaskCacheFlag_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String[] taskCacheFlag = new String[] {};

		fixture.setTaskCacheFlag(taskCacheFlag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setTaskFlag(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetTaskFlag_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		boolean taskFlag = true;

		fixture.setTaskFlag(taskFlag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setTaskStyle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetTaskStyle_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String taskStyle = "";

		fixture.setTaskStyle(taskStyle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setTempFileDirName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetTempFileDirName_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String tempFileDirName = "";

		fixture.setTempFileDirName(tempFileDirName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setTenant(Tenant) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetTenant_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		Tenant tenant = new Tenant();

		fixture.setTenant(tenant);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the void setTransactionID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSetTransactionID_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");
		String transactionID = "";

		fixture.setTransactionID(transactionID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_3()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_4()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_5()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_6()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_7()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_8()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_9()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_10()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toAllString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToAllString_11()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toAllString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_2()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_3()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_4()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_5()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_6()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_7()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_8()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testToString_9()
		throws Exception {
		MessageBO fixture = new MessageBO();
		fixture.setRegServiceVersion("");
		fixture.setContractVer("");
		fixture.setServiceAgentServerAddress("");
		fixture.setRealIpAddress("");
		fixture.setServiceAgentMode("");
		fixture.setOutputSuccessFileNum(new Integer(1));
		fixture.setOrgReqMsg("");
		fixture.setSuccessNum(new Integer(1));
		fixture.setActionCode("");
		fixture.setExecutionContext(new ExecutionContext());
		fixture.setService(new Service());
		fixture.setOutputErrFileNum(new Integer(1));
		fixture.setContractVersion(new ContractVersion());
		fixture.setSrcsyscode("");
		fixture.setBusCode("");
		fixture.setContractBody(new ContractBody());
		fixture.setRspTime("");
		fixture.setMsgHead(new IdentityHashMap());
		fixture.setReqVersionMsg(new IdentityHashMap());
		fixture.setAppKey("");
		fixture.setFailNum(new Integer(1));
		fixture.setCurrryRouteEndpoint(new RouteEndpoint());
		fixture.setFormat("");
		fixture.setInputFileNum(new Integer(1));
		fixture.setDataType("");
		fixture.setDstComponent(new Component());
		fixture.setMessageMap(new IdentityHashMap());
		fixture.setInType("");
		fixture.setRemoteFlag("");
		fixture.setRestFormString("");
		fixture.setReqTime(new Long(1L));
		fixture.setSrcReqTime("");
		fixture.setScopeId("");
		fixture.setAccessToken("");
		fixture.setDefaultTime("");
		fixture.setApiname("");
		fixture.setSourceCode("");
		fixture.setDstSyscode("");
		fixture.setDstTranId("");
		fixture.setRspType("");
		fixture.setAuthCode("");
		fixture.setSrcorgcode("");
		fixture.setServiceLevel("");
		fixture.setQueueName("");
		fixture.setRequestURL("");
		fixture.setSrcComponent(new Component());
		fixture.setExceptionCode("");
		fixture.setSign("");
		fixture.setNeedBreak(true);
		fixture.setTempFileDirName("");
		fixture.setServiceCode("");
		fixture.setLogMessageObject(new LogMessageObject());
		fixture.setDstOrgID("");
		fixture.setTransactionID("");
		fixture.setServiceStyle("");
		fixture.setMsgBody((Object) null);
		fixture.setTaskFlag(true);
		fixture.setTenant(new Tenant());
		fixture.setSourceContractInteraction(new ContractInteraction());
		fixture.setTaskStyle("");
		fixture.setApp(new App());
		fixture.setFailMsg("");
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setResponseDes("");
		fixture.setSerInvokeIns(new SerInvokeIns());
		fixture.setIp("");
		fixture.setEndPointSpec("");
		fixture.setSrcPlayload("");
		fixture.setEAAPException(new EAAPException("", "", ""));
		fixture.setReqorrsp("");
		fixture.setHttpMethod("");
		fixture.setRspVersionMsg(new IdentityHashMap());
		fixture.setRegServiceCode("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:48)
		//       at java.lang.Integer.parseInt(Integer.java:470)
		//       at java.lang.Integer.parseInt(Integer.java:499)
		//       at com.ailk.eaap.op2.common.EAAPException.<init>(EAAPException.java:38)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
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
	 * @generatedBy CodePro at 15-12-21 下午4:45
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
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageBOTest.class);
	}
}