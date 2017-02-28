package com.ailk.eaap.op2.serviceagent.common;

import java.util.Map;

import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.LogMessageObject;

/**
 * MessageBO类的接口，用于自定义端点处的方法监控
 * @author MAWL
 *
 */
public interface IMessageBO<T> {

	String getReqorrsp();
	void setReqorrsp(String reqorrsp);
	String getRegServiceCode();
	String getAccessToken();
	void setAccessToken(String accessToken);
	void setRegServiceCode(String regServiceCode);
	String getRegServiceVersion();
	void setRegServiceVersion(String regServiceVersion);
	String getServiceLevel();
	void setServiceLevel(String serviceLevel);
	String getActionCode();
	void setActionCode(String actionCode);
	String getSrcorgcode();
	void setSrcorgcode(String srcorgcode);
	String getSign();
	void setSign(String sign);
	String getRestFormString();
	void setRestFormString(String restFormString);
	String getBusCode();
	void setBusCode(String busCode);
	void setFormat(String format);
	T getMsgBody();
	void setMsgBody(T msgBody);
	void setAppKey(String appKey);
	Map<String, Object> getMsgHead();
	void setMsgHead();
	void setMsgHead(Map<String, Object> msgHead);
	String getDstSyscode();
	void setDstSyscode(String dstSyscode);
	String getTransactionID();
	String getContractVer();
	void setContractVer(String contractVer);
	void setTransactionID(String transactionID);
	String getSrcsyscode();
	Component getSrcComponent();
	void setSrcComponent(Component srcComponent);
	Component getDstComponent();
	void setDstComponent(Component dstComponent);
	void setSrcsyscode(String srcsyscode);
	String getIp();
	String getApiname();
	void setApiname(String apiname);
	void setIp(String ip);
	Map<String,String> getMessageMap();
	void setMessageMap(Map messageMap);
	String getInType();
	String getDstOrgID();
	String getFormat();
	void setInType(String inType);
	ContractVersion getContractVersion();
	void setContractVersion(ContractVersion contractVersion);
	SerInvokeIns getSerInvokeIns();
	void setSerInvokeIns(SerInvokeIns serInvokeIns);

	Service getService();

	void setService(Service service);

	String getDefaultTime();

	void setDefaultTime(String defaultTime);

	String getSrcReqTime();
	void setSrcReqTime(String srcReqTime);
	void setLogMessageObject(LogMessageObject logMessageObject);
	App getApp();
	void setApp(App app);
	String getAppKey();;
	String getRestReqTime();
	
	void setDstOrgID(String dstOrgID);;
	String getServiceCode();

	void setServiceCode(String serviceCode);

	RouteEndpoint getCurrryRouteEndpoint();

	void setCurrryRouteEndpoint(RouteEndpoint currryRouteEndpoint);

	Map<String, String> getReqVersionMsg();

	String getRspType();


	void setReqVersionMsg(Map<String, String> reqVersionMsg);

	Map<String, String> getRspVersionMsg();

	void setRspVersionMsg(Map<String, String> rspVersionMsg);

	void setExceptionCode(String exceptionCode);
	
	void setSourceContractInteraction(ContractInteraction sourceContractInteraction);
}
