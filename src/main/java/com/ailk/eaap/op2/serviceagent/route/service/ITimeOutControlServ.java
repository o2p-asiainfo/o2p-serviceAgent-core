package com.ailk.eaap.op2.serviceagent.route.service;

import com.ailk.eaap.op2.bo.TechImpl;

public interface ITimeOutControlServ {

	void timeOutControl(TechImpl techImpl) ;
	
	void changeTechImplState(String sertechId) ;
}
