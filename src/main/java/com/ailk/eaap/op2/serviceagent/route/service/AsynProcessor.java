package com.ailk.eaap.op2.serviceagent.route.service;

import org.apache.log4j.Logger;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;

public class AsynProcessor implements EndpointProcessor{

	private IQueueIHelper queueIHelper;
	private static final Logger log = Logger.getLogger(AsynProcessor.class);
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		
		try{
			queueIHelper.writeObj(msg);
		}catch(Exception e){
			log.error("write to queue error",e);
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.asyn_endpoint_error,e);
		}
		
		return msg;
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

	public IQueueIHelper getQueueIHelper() {
		return queueIHelper;
	}

	public void setQueueIHelper(IQueueIHelper queueIHelper) {
		this.queueIHelper = queueIHelper;
	}

}
