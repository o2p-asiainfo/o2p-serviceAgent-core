package com.ailk.eaap.o2p.freemarker;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.ArrayUtils;
import org.dom4j.Document;
import org.dom4j.Node;

import com.ailk.eaap.integration.o2p.model.ContractBody;
import com.ailk.eaap.op2.common.JsonUtil;
import com.ailk.eaap.op2.serviceagent.common.ExecutionContext;
import com.ailk.eaap.op2.serviceagent.common.IMessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.LogMessageObject;

public class MessageBO<T> implements Serializable,IMessageBO<T>, Cloneable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  static final String Default_URLGET_Token = "AccessToken";
	public  static final String Default_XML_Token = "/ContractRoot/TcpCont/AccessToken";
	public  static final String Default_JSON_Token = "$.AccessToken";
	
	public  static final String TYPE = "TYPE";
	public  static final String SRCORGID = "SRCORGID";
	public  static final String SRCSYSID = "SRCSYSID";
	public  static final String DSTORGID = "DSTORGID";
	public  static final String DSTSYSID = "DSTSYSID";
	public  static final String BUSCODE = "BUSCODE";
	public  static final String CONTRACT = "CONTRACT";
	public  static final String IP = "IP";
	public  static final String CONTRACTVERSION = "CONTRACTVERSION";
	public  static final String TRANSACTIONID = "TRANSACTIONID";
	public  static final String LOCAL_CALL = "L";
	public  static final String REMOTE_CALL = "R";
	////URLGEt的MAP请求消息 
	private Map<String,String> messageMap = new Hashtable<String,String>();
	private Map<String,String> reqVersionMsg = new Hashtable<String,String>();
	private Map<String,String> rspVersionMsg = new Hashtable<String,String>();
	//原始报文
	private String srcPlayload; 
	private T msgBody;
	private Map<String, Object> msgHead = new Hashtable<String, Object>();
	
	private String inType;
	private String dataType = DataType.XML;
	private String rspType;
	
	private ContractVersion contractVersion;
	private String contractVer;
	private Service service;
	private SerInvokeIns serInvokeIns;
	private String defaultTime;
	private String srcReqTime;
	private String ip;
	private String apiname;
	private String transactionID;
	private String dstTranId;
	private String srcsyscode;
	private String srcorgcode;
	private String dstSyscode;
	private String busCode;
	private String serviceCode;
	private String dstOrgID;
	private Component srcComponent;
	private Component dstComponent;
	private LogMessageObject logMessageObject = new LogMessageObject();
	private EAAPException eAAPException;
	private App app;
	private String format;
	private String sign;
	private String actionCode;
	private String serviceLevel;
	private String regServiceCode;
	private String regServiceVersion;
	private String reqorrsp;
	private String restFormString;
	private RouteEndpoint currryRouteEndpoint;
	private String appKey;
	private String rspTime;
	
	private String exceptionCode;
	private String orgReqMsg;
	private String accessToken;
	//定义协议体中间类
	private ContractBody contractBody;
	//authCode
	private String authCode;
	private String serviceAgentServerAddress;
	private String serviceAgentMode;
	private Long reqTime;
	private String sourceCode;
	private String realIpAddress;
	
	//文件搬迁相关端点记录信息字段
	private String endPointSpec;
	private String failMsg;
	private int failNum;
	private int successNum;
	
	//文件搬迁CI相关记录信息字段
	private String responseDes;
	private int inputFileNum;
	private int outputSuccessFileNum;
	private int outputErrFileNum;
	
	//基于http协议 get post rest
	private String httpMethod;
	//请求的URL地址 
	private String requestURL;

	private ContractInteraction sourceContractInteraction = new ContractInteraction();
	
	//标示true是任务队列，用于异常捕获，false是非任务队列，即实时接口，不捕获
	private boolean taskFlag = false;
	
	//task在缓存中的表述
	private String[] taskCacheFlag;
	
	//标示任务风格
	private String taskStyle;
	
	public Long getReqTime() {
		return reqTime;
	}

	public void setReqTime(Long reqTime) {
		this.reqTime = reqTime;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	//远程调用表示：L：本地，R:远程
	private String remoteFlag = REMOTE_CALL;
	private String tempFileDirName;
	
	//批处理上下文
	private ExecutionContext executionContext;
	
	private Integer exceptionTryNum = 1;
	
	
	public String getServiceAgentMode() {
		return serviceAgentMode;
	}

	public void setServiceAgentMode(String serviceAgentMode) {
		this.serviceAgentMode = serviceAgentMode;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getServiceAgentServerAddress() {
		return serviceAgentServerAddress;
	}

	public void setServiceAgentServerAddress(String serviceAgentServerAddress) {
		this.serviceAgentServerAddress = serviceAgentServerAddress;
	}

	public Object clone() {
		Object o=null;
		try {
			o=(MessageBO)super.clone();
		} catch(CloneNotSupportedException e) {
			throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{e.getMessage()}, e);
		}
		return o;
	} 
	
	public String getReqorrsp() {
		return reqorrsp;
	}

	public void setReqorrsp(String reqorrsp) {
		this.reqorrsp = reqorrsp;
	}

	public String getRegServiceCode() {
		return regServiceCode;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public String getSrcPlayload() {
		return srcPlayload;
	}

	public void setSrcPlayload(String srcPlayload) {
		this.srcPlayload = srcPlayload;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public void setRegServiceCode(String regServiceCode) {
		this.regServiceCode = regServiceCode;
	}

	public String getRegServiceVersion() {
		return regServiceVersion;
	}

	public void setRegServiceVersion(String regServiceVersion) {
		this.regServiceVersion = regServiceVersion;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}
	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getSrcorgcode() {
		return srcorgcode;
	}
	public void setSrcorgcode(String srcorgcode) {
		this.srcorgcode = srcorgcode;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getRestFormString() {
		return restFormString;
	}

	public void setRestFormString(String restFormString) {
		this.restFormString = restFormString;
	}

	public String getBusCode() {
		return busCode;
	}
	public void setBusCode(String busCode) {
		this.busCode = busCode;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}


	public T getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(T msgBody) {
		this.msgBody = msgBody;
	}

	

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Map<String, Object> getMsgHead() {
		return msgHead;
	}

	public void setMsgHead() {
		if(ip!=null){
			msgHead.put(this.IP,ip);
		}
		
		if(srcorgcode!=null){
			msgHead.put(this.SRCORGID, this.srcorgcode);
		}
		if(this.srcsyscode!=null){
			msgHead.put(this.SRCSYSID, this.srcsyscode);
		}
		if(this.dstOrgID!=null){
			msgHead.put(this.DSTORGID, this.dstOrgID);
		}
		if(this.dstSyscode!=null){
			msgHead.put(this.DSTSYSID, this.dstSyscode);
		}
		if(this.busCode!=null){
			msgHead.put(this.BUSCODE, this.busCode);
		}
		if(this.contractVersion!=null){
			msgHead.put(this.CONTRACT, this.contractVersion.getContract().getCode());
			msgHead.put(this.CONTRACTVERSION, this.contractVersion.getVersion());
		}
		if(this.transactionID!=null){
			msgHead.put(this.TRANSACTIONID, transactionID);
		}
		if(this.inType!=null){
			msgHead.put(this.TYPE, this.inType);
		}
		

	}

	public void setMsgHead(Map<String, Object> msgHead) {
		this.msgHead = msgHead;
	}


	public EAAPException getEAAPException() {
		return eAAPException;
	}
	public String getDstSyscode() {
		return dstSyscode;
	}
	public void setDstSyscode(String dstSyscode) {
		this.dstSyscode = dstSyscode;
	}

	public void setEAAPException(EAAPException exception) {
		eAAPException = exception;
	}
	public String getTransactionID() {
		return transactionID;
	}

	public String getContractVer() {
		return contractVer;
	}

	public void setContractVer(String contractVer) {
		this.contractVer = contractVer;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getSrcsyscode() {
		return srcsyscode;
	}

	public Component getSrcComponent() {
		return srcComponent;
	}
	public void setSrcComponent(Component srcComponent) {
		this.srcComponent = srcComponent;
	}
	public Component getDstComponent() {
		return dstComponent;
	}
	public void setDstComponent(Component dstComponent) {
		this.dstComponent = dstComponent;
	}
	public void setSrcsyscode(String srcsyscode) {
		this.srcsyscode = srcsyscode;
	}

	public String getIp() {
		return ip;
	}

	public String getApiname() {
		return apiname;
	}

	public void setApiname(String apiname) {
		this.apiname = apiname;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Map<String,String> getMessageMap() {
		return messageMap;
	}

	public void setMessageMap(Map messageMap) {
		this.messageMap = messageMap;
	}

	public String getInType() {
		return inType;
	}

	public Node getTcpnode() {
		return  ((Document)getMsgBody()).getRootElement().selectSingleNode("./TcpCont");
	}
	public String getDstOrgID() {
		return dstOrgID;
	}
	public String getFormat() {
		return format;
	}
	public void setInType(String inType) {
		this.inType = inType;
	}

	public ContractVersion getContractVersion() {
		return contractVersion;
	}

	public void setContractVersion(ContractVersion contractVersion) {
		this.contractVersion = contractVersion;
	}


	public SerInvokeIns getSerInvokeIns() {
		return serInvokeIns;
	}

	public void setSerInvokeIns(SerInvokeIns serInvokeIns) {
		this.serInvokeIns = serInvokeIns;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getDefaultTime() {
		return defaultTime;
	}

	public void setDefaultTime(String defaultTime) {
		this.defaultTime = defaultTime;
	}

	public String getSrcReqTime() {
		return srcReqTime;
	}
	public void setSrcReqTime(String srcReqTime) {
		this.srcReqTime = srcReqTime;
	}
	public LogMessageObject getLogMessageObject() {
		return logMessageObject;
	}
	public void setLogMessageObject(LogMessageObject logMessageObject) {
		this.logMessageObject = logMessageObject;
	}
	public App getApp() {
		return app;
	}
	public void setApp(App app) {
		this.app = app;
	}
	public Node getSvcnode() {
		return  ((Document)getMsgBody()).getRootElement().selectSingleNode("./SvcCont");
	}
	/**
	 *
	 * @return
	 */
	public String getAppKey(){
		
		return appKey;
	}
	/**
	 * 
	 * @return
	 */
	public String getRestReqTime(){
		
		return srcReqTime;
	}
	
	public void setDstOrgID(String dstOrgID) {
		this.dstOrgID = dstOrgID;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public static String getMessageStr(String type ,String str){
		if(type.equals(DataType.JSON)){
			return JsonUtil.xml2JSON(str);
		}else{
			return str;
		}
	}
	
	public RouteEndpoint getCurrryRouteEndpoint() {
		return currryRouteEndpoint;
	}

	public void setCurrryRouteEndpoint(RouteEndpoint currryRouteEndpoint) {
		this.currryRouteEndpoint = currryRouteEndpoint;
	}

	public Map<String, String> getReqVersionMsg() {
		return reqVersionMsg;
	}

	public String getRspType() {
		return rspType;
	}

	public void setRspType(String rspType) {
		this.rspType = rspType;
	}

	public void setReqVersionMsg(Map<String, String> reqVersionMsg) {
		this.reqVersionMsg = reqVersionMsg;
	}

	public Map<String, String> getRspVersionMsg() {
		return rspVersionMsg;
	}

	public void setRspVersionMsg(Map<String, String> rspVersionMsg) {
		this.rspVersionMsg = rspVersionMsg;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getOrgReqMsg() {
		return this.toString();
	}

	public void setOrgReqMsg(String orgReqMsg) {
		this.orgReqMsg = orgReqMsg;
	}
	/**
	 * 
	 * TODO String formate for message. 
	 *  java.lang.Object#toString()
	 */
	public String toString(){
		
		StringBuilder retStr = new StringBuilder("");
					
		if(getMsgBody() == null) {
			
			return retStr.toString();
		}
		
		if(getMsgBody() instanceof Document){
			Document retXml = (Document) getMsgBody();
			retStr.append(retXml.asXML());
		}else if(getMsgBody() instanceof JSONObject){
			JSONObject retJson = (JSONObject)getMsgBody();
			retStr.append(retJson.toString());
		}else if(getMsgBody() instanceof File[]){
			
			File[] retFileArray = (File[])getMsgBody();
			retStr.append(Arrays.toString(retFileArray));
			
		}else if(getMsgBody() instanceof File){
			File retFile = (File)getMsgBody();
			retStr.append(retFile.getAbsolutePath());
		}else if(getMsgBody() instanceof Map<?,?>){
			
			Map<?,?> fileMap = (Map<?,?>)getMsgBody();
			for(Map.Entry<?, ?> m : fileMap.entrySet()){
				if(m.getValue() instanceof File[]){
					File[] array = (File[]) m.getValue();
					
					retStr.append(m.getKey());
					retStr.append("<-");
					retStr.append(Arrays.toString(array));
					retStr.append("->");														
				}
			}
			
		}else{
			retStr.append(getMsgBody().toString());
		}
		
		
		return retStr.toString();
	}

	
	public String toAllString(){
		
		StringBuilder retStr = new StringBuilder("");
		
		//添加请求方法
		if(getHttpMethod()!=null){
			retStr.append(getHttpMethod());
			retStr.append("  ");
		}
		
		//添加请求的URL
		if(getRequestURL()!=null){
			retStr.append(getRequestURL());
			retStr.append("\r\n");
		}
                       		
		//添加请求的http头部信息
		if(getMsgHead()!=null){
			
			for(Object key : getMsgHead().keySet()){
				
				retStr.append(key);
				retStr.append(": ");
				retStr.append(getMsgHead().get(key));
				retStr.append("\r\n");
			}
			retStr.append("\r\n");
		}
		
				
		if(getMsgBody() == null) {
			
			return retStr.toString();
		}
		
		if(getMsgBody() instanceof Document){
			Document retXml = (Document) getMsgBody();
			retStr.append(retXml.asXML());
		}else if(getMsgBody() instanceof JSONObject){
			JSONObject retJson = (JSONObject)getMsgBody();
			retStr.append(retJson.toString());
		}else if(getMsgBody() instanceof File[]){
			if(this.getFailNum()==0){
				File[] retFileArray = (File[])getMsgBody();
				retStr.append(Arrays.toString(retFileArray));
			}else{
				for(String key : this.getMessageMap().keySet()){
					String fileName = this.getMessageMap().get(key);
					retStr.append(fileName).append(",");
				}
			}
		}else if(getMsgBody() instanceof File){
			File retFile = (File)getMsgBody();
			retStr.append(retFile.getAbsolutePath());
		}else if(getMsgBody() instanceof Map<?,?>){
			
			Map<?,?> fileMap = (Map<?,?>)getMsgBody();
			for(Map.Entry<?, ?> m : fileMap.entrySet()){
				if(m.getValue() instanceof File[]){
					File[] array = (File[]) m.getValue();
					
					retStr.append(m.getKey());
					retStr.append("<-");
					retStr.append(Arrays.toString(array));
					retStr.append("->");
															
				}
			}
			
		}else{
			retStr.append(getMsgBody().toString());
		}
		
		
		return retStr.toString();
	}

	public ContractBody getContractBody() {
		return contractBody;
	}

	public void setContractBody(ContractBody contractBody) {
		this.contractBody = contractBody;
	}

	public String getRemoteFlag() {
		return remoteFlag;
	}

	public void setRemoteFlag(String remoteFlag) {
		this.remoteFlag = remoteFlag;
	}

	public String getTempFileDirName() {
		return tempFileDirName;
	}

	public void setTempFileDirName(String tempFileDirName) {
		this.tempFileDirName = tempFileDirName;
	}

	public ExecutionContext getExecutionContext() {
		return executionContext;
	}

	public void setExecutionContext(ExecutionContext executionContext) {
		this.executionContext = executionContext;
	}

	public Integer getExceptionTryNum() {
		return exceptionTryNum;
	}

	public void setExceptionTryNum(Integer exceptionTryNum) {
		this.exceptionTryNum = exceptionTryNum;
	}

	public boolean isTaskFlag() {
		return taskFlag;
	}

	public void setTaskFlag(boolean taskFlag) {
		this.taskFlag = taskFlag;
	}

	public String[] getTaskCacheFlag() {
		return taskCacheFlag;
	}

	public void setTaskCacheFlag(String[] taskCacheFlag) {
		if(!ArrayUtils.isEmpty(taskCacheFlag)){
			this.taskCacheFlag = (String[]) ArrayUtils.clone(taskCacheFlag);
		}
	}

	public String getTaskStyle() {
		return taskStyle;
	}

	public void setTaskStyle(String taskStyle) {
		this.taskStyle = taskStyle;
	}

	public ContractInteraction getSourceContractInteraction() {
		return sourceContractInteraction;
	}

	public void setSourceContractInteraction(
			ContractInteraction sourceContractInteraction) {
		this.sourceContractInteraction = sourceContractInteraction;
	}
	
	public String getRealIpAddress() {
		return realIpAddress;
	}

	public void setRealIpAddress(String realIpAddress) {
		this.realIpAddress = realIpAddress;
	}

	public String getResponseDes() {
		return responseDes;
	}

	public void setResponseDes(String responseDes) {
		this.responseDes = responseDes;
	}

	public String getEndPointSpec() {
		return endPointSpec;
	}

	public void setEndPointSpec(String endPointSpec) {
		this.endPointSpec = endPointSpec;
	}

	public String getFailMsg() {
		return failMsg;
	}

	public void setFailMsg(String failMsg) {
		this.failMsg = failMsg;
	}

	public Integer getFailNum() {
		return failNum;
	}

	public void setFailNum(Integer failNum) {
		this.failNum = failNum;
	}

	public Integer getSuccessNum() {
		return successNum;
	}

	public void setSuccessNum(Integer successNum) {
		this.successNum = successNum;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}

	public Integer getInputFileNum() {
		return inputFileNum;
	}

	public void setInputFileNum(Integer inputFileNum) {
		this.inputFileNum = inputFileNum;
	}

	public Integer getOutputSuccessFileNum() {
		return outputSuccessFileNum;
	}

	public void setOutputSuccessFileNum(Integer outputSuccessFileNum) {
		this.outputSuccessFileNum = outputSuccessFileNum;
	}

	public Integer getOutputErrFileNum() {
		return outputErrFileNum;
	}

	public void setOutputErrFileNum(Integer outputErrFileNum) {
		this.outputErrFileNum = outputErrFileNum;
	}

	public String getDstTranId() {
		return dstTranId;
	}

	public String getRspTime() {
		return rspTime;
	}

	public void setRspTime(String rspTime) {
		this.rspTime = rspTime;
	}

	public void setDstTranId(String dstTranId) {
		this.dstTranId = dstTranId;
	}
}