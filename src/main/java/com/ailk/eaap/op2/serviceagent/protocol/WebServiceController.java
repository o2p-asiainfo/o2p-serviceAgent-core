package com.ailk.eaap.op2.serviceagent.protocol;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.Api;

@Service
public class WebServiceController extends ProtocolController implements Serializable {

	private static final long serialVersionUID = 1L;

	public String getWsdlFile(String resourceAliss, String tentantCode) {
		
		Object tenObj = cacheService.getObjByKey(CacheKey.TENANT+tentantCode);
		Tenant ten = null;
		if(tenObj != null) {
			
			ten = (Tenant)tenObj;
		} else {
			
			ten = new MessageBO().getTenant();
		}
		
		Object o = cacheService.getKey(CacheKey.Wsdl+resourceAliss,ten.getTenantId());
		if( o!= null && resourceAliss != null) {
			return o.toString();
		}
		
		return null;
	}

	@Override
	public String getUpperSerVersion(MessageBO<?> messageBo, String pathInfo) {
		
		return null;
	}

	/**
	 * 
	 * TODO {资源别名.方法名}对应{api_method}（可选）. 
	 *  com.ailk.eaap.op2.serviceagent.protocol.ProtocolController#initServiceAndCvKey(MessageBO, String, String, boolean)
	 */
	@Override
	public String initServiceAndCvKey(MessageBO<?> messageBo, String resourceAliss,
			String inType, boolean isBase) {
		
		String apiMethod = "";
		String soapOperationName = "";
		//javaField:apiname已经有值
		if(!StringUtils.isEmpty(messageBo.getApiname())) {
			
			apiMethod = messageBo.getApiname();
		} else {
			
			soapOperationName = getOperationByMsgBody(messageBo);
			apiMethod = resourceAliss+"."+soapOperationName;
		}
		
		Api api = getApi(apiMethod, messageBo);
		
		if(api != null) {
			
			messageBo.setContractVer(api.getContractVer());
			messageBo.setServiceCode(api.getServiceCode());
		} else {
			
			oldSupportInitCvAndServKey(messageBo, resourceAliss, soapOperationName);
		}
		//serviceCode 及 contractVer都未初始化则抛异常
		if(StringUtils.isEmpty(messageBo.getServiceCode()) || 
				StringUtils.isEmpty(messageBo.getContractVer())) {
			throw new BusinessException(9044, "o2p-serviceagent-core.9044",new String[]{"cache key='"+CacheKey.Api+apiMethod+"' , The value of '"+apiMethod+"' must configed in the table 'api' the column 'api_method' "}, null);
		}
		
		return null;
	}

	/**
	 * 
	 * oldSupportInitCvAndServKey:(旧版本查找方式支持).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param messageBo 
	 * @param soapOperationName 
	 * @since JDK 1.6
	 */
	private void oldSupportInitCvAndServKey(MessageBO messageBo, String resourceAliss, String soapOperationName) {

		String cvKey = protocolValidateSer.getContractVersionKey(messageBo, resourceAliss, soapOperationName);
		
		messageBo.setContractVer(cvKey);
	}

	private String getOperationByMsgBody(MessageBO<?> messageBo) {
		
		if(messageBo.getMsgBody() instanceof Document) {
			
			Document  document = (Document)messageBo.getMsgBody();
			Element root = document.getRootElement();
			Element body = root.element("Body");
			if(body != null) {
				
				List<Element> bodyElelist = body.elements();
				for(Element e : bodyElelist) {
					return e.getName();
				}
			}
		} 
			
		throw new BusinessException(9999, "Init serviceKey error, This is a webservice inteface, the request message must be XML SOAP format.");
	}
}
