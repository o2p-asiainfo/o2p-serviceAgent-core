/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IFreeMarkerValidateService.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.protocol 
 * Date:2015年9月6日上午10:52:26 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.protocol;  
/** 
 * ClassName:IFreeMarkerValidateService  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年9月6日 上午10:52:26  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public interface IFreeMarkerValidateService {

	String validateHeader(String templateStr);
	
	String validateBody(String templateStr);
}
