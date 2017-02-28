/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:JMSConnectionFactory.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2014年12月5日下午2:10:36 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service;  

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyStore;
import java.util.Hashtable;

import javax.jms.ConnectionFactory;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQSslConnectionFactory;
import org.apache.commons.lang.StringUtils;

import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
/** 
 * ClassName:JMSConnectionFactory  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年12月5日 下午2:10:36  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class JMSConnectionFactory {
	private static final Logger LOG = Logger.getLog(JMSConnectionFactory.class);
	
	private ConnectionFactory ibmMQConnectionFactory;
	
	/**
	 * 获取对应厂商的ConnectionFactory
	 * getjMSConnection:(这里用一句话描述这个方法的作用).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param tech
	 * @param mqType 
	 * @return 
	 * @throws NamingException 
	 * @since JDK 1.6
	 */
	public ConnectionFactory getJMSConnection(TechImpl tech, String mqType) throws NamingException {
		 
		String url = "";
		Object urlObj = tech.getAttrMap().get(EndpointAttr.ADDRESS);
		if(urlObj == null){
			throw new BusinessException(9070, "o2p-serviceagent-core.9070", new String[]{"techImplId="+tech.getTechImplId()}, null);
		}else{
			url = urlObj.toString();
//			if(!url.toLowerCase().startsWith("failover:") && !EndpointAttr.TIBCOJMS.equals(mqType)) {
//				url = "failover:("+url+")";
//			}
			if(LOG.isDebugEnabled()) {
				LOG.debug("mq url:"+url);
				LOG.debug("attr map:"+tech.getAttrMap());
				LOG.debug("EndpointAttr.TRUST_STORE_PASSWORD:"+EndpointAttr.TRUST_STORE_PASSWORD);
			}
		}
		
		String userName = null;
		Object userNameObject = tech.getAttrMap().get(EndpointAttr.USER_NAME);
		if(userNameObject != null && !StringUtils.isEmpty(userNameObject.toString())){
			userName = userNameObject.toString();
		}
		
		String passWord = null;
		Object passWordObject = tech.getAttrMap().get(EndpointAttr.PASSWORD);
		if(passWordObject != null && !StringUtils.isEmpty(passWordObject.toString())){
			passWord = passWordObject.toString();
		}
		
		String keyStore = null;
		Object keyStoreObject = tech.getAttrMap().get(EndpointAttr.KEY_STORE);
		if(keyStoreObject != null && !StringUtils.isEmpty(keyStoreObject.toString())){
			keyStore = keyStoreObject.toString();
		}
		
		String keyStorePassword = null;
		Object keyStorePasswordObject = tech.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD);
		if(keyStorePasswordObject != null && !StringUtils.isEmpty(keyStorePasswordObject.toString())){
			keyStorePassword = keyStorePasswordObject.toString();
		}
		
		String trustStore = null;
		Object trustStoreObject = tech.getAttrMap().get(EndpointAttr.TRUST_STORE);
		if(trustStoreObject != null && !StringUtils.isEmpty(trustStoreObject.toString())){
			trustStore = trustStoreObject.toString();
		}
		
		String trustStorePassword = null;
		Object trustStorePasswordObject = tech.getAttrMap().get(EndpointAttr.TRUST_STORE_PASSWORD);
		if(trustStorePasswordObject != null && !StringUtils.isEmpty(trustStorePasswordObject.toString())){
			trustStorePassword = trustStorePasswordObject.toString();
		}
		
		if(EndpointAttr.ACTIVEMQ.equals(mqType)) {
			
			if(keyStore != null) {
				//ssl
				ActiveMQSslConnectionFactory sslConnectionFactory = new ActiveMQSslConnectionFactory(url);
				try {

					sslConnectionFactory.setKeyAndTrustManagers(createKeyManager(keyStore,
						    keyStorePassword), createTrustManager(trustStore, trustStorePassword),
						    new java.security.SecureRandom());
					
					if(!StringUtils.isEmpty(userName)) {
						sslConnectionFactory.setUserName(userName);
					}
					if(!StringUtils.isEmpty(passWord)) {
						sslConnectionFactory.setPassword(passWord);
					}
					return sslConnectionFactory;
				} catch (Exception e) {
					LOG.error("activeMQSslConnectionFactory error ",e);
					throw new BusinessException(9999,"activeMQSslConnectionFactory error ", e);
				}
			} else {
				ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(url);
				if(!StringUtils.isEmpty(userName)) {
					activeMQConnectionFactory.setUserName(userName);
				}
				if(!StringUtils.isEmpty(passWord)) {
					activeMQConnectionFactory.setPassword(passWord);
				}
				return activeMQConnectionFactory;
			}
			
		} else if(EndpointAttr.IBMMQ.equals(mqType)) {
			return ibmMQConnectionFactory;
		}else if(EndpointAttr.TIBCOJMS.equals(mqType)){
			/*initial environment*/
			Hashtable<String, String> environment = new Hashtable<String, String>();
            environment.put(Context.INITIAL_CONTEXT_FACTORY, tech.getAttrMap().get(EndpointAttr.INITIAL_CONTEXT_FACTORY));
            environment.put(Context.PROVIDER_URL,  url);
            environment.put(Context.SECURITY_PRINCIPAL,  userName);
            environment.put(Context.SECURITY_CREDENTIALS,  passWord); 
            InitialContext ctx = new InitialContext(environment);
            ConnectionFactory tibcoJMSConnectionFactory = (ConnectionFactory) ctx.lookup(tech.getAttrMap().get(EndpointAttr.ES_QUEUE_CONNECTION_FACTORY));

			return tibcoJMSConnectionFactory; 
		}
		
		return null;
		
	}
	

	   protected TrustManager[] createTrustManager(String trustStore, String trustStorePassword) throws Exception {
		   TrustManager[] trustStoreManagers = null;
	        KeyStore trustedCertStore = KeyStore.getInstance("jks");

	        if (trustStore != null) {
	            InputStream tsStream = getInputStream(trustStore);

	            trustedCertStore.load(tsStream, StringUtils.isEmpty(trustStorePassword)?null:trustStorePassword.toCharArray());
	            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

	            tmf.init(trustedCertStore);
	            trustStoreManagers = tmf.getTrustManagers();
	        }
	        return trustStoreManagers;
	    }
	   
	   protected KeyManager[] createKeyManager(String keyStore, String keyStorePassword) throws Exception {
		   KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
	        KeyStore ks = KeyStore.getInstance("jks");
	        KeyManager[] keystoreManagers = null;
	        if (keyStore != null) {
	            byte[] sslCert = loadClientCredential(keyStore);

	            if (sslCert != null && sslCert.length > 0) {
	                ByteArrayInputStream bin = new ByteArrayInputStream(sslCert);
	                ks.load(bin, keyStorePassword.toCharArray());
	                kmf.init(ks, keyStorePassword.toCharArray());
	                keystoreManagers = kmf.getKeyManagers();
	            }
	        }
	        return keystoreManagers;
	    }
	   
	   protected byte[] loadClientCredential(String fileName) throws IOException {
	        if (fileName == null) {
	            return null;
	        }
	        InputStream in = getInputStream(fileName);
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        byte[] buf = new byte[512];
	        int i = in.read(buf);
	        while (i > 0) {
	            out.write(buf, 0, i);
	            i = in.read(buf);
	        }
	        in.close();
	        return out.toByteArray();
	    }
	   
	   protected InputStream getInputStream(String urlOrResource) throws IOException {
	        try {
	            File ifile = new File(urlOrResource);
	            // only open the file if and only if it exists
	            if (ifile.exists()) {
	                return new FileInputStream(ifile);
	            }
	        } catch (Exception e) {
	        	LOG.error(e.getMessage(), e);
	        }

	        InputStream ins = null;

	        try {
	            URL url = new URL(urlOrResource);
	            ins = url.openStream();
	            if (ins != null) {
	                return ins;
	            }
	        } catch (MalformedURLException ignore) {
	        	LOG.error(ignore.getMessage(), ignore);
	        }

	        // Alternatively, treat as classpath resource
	        if (ins == null) {
	            ins = Thread.currentThread().getContextClassLoader().getResourceAsStream(urlOrResource);
	        }

	        if (ins == null) {
	            throw new IOException("Could not load resource: " + urlOrResource);
	        }

	        return ins;
	    }
}
