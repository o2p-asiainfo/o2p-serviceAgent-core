package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.Enumeration;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

public class JMSReceiverEndpointProcessor implements EndpointProcessor {


	private static final Logger LOG = Logger.getLog(JMSReceiverEndpointProcessor.class);
	private IMemcacheManageServ cacheService;
	private JmsTemplateFactory jmsTemplateFactory;


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public MessageBO process(Endpoint endpoint, MessageBO msg) throws BusinessException {
		if (LOG.isDebugEnabled()) {
			LOG.debug("jms receive begin");
			LOG.debug("message:"+msg.toString());
		}
		/*obtain techimpl object*/
		Object obj = endpoint.getAttrMap().get(EndpointAttr.ServiceTechId);
		TechImpl tech = null;
		if (obj == null) {
			throw new BusinessException(9066,"o2p-serviceagent-core.9066", new String[] { "EndpointAttr=" + EndpointAttr.ServiceTechId },null);
		} else {
			String serTechId = obj.toString();
			tech = (TechImpl) cacheService.getKey(CacheKey.techImpl+ serTechId, msg.getTenant().getTenantId());
			if (LOG.isDebugEnabled()) {
				LOG.debug("serTechId=" + serTechId);
			}
			if (tech == null) {
				throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "serTechId=" + serTechId }, null);
			}
		}
		/*get device infomation from tibco jms*/
		try{
			JmsTemplate jmsTemplate = jmsTemplateFactory.getJmsTemplate(tech);
			
			Message message = jmsTemplate.receive();
			if(message==null){	
				msg.getMsgHead().put("jmsReceive", "1");
				
				if (LOG.isDebugEnabled()) {
					LOG.debug("Jms Queue no message receive!");
				}
				throw new BusinessException(1041,  "Jms Queue no message receive!" );
				
			}else {
				TextMessage textM = (TextMessage) message;
				StringBuffer msgText = new StringBuffer();
				msgText.append(textM.getText());
				msg.setTempFileDirName(tech.getAttrMap().get(EndpointAttr.PRODUCT_LOCAL_PATH));
				msg.setMsgBody(msgText);
				msg.getMsgHead().put("jmsReceive", "0");
				
				Enumeration reqHeaderEnum = message.getPropertyNames();
				if(reqHeaderEnum!=null){
					while( reqHeaderEnum.hasMoreElements() ) {
					    String headerName = (String)reqHeaderEnum.nextElement();
					    Object object = message.getObjectProperty(headerName);
					    if(object!=null){
					    	msg.getMsgHead().put(headerName, object);
					    }
					    
					}
				}
				
				
			}
		} catch (Exception e) {
			String status=msg.getMsgHead().get("jmsReceive")==null?"":(String)msg.getMsgHead().get("jmsReceive");
			 if("1".equals(status)){
				throw new BusinessException(1041,  "Jms Queue no message receive!" );
			 }else{
				msg.getMsgHead().put("jmsReceive", "9");
				LOG.error("serTechId=" +  obj.toString()+" can not create Jms session, pls check Jms Service or Service Technology config", e);
				throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "serTechId=" +  obj.toString()+" can not create Jms session, pls check Jms Service or Service Technology config !" }, e);
			 }
		}
		return msg;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void subtraThreadNum(String servId) throws BusinessException {
		// TODO Auto-generated method stub

	}
	
	public void setJmsTemplateFactory(JmsTemplateFactory jmsTemplateFactory) {
		this.jmsTemplateFactory = jmsTemplateFactory;
	}

}
