package com.ailk.eaap.op2.serviceagent.protocol;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.spring.config.O2pPropertyPlaceholderConfigurer;
import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.OriLogClob;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.O2pDocumentHelper;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.log.MessageLogService;
import com.ailk.eaap.op2.serviceagent.protocol.response.IResponseTemplate;
import com.ailk.eaap.op2.serviceagent.route.service.AuthProcessor;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.serviceagent.route.service.VagueProcessor;
import com.ailk.eaap.op2.serviceagent.validate.service.IFlowControlService;
import com.ailk.eaap.op2.serviceagent.validate.service.IProofService;
import com.ailk.eaap.op2.serviceagent.validate.service.IProtocolValidateServ;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.foundation.util.ExceptionUtils;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

@org.springframework.stereotype.Service
public  class ProtocolController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLog(ProtocolController.class);
	@Autowired
	private IRouteServ routeServ;
	@Autowired
	protected IMemcacheManageServ cacheService;
	@Autowired
	private transient IResponseTemplate responseTemplate;
	@Autowired
	protected transient IProtocolValidateServ protocolValidateSer;
	@Autowired
	private MessageLogService messageLogService;
	@Autowired
	private transient IProofService proofService;
	@Autowired
	private transient IFlowControlService flowControlServ;

	private  String serviceAgentMode = O2pPropertyPlaceholderConfigurer.globalProperties.getProperty("serviceAgent.mode");

	public  boolean exchange(MessageBO<?> messageBo,  String param) {
		boolean isSuccess = true;
		ContractVersion restBaseCv = null;
		try {
			addTenant(messageBo);
			
			messageBo.getSourceContractInteraction().setCenterRecReqTime(new Timestamp(System.currentTimeMillis()));
			
			restBaseCv = getBaseContractVer(messageBo, param);
			
			restJavaFieldInit(messageBo,restBaseCv);
			
			if(!StringUtils.isEmpty(messageBo.getAppKey()) || !StringUtils.isEmpty(messageBo.getSrcorgcode())) {
				
				initComonent(messageBo);
			}
			
			boolean isNeedValiTrans = validateTransactionID(messageBo, restBaseCv);
			
			if(!InType.get.equals(messageBo.getInType()) &&
					!InType.delete.equals(messageBo.getInType())) {
				
				changeMsgBodyType(messageBo, (String)messageBo.getMsgBody());
			}
			
			
			String urlResource = initServiceAndCvKey(messageBo, param, messageBo.getInType(), false);
			//rest
			initUrlResource(messageBo, urlResource, param);
			
			if(StringUtils.isEmpty(messageBo.getServiceCode())) {
				
				initServiceKey(messageBo, param);
				initService(messageBo);
			}
			
			if(StringUtils.isEmpty(messageBo.getContractVer())) {
				
				initContractVersionKey(messageBo, param);
			}
			
			//瀛愮被鍗忚鐗堟湰
			initContractVersion(messageBo);
			
			//瑙ｆ瀽javaField
			parseRequestParam(messageBo);
			
			if(messageBo.getService() == null) {
				
				initService(messageBo);
			}
			
			if(messageBo.getSrcComponent() == null) {
				
				initComonent(messageBo);
			}
			
			
			initSerInvokeIns(messageBo);
			
			if(!isNeedValiTrans) {
				
				validateTransactionID(messageBo, null);
			}
			
			//璁よ瘉
			proofService.authen(messageBo);
			//鍙戣捣鏂规祦閲忔帶鍒�
			flowControlServ.flowControl(messageBo);
			
			VagueProcessor.process(VagueProcessor.REQ, messageBo);
			routeServ.route(messageBo);
			
			OriLogClob repOrg = new OriLogClob();
			repOrg.setReqOrRes(EOPDomain.RSP_FLAG);
			
			repOrg.setSrcTranId(messageBo.getTransactionID());
			VagueProcessor.process(VagueProcessor.RSP, messageBo);
		} catch(BusinessException e){
			isSuccess = false;
			LOG.error(LogModel.EVENT_BIZ_EXCPT, e);
			EAAPException eaapException = new EAAPException( EAAPTags.SEG_DRAVER_SIGN,e.getResult().getCode()+"",e.getResult().getMsg(),e);
			messageBo.setEAAPException(eaapException);

			if(messageBo.getContractVersion() == null && restBaseCv != null) {
				
				messageBo.setContractVersion(restBaseCv);
			}
			responseTemplate.response(messageBo, e.getResult().getCode()+"", e.getResult().getMsg());
			
		} catch(Exception e){
			isSuccess = false;
			LOG.error(LogModel.EVENT_APP_EXCPT, e);
			EAAPException eaapException = new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.system_error,e);
			messageBo.setEAAPException(eaapException);

			responseTemplate.response(messageBo, ErrorDomain.ERROR_CODE_9999,  ErrorDomain.system_error+ExceptionUtils.populateExecption(e, 500));

		}finally{
			try{
				
				messageLogService.sendMessageLog(messageBo);
			} catch(Exception e) {
				
				isSuccess = false;
				LOG.error(LogModel.EVENT_APP_EXCPT, e);
			} finally {
				try {
					responseTemplate.checkHeader(messageBo);
				} catch(Exception e) {
					isSuccess = false;
					LOG.error(LogModel.EVENT_APP_EXCPT, e);
				}
				
			}
			if(messageBo.getSerInvokeIns() != null) {
				flowControlServ.subtraThreadNum(messageBo.getSerInvokeIns().getSerInvokeInsId()+"");
			}
		}
		return isSuccess;
	}
	
	private void addTenant(MessageBO<?> messageBo) {

		if(messageBo.getTenant().getTenantId() == null) {
			Tenant ten = (Tenant) cacheService.getObjByKey(CacheKey.TENANT+ CacheKey.defaultTenantId);
			
			if(ten != null) {
				messageBo.setTenant(ten);
			} else {
				
				throw new BusinessException(9053, "o2p-serviceagent-core.9053", new String[]{"This service does not exist"}, null);
			}
		}
	}

	protected void restJavaFieldInit(MessageBO<?> messageBo,
			ContractVersion restBaseCv) {
		
	}



	public ContractVersion getBaseContractVer(MessageBO<?> messageBo, String param) {

		return null;
	}
	
	public boolean validateTransactionID(MessageBO<?> messageBo, ContractVersion contractV) {

		boolean isNeedValiTrans = false;
		
		ContractVersion cv = contractV == null ? messageBo.getContractVersion() : contractV;
		if(cv != null && cv.getReqContractFormat()!=null && ("client".equals(serviceAgentMode) || messageBo.getAuthCode()==null)){
			List<NodeDesc> nds = cv.getReqContractFormat().getNodeDescs();
			boolean isNeedCheck = false;
			for(NodeDesc nd : nds){
				if(nd.getJavaField()!=null && nd.getIsNeedCheck()!=null && InType.TRANSID.equals(nd.getJavaField()) && "Y".equals(nd.getIsNeedCheck())){
					isNeedCheck = true;
					break;
				}
			}
			//校验流水号
			if(!StringUtils.isEmpty(messageBo.getTransactionID()) && isNeedCheck) {
				
				isNeedValiTrans = true;
				
				if(cacheService.isTransExist(messageBo.getTransactionID())){
					throw new BusinessException(9018, "o2p-serviceagent-core.9018", new String[]{"TransactionID="+messageBo.getTransactionID()}, null);
				}else{
					cacheService.addTrans(messageBo.getTransactionID());
				}
			}
		}
		
		return isNeedValiTrans;
	}

	public void initUrlResource(MessageBO<?> messageBo, String urlResource,
			String param) {
		
		return;
	}

	public String initServiceAndCvKey(MessageBO<?> messageBo, String param,
			String inType, boolean isBase) {
		
		return null;
	}


	
	/*
	 * 鑾峰彇涓婂眰鍗忚鐗堟湰
	 */
	public  String getUpperSerVersion(MessageBO<?> messageBo, String pathInfo) {
		
		return null;
	}

	public  void initContractVersionKey(MessageBO<?> messageBo, String name)  {
		
		return;
	}

	public  void initServiceKey(MessageBO<?> messageBo, String name) {
		
		return;
	}

	public  void initComonent(MessageBO<?> messageBo)  {
		
		if(!StringUtils.isEmpty(messageBo.getSrcsyscode())){
			
			protocolValidateSer.initComponentBySrcCode(messageBo);
		} else if(!StringUtils.isEmpty(messageBo.getAppKey())){

			protocolValidateSer.initComponentByAppKey(messageBo);
		}		
	}
	
	
	public void parseRequestParam(MessageBO<?> messageBo)  {
		
		ContractFormat cf = messageBo.getContractVersion().getReqContractFormat();
		List<NodeDesc> nodeList = null;
		if(cf != null) {
			
			String conType = cf.getConType();
			
			nodeList = cf.getNodeDescs();
			
			protocolValidateSer.mapParse(messageBo,  nodeList);
			
			String contentType = messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()) == null ? "" : messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()).toString();
			//涓嶇鏄惁涓虹┖閮借繘琛屾牎楠�
			if(messageBo.getMsgBody() instanceof Document ||
					contentType.toLowerCase().contains("xml") ||EOPDomain.XML.equals(conType)){
				
				protocolValidateSer.xmlParse(messageBo,  nodeList);
			}else if(messageBo.getMsgBody() instanceof JSONObject ||
					 contentType.toLowerCase().contains("json") ||EOPDomain.JSON.equals(conType)){
				
				protocolValidateSer.jsonParse(messageBo,  nodeList);
			}
		
		}
		
		protocolValidateSer.checkNeedNode(messageBo,  nodeList);
		
	}

	public void initContractVersion(MessageBO<?> messageBo)  {
		
		Object cv = cacheService.getKey(CacheKey.ContractVer+messageBo.getContractVer(), messageBo.getTenant().getTenantId());
		if(cv==null){
			String message = "CacheKey="+CacheKey.ContractVer+messageBo.getContractVer();
			if(StringUtils.isEmpty(messageBo.getContractVer())) {
				message += ", contrat version is null";
			}
			throw new BusinessException(9051,"o2p-serviceagent-core.9051",new String[]{message}, null);
		}
		ContractVersion contractVersion =(ContractVersion)cv;
		messageBo.setContractVersion(contractVersion);
		if( !(EOPDomain.NORMAL).equals(contractVersion.getState())  ){
			throw new BusinessException(9052, "o2p-serviceagent-core.9052",new String[]{"ContractVersion="+messageBo.getContractVer()+", normal state="+EOPDomain.NORMAL}, null);
		}
	}
	
	public  void initService(MessageBO<?> messageBo) {
		
		Object s = cacheService.getKey(CacheKey.SERVICE+messageBo.getServiceCode(), messageBo.getTenant().getTenantId());
		
		if(s==null){
			
			throw new BusinessException(9053, "o2p-serviceagent-core.9053", new String[]{"CacheKey="+CacheKey.SERVICE+messageBo.getServiceCode()}, null);
		}
		Service service = (Service)s;
		
		messageBo.setService(service);
	}
	
	public  void initSerInvokeIns(MessageBO<?> messageBo)  {
		
		String key=CacheKey.serInvokeIns+messageBo.getService().getServiceId()+messageBo.getSrcsyscode();
		
		Object si = cacheService.getKey(key, messageBo.getTenant().getTenantId());
		
		if(si==null){
			throw new BusinessException(9062, "o2p-serviceagent-core.9062", new String[]{"serviceId="+messageBo.getService().getServiceId()+", SrcSysCode="+messageBo.getSrcsyscode()+",CacheKey="+key}, null);
		}
		
		SerInvokeIns serInvokeIns = (SerInvokeIns)si;
		if(!EOPDomain.NORMAL.equals(serInvokeIns.getState())){
			throw new BusinessException(9063, "o2p-serviceagent-core.9063", new String[]{"SerInvokeInsId="+serInvokeIns.getSerInvokeInsId()+", normal state="+EOPDomain.NORMAL}, null);
		}
		
		messageBo.setSerInvokeIns(serInvokeIns);
	}
	
	public void changeMsgBodyType(MessageBO messageBo, String reqMsgBody)  {
		
		if(!StringUtils.isEmpty(reqMsgBody)) {
			//淇濆瓨鍘熷鎶ユ枃
			messageBo.setSrcPlayload(reqMsgBody);
			String accept = messageBo.getMsgHead().get(EOPDomain.ACCEPT) == null ? "" : messageBo.getMsgHead().get(EOPDomain.ACCEPT).toString();
			String contentType = messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()) == null ? "" : messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()).toString();
			if (accept.toLowerCase().contains("json") || contentType.toLowerCase().contains("json") || 
				 (StringUtils.isEmpty(accept) && StringUtils.isEmpty(contentType) &&	reqMsgBody.trim().startsWith("{"))) {
				
				try {
					
					messageBo.setMsgBody(JSONObject.fromObject(reqMsgBody));
				} catch (JSONException e) {
					
					throw new BusinessException(9242, "o2p-serviceagent-core.9242", new String[]{reqMsgBody}, e);
				}
			} else if(accept.toLowerCase().contains("xml") || contentType.toLowerCase().contains("xml") ||  
					(StringUtils.isEmpty(accept) && StringUtils.isEmpty(contentType) && reqMsgBody.trim().startsWith("<"))) {
				
				try {
					
					messageBo.setMsgBody(O2pDocumentHelper.parseText(reqMsgBody));
				} catch(DocumentException e) {
					
					throw new BusinessException(9241, "o2p-serviceagent-core.9241", new String[]{reqMsgBody}, e);
				} 
			} else {
				
				messageBo.setMsgBody(reqMsgBody);
			}
		}
		
	}
	
	public Api getApi(String apiMethod, MessageBO<?> messageBo)  {

		Object api = cacheService.getKey(CacheKey.Api+apiMethod, messageBo.getTenant().getTenantId()); 
			
		return (Api)api;
		
	}

}
