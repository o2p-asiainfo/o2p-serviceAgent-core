/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:NodeParseUtil.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.common 
 * Date:2014年11月18日下午4:18:53 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.common;  

import net.sf.json.JSONObject;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.tree.DefaultElement;

import com.ailk.eaap.integration.o2p.contractbody.util.ContractBodyUtil;
import com.ailk.eaap.op2.common.O2pDocumentHelper;
import com.asiainfo.foundation.exception.BusinessException;
import com.jayway.jsonpath.JsonPath;

/** 
 * ClassName:MsgParseUtil  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年11月18日 下午4:18:53  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public final class MsgParseUtil {

	private MsgParseUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String getMsgByPath(MessageBO messageBo, String path) {
		
		if(path.startsWith("//") || path.startsWith("/")) {
			if(messageBo.getMsgBody() != null) {
				Document doc = null;
				if(messageBo.getMsgBody() instanceof Document) {
					
					doc = (Document)messageBo.getMsgBody();
				} else {
					
					try {
						
						doc = O2pDocumentHelper.parseText(messageBo.toString());
					} catch(DocumentException e) {
						
						throw new BusinessException(9241, "o2p-serviceagent-core.9241", new String[]{messageBo.toString()}, e);
					} 
				}
				if(doc != null) {
					
					Object object = doc.selectObject(path);
					if(object instanceof DefaultElement) {
						return ((DefaultElement)object).asXML();
					}
				}
				
			}
			
		} else if(path.startsWith("$.") ) {
			if(messageBo.getMsgBody() != null) {
				Object jo = JsonPath.read(((JSONObject)messageBo.getMsgBody()).toString(), path);
				return jo.toString();
			}
			
		} else {
			Object o = ContractBodyUtil.getExprVal(messageBo, path);
			if(o instanceof Document) {
				Document msgDoc = (Document)o;
				return msgDoc.getRootElement().asXML();
			} else if(o instanceof JSONObject) {
				JSONObject msgJson = (JSONObject)o;
				return msgJson.toString();
			} else if(o instanceof String){
				return (String)o;
			}
		}
		
		return "";
		
	}
	
}
