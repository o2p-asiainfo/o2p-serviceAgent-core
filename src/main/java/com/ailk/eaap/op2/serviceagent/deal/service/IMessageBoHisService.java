/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:IMessageBoService.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.deal.service 
 * Date:2014年11月5日下午2:10:48 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.deal.service;  

import java.sql.Timestamp;
import java.util.Map;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;

/** 
 * ClassName:IMessageBoHisService  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年11月5日 下午2:10:48  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public interface IMessageBoHisService {
	

	/**
	 * 
	 * addMessageBo:(存储messageBo).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param epId
	 * @param messageBo
	 * @param reqRspFlag 
	 * @since JDK 1.6
	 */
	void addMessageBo(int epId, MessageBO messageBo, String reqRspFlag);
	
	/**
	 * 
	 * addTimestamp:(存储端点记录时间).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param epId
	 * @param messagebo 
	 * @param tStamp
	 * @param reqRspFlag 
	 * @since JDK 1.6
	 */
	void addTimestamp(int epId, MessageBO messagebo, Timestamp tStamp, String reqRspFlag );
	
	
	/**
	 * 
	 * getReqMessageBoByEpId:(通过端点Id取得“请求MessageBo”).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param epId
	 * @return
	 * 
	 * @since JDK 1.6
	 */
	MessageBO<?> getReqMessageBoByEpId(int epId, MessageBO<?> messageBo);
	
	/**
	 * 
	 * getRspMessageBoByEpId:(通过端点Id取得“响应MessageBo”).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param epId
	 * @return
	 * 
	 * @since JDK 1.6
	 */
	MessageBO<?> getRspMessageBoByEpId(int epId, MessageBO<?> messageBo);
}
