///** 
// * Project Name:o2p-serviceAgent-core 
// * File Name:HttpClient2.java 
// * Package Name:com.ailk.eaap.o2p 
// * Date:2015年5月4日下午6:06:27 
// * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
// * 
//*/  
//  
//package com.ailk.eaap.o2p;  
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.security.KeyManagementException;
//import java.security.KeyStore;
//import java.security.KeyStoreException;
//import java.security.NoSuchAlgorithmException;
//import java.security.UnrecoverableKeyException;
//import java.security.cert.CertificateException;
//
//import org.apache.commons.httpclient.cookie.CookiePolicy;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.params.ClientPNames;
//import org.apache.http.conn.scheme.Scheme;
//import org.apache.http.conn.ssl.SSLSocketFactory;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.commons.httpclient.HttpClient;
//import org.restlet.engine.http.HttpResponse;
//
///** 
// * ClassName:HttpClient2  
// * Function: TODO ADD FUNCTION.  
// * Reason:   TODO ADD REASON.  
// * Date:     2015年5月4日 下午6:06:27  
// * @author   wuwz 
// * @version   
// * @since    JDK 1.6 
// *    
// */
//public class HttpClient2 {
//
//	public static void main(String[] args) throws ClientProtocolException, IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, KeyManagementException, UnrecoverableKeyException {
//		DefaultHttpClient httpclient = new DefaultHttpClient();
//
//        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());   
//        FileInputStream instream = new FileInputStream(new File("D:/server.jks"));
//        try {
//            trustStore.load(instream, "password".toCharArray());
//        } finally {
//            instream.close();
//        }
//        
//        SSLSocketFactory socketFactory = new SSLSocketFactory(trustStore,"password",trustStore);
//        Scheme sch = new Scheme("https", socketFactory, 443);
//        httpclient.getConnectionManager().getSchemeRegistry().register(sch);
//
//        HttpGet httpget = new HttpGet("https://localhost:8443/");
//
//        System.out.println("executing request" + httpget.getRequestLine());
//        
//        HttpResponse response = httpclient.execute(httpget);
//        HttpEntity entity = response.getEntity();
//
//        System.out.println("----------------------------------------");
//        System.out.println(response.getStatusLine());
//        if (entity != null) {
//            System.out.println("Response content length: " + entity.getContentLength());
//        }
//        if (entity != null) {
//            entity.consumeContent();
//        }
//        httpclient.getConnectionManager().shutdown();   
//
//		}
//}
