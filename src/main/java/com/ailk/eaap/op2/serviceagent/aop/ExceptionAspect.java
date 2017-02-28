package com.ailk.eaap.op2.serviceagent.aop;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;

import org.aspectj.lang.JoinPoint;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.jms.core.JmsTemplate;

import com.ailk.eaap.o2p.task.model.TaskContentBean;
import com.ailk.eaap.op2.bo.CacheFlagCommon;
import com.ailk.eaap.op2.bo.ExceptionDealInfo;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
import com.ailk.eaap.op2.serviceagent.taskflag.ITaskCacheService;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Endpoint;

public class ExceptionAspect implements ThrowsAdvice{
	
	private JmsTemplate exceptionJmsTempldate;
	private JmsTemplate dealExceptionJmsTemplate;
	private Integer exceptionTryNum;
	private ITaskCacheService taskCacheService;
	private static final Logger LOG = Logger.getLog(ExceptionAspect.class);
	private IMessageBoHisService messageBoHisSer;
	
	public void throwingExchange(JoinPoint joinpoint, BusinessException ex) {
		
		//根据不同的异常原因，有不同的重试次数
		if(LOG.isDebugEnabled()){
			LOG.debug("exception try num is {0}", exceptionTryNum);
		}
		
		Object[] o = joinpoint.getArgs();
		Endpoint endpoint = (Endpoint)o[0];
		MessageBO messagebo = (MessageBO)o[1];
		String serInvokeInsName = messagebo.getSerInvokeIns().getSerInvokeInsName();
		Integer serInvokeInsId = messagebo.getSerInvokeIns().getSerInvokeInsId();
		
		//异常后端点messageboHis创建
		messagebo.setReqorrsp(EOPDomain.RSP_FLAG);
		if(endpoint !=null && EOPDomain.YES.equals(endpoint.getEnableOutLog())) {
			messageBoHisSer.addTimestamp(endpoint.getEndpointId(), messagebo, new Timestamp(System.currentTimeMillis()), MessageBoHisServiceImpl.RSP);
			messageBoHisSer.addMessageBo(endpoint.getEndpointId(), messagebo, MessageBoHisServiceImpl.RSP);
		}
		Integer endPointId = Integer.valueOf(0);
		if(endpoint!=null){
			endPointId = endpoint.getEndpointId();
		}
		
			if(messagebo.isTaskFlag()){
				if(LOG.isDebugEnabled()){
					LOG.debug("messagebo.isTaskFlag()", messagebo.isTaskFlag());
				}
				byte[] bytes = null;  
			    try {  
			        // object to bytearray  
			        ByteArrayOutputStream bo = new ByteArrayOutputStream();  
			        ObjectOutputStream oo = new ObjectOutputStream(bo);  
			        oo.writeObject(messagebo);  
			        bytes = bo.toByteArray();  
			        bo.close();  
			        oo.close();  
			    } catch (Exception e) {  
			    	LOG.error(LogModel.EVENT_APP_EXCPT, e);
			    }  
				
				ExceptionDealInfo info = new ExceptionDealInfo();
				info.setTranId(messagebo.getDstTranId());
				String destinationName = exceptionJmsTempldate.getDefaultDestinationName();
				info.setExceptionQueueName(destinationName.replace("queue://", ""));
				info.setMessageBoByte(bytes);
				info.setComponentId(messagebo.getSerInvokeIns().getComponentId());
				info.setComponentName(messagebo.getSerInvokeIns().getComponentCode());
				info.setSerInvokeInsId(serInvokeInsId);
				info.setSerInvokeInsName(serInvokeInsName);
				info.setEndPointId(endPointId);
				info.setEndPointName(endpoint.getEndpointName());
				info.setTenantId(messagebo.getTenant().getTenantId());
				if(ex.toXmlString()!=null){
					if(ex.toXmlString().length()>2048){
						info.setExceptionCode(ex.toXmlString().substring(0, 2040));
					}else{
						info.setExceptionCode(ex.toXmlString());
					}
				}
				if(ex.getMessage()!=null){
					if(ex.getMessage().length()>2048){
						info.setExceptionStack(ex.getMessage().substring(0, 2040));
					}else{
						info.setExceptionStack(ex.getMessage());
					}
				}
				info.setMessageFlowId(messagebo.getSerInvokeIns().getMessageFlow().getMessageFlowId());
				info.setMessageFlowName(messagebo.getSerInvokeIns().getMessageFlow().getMessageFlowName());
				info.setServiceId(messagebo.getService().getServiceId());
				info.setServiceName(messagebo.getService().getServiceCnName());
				Integer tryNym = messagebo.getExceptionTryNum();
				info.setTryNum(tryNym);
				info.setTryStatus(ExceptionDealInfo.TRY_STATUS_W);
				info.setCreateDate(new Timestamp(System.currentTimeMillis()));
				//判断是否并发任务，非并发任务，需要修改任务缓存状态
				if(!messagebo.getTaskStyle().equals(TaskContentBean.CONCURRENCY_TASK)){
					taskCacheService.updateMemcache(messagebo.getTaskStyle(),messagebo.getTaskCacheFlag(),CacheFlagCommon.TASK_STATUS_EXCEPTION);
				}
				//小于等于系统尝试次数，重新放入异常队列
				if(tryNym<=exceptionTryNum){
					info.setTryStatus(ExceptionDealInfo.TRY_STATUS_T);
					//发送到异常队列
					if(LOG.isDebugEnabled()){
						LOG.debug("SerInvokeInsId={0},tryNym {1} into exceptionQueue",info.getSerInvokeInsId(),tryNym);
					}
					exceptionJmsTempldate.convertAndSend(info);
				//等于异常重试次数+1，为持久化到数据库中，大于异常重试次数+1为人工重试流程，不再重复持久化到数据库中
				}else if(tryNym==exceptionTryNum+1){
					info.setTryStatus(ExceptionDealInfo.TRY_STATUS_W);
					//持久化到数据库前，需要发到队列
					if(LOG.isDebugEnabled()){
						LOG.debug("SerInvokeInsId={0},tryNym {1} into DB from Queue",info.getSerInvokeInsId(),tryNym);
					}
					//判断是否并发任务，非并发任务，需要修改任务缓存状态
					if(!messagebo.getTaskStyle().equals(TaskContentBean.CONCURRENCY_TASK)){
						taskCacheService.updateMemcache(messagebo.getTaskStyle(),messagebo.getTaskCacheFlag(),CacheFlagCommon.TASK_STATUS_EXCEPTION);
					}
					dealExceptionJmsTemplate.convertAndSend(info);
				}
			}
	}


	public Integer getExceptionTryNum() {
		return exceptionTryNum;
	}

	public void setExceptionTryNum(Integer exceptionTryNum) {
		this.exceptionTryNum = exceptionTryNum;
	}

	public ITaskCacheService getTaskCacheService() {
		return taskCacheService;
	}

	public void setTaskCacheService(ITaskCacheService taskCacheService) {
		this.taskCacheService = taskCacheService;
	}

	public IMessageBoHisService getMessageBoHisSer() {
		return messageBoHisSer;
	}

	public void setMessageBoHisSer(IMessageBoHisService messageBoHisSer) {
		this.messageBoHisSer = messageBoHisSer;
	}
	
	public void setDealExceptionJmsTemplate(JmsTemplate dealExceptionJmsTemplate) {
		this.dealExceptionJmsTemplate = dealExceptionJmsTemplate;
	}


	public void setExceptionJmsTempldate(JmsTemplate exceptionJmsTempldate) {
		this.exceptionJmsTempldate = exceptionJmsTempldate;
	}


	public JmsTemplate getExceptionJmsTempldate() {
		return exceptionJmsTempldate;
	}

}
