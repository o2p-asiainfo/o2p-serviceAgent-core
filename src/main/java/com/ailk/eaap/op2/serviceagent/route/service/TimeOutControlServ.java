package com.ailk.eaap.op2.serviceagent.route.service;

import net.rubyeye.xmemcached.Counter;
import net.rubyeye.xmemcached.GetsResponse;
import net.rubyeye.xmemcached.MemcachedClient;

import org.apache.log4j.Logger;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.HttpClientUtil;
import com.ailk.eaap.op2.bo.TechImpContralPo;
import com.ailk.eaap.op2.bo.TechImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Jul 17, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class TimeOutControlServ implements ITimeOutControlServ{

	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}
	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}
	private MemcachedClient memCachedClient;
	private String url;
	private int timeout=30;
	private static final Logger log = Logger.getLogger(TimeOutControlServ.class);
	public void timeOutControl(TechImpl techImpl)
			 {
		// TODO Auto-generated method stub
		memCachedClient = cacheService.getRunTimeMemcachedClient();
		try{
			TechImpContralPo techImpContralPo = techImpl.getTico();
			if(techImpContralPo!=null){
				Counter timecounter=memCachedClient.getCounter(CacheKey.TimeoutControl+techImpContralPo.getTechImpl(),1);
				
				
				String endTimeStr = null;
				GetsResponse<String> endTime = memCachedClient.gets(CacheKey.TimeoutControlTime+techImpContralPo.getTechImpl());
				if(endTime!=null){
					endTimeStr = endTime.getValue();
				}
				boolean outTime = false;
				
				
				outTime = CommonUtil.isOutTime(endTimeStr);
				if(endTime==null || !outTime){
					if(endTime==null){
						memCachedClient.add(CacheKey.TimeoutControlTime+techImpContralPo.getTechImpl(),0, CommonUtil.addEndTime(techImpContralPo.getConCycle(), techImpContralPo.getConCycleValue().toString()));
					}else{
						if(!outTime){
							memCachedClient.cas(CacheKey.TimeoutControlTime+techImpContralPo.getTechImpl(),0, CommonUtil.addEndTime(techImpContralPo.getConCycle(), techImpContralPo.getConCycleValue().toString()),endTime.getCas());
						}
					}
					timecounter.set(1);
				}else{
					
					if(techImpContralPo.getConVl()>timecounter.incrementAndGet()){
						techImpl.setSerTechStatus(EOPDomain.NORMAL);
						if(techImpContralPo.getConType().equals(EOPDomain.detect)){
							HttpClientUtil.sendObjFromServer(url,timeout, techImpl);
						}
						
					}
					
				}
			}
			
			
		}catch(EAAPException e){
			throw e;
			
		}catch(Exception e){
			log.error("timeoutcontrolServ system error",e);
		}
		
		
	}
	public void changeTechImplState(String sertechId)  {
		// TODO Auto-generated method stub
		
//		try{
//			Object obj = cacheService.getKey(CacheKey.techImpl+sertechId);
//			if(obj!=null){
//				TechImpl techImpl = (TechImpl)obj;
//				techImpl.setSerTechStatus(EOPDomain.ONLINE);
//			}
//		}catch(Exception e){
//			log.error(e.getStackTrace());
//		}
		
	}
	public MemcachedClient getMemCachedClient() {
		return memCachedClient;
	}
	public void setMemCachedClient(MemcachedClient memCachedClient) {
		this.memCachedClient = memCachedClient;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	
	
}
