package com.ailk.eaap.op2.serviceagent.route.service;

import org.dom4j.Document;

import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Sep 16, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class MapEnrichProcessor implements EndpointProcessor{
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		
		String  keyValues = (String)endpoint.getAttrMap().get(EndpointAttr.keyValue);
		String  reqOrrsp = (String)endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
		String keyValue[] = keyValues.split(",");
		
		if(reqOrrsp.equals(EOPDomain.REQ_FLAG)){
			for (int i = 0; i < keyValue.length; i++) {
				String kvs = keyValue[i];
				String kv[] = kvs.split(":");
				String key = kv[0];
				String value = kv[1];
				
				if(endpoint.getInDataTypeCode().equals(DataType.XML)){
					Document xmldoc = (Document) msg.getMsgBody();
					String str = xmldoc.selectSingleNode(value).getText();
					msg.getMsgHead().put(key, str);
				}else if (endpoint.getInDataTypeCode().equals(DataType.UrlGet)){
					msg.getMsgHead().put(key, msg.getMessageMap().get(value).toString());
				}
			}
		}else{
			for (int i = 0; i < keyValue.length; i++) {
				String kvs = keyValue[i];
				String kv[] = kvs.split(":");
				String key = kv[0];
				String value = kv[1];
				
				if(endpoint.getInDataTypeCode().equals(DataType.XML)){
					Document xmldoc = (Document) msg.getMsgBody();
					String str = xmldoc.selectSingleNode(value).getText();
					msg.getMsgHead().put(key, str);
				}
			}
		}
		return null;
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

}
