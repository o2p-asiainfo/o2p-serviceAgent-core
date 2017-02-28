package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.Assert;

/**
 * 
 * @author 颖勤
 *
 */
public class DefaultTcpSSLContextSupport implements TcpSSLContextSupport{
	private Resource keyStore;

	private Resource trustStore;

	private char[] keyStorePassword;

	private char[] trustStorePassword;

	private volatile String protocol = "TLS";

	public DefaultTcpSSLContextSupport(String keyStore, String trustStore,
			String keyStorePassword, String trustStorePassword) {
		Assert.notNull(keyStore, "keyStore cannot be null");
		Assert.notNull(trustStore, "trustStore cannot be null");
		Assert.notNull(keyStorePassword, "keyStorePassword cannot be null");
		Assert.notNull(trustStorePassword, "trustStorePassword cannot be null");
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		this.keyStore = resolver.getResource(keyStore);
		this.trustStore = resolver.getResource(trustStore);
		this.keyStorePassword = keyStorePassword.toCharArray();
		this.trustStorePassword = trustStorePassword.toCharArray();
	}

	public DefaultTcpSSLContextSupport(String trustStore, String trustStorePassword) {
		Assert.notNull(trustStore, "trustStore cannot be null");
		Assert.notNull(trustStorePassword, "trustStorePassword cannot be null");
		Resource  resolver = new FileSystemResource(trustStore);
		this.trustStore = resolver;
		this.trustStorePassword = trustStorePassword.toCharArray();
	}

	public SSLContext getSSLContext() throws GeneralSecurityException,
	IOException {
		KeyStore ts = KeyStore.getInstance("JKS");
		ts.load(trustStore.getInputStream(), trustStorePassword);
		TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
		tmf.init(ts);
		SSLContext sslContext = SSLContext.getInstance(protocol);
		sslContext.init(null, tmf.getTrustManagers(), null);
		return sslContext;
	}
	public SSLContext getSSLContext(boolean isClient)throws GeneralSecurityException,
	IOException{
		if(isClient){
			KeyStore ts = KeyStore.getInstance("JKS");
			ts.load(trustStore.getInputStream(), trustStorePassword);
			TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
			tmf.init(ts);
			SSLContext sslContext = SSLContext.getInstance(protocol);
			sslContext.init(null, tmf.getTrustManagers(), null);
			return sslContext;
		}else{
			KeyStore ks = KeyStore.getInstance("JKS");
			ks.load(keyStore.getInputStream(), keyStorePassword);
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
			kmf.init(ks, keyStorePassword);
			SSLContext sslContext = SSLContext.getInstance(protocol);
			X509TrustManager X509 = new X509TrustManager()
			{
				public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException{
					return;
				}

				public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
					return;
				}

				public X509Certificate[] getAcceptedIssuers() {
					return new X509Certificate[0];
				}
			};
			TrustManager[] X509_MANAGERS = { X509 };
			sslContext.init(kmf.getKeyManagers(), X509_MANAGERS, null);
			return sslContext;
		}
	}
	/**
	 * The protocol used in {@link SSLContext#getInstance(String)}; default "TLS".
	 * @param protocol The protocol.
	 */
	public void setProtocol(String protocol) {
		Assert.notNull(protocol, "protocol must not be null");
		this.protocol = protocol;
	}

}
