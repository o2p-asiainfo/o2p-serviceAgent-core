/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IFlowControlService.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.validate.service 
 * Date:2015年8月4日上午9:48:04 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.validate.service;  

import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/** 
 * ClassName:IFlowControlService  
 * Date:     2015年8月4日 上午9:48:04  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public interface IFlowControlService {
	
	void flowControl(MessageBO<?> msg);
	void subtraThreadNum(String servId);
}
