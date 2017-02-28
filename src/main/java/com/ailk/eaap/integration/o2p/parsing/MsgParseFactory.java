/** 
 * Project Name:serviceAgent-core 
 * File Name:MsgParseFactory.java 
 * Package Name:com.ailk.eaap.integration.o2p.parsing 
 * Date:2014年11月18日下午8:04:05 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.parsing;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.json.JSONObject;

import org.dom4j.Document;
import com.ailk.eaap.o2p.common.parse.HttpMsgUrlStyleMsgParse;
import com.ailk.eaap.o2p.common.parse.IMsgParse;
import com.ailk.eaap.o2p.common.parse.JsonMsgParse;
import com.ailk.eaap.o2p.common.parse.XmlMsgParse;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.log.Logger;

/**
 * ClassName:MsgParseFactory 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年11月18日 下午8:04:05 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public final class MsgParseFactory {
	private static final Logger logger = Logger.getLog(MsgParseFactory.class);
	private static MsgParseFactory msgParseFactory = new MsgParseFactory();
	private static Map<Integer, IMsgParse> msgParseCache = new ConcurrentHashMap<Integer, IMsgParse>();

	private MsgParseFactory() {
	}

	public static MsgParseFactory getInstance() {
		return msgParseFactory;
	}

	@SuppressWarnings("rawtypes")
	public IMsgParse getMsgParse(MessageBO messageBO) {
		IMsgParse msgParse = null;
		int parseType = -1;
		
		String contentType = "";
		if(messageBO.getMsgHead().get("Content-Type") != null) {
			
			contentType = messageBO.getMsgHead().get("Content-Type").toString();
		} else if(messageBO.getMsgHead().get("content-type") != null){
			
			contentType = messageBO.getMsgHead().get("content-type").toString();
		}
		
		if (messageBO.getMsgBody() instanceof Document || contentType.contains("xml")) {
			parseType = 1;
		} else if (messageBO.getMsgBody() instanceof JSONObject || contentType.contains("json")) {
			parseType = 2;
		} else if (messageBO.getMsgBody() instanceof String && messageBO.getMsgBody().toString().matches("([^&]+=[^&]+&?)+")) {
			parseType = 3;
		}
		
		msgParse = msgParseCache.get(parseType);

		if (msgParse == null) {
			msgParse = createMsgParse(parseType);
			
			if (msgParse != null) {
				
				msgParseCache.put(parseType, msgParse);
			}
		}

		return msgParse;
	}

	private IMsgParse createMsgParse(int parseType) {
		if (logger.isDebugEnabled()) {
			logger.debug("parse type : {0}", parseType);
		}

		switch (parseType) {
		case 1:
			return new XmlMsgParse();
		case 2:
			return new JsonMsgParse();
		case 3:
			return new HttpMsgUrlStyleMsgParse();
		}

		return null;
	}

}
