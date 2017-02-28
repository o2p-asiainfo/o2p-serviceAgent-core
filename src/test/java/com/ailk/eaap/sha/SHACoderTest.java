/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:a.java 
 * Package Name:com.ailk.eaap.sha 
 * Date:2014年11月17日上午10:24:44 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.sha;  
import java.security.MessageDigest;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

import net.sf.json.JSONObject;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;

import com.ailk.eaap.integration.o2p.contractbody.service.ContractBodyServiceImpl;
import com.ailk.eaap.integration.o2p.contractbody.util.ContractBodyUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.MsgParseUtil;
import com.ailk.eaap.op2.serviceagent.validate.service.EncryptSign;
  
/** 
 * 工具类 
 */  
public class SHACoderTest {  
    /** 
     * SHA-1消息摘要算法 
     */  
    public static String encodeSHA(byte[] data) throws Exception {  
        // 初始化MessageDigest,SHA即SHA-1的简称   
        MessageDigest md = MessageDigest.getInstance("SHA");  
        // 执行摘要方法   
        byte[] digest = md.digest(data);  
        return new HexBinaryAdapter().marshal(digest);  
    }  
  
    /** 
     * SHA-256消息摘要算法 
     */  
    public static String encodeSHA256(byte[] data) throws Exception {  
        // 初始化MessageDigest,SHA即SHA-1的简称   
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
        // 执行摘要方法   
        byte[] digest = md.digest(data);  
        return new HexBinaryAdapter().marshal(digest);  
    }  
  

    /** 
     * SHA-224消息摘要算法 
     */  
    public static String encodeSHA224(byte[] data) throws Exception {  
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-224");  
        // 执行摘要方法   
        byte[] digest = md.digest(data);  
        return new HexBinaryAdapter().marshal(digest);  
    }  
    
    /** 
     * SHA-384消息摘要算法 
     */  
    public static String encodeSHA384(byte[] data) throws Exception {  
        // 初始化MessageDigest,SHA即SHA-1的简称   
        MessageDigest md = MessageDigest.getInstance("SHA-384");  
        // 执行摘要方法   
        byte[] digest = md.digest(data);  
        return new HexBinaryAdapter().marshal(digest);  
    }  
  
    /** 
     * SHA-512消息摘要算法 
     */  
    public static String encodeSHA512(byte[] data) throws Exception {  
        // 初始化MessageDigest,SHA即SHA-1的简称   
        MessageDigest md = MessageDigest.getInstance("SHA-512");  
        // 执行摘要方法   
        byte[] digest = md.digest(data);  
        return new HexBinaryAdapter().marshal(digest);  
    }  
  
/** 
 * 测试类 
 */  
    public static void main(String[] args) throws Exception {  
       String testString="1";  
       System.out.println(SHACoderTest.encodeSHA(testString.getBytes()));  
//       System.out.println(SHACoder.encodeSHA224(testString.getBytes()));  
       System.out.println(SHACoderTest.encodeSHA256(testString.getBytes()));  
       System.out.println(SHACoderTest.encodeSHA384(testString.getBytes()));  
       System.out.println(SHACoderTest.encodeSHA512(testString.getBytes()));  
       
    }  
    
 
    @Test
	public void getMsgByXmlPath() throws DocumentException {
    	String reqXml = "<ContractRoot>                                                      "+
    			"<TcpCont>                                                           "+
    			"<TransactionID>1000000083201311020128223875</TransactionID>         "+
    			"<AppKey>1005</AppKey>                                               "+
    			"<Method>test.PackageOrder</Method>                                  "+
    			"<Version>1.0</Version>                                              "+
    			"<Sign>1000000047</Sign>                                             "+
    			"<ReqTime>20131102102255</ReqTime>                                   "+
    			"</TcpCont>                                                          "+
    			"<SvcCont1>                                                          "+
    			"<ORDER_ID>20140716150600</ORDER_ID>                                 "+
    			"<PHONE_NUM>13331149809</PHONE_NUM>                                  "+
    			"<OFFER_CODE>1001</OFFER_CODE>                                       "+
    			"<OFFER_NAME>10元流量包</OFFER_NAME>                                 "+
    			"<ORDER_DATE>201407161507</ORDER_DATE>                               "+
    			"</SvcCont1>                                                         "+
    			"</ContractRoot>                                                     ";
        String path = "/ContractRoot";
        Document dom = DocumentHelper.parseText(reqXml);
        MessageBO mb = new MessageBO();
        mb.setMsgBody(dom);
        String str = MsgParseUtil.getMsgByPath(mb, path);
        System.out.println(str);
	}
    
    @Test
   	public void getMsgByXmlPath2() throws DocumentException {
       	String reqXml = "<RequestBody>"+
       					"	<MainOfferCode>PQZ</MainOfferCode>"+
       					"</RequestBody>                                                     ";
           String path = "/RequestBody/MainOfferCode";
           Document dom = DocumentHelper.parseText(reqXml);
           MessageBO mb = new MessageBO();
           mb.setMsgBody(dom);
           String str = MsgParseUtil.getMsgByPath(mb, path);
           System.out.println(str);
   	}

    @Test
	public void getMsgByJsonPath() throws DocumentException {
    	String reqXml = " {                                                              "+
    			"     \"store\": {                                               "+
    			"         \"book\": [                                            "+
    			"             {                                                  "+
    			"                 \"category\": \"reference\",                   "+
    			"                 \"author\": \"Nigel Rees\",                    "+
    			"                 \"title\": \"Sayings of the Century\",         "+
    			"                 \"price\": 8.95                                "+
    			"             },                                                 "+
    			"             {                                                  "+
    			"                 \"category\": \"fiction\",                     "+
    			"                 \"author\": \"Evelyn Waugh\",                  "+
    			"                 \"title\": \"Sword of Honour\",                "+
    			"                 \"price\": 12.99                               "+
    			"             },                                                 "+
    			"             {                                                  "+
    			"                 \"category\": \"fiction\",                     "+
    			"                 \"author\": \"Herman Melville\",               "+
    			"                 \"title\": \"Moby Dick\",                      "+
    			"                 \"isbn\": \"0-553-21311-3\",                   "+
    			"                 \"price\": 8.99                                "+
    			"             },                                                 "+
    			"             {                                                  "+
    			"                 \"category\": \"fiction\",                     "+
    			"                 \"author\": \"J. R. R. Tolkien\",              "+
    			"                 \"title\": \"The Lord of the Rings\",          "+
    			"                 \"isbn\": \"0-395-19395-8\",                   "+
    			"                 \"price\": 22.99                               "+
    			"             }                                                  "+
    			"         ],                                                     "+
    			"         \"bicycle\": {                                         "+
    			"             \"color\": \"red\",                                "+
    			"             \"price\": 19.95                                   "+
    			"         }                                                      "+
    			"     }                                                          "+
    			" }                                                              ";
        String path = "$.store.book";
        JSONObject json = JSONObject.fromObject(reqXml);
        MessageBO mb = new MessageBO();
        mb.setMsgBody(json);
        String str = MsgParseUtil.getMsgByPath(mb, path);
        System.out.println(str);
	}
    
    @Test
  	public void getMsgByJsonPath1() throws DocumentException {
      	String reqXml = "{ \"MainOfferCode\" : \"PQZ\" }";
          String path = "$.MainOfferCode";
          JSONObject json = JSONObject.fromObject(reqXml);
          MessageBO mb = new MessageBO();
          mb.setMsgBody(json);
          String str = MsgParseUtil.getMsgByPath(mb, path);
          System.out.println(str);
  	}
    
    @Test
   	public void getExprValXml() throws DocumentException {
    	
    	MessageBO mb = new MessageBO();
    	mb.getMsgHead().put("name", "zhangsan");
    	
    	String exp = "msgHead['name']";
    	String str = ContractBodyUtil.getExprVal(mb, exp).toString();
    	System.out.println(str);
    }
    

    @Test
   	public void encrypt() throws DocumentException {
    	
    	MessageBO mb = new MessageBO();
    	mb.getMsgHead().put("name", "zhangsan");
    	String reqXml = "<ContractRoot>                                                      "+
    			"<TcpCont>                                                           "+
    			"<TransactionID>1000000083201311020128223875</TransactionID>         "+
    			"<AppKey>1005</AppKey>                                               "+
    			"<Method>test.PackageOrder</Method>                                  "+
    			"<Version>1.0</Version>                                              "+
    			"<Sign>1000000047</Sign>                                             "+
    			"<ReqTime>20131102102255</ReqTime>                                   "+
    			"</TcpCont>                                                          "+
    			"<SvcCont1>                                                          "+
    			"<ORDER_ID>20140716150600</ORDER_ID>                                 "+
    			"<PHONE_NUM>13331149809</PHONE_NUM>                                  "+
    			"<OFFER_CODE>1001</OFFER_CODE>                                       "+
    			"<OFFER_NAME>10元流量包</OFFER_NAME>                                 "+
    			"<ORDER_DATE>201407161507</ORDER_DATE>                               "+
    			"</SvcCont1>                                                         "+
    			"</ContractRoot>                                                     ";
        String path = "/ContractRoot/TcpCont/TransactionID";
        Document dom = DocumentHelper.parseText(reqXml);
        mb.setMsgBody(dom);
    	String exp = "msgHead['name']&&/ContractRoot/TcpCont/TransactionID&&/ContractRoot/SvcCont1";
    	
    	String str = EncryptSign.encrypt(EOPDomain.SHA256, "", "", mb, exp);
    	System.out.println(str);
    }
    
    @Test
   	public void msgBody() throws DocumentException {
    	MessageBO mb = new MessageBO();
    	String reqXml = "<ContractRoot>                                                      "+
    			"<TcpCont>                                                           "+
    			"<TransactionID>1000000083201311020128223875</TransactionID>         "+
    			"<AppKey>1005</AppKey>                                               "+
    			"<Method>test.PackageOrder</Method>                                  "+
    			"<Version>1.0</Version>                                              "+
    			"<Sign>1000000047</Sign>                                             "+
    			"<ReqTime>20131102102255</ReqTime>                                   "+
    			"</TcpCont>                                                          "+
    			"<SvcCont1>                                                          "+
    			"<ORDER_ID>20140716150600</ORDER_ID>                                 "+
    			"<PHONE_NUM>13331149809</PHONE_NUM>                                  "+
    			"<OFFER_CODE>1001</OFFER_CODE>                                       "+
    			"<OFFER_NAME>10元流量包</OFFER_NAME>                                 "+
    			"<ORDER_DATE>201407161507</ORDER_DATE>                               "+
    			"</SvcCont1>                                                         "+
    			"</ContractRoot>                                                     ";
        Document dom = DocumentHelper.parseText(reqXml);
//        mb.setMsgBody(dom);
        mb.setMsgBody("1");
        String exp = "msgBody";
    	
        String str = EncryptSign.encrypt(EOPDomain.SHA256, "", "", mb, exp);
        System.out.println(str);
//        OgnlContext context = new OgnlContext();
//		context.put("messageBO", mb);
//		try {
//			Document o = (Document)Ognl.getValue(exp, mb);
//			System.out.println(o.asXML());
//		} catch (OgnlException e) {
//			 		}

    	
    }
    
    @Test
   	public void soap() throws DocumentException {
       	String reqXml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://webservice.exe.inter.crm.asiainfo.com\">  "+
       		"<soapenv:Header/>                                                                                                                      "+
       		"<soapenv:Body>                                                                                                                         "+
       		"<RequestHead xmlns = \"http://soa.ailk.telenor.com/wsdl/soa/\">                                                                          "+
       		"<AppKey xmlns=\"\">8000920001</AppKey>                                                                                                   "+
       		"<TransactionID>8000920001201312310000001111</TransactionID>                                                                            "+
       		"<ReqTime>20140721143815</ReqTime>                                                                                                      "+
       		"<Sign>password</Sign>                                                                                                                  "+
       		"<TenantId>TenantId</TenantId>                                                                                                          "+
       		"<AcceptChannelType>?</AcceptChannelType>                                                                                               "+
       		"<AcceptChannelCode>?</AcceptChannelCode>                                                                                               "+
       		"</RequestHead>                                                                                                                         "+
       		"<RequestBody>                                                                                                                          "+
       		"<CurrentSubEvents>                                                                                                                     "+
       		"<CurrentSubEvent>                                                                                                                      "+
       		"<SubscriberId>10072046062</SubscriberId>                                                                                               "+
       		"<EventCd>0</EventCd>                                                                                                                   "+
       		"<EventDttm>2014-11-16 17:45:40.123</EventDttm>                                                                                         "+
       		"<EventValueAmt>1234.62</EventValueAmt>                                                                                                 "+
       		"</CurrentSubEvent>                                                                                                                     "+
       		"</CurrentSubEvents>                                                                                                                    "+
       		"</RequestBody>                                                                                                                         "+
       		"</soapenv:Body>                                                                                                                        "+
       		"</soapenv:Envelope>                                                                                                                    "+
       		"                                                                                                                                       ";
           Document dom = DocumentHelper.parseText(reqXml);
           Element root = dom.getRootElement();
   		String pre = root.getNamespacePrefix();
   		if("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='RequestHead']/*[local-name()='AppKey']".contains(pre)) {
   			System.out.println(pre);
   		}
//           dom.getRootElement().selectSingleNode("/soapenv:Envelope/soapenv:Body");
           System.out.println(dom.getRootElement().selectSingleNode("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='RequestHead']/*[local-name()='AppKey']").asXML());
   	}
}  
