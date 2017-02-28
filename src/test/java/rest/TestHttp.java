/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:TestHttp.java 
 * Package Name:rest 
 * Date:2014年10月23日上午9:25:05 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package rest;  

import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;

import com.ailk.eaap.op2.serviceagent.common.EOPDomain;

/** 
 * ClassName:TestHttp  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年10月23日 上午9:25:05  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class TestHttp {
	private static HttpClient httpClient = new HttpClient();

	public static void main(String[] args) throws HttpException, IOException {
		// TODO Auto-generated method stub
		new TestHttp().httpPost("http://localhost:9878/serviceAgent/rest/testmvno/post");
	}

	public void httpReq(String address) throws HttpException, IOException {
		HttpMethod httpMethod = new GetMethod(address);
		HttpClient httpClient = new HttpClient();
		httpMethod.addRequestHeader("user-agent", "Mozilla/4.0");	
		//调用远端的HTTP服务
		int statusCode = httpClient.executeMethod(httpMethod);
		if(!(statusCode+"").startsWith("2")){
			System.out.println("===================="+statusCode);
		}
		Header[] rspHeads  = httpMethod.getResponseHeaders();
		
		if(rspHeads != null){
			for(Header header : rspHeads) {
				System.out.println(header);
			}
		}
	}
		
	public void httpPost(String address) throws HttpException, IOException {
		PostMethod httpMethod = new PostMethod(address);
		HttpClientParams hmp = new HttpClientParams();
//		NameValuePair[] postData = new NameValuePair[2];  
//        postData[0] = new NameValuePair("action", "crawLocal");  
//        postData[1] = new NameValuePair("data", "dd");
//        httpMethod.addParameters(postData);  
		
		httpMethod.setRequestEntity(new StringRequestEntity("action=crawLocal&data=dd", "text/xml;charset=UTF-8", EOPDomain.CHARSET_UTF8));
		httpMethod.addRequestHeader("appkey", "2e2532bdd5d4c181c5ba744dffffcb83");
		httpMethod.addRequestHeader("transactionid", "8000040001201406201931211007");
		httpMethod.addRequestHeader("sign", "8d0d4f0d20dc3710781e544d1ee7f8b0c885ba1b8dc14480ff19b084f8e1050c");
		httpMethod.addRequestHeader("Accept", "application/xml");
		httpMethod.setRequestBody("<RequestBody><ICC>1234123412341234123</ICC><MainOfferCode>PQZ</MainOfferCode><AddOnOfferCodes>VOICEMAIL</AddOnOfferCodes>"
				+"<AddOnOfferCodes>MMS</AddOnOfferCodes><AddOnOfferCodes>LTE</AddOnOfferCodes>"
				+"</RequestBody>");
		
		for(int i=0; i<1000; i++)
		httpClient.executeMethod(httpMethod);
	}	

}
