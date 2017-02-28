package com.ailk.eaap.op2.serviceagent.validate.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.JsonUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.MessageContextUtil;
import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.BizFunction;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.ailk.eaap.op2.bo.OriLogClob;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;


public class BaseValidateServ implements IBaseValidateServ{

	private static final Logger LOG = Logger.getLogger(BaseValidateServ.class);
	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	private IValidateServ validateServ;
	private String defalutHead;
	private boolean needCheckTrans;
	/**
	 * 
	 */
	public  MessageBO baseValidate(MessageBO messageBo) {
		// TODO Auto-generated method stub
		if(messageBo.getInType().equals(InType.RESTGET)){
			validateApi(messageBo);
		}else if(messageBo.getInType().equals(InType.CEPHTTP) || messageBo.getInType().equals(InType.CEPWEBSERVICE)|| messageBo.getInType().equals(InType.RESTPOST)){
			validateXml(messageBo);
		}
		
		return messageBo;
	}
	
	/**
	 * @param messageBo
	 * @return
	 */
	private  MessageBO validateApi(MessageBO messageBo){
		LOG.debug("apiname "+messageBo.getApiname());
		LOG.debug("api messageMap "+messageBo.getMessageMap());
		if(messageBo.getApiname()==null || messageBo.getApiname().trim().equals("")){
			//modify by zhuangyq
			messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil
					.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,
					ErrorDomain.ERROR_CODE_9006, ErrorDomain.lost_api, null));
			
		}
		
		if(messageBo.getMessageMap().get(InType.TRANSID)==null ){
			messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil
					.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,
					ErrorDomain.ERROR_CODE_9006, ErrorDomain.TransactionID_lost, null));
		}else{
			messageBo.setTransactionID(messageBo.getMessageMap().get(InType.TRANSID).toString());
		}

		return messageBo;
	}

	/**
	 * @param messageBo
	 * @return
	 */
	private  MessageBO validateXml(MessageBO messageBo){
		String reqMessage = messageBo.toString();
		messageBo.setOrgReqMsg(reqMessage);
		if(JsonUtil.isJson(reqMessage)){
			messageBo.setDataType(DataType.JSON);
		}else{
			messageBo.setDataType(DataType.XML);
		}
		
		if(reqMessage == null ||reqMessage.toString().equals("")){
			messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil
					.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,
					ErrorDomain.ERROR_CODE_9002, ErrorDomain.req_msg_is_null, null));
		}
		
		int length = 0;
		if(!StringUtils.isEmpty(reqMessage)) {
			length = reqMessage.length();
		}
		
		if(length>EOPDomain.MAX_LIMIT_MESSAGE_SIZE){
			LOG.error( "The request message is out of length"+length);
			messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil
					.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,
					ErrorDomain.ERROR_CODE_9006, ErrorDomain.req_msg_length_is_outoflimit, null));
		}
		String  srcTransactionId = null;
		if(messageBo.getDataType().equals(DataType.JSON)){
			srcTransactionId = CommonUtil.getMatchPatternStr(reqMessage, "\""+InType.TRANSID+"\":\\s{0,}\"(.*?)\"");
		}else{
			srcTransactionId = CommonUtil.getNodeValue(reqMessage,InType.TRANSID);
		}
		
		
		if(CommonUtil.isEmpty(srcTransactionId)){
			
			messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil
					.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,
					ErrorDomain.ERROR_CODE_9002, ErrorDomain.TransactionID_lost,
					srcTransactionId));
		}else{
			messageBo.setTransactionID(srcTransactionId);
		}
		if(messageBo.getInType().equals(InType.RESTPOST)){
			String  apiName = null;
			if(messageBo.getDataType().equals(DataType.JSON)){
				
				String method = CommonUtil.getMatchPatternStr(reqMessage, "\""+InType.Method+"\":\\s{0,}\"(.*?)\"");
				String busiCode = CommonUtil.getMatchPatternStr(reqMessage, "\""+InType.BusiCode+"\":\\s{0,}\"(.*?)\"");
				apiName = (method!=null?method:busiCode);
			}else{
				
				String method = CommonUtil.getNodeValue(reqMessage,InType.Method);
				String busiCode = CommonUtil.getNodeValue(reqMessage, InType.BusiCode);
				apiName = (method!=null?method:busiCode);
			}
			
			if(apiName ==null ){
				messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil
						.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,
						ErrorDomain.ERROR_CODE_9006, ErrorDomain.lost_api, srcTransactionId));
			}
			LOG.debug(apiName);
			messageBo.setApiname(apiName);
		}

		return messageBo;
	}
	/**
	 * 
	 */
	public MessageBO legitimateValidate(MessageBO messageBo)
			 {
		
		if(messageBo.getDataType().equals(DataType.JSON)){
			try{
				String xmlStr = JsonUtil.json2xml(messageBo.toString());
				OriLogClob jsontoXmlOrg = new OriLogClob();
				jsontoXmlOrg.setMsg(xmlStr);
				jsontoXmlOrg.setReqOrRes(EOPDomain.REQ_FLAG);
				jsontoXmlOrg.setSrcTranId(messageBo.getTransactionID());
				messageBo.getLogMessageObject().getOriLogClobList().add(jsontoXmlOrg);
			}catch(Exception e){
				LOG.error("json translate to xml  error",e);
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9006,ErrorDomain.error_json_msg,e.toString());
			}
			
			
		}
		
		
		if(messageBo.getInType().equals(InType.RESTGET) || messageBo.getInType().equals(InType.RESTPOST)){
			apilegitimate(messageBo);
		}else if(messageBo.getInType().equals(InType.CEPHTTP) || messageBo.getInType().equals(InType.CEPWEBSERVICE) ){
			xmllegitimate(messageBo);
		}
		
		strictValidateRequestTcpTransactionId(messageBo);
		if(needCheckTrans){
			if(cacheService.isTransExist(messageBo.getTransactionID())){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9018,ErrorDomain.transactionId_repeat);//
			}else{
				cacheService.addTrans(messageBo.getTransactionID());
			}
		}
		
		
		cacheService.addTrans(messageBo.getTransactionID());
		
		Object s = cacheService.getKey(CacheKey.SERVICE+messageBo.getContractVersion().getVersion(), messageBo.getTenant().getTenantId());
		
		messageBo.getReqVersionMsg().put(messageBo.getContractVersion().getVersion(), messageBo.toString());
		
		if(s==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.service_not_exist);
		}
		Service service = (Service)s;
		
		
		messageBo.setService(service);
		
		
		String key=CacheKey.serInvokeIns+service.getServiceId()+""+messageBo.getSrcComponent().getCode();
		
		Object si = cacheService.getKey(key, messageBo.getTenant().getTenantId());
		
		if(si==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.service_call_instance_not_exist);
		}
		
		SerInvokeIns serInvokeIns = (SerInvokeIns)si;
		if(!EOPDomain.NORMAL.equals(serInvokeIns.getState())){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.service_call_instance_not_exist);
		}
		
		messageBo.setSerInvokeIns(serInvokeIns);
		messageBo.setMsgHead();
		
		
		validateServ.validate(messageBo,messageBo.getContractVersion().getBaseContractVersion(),EOPDomain.REQ_FLAG);
		
		return messageBo;
	}


	public MessageBO xmllegitimate(MessageBO messageBo){
		//modify by zhuangyq
		Document xmldoc = (Document) messageBo.getMsgBody();
		Element root = xmldoc.getRootElement();
		checkTcpMsgXml(root);
		
		checkSvcMsgXml(root);
		
		this.validateRequestTcp(messageBo);
		
		
		
		return messageBo;
	}
	
	

	/**
	 * @param messageBo
	 * @return
	 */
	public MessageBO apilegitimate(MessageBO messageBo){
		
		Object api = cacheService.getKey(CacheKey.Api+messageBo.getApiname(), messageBo.getTenant().getTenantId());
		
		
		
		if(api==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.api_not_exist);
		}else{
			Api apiName = (Api)api;
			if(apiName.getApiState()!=null &&!apiName.getApiState().equals(EOPDomain.NORMAL)){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.Api_stats_unuseable);
			}
			messageBo.setContractVer(apiName.getContractVer());
		}
		String appKey = null;
		String srcReqTime = null;
		String dstSysID = null ;
		String format = null;
		String sign = null;
		if(messageBo.getInType().equals(InType.RESTPOST)){
			String reqXml = messageBo.toString();
			appKey = CommonUtil.getNodeValue(reqXml, InType.APPKEY);
			srcReqTime = CommonUtil.getNodeValue(reqXml, InType.ReqTime);
			dstSysID = CommonUtil.getNodeValue(reqXml, InType.DstSysID);
			
			format = CommonUtil.getNodeValue(reqXml, InType.Format);
			sign = CommonUtil.getNodeValue(reqXml, InType.Sign);
		}else{
			Object appKeyObj = messageBo.getMessageMap().get(InType.APPKEY);
			if(appKeyObj!=null){
				appKey = appKeyObj.toString();
			}
			
			Object srcReqTimeObj = messageBo.getMessageMap().get(InType.ReqTime);
			if(srcReqTimeObj!=null){
				srcReqTime = srcReqTimeObj.toString();
			}
			
			Object dstSysIDObj = messageBo.getMessageMap().get(InType.DstSysID);
			if(dstSysIDObj!=null){
				dstSysID = dstSysIDObj.toString();
			}
			
			Object formatObj = messageBo.getMessageMap().get(InType.Format);
			if(formatObj!=null){
				format = formatObj.toString();
			}
			
			Object SignObj = messageBo.getMessageMap().get(InType.Sign);
			if(SignObj!=null){
				sign = SignObj.toString();
			}
		}
		
		if(appKey==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.appkey_lost);
		}else{
			messageBo.setAppKey(appKey);
		}
		
		Object appObj = cacheService.getKey(CacheKey.App+messageBo.getAppKey(), messageBo.getTenant().getTenantId());
		
		if(appObj==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.appkey_cant_find);
		}
		App app = (App)appObj;
		if(app.getAppState()!=null && !app.getAppState().equals(EOPDomain.ONLINE)){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.app_state_unuseable);
		}
		messageBo.setSrcsyscode(app.getComponentCode());
		messageBo.setApp(app);
		
		
		
		if(srcReqTime==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.ReqTime_lost);
		}else{
			
			String regext = "\\d{4}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])(0[0-9]|1\\d|2[0-3])(0[0-9]|[1-5]\\d)(0[0-9]|[1-5]\\d)";
			Pattern pattern = Pattern.compile(regext, Pattern.DOTALL);
			Matcher matcher = pattern.matcher(srcReqTime);
			if (!matcher.matches()) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.ReqTime_is_error);
			}
			messageBo.setSrcReqTime(srcReqTime);
		}
		
		
		Object cv = cacheService.getKey(CacheKey.ContractVer+messageBo.getContractVer(), messageBo.getTenant().getTenantId());
		if(cv==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.contract_version_not_exist);
		}
		ContractVersion contractVersion =(ContractVersion)cv;
		messageBo.setContractVersion(contractVersion);
		
		Object srcSys = cacheService.getKey(CacheKey.Component+messageBo.getSrcsyscode(), messageBo.getTenant().getTenantId());
		if(srcSys==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.component_not_register);
		}
		Component srcc = (Component)srcSys;
		messageBo.setSrcComponent(srcc);
		messageBo.setSrcorgcode(srcc.getOrg().getOrgCode());
		
		if(dstSysID!=null && !dstSysID.equals("")){
			Object componentObj = cacheService.getKey(CacheKey.Component+dstSysID, messageBo.getTenant().getTenantId());
			if(componentObj==null){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,dstSysID + ErrorDomain.not_register);
			}else{
				Component compBean = (Component)componentObj;
				if(!(EOPDomain.ONLINE).equals(compBean.getState())){
					throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,dstSysID + ErrorDomain.status_unusable);
				}
				messageBo.setDstComponent(compBean);
			}
			messageBo.setDstSyscode(dstSysID);
			
		}
		
		if(format!=null && !(format.equalsIgnoreCase(DataType.XML) || format.equalsIgnoreCase(DataType.JSON))){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"format" + ErrorDomain.format_value_error);
		}else{
			messageBo.setFormat(format);
		}
		messageBo.setSign(sign);	
		
		
		return messageBo;
	}

	
	
	/**
	 * @param contractRootNode
	 * @param resOrReqFlag
	 * @throws RainbowException
	 */
	private void checkTcpMsgXml(final Element contractRootNode)
	 {
		List list  = contractRootNode.selectNodes("./TcpCont");
		if(list.size()==0){
			
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN, ErrorDomain.ERROR_CODE_9006,ErrorDomain.lost_tcpcont_node);
		}else if(list.size()>1){

				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN, ErrorDomain.ERROR_CODE_9006,ErrorDomain.tcpcont_node_error);
			}
		else{
			LOG.debug("validate TcpCont node xml error");
		}
		
		
	}
	
	/**
	 * @param contractRootNode
	 * @param resOrReqFlag
	 * @throws RainbowException
	 */
	private void checkSvcMsgXml(final Element contractRootNode)
	 {
		List list  = contractRootNode.selectNodes("./SvcCont");
		if(list.size()>1){

				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN, ErrorDomain.ERROR_CODE_9006,ErrorDomain.svccont_node_error);
			}
		else{
			LOG.debug("check SvcCont node xml error");
		}
	}
	
	
	public MessageBO validateRequestTcp(MessageBO messageBo)   {
		// TODO Auto-generated method stub
		Node nodeTcpCont = messageBo.getTcpnode();
		String msg = EOPDomain.EMPTY_STRING;
		
		if (nodeTcpCont.selectNodes("./BusCode").size()!=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.BusCode_lost);
		} else {
			String busCode = nodeTcpCont.selectSingleNode("./BusCode").getText();
			if (busCode == null || busCode.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.BusCode_is_null);
			} else {
				if (busCode.length() != 8) {
					msg = buildValidateFalseMsg(msg, ErrorDomain.BusCode_out_of_length);
				} 
			}
			messageBo.setBusCode(busCode);
		}
		if (nodeTcpCont.selectNodes("./ServiceCode").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.ServiceCode_lost);
		} else {
			String serviceCode = nodeTcpCont.selectSingleNode("./ServiceCode")
					.getText();
			if (serviceCode == null
					|| serviceCode.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.ServiceCode_is_null);
			} else {
				if (serviceCode.length() != 8) {
					msg = buildValidateFalseMsg(msg, ErrorDomain.ServiceCode_out_of_length);
				}
			}
			messageBo.setServiceCode(serviceCode);
		}
		if (nodeTcpCont.selectNodes("./ServiceContractVer").size()!=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.ServiceContractVer_lost);
		} else {
			String serviceContractVer = nodeTcpCont.selectSingleNode(
					"./ServiceContractVer").getText();
			if (serviceContractVer == null
					|| serviceContractVer.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.ServiceContractVer_is_null);
			} else {
				if (serviceContractVer.length() != 16) {
					msg = buildValidateFalseMsg(msg,
							"ServiceContractVersion request length 16 bit!");
				} 
			}
			messageBo.setContractVer(serviceContractVer);
		}
		if (nodeTcpCont.selectNodes("./ActionCode").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.ActionCode_lost);
		} else {
			String actionCode = nodeTcpCont.selectSingleNode("./ActionCode")
					.getText();
			if (actionCode == null
					|| actionCode.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.ActionCode_is_null);
			} 
			messageBo.setActionCode(actionCode);
		}
		if (nodeTcpCont.selectNodes("./TransactionID").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.TransactionID_lost);
		} else {
			String transactionId = nodeTcpCont.selectSingleNode(
					"./TransactionID").getText();
			if (transactionId == null
					|| transactionId.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.TransactionID_is_null);
			} else {
				if (transactionId.length() != 28) {
					msg = buildValidateFalseMsg(msg, ErrorDomain.TransactionID_out_of_length);
				} 
			}
			messageBo.setTransactionID(transactionId);
		}
		if (nodeTcpCont.selectNodes("./ServiceLevel").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.ServiceLevel_lost);
		} else {
			String serviceLevel = nodeTcpCont.selectSingleNode("./ServiceLevel")
					.getText();
			if (serviceLevel == null
					|| serviceLevel.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.ServiceLevel_is_null);
			} else {
				String regext = "[1-9]";
				Pattern pattern = Pattern.compile(regext, Pattern.DOTALL);
				Matcher matcher = pattern.matcher(serviceLevel);
				if (!matcher.matches()) {
					msg = buildValidateFalseMsg(msg,
							ErrorDomain.ServiceLevel_is_error);
				}
			}
			messageBo.setServiceLevel(serviceLevel);
		}
		if (nodeTcpCont.selectNodes("./SrcOrgID").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.SrcOrgID_lost);
		} else {
			String srcOrgID = nodeTcpCont.selectSingleNode("./SrcOrgID")
					.getText();
			if (srcOrgID == null || srcOrgID.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.SrcOrgID_is_null);
			} else {
				if (srcOrgID.length() != 6) {
					msg = buildValidateFalseMsg(msg, ErrorDomain.SrcOrgID_out_of_length);
				} 
			}
			messageBo.setSrcorgcode(srcOrgID);
		}
		if (nodeTcpCont.selectNodes("./SrcSysID").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.SrcSysID_lost);
		} else {
			String srcSysID = nodeTcpCont.selectSingleNode("./SrcSysID")
					.getText();
			if (srcSysID == null || srcSysID.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.SrcSysID_is_null);
			} else {
				if (srcSysID.length() != 10) {
					msg = buildValidateFalseMsg(msg, ErrorDomain.SrcSysID_out_of_length);
				} else {
				}
			}
			messageBo.setSrcsyscode(srcSysID);
		}
		if (nodeTcpCont.selectNodes("./SrcSysSign").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.SrcSysSign_lost);
		} else {
			messageBo.setSign(nodeTcpCont
					.selectSingleNode("./SrcSysSign").getText());
		}
		if (nodeTcpCont.selectNodes("./DstOrgID") .size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.DstOrgID_lost);
		} else {
			String dstOrgId = nodeTcpCont.selectSingleNode("./DstOrgID")
					.getText();
			if (dstOrgId == null || dstOrgId.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.DstOrgID_is_null);
			} else if (dstOrgId.length() != 6) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.DstOrgID_out_of_length);
				
			}
			messageBo.setDstOrgID(dstOrgId);
		}
		if (nodeTcpCont.selectNodes("./DstSysID").size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.DstSysID_lost);
		} else {
			String dstSysId = nodeTcpCont.selectSingleNode("./DstSysID")
					.getText();
			if (dstSysId == null || dstSysId.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.DstSysID_is_null);
			} else {
				//cc修改
				if (dstSysId.length() < 8 || dstSysId.length() >10 ) {     
					msg = buildValidateFalseMsg(msg, ErrorDomain.DstSysID_out_of_length);
				}
			}
			messageBo.setDstSyscode(dstSysId);
		}
		if (nodeTcpCont.selectNodes("./ReqTime") .size() !=1) {
			msg = buildValidateFalseMsg(msg, ErrorDomain.ReqTime_lost);
		} else {
			String reqTime = nodeTcpCont.selectSingleNode("./ReqTime").getText();
			if (reqTime == null || reqTime.equals(EOPDomain.EMPTY_STRING)) {
				msg = buildValidateFalseMsg(msg, ErrorDomain.ReqTime_is_null);
			} else {
				String regext = "\\d{4}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])(0[0-9]|1\\d|2[0-3])(0[0-9]|[1-5]\\d)(0[0-9]|[1-5]\\d)";
				Pattern pattern = Pattern.compile(regext, Pattern.DOTALL);
				Matcher matcher = pattern.matcher(reqTime);
				if (!matcher.matches()) {
					msg = buildValidateFalseMsg(msg,
							ErrorDomain.ReqTime_is_error);
				}
			}
			messageBo.setSrcReqTime(reqTime);
		}


		if (!msg.equals(EOPDomain.EMPTY_STRING)) {
			
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN, ErrorDomain.ERROR_CODE_9002,msg);
		}
		
		Object biz = cacheService.getKey(CacheKey.BusCode+messageBo.getBusCode(), messageBo.getTenant().getTenantId());
		
		if(biz==null){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"BusCode"+ messageBo.getBusCode()+ ErrorDomain.not_register);
		}else{
			BizFunction bizf = (BizFunction)biz;
			
			if(!(EOPDomain.NORMAL).equals(bizf.getState())){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(BusCode)"+ messageBo.getBusCode()+ ErrorDomain.status_unusable);
			}
		}
		
		
		
		
		Object contractVer = cacheService.getKey(CacheKey.ContractVer+messageBo.getContractVer(), messageBo.getTenant().getTenantId());
		if(contractVer==null){
			
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(ServiceContractVer)"+ messageBo.getContractVer()+ ErrorDomain.contract_version_not_exist);
		}else{
			
			ContractVersion ca = (ContractVersion)contractVer;
			messageBo.setContractVersion(ca);
			if( !(EOPDomain.NORMAL).equals(ca.getState())  ){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(ServiceContractVer)"+ messageBo.getContractVer()+ ErrorDomain.contract_version_unuseable);
			}
			if(!ca.getContract().getCode().equals(messageBo.getServiceCode())){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(ServiceCode)"+ messageBo.getServiceCode()+ErrorDomain.not_register+"(ServiceContractVer)"+ messageBo.getContractVer());
			}
		}
		
		Object srcOrg = cacheService.getKey(CacheKey.Org+messageBo.getSrcorgcode(), messageBo.getTenant().getTenantId());
		if(srcOrg==null){
			
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(SrcOrgID)" + messageBo.getSrcorgcode() + ErrorDomain.not_register);
		}else{
			Org orgBean = (Org)srcOrg;
			if(!(EOPDomain.ONLINE).equals(orgBean.getState())){
				
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(SrcOrgID)" + messageBo.getSrcorgcode() + ErrorDomain.status_unusable);
			}
		}
		
		
		Object dstOrg = cacheService.getKey(CacheKey.Org+messageBo.getDstOrgID(), messageBo.getTenant().getTenantId());
		if (dstOrg==null) {
			
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(DstOrgID)" + messageBo.getDstOrgID() + ErrorDomain.not_register);
		}else{
			Org orgBean = (Org)srcOrg;
			if(!(EOPDomain.ONLINE).equals(orgBean.getState())){
				
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(DstOrgID)" + messageBo.getDstOrgID() + ErrorDomain.status_unusable);
			}
		}
		
		Object srcComp = cacheService.getKey(CacheKey.Component+messageBo.getSrcsyscode(), messageBo.getTenant().getTenantId());
		if(srcComp==null){
			
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(SrcSysID)" + messageBo.getSrcsyscode() + ErrorDomain.not_register);
			
		}else{
			Component comp = (Component)srcComp;
			
			messageBo.setSrcComponent(comp);
			
			if(!(EOPDomain.ONLINE).equals(comp.getState())  ){

				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(SrcSysID)" + messageBo.getSrcsyscode() + ErrorDomain.status_unusable);
			}
			if(!comp.getOrg().getOrgCode().equals(messageBo.getSrcorgcode())){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(SrcOrgID)" + messageBo.getSrcsyscode() +ErrorDomain.not_register + "(SrcSysID)" + messageBo.getSrcsyscode());
			}
		}
		
		Object dstComp = cacheService.getKey(CacheKey.Component+messageBo.getDstSyscode(), messageBo.getTenant().getTenantId());
		if(dstComp==null){
			
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(DstSysID)" + messageBo.getDstSyscode() + ErrorDomain.not_register);
		}else{
			Component comp = (Component)dstComp;
			messageBo.setDstComponent(comp);
			if(!(EOPDomain.ONLINE).equals(comp.getState()) ){
				
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(DstSysID)" + messageBo.getDstSyscode() + ErrorDomain.status_unusable);
			}
			if(!comp.getOrg().getOrgCode().equals(messageBo.getDstOrgID())){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,"(DstOrgID)" + messageBo.getDstOrgID() +ErrorDomain.not_register + "(DstSysID)" + messageBo.getDstSyscode());
			}
		}
		
		strictValidateRequestTcpTransactionId(messageBo);
		 
		return messageBo;
	
	}
	
	
	/**
	 * @param requestTcp
	 * @throws RainbowException
	 */
	private void strictValidateRequestTcpTransactionId(MessageBO messageBo) {
		String transactionId = messageBo.getTransactionID();
		if(transactionId.length()!=28){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.transactionId_length_error);
		}
		if(!messageBo.getSrcsyscode().equals(transactionId.substring(0, 10))){
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.transactionId_component_error+messageBo.getSrcsyscode());
		}
		String regext = "\\d{4}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])";
		Pattern pattern = Pattern.compile(regext, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(transactionId.substring(10, 18));

		if (!matcher.matches()) {
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.transactionId_time_error);
		}
	}

	
	private String buildValidateFalseMsg(String msg, String errorMsg) {
		if (msg.equals(EOPDomain.EMPTY_STRING)) {
			msg = errorMsg;
		} else {
			msg = msg + "," + errorMsg;
		}
		return msg;
	}

	public IValidateServ getValidateServ() {
		return validateServ;
	}
	public void setValidateServ(IValidateServ validateServ) {
		this.validateServ = validateServ;
	}

	public String getDefalutHead() {
		return defalutHead;
	}

	public void setDefalutHead(String defalutHead) {
		this.defalutHead = defalutHead;
	}


	public boolean isNeedCheckTrans() {
		return needCheckTrans;
	}

	public void setNeedCheckTrans(boolean needCheckTrans) {
		this.needCheckTrans = needCheckTrans;
	}

	
}
