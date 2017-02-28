package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Deserializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Serializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.ByteArrayCrLfSerializer;

import org.springframework.util.Assert;
/**
 * 
 * @author 颖勤
 *
 */
public class ClientConnectionFactory {
	private static final Log logger = LogFactory.getLog(ClientConnectionFactory.class);
	
	private final ReadWriteLock theConnectionLock = new ReentrantReadWriteLock();

	private volatile TcpConnectionSupport theConnection;
	
	private volatile String host;
	
	private volatile int port;
	
	private volatile int soTimeout = -1;

	private volatile int soSendBufferSize;

	private volatile int soReceiveBufferSize;

	private volatile boolean soTcpNoDelay;
	// don't set by default
	private volatile int soLinger  = -1; 

	private volatile boolean soKeepAlive;
	
	private volatile boolean active;
	private volatile boolean lookupHost;
	
	private volatile boolean singleUse;
	
	private volatile Deserializer<?> deserializer = new ByteArrayCrLfSerializer();

	private volatile Serializer<?> serializer = new ByteArrayCrLfSerializer();
	
	private volatile TcpSocketSupport tcpSocketSupport = new DefaultTcpSocketSupport();
	
	private volatile TcpSocketFactorySupport tcpSocketFactorySupport = new DefaultTcpNetSocketFactorySupport();
	// don't set by default
	private volatile int soTrafficClass = -1; 
	
	public ClientConnectionFactory(String host, int port){
		Assert.notNull(host, "host must not be null");
		this.host = host;
		this.port = port;
	}
	/**
	 * Obtains a connection - if {@link #setSingleUse(boolean)} was called with
	 * true, a new connection is returned; otherwise a single connection is
	 * reused for all requests while the connection remains open.
	 */
	public TcpConnectionSupport getConnection() throws Exception {
		this.checkActive();
		return this.obtainConnection();
	}

	private void checkActive() throws IOException{
		if (!this.isActive()) {
			throw new IOException(this + " connection factory has not been started");
		}
		
	}
	protected TcpConnectionSupport obtainConnection() throws Exception {
		if (!this.isSingleUse()) {
			TcpConnectionSupport connection = this.obtainSharedConnection();
			if (connection != null) {
				return connection;
			}
		}
		return this.obtainNewConnection();
	}
	public void start() {
		this.setActive(true);
		if (logger.isInfoEnabled()) {
			logger.info("started " + this);
		}
	}
	protected Socket createSocket(String host, int port) throws IOException {
		return this.tcpSocketFactorySupport.getSocketFactory().createSocket(host, port);
	}
	protected final TcpConnectionSupport obtainSharedConnection() throws InterruptedException {
		this.theConnectionLock.readLock().lockInterruptibly();
		try {
			TcpConnectionSupport theConnection = this.getTheConnection();
			if (theConnection != null && theConnection.isOpen()) {
				return theConnection;
			}
		}
		finally {
			this.theConnectionLock.readLock().unlock();
		}

		return null;
	}

	protected final TcpConnectionSupport obtainNewConnection() throws Exception {
		boolean singleUse = this.isSingleUse();
		if (!singleUse) {
			this.theConnectionLock.writeLock().lockInterruptibly();
		}
		try {
			TcpConnectionSupport connection;
			if (!singleUse) {
				// Another write lock holder might have created a new one by now.
				connection = this.obtainSharedConnection();
				if (connection != null) {
					return connection;
				}
			}

			if (logger.isDebugEnabled()) {
				logger.debug("Opening new socket connection to " + this.getHost() + ":" + this.getPort());
			}

			connection = this.buildNewConnection();
			if (!singleUse) {
				this.setTheConnection(connection);
			}
			return connection;
		}
		finally {
			if (!singleUse) {
				this.theConnectionLock.writeLock().unlock();
			}
		}
	}

	public boolean isSingleUse() {
		// TODO Auto-generated method stub
		return singleUse;
	}
	protected TcpConnectionSupport buildNewConnection() throws Exception {
		Socket socket = createSocket(this.getHost(), this.getPort());
		setSocketAttributes(socket);
		TcpConnectionSupport connection = new TcpNetConnection(socket, false, this.isLookupHost());

		return connection;
	}

	/**
	 * Transfers attributes such as (de)serializers, singleUse etc to a new connection.
	 * When the connection factory has a reference to a TCPListener (to read
	 * responses), or for single use connections, the connection is executed.
	 * Single use connections need to read from the connection in order to
	 * close it after the socket timeout.
	 * @param connection The new connection.
	 * @param socket The new socket.
	 */
	protected void initializeConnection(TcpConnectionSupport connection, Socket socket) {
		connection.setDeserializer(this.getDeserializer());
		connection.setSerializer(this.getSerializer());
	}

	/**
	 * @param theConnection the theConnection to set
	 */
	protected void setTheConnection(TcpConnectionSupport theConnection) {
		this.theConnection = theConnection;
	}

	/**
	 * @return the theConnection
	 */
	protected TcpConnectionSupport getTheConnection() {
		return theConnection;
	}

	/**
	 * Force close the connection and null the field if it's
	 * a shared connection.
	 * @param connection
	 */
	public void forceClose(TcpConnectionSupport connection) {
		if (this.theConnection == connection) {
			this.theConnection = null;
		}
		connection.close();
	}
	protected void setSocketAttributes(Socket socket) throws SocketException {
		if (this.soTimeout >= 0) {
			socket.setSoTimeout(this.soTimeout);
		}
		if (this.soSendBufferSize > 0) {
			socket.setSendBufferSize(this.soSendBufferSize);
		}
		if (this.soReceiveBufferSize > 0) {
			socket.setReceiveBufferSize(this.soReceiveBufferSize);
		}
		socket.setTcpNoDelay(this.soTcpNoDelay);
		if (this.soLinger >= 0) {
			socket.setSoLinger(true, this.soLinger);
		}
		if (this.soTrafficClass >= 0) {
			socket.setTrafficClass(this.soTrafficClass);
		}
		socket.setKeepAlive(this.soKeepAlive);
		this.tcpSocketSupport.postProcessSocket(socket);
	}
	public Deserializer<?> getDeserializer() {
		return deserializer;
	}
	public void setDeserializer(Deserializer<?> deserializer) {
		this.deserializer = deserializer;
	}
	public Serializer<?> getSerializer() {
		return serializer;
	}
	public void setSerializer(Serializer<?> serializer) {
		this.serializer = serializer;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setSingleUse(boolean singleUse) {
		this.singleUse = singleUse;
	}
	public boolean isLookupHost() {
		return lookupHost;
	}
	public void setLookupHost(boolean lookupHost) {
		this.lookupHost = lookupHost;
	}
	
}
