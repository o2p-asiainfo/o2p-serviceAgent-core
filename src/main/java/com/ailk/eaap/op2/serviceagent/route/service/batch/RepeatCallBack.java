/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:RepeatCallBack.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service.batch 
 * Date:2015年2月2日上午11:23:46 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch;  

import java.util.concurrent.Semaphore;

import org.apache.commons.lang.StringUtils;

import com.ailk.eaap.op2.serviceagent.common.BatchStatus;
import com.ailk.eaap.op2.serviceagent.common.ExecutionContext;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;

/** 
 * ClassName:RepeatCallBack  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月2日 上午11:23:46  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class RepeatCallBack {
	
	private MessageBO messageBo;
	private Semaphore semaphore = new Semaphore(1);
	private static final Logger LOG = Logger.getLog(RepeatCallBack.class);
	
	public MessageBO getMessageBo() {
		return messageBo;
	}

	public RepeatCallBack(MessageBO messageBo) {
		this.messageBo = messageBo;
	}

	public void doInIteration(IRouteServ routeServ, ToRouteEndpoint te) throws Exception {
		
		boolean locked = false;
		
		try {
			
			//每个线程创建一个messageBo及ExecutionContext，线程执行完成后更新全局MessageBO
			MessageBO subMessageBo = (MessageBO)messageBo.clone();
			ExecutionContext ec = messageBo.getExecutionContext().clone();
			subMessageBo.setExecutionContext(ec);
			subMessageBo.getExecutionContext().setReadCount(0);
			doInChunk(routeServ, te, subMessageBo);
			
			try {
				semaphore.acquire();
				locked = true;
			} catch (InterruptedException e) {
				messageBo.getExecutionContext().setStatus(BatchStatus.STOPPED);
				Thread.currentThread().interrupt();
			}

			//通过子上下文更新全局上下文
			messageBo.getExecutionContext().apply(subMessageBo.getExecutionContext().getReadCount());
			messageBo.getExecutionContext().setStatus(subMessageBo.getExecutionContext().getStatus());
			messageBo.getExecutionContext().setExitStatus(subMessageBo.getExecutionContext().getExitStatus());
			
			if(LOG.isDebugEnabled()) {
				LOG.debug ("Update execution context successed. status="+subMessageBo.getExecutionContext().getStatus()
						+".Commit count="+messageBo.getExecutionContext().getCommitCount()
						+"  SerInvokeInsId="+messageBo.getSerInvokeIns().getSerInvokeInsId());
			}
		}  finally {
			if (locked) {
				semaphore.release();
			}
			locked = false;
		}
		
		
	}
	
	
	private void doInChunk(IRouteServ routeServ, ToRouteEndpoint te, MessageBO subMessageBo) throws Exception {
		
		routeServ.routeMsg(te.getToEndpoint(), subMessageBo);
		
		if(subMessageBo.getMsgBody() == null || StringUtils.isEmpty(subMessageBo.toString())) {
			
			subMessageBo.getExecutionContext().setStatus(BatchStatus.COMPLETED);
			if(LOG.isDebugEnabled()) {
				LOG.debug ("Batch execution completed.   SerInvokeInsId="+messageBo.getSerInvokeIns().getSerInvokeInsId());
			}
		} else {
			
			subMessageBo.getExecutionContext().incrementReadCount();
		}
		
		if(LOG.isDebugEnabled()) {
			LOG.debug ("threadName="+Thread.currentThread().getName());
		}
	    
	}
	
}
