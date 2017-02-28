package com.ailk.eaap.op2.serviceagent.protocol;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.NodeDesc;

@Service
public class RestController extends ProtocolController implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 初始化服务ID及服务版本号
	 */
	@Override
	public String initServiceAndCvKey(MessageBO messageBo, String urlPath, String action, boolean isBase) {
		//缓存读取正则表达式及serviceId
		Object regExpMapObject = cacheService.getKey(CacheKey.Rest, messageBo.getTenant().getTenantId());
		
		if(regExpMapObject != null) {
			
			List<Map<String, String>> regExpMapList = (List<Map<String, String>>)regExpMapObject;
			for(Map<String, String> regExpMap : regExpMapList) {
				String actionStr = regExpMap.get("action");
				String urlResource = regExpMap.get("urlResource");
				//匹配rest资源表达式
				if(urlPath.equals(urlResource) && action.equalsIgnoreCase(actionStr)) {
					String version = regExpMap.get("version");
					String serviceCode = regExpMap.get("serviceCode");
					
					messageBo.setServiceCode(serviceCode);
					messageBo.setContractVer(version);
					return urlResource;
				}
			}
			
			for(Map<String, String> regExpMap : regExpMapList) {
				String regExp = regExpMap.get("regExp");
				String actionStr = regExpMap.get("action");
				String urlResource = regExpMap.get("urlResource");
				//匹配正则表达式
				Pattern patternReg = Pattern.compile(regExp);    
				Matcher matcherReg = patternReg.matcher(urlPath); 
				if(matcherReg.matches() && action.equalsIgnoreCase(actionStr)) {
					String version = regExpMap.get("version");
					String serviceCode = regExpMap.get("serviceCode");
					
					messageBo.setServiceCode(serviceCode);
					messageBo.setContractVer(version);
					return urlResource;
				}
			}
		}
		
		//rest会按pathInfo根节点逐级往上找，只对第一层抛异常
		if(!isBase) {
			
			throw new BusinessException(9040, "o2p-serviceagent-core.9040", new String[]{"urlResource="+urlPath+", are you use the right action? You request action is '"+action+"'"}, null);
		} else {
			
			return null;
		}
	}



	/**
	 * 针对rest 当协议版本不存在则往根路径查找协议版本，如/a/b/c 不存在则找/a/b
	 * modify by wuwuz
	 * TODO 简单描述该方法的实现功能（可选）. 
	 *  com.ailk.eaap.op2.serviceagent.protocol.ProtocolController#getUpperSerVersion(com.ailk.eaap.op2.serviceagent.common.MessageBO, java.lang.String)
	 */
	@Override
	public String getUpperSerVersion(MessageBO<?> messageBo, String pathInfo) {
		String action = messageBo.getInType();
		int index = 0;
		while(true) {
			index = pathInfo.lastIndexOf("/".toCharArray()[0]);
			if(index <= 0) {
				break;
			}
			else {
				pathInfo = pathInfo.substring(0, index);
			}
			initServiceAndCvKey(messageBo, pathInfo, action, true);
		
			if(messageBo.getContractVer() != null) {

				initContractVersion(messageBo);
				
				//查找到协议格式退出循环
				ContractFormat cf = messageBo.getContractVersion().getRspContractFormat();
				if(cf != null) {
					
					break;
				}
			}
		}
		return null;
	}
	
	@Override
	public void initUrlResource(MessageBO messageBo, String urlResource, String pathInfo) {
		//rest资源参数
		String[] pathInfos = pathInfo.split("\\/");
		if(!StringUtils.isEmpty(urlResource)) {
			String[] urlResources = urlResource.split("\\/");
			for(int i=0; i<pathInfos.length; i++ ) {
				if(!StringUtils.isEmpty(pathInfos[i]) && !StringUtils.isEmpty(urlResources[i])
						&& !pathInfos[i].equals(urlResources[i])) {
					String key = urlResources[i].replaceFirst("\\{", "").replaceFirst("\\}", "");
					
					messageBo.getMessageMap().put(key, pathInfos[i]);
				}
			}
		}
		
	}
	
	@Override
	public ContractVersion getBaseContractVer(MessageBO<?> messageBo, String pathIndo) {

		String basePath = "";
		if(pathIndo.startsWith("/")) {
			
			basePath = pathIndo.substring(0, pathIndo.replaceFirst("/", "").indexOf("/".toCharArray()[0])+1);
		} else {
			
			basePath = pathIndo.substring(0, pathIndo.indexOf("/".toCharArray()[0]));
		}
		
		initServiceAndCvKey(messageBo, basePath, messageBo.getInType(), true);
		
		if(messageBo.getContractVer() != null) {

			Object cv = cacheService.getKey(CacheKey.ContractVer+messageBo.getContractVer(), messageBo.getTenant().getTenantId());
			messageBo.setContractVer(null);
			if(cv != null) {
				
				return (ContractVersion)cv;
			}
		}
		
		return null;
	}

	@Override
	protected void restJavaFieldInit(MessageBO<?> messageBo,
			ContractVersion restBaseCv) {

		ContractFormat cf = null;
		
		if(restBaseCv != null && (cf = restBaseCv.getReqContractFormat()) != null) {
			
			List<NodeDesc> nodeList = cf.getNodeDescs();
			
			protocolValidateSer.mapParse(messageBo,  nodeList);
		}
	}


}
