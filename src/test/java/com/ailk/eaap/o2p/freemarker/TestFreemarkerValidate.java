/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:TestFreemarkerValidate.java 
 * Package Name:com.ailk.eaap.o2p.freemarker 
 * Date:2015年9月6日下午1:56:01 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.freemarker;  

import com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate;
import com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerValidateServiceImpl;

/** 
 * ClassName:TestFreemarkerValidate  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年9月6日 下午1:56:01  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class TestFreemarkerValidate {

	public static void main(String[] args) {
		FreeMarkerValidateServiceImpl fvs = new FreeMarkerValidateServiceImpl();
		FreeMarkerTemplate ft = new FreeMarkerTemplate();
		fvs.setFreeMarkerTemplate(ft);
		String templateStr = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">                                                                                                                                                                           "+
				"   <soapenv:Body>                                                                                                                                                                                                                                                                                                                                         "+
				"      <ns1:queryServiceResponse soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns1=\"http://service.ws.crm.bss.linkage.com/\">                                                                                                                                                                                                     "+
				"         <queryServiceReturn xsi:type=\"xsd:string\">                                                                                                                                                                                                                                                                                                       "+
				"<![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?><ContractRoot><TcpCont><ActionCode>1</ActionCode><TransactionID>${messageBO.transactionID}</TransactionID><RspTime>${messageBO.rspTime}</RspTime><Response><RspType>${messageBO.rspType}</RspType><RspCode>${messageBO.EAAPException.code}</RspCode><RspDesc>${messageBO.EAAPException.msg}</RspDesc></Response></TcpCont></ContractRoot>]]>   "+
				"</queryServiceReturn>                                                                                                                                                                                                                                                                                                                                     "+
				"      </ns1:queryServiceResponse>                                                                                                                                                                                                                                                                                                                         "+
				"   </soapenv:Body>                                                                                                                                                                                                                                                                                                                                        "+
				"</soapenv:Envelope>                                                                                                                                                                                                                                                                                                                                       ";
		
		fvs.validateBody(templateStr);

	}

}
