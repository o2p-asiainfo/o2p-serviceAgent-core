package com.ailk.eaap.op2.serviceagent.validate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.Org;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.O2pDocumentHelper;
import com.ailk.eaap.op2.common.XmlUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.MainData;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.jayway.jsonpath.JsonPath;

@Service
public class ProtocolValidateServ implements IProtocolValidateServ{

	private static final Logger log = Logger.getLogger(ProtocolValidateServ.class);
	private IMemcacheManageServ cacheService;



    public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	/**
     * validate request data length
     * @param messageBo
     * @throws EAAPException
     */
	public void validateSize(MessageBO<?> messageBo) throws BusinessException {
		String reqMessage = messageBo.toString();
		messageBo.setOrgReqMsg(reqMessage);
		int length = reqMessage.length();
		
		if(length>EOPDomain.MAX_LIMIT_MESSAGE_SIZE){ 
			log.error( "The request message is out of length"+length);
			throw new BusinessException(9043,"o2p-serviceagent-core.9043", new String[]{(length/(1024*1024))+"M", (EOPDomain.MAX_LIMIT_MESSAGE_SIZE/(1024*1024))+"M"}, null);
		}
	}


	public void xmlParse(MessageBO<?> messageBo,  List<NodeDesc> headNodeDescList) throws BusinessException {
		
		Document xmldoc = null;
		if(messageBo.getMsgBody() instanceof Document) {
			xmldoc = (Document)messageBo.getMsgBody();
		}
		for(NodeDesc headNode : headNodeDescList) {
			String javaField = headNode.getJavaField();
			if(!StringUtils.isEmpty(javaField)) {
				//body节点
				if("2".equals(headNode.getNodeType())) {	
					if(xmldoc == null) {
						throw new BusinessException(9046, "o2p-serviceagent-core.9046", new String[]{"validate node error, request body is null ,  content-type is xml,javaField="+javaField}, null);
					}
					String nodePath = headNode.getNodePath();
					
					if(StringUtils.isEmpty(nodePath)) {
						throw new BusinessException(9039, "o2p-serviceagent-core.9039", new String[]{"validate node error, node path is null ,  javaField="+javaField}, null);
					}
					String newNodePath = XmlUtil.changeNodePath(xmldoc, nodePath);
					List<Node> nodes = xmldoc.selectNodes(newNodePath);
					List<String> nodeValueList = new ArrayList<String>();
					for (Node node : nodes) {
						nodeValueList.add(node.getText());
						setNodeValue2Bo(messageBo, node.getText(), headNode);
					}
				
					nodeValidate(messageBo,headNode, newNodePath, nodeValueList,nodes.size(),"2");
				}
			}
		}
	}

	
	public void jsonParse(MessageBO<?> messageBo,
			List<NodeDesc> headNodeDescList) throws BusinessException {
		JSONObject jsonObject = null;
		if(messageBo.getMsgBody() instanceof JSONObject) {
			jsonObject = (JSONObject)messageBo.getMsgBody();
		}
		
		for(NodeDesc headNode : headNodeDescList) {
			String javaField = headNode.getJavaField();
			if(!StringUtils.isEmpty(javaField)) {
				//body节点
				if("2".equals(headNode.getNodeType())) {
					if(jsonObject == null) {
						throw new BusinessException(9046, "o2p-serviceagent-core.9046", new String[]{"validate node error, request body is null , content-type is json, javaField="+javaField}, null);
					}
					String nodePath = headNode.getNodePath();
					
					if(StringUtils.isEmpty(nodePath)) {
						throw new BusinessException(9039, "o2p-serviceagent-core.9039", new String[]{"validate node error, node path is null ,  javaField="+javaField}, null);
					}
					
					Object nodeValueObject = JsonPath.read(jsonObject.toString(),nodePath);
					List<String> nodeValueList = new ArrayList<String>();
					if(nodeValueObject != null) {
						nodeValueList.add(nodeValueObject.toString());
						setNodeValue2Bo(messageBo, nodeValueObject.toString(), headNode);
					}
				
					nodeValidate(messageBo,headNode, nodePath, nodeValueList,1,"2");
				}
				
			}
		}
	}

	
	public void mapParse(MessageBO<?> messageBo,  List<NodeDesc> headNodeDescList) throws BusinessException{
		for(NodeDesc headNode : headNodeDescList) {
			String javaField = headNode.getJavaField();
			if(!StringUtils.isEmpty(javaField)) {
				//head url节点
				if("1".equals(headNode.getNodeType()) || "4".equals(headNode.getNodeType())) {
					String nodePath = headNode.getNodePath();
					
					if(StringUtils.isEmpty(nodePath)) {
						throw new BusinessException(9039, "o2p-serviceagent-core.9039", new String[]{"validate node error, node path is null ,  javaField="+javaField}, null);
					}
					
					List<String> nodeValueList = new ArrayList<String>();
					//由于msgHead中的值都为小写
					Object nodeValueObj = messageBo.getMsgHead().get(StringUtils.isEmpty(nodePath) ? "" : nodePath.toLowerCase());
					if(nodeValueObj != null) {
						messageBo.getMsgHead().remove(nodePath);
						nodeValueList.add(nodeValueObj.toString());
					}
					
					if(nodeValueObj==null){
						nodeValueObj = messageBo.getMessageMap().get(nodePath);
						if(nodeValueObj != null) {
							messageBo.getMessageMap().remove(nodePath);
							nodeValueList.add(nodeValueObj.toString());
						}
					}
					
					if(nodeValueObj != null) {
						setNodeValue2Bo(messageBo, nodeValueObj.toString(), headNode);
					}
				
					nodeValidate(messageBo,headNode, nodePath, nodeValueList,nodeValueList.size(),"1");
				}
			}
		}
	}


   

	private void nodeValidate(MessageBO<?> messageBo, NodeDesc headNode, String nodePath, List<String> nodeValueList, int nodeSize, String nodeValidaType) throws BusinessException {
		
		Object isNeedCheck = headNode.getIsNeedCheck();
		String nodeType = headNode.getNodeType();
		if(isNeedCheck !=null && isNeedCheck.toString().equals(EOPDomain.YES) 
				&& !StringUtils.isEmpty(nodeType) && nodeValidaType.equals(nodeType)){
			String nodeNumberCons = headNode.getNodeNumberCons();
			if(nodeNumberCons.equals(EOPDomain.mustOne) || nodeNumberCons.equals(EOPDomain.mustmulti)){
				if(nodeSize < 1){
					throw new BusinessException(9046, "o2p-serviceagent-core.9046", new String[]{"validate node error,  nodePath="+nodePath+", nodeDescId="+headNode.getNodeDescId()}, null);
				}
				if(nodeNumberCons.equals(EOPDomain.mustOne)){
					if(nodeSize > 1){
						throw new BusinessException(9047, "o2p-serviceagent-core.9047", new String[]{"validate node error, nodePath="+nodePath+", nodeDescId="+headNode.getNodeDescId()}, null);
					}
				}
				
				for(String nodeValue : nodeValueList) {
					valueValidate(messageBo,headNode,nodeValue);
				}
			} else {
				for(String nodeValue : nodeValueList) {
					if(!StringUtils.isEmpty(nodeValue)) {
						valueValidate(messageBo,headNode,nodeValue);
					}
				}
			}
		}
	}
	
    /**
     * @param messageBo
     * @param headNode
     * @param nodeValue
     * @throws EAAPException
     */
	private void valueValidate(MessageBO<?> messageBo, NodeDesc headNode, String nodeValue) throws BusinessException{
		String nodePath = headNode.getNodePath();
		String nodeLengthCons = headNode.getNodeLengthCons();
		if(nodeValue==null){
			throw new BusinessException(9048,"o2p-serviceagent-core.9048",new String[]{"validate node value error, node="+nodePath+", nodeDescId="+headNode.getNodeDescId()}, null);
		}
		
		if(nodeLengthCons!=null && nodeLengthCons.length()>0){
			String head = nodeLengthCons.substring(0,1);
			String length = nodeLengthCons.substring(1,nodeLengthCons.length());
			if(head.equals(EOPDomain.F)){
				if(nodeValue.length()!=Integer.valueOf(length)){
					throw new BusinessException(9049,"o2p-serviceagent-core.9049", new String[]{"validate node value error,node="+nodePath, ",nodeLengthCons="+length+", nodeDescId="+headNode.getNodeDescId()}, null);
				}
			}else{

				if(nodeValue.length()>Integer.valueOf(length)){
					throw new BusinessException(9049,"o2p-serviceagent-core.9049", new String[]{"validate node value error,node="+nodePath, ",nodeLengthCons="+length+", nodeDescId="+headNode.getNodeDescId()}, null);
				}
			}
		}
		
		String nevlConsType = headNode.getNevlConsType();
		String nevlConsValue = headNode.getNevlConsValue();
		if(nevlConsType!=null && nevlConsType.equals(EOPDomain.fixed)){
			
			if(!nodeValue.equals(nevlConsValue)){
				throw new BusinessException(9050,"o2p-serviceagent-core.9050",new String[]{"validate node value error,node="+nodePath, ",nevlConsValue="+nevlConsValue+", nodeDescId="+headNode.getNodeDescId()}, null);
			}
		}
		if(nevlConsType!=null && nevlConsType.equals(EOPDomain.enums)){
			if(!StringUtils.isEmpty(nevlConsValue)){
				String values[] = nevlConsValue.split(",");
				if(!isContain(nodeValue,values)){
					throw new BusinessException(9050,"o2p-serviceagent-core.9050", new String[]{"validate node value error,node="+nodePath+", nodeDescId="+headNode.getNodeDescId()}, null);
				}	
			}
		}
		if(nevlConsType!=null && nevlConsType.equals(EOPDomain.mainData)){
			Object data = cacheService.getKey(CacheKey.MainData+nevlConsValue, messageBo.getTenant().getTenantId());
			log.debug((nevlConsValue));
			if(data!=null){
				List<MainData> mainDatas = (List<MainData>) data;
				if(mainDatas.size()>0){
					boolean isRight = false;
					for (MainData mainData : mainDatas) {
						if(mainData.getCepValues().equals(nodeValue)){
							isRight = true;
						}
					}
					if(!isRight){
						throw new BusinessException(9050,"o2p-serviceagent-core.9050", new String[]{"validate node value error,node="+nodePath+", nodeDescId="+headNode.getNodeDescId()}, null);
					}
				}
			}
		}
		
	}

	
	private void setNodeValue2Bo(MessageBO messageBo, String nodeValue, NodeDesc headNode) {
			
		String javaField = headNode.getJavaField();
		
		if(InType.APPKEY.equals(javaField)) {
			messageBo.setAppKey(nodeValue);
		} else if(InType.APINAME.equals(javaField)) {
			messageBo.setApiname(nodeValue);
		} else if(InType.SrcSysCode.equals(javaField)) {
			messageBo.setSrcsyscode(nodeValue);
		} else if(InType.ReqTime.equals(javaField)) {
			messageBo.setSrcReqTime(nodeValue);
		} else if(InType.DstSysID.equals(javaField)) {
			messageBo.setDstSyscode(nodeValue);
		} else if(InType.Format.equals(javaField)) {
			messageBo.setFormat(nodeValue);
		} else if(InType.TRANSID.equals(javaField)) {
			messageBo.setTransactionID(nodeValue);
		} else if(InType.Method.equals(javaField)) {
			messageBo.setApiname(nodeValue);
		} else if(InType.BusiCode.equals(javaField)) {
			messageBo.setApiname(nodeValue);
		} else if(InType.ServiceContractVer.equals(javaField)) {
			messageBo.setContractVer(nodeValue);
		} else if(InType.IP.equals(javaField)) {
			messageBo.setIp(nodeValue);
		} else if(InType.Sign.equals(javaField)) {
			messageBo.setSign(nodeValue);
		} else if(InType.AccessToken.equals(javaField)) {
			messageBo.setAccessToken(nodeValue);
		}else if(InType.MsgBody.equals(javaField)) {
			if(nodeValue!=null){
				String valueType = headNode.getNodeTypeCons();
				if(EOPDomain.JSONSTR.equals(valueType)){
					JSONObject json = JSONObject.fromObject(nodeValue);
					
					messageBo.setMsgBody(json);
				}else if(EOPDomain.XMLSTR.equals(valueType)){
					Document doc = null;
					try {
						doc = O2pDocumentHelper.parseText(nodeValue);
					} catch (DocumentException e) {
						// TODO Auto-generated catch block
						log.error( "The request message document parse error ",e);			
					}
					messageBo.setMsgBody(doc);
				}else{
					messageBo.setMsgBody(nodeValue);
				}
			}

		}else if(InType.scopeId.equals(javaField)){
			messageBo.setScopeId(nodeValue);
		}
	}
	
	private boolean isContain(String value,String values[]){
		boolean isContain = false;
		for (int i = 0; i < values.length; i++) {
			if(value.equals(values[i])){
				isContain = true;
				break;
			}
		}
		return isContain;
	}


	public void initComponentByAppKey(MessageBO<?> messageBo) throws BusinessException {
		
		String appKey = messageBo.getAppKey();
		Object appObj = cacheService.getKey(CacheKey.App+appKey, messageBo.getTenant().getTenantId());
		
		if(appObj==null){
			throw new BusinessException(9055, "o2p-serviceagent-core.9055", new String[]{"cache key="+CacheKey.App+appKey}, null);
		}
		App app = (App)appObj;
		if(app.getAppState()!=null && !app.getAppState().equals(EOPDomain.ONLINE)){
			throw new BusinessException(9056, "o2p-serviceagent-core.9056", new String[]{" Pls check the state,online state="+EOPDomain.ONLINE}, null);
		}
		messageBo.setSrcsyscode(app.getComponentCode());
		messageBo.setApp(app);
		
		Object srcSys = cacheService.getKey(CacheKey.Component+messageBo.getSrcsyscode(), messageBo.getTenant().getTenantId());
		if(srcSys==null){
			throw new BusinessException(9057,"o2p-serviceagent-core.9057", new String[]{"key="+CacheKey.Component+messageBo.getSrcsyscode()}, null);
		}
		Component srcc = (Component)srcSys;
		messageBo.setSrcComponent(srcc);
		messageBo.setSrcorgcode(srcc.getOrg().getOrgCode());
		
		String dstSysID = messageBo.getDstSyscode();
		if(dstSysID!=null && !dstSysID.equals("")){
			Object componentObj = cacheService.getKey(CacheKey.Component+dstSysID, messageBo.getTenant().getTenantId());
			if(componentObj==null){
				throw new BusinessException(9057,"o2p-serviceagent-core.9057", new String[]{"dstComponent key="+CacheKey.Component+dstSysID}, null);
			}else{
				Component compBean = (Component)componentObj;
				if(!(EOPDomain.ONLINE).equals(compBean.getState())){
					throw new BusinessException(9058,"o2p-serviceagent-core.9058", new String[]{"dstComponent componentId="+compBean.getComponentId()+", online state="+EOPDomain.ONLINE}, null);
				}
				messageBo.setDstComponent(compBean);
			}
			messageBo.setDstSyscode(dstSysID);
			
		}
	}
	
	
	public String getContractVersionKey(MessageBO<?> messageBo, String resourceAliss, String soapOperationName) throws BusinessException {
		
		Object apiOperationObject = cacheService.getKey(CacheKey.ApiOperationName+resourceAliss, messageBo.getTenant().getTenantId());

		if(apiOperationObject != null) {
			List<Map<String, Object>> apiMethodList = (List<Map<String, Object>>)apiOperationObject;
			if(apiMethodList.size() == 1) {
				Map<String, Object> apiMethodMap = apiMethodList.get(0);
				String serviceCode = apiMethodMap.get("SERVICE_CODE") == null ? null : apiMethodMap.get("SERVICE_CODE").toString();
				messageBo.setServiceCode(serviceCode);
				return apiMethodMap.get("VERSION").toString();
			}
			
			
			if(soapOperationName != null) {
				for(Map<String, Object> map : apiMethodList) {
					String serviceEnName = map.get("SERVICE_EN_NAME") == null ? null : map.get("SERVICE_EN_NAME").toString();
					String docVersion = map.get("DOC_VERSION") == "" ? null : map.get("DOC_VERSION").toString();
					String resAli=resourceAliss;
					if(!StringUtils.isEmpty(resAli) && resAli.endsWith(docVersion)) {
						resAli = resAli.substring(0, resAli.lastIndexOf(docVersion));
					}
					//alias+document version+method=service en name
					if((resAli+"."+docVersion+"."+soapOperationName).equals(serviceEnName)) {
						String serviceCode = map.get("SERVICE_CODE") == null ? null : map.get("SERVICE_CODE").toString();
						messageBo.setServiceCode(serviceCode);
						return map.get("VERSION").toString();
					}
				}
			}
		}
		
		if(soapOperationName != null) {
			Object contractOperObject = cacheService.getKey(CacheKey.ContractOperationName+resourceAliss, messageBo.getTenant().getTenantId());
			if(contractOperObject != null) {
				List<Map<String, Object>> contractOperList = (List<Map<String, Object>>)contractOperObject;
				for(Map<String, Object> map : contractOperList) {
					String operationName = map.get("VALUE").toString();
					if(soapOperationName.equals(operationName)) {
						String serviceCode = map.get("SERVICE_CODE") == null ? null : map.get("SERVICE_CODE").toString();
						messageBo.setServiceCode(serviceCode);
						return map.get("VERSION").toString();
					}
				}
			}
		}
		
		return null;
	}
	

    /**
     * @param messageBo
     * @throws EAAPException
     */
	public void initComponentBySrcCode(MessageBO<?> messageBo) throws BusinessException {
		
		Object srcComp = cacheService.getKey(CacheKey.Component+messageBo.getSrcsyscode(), messageBo.getTenant().getTenantId());
		if(srcComp==null){
			
			throw new BusinessException(9057,"o2p-serviceagent-core.9057", new String[]{"Srcsyscode="+messageBo.getSrcsyscode()} , null);
		}else{
			Component comp = (Component)srcComp;
			
			messageBo.setSrcComponent(comp);
			
			if(!(EOPDomain.ONLINE).equals(comp.getState())  ){

				throw new BusinessException(9058,"o2p-serviceagent-core.9058", new String[]{"Srcsyscode="+messageBo.getSrcsyscode()+", Pls change the state , the state of online ="+EOPDomain.ONLINE} , null);
			}
		}
		
		String srcOrgCode = messageBo.getSrcorgcode();
		if(!StringUtils.isEmpty(srcOrgCode)) {
			Object srcOrg = cacheService.getKey(CacheKey.Org+srcOrgCode, messageBo.getTenant().getTenantId());
			if(srcOrg==null){
				
				throw new BusinessException(9060, "o2p-serviceagent-core.9060", new String[]{"srcOrgCode="+srcOrgCode} , null);
			}else{
				Org orgBean = (Org)srcOrg;
				if(!(EOPDomain.ONLINE).equals(orgBean.getState())){
					
					throw new BusinessException(9061,"o2p-serviceagent-core.9061", new String[]{"srcOrgCode="+srcOrgCode+", online state="+EOPDomain.ONLINE} , null);
				}
			}
		}
		
		String dstOrgId = messageBo.getDstOrgID();
		if(!StringUtils.isEmpty(dstOrgId)) {
			Object dstOrg = cacheService.getKey(CacheKey.Org+dstOrgId, messageBo.getTenant().getTenantId());
			if (dstOrg==null) {
				
				throw new BusinessException(9060, "o2p-serviceagent-core.9060", new String[]{"dstOrgId="+dstOrgId} , null);
			}else{
				Org orgBean = (Org)dstOrg;
				if(!(EOPDomain.ONLINE).equals(orgBean.getState())){
					
					throw new BusinessException(9061,"o2p-serviceagent-core.9061", new String[]{"dstOrgId="+dstOrgId+", online state="+EOPDomain.ONLINE} , null);
				}
			}
		}
	}

	public Document getDocument(String reqXml) throws BusinessException {
		Document xmldoc = null;
		try{
			
			xmldoc = O2pDocumentHelper.parseText(reqXml);
		}catch(Exception e){
			
			throw new BusinessException(9999, "o2p-serviceagent-core.9999",  new String[]{e.getMessage()}, e);
		}
		
		return xmldoc;
	}

	@Override
	public void checkNeedNode(MessageBO<?> messageBo, List<NodeDesc> nodeDescList) {
		String appkey = "";
		String appKeyNodeType ="";
		String appKeyNodePath ="";
		int appKeyNodeId = -1;
		
		String src = "";
		String srcNodeType ="";
		String srcNodePath ="";
		int srcNodeId = -1;
		if(nodeDescList != null) {
			for(NodeDesc headNode : nodeDescList) {
				String javaField = headNode.getJavaField();
				
				if(!StringUtils.isEmpty(javaField)) {
					if(InType.APPKEY.equals(javaField)) {
						appkey = InType.APPKEY;
						appKeyNodeType = headNode.getNodeType();
						appKeyNodePath = headNode.getNodePath();
						appKeyNodeId = headNode.getNodeDescId();
					}
					
					if(InType.SrcSysCode.equals(javaField)) {
						src = InType.SrcSysCode;
						srcNodeType = headNode.getNodeType();
						srcNodePath = headNode.getNodePath();
						srcNodeId = headNode.getNodeDescId();
					}
					 
				}
			}
		}
		//messageBo的appkey和srcSysCode都为空
		if(StringUtils.isEmpty(messageBo.getAppKey()) && StringUtils.isEmpty(messageBo.getSrcsyscode())) {
			//已配置appkey或srcSysCode的javaField
			if(InType.APPKEY.equals(appkey)) {
				throw new BusinessException(9054, "o2p-serviceagent-core.9054", new String[]{"The Node of AppKey has configed  in the NodeDesc, but can not get the node value. "
						+ "Please check the nodeType is right. nodeType="
						+appKeyNodeType+" ,NodePath="+appKeyNodePath+" , NodeId="+appKeyNodeId}, null);
			}
			
			if(InType.SrcSysCode.equals(src)) {
				throw new BusinessException(9054, "o2p-serviceagent-core.9054", new String[]{"The Node of SrcSysCode has configed  in the NodeDesc, but can not get the node value."
						+ "Please check the nodeType is right.  nodeType="
						+srcNodeType+" ,NodePath="+srcNodePath+" , NodeId="+srcNodeId}, null);
			}
			//未配置appkey或srcSysCode的javaField
			if(StringUtils.isEmpty(appkey) && StringUtils.isEmpty(src)) {
				throw new BusinessException(9054, "o2p-serviceagent-core.9054", new String[]{"The Node of SrcSysCode and AppKey does not configed  in the NodeDesc.Pls config the javaField node in the base contract or sub contract."}, null);
			}
		}
	}

}