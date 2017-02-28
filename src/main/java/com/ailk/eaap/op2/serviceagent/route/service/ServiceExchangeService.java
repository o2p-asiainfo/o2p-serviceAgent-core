package com.ailk.eaap.op2.serviceagent.route.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;
import com.ailk.eaap.op2.common.EAAPConstants;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointSpec;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Jul 17, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class ServiceExchangeService implements IServiceExchangeService{

	private  static final Logger LOG = Logger.getLogger(ServiceExchangeService.class);
	private ProcessorFactory processorFactory;
	private String defaultTime;
	private String serviceAgentMode;
	private String serviceAgentServerAddress;

	
	public String getServiceAgentMode() {
		return serviceAgentMode;
	}

	public void setServiceAgentMode(String serviceAgentMode) {
		this.serviceAgentMode = serviceAgentMode;
	}
	public String getServiceAgentServerAddress() {
		return serviceAgentServerAddress;
	}

	public void setServiceAgentServerAddress(String serviceAgentServerAddress) {
		this.serviceAgentServerAddress = serviceAgentServerAddress;
	}
	
	public MessageBO exchange(Endpoint toEndpoint, MessageBO messageBo)  {
		if(isPassProcess(toEndpoint, messageBo)){
			return messageBo;
		}
		MessageBO outMsg = null;
		outMsg = process(toEndpoint, messageBo);
		return outMsg;
	}

	private MessageBO process(Endpoint toEndpoint, MessageBO messageBo)
			 {
		MessageBO outMsg = messageBo;
		
		EndpointProcessor processor = processorFactory.getProcessor(toEndpoint);		
		if (processor != null) {
			
			Date startTime = new Date();
			if(LOG.isDebugEnabled()) {
				LOG.debug("The endpoint "+processor+" started. ");
			}
			
			outMsg = processor.process(toEndpoint, messageBo);
			
			if(LOG.isDebugEnabled()) {
				Date endTime = new Date();
				LOG.debug("The endpoint "+processor+" end, used time "+(endTime.getTime()-startTime.getTime())+"ms");
			}
		} else {
			LOG.debug("The endpoint not exit");
		}
		
		return outMsg;
	}

	public ProcessorFactory getProcessorFactory() {
		return processorFactory;
	}

	public void setProcessorFactory(ProcessorFactory processorFactory) {
		this.processorFactory = processorFactory;
	}

	public String getDefaultTime() {
		return defaultTime;
	}

	public void setDefaultTime(String defaultTime) {
		this.defaultTime = defaultTime;
	}
	

    
    public boolean isPassProcess(Endpoint toEndpoint, MessageBO messageBo){
		if (serviceAgentMode == null) {
			throw new EAAPException("", ErrorDomain.ERROR_CODE_9999, "You must serviceAgentMode in config file first, and then restart the web server!");
		}
		if(messageBo.getServiceAgentMode()==null){
			messageBo.setServiceAgentMode(serviceAgentMode);
		}
		String endpointSpec = toEndpoint.getEndpointSpecCode();
		if("client".equals(serviceAgentMode)){
			if(messageBo.getServiceAgentServerAddress()==null){
				messageBo.setServiceAgentServerAddress(serviceAgentServerAddress);
			}
			//If mode is client, then just process prof endpoint.
			if(!EndpointSpec.PROF.equalsIgnoreCase(endpointSpec)){
				return true;
			}else{
				return false;
			}
		}
		if("server".equals(serviceAgentMode)){
			//If mode is server, then pass prof endpoint.
			if(EndpointSpec.PROF.equalsIgnoreCase(endpointSpec) && isRequestValid(messageBo.getReqTime(), messageBo.getSourceCode(), messageBo.getAuthCode())){
				LOG.debug("prof endpoint had processed in SA-client, so pass it!");
				return true;
			}else{
				return false;
			}
		}
		throw new EAAPException("", ErrorDomain.ERROR_CODE_9999, "You must check for serviceAgentMode in config file first, and then restart the web server, the value of serviceAgentMode value just can be server or client!");
    }
	
	public static boolean isRequestValid(Long reqTime, String sourceCode, String authCode) {
		String serviceAgentMode = "";
		if(ZKCfgCacheHolder.PROP_ITEMS.get("serviceAgent.mode") != null) {
			
			serviceAgentMode = ZKCfgCacheHolder.PROP_ITEMS.get("serviceAgent.mode").toString();
		}
		if("client".equals(serviceAgentMode)){
			return true;
		}
		long nowTime = System.currentTimeMillis();
		if(StringUtils.isEmpty(sourceCode) || StringUtils.isEmpty(authCode)){
			return false;
		}
		long reqValidTime = Long.valueOf(ZKCfgCacheHolder.PROP_ITEMS.get("serviceAgent.anthCode.validTime").toString());
		if(nowTime > reqTime + reqValidTime*1000){
			LOG.debug("Auth code is out of time!");
			return false;
		}
        if(!authCode.equals(strEncrypt(sourceCode, EAAPConstants.ENCODE_TYPE))){
        	LOG.debug("Invalid request!");
        	return false;
        }
		return true;
	}
	public static String strEncrypt(String sourceStr, String encodeType){
		try{
			MessageDigest md = MessageDigest.getInstance(encodeType);
	        byte[] b = md.digest(sourceStr.getBytes());//浜х敓鏁版嵁鐨勬寚绾�  
	        //Base64缂栫爜
	        return DigestUtils.md5Hex(Base64.encodeBase64String(b));
		}catch(NoSuchAlgorithmException e){
			LOG.error("Generate auth-code error!", e);
			return null;
		}
	}
}
