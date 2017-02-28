package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;


import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/**
 * 
 * @author 颖勤
 *
 */
interface TcpSocketFactorySupport {
	
    ServerSocketFactory getServerSocketFactory();

    /**
     */
    SocketFactory getSocketFactory();
}
