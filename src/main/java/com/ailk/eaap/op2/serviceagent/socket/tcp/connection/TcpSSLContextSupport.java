package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.net.ssl.SSLContext;

/**
 * 
 * @author 颖勤
 *
 */
public interface TcpSSLContextSupport {
	/**
	 * Gets an SSLContext.
	 * @return the SSLContext.
	 * @throws GeneralSecurityException
	 * @throws IOException
	 */
	SSLContext getSSLContext() throws GeneralSecurityException, IOException;
}
