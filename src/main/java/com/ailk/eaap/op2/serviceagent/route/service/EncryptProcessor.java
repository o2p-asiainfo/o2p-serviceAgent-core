package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Node;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.linkage.rainbow.util.StringUtil;

/**
 * 
 * 加密端点<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author litieyang Jul 18, 2013
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */
public class EncryptProcessor implements EndpointProcessor {

	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	private static final Logger LOG = Logger.getLogger(EncryptProcessor.class);
	public void clear() {
		// TODO Auto-generated method stub

	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		try{
			Map<String , Object> attrMap = endpoint.getAttrMap() ;
			//加密方式
			Object  encryptTypeObj =  attrMap.get(EndpointAttr.encrtyptType) ;
			//请求应答标识
			Object reqOrrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
			//mac所在节点
			Object macPathObj = endpoint.getAttrMap().get(EndpointAttr.Path);
			//加密协议对象
			Object encryptContractObj = endpoint.getAttrMap().get(EndpointAttr.encryptContract);
			//加密类型
			String encryptType = null;
			//请求应答标识
			String reqOrrsp = null;
			//待加密源字符串
			String moStr = null;
			//mac所在节点
			String macPath = null;
			String mac = null;
			ContractVersion cv = null;
			ContractFormat cf = null;
			if(encryptContractObj!=null){
				Object cvObj = cacheService.getKey(CacheKey.ContractVer+encryptContractObj.toString(), msg.getTenant().getTenantId());
				if(cvObj!=null){
					cv = (ContractVersion)cvObj;
				}
			}
			if(cv==null){
				cv = msg.getContractVersion();
			}
			if(reqOrrspObj==null){
				throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.req_rsp_no_config);
			}else{
				reqOrrsp = reqOrrspObj.toString();
			}
			
			if(macPathObj==null){
				throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.mac_Path_not_config);
			}else{
				macPath = macPathObj.toString();
			}
			
			if(encryptTypeObj==null){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.encryptType_config_error);
			}else{
				encryptType = encryptTypeObj.toString();
			}
			
			
			Document xmldoc = (Document) msg.getMsgBody();
			if(reqOrrsp.equals(EOPDomain.REQ_FLAG)){
				cf = cv.getReqContractFormat();
				moStr = this.getEncryptStr(cf, xmldoc);
			}else{
				cf = cv.getRspContractFormat();
				moStr = this.getEncryptStr(cf, xmldoc);
			}
			if(encryptType.equals(EOPDomain.MD5)){
				mac = StringUtil.Md5(moStr);
			}
			if(encryptType.equals(EOPDomain.THREEDES)){
				String key = null;
				//密钥
				Object  keyObj = attrMap.get(EndpointAttr.key) ;
				if(keyObj==null){
					throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.threedes_lost_private_key);
				}else{
					key = keyObj.toString();
					if(key.startsWith("HEAD")){
						Object obj = msg.getMsgHead().get(key.split("/*")[1]);
						if(obj==null){
							throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.threedes_lost_private_key);
						}else{
							key = obj.toString();
						}
					}
					mac = StringUtil.threeDES(moStr, key);
				}
				
				
			}
			if(reqOrrsp.equals(EOPDomain.REQ_FLAG)){
				List<Node> nodes = xmldoc.selectNodes(macPath);
				if(nodes!=null){
					Node node = nodes.get(0);
					node.setText(mac);
				}
				msg.setMsgBody(xmldoc);
			}else{
				List<Node> nodes = xmldoc.selectNodes(macPath);
				if(nodes!=null){
					Node node = nodes.get(0);
					node.setText(mac);
				}
			}
			
		}catch(EAAPException e){
			throw e;
		}catch(Exception e){
			LOG.error("encryptprocessor system error",e);
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.system_error,e);
		}
		
		return null;
	}

	private static String getEncryptStr(ContractFormat cf,Document doc){
		List<NodeDesc> des = cf.getNodeDescs();
		if(des!=null){
			StringBuffer stb = new StringBuffer();
			for (NodeDesc nodeDesc : des) {
				if(nodeDesc.getIsNeedSign()!=null && nodeDesc.getIsNeedSign().equals(EOPDomain.YES)){
					List<Node> nodes = doc.selectNodes(nodeDesc.getNodePath());
					if(nodes!=null){
						for (Node node : nodes) {
							stb.append(node.asXML());
						}
					}
				}
			}
			return stb.toString();
		}
		return null;
	}
	
	

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub

	}

}
