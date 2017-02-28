package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

import org.springframework.util.Assert;

/**
 * 
 * @author 颖勤
 *
 */
public class DefaultTcpNetSSLSocketFactorySupport implements TcpSocketFactorySupport{
	private final TcpSSLContextSupport sslContextSupport;

	private volatile SSLContext sslContext;

	public DefaultTcpNetSSLSocketFactorySupport(TcpSSLContextSupport sslContextSupport) {
		Assert.notNull(sslContextSupport, "TcpSSLContextSupport must not be null");
		this.sslContextSupport = sslContextSupport;
	}

	public ServerSocketFactory getServerSocketFactory() {
		return this.sslContext.getServerSocketFactory();
	}

	public SocketFactory getSocketFactory() {
		return this.sslContext.getSocketFactory();
	}

	public void afterPropertiesSet() throws Exception {
		this.sslContext = this.sslContextSupport.getSSLContext();
		Assert.notNull(this.sslContext, "SSLContex must not be null");
	}
}
