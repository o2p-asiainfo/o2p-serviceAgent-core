/** 
 * Project Name:o2p-common 
 * File Name:TranIdSeqIncre.java 
 * Package Name:com.asiainfo.integration.dealFlow 
 * Date:2015年2月2日下午3:25:50 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.contractbody.util;


import java.util.Map;


import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.op2.common.PropertyLoader;
import com.asiainfo.foundation.exception.BusinessException;

/**
 * ClassName:TranIdSeqIncre 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年2月2日 下午3:25:50 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public final class TranIdSeqIncre  {
	private static ICacheFactory<String, Object> cacheFactory;

	public static void setCacheFactory(ICacheFactory<String, Object> cacheFactory) {
		TranIdSeqIncre.cacheFactory = cacheFactory;
	}
	
	/** 每次增加量 */
	private static int interval = 1;
	/** 预定的最大值 */
	private static int maxNum = 9999;
	
	public static void setLogo(String logo) {
		TranIdSeqIncre.interval = 1;
		if (logo.length() == 3) {
			TranIdSeqIncre.maxNum = 9999999;
		} else if (logo.length() == 4) {
			TranIdSeqIncre.maxNum = 999999;
		}
		
	}

	private static final String add_String = "00000000";
	
	private static TranIdSeqIncre instance = new TranIdSeqIncre();
	
	public static TranIdSeqIncre getInstance () {
		return instance;
	}
	
	private TranIdSeqIncre(){}

	// 获取缓存标识序列号初始值
	@SuppressWarnings("unchecked")
	public int initStartNum(String logo, String code) throws Exception {
		if (cacheFactory.getLocalCacheClient().get(logo + code) != null) {
			return (Integer) cacheFactory.getLocalCacheClient()
					.get(logo + code);
		}
		Map<String, Integer> comSeqMap = (Map<String, Integer>) cacheFactory
				.getCacheClient().get(CacheKey.DB_SERVER_COMPONENT_SEQ);
		if (comSeqMap != null && comSeqMap.get(logo + code) != null) {
			return comSeqMap.get(logo + code);
		}
		return 0;
	}

	// 更新缓存序列号
	public void updateStartNum(String logo, String code, int intervalMax)
			throws Exception {
		cacheFactory.getLocalCacheClient().put(logo + code, intervalMax);
		
		if (null == cacheFactory.getCacheClient().get(logo + code)) {
			cacheFactory.getCacheClient().put(logo + code, intervalMax);
		}
		
		if (intervalMax %100 == 0) {
			cacheFactory.getCacheClient().put(logo + code, intervalMax);
		}
		
	}
	//获取流水号
	public String getNum(String logo, String code) {
		try {
			int no = cal(logo, code);
			if (logo.length() == 4) {
				return getSizeNum(no, 6);
			}
			if (logo.length() == 3) {
				return getSizeNum(no, 7);
			}
			
		} catch (Exception e) {
			throw new BusinessException(9150, "o2p.serviceAgent.transformer.SerialNumber", null, e);
		}
		return "";
	}
	//整形补零
	public static String getSizeNum(int num, int size) {
		String result = "";
		int length = String.valueOf(num).length();
		if (length != size && length < size) {
			int needAddZeroNum = size - length;
			result = add_String.substring(0, needAddZeroNum)
					+ String.valueOf(num);
		} else {
			result = String.valueOf(num);
		}
		return result;
	}
	//String补零
	public static String getSIzeString(String str, int size) {
		String result = "";
		int length = str.length();
		if (length != size && length < size) {
			int needAddZeroNum = size - length;
			result = add_String.substring(0, needAddZeroNum) + str;
		}else {
			result = str;
		}

		return result;
	}

	// 获取序列号
	public void getLogo(String ipPort) {
		// 读取序列号
		int seq = 0;
		if (cacheFactory.getCacheClient().get(
				CacheKey.DB_SERVER_LOCAL_SEQ) != null) {
			seq = (Integer) cacheFactory.getCacheClient().get(
					CacheKey.DB_SERVER_LOCAL_SEQ);
		}
				
		seq = +1;
		int numberLength = Integer.valueOf(PropertyLoader
				.getProperty("Local_ID_Number"));
		String strSeq = getSizeNum(seq, numberLength);
		// 新建序列号同步缓存
		cacheFactory.getCacheClient().put(CacheKey.LOCALSEQ, seq);
		cacheFactory.getCacheClient().put(CacheKey.DB_SERVER_LOCAL_SEQ, seq);
		// 新建标识同步缓存
		cacheFactory.getCacheClient().put(ipPort, strSeq);
		cacheFactory.getCacheClient().put(strSeq, ipPort);
		// 本地缓存
		cacheFactory.getLocalCacheClient().put(ipPort, strSeq);
	}
	
	
	public synchronized int cal(String logo, String code) throws Exception {
		if (serialNum == -1) {
			serialNum = initStartNum(logo, code); // 已经使用的序列号一定 小于 缓存的序列号

		}
		if (isMax(serialNum + 1)) { // 达到预定的最大值
			resetSerialNum();
		}
		if (serialNum == 0) {
			serialNum =+ 100;
		}
		serialNum = serialNum + interval;
		updateStartNum(logo, code, serialNum);
		
		return serialNum;
	}
	
	private boolean isMax(int num) {
		return num >= maxNum;
	}
	
	protected void resetSerialNum() throws Exception {
		this.serialNum = 0;

	}

	
	/** 区间最大值 */
	protected int intervalMax = 0;

	/** 序列号 */
	protected int serialNum = -1;
}
