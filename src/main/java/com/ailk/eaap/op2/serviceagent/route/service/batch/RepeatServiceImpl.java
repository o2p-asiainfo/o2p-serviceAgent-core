/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:RepeatServiceImpl.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service.batch 
 * Date:2015年1月26日下午5:36:59 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch;  

import java.io.File;

import org.springframework.core.task.TaskExecutor;

import com.ailk.eaap.op2.serviceagent.common.BatchStatus;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.EndpointSpec;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;

/** 
 * ClassName:RepeatServiceImpl  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月26日 下午5:36:59  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class RepeatServiceImpl implements IRepeatService{
	
	private IRouteServ routeServ;
	private TaskExecutor taskExecutor;
	private static final Logger LOG = Logger.getLog(RepeatServiceImpl.class);
	
	public void setRouteServ(IRouteServ routeServ) {
		this.routeServ = routeServ;
	}
	
	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	@Override
	public void doExecute(final ToRouteEndpoint te,final RepeatCallBack callBack) throws Exception {
		boolean running = !isMarkedComplete(callBack.getMessageBo());
		
		while (running) {

			if (running) {

				getNextResult(te, callBack);
				
				if (isMarkedComplete(callBack.getMessageBo()) ) {
					running = false;
					if(LOG.isDebugEnabled()) {
						LOG.debug("The resources read finished.");
					}
					
				}
				
			}
		}
	}
	
	private void Recycling(IRouteServ routeServ, ToRouteEndpoint te,
			MessageBO messageBo) {
		
		File[] files = null;
		if(messageBo.getMsgBody() != null && messageBo.getMsgBody() instanceof File[]) {

			files = (File[])messageBo.getMsgBody();
		}

		//如果配置了搬迁端点可以进行文件回收
		if(files != null && files.length>0 && te.getToEndpoint() != null) {
			for(ToRouteEndpoint tep : te.getToEndpoint().getChildEndpoints()){
				RouteEndpoint re = tep.getToEndpoint();
				if(re != null && re.getCurrentEndpoint() != null) {
					String specCode = re.getCurrentEndpoint().getEndpointSpecCode();
					if(EndpointSpec.FILE_MOVEV2.equalsIgnoreCase(specCode)) {
						
						if(LOG.isDebugEnabled()) {
							LOG.debug("recycling file, file="+files[0].getPath());
						}
						
						routeServ.routeMsg(tep.getToEndpoint(), messageBo);
						
						if(LOG.isDebugEnabled()) {
							LOG.debug("recycling file successed, file="+files[0].getPath());
						}
					}
				}
			}
		}
	}

	private void getNextResult(final ToRouteEndpoint te, RepeatCallBack callBack) throws Exception {
		
		ThrottleLimitResultQueue queue = callBack.getMessageBo().getExecutionContext().getQueue();
		
		do {
			
			Runnable runnable = new ExecutingRunnable(te, routeServ, queue, callBack);
			
			queue.expect();
			taskExecutor.execute(runnable);
			
		} while(queue.isEmpty() && !isMarkedComplete(callBack.getMessageBo()));
		
		ExecutingRunnable result = (ExecutingRunnable)queue.take();
		if (result.getError() != null) {
			throw result.getError();
		}
		
	}
	

	private boolean isMarkedComplete(MessageBO messageBo) {
		
		return BatchStatus.COMPLETED.equals(messageBo.getExecutionContext().getStatus());
	}

	private static class ExecutingRunnable implements Runnable {
		
		private final IRouteServ routeServ;
		
		private final ThrottleLimitResultQueue queue;

		private final ToRouteEndpoint te;

		private volatile Exception error;
		
		private RepeatCallBack callBack;
		
		public ExecutingRunnable(ToRouteEndpoint te, IRouteServ routeServ, ThrottleLimitResultQueue queue, RepeatCallBack callBack) {

			super();

			this.te = te;
			this.routeServ = routeServ;
			this.queue = queue;
			this.callBack = callBack;
		}

		/**
		 * Tell the queue to expect a result.
		 */
		public void expect() {
			try {
				queue.expect();
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

 
		public void run() {
			try {
				if(!BatchStatus.COMPLETED.equals(callBack.getMessageBo().getExecutionContext().getStatus())) {
					
					callBack.doInIteration(routeServ, te);
				}
			}
			catch (Exception e) {
				LOG.error("Batch processing thread run error.", e);
				error = e;
			}
			finally {
				queue.put(this);
			}
		}

		/**
		 * Get the error - never blocks because the queue manages waiting for
		 * the task to finish.
		 */
		public Exception getError() {
			return error;
		}
	}

	@Override
	public void recycling(ToRouteEndpoint te, RepeatCallBack callBack) {
		
		Recycling(routeServ, te, callBack.getMessageBo());
	}

		

}
