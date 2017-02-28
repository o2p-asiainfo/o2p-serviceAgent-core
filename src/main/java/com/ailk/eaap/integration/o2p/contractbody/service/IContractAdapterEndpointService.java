/** 
 * Project Name:serviceAgent-core 
 * File Name:IContractAdapterEndpointService.java 
 * Package Name:com.ailk.eaap.integration.o2p.contractbody.service 
 * Date:2015年4月13日下午2:30:31 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.integration.o2p.contractbody.service;  

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.TransformerRule;

/** 
 * ClassName:IContractAdapterEndpointService  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年4月13日 下午2:30:31  
 * @author   zhongming 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public interface IContractAdapterEndpointService {
	
	MessageBO<?> replaceContractAdapterEndpoint(MessageBO<?> bo, TransformerRule transformerRule);
	
}
