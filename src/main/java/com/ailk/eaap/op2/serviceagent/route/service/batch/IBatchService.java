/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IBatchService.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2015年1月25日下午4:44:46 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch;  

import com.ailk.eaap.op2.serviceagent.common.ExecutionContext;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;

/** 
 * ClassName:IBatchService  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月25日 下午4:44:46  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public interface IBatchService {

	void execute(ToRouteEndpoint te, MessageBO mb) throws Exception;

	ExecutionContext getExecutionContext(MessageBO mb);

}
