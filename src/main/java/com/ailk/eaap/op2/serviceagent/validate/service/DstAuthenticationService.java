/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:DstAuthentication.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.validate.service 
 * Date:2016年3月7日下午4:12:23 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.validate.service;  

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;

import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.O2pDocumentHelper;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.MsgParseUtil;
import com.ailk.eaap.op2.serviceagent.common.ShaUtil;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.ProofEffect;
import com.ailk.eaap.op2.bo.TechImpl;
import com.linkage.rainbow.util.StringUtil;

/** 
 * ClassName:DstAuthentication  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年3月7日 下午4:12:23  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
@org.springframework.stereotype.Service(value="dstAuthenticationService")
public class DstAuthenticationService implements IDstAuthenticationService {

	private static final Logger LOG = Logger.getLog(DstAuthenticationService.class);
	
	@Override
	public void authen(TechImpl tech, MessageBO messageBo) throws NoSuchAlgorithmException {

		List<ProofEffect> list = tech.getProofEffectList();
		if(list != null && list.size() > 0) {
			
			for(ProofEffect pe : list) {
				
				String pfCode = pe.getProofCode();
				
				if(LOG.isDebugEnabled()) {
					
					LOG.debug("====> Authentication type:"+pfCode);
				}
				if("psdSign".equals(pfCode) || "password sign".equals(pfCode)) {
					
					DigitalSignature(pe, messageBo);
				}
			}
		}
	}

private void DigitalSignature(ProofEffect pe, MessageBO messageBo) throws NoSuchAlgorithmException {
		
		if(LOG.isDebugEnabled()) {
			
			LOG.debug("====> Authentication attrs:"+pe.getAtts().toString());
		}
		String encryptType = EOPDomain.MD5;
		String encryptKey = "";
		String appKey = "";
		Object encryptTypeObj = pe.getAtts().get(EndpointAttr.encrtyptType);
		if(encryptTypeObj != null) {
			
			encryptType = encryptTypeObj.toString();
		}
		
		Object keyObj = pe.getAtts().get(EndpointAttr.encryptkey);
		if(keyObj != null) {
			
			encryptKey = keyObj.toString();
		}
		
		Object appKeyObj = pe.getAtts().get(EndpointAttr.appkey);
		if(appKeyObj != null) {
			
			appKey = appKeyObj.toString();
		}
		
		//default express :{AppKey}{msgBody}{ReqTimeStamp}key
		String express = "appKey&&msgBody&&msgHead['reqtimestamp']";
		Object expressObj = pe.getAtts().get(EndpointAttr.express);
		if(expressObj != null) {
			
			express = expressObj.toString();
		}
		
		Timestamp tt = new Timestamp(System.currentTimeMillis());
		messageBo.getMsgHead().put("reqtimestamp", tt.toString());
		
		messageBo.setAppKey(appKey);
		messageBo.getMessageMap().remove(InType.APPKEY);
		messageBo.getMsgHead().remove(InType.APPKEY);
		messageBo.getMessageMap().remove(InType.SrcSysCode);
		messageBo.getMsgHead().remove(InType.SrcSysCode);
		
		messageBo.getMsgHead().put(InType.APPKEY, appKey);
		String[] paths = express.split("&&");
		
		changeMsgBody(messageBo);
		StringBuffer sb = new StringBuffer();
		for(String subPath : paths) {
			if(!StringUtils.isEmpty(subPath)) {
			
				sb.append(MsgParseUtil.getMsgByPath(messageBo, subPath));
			}
		}
			
		
		String beforeMessage = sb.toString()+encryptKey;
		if(LOG.isDebugEnabled()) {
			
			LOG.debug("====> Authentication message:"+beforeMessage);
		}
		if (encryptType.equalsIgnoreCase(EOPDomain.MD5)) {
			messageBo.getMsgHead().put("sign",StringUtil.Md5(beforeMessage));
		} else if(encryptType.equalsIgnoreCase(EOPDomain.SHA256)) {
			messageBo.getMsgHead().put("sign",ShaUtil.sha256(beforeMessage));
		}else if(encryptType.equalsIgnoreCase(EOPDomain.SHA384)) {
			messageBo.getMsgHead().put("sign",ShaUtil.sha384(beforeMessage));
		}else if(encryptType.equalsIgnoreCase(EOPDomain.SHA512)) {
			messageBo.getMsgHead().put("sign",ShaUtil.sha512(beforeMessage));
		}
	}

	private void changeMsgBody(MessageBO messageBo) {
		if(messageBo.toString().startsWith("<")) {
			
			if(messageBo.getMsgBody() instanceof Document){
				
				Document doc = (Document)messageBo.getMsgBody();
				messageBo.setMsgBody(doc.getRootElement().asXML());
			} else if(messageBo.getMsgBody() instanceof String) {
				
				try {
					
					messageBo.setMsgBody(O2pDocumentHelper.parseText(messageBo.toString()).getRootElement().asXML());
				} catch(DocumentException e) {
					
					throw new BusinessException(9241, "o2p-serviceagent-core.9241", new String[]{messageBo.toString()}, e);
				} 
			}
		}
	}
}
