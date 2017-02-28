package com.ailk.eaap.op2.serviceagent.validate.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.CtlCounterms2Comp;
import com.ailk.eaap.op2.bo.TechImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Mar 5, 2013
 * <hr>
 * <hr>
 */
public class DstFlowControlServ implements IDstFlowControlServ{

	private IMemcacheManageServ cacheService;
	
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}



	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}



	private static final Logger log = Logger.getLogger(DstFlowControlServ.class);
	private static Map<String,Object>  flowMap = new ConcurrentHashMap<String, Object>();
	public void flowControl(TechImpl techImpl,MessageBO messageBo)  {
			log.debug("dstFlowControl begin");
			String serTechID =techImpl.getSerTechId().intValue()+"";
			
			List<CtlCounterms2Comp> ctls = techImpl.getCtls();
			if(ctls!=null && ctls.size()>0){
				for (CtlCounterms2Comp ctlCounterms2Comp : ctls) {
					
					if(EOPDomain.NORMAL.equals(ctlCounterms2Comp.getEffectState())){
						
						synchronized (serTechID) {
							String ccCd = ctlCounterms2Comp.getCcCd().toString();
							if(ccCd.equals(EOPDomain.TIMES)){
								
								timeFlow(ctlCounterms2Comp, serTechID);
							}else if(ccCd.equals(EOPDomain.SIZE)){
								
								sizeFlow(ctlCounterms2Comp, serTechID, messageBo);
							}else if(ccCd.equals(EOPDomain.THREAD_NUM)){
								
								threadFlow(ctlCounterms2Comp, serTechID);
							}
							
						}
						
					} else {
						log.debug("dstFlowControl state are not normal (A)");
					}
					
				}
			} else {
				log.debug("not configed dstFlowControl");
			}
		
	}
	
	private void threadFlow(CtlCounterms2Comp threadflow, String serTechID) {
		log.debug("techimplId="+serTechID+",threadFlow begin");
		if(threadflow!=null){

			Object threadcounterObj=flowMap.get(CacheKey.DSTTHREADFLOWCOUNT+serTechID);
			int threadCount = 0;
		
			if(threadcounterObj!=null){
				threadCount = Integer.parseInt(threadcounterObj.toString());
			}
			log.debug("techimplId="+serTechID+",current thread count = "+threadCount);
			
			int newThreadCount = threadCount+1;
			if(Integer.valueOf(threadflow.getCutmsValue())<newThreadCount){
				
				throw new BusinessException(9021, "o2p-serviceagent-core.9021", new String[]{threadflow.getCutmsValue()+"",newThreadCount+""+"   [technology implementation]"}, null); 
			}else{
				flowMap.put(CacheKey.DSTTHREADFLOWCOUNT+serTechID,newThreadCount);
			}
		}
	}

	private void sizeFlow(CtlCounterms2Comp sizeflow, String serTechID, MessageBO<?> msg) {
		log.debug("techimplId="+serTechID+",sizeFlow begin");
		//设置报文大小流量控制周期
		if((sizeflow!=null )){
			
			String sizeEndTimeStr = null;
			Object  sizeEndTime = flowMap.get(CacheKey.DSTFLOWENDTIME+serTechID+EOPDomain.SIZE);
			boolean sizeOutTime = false;
			
			//第一次调用
			if (sizeEndTime == null){
				sizeEndTimeStr = CommonUtil.addEndTime(sizeflow.getCycleType().toString(), sizeflow.getCycleValue().toString());
				flowMap.put(CacheKey.DSTFLOWENDTIME+serTechID+EOPDomain.SIZE, sizeEndTimeStr);
			}
			
			if(sizeEndTime != null) {
				sizeEndTimeStr = sizeEndTime.toString();
			}
			sizeOutTime = CommonUtil.isOutTime(sizeEndTimeStr);
	
			if(!sizeOutTime){
				sizeEndTimeStr = CommonUtil.addEndTime(sizeflow.getCycleType().toString(), sizeflow.getCycleValue().toString());
				flowMap.put(CacheKey.DSTFLOWENDTIME+serTechID+EOPDomain.SIZE, sizeEndTimeStr);
				 
			}
			
			String msgContent = msg.toString();
			if(EOPDomain.NORMAL.equals(sizeflow.getEffectState())){
				
				if(!sizeOutTime){
					//超时重置
					flowMap.put(CacheKey.DSTSIZEFLOWCOUNT+serTechID,"0");
				} 
				Object lengObj = flowMap.get(CacheKey.DSTSIZEFLOWCOUNT+serTechID);
				int leng = 0;
				if(lengObj!=null){
					leng = Integer.parseInt(lengObj.toString());
				} 
				
				int newLeng = leng+msgContent.length();
				log.debug("techimplId="+serTechID+",current total leng = "+newLeng);
				flowMap.put(CacheKey.DSTSIZEFLOWCOUNT+serTechID,newLeng+"");
				if(Integer.valueOf(sizeflow.getCutmsValue())*1024*1024<newLeng){

					String cycle = "";
					if(CommonUtil.MINUTE.equals(sizeflow.getCycleType())){
						cycle = "minute";
					} else if(CommonUtil.HOUR.equals(sizeflow.getCycleType())){
						cycle = "hour";
					}
					sizeEndTimeStr=buildTimeStr(sizeEndTimeStr);
					throw new BusinessException(9020, "o2p-serviceagent-core.9020", new String[]{sizeflow.getCutmsValue()+"MB",sizeflow.getCycleValue()+cycle,newLeng+"B", sizeEndTimeStr+" (yyyyMMddHHmmss)"+"   [technology implementation]"}, null); 
				}
			}
		}
	}
	
	private void timeFlow(CtlCounterms2Comp timeflow, String serTechID) {
		log.debug("techimplId="+serTechID+",timeFlow begin");
		//设置时间流量控制周期
		if((timeflow!=null)){
			
			String timeEndTimeStr = null;
			Object  timeEndTime = flowMap.get(CacheKey.DSTFLOWENDTIME+serTechID+EOPDomain.TIMES);
			boolean timeOutTime = false;
			
			//第一次调用
			if(timeEndTime==null){
				
				flowMap.put(CacheKey.DSTFLOWENDTIME+serTechID+EOPDomain.TIMES, CommonUtil.addEndTime(timeflow.getCycleType().toString(), timeflow.getCycleValue().toString()));
			}
			
			if(timeEndTime != null) {
				timeEndTimeStr = timeEndTime.toString();
			}
			//设置的周期是否已到期
			timeOutTime = CommonUtil.isOutTime(timeEndTimeStr);
			
			//没有超时就重置下一周期时间
			if(!timeOutTime){
				timeEndTimeStr = CommonUtil.addEndTime(timeflow.getCycleType().toString(), timeflow.getCycleValue().toString());
				flowMap.put(CacheKey.DSTFLOWENDTIME+serTechID+EOPDomain.TIMES, timeEndTimeStr);
			}
			
			if(!timeOutTime){
				
				flowMap.put(CacheKey.DSTTIMESFLOWCOUNT,"0");
			} 

			Object countObj = flowMap.get(CacheKey.DSTTIMESFLOWCOUNT);
			int count = 0;
			if(countObj != null) {
				count = Integer.parseInt(countObj.toString());
			}
			
			int newCount = count+1;
			log.debug("techimplId="+serTechID+",current count = "+newCount);
			flowMap.put(CacheKey.DSTTIMESFLOWCOUNT, newCount+"");
			if(Integer.valueOf(timeflow.getCutmsValue())< newCount){

				String cycle = "";
				if(CommonUtil.MINUTE.equals(timeflow.getCycleType())){
					cycle = "minute";
				} else if(CommonUtil.HOUR.equals(timeflow.getCycleType())){
					cycle = "hour";
				}
				timeEndTimeStr=buildTimeStr(timeEndTimeStr);
				throw new BusinessException(9019, "o2p-serviceagent-core.9019", new String[]{timeflow.getCutmsValue()+"",timeflow.getCycleValue()+cycle,newCount+"", timeEndTimeStr+" (yyyyMMddHHmmss)"+"   [technology implementation]"}, null); 
			}
		}
	}
	
	private String buildTimeStr(String timeStr) {
		return  timeStr.substring(0, 4)+"-"+timeStr.substring(4, 6)+"-"+timeStr.substring(6, 8)
		+" "+timeStr.substring(8, 10)+":"+timeStr.substring(10, 12)+":"+timeStr.substring(12, 14);
	}
	
	public void subtraThreadNum(TechImpl techImpl)  {
		// TODO Auto-generated method stub
		
		List<CtlCounterms2Comp> ctls = techImpl.getCtls();
		if(ctls!=null && ctls.size()>0){
			for (CtlCounterms2Comp ctlCounterms2Comp : ctls) {
				
				if(ctlCounterms2Comp.getCcCd()==Integer.parseInt(EOPDomain.THREAD_NUM) && EOPDomain.NORMAL.equals(ctlCounterms2Comp.getEffectState())){
					try{
						String key = techImpl.getSerTechId().intValue()+"";
						synchronized (key) {
							Object threadCountObj=flowMap.get(CacheKey.DSTTHREADFLOWCOUNT+key);
							if(threadCountObj!=null){
								Integer threadCount = Integer.parseInt(threadCountObj.toString());
								if(threadCount.intValue()>=1){
									flowMap.put(CacheKey.DSTTHREADFLOWCOUNT, threadCount.intValue()-1);									
								}else{
									flowMap.put(CacheKey.DSTTHREADFLOWCOUNT, 0);
								}
							}
						}
					}
					catch(Exception e){
						log.error("dstflowcontrol release thread error",e);
					}
				}
			}
		}
	}

}
