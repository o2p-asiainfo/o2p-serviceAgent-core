/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:MessageBoHisServiceImpl.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.deal.service 
 * Date:2014年11月6日下午2:09:05 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.deal.service;  

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.log.Logger;

/** 
 * ClassName:MessageBoHisServiceImpl  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年11月6日 下午2:09:05  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class MessageBoHisServiceImpl implements IMessageBoHisService{

	private static final Logger LOG = Logger.getLog(MessageBoHisServiceImpl.class);
	
	public static final String REQ = "REQ";
	public static final String RSP = "RSP";
	


	@Override
	public void addMessageBo(int epId, MessageBO messageBo, String reqRspFlag) {
			
		//克隆一份MessageBo
		MessageBO<?> mb = (MessageBO<?>) messageBo.clone();
	
		messageBo.getMessageBoHisMap().put(reqRspFlag+epId, mb);
	}

	@Override
	public void addTimestamp(int epId, MessageBO messagebo, Timestamp tStamp, String reqRspFlag) {
		
		Map<String, Timestamp> tsMap = messagebo.getTimeMap();
		tsMap.put(reqRspFlag+epId, tStamp);
	}


	@Override
	public MessageBO<?> getReqMessageBoByEpId(int epId, MessageBO<?> messageBo) {

		Map<String, MessageBO<?>> messageBoMap = messageBo.getMessageBoHisMap();
		
		LOG.debug("==========key:"+REQ+epId);
		
		return messageBoMap.get(REQ+epId);
	}

	@Override
	public MessageBO<?> getRspMessageBoByEpId(int epId, MessageBO<?> messageBo) {

		Map<String, MessageBO<?>> messageBoMap = messageBo.getMessageBoHisMap();
		
		LOG.debug("==========key:"+RSP+epId);
		
		return messageBoMap.get(RSP+epId);
	}
}
