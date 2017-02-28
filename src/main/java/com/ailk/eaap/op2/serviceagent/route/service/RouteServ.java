package com.ailk.eaap.op2.serviceagent.route.service;

import java.io.File;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;



import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.util.CommonUtil;
import com.ailk.eaap.o2p.common.util.date.UTCTimeUtil;
import com.ailk.eaap.o2p.task.model.TaskContentBean;
import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.CacheFlagCommon;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.common.EAAPConstants;
import com.ailk.eaap.op2.serviceagent.common.BatchStatus;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ExecutionContext;
import com.ailk.eaap.op2.serviceagent.common.FileMessageBO;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.log.MessageLogService;
import com.ailk.eaap.op2.serviceagent.route.service.batch.IBatchService;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.EndpointSpec;
import com.ailk.eaap.op2.bo.MessageFlow;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.RoutePolicy;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
//import com.asiainfo.integration.o2p.billing.activeMq.dao.IActiveMqProducer;
//import com.asiainfo.integration.o2p.billing.APICdrPacketBean;

@Service
public class RouteServ implements IRouteServ, Serializable{

	private static final long serialVersionUID = 1L;
	@Autowired
	private IMemcacheManageServ cacheService;
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	@Autowired
	private transient IBatchService batchService;
	@Autowired
	private MessageLogService messageLogService;
	private static int sequenceNo = 0;
	private static int maxInt = 2147483647;
	private String serviceAgentApiSwitch;

	

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	public void setTaskExecutor(ThreadPoolTaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	public void setBatchService(IBatchService batchService) {
		this.batchService = batchService;
	}

	public boolean isServiceAgentApiSwitch() {
		serviceAgentApiSwitch= CommonUtil.getPropertyValue("serviceAgent_api");
		if("true".equals(serviceAgentApiSwitch)){
			return true;
		}else{
			return false;
		}
	}


	private static final Logger logger = Logger.getLog(RouteServ.class);
	@Autowired
	private transient EvaluatorFactory evaluatorFactory;	
	@Autowired
	private transient IServiceExchangeService serviceExchangeService;
	@Autowired
	private transient IMessageBoHisService messageBoHisSer;
//	@Autowired
//	private  transient  IActiveMqProducer collectingActiveMq;
	public MessageBO route(MessageBO messageBo)  {
		 
			SerInvokeIns s = messageBo.getSerInvokeIns();
			MessageFlow mf = s.getMessageFlow();
			if(mf==null){
				s = (SerInvokeIns) cacheService.getKey(CacheKey.serInvokeIns+messageBo.getService().getServiceId()+messageBo.getSrcsyscode(),messageBo.getTenant().getTenantId());
				mf = s.getMessageFlow();
				if(mf == null) {
					throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{"MessageFlow is null, ser_invoke_ins_id="+s.getSerInvokeInsId()}, null); 
				}
			}
			
			return routeMsg(mf.getFirstRouteEndpoint(),messageBo);
		
	}
	
	public MessageBO route(String jsonMsg)  {
		return null;
	}
	public MessageBO routeMsg(RouteEndpoint endpoint, MessageBO messageBo)
			 {
		if(endpoint == null) {
			throw new BusinessException(9064, "o2p-serviceagent-core.9064", new String[]{"MessageFlowId="+messageBo.getSerInvokeIns().getMessageFlow().getMessageFlowId()}, null);
		}

		if(endpoint.getChildEndpoints()==null || endpoint.getChildEndpoints().size()<1){
			throw new BusinessException(9065, "o2p-serviceagent-core.9065", new String[]{"MessageFlowId="+messageBo.getSerInvokeIns().getMessageFlow().getMessageFlowId()}, null);
		}

		messageBo.setCurrryRouteEndpoint(endpoint);
		messageBo = serviceExchangeService.exchange(endpoint.getCurrentEndpoint(), messageBo);
		if(messageBo.isNeedBreak()){
			return messageBo;
		}
		if(endpoint.getCurrentEndpoint().getEndpointSpecCode().equals(EndpointSpec.ASYN)){
			return messageBo;
		}
		
		callEndpoint(endpoint,messageBo);
		
		// 端点处理完成，根据开关控制是否发送话单
 		if (isServiceAgentApiSwitch()) {
 			ratingAPICdrPacketBean(messageBo);
		}
		
		return messageBo;	
	}
	public void callEndpoint(RouteEndpoint endpoint, MessageBO messageBo) {
		
		if(endpoint!=null &&endpoint.getChildEndpoints()!=null){
			for(ToRouteEndpoint tep : endpoint.getChildEndpoints()){
				
				if(checkRouteCondition(tep, messageBo)){
					
					//类型为MULTICAST
					if (RoutePolicy.MULTICAST.equalsIgnoreCase(tep.getRoutePolicy().getRuleStrategyCode())) {
						Thread thread = new Thread(new RouteThread(tep, messageBo));
						thread.start();
						try {
							thread.join();
						} catch (InterruptedException e) {
							logger.error(LogModel.EVENT_APP_EXCPT, e);
						}
					}
					//批处理
					else if(RoutePolicy.BATCH.equalsIgnoreCase(tep.getRoutePolicy().getRuleStrategyCode())) {
						
						//任务已完成则直接返回
						ExecutionContext ec = batchService.getExecutionContext(messageBo);
						if(BatchStatus.COMPLETED.equals(ec.getStatus())) {
							if (logger.isDebugEnabled()) {
								logger.debug("batch task was completed, endpointId= {0}", tep.getToEndpoint().getCurrentEndpoint().getEndpointId());
							}
							break;
						}
						
						taskExecutor.execute(new BatchThread(tep, messageBo));
						break;
					}
					else{
						//设置当前端点
						messageBo.setCurrryRouteEndpoint(tep.getToEndpoint());
						messageBo = serviceExchangeService.exchange(tep.getToEndpoint().getCurrentEndpoint(), messageBo);
						if(messageBo.isNeedBreak()){
							break;
						}
					
						//如果为异步端点，则停止路由，异步进程读取后从当前端点继续路由
						//如果为循环端点，则停止路由，异步进程读取后从当前端点继续路由
						if(tep.getToEndpoint().getCurrentEndpoint().getEndpointSpecCode().equals(EndpointSpec.ASYN)
								||tep.getToEndpoint().getCurrentEndpoint().getEndpointSpecCode().equals(EndpointSpec.CIRCLE)){
							return;
						}						
						//空数据不往下执行
						if (isEmpty(messageBo.getMsgBody()) && isEmpty(messageBo.getMsgHead()) && isEmpty(messageBo.getMessageMap())) {
							if (logger.isDebugEnabled()) {
								logger.debug("messageBO msgBody/msgHead/MessageMap is null,route end. endpointId={0}", tep.getToEndpoint().getCurrentEndpoint().getEndpointId());
							}
							break;
						} else {
							callEndpoint(tep.getToEndpoint(), messageBo);
						}

						if("client".equals(messageBo.getServiceAgentMode())){//set authcode
							String authCode = "";
							long reqTime = System.currentTimeMillis();
							try{
								final int offset = 389457;// offset为固定值，避免被猜到种子来源（和密码学中的加salt有点类似）  
								long seed = System.currentTimeMillis() + offset; 
								SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
								sr.setSeed(seed);
								String randomNum= String.valueOf(sr.nextInt());
								String value = reqTime + randomNum+"";//获取数据指纹，指纹是唯一的
								MessageDigest md = MessageDigest.getInstance(EAAPConstants.ENCODE_TYPE);
					            byte[] b = md.digest(value.getBytes());//产生数据的指纹  
					            //Base64编码
					            authCode = Base64.encodeBase64String(b);
								messageBo.setSourceCode(value);
							}catch(NoSuchAlgorithmException e){
								authCode = "error";
								logger.error("Generate auth-code error!", e);
							}
							messageBo.setReqTime(reqTime);
							messageBo.setAuthCode(DigestUtils.md5Hex(authCode));
							
						}
						break;
					}
					
				}
			}
		}
	}
	
	private boolean isEmpty(Object msgBody) {
		
		if(msgBody == null) {
			
			return true;
		}  else if(msgBody instanceof File[]) {
			
			return ((File[])msgBody).length <= 0 ;
		} else if(msgBody instanceof Map) {
			return ((Map)msgBody).isEmpty();
		} else if(msgBody instanceof Collection) {
			return ((Collection)msgBody).isEmpty();
		}
		return false;
	}

	private void findDst(RouteEndpoint endpoint, MessageBO messageBo) {
		if(endpoint!=null &&endpoint.getChildEndpoints()!=null){
			for(ToRouteEndpoint tep : endpoint.getChildEndpoints()){
				
				if(checkRouteCondition(tep, messageBo)){
					String endpointCode = tep.getToEndpoint().getCurrentEndpoint().getEndpointSpecCode();
					
					if(endpointCode!=null && endpointCode.length()>4){
						String subCode = endpointCode.substring(endpointCode.length()-4,endpointCode.length());
						
						if(EndpointSpec.CALL.equalsIgnoreCase(subCode)){
							
							TechImpl tech = getTech(tep.getToEndpoint().getCurrentEndpoint(),messageBo);
							
							Component comp = (Component)cacheService.getKey(CacheKey.Component+tech.getComponentCode(), messageBo.getTenant().getTenantId());
							
							messageBo.setDstComponent(comp);
							logger.debug(comp.getCode());
							messageBo.setRegServiceCode(tech.getServiceCode());
							messageBo.setRegServiceVersion(tech.getServiceVersion());
							messageBo.setDstOrgID(comp.getOrg().getOrgCode());
							messageBo.setDstSyscode(comp.getCode());
							break;
						}else if(EndpointSpec.BATCH_PRARSE.equalsIgnoreCase(subCode)){
							
							Component comp = (Component)cacheService.getKey(CacheKey.Component+EOPDomain.EOP_COMPONENT, messageBo.getTenant().getTenantId());
							
							messageBo.setDstComponent(comp);
							
							messageBo.setDstOrgID(comp.getOrg().getOrgCode());
							messageBo.setDstSyscode(comp.getCode());
							break;
						}else{
							findDst(tep.getToEndpoint(), messageBo);
						}
					}
				}
			}
		}
		
		
	}
	
	private  TechImpl getTech(Endpoint endpoint, MessageBO messageBo) {
		Object obj = endpoint.getAttrMap().get(EndpointAttr.ServiceTechId);
		String serTechId = "";
		
		if(obj!=null){
			
			serTechId = obj.toString();
		} else {
			
			throw new BusinessException(9066, "o2p-serviceagent-core.9066", new String[]{"EndpointAttr="+EndpointAttr.ServiceTechId}, null);
		}
		
		TechImpl tech = (TechImpl) cacheService.getKey(CacheKey.techImpl+serTechId, messageBo.getTenant().getTenantId());
		
		if(tech==null){
			throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[]{"serTechId="+serTechId}, null);
		}
		
		return tech;
	}

	
	private boolean checkRouteCondition(ToRouteEndpoint tep, MessageBO messageBo) {
		String strategy = tep.getRoutePolicy().getRuleStrategyCode();
		if(RoutePolicy.DIRECT.equalsIgnoreCase(strategy) ||
				RoutePolicy.MULTICAST.equalsIgnoreCase(strategy)
				|| RoutePolicy.BATCH.equalsIgnoreCase(strategy)) {
			return true;
		}
		else if(RoutePolicy.CONTENT_BASED.equalsIgnoreCase(strategy) && "server".equals(messageBo.getServiceAgentMode())){
			return RouteConditionHelper.evalRouteCondition(evaluatorFactory, tep.getRoutePolicy().getRouteCondition(), messageBo);			
		}
		else {
			return false;
		}
	}

	public IServiceExchangeService getServiceExchangeService() {
		return serviceExchangeService;
	}

	public void setServiceExchangeService(
			IServiceExchangeService serviceExchangeService) {
		this.serviceExchangeService = serviceExchangeService;
	}

	public EvaluatorFactory getEvaluatorFactory() {
		return evaluatorFactory;
	}

	public void setEvaluatorFactory(EvaluatorFactory evaluatorFactory) {
		this.evaluatorFactory = evaluatorFactory;
	}

	public Endpoint findCallBack(RouteEndpoint routeEndpoint,
			MessageBO messageBo)  {
		if(routeEndpoint!=null &&routeEndpoint.getChildEndpoints()!=null){
			for(ToRouteEndpoint tep : routeEndpoint.getChildEndpoints()){
				if(checkRouteCondition(tep, messageBo)){
					if(EndpointSpec.ASYNCALLBACK.equalsIgnoreCase(tep.getToEndpoint().getCurrentEndpoint().getEndpointSpecCode())){
						return tep.getToEndpoint().getCurrentEndpoint();
					}else{
						findCallBack(tep.getToEndpoint(), messageBo);
					}
				}
			}
		}
		return null;
	}

    class RouteThread implements Runnable {

        private ToRouteEndpoint toRouteEndpoint;
        private MessageBO messageBO;

        RouteThread(ToRouteEndpoint toRouteEndpoint, MessageBO messageBO) {
            this.toRouteEndpoint = toRouteEndpoint;
            this.messageBO = messageBO;
        }

        @Override
        public void run() {
            try {
                messageBO.setCurrryRouteEndpoint(toRouteEndpoint.getToEndpoint());
            	messageBO = serviceExchangeService.exchange(toRouteEndpoint.getToEndpoint().getCurrentEndpoint(), messageBO);
            	if(messageBO.isNeedBreak()){
    				return ;
    			}
                if(toRouteEndpoint.getToEndpoint().getCurrentEndpoint().getEndpointSpecCode().equals(EndpointSpec.ASYN)
                        ||toRouteEndpoint.getToEndpoint().getCurrentEndpoint().getEndpointSpecCode().equals(EndpointSpec.CIRCLE)){
                    return;
                }
                //增加分支任务标示
                if(!messageBO.getTaskStyle().equals(TaskContentBean.CONCURRENCY_TASK)){
                	
                	String taskCacheFlag = CacheFlagCommon.TASK_FLAG+messageBO.getSerInvokeIns().getSerInvokeInsId()+CacheFlagCommon.PUB_FLAG+toRouteEndpoint.getToEndpoint().getCurrentEndpoint().getEndpointId();
                	logger.info("public task flag : {0}", taskCacheFlag);
                	String[] keys = new String[]{taskCacheFlag};
                	messageBO.setTaskCacheFlag(keys);
                }
            	
                callEndpoint(toRouteEndpoint.getToEndpoint(), messageBO);
                messageLogService.buildMessageLog(messageBO);
            } catch (BusinessException e) {
            	messageLogService.buildMessageLog(messageBO);
                logger.error("Thread Router: " + e.getMessage());
            }
        }
    }

    class BatchThread implements Runnable {

        private ToRouteEndpoint toRouteEndpoint;
        private MessageBO messageBO;

        BatchThread(ToRouteEndpoint toRouteEndpoint, MessageBO messageBO) {
            this.toRouteEndpoint = toRouteEndpoint;
            this.messageBO = messageBO;
        }

        @Override
        public void run() {
        	try {
        		//设置当前端点
        		messageBO.setCurrryRouteEndpoint(toRouteEndpoint.getToEndpoint());
				batchService.execute(toRouteEndpoint, messageBO);
			} catch (Exception e) {
				
				logger.error(LogModel.EVENT_APP_EXCPT, e);
			}
        }
    }
    
//    class ApiThread implements Runnable {
//    	private APICdrPacketBean apiCdrPacket;
//    	ApiThread(APICdrPacketBean apiCdrPacket) {
//    		this.apiCdrPacket = apiCdrPacket;
//    	}
//    	public void run () {
//    		collectingActiveMq.sendToActiveMq(apiCdrPacket,"collecting");			
//    	}
//    	
//    }

	
	  /**
		 * ratingAPICdrPacketBean:(组装话单). 
		 */
		@SuppressWarnings("rawtypes")
		private void ratingAPICdrPacketBean(MessageBO bo) {
			
			try{
				 
				if (bo.getMsgBody() == null) {
					logger.error("API access history messageBody is empty");
					return ;
				}
				// 获取话单交易流水
				String transactionID = bo.getTransactionID();
				if ("".equals(transactionID) || transactionID == null) {
					// 为空通过接口获取信息
					transactionID = getIdByUUId();
				}
				// 获取机构ID(发起方)
				Component component = (Component) cacheService
						.getKey(CacheKey.Component
								+ bo.getSerInvokeIns().getComponentCode(),bo.getTenant().getTenantId());
				Org org = (Org) cacheService.getKey(CacheKey.Org + component.getOrgCode(),bo.getTenant().getTenantId());
				if (org == null) {
					logger.error("Org is null {0}", component.getOrgCode());
					return ;
				}
				// API
				Api api = (Api) cacheService.getKey(CacheKey.Api
						+ bo.getSerInvokeIns().getServiceId(),bo.getTenant().getTenantId());
				if (api == null) {
					logger.error("Api is null {0}", bo.getSerInvokeIns().getServiceId());
					return ;
				}
				//APP
				App app = (App) cacheService.getKey(CacheKey.AppComp + component.getCode(),bo.getTenant().getTenantId());
				if (app == null) {
					logger.error("App is null {0}", component.getCode());
					return ;
				}
				// 1文件，2一般话单
				int messageType = 2;
				if (bo instanceof FileMessageBO) {
					messageType = 1;
				}
				// 流量
				long l = 0;
				if (bo.getMessageMap().size() > 0) {
					l += bo.getMessageMap().toString().length();
				}
				if (bo.getMsgHead().size() > 0) {
					l += bo.getMsgHead().toString().length();
				}
				
				if (messageType == 2) {
					l += bo.getMsgBody().toString().length();
				} else if (messageType == 1) {
					File[] files = ((FileMessageBO) bo).getFile();
					for (File file : files) {
						l += file.length();
					}
				}
				
//				APICdrPacketBean apiCdrPacket = new APICdrPacketBean();
//				// 话单报文头
//				apiCdrPacket.setVersion((byte) 0x01);
//				apiCdrPacket.setReservedBit((byte) 0);
//				apiCdrPacket.setMessageType((byte) 0x01);
//				apiCdrPacket.setMessageTime(getUTCTimestampFormat("yyyyMMddHHmmssSSSSSS"));
//				apiCdrPacket.setMessageSequenceNo(getSequenceNo());
//				// 话单报文体
//				String body = transactionID + "|"
//						+ org.getOrgId() + "|" + app.getAppId()
//						+ "|" + api.getApiId() + "|"
//						+ l;
//				apiCdrPacket.setMessageContentDb(body.getBytes());
//				apiCdrPacket.setTenantId(bo.getTenant().getTenantId());
//				// 发送队列
//				Thread thread = new Thread(new ApiThread(apiCdrPacket));
//				thread.start();
			}catch(BusinessException e){
				logger.error("send data to collecting queue  error {0}", e);
			}
			
		
		}

		/**
		 * getTransactionId:(消息交易流水ID). 
		 */
		public String getTransactionId(SerInvokeIns serIn) {
			String time = getUTCTimestampFormat("yyyyMMdd");
			String id = getIdByUUId();
			return serIn.getComponentId() + "" + time + "" + id;
		}

		/**
		 * getIdByUUId:(根据UUID获取ID). 
		 */
		public String getIdByUUId() {
			return UUID.randomUUID().toString().replace("-", "").toUpperCase();
		}

		/**
		 * getUTCTimestampFormat:(获取UTC时间). 
		 */
	public String getUTCTimestampFormat(String simpleDateFormat) {
		Timestamp time = UTCTimeUtil.getUTCTimestamp();
		SimpleDateFormat sdf = new SimpleDateFormat(simpleDateFormat);
		return sdf.format(time);
	}
		
	/**
	 * getSequenceNo:(获取MessageSeq). 
	 */
	public static int getSequenceNo() {
		if (sequenceNo == maxInt) {
			sequenceNo = 1;
		}else{
			sequenceNo += 1;
		}
		
		return sequenceNo;
	}
	
	public static long getRamdomNum() throws NoSuchAlgorithmException{
		final int offset = 938768;// offset为固定值，避免被猜到种子来源（和密码学中的加salt有点类似）  
		long seed = System.currentTimeMillis() + offset; 
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		sr.setSeed(seed);
		long returnValue = sr.nextInt();
		return returnValue>0?returnValue:(0-returnValue);//返回均为正整数
	}
	

	public void setMessageLogService(MessageLogService messageLogService) {
		this.messageLogService = messageLogService;
	}
	
	public void setMessageBoHisSer(IMessageBoHisService messageBoHisSer) {
		this.messageBoHisSer = messageBoHisSer;
	}

//	public IActiveMqProducer getCollectingActiveMq() {
//		return collectingActiveMq;
//	}
//
//	public void setCollectingActiveMq(IActiveMqProducer collectingActiveMq) {
//		this.collectingActiveMq = collectingActiveMq;
//	}
//	
}
