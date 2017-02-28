package com.ailk.eaap.o2p;


import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;


public class HtClient {

	public  String sendReq(String method,String address,String msg,int timeout,String cer,String cerpwd){
		
		HttpMethod httpMethod = null;
		HttpClient httpClient = new HttpClient();
		String returnStr = "";
		try{
			if("POST".equalsIgnoreCase(method)){				
				httpMethod = new PostMethod(address);
				((PostMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg ));
			}
			else{

				httpMethod = new GetMethod(address);
			}
			
			
			httpClient.getParams().setConnectionManagerTimeout(timeout * 1000);
			httpClient.getParams().setSoTimeout(timeout * 1000);

			httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(0, false));
			
//			httpClient.getHostConfiguration().setProxy("10.1.228.168", Integer.parseInt("80"));  
			httpClient.getHostConfiguration().setProxy("10.1.234.61", Integer.parseInt("3128"));  
			httpClient.getParams().setAuthenticationPreemptive(true); 
			
			URL cerurl = this.getClass().getResource(cer);
			if(cerurl!=null){
				System.out.println("ccccccccc");
				System.out.println(cerurl.getFile().getBytes());
//				System.setProperty("javax.net.ssl.trustStore", cerurl.getFile());
//				System.setProperty("javax.net.ssl.trustStore", "d:/a1.cer");
//				System.setProperty("javax.net.ssl.trustStorePassword", cerpwd);
			}
			
			int statusCode = httpClient.executeMethod(httpMethod);
			
			Header[] rspHeads  = httpMethod.getResponseHeaders();
			
			returnStr = httpMethod.getResponseBodyAsString();
			
			System.out.println("status:"+statusCode);
			System.out.println(returnStr);
		}catch(ConnectException e){
			e.printStackTrace();

		}
		catch(SocketTimeoutException e){
			e.printStackTrace();
		}		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return returnStr;
	}
	public static void main(String[] args) {
	//	System.setProperty("java.awt.headless","true"); 
		String address = "https://209.200.152.62/";
		String address1 = "https://auth.alipay.com/login/index.htm";
		String address3 = "https://209.200.152.62/Netaxept/Register.aspx?customerAddress2=&updateStoredPaymentInfo=&customerTown=&transactionId=&templateData=%3CTemplateData++%3E&customerAddress1=&orderDescription=&customerNumber=&customerNotificationMode=&customerEmail=&autoSale=&terminalSinglePage=&transactionReconRef=&customerLastName=&recurringExpiryDate=&amount=2000&avtaleGiroAmountLimit=&terminalVat=&token=At6_q*J4&panHash=&customerCountry=&customerPostcode=&description=&avtaleGiroCompanyName=&deliveryDate=&merchantId=12001398&avtaleGiroAccountNumber=&feeList=&customerFirstName=&redirectUrl=http%3A%2F%2Fwww.baidu.com&DnBNorDirectPaymentMessage=&terminalLayout=&currencyCode=DKK&expiryDate=&customerPhoneNumber=&DnBNorDirectPaymentKID=&OS=&environmentLanguage=&terminalDesign=&force3DSecure=&serviceType=&avtaleGiroKid=&pan=&securityCode=&DnBNorDirectPaymentToAccount=&paymentMethodActionList=&recurringFrequency=&customerSocialSecurityNumber=&orderNumber=11111&autoAuth=&recurringType=&language=&customerCompanyName=";
		String address4="https://epayment-test.bbs.no/Netaxept/Register.aspx?customerAddress2=&updateStoredPaymentInfo=&customerTown=&transactionId=&templateData=%3CTemplateData++%3E&customerAddress1=&orderDescription=&customerNumber=&customerNotificationMode=&customerEmail=&autoSale=&terminalSinglePage=&transactionReconRef=&customerLastName=&recurringExpiryDate=&amount=2000&avtaleGiroAmountLimit=&terminalVat=&token=At6_q*J4&panHash=&customerCountry=&customerPostcode=&description=&avtaleGiroCompanyName=&deliveryDate=&merchantId=12001398&avtaleGiroAccountNumber=&feeList=&customerFirstName=&redirectUrl=http%3A%2F%2Fwww.baidu.com&DnBNorDirectPaymentMessage=&terminalLayout=&currencyCode=DKK&expiryDate=&customerPhoneNumber=&DnBNorDirectPaymentKID=&OS=&environmentLanguage=&terminalDesign=&force3DSecure=&serviceType=&avtaleGiroKid=&pan=&securityCode=&DnBNorDirectPaymentToAccount=&paymentMethodActionList=&recurringFrequency=&customerSocialSecurityNumber=&orderNumber=11111&autoAuth=&recurringType=&language=&customerCompanyName=";
		new HtClient().sendReq("get",address3, "", 3, "", "");
		System.setProperty("javax.net.ssl.trustStore", "d:/a11.cer");
		System.out.println(System.getProperty("javax.net.ssl.trustStore"));
	}
}
