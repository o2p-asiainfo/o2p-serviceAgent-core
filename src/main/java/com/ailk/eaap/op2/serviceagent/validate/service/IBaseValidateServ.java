package com.ailk.eaap.op2.serviceagent.validate.service;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;


public interface IBaseValidateServ {

	 MessageBO baseValidate(MessageBO messageBo);
	
	MessageBO legitimateValidate(MessageBO messageBo) ;
	
}
