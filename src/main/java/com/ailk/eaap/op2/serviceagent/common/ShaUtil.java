/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:ShaUtil.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.common 
 * Date:2014年11月19日上午9:38:52 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.common;  

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

/** 
 * ClassName:ShaUtil  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年11月19日 上午9:38:52  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public final class ShaUtil {

	private ShaUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String sha224(String reqStr) throws NoSuchAlgorithmException {
		 // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-224");  
        // 执行摘要方法   
        byte[] digest = md.digest(reqStr.getBytes());  
        return new HexBinaryAdapter().marshal(digest); 
	}

	public static String sha256(String reqStr) throws NoSuchAlgorithmException {
		 // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
        // 执行摘要方法   
        byte[] digest = md.digest(reqStr.getBytes());  
        return new HexBinaryAdapter().marshal(digest); 
	}

	public static String sha384(String reqStr) throws NoSuchAlgorithmException {
		 // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-384");  
        // 执行摘要方法   
        byte[] digest = md.digest(reqStr.getBytes());  
        return new HexBinaryAdapter().marshal(digest); 
	}

	public static String sha512(String reqStr) throws NoSuchAlgorithmException {
		 // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-512");  
        // 执行摘要方法   
        byte[] digest = md.digest(reqStr.getBytes());  
        return new HexBinaryAdapter().marshal(digest); 
	}

}
