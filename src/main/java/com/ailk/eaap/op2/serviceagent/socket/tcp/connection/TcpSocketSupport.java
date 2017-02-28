package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author 颖勤
 *
 */
public interface TcpSocketSupport {
	/**
	 * Performs any further modifications to the server socket
	 * after the connection factory has created the socket and
	 * set any configured attributes, before invoking
	 * {@link ServerSocket#accept()}.
	 * @param serverSocket The ServerSocket
	 */
    void postProcessServerSocket(ServerSocket serverSocket);

    /**
     * Performs any further modifications to the {@link Socket} after
     * the socket has been created by a client, or accepted by
     * a server, and after any configured atributes have been
     * set.
     * @param socket The Socket
     */
    void postProcessSocket(Socket socket);
}
