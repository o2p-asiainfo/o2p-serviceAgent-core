/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:MessageBOHisService.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.aop 
 * Date:2014年10月24日上午9:55:57 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.aop;  

import java.net.InetAddress;
import java.sql.Timestamp;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

import com.ailk.eaap.integration.o2p.contractbody.service.IContractBodyService;
import com.ailk.eaap.integration.o2p.contractbody.util.LocalService;
import com.ailk.eaap.o2p.common.util.LocalUtils;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Endpoint;

/** 
 * ClassName:MessageBOHisService  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年10月24日 上午9:55:57  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class MessageBOHisAspect {
	private IMessageBoHisService messageBoHisSer;
	private IContractBodyService contractBodySer;
	@Autowired
	private LocalService localService;
	
	private static final Logger LOG = Logger.getLog(MessageBOHisAspect.class);

	public void setMessageBoHisSer(IMessageBoHisService messageBoHisSer) {
		this.messageBoHisSer = messageBoHisSer;
	}
	public void setContractBodySer(IContractBodyService contractBodySer) {
		this.contractBodySer = contractBodySer;
	}
	
	@SuppressWarnings("rawtypes")
	public void beforeExchange(JoinPoint joinpoint) {
		
		try{
			LOG.debug("=======>add messageBoHis in endpoint");
			Object[] o = joinpoint.getArgs();
			Endpoint endpoint = (Endpoint)o[0];
			if(endpoint != null) {
				
				MessageBO messagebo = (MessageBO)o[1];
				messagebo.setEndPointSpec(endpoint.getEndpointSpecCode());
				messagebo.setReqorrsp(EOPDomain.REQ_FLAG);
				
				//任务类型，记录执行服务引擎IP
				if(messagebo.isTaskFlag()){
					String ipPort = localService.getIpPort();
					if(LOG.isDebugEnabled()){
						LOG.debug("serviveAgent ipPort is {0}", ipPort);
					}
					if(ipPort==null || ipPort.equals("")){
						localService.setIpPort(LocalUtils.getLocalRealIp());
					}
					messagebo.setIp(ipPort);
				}
				

				if(LOG.isDebugEnabled()) {
					
					LOG.debug("===========> endpointId="+endpoint.getEndpointId());
					LOG.debug("===========> messagebo="+messagebo.toString());
				}
				
				if(EOPDomain.YES.equals(endpoint.getEnableOutLog())) {
					
					messageBoHisSer.addTimestamp(endpoint.getEndpointId(), messagebo, new Timestamp(System.currentTimeMillis()), MessageBoHisServiceImpl.REQ);
					messageBoHisSer.addMessageBo(endpoint.getEndpointId(), messagebo, MessageBoHisServiceImpl.REQ);
				}
				
				contractBodySer.setNodeValsByContractFormat(messagebo, endpoint);
			}
			
		} catch(BusinessException e) {
			
			LOG.error(LogModel.EVENT_APP_EXCPT, e);
		} catch(Exception e) {
			
			LOG.error(LogModel.EVENT_APP_EXCPT, e);
		}
		
		
	}
	
	@SuppressWarnings("rawtypes")
	public void afterExchange(JoinPoint joinPoint,Object retValue) {
		
		try{
			LOG.debug("=======>add messageBoHis out endpoint");
			Object[] o =joinPoint.getArgs();
			Endpoint endpoint = (Endpoint)o[0];
			MessageBO messagebo = (MessageBO)retValue;
			
			messagebo.setReqorrsp(EOPDomain.RSP_FLAG);
			
			if(LOG.isDebugEnabled()) {
				
				LOG.debug("===========> endpointId="+endpoint.getEndpointId());
				LOG.debug("===========> messagebo="+messagebo.toString());
			}
			
			if(endpoint !=null && EOPDomain.YES.equals(endpoint.getEnableOutLog())) {
				messageBoHisSer.addTimestamp(endpoint.getEndpointId(), messagebo, new Timestamp(System.currentTimeMillis()), MessageBoHisServiceImpl.RSP);
				messageBoHisSer.addMessageBo(endpoint.getEndpointId(), messagebo, MessageBoHisServiceImpl.RSP);
			}
			
		} catch(BusinessException e) {
			
			LOG.error(LogModel.EVENT_APP_EXCPT, e);
		} catch(Exception e) {
			
			LOG.error(LogModel.EVENT_APP_EXCPT, e);
		}
		
	}

	/**
	 * 
	 * afterRoute:(调用结束后保存日志清除当前线程MessageBOHis).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param joinpoint 
	 * @since JDK 1.6
	 */
	public void afterRoute(JoinPoint joinpoint) {
		
		
	}

}
