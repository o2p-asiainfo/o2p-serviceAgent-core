package com.ailk.eaap.op2.serviceagent.common;


import javax.xml.namespace.QName;

import org.apache.axis.AxisProperties;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;

import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;

/**
 * 
 *<br>
 * 
 * <p>
 * @version 1.0
 * @author litieyang Feb 18, 2013
 * <hr>
 * 
 * <hr>
 * <br>       
 * 
 * <hr>
 */
public final class EAAPAxisClient {

	public static final String defaultMethodName = "exchange";
	public static final String defaultNameSpace = "http://www.chinatelecom.hub.com";
	public static final String defaultInparamname = "in0";
	public static final String defaultInparamnamespace = "http://www.chinatelecom.hub.com";
	public static final String spliStr = "#!";
	private static final Logger log = Logger.getLog(EAAPAxisClient.class);
	
	private EAAPAxisClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String sendWebServiceReq(String method,String namespce,String inparamName,String inParamnamespace,String inMsg,String url,int timeOut,String username,String password ,String proxyip,String proxyport) {
		try{
	        
			OperationDesc oper = new OperationDesc();
			oper.setName(method);
	        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
	        oper.setReturnClass(java.lang.String.class);
	        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
	        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
	        oper.setUse(org.apache.axis.constants.Use.LITERAL);
			String paramNames[] = inparamName.split(spliStr);
			String inParamnamespaces[] = inParamnamespace.split(spliStr);
			String inMsgs[] = inMsg.split(spliStr);
			
			for (int i = 0; i < paramNames.length; i++) {
				if(log.isDebugEnabled()) {
					log.debug((inParamnamespaces[i]+"::"+paramNames[i]));
				}
				if( inParamnamespaces[i].trim().equals("")){
					ParameterDesc param = new ParameterDesc(new QName("", paramNames[i]), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);;
					oper.addParameter(param);
				}else{
					if(log.isDebugEnabled()) {
						log.debug(inParamnamespaces[i]);
						log.debug(paramNames[i]);
					}
					ParameterDesc param = new ParameterDesc(new QName(inParamnamespaces[i], paramNames[i]), ParameterDesc.IN, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);;
					oper.addParameter(param);
				}
			}
			Service service = new Service();
			Call call = (Call) service.createCall();
			if(username!=null && !username.equals("")){
				AxisProperties.setProperty("http.proxyUser",username); 
			}
			if(password!=null && !password.equals("")){
				AxisProperties.setProperty("http.proxyPassword",password); 
			}
			if(proxyip!=null && !proxyip.equals("")){
				AxisProperties.setProperty("http.proxyHost",proxyip); 
			}
			if(proxyport!=null && !proxyport.equals("")){
				AxisProperties.setProperty("http.proxyPort",proxyport); 
			}
			call.setTimeout(Integer.valueOf(timeOut * 1000));
	        call.setOperation(oper);
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setSOAPActionURI("");
			call.setUseSOAPAction(true);
	        call.setSOAPActionURI("");
	        call.setEncodingStyle(null);
	        call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
	        call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
	        call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        call.setOperationName(new QName(namespce,method));
			String ret = (String) call.invoke(inMsgs);
			if(log.isDebugEnabled()) {
				log.debug(ret);
			}
			return ret;
		}catch(Exception e){
			log.error(LogModel.EVENT_BIZ_EXCPT,"call webservice errror:"+e.getMessage());
			throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{"call webservice "+e.getMessage()}, e);
		}
		
	}
}
