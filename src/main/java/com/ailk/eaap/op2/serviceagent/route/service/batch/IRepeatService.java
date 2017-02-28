/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:RepeatTemplate.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2015年1月26日下午5:29:25 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch;  

import com.ailk.eaap.op2.bo.ToRouteEndpoint;

/** 
 * ClassName:IRepeatService  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月26日 下午5:29:25  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public interface IRepeatService {

	void doExecute(ToRouteEndpoint re, RepeatCallBack callBack) throws Exception;

	void recycling(ToRouteEndpoint te, RepeatCallBack callBack);

}
