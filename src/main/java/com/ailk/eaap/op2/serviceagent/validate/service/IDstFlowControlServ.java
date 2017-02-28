package com.ailk.eaap.op2.serviceagent.validate.service;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.TechImpl;


public interface IDstFlowControlServ {

	void flowControl(TechImpl techImpl,MessageBO messageBo) ;
	void subtraThreadNum(TechImpl techImpl);
}
