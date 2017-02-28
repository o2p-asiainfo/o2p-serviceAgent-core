/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:FreeMarkerTemplate.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.protocol 
 * Date:2015年8月31日上午11:04:54 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.protocol;  

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.OutType;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Template;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;

/** 
 * ClassName:FreeMarkerTemplate  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年8月31日 上午11:04:54  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class FreeMarkerTemplate implements IFreeMarkerTemplate {
	
	private static final Logger LOG = Logger.getLog(FreeMarkerTemplate.class);
	private Configuration cfg;
	private IMemcacheManageServ cacheService;
	
	private StringTemplateLoader stringLoader;
	
	public FreeMarkerTemplate() {
		cfg = new  Configuration();
		stringLoader = new StringTemplateLoader();
	}
	
	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	@Override
	public void buildTemplate(MessageBO messageBo, Template templateBean, Integer tcpCtrFId) {
		
		if(StringUtils.isEmpty(messageBo.getTransactionID())) {
			messageBo.setTransactionID(EOPDomain.ERROR_TRASACTION_ID);
		}
		if(StringUtils.isEmpty(messageBo.getRspType())) {
			messageBo.setRspType(ErrorDomain.ERROR_TYPE_BIZ_ERROR);
		}
		if(StringUtils.isEmpty(messageBo.getRspTime())) {
			messageBo.setRspTime(CommonUtil.getDefaultTimeZoneDateString());
		}
		
		String body = templateBean.getTemplateBody();
		String header = templateBean.getTemplateHeader();
		try {
			
			if(!StringUtils.isEmpty(body)) {
				String keyPre = CacheKey.body+templateBean.toString()+tcpCtrFId;
				buildBody(body, messageBo, keyPre);
			} else {
				//没配置body模版则使用空模版
				messageBo.setMsgBody("");
			}
			
			if(!StringUtils.isEmpty(header)) {
				String keyPre = CacheKey.header+templateBean.toString()+tcpCtrFId;
				buildHeader(header, messageBo, keyPre);
			}
			
		} catch (IOException e) {
			
			LOG.error("build freemarker template error, ", e);
		} catch (TemplateException e) {
			
			LOG.error("build freemarker template error, ", e);
		}
		
	}

	/**
	 * 
	 * buildHeader:(如果修改了模版可以重新加载).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param header 是一个json数组
	 * @param messageBo
	 * @throws IOException 
	 * @throws TemplateException 
	 * @since JDK 1.6
	 */
	public void buildHeader(String header, MessageBO messageBo, String keyPre) throws IOException, TemplateException {
		
		JSONArray jsonArray = JSONArray.fromObject(header);
		StringWriter out  = null;
			
		for(Iterator<JSONObject> it = jsonArray.iterator(); it.hasNext();) {
			
			JSONObject jsonObj = it.next();
			
			for(Iterator<String> keyIt = jsonObj.keys(); keyIt.hasNext();) {
				
				try {
					out  = new StringWriter();
					String key = keyIt.next();
					String valueTemplate = jsonObj.getString(key);
					
					stringLoader.putTemplate(keyPre+key, valueTemplate);
					cfg.setTemplateLoader(stringLoader);
					
					freemarker.template.Template template = null;
						
					Map<String, Object> root = new HashMap<String, Object>();
					root.put("messageBO", messageBo);
					template = cfg.getTemplate(keyPre+key);
					template.process(root, out);
					
					//http code值是异常编码映射
					if(OutType.httpStatusCode.equals(key) && messageBo.getEAAPException() != null) {
						Object httpCode = cacheService.getKey(CacheKey.Exception+messageBo.getEAAPException().getCode(), messageBo.getTenant().getTenantId());
						if(httpCode != null && StringUtils.isEmpty(out.toString())) {
							messageBo.getMsgHead().put(OutType.httpStatusCode, httpCode);
						} else {
							
							messageBo.getMsgHead().put(key, out.toString());
						}
					} else {
						
						messageBo.getMsgHead().put(key, out.toString());
					}
				} finally {
					
					try {
						if(out != null) {
							
							out.close();
						}
					} catch (IOException e) {
						
						LOG.error("freemarker template close StringWriter error, ", e);
					}
				}
			}
		} 
	}

	public void buildBody(String body, MessageBO messageBo, String keyPre) throws IOException, TemplateException {
		
		stringLoader.putTemplate(keyPre, body);
		cfg.setTemplateLoader(stringLoader);
		
		freemarker.template.Template template = null;
		StringWriter out = null;
		
		try {
			
			out = new StringWriter();
			Map<String, Object> root = new HashMap<String, Object>();
			root.put("messageBO", messageBo);
			template = cfg.getTemplate(keyPre);
			template.process(root, out);
			
			messageBo.setMsgBody(out.toString());
			
		}  finally {
			
			try {
				if(out != null) {
					
					out.close();
				}
			} catch (IOException e) {
				
				LOG.error("freemarker template close StringWriter error, ", e);
			}
		}
		
	}

}
