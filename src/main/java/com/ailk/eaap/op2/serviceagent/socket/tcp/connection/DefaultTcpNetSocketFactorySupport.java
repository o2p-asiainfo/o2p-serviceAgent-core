package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;


/**
 * 
 * @author 颖勤
 *
 */
public class DefaultTcpNetSocketFactorySupport implements TcpSocketFactorySupport{
	public ServerSocketFactory getServerSocketFactory() {
		return ServerSocketFactory.getDefault();
	}

	public SocketFactory getSocketFactory() {
		return SocketFactory.getDefault();
	}
}
