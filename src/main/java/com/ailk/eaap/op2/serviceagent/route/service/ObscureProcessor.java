package com.ailk.eaap.op2.serviceagent.route.service;

import org.dom4j.Document;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Jul 17, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class ObscureProcessor implements EndpointProcessor{

	
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		Object reqorrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
		Object pathObj = endpoint.getAttrMap().get(EndpointAttr.Path);
		if(pathObj==null || reqorrspObj==null){
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.never_config_userinfo_path);
		}else{
			String reqorrsp = reqorrspObj.toString();
			String pathstr = pathObj.toString();
			
			String paths[] = pathstr.split(";");
			
			if(endpoint.getInDataTypeCode().equals(DataType.UrlGet)){
				
				for (int i = 0; i < paths.length; i++) {
					String path = paths[i];
					if(reqorrsp.equals(EOPDomain.REQ_FLAG)){
						String value = msg.getMessageMap().get(path).toString();
						
						msg.setMsgBody(msg.toString().replaceAll(path+"="+value, path+"="+"******"));
						
					}
					
				}
			}
			if(endpoint.getInDataTypeCode().equals(DataType.XML)){
				for (int i = 0; i < paths.length; i++) {
					String path = paths[i];
					Document doc = (Document) msg.getMsgBody();
					doc.selectSingleNode(path).setText("******");
					if(reqorrsp.equals(EOPDomain.REQ_FLAG)){
						msg.setMsgBody(doc);
					}
				}
			}
		}
		
		return null;
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

}
