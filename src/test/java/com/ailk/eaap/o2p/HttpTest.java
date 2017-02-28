/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:HttpTest.java 
 * Package Name:com.ailk.eaap.o2p 
 * Date:2014年10月16日下午4:31:31 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p;  

import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang.StringUtils;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.StringUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.HttpClientUtil;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/** 
 * ClassName:HttpTest  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年10月16日 下午4:31:31  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class HttpTest {
	private static HttpClient httpClient = new HttpClient();
	
	/**
	 * @param address
	 * @param reqHead
	 * @param msg
	 * @param contentType
	 * @param method
	 * @param timeout 超时时间以秒为单位
	 * @return
	 * @throws IOException 
	 * @throws HttpException 
	 * @throws CSBException
	 */
	public static String sendRequest(String address) throws HttpException, IOException{		
		
		HttpMethod httpMethod = null;
		
		String returnStr = "";

		httpMethod = new GetMethod(address);

		

		httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(0, false));
		
		
		//调用远端的HTTP服务
		int statusCode = httpClient.executeMethod(httpMethod);
		
		
		returnStr = StringUtil.getString(httpMethod.getResponseBodyAsStream(), EOPDomain.CHARSET_UTF8);

		System.out.println(returnStr);
		return returnStr;
	}
	
	public static void  main(String[] args) throws HttpException, EAAPException, IOException {
//		sendRequest("https://test.epayment.nets.eu/Netaxept/Query.aspx?transactionId=9885d30ffe61415aad4b63d63bdb3e42&token=At6_q*J4&merchantid=12001398");
//		String address = "http://www.baidu.com";
//		String address1 = "https://auth.alipay.com/login/index.htm";
//		String address3 = "https://209.200.152.62/Netaxept/Register.aspx?customerAddress2=&updateStoredPaymentInfo=&customerTown=&transactionId=&templateData=%3CTemplateData++%3E&customerAddress1=&orderDescription=&customerNumber=&customerNotificationMode=&customerEmail=&autoSale=&terminalSinglePage=&transactionReconRef=&customerLastName=&recurringExpiryDate=&amount=2000&avtaleGiroAmountLimit=&terminalVat=&token=At6_q*J4&panHash=&customerCountry=&customerPostcode=&description=&avtaleGiroCompanyName=&deliveryDate=&merchantId=12001398&avtaleGiroAccountNumber=&feeList=&customerFirstName=&redirectUrl=http%3A%2F%2Fwww.baidu.com&DnBNorDirectPaymentMessage=&terminalLayout=&currencyCode=DKK&expiryDate=&customerPhoneNumber=&DnBNorDirectPaymentKID=&OS=&environmentLanguage=&terminalDesign=&force3DSecure=&serviceType=&avtaleGiroKid=&pan=&securityCode=&DnBNorDirectPaymentToAccount=&paymentMethodActionList=&recurringFrequency=&customerSocialSecurityNumber=&orderNumber=11111&autoAuth=&recurringType=&language=&customerCompanyName=";
//		String address4="https://epayment-test.bbs.no/Netaxept/Register.aspx?customerAddress2=&updateStoredPaymentInfo=&customerTown=&transactionId=&templateData=%3CTemplateData++%3E&customerAddress1=&orderDescription=&customerNumber=&customerNotificationMode=&customerEmail=&autoSale=&terminalSinglePage=&transactionReconRef=&customerLastName=&recurringExpiryDate=&amount=2000&avtaleGiroAmountLimit=&terminalVat=&token=At6_q*J4&panHash=&customerCountry=&customerPostcode=&description=&avtaleGiroCompanyName=&deliveryDate=&merchantId=12001398&avtaleGiroAccountNumber=&feeList=&customerFirstName=&redirectUrl=http%3A%2F%2Fwww.baidu.com&DnBNorDirectPaymentMessage=&terminalLayout=&currencyCode=DKK&expiryDate=&customerPhoneNumber=&DnBNorDirectPaymentKID=&OS=&environmentLanguage=&terminalDesign=&force3DSecure=&serviceType=&avtaleGiroKid=&pan=&securityCode=&DnBNorDirectPaymentToAccount=&paymentMethodActionList=&recurringFrequency=&customerSocialSecurityNumber=&orderNumber=11111&autoAuth=&recurringType=&language=&customerCompanyName=";
//		String address5 = "https://staging.tapstorm.com/api/v1/orders ";
//		String address6 = "https://uat.ws2.rki.dk/aksopen.asmx";
//		String returnxml = HttpClientUtil.sendRequest(new MessageBO(), address4, new HashMap(), null, null, InType.get, 1, 
//				null, null, null, null, null);
//		String proxyIP = "10.1.234.61";
//		String proxyPort = "3128";
		String address6 = "http://aksale.advs.jp";
		String proxyIP = null;
		String proxyPort = null;
		String trustStore = "file:/d:/Java/jdk1.6.0_43/jre/lib/security/cacerts";
		String trustPwd="changeit";
//		String returnxml = HttpClientUtil.sendRestOrHttpRequest(new MessageBO(), address6, new HashMap(), null, null, InType.get, 1, null, null, null, proxyIP, proxyPort, trustStore, trustPwd, null, null, 443, "HTTP");
//		System.out.println(returnxml);
//		
//		System.out.println(StringUtils.isEmpty(""));
//		String returnxml = HttpClientUtil.sendRequest(new MessageBO(), address4, new HashMap(), null, null, InType.get, 1, 
//				null, null, null, null, null);
//		System.out.println(returnxml);
	}
}
