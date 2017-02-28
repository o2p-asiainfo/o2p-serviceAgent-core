/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:JmsSenderEndpointProcessor.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2014年12月3日上午11:24:51 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.serviceagent.route.service;


import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;

import com.ailk.eaap.op2.common.MemcacheKey;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * ClassName:JMSSenderEndpointProcessor 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月3日 上午11:24:51 
 * 
 * @author wuwz
 * @version
 * @since JDK 1.6
 * 
 */
public class JMSSenderEndpointProcessor implements EndpointProcessor {


	private static final Logger LOG = Logger.getLog(JMSSenderEndpointProcessor.class);
	private IMemcacheManageServ cacheService;
	private JmsTemplateFactory jmsTemplateFactory;


	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}


	public void setJmsTemplateFactory(JmsTemplateFactory jmsTemplateFactory) {
		this.jmsTemplateFactory = jmsTemplateFactory;
	}

	
	@Override
	public MessageBO process(Endpoint endpoint, MessageBO msg)
			throws BusinessException {
		msg.getMsgHead().put("jmsCall", "9");
		
		if (LOG.isInfoEnabled()) {
			LOG.info("jms call begin");
			LOG.info("message:"+msg.toString());
		}
		
		//消息为空则不往下执行
		if(StringUtils.isEmpty(msg.toString())) {
			
			if (LOG.isDebugEnabled()) {
			
				LOG.debug("jms call message is null");
			}
			return msg;
		}
		
		Object obj = endpoint.getAttrMap().get(EndpointAttr.ServiceTechId);
		TechImpl tech = null;
		if (obj == null) {
			throw new BusinessException(9066,"o2p-serviceagent-core.9066",
					new String[] { "EndpointAttr=" + EndpointAttr.ServiceTechId },null);
		} else {
			String serTechId = obj.toString();
			tech = (TechImpl) cacheService.getKey(MemcacheKey.techImpl+ serTechId, msg.getTenant().getTenantId());

			if (LOG.isDebugEnabled()) {
				LOG.debug("serTechId=" + serTechId);
			}

			if (tech == null) {
				throw new BusinessException(9067, "o2p-serviceagent-core.9067",
						new String[] { "serTechId=" + serTechId }, null);
			}

			if (!tech.getSerTechStatus().equals(EOPDomain.ONLINE)) {
				throw new BusinessException(9069, "o2p-serviceagent-core.9069",
						new String[] { "techImplId=" + tech.getTechImplId()
								+ ", online state=" + EOPDomain.ONLINE }, null);
			}
			
			Component comp = (Component) cacheService.getKey(MemcacheKey.Component + tech.getComponentCode(), msg.getTenant().getTenantId());
			msg.setDstComponent(comp);
			msg.setRegServiceCode(tech.getServiceCode());
			msg.setRegServiceVersion(tech.getServiceVersion());
			msg.setDstOrgID(comp.getOrg().getOrgCode());
			msg.setDstSyscode(comp.getCode());
			
			//每次修改jmsTemplate并不耗时
		    JmsTemplate jmsTemplate = jmsTemplateFactory.getJmsTemplate(tech);
		    String message = msg.toString();
		    
		    //请求落地方时间
			if(msg.getSourceContractInteraction().getCenterFwd2DstTime() == null) {
				msg.getSourceContractInteraction().setCenterFwd2DstTime(new Timestamp(System.currentTimeMillis()));
				msg.getSourceContractInteraction().setDstRecTime(new Timestamp(System.currentTimeMillis()));
			}

			//发送比较耗时
			try {
				jmsTemplate.convertAndSend(message);
				msg.getMsgHead().put("jmsCall", "0");
			} catch (JmsException e) {
				LOG.error("JMSSenderEndpointProcessor error,serTechId=" + serTechId+",serviceCode"+msg.getService().getServiceCode(), e);
				throw e;
			} finally {
				//接收落地方时间
				msg.getSourceContractInteraction().setDstReplyTime(new Timestamp(System.currentTimeMillis()));
				msg.getSourceContractInteraction().setCenterRecDstTime(new Timestamp(System.currentTimeMillis()));
			}
		}
		
		if (LOG.isDebugEnabled()) {
			LOG.debug("jms call end");
		}
		return msg;
	}
	

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void subtraThreadNum(String servId) throws BusinessException {
		// TODO Auto-generated method stub

	}

}
