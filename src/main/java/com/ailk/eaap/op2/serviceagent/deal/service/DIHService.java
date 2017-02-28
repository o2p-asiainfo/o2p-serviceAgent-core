package com.ailk.eaap.op2.serviceagent.deal.service;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.dom4j.Document;

import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.JsonUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.MessageContextUtil;
import com.ailk.eaap.op2.serviceagent.log.MessageLogService;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.serviceagent.validate.service.IBaseValidateServ;
import com.ailk.eaap.op2.serviceagent.validate.service.IFlowControlService;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.OriLogClob;
/**
 * 
 * DIHService<br>
 * <p>
 * @version 1.0
 * @author litieyang Feb 18, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class DIHService implements IDIHService {
	private IBaseValidateServ baseValidateServ;
	private IRouteServ routeServ;
	private IFlowControlService flowControlServ;
	private static final Logger log = Logger.getLogger(DIHService.class);
	private String defalutHead;
	private MessageLogService messageLogService;
	private static final String DEF_EXC_CODE = "090014";
	public String getDefalutHead() {
		return defalutHead;
	}

	public void setDefalutHead(String defalutHead) {
		this.defalutHead = defalutHead;
	}

	public String exchange(MessageBO messageBo) {
		MessageBO retMsg = null;
		try{
			baseValidateServ.baseValidate(messageBo);
			messageBo.setReqorrsp(EOPDomain.REQ_FLAG);
			try{
				baseValidateServ.legitimateValidate(messageBo);
				retMsg = routeServ.route(messageBo);
				flowControlServ.subtraThreadNum(messageBo.getSerInvokeIns().getSerInvokeInsId()+"");
				
			}catch(EAAPException e){
				log.error("business error!!",e);
				messageBo.setEAAPException(e);
				if(e.getCode().equals(ErrorDomain.ERROR_CODE_9016)){
					String errorMsg = e.getmsg();
					log.error(errorMsg);
					if(messageBo.getExceptionCode()!=null){
						try{
							errorMsg = messageBo.getExceptionCode() + "|#|" + messageBo.getDstComponent().getName() + ":" + messageBo.getContractVersion().getContract().getName()+","+e.getmsg();
						}catch(Exception exx){
							log.error("build exce",e);
						}
					}
				}
				
				try{
					if(messageBo.getSerInvokeIns()!=null){
						flowControlServ.subtraThreadNum(messageBo.getSerInvokeIns().getSerInvokeInsId()+"");
					}
					
				}catch(Exception ex ){
					log.error("release thread error",ex);
				}
				
			}
			
				OriLogClob repOrg = new OriLogClob();
				repOrg.setMsg(messageBo.toAllString());
				repOrg.setReqOrRes(EOPDomain.RSP_FLAG);
				
				repOrg.setSrcTranId(messageBo.getTransactionID());
				messageBo.getLogMessageObject().getOriLogClobList().add(repOrg);
				
				if(messageBo.getDataType().equals(DataType.JSON) || EOPDomain.JSONFORMAT.equalsIgnoreCase(messageBo.getFormat())){
					OriLogClob jsonOrg = new OriLogClob();
					String jsonStr = JsonUtil.xml2JSON(messageBo.toString());
					jsonOrg.setMsg(jsonStr);
					jsonOrg.setReqOrRes(EOPDomain.RSP_FLAG);
					
					jsonOrg.setSrcTranId(messageBo.getTransactionID());
					messageBo.getLogMessageObject().getOriLogClobList().add(jsonOrg);
				}
				messageLogService.sendMessageLog(messageBo);
			String retStr = "";
			if(retMsg!=null&&(retMsg.getMsgBody() instanceof Document)){
				Document retXml = (Document) retMsg.getMsgBody();
				retStr = retXml.asXML();
			}else if(retMsg!=null&&(retMsg.getMsgBody() instanceof JSONObject)){
				JSONObject retJson = (JSONObject) retMsg.getMsgBody();
				retStr = retJson.toString();
			}else if(retMsg!=null&&(retMsg.getMsgBody() instanceof java.lang.String)){
				retStr = (String)retMsg.getMsgBody();
			}
			return retStr;
		}catch(Exception e){
			log.error("system error",e);
			try{
				String errorMsg = DEF_EXC_CODE + "|#|" +e.getMessage();
				String reStr = MessageContextUtil.getRespHead(defalutHead,CommonUtil.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,ErrorDomain.ERROR_CODE_9999,errorMsg,messageBo.getTransactionID());
				if(DataType.JSON.equals(messageBo.getDataType())){
					return JsonUtil.xml2JSON(reStr);
				}else{
					return MessageContextUtil.getRespHead(defalutHead,CommonUtil.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,ErrorDomain.ERROR_CODE_9999,errorMsg,messageBo.getTransactionID());
				}
			}catch(Exception ee){
				String errorMsg = DEF_EXC_CODE + "|#|" +ee.getMessage();
				return MessageContextUtil.getRespHead(defalutHead,CommonUtil.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,ErrorDomain.ERROR_CODE_9999,errorMsg,messageBo.getTransactionID());
			}
			
		}
		
		
	}

	public IRouteServ getRouteServ() {
		return routeServ;
	}
	public void setRouteServ(IRouteServ routeServ) {
		this.routeServ = routeServ;
	}

	public void setFlowControlServ(IFlowControlService flowControlServ) {
		this.flowControlServ = flowControlServ;
	}

	public IBaseValidateServ getBaseValidateServ() {
		return baseValidateServ;
	}

	public void setBaseValidateServ(IBaseValidateServ baseValidateServ) {
		this.baseValidateServ = baseValidateServ;
	}

	public MessageLogService getMessageLogService() {
		return messageLogService;
	}

	public void setMessageLogService(MessageLogService messageLogService) {
		this.messageLogService = messageLogService;
	}

}
