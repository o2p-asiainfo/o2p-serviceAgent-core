/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:FreeMarkerValidateServiceImpl.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.protocol 
 * Date:2015年9月6日上午10:53:11 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.protocol;  

import net.sf.json.JSONObject;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.foundation.util.ExceptionUtils;


/** 
 * ClassName:FreeMarkerValidateServiceImpl  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年9月6日 上午10:53:11  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class FreeMarkerValidateServiceImpl implements
		IFreeMarkerValidateService {

	private static final Logger LOG = Logger.getLog(FreeMarkerValidateServiceImpl.class);
	
	private FreeMarkerTemplate freeMarkerTemplate;
	private static final String respCode = "RespCode";
	private static final String respDesc = "RespDesc";
	private MessageBO messageBo;
	
	
	public FreeMarkerValidateServiceImpl() {
		super();
		try {
			
			messageBo = new MessageBO();
			
			messageBo.setTransactionID("1000010000201508270003195524");
			messageBo.setRspTime("20150827110346");
			messageBo.setRspType("9");
			
			EAAPException ea = new EAAPException("12","9999","系统错误:枢纽内部数据库错误:writeAllTrace=-2", new NullPointerException());
			messageBo.setEAAPException(ea);
		} catch (NullPointerException e) {
			
			LOG.debug("exception mock",e);
		}
		
	}



	public void setFreeMarkerTemplate(FreeMarkerTemplate freeMarkerTemplate) {
		this.freeMarkerTemplate = freeMarkerTemplate;
	}



	@Override
	public String validateHeader(String templateStr) {
		JSONObject resultJson = new JSONObject();
		try {
			
			freeMarkerTemplate.buildHeader(templateStr, messageBo, "-100");
			
			resultJson.put(respCode, "0");
			resultJson.put(respDesc, "validate header template success");
		} catch(Exception e) {
			
			LOG.error("validateHeader template header error ", e);
			
			resultJson.put(respCode, "9");
			resultJson.put(respDesc, "validate header template error, cause:"+ExceptionUtils.populateExecption(e, 800));
		}
		
		return resultJson.toString();
	}


	@Override
	public String validateBody(String templateStr) {
		
		JSONObject resultJson = new JSONObject();
		
		try {
			
			freeMarkerTemplate.buildBody(templateStr, messageBo, "-200");
			
			resultJson.put(respCode, "0");
			resultJson.put(respDesc, "validate body template success");
		} catch(Exception e) {
			
			LOG.error("validateBody body template error ", e);
			
			resultJson.put(respCode, "9");
			resultJson.put(respDesc, "validate body template error, cause:"+ExceptionUtils.populateExecption(e, 800));
		}
		
		return resultJson.toString();
	}

}
