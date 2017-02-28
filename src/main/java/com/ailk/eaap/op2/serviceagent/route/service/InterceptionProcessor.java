package com.ailk.eaap.op2.serviceagent.route.service;

import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;

public class InterceptionProcessor implements EndpointProcessor{

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg) {
		// TODO Auto-generated method stub
		Object regulartobj = endpoint.getAttrMap().get(EndpointAttr.regularexpression);
		Object reqOrrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
		if(regulartobj==null || reqOrrspObj==null){
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.sub_message_config_error);
		}else{
			String regular = regulartobj.toString();
			String repStr = CommonUtil.getMatchPatternStr(msg.toString(), regular);
			msg.setMsgBody(repStr);
		}
		return msg;
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

}
