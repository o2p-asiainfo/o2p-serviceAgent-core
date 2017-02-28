package com.ailk.eaap.op2.serviceagent.validate.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.CtlCounterms2Comp;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

@Service
public class FlowControlServ implements IFlowControlService {

	@Autowired
	private IMemcacheManageServ cacheService;
	
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}
	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}


	private static Map<String,Object>  flowMap = new ConcurrentHashMap<String, Object>();
	private static final Logger LOG = Logger.getLogger(FlowControlServ.class);


	public void flowControl(MessageBO<?> msg) {

		String serInvokeInsId = msg.getSerInvokeIns().getSerInvokeInsId().intValue()+"";
		Object  timeflowObj = cacheService.getKey(CacheKey.FLOW+serInvokeInsId+EOPDomain.TIMES, msg.getTenant().getTenantId());
		Object  sizeflowObj = cacheService.getKey(CacheKey.FLOW+serInvokeInsId+EOPDomain.SIZE, msg.getTenant().getTenantId());
		Object  threadflowObj = cacheService.getKey(CacheKey.FLOW+serInvokeInsId+EOPDomain.THREAD_NUM, msg.getTenant().getTenantId());

		if(timeflowObj == null && sizeflowObj == null && threadflowObj ==null) {
			
			LOG.debug("timeflowObject,sizeflowObject,threadflowObject all null! ");
			return;
		}
		
		synchronized (serInvokeInsId) {
			
			timeFlow(timeflowObj, serInvokeInsId);
			
			sizeFlow(sizeflowObj, serInvokeInsId, msg);
		
			threadFlow(threadflowObj, serInvokeInsId, msg);
		}
		
	}

	
	private void threadFlow(Object threadflowObj, String serInvokeInsId, MessageBO<?> msg) {

		CtlCounterms2Comp threadflow = null;
		
		if(threadflowObj!=null){
			threadflow = (CtlCounterms2Comp)threadflowObj;
		}
		
		if(threadflow!=null && EOPDomain.NORMAL.equals(threadflow.getEffectState())){

			Object threadcounterObj=flowMap.get(CacheKey.THREADFLOWCOUNT+msg.getSerInvokeIns().getSerInvokeInsId());
			int threadCount = 0;
			LOG.debug(CacheKey.THREADFLOWCOUNT+msg.getSerInvokeIns().getSerInvokeInsId());
			
			if(threadcounterObj!=null){
				threadCount = Integer.parseInt(threadcounterObj.toString());
			}
			
			int newThreadCount = threadCount+1;
			LOG.debug("current thread number:"+newThreadCount);
			if(Integer.valueOf(threadflow.getCutmsValue())<newThreadCount){
				
				throw new BusinessException(9017, "o2p-serviceagent-core.9021", new String[]{threadflow.getCutmsValue()+"",newThreadCount+""+"  [server instance]"}, null); 
			}else{
				flowMap.put(CacheKey.THREADFLOWCOUNT+msg.getSerInvokeIns().getSerInvokeInsId(),newThreadCount);
			}
		} else {
			LOG.debug("serInvokeInsId:"+serInvokeInsId+",threadFlow is null or the state not normal.");
		}
	}

	private void sizeFlow(Object sizeflowObj, String serInvokeInsId, MessageBO<?> msg) {
		LOG.debug("serInvokeInsId:"+serInvokeInsId+", sizeFlow begin");
		CtlCounterms2Comp sizeflow = null;
		if(sizeflowObj!=null){
			sizeflow = (CtlCounterms2Comp)sizeflowObj;
		}
		
		//设置报文大小流量控制周期
		if((sizeflow!=null ) &&  (EOPDomain.NORMAL.equals(sizeflow.getEffectState()))){
			
			String sizeEndTimeStr = null;
			Object  sizeEndTime = flowMap.get(CacheKey.FLOWENDTIME+serInvokeInsId+EOPDomain.SIZE);
			boolean sizeOutTime = false;
			
			//第一次调用
			if (sizeEndTime == null){
				sizeEndTimeStr = CommonUtil.addEndTime(sizeflow.getCycleType().toString(), sizeflow.getCycleValue().toString());
				flowMap.put(CacheKey.FLOWENDTIME+serInvokeInsId+EOPDomain.SIZE, sizeEndTimeStr);
			}
			
			if(sizeEndTime != null) {
				sizeEndTimeStr = sizeEndTime.toString();
			}
			sizeOutTime = CommonUtil.isOutTime(sizeEndTimeStr);
	
			if(!sizeOutTime){
				sizeEndTimeStr = CommonUtil.addEndTime(sizeflow.getCycleType().toString(), sizeflow.getCycleValue().toString());
				flowMap.put(CacheKey.FLOWENDTIME+serInvokeInsId+EOPDomain.SIZE, sizeEndTimeStr);
				 
			}
			
			String msgContent = msg.toString();
			if(EOPDomain.NORMAL.equals(sizeflow.getEffectState())){
				
				if(!sizeOutTime){
					//超时重置
					flowMap.put(CacheKey.SIZEFLOWCOUNT+serInvokeInsId,"0");
				} 
				Object lengObj = flowMap.get(CacheKey.SIZEFLOWCOUNT+serInvokeInsId);
				int leng = 0;
				if(lengObj!=null){
					leng = Integer.parseInt(lengObj.toString());
				} 
				
				int newLeng = leng+msgContent.length();
				LOG.debug("serInvokeInsId:"+serInvokeInsId+",current size="+newLeng+"B");
				flowMap.put(CacheKey.SIZEFLOWCOUNT+serInvokeInsId,newLeng+"");
				if(Integer.valueOf(sizeflow.getCutmsValue())*1024*1024<newLeng){

					String cycle = "";
					if(CommonUtil.MINUTE.equals(sizeflow.getCycleType())){
						cycle = "minute";
					} else if(CommonUtil.HOUR.equals(sizeflow.getCycleType())){
						cycle = "hour";
					}
					sizeEndTimeStr=buildTimeStr(sizeEndTimeStr);
					throw new BusinessException(9017, "o2p-serviceagent-core.9020", new String[]{sizeflow.getCutmsValue()+"MB",sizeflow.getCycleValue()+cycle,newLeng+"B", sizeEndTimeStr+" (yyyyMMddHHmmss)"+"  [server instance]"}, null); 
				}
			}
		} else {
			LOG.debug("serInvokeInsId:"+serInvokeInsId+",sizeflow is null or the state not normal.");
		}
	}
	
	private void timeFlow(Object timeflowObj, String serInvokeInsId) {
		LOG.debug("serInvokeInsId:"+serInvokeInsId+", timeFlow begin");
		CtlCounterms2Comp timeflow = null;
		if(timeflowObj!=null){
			timeflow = (CtlCounterms2Comp)timeflowObj;
		}
		
		//设置时间流量控制周期
		if((timeflow!=null)&&(EOPDomain.NORMAL.equals(timeflow.getEffectState()))){
			
			String timeEndTimeStr = null;
			Object  timeEndTime = flowMap.get(CacheKey.FLOWENDTIME+serInvokeInsId+EOPDomain.TIMES);
			boolean timeOutTime = false;
			
			//第一次调用
			if(timeEndTime==null){
				
				flowMap.put(CacheKey.FLOWENDTIME+serInvokeInsId+EOPDomain.TIMES, CommonUtil.addEndTime(timeflow.getCycleType().toString(), timeflow.getCycleValue().toString()));
			}
			
			if(timeEndTime != null) {
				timeEndTimeStr = timeEndTime.toString();
			}
			//设置的周期是否已到期
			timeOutTime = CommonUtil.isOutTime(timeEndTimeStr);
			
			//没有超时就重置下一周期时间
			if(!timeOutTime){
				timeEndTimeStr = CommonUtil.addEndTime(timeflow.getCycleType().toString(), timeflow.getCycleValue().toString());
				flowMap.put(CacheKey.FLOWENDTIME+serInvokeInsId+EOPDomain.TIMES, timeEndTimeStr);
			}
			
			if(!timeOutTime){
				
				flowMap.put(CacheKey.TIMESFLOWCOUNT+serInvokeInsId,"0");
			} 

			Object countObj = flowMap.get(CacheKey.TIMESFLOWCOUNT+serInvokeInsId);
			int count = 0;
			if(countObj != null) {
				count = Integer.parseInt(countObj.toString());
			}
			
			int newCount = count+1;
			LOG.debug("serInvokeInsId:"+serInvokeInsId+", currentCount:"+newCount);
			flowMap.put(CacheKey.TIMESFLOWCOUNT+serInvokeInsId, newCount+"");
			if(Integer.valueOf(timeflow.getCutmsValue())< newCount){

				String cycle = "";
				if(CommonUtil.MINUTE.equals(timeflow.getCycleType())){
					cycle = "minute";
				} else if(CommonUtil.HOUR.equals(timeflow.getCycleType())){
					cycle = "hour";
				}
				timeEndTimeStr=buildTimeStr(timeEndTimeStr);
				throw new BusinessException(9017, "o2p-serviceagent-core.9019", new String[]{timeflow.getCutmsValue()+"",timeflow.getCycleValue()+cycle,newCount+"", timeEndTimeStr+" (yyyyMMddHHmmss)"+"  [server instance]"}, null); 
			}
		}else {
			LOG.debug("serInvokeInsId:"+serInvokeInsId+",timeflow is null or the state not normal.");
		}
	}
	
	private String buildTimeStr(String timeStr) {
		return  timeStr.substring(0, 4)+"-"+timeStr.substring(4, 6)+"-"+timeStr.substring(6, 8)
		+" "+timeStr.substring(8, 10)+":"+timeStr.substring(10, 12)+":"+timeStr.substring(12, 14);
	}
	
	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		synchronized (servId) {
			Object threadcounterObj=flowMap.get(CacheKey.THREADFLOWCOUNT+servId);
			if(threadcounterObj!=null){
				Integer thread = Integer.parseInt(threadcounterObj.toString());
				
				if(thread.intValue()>=1){
					int c = thread.intValue()-1;
					flowMap.put(CacheKey.THREADFLOWCOUNT+servId, c+"");
				}else{
					flowMap.put(CacheKey.THREADFLOWCOUNT+servId, "0");
				}
				
			}
		}
	}
}