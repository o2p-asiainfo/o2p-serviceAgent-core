/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:AbstractBatchTemplate.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service.batch 
 * Date:2015年1月27日上午11:19:46 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch;  


import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.EndpointProcessor;
import com.asiainfo.foundation.exception.BusinessException;

/** 
 * ClassName:AbstractBatchTemplate  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月27日 上午11:19:46  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public abstract class AbstractBatchEndpoint implements EndpointProcessor{
	
	protected abstract void doOpen(MessageBO messageBo) throws Exception;
	
	protected abstract void doClose(MessageBO messageBo) throws Exception;
	
	protected abstract void doRead(MessageBO messageBo) throws Exception;
	
	public void open(MessageBO messageBo) throws Exception  {
		
		synchronized(messageBo) {
			doOpen(messageBo);
			if(messageBo.getExecutionContext().getCommitCount()>0) {
				for (int i = 0; i < messageBo.getExecutionContext().getCommitCount(); i++) {
					doRead(messageBo);
				}
			}
		}
		
	}
	
	public void close(MessageBO messageBo) throws Exception  {
		
		synchronized(messageBo) {
			doClose(messageBo);
		}
		
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}
}
