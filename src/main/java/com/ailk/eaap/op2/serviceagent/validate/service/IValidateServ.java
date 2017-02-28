package com.ailk.eaap.op2.serviceagent.validate.service;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.ContractVersion;


public interface IValidateServ {

	MessageBO validate( MessageBO messageBo,ContractVersion contractVersion,String reporres)	;
}
