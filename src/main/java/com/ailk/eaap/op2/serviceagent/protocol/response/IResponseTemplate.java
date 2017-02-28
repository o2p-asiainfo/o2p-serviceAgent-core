/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IResponseTemplate.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.protocol.response 
 * Date:2014年12月23日上午10:24:19 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.protocol.response;  

import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/** 
 * ClassName:IResponseTemplate  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年12月23日 上午10:24:19  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public interface IResponseTemplate {
	String CONTENT_TYPE_XML_UTF8 = "text/xml;charset=UTF-8";
	String CONTENT_TYPE_PLAIN_UTF8 = "text/plain;charset=UTF-8";
	String CONTENT_TYPE_JSON_UTF8 = "text/json;charset=UTF-8";
	int RESPONSE_DESC_LENGTH = 512;
	String ACCEPT = "accept";
	
	/**
	 * 
	 * response:(设置响应模板).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param messageBo
	 * @param code
	 * @param msg 
	 * @since JDK 1.6
	 */
	void response(MessageBO<?> messageBo, String code, String msg);

	/**
	 * 
	 * checkHeader:(将未配置在协议格式的key清除).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param messageBo 
	 * @since JDK 1.6
	 */
	void checkHeader(MessageBO<?> messageBo);

}
