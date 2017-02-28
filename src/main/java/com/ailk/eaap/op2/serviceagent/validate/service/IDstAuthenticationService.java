/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IDstAuthentication.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.validate.service 
 * Date:2016年3月7日下午4:07:44 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.validate.service;  

import java.security.NoSuchAlgorithmException;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.TechImpl;

/** 
 * ClassName:IDstAuthentication  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年3月7日 下午4:07:44  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public interface IDstAuthenticationService {

	void authen(TechImpl tech, MessageBO messageBo) throws NoSuchAlgorithmException;

	
}
