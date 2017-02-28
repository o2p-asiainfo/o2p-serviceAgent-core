package com.ailk.eaap.op2.serviceagent.validate.service;

import org.apache.log4j.Logger;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.EndpointProcessor;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

public class NodeDescValidateServ implements EndpointProcessor{

	private IValidateServ validateServ;
	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	private static final Logger LOG = Logger.getLogger(NodeDescValidateServ.class);
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public NodeDescValidateServ(){
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			throws EAAPException {
		// TODO Auto-generated method stub
		LOG.debug(endpoint.getAttrMap());
		try{
			Object reporrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
			if(reporrspObj==null){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.req_rsp_no_config);
			}
			
			ContractVersion contractVer = msg.getContractVersion();
			Object contractVersionObj = endpoint.getAttrMap().get(EndpointAttr.contractVersion);
			if(contractVersionObj!=null){
				String contractVersion = contractVersionObj.toString();
				Object obj = cacheService.getKey(CacheKey.ContractVer+contractVersion, msg.getTenant().getTenantId());
				if(obj!=null){
					contractVer = (ContractVersion)obj;
				}
				
			}
			
			return validateServ.validate( msg,contractVer,reporrspObj.toString());
		}catch(EAAPException e){
			throw e ;
		}catch(Exception e){
			LOG.error("NodeDescValidateServ system error",e);
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.system_error,e);
		}
		
	}

	public void subtraThreadNum(String servId) throws EAAPException {
		// TODO Auto-generated method stub
		
	}

	public IValidateServ getValidateServ() {
		return validateServ;
	}

	public void setValidateServ(IValidateServ validateServ) {
		this.validateServ = validateServ;
	}
	
}
