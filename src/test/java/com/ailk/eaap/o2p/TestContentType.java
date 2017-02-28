/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:TestContentType.java 
 * Package Name:com.ailk.eaap.o2p 
 * Date:2015年9月14日下午9:40:46 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p;  

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/** 
 * ClassName:TestContentType  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年9月14日 下午9:40:46  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class TestContentType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MessageBO messageBo = new MessageBO();
		messageBo.setMsgBody("<>");
		messageBo.getMsgHead().put("Content-Type", "xml");
		if(StringUtils.isEmpty(messageBo.toString())) {
			
			messageBo.getMsgHead().remove("content-type");
			messageBo.getMsgHead().remove("Content-Type");
		} else if(!messageBo.getMsgHead().containsKey("content-type") &&
				!messageBo.getMsgHead().containsKey("Content-Type")) {
					
			addDefaultHeader(messageBo, messageBo.getMsgHead());
		}
	}
	
	private static void addDefaultHeader(MessageBO messageBo, Map<String, Object> msgHead) {
		
		String contentType = EOPDomain.CONTENT_TYPE_PLAIN_UTF8;
		
		if(messageBo.toString().trim().startsWith("<")) {
			
			contentType = EOPDomain.CONTENT_TYPE_XML_UTF8;
		} else if (messageBo.toString().trim().startsWith("{")) {
			
			contentType = EOPDomain.CONTENT_TYPE_JSON_UTF8;
		}
		
		msgHead.put("Content-Type", contentType);
	}


}
