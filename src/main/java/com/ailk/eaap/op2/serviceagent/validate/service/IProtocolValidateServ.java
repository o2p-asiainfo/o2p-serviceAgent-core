package com.ailk.eaap.op2.serviceagent.validate.service;


import java.util.List;

import org.dom4j.Document;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.NodeDesc;


public interface IProtocolValidateServ {

	void validateSize(MessageBO<?> messageBo) ;
	
	void initComponentByAppKey(MessageBO<?> messageBo) ;
	
	void initComponentBySrcCode(MessageBO<?> messageBo) ;

	String getContractVersionKey(MessageBO<?> messageBo, String resourceAliss, String soapOperationName) ;

	Document getDocument(String reqXml) ;

	void xmlParse(MessageBO<?> messageBo,
			List<NodeDesc> nodeDescList) ;

	void jsonParse(MessageBO<?> messageBo,
			List<NodeDesc> nodeDescList) ;

	void mapParse(MessageBO<?> messageBo,
			List<NodeDesc> nodeDescList) ;

	void checkNeedNode(MessageBO<?> messageBo,
			List<NodeDesc> nodeDescList);

}
