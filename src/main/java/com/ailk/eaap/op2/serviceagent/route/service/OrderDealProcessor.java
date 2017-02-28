package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.Map;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.orderdeal.OrderDeal;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.linkage.rainbow.util.spring.SpringBeanInvoker;

public class OrderDealProcessor implements EndpointProcessor{

	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	public void clear() {
	}
	
	public MessageBO process(Endpoint endpoint, MessageBO msg){
		Map<String , Object> attrMap = endpoint.getAttrMap();
		String beanPath =  (String)attrMap.get(EndpointAttr.ORDER_DEAL_BEAN);
		OrderDeal orderDealObj = (OrderDeal)SpringBeanInvoker.getBean(beanPath);
		orderDealObj.deal(msg);
		return msg;
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
	}
	
}
