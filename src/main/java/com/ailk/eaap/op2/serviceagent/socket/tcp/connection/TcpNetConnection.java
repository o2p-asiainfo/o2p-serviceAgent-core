package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.UUID;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Deserializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Serializer;


public class TcpNetConnection implements TcpConnectionSupport {
	private static final Log logger = LogFactory.getLog(TcpNetConnection.class);
	private final Socket socket;
	@SuppressWarnings("rawtypes")
	private volatile Deserializer deserializer;
	private volatile boolean singleUse;
	private final boolean server ;
	private volatile String connectionId;
	@SuppressWarnings("rawtypes")
	private volatile Serializer serializer;
	private volatile String hostName = "unknown";
	private volatile int soLinger = -1;
	private volatile String hostAddress = "unknown";
	private volatile boolean noReadErrorOnClose;
	private volatile long lastRead = System.currentTimeMillis();

	private volatile long lastSend;


	/**
	 * Constructs a TcpNetConnection for the socket.
	 * @param socket the socket
	 * @param server if true this connection was created as
	 * a result of an incoming request.
	 * @param lookupHost true if hostname lookup should be performed, otherwise the connection will
	 * be identified using the ip address.
	 */
	public TcpNetConnection(Socket socket, boolean server, boolean lookupHost) {
		this.server = server;
		InetAddress inetAddress = socket.getInetAddress();
		if (inetAddress != null) {
			this.hostAddress = inetAddress.getHostAddress();
			if (lookupHost) {
				this.hostName = inetAddress.getHostName();
			}
			else {
				this.hostName = this.hostAddress;
			}
		}
		int port = socket.getPort();
		int localPort = socket.getLocalPort();
		this.connectionId = this.hostName + ":" + port + ":" + localPort + ":" + UUID.randomUUID().toString();
		try {
			this.soLinger = socket.getSoLinger();
		}
		catch (SocketException e) { 
			logger.error(e.getMessage(),e);
		}
		
		if (logger.isDebugEnabled()) {
			logger.debug("New connection " + this.getConnectionId());
		}
		this.socket = socket;
	}

	/* (non-Javadoc)
	 *  com.ailk.eaap.op2.serviceagent.socket.tcp.connection.TcpConnectionSupport#close()
	 */
	public void close() {
		this.setNoReadErrorOnClose(true);
		try {
			this.socket.close();
		}
		catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
	}

	public boolean isOpen() {
		return !this.socket.isClosed();
	}

	/* (non-Javadoc)
	 *  com.ailk.eaap.op2.serviceagent.socket.tcp.connection.TcpConnectionSupport#send(com.ailk.eaap.op2.serviceagent.common.MessageBO)
	 */
	@SuppressWarnings("unchecked")
	public synchronized void send(MessageBO<byte[]> message) throws Exception {
		byte[] object = message.getMsgBody();
		this.lastSend = System.currentTimeMillis();
		try {
			((Serializer<Object>) this.getSerializer()).serialize(object, this.socket.getOutputStream());
		}
		catch (Exception e) {
			this.close();
			throw e;
		}
		afterSend();
	}

	private void afterSend() {
		if(logger.isDebugEnabled()) {
			logger.debug("Message sent consume:"+(lastSend-lastRead));
		}
	}

	/* (non-Javadoc)
	 *  com.ailk.eaap.op2.serviceagent.socket.tcp.connection.TcpConnectionSupport#getPayload()
	 */
	public Object getPayload() throws Exception {
		return this.getDeserializer().deserialize(this.socket.getInputStream());
	}

	public int getPort() {
		return this.socket.getPort();
	}

	public Object getDeserializerStateKey() {
		try {
			return this.socket.getInputStream();
		}
		catch (Exception e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 *  com.ailk.eaap.op2.serviceagent.socket.tcp.connection.TcpConnectionSupport#getDeserializer()
	 */
	public Deserializer<?> getDeserializer() {
		return deserializer;
	}

	public void setDeserializer(Deserializer<?> deserializer) {
		this.deserializer = deserializer;
	}

	/* (non-Javadoc)
	 *  com.ailk.eaap.op2.serviceagent.socket.tcp.connection.TcpConnectionSupport#getConnectionId()
	 */
	public String getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}

	public Serializer<?> getSerializer() {
		return serializer;
	}

	public void setSerializer(Serializer<?> serializer) {
		this.serializer = serializer;
	}

	public boolean isNoReadErrorOnClose() {
		return noReadErrorOnClose;
	}

	public void setNoReadErrorOnClose(boolean noReadErrorOnClose) {
		this.noReadErrorOnClose = noReadErrorOnClose;
	}

	public boolean isServer() {
		return server;
	}

	public boolean isSingleUse() {
		return singleUse;
	}

	public void setSingleUse(boolean singleUse) {
		this.singleUse = singleUse;
	}

	public int getSoLinger() {
		return soLinger;
	}

	public void setSoLinger(int soLinger) {
		this.soLinger = soLinger;
	}
	
}
