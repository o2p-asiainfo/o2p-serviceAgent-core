package com.ailk.eaap.op2.serviceagent.route.service;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.RouteEndpoint;

public interface IRouteServ {

	MessageBO route(MessageBO messageBo) ;
	MessageBO route(String jsonMsg) ;
	MessageBO routeMsg(RouteEndpoint endpoint,MessageBO messageBo) ;
	
	Endpoint findCallBack(RouteEndpoint routeEndpoint,MessageBO messageBo) ;
	
	void callEndpoint(RouteEndpoint endpoint, MessageBO messageBo)  ;
}
