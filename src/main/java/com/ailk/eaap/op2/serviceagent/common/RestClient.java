package com.ailk.eaap.op2.serviceagent.common;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





import org.apache.commons.lang.StringUtils;

import com.ailk.eaap.op2.common.InType;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;

public final class RestClient {
	
	private static final Logger LOG = Logger.getLog(HttpClientUtil.class);
	
	private RestClient() {
		super();
	}


	public static String restCall(Map<String, String> httpHead, String restResource,String restAction, 
			String address, MessageBO<?> messageBo, int timeout,String serviceName, String userName, 
			String password, String proxyIp, String proxyPort,
			String trustStore,String  trustStorePassword,String keyStore,
			String keyStorePassword, int port,
			Object statusOgnl,Object needBreakOgnl) throws BusinessException, UnsupportedEncodingException{
		
		String url = getUrl(address,messageBo, restResource);
		String conType = httpHead.get(EOPDomain.CONTENT_TYPE);
		if(!messageBo.getMessageMap().isEmpty()) {
			if(InType.get.equalsIgnoreCase(restAction)) {
				url +=  "?"  + HttpClientUtil.getQueryString(messageBo.getMessageMap(), true);
			} else {
				url +=  "?"  + HttpClientUtil.getQueryString(messageBo.getMessageMap(), false);
			}
		}
		
		if(LOG.isDebugEnabled()) {
			LOG.debug("rest call, url="+url);
		}
		return HttpClientUtil.sendRestOrHttpRequest(messageBo, url, httpHead, messageBo.toString(), conType, restAction, timeout, 
				serviceName, userName, password, proxyIp, proxyPort,trustStore,trustStorePassword,keyStore,keyStorePassword, port, statusOgnl, needBreakOgnl,"REST");
	}


	private static String getUrl(String adress, MessageBO<?> messageBo, String restResource) {
		
		Map<String, String> msgUrl = messageBo.getMessageMap();
		
		StringBuffer resultPath = new StringBuffer();
		String paths[] = restResource.split("\\/");
		for(String path : paths) {
			if(!"".equals(path)) {
				Pattern pattern = Pattern.compile("\\{\\S+\\}");    
				Matcher matcher = pattern.matcher(path);  
				if(matcher.matches()) {
					String key = path.replaceFirst("\\{", "").replaceFirst("\\}", "");
					path = (String)msgUrl.get(key);
					if(!StringUtils.isEmpty(path)) {
						messageBo.getMessageMap().remove(key);
					}
				}
				path = "/"+path;
				resultPath.append(path);
			}
		}
		return adress+resultPath.toString();
	}
	
}
