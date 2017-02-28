/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:a.java 
 * Package Name:com.ailk.eaap.o2p.freemarker 
 * Date:2015年8月31日上午11:42:26 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.o2p.freemarker;

import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * ClassName:a 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年8月31日 上午11:42:26 
 * 
 * @author wuwz
 * @version
 * @since JDK 1.6
 * 
 */
public class TestFreeMarker {
	private Configuration cfg;

	public void init() throws Exception {
		// 初始化FreeMarker配置
		// 创建一个Configuration实例
		cfg = new Configuration();
		String templateStr="<html>  "+
  "<head>  "+
      "  <title>freemarker测试</title>  "+
   " </head>  "+
   " <body>  "+
    "    <h1>${msg},${name}</h1>  "+
    "    <h2>${messageBo.apiname}</h2>  "+
    "    <h2>异常是：segmentSign ${messageBo.EAAPException}</h2>  "+
   " <h2>  code ${messageBo.EAAPException.code}</h2> "+
   "       <h2> msg ${messageBo.EAAPException.msg}</h2> "+
    "       <h2> stackTraceInfo ${messageBo.EAAPException.stackTraceInfo}</h2> "+
   " </body>  "+
"</html>  ";
		
		String templateStr3 = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">                                                                                                                                                                           "+
			"   <soapenv:Body>                                                                                                                                                                                                                                                                                                                                         "+
			"      <ns1:queryServiceResponse soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:ns1=\"http://service.ws.crm.bss.linkage.com/\">                                                                                                                                                                                                     "+
			"         <queryServiceReturn xsi:type=\"xsd:string\">                                                                                                                                                                                                                                                                                                       "+
			"<![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?><ContractRoot><TcpCont><ActionCode>1</ActionCode><TransactionID>${messageBO.transactionID}</TransactionID><RspTime>${messageBO.rspTime}</RspTime><Response><RspType>${messageBO.rspType}</RspType><RspCode>${messageBO.EAAPException.code}</RspCode><RspDesc>${messageBO.EAAPException.msg}</RspDesc></Response></TcpCont></ContractRoot>]]>   "+
			"</queryServiceReturn>                                                                                                                                                                                                                                                                                                                                     "+
			"      </ns1:queryServiceResponse>                                                                                                                                                                                                                                                                                                                         "+
			"   </soapenv:Body>                                                                                                                                                                                                                                                                                                                                        "+
			"</soapenv:Envelope>                                                                                                                                                                                                                                                                                                                                       ";
		
		
		StringTemplateLoader stringLoader = new StringTemplateLoader();
		
		String templateStr2 = "[{\"TransactionID\":\"${messageBO.srcReqTime}\",\"RspCode\":\"<#if messageBO.EAAPException.code==\'9049\'>9001<#else> ${messageBO.EAAPException.code} </#if>\",\"RspDesc\":\"<#if messageBO.EAAPException.code==\'9017\'> Request exceeds the traffic control <#elseif messageBO.EAAPException.code==\'9049\'> Caller authentication failed <#else> ${messageBO.EAAPException.msg} </#if>\",\"HTTPSTATUSCODE\":\"<#if messageBO.EAAPException.code==\'9049\'>401<#else></#if>\"}]";
		stringLoader.putTemplate("template1", templateStr2);
		stringLoader.putTemplate("template2", "Hello word!");
		// 设置FreeMarker的模版文件位置
		cfg.setTemplateLoader(stringLoader);
	}

	public void process() throws Exception {
		MessageBO msg = new MessageBO();
		msg.setTransactionID("1000010000201508270003195524");
		msg.setRspTime("20150827110346");
		msg.setRspType("9");
		msg.setSrcReqTime("20150827");
		
		EAAPException ea = new EAAPException("12","9017","系统错误:枢纽内部数据库错误:writeAllTrace=-2", new NullPointerException());
		msg.setEAAPException(ea);
		
		Map root = new HashMap();
		root.put("name", "FreeMarker!");
		root.put("msg", "您已经完成了第一个FreeMarker的示例");
		root.put("messageBO", msg);
		root.put("user", "hello word!");
		Template t = cfg.getTemplate("template1");
//		Template t2 = cfg.getTemplate("template2");1
		
		StringWriter sw = new StringWriter();
		t.process(root, sw);
		System.out.println(sw.toString());
		sw.close();
		System.out.println("===========================");
//		t2.process(root, new OutputStreamWriter(System.out));
	}

	public static void main(String[] args) throws Exception {
		TestFreeMarker hf = new TestFreeMarker();
		hf.init();
		hf.process();
//		MessageBO msg = new MessageBO();
//		msg.setMsgBody("");
//		if(!StringUtils.isEmpty(msg.toString())){
//			System.out.println("123");
//		}
	}
}
