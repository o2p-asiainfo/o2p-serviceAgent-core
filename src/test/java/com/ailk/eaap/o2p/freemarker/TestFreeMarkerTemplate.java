/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:TestFreeMarkerTemplate.java 
 * Package Name:com.ailk.eaap.o2p.freemarker 
 * Date:2015年9月1日下午8:11:57 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.freemarker;  

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate;
import com.ailk.eaap.op2.serviceagent.protocol.IFreeMarkerTemplate;
import com.ailk.eaap.op2.bo.Template;
/** 
 * ClassName:TestFreeMarkerTemplate  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年9月1日 下午8:11:57  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class TestFreeMarkerTemplate {

	public static void main(String[] args) {

		IFreeMarkerTemplate ft = new FreeMarkerTemplate();
		
		MessageBO messageBo = new MessageBO();
		EAAPException ea = new EAAPException("12","9017","系统错误:枢纽内部数据库错误:writeAllTrace=-2", new NullPointerException());
//		messageBo.setEAAPException(ea);
		Template templateBean = new Template();
		String body = "<html>  "+
				  "<head>  "+
			      "  <title>freemarker测试</title>  "+
			   " </head>  "+
			   " <body>  "+
			    "    <h2>${messageBO.apiname}</h2>  "+
			   " </body>  "+
			"</html>  ";
		messageBo.setApiname("TDC-api");
		
		templateBean.setTemplateBody(body);
		ft.buildTemplate(messageBo, templateBean, 1);
		
		System.out.println(messageBo.toString());
		
		templateBean.setTemplateHeader("[{\"HTTPSTATUSCODE\":\"<#if '9016'=='9017'> Request exceeds the traffic control</#if>\"}]");
		ft.buildTemplate(messageBo, templateBean, 1);
	}

}
