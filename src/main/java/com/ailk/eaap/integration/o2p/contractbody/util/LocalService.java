/** 
 * Project Name:serviceAgentWeb 
 * File Name:LocalServiceUtil.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.servlet 
 * Date:2015年4月29日下午2:21:49 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.contractbody.util;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.o2p.common.util.LocalUtils;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.common.PropertyLoader;
import com.asiainfo.foundation.log.Logger;

/**
 * ClassName:LocalServiceUtil 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年4月29日 下午2:21:49 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
@Service
public class LocalService {
	private static final Logger LOG = Logger.getLog(LocalService.class);
	@Autowired
	private  ICacheFactory<String, Object> cacheFactory;
	
	private  String ipPort = null;

	public  String getIpPort() {
		return ipPort;
	}

	public  void setIpPort(String ipPort) {
		this.ipPort = ipPort;
	}

	@SuppressWarnings({ "unchecked" })
	public  void setLocalInfo(int port)
			throws UnknownHostException {
		if (null == getIpPort()) {
			String local = LocalUtils.getLocalRealIp() + ":" + port;
			setIpPort(local);
			if (LOG.isDebugEnabled()) {
				LOG.debug("local ip port {0}", getIpPort());
			}
		
			TranIdSeqIncre.setCacheFactory(cacheFactory);

			if(cacheFactory.getCacheClient() == null) {
				
				return;
			}
			// 本地标识
			String localSeq = "";
			if (cacheFactory.getCacheClient().get(local) != null) {
				localSeq = cacheFactory.getCacheClient().get(local).toString();
			}
			if (LOG.isDebugEnabled()) {
				LOG.debug("LocalServiceUtil local {0} localSeq {1}", local,
						localSeq);
			}
			// 缓存处理
			if (!StringUtils.isEmpty(localSeq)) {
				// 标识同步二级缓存
				cacheFactory.getLocalCacheClient().put(local, localSeq);
				// Component Key
				List<String> keyList = (List<String>) cacheFactory
						.getCacheClient().get(CacheKey.KEY_LIST_COMPONENT);
				Map<String, Integer> comSeqMap = (Map<String, Integer>) cacheFactory
						.getCacheClient().get(CacheKey.DB_SERVER_COMPONENT_SEQ);

				if (null != keyList) {
					for (String key : keyList) {
						Component com = (Component) cacheFactory
								.getCacheClient().get(key);
						if (null != com
								&& !"".equals(com.getCode())
								&& null != comSeqMap
								&& null != comSeqMap.get(localSeq
										+ com.getCode())) {
							cacheFactory.getLocalCacheClient().put(
									localSeq + com.getCode(),
									comSeqMap.get(localSeq + com.getCode()));
						}
					}
				}
			} else {
				// 读取序列号
				int seq = 0;
				if (null != cacheFactory.getCacheClient().get(
						CacheKey.DB_SERVER_LOCAL_SEQ)) {
					seq = (Integer) cacheFactory.getCacheClient().get(
							CacheKey.DB_SERVER_LOCAL_SEQ);
				}
				seq = +1;
				String nl = "3";
				if(PropertyLoader.getProperty("Local_ID_Number")!=null){
					nl = PropertyLoader.getProperty("Local_ID_Number");
				}
				int numberLength = Integer.valueOf(nl);
				String strSeq = String.valueOf(seq);
				
				int length = strSeq.length();
				if (length > 0 && length < numberLength) {
					int needAddZeroNum = numberLength - length;
					strSeq = "0000".substring(0, needAddZeroNum)
							+ strSeq;
				} else {
					strSeq = String.valueOf(seq);
				}
				
				// 新建序列号同步缓存
				cacheFactory.getCacheClient().put(CacheKey.LOCALSEQ, seq);
				cacheFactory.getCacheClient().put(CacheKey.DB_SERVER_LOCAL_SEQ,
						seq);
				// 新建标识同步缓存
				cacheFactory.getCacheClient().put(local, strSeq);
				cacheFactory.getCacheClient().put(strSeq, local);
				// 本地缓存
				cacheFactory.getLocalCacheClient().put(local, strSeq);
				// Component Key
				List<String> keyList = (List<String>) cacheFactory
						.getCacheClient().get(CacheKey.KEY_LIST_COMPONENT);

				Map<String, Integer> comSeqMap = (Map<String, Integer>) cacheFactory
						.getCacheClient().get(CacheKey.DB_SERVER_COMPONENT_SEQ);
				if (null != keyList && keyList.size() > 0) {
					for (String key : keyList) {
						Component com = (Component) cacheFactory.getCacheClient()
								.get(key);
						if (null != com && !"".equals(com.getCode())
								&& null != comSeqMap
								&& null != comSeqMap.get(strSeq + com.getCode())) {
							cacheFactory.getLocalCacheClient().put(
									strSeq + com.getCode(),
									comSeqMap.get(strSeq + com.getCode()));
						}
					}
				}
				
				localSeq = strSeq;
			}

			TranIdSeqIncre.setLogo(localSeq);
		} else {
			if (LOG.isDebugEnabled()) {
				LOG.debug("LocalServiceUtils ipport existing {0}", getIpPort());
			}
			
		}
	}

}
