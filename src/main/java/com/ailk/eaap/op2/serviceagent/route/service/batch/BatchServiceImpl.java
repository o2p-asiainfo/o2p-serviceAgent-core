/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:BatchServiceImpl.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2015年1月25日下午4:45:45 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch;  


import org.springframework.stereotype.Service;

import com.ailk.eaap.op2.serviceagent.common.BatchStatus;
import com.ailk.eaap.op2.serviceagent.common.ExecutionContext;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.EndpointProcessor;
import com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;

/** 
 * ClassName:BatchServiceImpl  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月25日 下午4:45:45  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
@Service
public class BatchServiceImpl implements IBatchService {
	
	private ProcessorFactory processorFactory;
	private IRepeatService repeatService;
	private static final Logger LOG = Logger.getLog(BatchServiceImpl.class);
	
	public void setRepeatService(IRepeatService repeatService) {
		this.repeatService = repeatService;
	}

	public void setProcessorFactory(ProcessorFactory processorFactory) {
		this.processorFactory = processorFactory;
	}


	@Override
	public void execute(ToRouteEndpoint te, MessageBO messageBo) throws Exception {
		
		if(LOG.isDebugEnabled()) {
			LOG.debug("Batch service started. SerInvokeInsId="+messageBo.getSerInvokeIns().getSerInvokeInsId());
		}
		ExecutionContext ec = messageBo.getExecutionContext();
		ec.setStatus(BatchStatus.STARTED);
		
		EndpointProcessor processor = getBatchEndpoint(te, messageBo);
		RepeatCallBack callBack = null;
		try {
			//打开文件上次读取位置
			open(processor, messageBo);
			
			callBack = new RepeatCallBack(messageBo);
			
			repeatService.doExecute(te, callBack);
			
		} catch(Exception e) {
			LOG.error("batch execute error ", e);
		} finally {
			
			close(processor, messageBo);
			
			//回收文件
//			repeatService.recycling(te, callBack);
		}
		
	}

	/**
	 * 
	 * getBatchEndpoint:(取得批处理端点).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param re
	 * @param messageBo 
	 * @return 
	 * @since JDK 1.6
	 */
	private EndpointProcessor getBatchEndpoint(ToRouteEndpoint te, MessageBO messageBo) {

		Endpoint endpoint = te.getToEndpoint().getCurrentEndpoint();
		
		EndpointProcessor processor = processorFactory.getProcessor(endpoint);		
		
		if(processor instanceof AbstractBatchEndpoint) {
			
			return processor;
		}
		
		throw new BusinessException(9065, "o2p-serviceagent-core.9065", new String[]{" ,BatchEndpoint is null, MessageFlowId="+messageBo.getSerInvokeIns().getMessageFlow().getMessageFlowId()}, null);
		
	}


	private void open(EndpointProcessor processor, MessageBO messageBo) throws Exception  {
		
		AbstractBatchEndpoint abe = ((AbstractBatchEndpoint)processor);
		abe.open(messageBo);
		if(LOG.isDebugEnabled()) {
			LOG.debug("Resources open succeeded.  SerInvokeInsId="+messageBo.getSerInvokeIns().getSerInvokeInsId());
		} 
		
	}

	private void close(EndpointProcessor processor,  MessageBO messageBo) throws Exception {
		
		if(processor instanceof AbstractBatchEndpoint) {
			((AbstractBatchEndpoint)processor).close(messageBo);
		}
		
		if(LOG.isDebugEnabled()) {
			LOG.debug("Resources close succeeded.  SerInvokeInsId="+messageBo.getSerInvokeIns().getSerInvokeInsId());
		} 
	}



	@Override
	public ExecutionContext getExecutionContext(MessageBO mb) {
		
		ExecutionContext ec = mb.getExecutionContext();
		if(ec == null) {
			
			ec = new ExecutionContext();
			ThrottleLimitResultQueue queue = new ThrottleLimitResultQueue(ec.getThreadNumber());
			ec.setQueue(queue);
			ec.setStatus(BatchStatus.STARTING);
			mb.setExecutionContext(ec);
		}
		return ec;
	}
	
}
