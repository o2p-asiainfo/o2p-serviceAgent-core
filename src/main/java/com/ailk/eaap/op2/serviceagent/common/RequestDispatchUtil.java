package com.ailk.eaap.op2.serviceagent.common;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletResponse;



import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.HeadMethod;
import org.apache.commons.httpclient.methods.OptionsMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.lang.StringUtils;

import sun.misc.BASE64Encoder;

import com.ailk.eaap.o2p.common.spring.config.ZKCfgCacheHolder;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.StatisticData;
import com.ailk.eaap.op2.common.StringUtil;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;


@SuppressWarnings("deprecation")
public final class RequestDispatchUtil {

	private static final Logger logger = Logger.getLog(HttpClientUtil.class);

	public static final int TIME_OUT =ZKCfgCacheHolder.PROP_ITEMS.get("serviceAgent.client.timeOut")==null?120:Integer.valueOf(ZKCfgCacheHolder.PROP_ITEMS.get("serviceAgent.client.timeOut").toString()) ;
	public static Map<String, HttpClient> httpClientMap = new HashMap<String, HttpClient>();
	private static MultiThreadedHttpConnectionManager dd = new MultiThreadedHttpConnectionManager();
	
	private RequestDispatchUtil() {
		super();
	}


	
	static{
		dd.setMaxConnectionsPerHost(1000);
		dd.setMaxTotalConnections(2000);
		httpClientMap.put("NoProxy", new HttpClient(dd));
	}
	
	
	
	
	
	
	
	
	public static String sendRequest(HttpServletResponse response, MessageBO<?> messageBo,String address, Map<String, String> reqHead,  String msg, String contentType, String method,  int timeout,String servicename,String userName,String password,String proxyIP,String proxyPort,Object  statusOgnl, Object needBreakOgnl) throws BusinessException{		
		
		return sendRequest(response, messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, null, null, null, null, 443,statusOgnl,  needBreakOgnl);
	}
	
	
	@SuppressWarnings("restriction")
	public static String sendRestOrHttpRequest(HttpServletResponse response, MessageBO<?> messageBo,String address, Map<String, String> reqHead,  String msg, 
			String contentType, String method,  int timeout,String servicename,String userName,String password,
			String proxyIP,String proxyPort,String trustStore,String  trustStorePassword,String keyStore,
			String keyStorePassword, int port,Object  statusOgnl, Object needBreakOgnl,String restOrHttp) {
		
		HttpClient httpClient = null;
		HttpMethod httpMethod = null;
	
		String returnStr = "";
				
		String errMsg = " call "+servicename+" error. address="+address+" ";
		if(logger.isDebugEnabled()) {
			logger.debug("method:",method);
			
		}
		try{
			if(InType.post.equalsIgnoreCase(method)){
				
				if(logger.isDebugEnabled()) {
					logger.debug("post");
				}
				
				httpMethod = new PostMethod(address);
				((PostMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg != null ? msg : "", contentType, EOPDomain.CHARSET_UTF8));
			}
			else if(InType.get.equalsIgnoreCase(method)){
				if(logger.isDebugEnabled()) {
					logger.debug("get");
				}
				
				httpMethod = new GetMethod(address);
							
			}else if(InType.put.equalsIgnoreCase(method)){
				
				if(logger.isDebugEnabled()) {
					logger.debug("put");
				}

				httpMethod = new PutMethod();
				
				httpMethod.setURI(new URI(address, false));  
				((PutMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg != null ? msg : "", contentType, EOPDomain.CHARSET_UTF8));
				
			}else if(InType.delete.equalsIgnoreCase(method)){
			
				
				if(logger.isDebugEnabled()) {
					logger.debug("delete");
				}				
				httpMethod = new DeleteMethod(address);
				
			}else if(InType.head.equalsIgnoreCase(method)){
				
				if(logger.isDebugEnabled()) {
					logger.debug("head");
				}
				
				httpMethod = new HeadMethod(address); 
				
			}else if(InType.options.equalsIgnoreCase(method)){
				
				if(logger.isDebugEnabled()) {
					logger.debug("options");
				}
				
				httpMethod = new OptionsMethod(address); 
				
			}else{
				
				if(logger.isDebugEnabled()) {
					logger.debug("defalut post");
				}
				 
				httpMethod = new PostMethod(address);
				
				((PostMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg != null ? msg : "", contentType, EOPDomain.CHARSET_UTF8));
				
			}
			
			//浠ｇ悊
			if(!StringUtils.isEmpty(proxyIP) && !StringUtils.isEmpty(proxyPort)){
				if(logger.isDebugEnabled()) {
					logger.debug(" proxyIP:"+proxyIP+", proxyPort:"+proxyPort+" ");
				}
				httpClient = httpClientMap.get(proxyIP+proxyPort);
				if(httpClient == null) {
					
					httpClient = new HttpClient(dd);
					httpClientMap.put(proxyIP+proxyPort, httpClient);
				}
				
				httpClient.getHostConfiguration().setProxy(proxyIP, Integer.parseInt(proxyPort));  
				httpClient.getParams().setAuthenticationPreemptive(true); 
				
				errMsg += "proxyIP:"+proxyIP+", proxyPort:"+proxyPort;
				
			} else {
				httpClient = httpClientMap.get("NoProxy");
				
				errMsg += " ,Not use proxy. ";
			}
						
			if(userName !=null && !userName.equals("")){
				httpClient.getParams().setAuthenticationPreemptive(true); 
				
				Credentials  usernamePassword = new UsernamePasswordCredentials(
	                    userName, password);
				URL url = new URL(address);
				
				httpClient.getState().setCredentials(
			            new AuthScope(url.getHost(), 443, "realm"),
			            usernamePassword
			        );
				httpMethod.setDoAuthentication( true );
				
			}
			

			// 璁剧疆HTTP璇锋眰澶�
			if(logger.isDebugEnabled()) {
				logger.debug("contentType:"+contentType);
			}
			
			
			if(reqHead != null){
				Set<Entry<String, String>> set = reqHead.entrySet();
				for(Entry<String, String> entry : set){
					if(logger.isDebugEnabled()) {
						logger.debug("request head");
						logger.debug(entry.getKey()+":"+entry.getValue());
					}
					
					if(!InType.headers.contains(entry.getKey().toLowerCase())) {
						httpMethod.addRequestHeader(entry.getKey(), entry.getValue());	
					}
				}
			}
			
			//ssl
			if((!StringUtils.isEmpty(trustStorePassword) && !StringUtils.isEmpty(trustStore))
				|| !StringUtils.isEmpty(keyStore)){
				if(logger.isDebugEnabled()){
					logger.debug("call https....");
				}
				
				Protocol myhttps = new Protocol("https", new AuthSSLProtocolSocketFactory((keyStore==null?null:new URL(keyStore)),keyStorePassword,(trustStore==null?null:new URL(trustStore)),trustStorePassword), port);   
				Protocol.registerProtocol("https", myhttps);
			} else {
				if(logger.isDebugEnabled()){
					logger.debug("call http....also support https");
				}
				
				Protocol myhttps = new Protocol("https", new SSLProtocolSocketFactory(), port);   
				Protocol.registerProtocol("https", myhttps);
			}
				
			if(logger.isDebugEnabled()){
				
				logger.debug("trustStore:"+trustStore);
				logger.debug("trustStorePassword:"+trustStorePassword);
				logger.debug("keyStore:"+keyStore);
				logger.debug("keyStorePassword:"+keyStorePassword);
				
				//System.setProperty("javax.net.debug","ssl,handshake"); 
			}
								
			httpClient.getParams().setSoTimeout(timeout * 1000);
			
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout * 1000);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(timeout * 1000);
			httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(0, false));

			
			if(logger.isDebugEnabled()){
				//proxy杞彂娆℃暟缁熻
				if(reqHead.get("AUTH_CODE")!=null){
					synchronized (StatisticData.class) {
						StatisticData.httpSendcount++;
					}					
				}
			}
			//璋冪敤杩滅鐨凥TTP鏈嶅姟
			int statusCode = httpClient.executeMethod(httpMethod);
			response.setStatus(statusCode);
			Header[] rspHeads  = httpMethod.getResponseHeaders();
			if(rspHeads != null){
				if(messageBo != null) {
					messageBo.getMsgHead().clear();
					for(Header header : rspHeads) {
						messageBo.getMsgHead().put(header.getName(), header.getValue());

						 if("Transfer-Encoding".equals(header.getName())){
							 continue;
						 }
						response.addHeader(header.getName(), header.getValue());
					}
				}
			}

			//淇濆瓨鍝嶅簲缂栫爜
			if(messageBo != null) {
				messageBo.getMsgHead().put(EOPDomain.HTTP_STATUS_CODE, Integer.valueOf(statusCode).toString());
			}
			
			if(logger.isDebugEnabled()) {
				logger.debug("statuscode:" + statusCode);
			}
			
			String reqcontentType = "";
			if(messageBo != null) {
				reqcontentType = (String)messageBo.getMsgHead().get("Content-Type");
			}
			
			if(null!=reqcontentType&&reqcontentType.toLowerCase().startsWith(InType.Image)){
				if(logger.isDebugEnabled()) {
					logger.debug("http getResponse Byte BASE64Encoder");
				}
				returnStr = new BASE64Encoder().encode(httpMethod.getResponseBody());
				
			}else if(httpMethod.getResponseBodyAsStream() != null) {
				
				returnStr = StringUtil.getString(httpMethod.getResponseBodyAsStream(), EOPDomain.CHARSET_UTF8);
			}
			
			errMsg += ". statusCode="+statusCode+".  response:  "+returnStr;
			
		}catch(ConnectException e){
			logger.error(LogModel.EVENT_APP_EXCPT, errMsg, e);
			
			throw new BusinessException(9073, "o2p-serviceagent-core.9073",  new String[]{ errMsg}, e);
		}
		catch(SocketTimeoutException e){
			logger.error(LogModel.EVENT_APP_EXCPT,  errMsg, e);
			
			throw new BusinessException(9074, "o2p-serviceagent-core.9074",  new String[]{ errMsg}, e);
		}  catch (Exception e) {
		
			logger.error(LogModel.EVENT_APP_EXCPT,  errMsg , e);
			if(e instanceof BusinessException) {
				throw (BusinessException)e;
			}
			throw new BusinessException(9999,"o2p-serviceagent-core.9999", new String[]{ errMsg}, e);
		}finally{
			if(messageBo != null) {
				
				messageBo.setRequestURL(address);
			}
			
			try{
				if(httpMethod != null){
					httpMethod.releaseConnection();
				}
					
			}catch (Exception e) {

				logger.error(LogModel.EVENT_APP_EXCPT, e);
			}
			
		}
		return returnStr;
		
	}
	
	public static String sendRequest(HttpServletResponse response, MessageBO<?> messageBo,String address, Map<String, String> reqHead,  String msg, 
			String contentType, String method,  int timeout,String servicename,String userName,String password,
			String proxyIP,String proxyPort,String trustStore,String  trustStorePassword,String keyStore,
			String keyStorePassword, int port,
			Object statusOgnl,Object needBreakOgnl) throws BusinessException{		
		
		return sendRestOrHttpRequest(response, messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, trustStore, trustStorePassword, keyStore, keyStorePassword, port, statusOgnl, needBreakOgnl, "HTTP");
	}
	
}
