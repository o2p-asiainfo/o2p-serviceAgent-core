/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IProofService.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.validate.service 
 * Date:2015年7月28日下午3:31:31 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.validate.service;  

import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.exception.MemcachedException;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/** 
 * ClassName:IProofService  
 * Date:     2015年7月28日 下午3:31:31  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public interface IProofService {
	void authen(MessageBO<?> messageBo) throws TimeoutException, InterruptedException, MemcachedException;
}
