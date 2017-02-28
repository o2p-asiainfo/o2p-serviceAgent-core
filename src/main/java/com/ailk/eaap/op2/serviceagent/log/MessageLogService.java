package com.ailk.eaap.op2.serviceagent.log;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.springframework.beans.factory.annotation.Autowired;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.EOPDomain;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.Response;
import com.ailk.eaap.op2.logclient.log.service.ILogDealServ;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractNodeFuzzy;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.FuzzyEncryption;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.CtgLogs;
import com.ailk.eaap.op2.bo.EndpointInteraction;
import com.ailk.eaap.op2.bo.ExceptionLogs;
import com.ailk.eaap.op2.bo.LogMessageObject;
import com.ailk.eaap.op2.bo.OriLogClob;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.linkage.rainbow.util.StringUtil;

@org.springframework.stereotype.Service
public class MessageLogService implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLog(MessageLogService.class);
	@Autowired
	private transient IMessageBoHisService messageBoHisSer;
	@Autowired
	private transient ILogDealServ logDealServ;
	@Autowired
	private transient MessageLogLevelService messageLogLevelService;
	@Autowired
	private IMemcacheManageServ cacheService;
	private Map<String, ContractFormat> contractFormatMap = new HashMap<String, ContractFormat>();
	private Map<Integer, NodeDesc> reqNodeDescMap = new HashMap<Integer, NodeDesc>();
	private Map<Integer, NodeDesc> rspNodeDescMap = new HashMap<Integer, NodeDesc>();

	private String serviceAgentMode;

	public String getServiceAgentMode() {
		return serviceAgentMode;
	}

	public void setServiceAgentMode(String serviceAgentMode) {
		this.serviceAgentMode = serviceAgentMode;
	}
	
	@SuppressWarnings("rawtypes")
	public LogMessageObject buildMessageLog(MessageBO messageBo) {

		try {
			Map<String, MessageBO> map = messageBo.getMessageBoHisMap();
			Map<String, Timestamp> timeMap = messageBo.getTimeMap();

			LogMessageObject logObject = this.buildLogMessageObject(messageBo);
			logObject.setSrcSysSign("O2P"
					+ ("client".equals(serviceAgentMode) ? "-client" : ""));
			List<NodeDesc> reqList = null;
			List<NodeDesc> rspList = null;
			// 获取版本号
			if (messageBo.getContractVer() != null) {
				ContractVersion cVersion = (ContractVersion) cacheService
						.getKey(CacheKey.ContractVer
								+ messageBo.getContractVer(), messageBo.getTenant().getTenantId());
				if (null != cVersion.getReqContractFormat()) {
					contractFormatMap.put(MessageBoHisServiceImpl.REQ,
							cVersion.getReqContractFormat());
					reqList = cVersion.getReqContractFormat().getNodeDescs();
				}
				if (null != cVersion.getRspContractFormat()) {
					contractFormatMap.put(MessageBoHisServiceImpl.RSP,
							cVersion.getRspContractFormat());
					rspList = cVersion.getRspContractFormat().getNodeDescs();
				}

				if (reqList != null && reqList.size() > 0) {
					for (NodeDesc node : reqList) {
						reqNodeDescMap.put(node.getNodeDescId(), node);
					}
				}
				if (rspList != null && rspList.size() > 0) {
					for (NodeDesc node : rspList) {
						rspNodeDescMap.put(node.getNodeDescId(), node);
					}
				}

			}

			Endpoint firstLogEndpoint = queryFirstLogEndpoint(messageBo.getSerInvokeIns(), map);
			for (Map.Entry<String, MessageBO> m : map.entrySet()) {

				MessageBO bo = m.getValue();
				Endpoint ep = bo.getCurrryRouteEndpoint().getCurrentEndpoint();

				Timestamp reqDate = timeMap.get(MessageBoHisServiceImpl.REQ+ep.getEndpointId());
				Timestamp rspDate = timeMap.get(MessageBoHisServiceImpl.RSP+ep.getEndpointId());
				if(firstLogEndpoint != null && ep ==  firstLogEndpoint && m.getKey().startsWith(MessageBoHisServiceImpl.REQ)) {
					this.buildEndpointLog(logObject, ep, bo, reqDate,rspDate,m.getKey(), messageBo);
				}
				else if(m.getKey().startsWith(MessageBoHisServiceImpl.RSP)){
					
					this.buildEndpointLog(logObject, ep, bo, reqDate,rspDate, m.getKey(), messageBo);
				}

			}
			
			this.buildCtgLog(messageBo);
			return logObject;
		} catch (BusinessException e) {
			logger.error(LogModel.EVENT_APP_EXCPT, e);
			return null;
		}
	
	}

	@SuppressWarnings("unchecked")
	public void buildCtgLog(@SuppressWarnings("rawtypes") MessageBO messageBo) {
		if(messageLogLevelService.isLogTypeOut(messageBo, MessageLogLevelService.LOG_OBJECT_CTG_LOG)) {
			EAAPException eaapException = messageBo.getEAAPException();
			if(messageBo.getEAAPException() != null && 
					ErrorDomain.ERROR_CODE_9999.equalsIgnoreCase(eaapException.getCode())) {
				CtgLogs ctgLogs = new CtgLogs();
				ctgLogs.setErrCode(eaapException.getCode());
				ctgLogs.setCreateDate(new Timestamp(System.currentTimeMillis()));
				ctgLogs.setErrorMsg(eaapException.getMessage());
				if(ctgLogs.getErrorMsg() != null && ctgLogs.getErrorMsg().length() > 250) {
					ctgLogs.setErrorMsg(ctgLogs.getErrorMsg().substring(0, 125));
				}
				if(messageBo.getTenant() != null){
				    ctgLogs.setTenantId(messageBo.getTenant().getTenantId());
				}
				messageBo.getLogMessageObject().getCtgLogsList().add(ctgLogs);
			}
		}
	}

	public Endpoint queryFirstLogEndpoint(SerInvokeIns serInvokeIns, Map<String, MessageBO> map) {
		RouteEndpoint firEndpoint = null;
		for (Map.Entry<String, MessageBO> m : map.entrySet()) {
			firEndpoint = m.getValue().getCurrryRouteEndpoint();
			break;
		}
		if(firEndpoint != null) {
			int deepth = 0;
			while(deepth <= 1000) {
				deepth ++;
				if(firEndpoint.getCurrentEndpoint() != null && "Y".equalsIgnoreCase(firEndpoint.getCurrentEndpoint().getEndpointSpecEnableLog())) {
					return firEndpoint.getCurrentEndpoint();
				} else {
					if(firEndpoint.getChildEndpoints() == null || firEndpoint.getChildEndpoints().size() > 1) {
						return null;
					}
					else {
						firEndpoint = firEndpoint.getChildEndpoints().get(0).getToEndpoint();
					}
				}
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public void sendMessageLog(MessageBO messageBo) {

		try {
			if(!messageLogLevelService.isLogOut(messageBo)){
				return;
			}
			LogMessageObject lgObject = buildMessageLog(messageBo);
			//多个CI合并成一个
			List<ContractInteraction> ciList =  lgObject.getContractInteractionList();
			int size = ciList.size();
			if(size>1){
				List<ContractInteraction> newCiList = new ArrayList<ContractInteraction>();
				ContractInteraction ciObject = (ContractInteraction)ciList.get(size-1);
				ciObject.setOutputErrFileNum(0);
				ciObject.setOutputSuccessFileNum(0);
				for(int i=0;i<size-1;i++){
					ContractInteraction ci =  ciList.get(i);
					ciObject.setOutputErrFileNum(ciObject.getOutputErrFileNum()+ci.getOutputErrFileNum());
					ciObject.setOutputSuccessFileNum(ciObject.getOutputSuccessFileNum()+ci.getOutputSuccessFileNum());
					ciObject.setResponseDes(ciObject.getResponseDes()+ci.getResponseDes());
				}
				newCiList.add(ciObject);
				lgObject.setContractInteractionList(newCiList);
			}
			logDealServ.logDeal(lgObject);
		} catch (BusinessException e) {
			logger.error(LogModel.EVENT_APP_EXCPT, e);
		}catch(Exception e){
			logger.error("API Broker sendMessageLog occur error", e);
		} 
	}

	/**
	 * EI构建
	 * 
	 * @param logObject
	 * @param ep
	 * @param messageBo
	 * @param date
	 * @param key
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void buildEndpointLog(LogMessageObject logObject, Endpoint ep,
			MessageBO messageBo, Timestamp reqDate, Timestamp rspDate,String key, MessageBO lastMessageBo) {
		String enabletrace = ep.getEnableInTrace();
		String enablelog = ep.getEnableInLog();

		if (EOPDomain.YES.equalsIgnoreCase(ep.getEndpointSpecEnableLog()) && enabletrace != null && enabletrace.equals(EOPDomain.YES)) {
			if(messageLogLevelService.isLogTypeOut(lastMessageBo, MessageLogLevelService.LOG_OBJECT_ENDPOINT_INTERACTION)) {
				if(key.startsWith(MessageBoHisServiceImpl.REQ)){
					EndpointInteraction end = new EndpointInteraction();
					end.setCenterFwd2DstTime(reqDate);
					end.setDstReplyTime(rspDate);
					end.setCreateDate(reqDate);
					end.setEndPointSpec(messageBo.getEndPointSpec());
					if (StringUtil.isBlank(ep.getEndpointDesc())) {
						end.setDescriptor(com.ailk.eaap.op2.serviceagent.common.EOPDomain.ENDPOINT_DESC_SUCCESS);
					} else {
						end.setDescriptor(ep.getEndpointDesc());
					}
					if (messageBo.getDstComponent() != null) {
						end.setDstOrgCode(messageBo.getDstComponent().getOrg()
								.getOrgCode());
						end.setDstSysCode(messageBo.getDstComponent().getCode());
					}
					end.setReqOrRes(messageBo.getReqorrsp());
		
					end.setEndpointId(Long.valueOf(ep.getEndpointId()));
		
					end.setServiceId(Long.valueOf(messageBo.getService().getServiceId()));
					end.setSrcTranId(messageBo.getTransactionID());
					end.setSrcIp(messageBo.getIp());
					end.setSuccessNum(messageBo.getSuccessNum());
					end.setFailNum(messageBo.getFailNum());
				}else{
					EndpointInteraction end = new EndpointInteraction();
					end.setCenterFwd2DstTime(reqDate);
					end.setDstReplyTime(rspDate);
					end.setCreateDate(rspDate);
					if (StringUtil.isBlank(ep.getEndpointDesc())) {
						end.setDescriptor(com.ailk.eaap.op2.serviceagent.common.EOPDomain.ENDPOINT_DESC_SUCCESS);
					} else {
						end.setDescriptor(ep.getEndpointDesc());
					}
					if (messageBo.getDstComponent() != null) {
						end.setDstOrgCode(messageBo.getDstComponent().getOrg()
								.getOrgCode());
						end.setDstSysCode(messageBo.getDstComponent().getCode());
					}
					end.setReqOrRes(messageBo.getReqorrsp());
					end.setEndPointSpec(messageBo.getEndPointSpec());
					end.setEndpointId(Long.valueOf(ep.getEndpointId()));
		
					end.setServiceId(Long.valueOf(messageBo.getService().getServiceId()));
					end.setSrcTranId(messageBo.getTransactionID());
					end.setSrcIp(messageBo.getIp());
					end.setSuccessNum(messageBo.getSuccessNum());
					end.setFailNum(messageBo.getFailNum());
					logObject.getEndpointInteractionList().add(end);
				}
				
			}

			if (enablelog != null && enablelog.equals(EOPDomain.YES)) {
				if(messageLogLevelService.isLogTypeOut(lastMessageBo, MessageLogLevelService.LOG_OBJECT_ORI_LOG_CLOB)) {
					OriLogClob o = new OriLogClob();
					o.setCreateTime(reqDate);
					if (messageBo.getDstComponent() != null) {
						o.setDstOrgCode(messageBo.getDstComponent().getOrg()
								.getOrgCode());
						o.setDstSysCode(messageBo.getDstComponent().getCode());
					}
	
					o.setEndPointId(Long.valueOf(ep.getEndpointId()));
					o.setReqOrRes(messageBo.getReqorrsp());
					o.setSrcTranId(messageBo.getTransactionID());
					o.setSrcOrgCode(messageBo.getSrcorgcode());
					o.setSrcSysCode(messageBo.getSrcsyscode());
					o.setFailMsg(messageBo.getFailMsg());
	
					// 克隆一份MessageBo
					MessageBO mb = (MessageBO) messageBo.clone();
					fuzzyEncryption(mb, key);
	
					if (mb.getReqorrsp().equals(EOPDomain.REQ_FLAG)) {
						o.setMsg(mb.toAllString());
					}
					if (mb.getReqorrsp().equals(EOPDomain.RSP_FLAG)) {
						o.setMsg(mb.toAllString());
					}
					logObject.getOriLogClobList().add(o);
				}
			}
		}
	}

	@SuppressWarnings({ "rawtypes" })
	private void fuzzyEncryption(MessageBO mb, String key) {
		// 模糊化/加密 报文信息
		if (key.startsWith(MessageBoHisServiceImpl.REQ)
				&& null != contractFormatMap.get(MessageBoHisServiceImpl.REQ)) {
			fuzzy(mb,
					contractFormatMap.get(MessageBoHisServiceImpl.REQ),
					reqNodeDescMap);
		} else if (key.startsWith(MessageBoHisServiceImpl.RSP)
				&& null != contractFormatMap.get(MessageBoHisServiceImpl.RSP)) {
			fuzzy(mb,
					contractFormatMap.get(MessageBoHisServiceImpl.RSP),
					rspNodeDescMap);
		}
	}

	/**
	 * 
	 * fuzzy:(这里用一句话描述这个方法的作用). 
	 * TODO(这里描述这个方法适用条件 – 可选).
	 * TODO(这里描述这个方法的执行流程 – 可选).
	 * TODO(这里描述这个方法的使用方法 – 可选).
	 * TODO(这里描述这个方法的注意事项 – 可选).
	 * 
	 * @author zhongming
	 * @param bo
	 * @param conFormat
	 * @param map
	 * @since JDK 1.6
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void fuzzy(MessageBO bo, ContractFormat conFormat,
			Map<Integer, NodeDesc> map) {
		Map<Integer, NodeDesc> nodeDescs = new HashMap<Integer, NodeDesc>();
		Map<Integer, FuzzyEncryption> fuzzyEns = new HashMap<Integer, FuzzyEncryption>();

		List<ContractNodeFuzzy> contractNodeFuzzyList = (List<ContractNodeFuzzy>) cacheService
				.getKey(CacheKey.CONTRACT_NODE_FUZZY + conFormat.getTcpCtrFId(), bo.getTenant().getTenantId());
		// 模糊化关联规则
		if (contractNodeFuzzyList != null && contractNodeFuzzyList.size() > 0) {
			for (ContractNodeFuzzy fuzzy : contractNodeFuzzyList) {
				// 模糊化加密关联表对应节点描述为空日志写异常
				if (map.get(fuzzy.getNodeDescId()) == null) {
					logger.error("Fuzzy association anomaly {0}",
							fuzzy.getNodeDescId());
					continue;
				}
				nodeDescs.put(fuzzy.getNodeDescId(),
						map.get(fuzzy.getNodeDescId()));
				fuzzyEns.put(fuzzy.getNodeDescId(),
						(FuzzyEncryption) cacheService
								.getKey(CacheKey.FUZZY_ENCRYPTION
										+ fuzzy.getFuzzyEncryptionId(), bo.getTenant().getTenantId()));
			}
			// 处理模糊规则
			if (fuzzyEns.size() > 0 && nodeDescs.size() > 0) {
				// xml
				if ("1".equals(conFormat.getConType())) {
					FuzzyUtils.fuzzyXml(bo, nodeDescs, fuzzyEns);
				}
				// json
				else if ("2".equals(conFormat.getConType())) {
					FuzzyUtils.fuzzyJson(bo, nodeDescs, fuzzyEns);
				}
				// File
				else if ("4".equals(conFormat.getConType())) {
					FuzzyUtils.fuzzyFile(bo, nodeDescs, fuzzyEns);
				}
			}
			
		}
		
	}

	/**
	 * LogMessageObject构建
	 * 
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private LogMessageObject buildLogMessageObject(MessageBO bo) {

		Map<String, String> map = new HashMap<String, String>();

		if (StringUtils.isNotEmpty(bo.getAppKey())) {
			map.put(InType.APPKEY, bo.getAppKey());
		}
		if (bo.getService() != null) {
			map.put(InType.APINAME, bo.getService().getServiceCode());
		}
		if (StringUtils.isNotEmpty(bo.getSrcsyscode())) {
			map.put(InType.SrcSysCode, bo.getSrcsyscode());
		}
		if (StringUtils.isNotEmpty(bo.getSrcReqTime())) {
			map.put(InType.ReqTime, bo.getSrcReqTime());
		}
		if (StringUtils.isNotEmpty(bo.getDstSyscode())) {
			map.put(InType.DstSysID, bo.getDstSyscode());
		}
		if (StringUtils.isNotEmpty(bo.getFormat())) {
			map.put(InType.Format, bo.getFormat());
		}
		if (StringUtils.isNotEmpty(bo.getTransactionID())) {
			map.put(InType.TRANSID, bo.getTransactionID());
		}
		if (StringUtils.isNotEmpty(bo.getApiname())) {
			map.put(InType.Method, bo.getApiname());
		}
		if (StringUtils.isNotEmpty(bo.getApiname())) {
			map.put(InType.BusiCode, bo.getApiname());
		}
		if (StringUtils.isNotEmpty(bo.getContractVer())) {
			map.put(InType.ServiceContractVer, bo.getContractVer());
		}
		if (StringUtils.isNotEmpty(bo.getIp())) {
			map.put(InType.IP, bo.getIp());
		}
		if (StringUtils.isNotEmpty(bo.getSign())) {
			map.put(InType.Sign, bo.getSign());
		}
		if (StringUtils.isNotEmpty(bo.getAccessToken())) {
			map.put(InType.AccessToken, bo.getAccessToken());
		}
		if (bo.getTenant()!=null && bo.getTenant().getTenantId()!=null) {
			map.put(InType.tenantId, bo.getTenant().getTenantId().toString());
		}

		bo.getLogMessageObject().setJavaFiledMap(map);

		Service service = bo.getService();

		if (service != null) {
			bo.getLogMessageObject().setBusCode(service.getBusCode());
			bo.getLogMessageObject().setOrgId(bo.getSrcsyscode());
			bo.getLogMessageObject().setSvcCode(
					bo.getContractVersion().getContract().getCode());
		}

		if(messageLogLevelService.isLogTypeOut(bo, MessageLogLevelService.LOG_OBJECT_CONTRACT_INTERACTION)){
			buildContractInteraction(bo);
		}
			

		if(messageLogLevelService.isLogTypeOut(bo, MessageLogLevelService.LOG_OBJECT_EXCEPTION_LOG)) {
			EAAPException eAAPException = bo.getEAAPException();
	
			if (eAAPException != null) {
				ExceptionLogs ex = new ExceptionLogs();
				ex.setSrcTranId(bo.getTransactionID());
				ex.setExceptionMessage(eAAPException.getmsg());
				ex.setExceptionSpecId(eAAPException.getCode());
				ex.setContent(eAAPException.getMessage());
				if (ex.getContent().length() > 250) {
					ex.setContent(ex.getContent().substring(0, 125));
				}
				ex.setCreateTime(new Timestamp(System.currentTimeMillis()));
				bo.getLogMessageObject().getExceptionLogsList().add(ex);
			}
		}
		return bo.getLogMessageObject();
	}

	/**
	 * CI构建
	 * 
	 * @param lastBo
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void buildContractInteraction(MessageBO lastBo) {
		ContractInteraction contractInteraction = new ContractInteraction();
		contractInteraction.setResponseDes("");
		ContractVersion contractVersion = lastBo.getContractVersion();
		Service service = lastBo.getService();
		Component dstComponent = lastBo.getDstComponent();
		Component srcComponent = lastBo.getSrcComponent();
		contractInteraction.setInputFileNum(lastBo.getInputFileNum().intValue());
		contractInteraction.setOutputErrFileNum(lastBo.getOutputErrFileNum().intValue());
		contractInteraction.setOutputSuccessFileNum(lastBo.getOutputSuccessFileNum().intValue());
		contractInteraction.setSrcIp(lastBo.getIp());
		if(lastBo.getTenant() != null && lastBo.getTenant().getTenantId() != null){
		    contractInteraction.setTenantId(lastBo.getTenant().getTenantId());
		}
		Tenant tenant = (Tenant) cacheService.getObjByKey(CacheKey.TENANT + contractInteraction.getTenantId());
		if(tenant != null && tenant.getTimeZone() != null) {
			contractInteraction.setTimeZone(tenant.getTimeZone());
		}
		if(logger.isDebugEnabled()) {
			logger.debug("build ContractInteraction，tenant time zone \"{0}\"", contractInteraction.getTimeZone());
		}
		contractInteraction.setQueueName(lastBo.getQueueName());
		contractInteraction.setServiceStyle(lastBo.getServiceStyle());
		if (contractVersion != null) {
			contractInteraction
					.setContractVersion(contractVersion.getVersion());
			contractInteraction.setBizIntfCode(contractVersion.getContract()
					.getCode());
		}
		if (service != null) {
			contractInteraction.setBizFuncCode(service.getBusCode());
		}
		if (dstComponent != null) {
			contractInteraction.setDstOrgCode(dstComponent.getOrg()
					.getOrgCode());
			contractInteraction.setDstSysCode(dstComponent.getCode());
		}

		if (srcComponent != null) {
			contractInteraction.setSrcOrgCode(srcComponent.getOrg()
					.getOrgCode());
			contractInteraction.setSrcSysCode(srcComponent.getCode());
		}else{
			contractInteraction.setSrcSysCode(lastBo.getSrcsyscode());
		}

		contractInteraction.setRegSerCode(lastBo.getRegServiceCode());
		contractInteraction.setRegSerVersion(lastBo.getRegServiceVersion());

		contractInteraction.setSrcTranId(lastBo.getTransactionID());
		contractInteraction.setDstTranId(lastBo.getDstTranId());
		contractInteraction.setCreateTime(new Timestamp(System
				.currentTimeMillis()));

		contractInteraction.setSrcReqTime(new Timestamp(CommonUtil
				.getDateFromString(lastBo.getSrcReqTime()).getTime()));

		contractInteraction.setServiceLevel("1");
		if(lastBo.getSourceContractInteraction().getDstRecTime() == null) {
			contractInteraction.setDstRecTime(new Timestamp(System.currentTimeMillis()));
		} else {
			contractInteraction.setDstRecTime(lastBo.getSourceContractInteraction().getDstRecTime());
		}
		if(lastBo.getSourceContractInteraction().getCenterFwd2DstTime() == null) {
			contractInteraction.setCenterFwd2DstTime(new Timestamp(System.currentTimeMillis()));
		} else {
			contractInteraction.setCenterFwd2DstTime(lastBo.getSourceContractInteraction().getCenterFwd2DstTime());
		}
		if(lastBo.getSourceContractInteraction().getDstReplyTime() == null) {
			contractInteraction.setDstReplyTime(new Timestamp(System.currentTimeMillis()));
		} else {
			contractInteraction.setDstReplyTime(lastBo.getSourceContractInteraction().getDstReplyTime());
		}
		if(lastBo.getSourceContractInteraction().getCenterRecDstTime() == null) {
			contractInteraction.setCenterRecDstTime(new Timestamp(System.currentTimeMillis()));
		} else {
			contractInteraction.setCenterRecDstTime(lastBo.getSourceContractInteraction().getCenterRecDstTime());
		}
		contractInteraction.setCenterRecReqTime(lastBo.getSourceContractInteraction().getCenterRecReqTime());
		contractInteraction.setCenterFwd2SrcTime(new Timestamp(System.currentTimeMillis()));
		contractInteraction.setSrcConfirmTime(new Timestamp(System.currentTimeMillis()));

		EAAPException eaapException = lastBo.getEAAPException();
		if (eaapException != null) {
			contractInteraction.setResponseType("9");
			contractInteraction.setResponseCode(eaapException.getCode());
			contractInteraction.setResponseDes(eaapException.getmsg());
		} else {
			contractInteraction.setResponseType("0");
			contractInteraction.setResponseCode("0000");
		}
		//记录文件响应
		String responseDes = contractInteraction.getResponseDes();
		if(lastBo.getResponseDes()!=null && !"".equals(lastBo.getResponseDes())){
			responseDes += lastBo.getResponseDes();
			if(responseDes.length()>1000){
				contractInteraction.setResponseDes(responseDes.substring(0, 999));
			}else{
				contractInteraction.setResponseDes(responseDes);
			}
		}
		
		lastBo.getLogMessageObject().getContractInteractionList()
				.add(contractInteraction);
	}

	/**
	 * Response构建
	 */
	@SuppressWarnings("rawtypes")
	public static Response getResponse(MessageBO lastBo, Response rsp)
			 {

		if (rsp != null) {
			return rsp;
		}
		Response tcpResp = new Response();
		Document rspXml = null;
		try {
			rspXml = DocumentHelper.parseText(lastBo.toString());
		} catch (Exception e) {
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
					ErrorDomain.ERROR_CODE_9004, ErrorDomain.rsp_xml_null);
		}

		if (rspXml.selectNodes("/ContractRoot/TcpCont/Response/RspCode").size() != 1) {

			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
					ErrorDomain.ERROR_CODE_9004, ErrorDomain.RspCode_is_lost);
		} else {
			String rspCode = rspXml.selectSingleNode(
					"/ContractRoot/TcpCont/Response/RspCode").getText();

			tcpResp.setRespcode(rspCode);
			if (rspCode == null || rspCode.equals(EOPDomain.EMPTY_STRING)) {

				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9004,
						ErrorDomain.RspCode_is_null);
			}
		}

		if (rspXml.selectNodes("/ContractRoot/TcpCont/RspTime").size() != 1) {

			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
					ErrorDomain.ERROR_CODE_9004, ErrorDomain.RspTime_is_lost);
		} else {
			String rspTime = rspXml.selectSingleNode(
					"/ContractRoot/TcpCont/RspTime").getText();
			if (rspTime == null || rspTime.equals(EOPDomain.EMPTY_STRING)) {

				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9004,
						ErrorDomain.RspTime_format_error);
			} else {
				String regext = "\\d{4}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])(0[0-9]|1\\d|2[0-3])(0[0-9]|[1-5]\\d)(0[0-9]|[1-5]\\d)";
				Pattern patternRspTime = Pattern
						.compile(regext, Pattern.DOTALL);
				Matcher matcherRspTime = patternRspTime.matcher(rspTime);
				if (!matcherRspTime.matches()) {

					throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
							ErrorDomain.ERROR_CODE_9004,
							ErrorDomain.RspTime_format_error);
				}
			}
		}

		if (rspXml.selectNodes("/ContractRoot/TcpCont/Response/RspType").size() != 1) {

			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
					ErrorDomain.ERROR_CODE_9004, ErrorDomain.RspType_is_lost);
		} else {
			String rspType = rspXml.selectSingleNode(
					"/ContractRoot/TcpCont/Response/RspType").getText();
			tcpResp.setResptype(rspType);
			if (rspType == null || rspType.equals(EOPDomain.EMPTY_STRING)) {

				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9004,
						ErrorDomain.RspType_is_null);
			} else {
				String regext = "[0-9]";
				Pattern patternRspType = Pattern
						.compile(regext, Pattern.DOTALL);
				Matcher matcherRspType = patternRspType.matcher(rspType);
				if (!matcherRspType.matches()) {
					throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
							ErrorDomain.ERROR_CODE_9004,
							ErrorDomain.RspType_not_number);
				}
			}
		}
		if (rspXml.selectNodes("/ContractRoot/TcpCont/Response/RspDesc").size() > 1) {

			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
					ErrorDomain.ERROR_CODE_9004,
					ErrorDomain.RspDesc_not_only_one);

		} else if (rspXml
				.selectSingleNode("/ContractRoot/TcpCont/Response/RspDesc") != null) {
			String rspDesc = rspXml.selectSingleNode(
					"/ContractRoot/TcpCont/Response/RspDesc").getText();
			tcpResp.setRespDesc(rspDesc);
			if (rspDesc != null
					&& rspDesc.length() > EOPDomain.RESPONSE_DESC_LENGTH) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9004,
						ErrorDomain.RspDesc_out_length);
			}
		}
		if (lastBo.toString() == null) {

			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
					ErrorDomain.ERROR_CODE_9004, ErrorDomain.rsp_xml_null);
		} else {
			return tcpResp;
		}

	}

	public IMessageBoHisService getMessageBoHisSer() {
		return messageBoHisSer;
	}

	public void setMessageBoHisSer(IMessageBoHisService messageBoHisSer) {
		this.messageBoHisSer = messageBoHisSer;
	}

	public ILogDealServ getLogDealServ() {
		return logDealServ;
	}

	public void setLogDealServ(ILogDealServ logDealServ) {
		this.logDealServ = logDealServ;
	}

	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	public void setMessageLogLevelService(
			MessageLogLevelService messageLogLevelService) {
		this.messageLogLevelService = messageLogLevelService;
	}

}
