package com.ailk.eaap.op2.serviceagent.route.service;

import org.apache.log4j.Logger;

import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.MessageContextUtil;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
/**
 * 
 * <br>
 * <p>
 * @version 1.0
 * @author litieyang Sep 2, 2013
 * <hr>
 * <hr>
 * <br>       
 * <hr>
 */
public class BatchParseProcessor implements EndpointProcessor{

	private static final Logger logger = Logger.getLogger(BatchParseProcessor.class);
	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	private static final String SUCCESS = "SUCCESS";
	private String defalutHead ;
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		try{
			Object reqOrRspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
			if(reqOrRspObj==null){
				throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.req_rsp_no_config);
			}
			Object contractVersionObj = endpoint.getAttrMap().get(EndpointAttr.origincontractversion);
			if(contractVersionObj==null){
				throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.target_version_not_config);
			}
			logger.debug(contractVersionObj.toString()+reqOrRspObj.toString());
			
			String parseMsg  = msg.toString();
			
			if(reqOrRspObj.toString().equals(EOPDomain.REQ_FLAG)){
				parseMsg  = msg.toString();
			}
			logger.debug("parse msg"+parseMsg);
			
			logger.debug("so long time");
			msg.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil.getNow(), ErrorDomain.ERROR_TYPE_SUCCESS,ErrorDomain.ERROR_CODE_0000,SUCCESS,msg.getTransactionID()));
			return msg;
		}catch(EAAPException e){
			throw e;
		}catch(Exception e){
			logger.error("batchParse error",e);
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.batch_parse_inner_error,e);
		}
		
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

	public String getDefalutHead() {
		return defalutHead;
	}

	public void setDefalutHead(String defalutHead) {
		this.defalutHead = defalutHead;
	}

}
