/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IFreeMarkerTemplate.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.protocol 
 * Date:2015年8月31日上午11:03:35 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.protocol;  

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Template;

/** 
 * ClassName:IFreeMarkerTemplate  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年8月31日 上午11:03:35  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public interface IFreeMarkerTemplate {

	void buildTemplate(MessageBO<?> messageBo, Template templateBean, Integer tcpCtrFId);

}
