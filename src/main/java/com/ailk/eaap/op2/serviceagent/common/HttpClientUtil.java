package com.ailk.eaap.op2.serviceagent.common;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ognl.Ognl;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.HeadMethod;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.OptionsMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.lang.StringUtils;
import org.apache.http.client.methods.HttpDelete;

import sun.misc.BASE64Encoder;

import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.StatisticData;
import com.ailk.eaap.op2.common.StringUtil;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;

@SuppressWarnings("deprecation")
public final class HttpClientUtil {

	private static final Logger LOG = Logger.getLog(HttpClientUtil.class);

	public static final int TIME_OUT =10 ;
	//每个代理使用一个httpClient
	public static Map<String, HttpClient> httpClientMap = new HashMap<String, HttpClient>();
	private static MultiThreadedHttpConnectionManager dd = new MultiThreadedHttpConnectionManager();
	
	private HttpClientUtil() {
		super();
	}


	
	static{
		dd.setMaxConnectionsPerHost(1000);
		dd.setMaxTotalConnections(2000);
		httpClientMap.put("NoProxy", new HttpClient(dd));
	}
	
	
	/**
	 * @param url
	 * @param inputObj
	 *            发送到服务器的对象。
	 * 
	 * @return 服务器返回到客户端的对象。
	 * @throws IOException
	 */
	public static String sendObjFromServer(String url, int timeout,
			Serializable inputObj) throws IOException {

		PostMethod post = new PostMethod(url);
		HttpClient logHttpClient = new HttpClient();

		post.setRequestHeader("Content-Type", "application/octet-stream");

		java.io.ByteArrayOutputStream bOut = new java.io.ByteArrayOutputStream();
		java.io.ByteArrayInputStream bInput = null;
		java.io.ObjectOutputStream out = null;
		java.io.InputStream in = null;
		String returnObj = null;
		try {
			logHttpClient.getParams().setConnectionManagerTimeout(timeout * 1000);
			logHttpClient.getParams().setSoTimeout(timeout * 1000);
			logHttpClient.setConnectionTimeout(timeout*1000);
			logHttpClient.setTimeout(timeout*1000);
			logHttpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(0, false));
			
			out = new java.io.ObjectOutputStream(bOut);

			out.writeObject(inputObj);

			out.flush();
			out.close();

			out = null;

			bInput = new java.io.ByteArrayInputStream(bOut.toByteArray());

			RequestEntity re = new InputStreamRequestEntity(bInput);
			post.setRequestEntity(re);

			logHttpClient.executeMethod(post);

			in = post.getResponseBodyAsStream();
			java.io.ObjectInputStream oInput = new java.io.ObjectInputStream(in);
			returnObj = (String) oInput.readObject();
			oInput.close();
			oInput = null;
		} catch (Exception e) {
			throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{"http invoke exception"+e.getMessage()}, e);
		}  finally {
			try{
				if (out != null) {
					out.close();
					out = null;

				}
				if(in!=null){
					in.close();
					in = null;
				}
				if (bInput != null) {
					bInput.close();
					bInput = null;

				}
				if(bOut!=null){
					bOut.close();
					bOut = null;
				}
				if(post!=null){
					post.releaseConnection();
				}
				if (logHttpClient != null) {
					if(logHttpClient.getHttpConnectionManager()!=null){
						((SimpleHttpConnectionManager) (logHttpClient.getHttpConnectionManager())).shutdown();
					}
					
					
				}
			}catch(Exception e){
				throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{"http connection shutdown error"+e.getMessage()}, e);
			}
			
			
		}

		return returnObj;

	}
	
	public static String webserviceSend(String address,Map<String, String> reqHead,String msg,int timeout,String servicename,String returnparam,String username ,String password ,String proxyip,String port) throws BusinessException{
		return webserviceSend(address, reqHead, msg, timeout, servicename, returnparam, username , password ,
				 proxyip, port,null,  null, null, null);
		
	}
	
	
	
	
	public static String webserviceSend(String address,Map<String, String> reqHead,String msg,int timeout,String servicename,String returnparam,String username ,String password ,
			String proxyip,String port,String trustStore,String  trustStorePassword,String keyStore,String keyStorePassword) throws BusinessException{
		return null;
		
	}
	
	
	public static String sendRequest(MessageBO<?> messageBo,String address, Map<String, String> reqHead,  String msg, String contentType, String method,  int timeout,String servicename,String userName,String password,String proxyIP,String proxyPort,Object  statusOgnl, Object needBreakOgnl) throws BusinessException{		
		
		return sendRequest(messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, null, null, null, null, 443,statusOgnl,  needBreakOgnl);
	}
	
	
	@SuppressWarnings("restriction")
	public static String sendRestOrHttpRequest(MessageBO<?> messageBo,String address, Map<String, String> reqHead,  String msg, 
			String contentType, String method,  int timeout,String servicename,String userName,String password,
			String proxyIP,String proxyPort,String trustStore,String  trustStorePassword,String keyStore,
			String keyStorePassword, int port,Object  statusOgnl, Object needBreakOgnl,String restOrHttp) {
		
		HttpClient httpClient = null;
		HttpMethod httpMethod = null;
	
		String returnStr = "";
				
		String errMsg = " call "+servicename+" error. address="+address+" ";
		if(LOG.isDebugEnabled()) {
			LOG.debug("method:",method);
			
		}
		try{
			address.replaceAll("\\{", "%7B").replaceAll("\\}", "%7D");
			if(InType.post.equalsIgnoreCase(method)){
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("post");
				}
				
				httpMethod = new PostMethod(address);
				((PostMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg != null ? msg : "", contentType, EOPDomain.CHARSET_UTF8));
			}
			else if(InType.get.equalsIgnoreCase(method)){
				if(LOG.isDebugEnabled()) {
					LOG.debug("get");
				}
				
				httpMethod = new GetMethod(address);
							
			}else if(InType.put.equalsIgnoreCase(method)){
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("put");
				}

				httpMethod = new PutMethod();
				
				httpMethod.setURI(new URI(address, false));  
				((PutMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg != null ? msg : "", contentType, EOPDomain.CHARSET_UTF8));
				
			}else if(InType.delete.equalsIgnoreCase(method)){
			
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("delete");
				}				
				httpMethod = new HttpDeleteMethod(address);
				((HttpDeleteMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg != null ? msg : "", contentType, EOPDomain.CHARSET_UTF8));
			}else if(InType.head.equalsIgnoreCase(method)){
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("head");
				}
				
				httpMethod = new HeadMethod(address); 
				
			}else if(InType.options.equalsIgnoreCase(method)){
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("options");
				}
				
				httpMethod = new OptionsMethod(address); 
				
			}else{
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("defalut post");
				}
				 
				httpMethod = new PostMethod(address);
				
				((PostMethod)httpMethod).setRequestEntity(new StringRequestEntity(msg != null ? msg : "", contentType, EOPDomain.CHARSET_UTF8));
				
			}
			
			//代理
			if(!StringUtils.isEmpty(proxyIP) && !StringUtils.isEmpty(proxyPort)){
				if(LOG.isDebugEnabled()) {
					LOG.debug(" proxyIP:"+proxyIP+", proxyPort:"+proxyPort+" ");
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
			            new AuthScope(url.getHost(), url.getPort(), "realm"),
			            usernamePassword
			        );
				httpMethod.setDoAuthentication( true );
				
			}
			

			// 设置HTTP请求头
			if(LOG.isDebugEnabled()) {
				LOG.debug("contentType:"+contentType);
			}
			
			
			if(reqHead != null){
				
				Set<Entry<String, String>> set = reqHead.entrySet();
				for(Entry<String, String> entry : set){
					if(LOG.isDebugEnabled()) {
						LOG.debug("request head");
						LOG.debug(entry.getKey()+":"+entry.getValue());
					}
					
					if(!InType.headers.contains(entry.getKey().toLowerCase())) {
						httpMethod.addRequestHeader(entry.getKey(), entry.getValue());	
					}
				}
			}
			
			//ssl
			if((!StringUtils.isEmpty(trustStorePassword) && !StringUtils.isEmpty(trustStore))
				|| !StringUtils.isEmpty(keyStore)){
				if(LOG.isDebugEnabled()){
					LOG.debug("call https....");
				}
				
				Protocol myhttps = new Protocol("https", new AuthSSLProtocolSocketFactory((keyStore==null?null:new URL(keyStore)),keyStorePassword,(trustStore==null?null:new URL(trustStore)),trustStorePassword), port);   
				Protocol.registerProtocol("https", myhttps);
			} else {
				if(LOG.isDebugEnabled()){
					LOG.debug("call http....also support https");
				}
				
				Protocol myhttps = new Protocol("https", new SSLProtocolSocketFactory(), port);   
				Protocol.registerProtocol("https", myhttps);
			}
				
			if(LOG.isDebugEnabled()){
				
				LOG.debug("trustStore:"+trustStore);
				LOG.debug("trustStorePassword:"+trustStorePassword);
				LOG.debug("keyStore:"+keyStore);
				LOG.debug("keyStorePassword:"+keyStorePassword);
				
				//System.setProperty("javax.net.debug","ssl,handshake"); 
			}
								
			httpClient.getParams().setSoTimeout(timeout * 1000);
			
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout * 1000);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(timeout * 1000);
			httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(0, false));

			
			if(LOG.isDebugEnabled()){
				//proxy转发次数统计
				if(reqHead.get("AUTH_CODE")!=null){
					synchronized (StatisticData.class) {
						StatisticData.httpSendcount++;
					}					
				}
			}
			//调用远端的HTTP服务
			int statusCode = httpClient.executeMethod(httpMethod);
			
			Header[] rspHeads  = httpMethod.getResponseHeaders();
			
			if(rspHeads != null){
				if(messageBo != null) {
					messageBo.getMsgHead().clear();
					for(Header header : rspHeads) {
						messageBo.getMsgHead().put(header.getName(), header.getValue());
					}
				}
			}

			//保存响应编码
			if(messageBo != null) {
				messageBo.getMsgHead().put(EOPDomain.HTTP_STATUS_CODE, Integer.valueOf(statusCode).toString());
			}
			
			if(LOG.isDebugEnabled()) {
				LOG.debug("statuscode:" + statusCode);
			}
			
			String reqcontentType = "";
			if(messageBo != null) {
				
				reqcontentType = (String)messageBo.getMsgHead().get("Content-Type");
			}
					
			
			if(null!=reqcontentType&&reqcontentType.toLowerCase().startsWith(InType.Image)){
				if(LOG.isDebugEnabled()) {
					LOG.debug("http getResponse Byte BASE64Encoder");
				}
				returnStr = new BASE64Encoder().encode(httpMethod.getResponseBody());
				
			}else if(httpMethod.getResponseBodyAsStream() != null) {
				
				returnStr = StringUtil.getString(httpMethod.getResponseBodyAsStream(), EOPDomain.CHARSET_UTF8);
			}
			
			errMsg += ". statusCode="+statusCode+".  response:  "+returnStr;
			
			if("HTTP".equals(restOrHttp) && ((statusCode+"").startsWith("4") || (statusCode+"").startsWith("5"))) {
				
				LOG.error(LogModel.EVENT_APP_EXCPT, "call "+servicename+" error. address="+address+". statusCode="+statusCode+".  response:  "+returnStr);
				if(statusOgnl!=null){
					String statusOgnlStr = statusOgnl.toString();
					
					Object resultObj = Ognl.getValue(statusOgnlStr, statusCode+"");
					
					if(resultObj!=null && "true".equals(resultObj.toString())){
						
					}else{
						LOG.error(LogModel.EVENT_APP_EXCPT, "call "+servicename+" error. address="+address+". statusCode="+statusCode+".  response:  "+returnStr);
						throw new BusinessException(9073, "o2p-serviceagent-core.9073",  new String[]{errMsg}, null);
					}
				}else{
					throw new BusinessException(9073, "o2p-serviceagent-core.9073",  new String[]{errMsg}, null);
				}
				
				
				
				
			}
			
			if(needBreakOgnl!=null){
				String needBreakOgnlStr = needBreakOgnl.toString();
				if(!StringUtils.isEmpty(needBreakOgnlStr)) {
					
					Object resultObj = Ognl.getValue(needBreakOgnlStr, statusCode+"");
					
					if(resultObj!=null && "true".equals(resultObj.toString())){
						messageBo.setNeedBreak(true);
					}
				}
			}

		}catch(ConnectException e){
			LOG.error(LogModel.EVENT_APP_EXCPT, errMsg, e);
			
			throw new BusinessException(9073, "o2p-serviceagent-core.9073",  new String[]{ errMsg}, e);
		}
		catch(SocketTimeoutException e){
			LOG.error(LogModel.EVENT_APP_EXCPT,  errMsg, e);
			
			throw new BusinessException(9074, "o2p-serviceagent-core.9074",  new String[]{ errMsg}, e);
		}  catch (Exception e) {
		
			LOG.error(LogModel.EVENT_APP_EXCPT,  errMsg , e);
			if(e instanceof BusinessException) {
				throw (BusinessException)e;
			}
			throw new BusinessException(9999,"o2p-serviceagent-core.9999", new String[]{ errMsg}, e);
		}finally{
			messageBo.setRequestURL(address);
			try{
				if(httpMethod != null) {
					httpMethod.releaseConnection();
				}
			}catch (Exception e) {

				LOG.error(LogModel.EVENT_APP_EXCPT, e);
			}
			
		}
		return returnStr;
		
	}
	
	public static String sendRequest(MessageBO<?> messageBo,String address, Map<String, String> reqHead,  String msg, 
			String contentType, String method,  int timeout,String servicename,String userName,String password,
			String proxyIP,String proxyPort,String trustStore,String  trustStorePassword,String keyStore,
			String keyStorePassword, int port,
			Object statusOgnl,Object needBreakOgnl) throws BusinessException{		
		
		return sendRestOrHttpRequest(messageBo, address, reqHead, msg, contentType, method, timeout, servicename, userName, password, proxyIP, proxyPort, trustStore, trustStorePassword, keyStore, keyStorePassword, port, statusOgnl, needBreakOgnl, "HTTP");
	}
	
	
	
	/**
	 * 对特殊字符进行编码
	 * @param param
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String encodeURL(String param, boolean transformEncode) throws UnsupportedEncodingException {
		if(transformEncode) {
			param = new String(param.getBytes("iso-8859-1"), "UTF-8");
		}
		return URLEncoder.encode(param);
	}


	/**
	 * 拼接url参数字符串
	 * @param msgUrl
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String getQueryString(Map<String,String> msgUrl, boolean transformEncode) throws UnsupportedEncodingException {
		
		StringBuffer queryString = new StringBuffer();
		Set<Entry<String, String>> set = msgUrl.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			Object obj = entry.getValue();
			if(obj instanceof String) {
				
				String value = entry.getValue();
				if(value.contains(";")) {
					
					String[] params = value.split(";");
					for(String param : params) {
						
						if(!StringUtils.isEmpty(param)) {
							
							queryString.append("&"+key +"="+encodeURL((String)param, transformEncode));
						}
					}
				} else {
					
					queryString.append("&"+key +"="+encodeURL((String)value, transformEncode));
				}
			} else if(obj instanceof String[]) {
				
				String[] params = (String[])obj;
				for(String param : params) {
					
					queryString.append("&"+key +"="+encodeURL(param, transformEncode));
				}
			}
			
		}
		return "".equals(queryString.toString())? "" : queryString.toString().substring(1, queryString.toString().length());
	}
	
}
