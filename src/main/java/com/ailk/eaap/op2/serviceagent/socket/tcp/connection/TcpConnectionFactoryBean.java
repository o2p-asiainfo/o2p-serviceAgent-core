package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.net.Socket;
import java.net.SocketException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.net.SocketFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author 颖勤
 * 
 *         wuzhy modify 2015-06-10 区分socket工厂和sslsocket工程
 */
public class TcpConnectionFactoryBean
{
    private static final Log logger = LogFactory
            .getLog(TcpConnectionFactoryBean.class);
    private Map<Integer, TcpSocketFactorySupport> tcpSocketFactoryMap = new ConcurrentHashMap<Integer, TcpSocketFactorySupport>();
    private final ReadWriteLock theConnectionLock = new ReentrantReadWriteLock();

    private volatile String host;

    private volatile int port;

    private volatile int soTimeout;

    private volatile int soSendBufferSize;

    private volatile int soReceiveBufferSize;

    private volatile boolean lookupHost = true;

    private volatile boolean soTcpNoDelay;
    // don't set by default
    private volatile int soLinger = -1;

    private volatile int soTrafficClass;

    private volatile boolean soKeepAlive;

    private volatile boolean usingDirectBuffers;

    private TcpSSLContextSupport sslContextSupport;

    private volatile TcpSocketFactorySupport socketFactorySupport;

    private volatile SocketFactory socketFactory;

    private volatile SocketFactory sslSocketFactory;

    public void setSslContextSupport(TcpSSLContextSupport sslContextSupport)
    {
        this.sslContextSupport = sslContextSupport;
    }

    public String getHost()
    {
        return host;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public int getSoTimeout()
    {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout)
    {
        this.soTimeout = soTimeout;
    }

    public int getSoSendBufferSize()
    {
        return soSendBufferSize;
    }

    public void setSoSendBufferSize(int soSendBufferSize)
    {
        this.soSendBufferSize = soSendBufferSize;
    }

    public int getSoReceiveBufferSize()
    {
        return soReceiveBufferSize;
    }

    public void setSoReceiveBufferSize(int soReceiveBufferSize)
    {
        this.soReceiveBufferSize = soReceiveBufferSize;
    }

    public boolean isLookupHost()
    {
        return lookupHost;
    }

    public void setLookupHost(boolean lookupHost)
    {
        this.lookupHost = lookupHost;
    }

    public boolean isUsingDirectBuffers()
    {
        return usingDirectBuffers;
    }

    public void setUsingDirectBuffers(boolean usingDirectBuffers)
    {
        this.usingDirectBuffers = usingDirectBuffers;
    }

    public TcpSSLContextSupport getSslContextSupport()
    {
        return sslContextSupport;
    }

    public boolean isSoTcpNoDelay()
    {
        return soTcpNoDelay;
    }

    public void setSoTcpNoDelay(boolean soTcpNoDelay)
    {
        this.soTcpNoDelay = soTcpNoDelay;
    }

    public int getSoLinger()
    {
        return soLinger;
    }

    public void setSoLinger(int soLinger)
    {
        this.soLinger = soLinger;
    }

    public int getSoTrafficClass()
    {
        return soTrafficClass;
    }

    public void setSoTrafficClass(int soTrafficClass)
    {
        this.soTrafficClass = soTrafficClass;
    }

    public boolean isSoKeepAlive()
    {
        return soKeepAlive;
    }

    public void setSoKeepAlive(boolean soKeepAlive)
    {
        this.soKeepAlive = soKeepAlive;
    }

    public Socket getObject(int hashCode) throws Exception
    {
        this.theConnectionLock.readLock().lockInterruptibly();
        Socket socket = null;
        try
        {
            if (this.sslContextSupport == null)
            {
                if (socketFactory == null)
                {
                    TcpSocketFactorySupport tcpSocketFactorySupport = obtainSocketFactorySupport(hashCode);
                    socketFactory = tcpSocketFactorySupport.getSocketFactory();

                }
                socket = socketFactory.createSocket(host, port);

            }
            else
            {
                if (null != tcpSocketFactoryMap.get(hashCode))
                {
                    TcpSocketFactorySupport tcpSocketFactorySupport = tcpSocketFactoryMap
                            .get(hashCode);
                    sslSocketFactory = tcpSocketFactorySupport
                            .getSocketFactory();

                }
                else
                {
                    TcpSocketFactorySupport tcpSocketFactorySupport = obtainSocketFactorySupport(hashCode);
                    sslSocketFactory = tcpSocketFactorySupport
                            .getSocketFactory();
                    tcpSocketFactoryMap.put(hashCode, tcpSocketFactorySupport);
                }

                socket = sslSocketFactory.createSocket(host, port);

            }
            setSocketAttributes(socket);
            return socket;

        }
        finally
        {
            this.theConnectionLock.readLock().unlock();
        }
    }

    protected void setSocketAttributes(Socket socket) throws SocketException
    {
        if (this.soTimeout >= 0)
        {
            socket.setSoTimeout(this.soTimeout);
        }
        if (this.soSendBufferSize > 0)
        {
            socket.setSendBufferSize(this.soSendBufferSize);
        }
        if (this.soReceiveBufferSize > 0)
        {
            socket.setReceiveBufferSize(this.soReceiveBufferSize);
        }
        socket.setTcpNoDelay(this.soTcpNoDelay);
        if (this.soLinger >= 0)
        {
            socket.setSoLinger(true, this.soLinger);
        }
        if (this.soTrafficClass >= 0)
        {
            socket.setTrafficClass(this.soTrafficClass);
        }
        socket.setKeepAlive(this.soKeepAlive);
    }

    private TcpSocketFactorySupport obtainSocketFactorySupport(int hashCode)
    {

        if (this.sslContextSupport == null)
        {

            if (this.socketFactorySupport != null)
            {
                return this.socketFactorySupport;
            }
            else
            {
                return new DefaultTcpNetSocketFactorySupport();
            }

        }
        else
        {

            if (null != tcpSocketFactoryMap.get(hashCode))
            {
                return tcpSocketFactoryMap.get(hashCode);
            }
            else
            {
                DefaultTcpNetSSLSocketFactorySupport socketFactorySupport = new DefaultTcpNetSSLSocketFactorySupport(
                        this.sslContextSupport);
                try
                {
                    socketFactorySupport.afterPropertiesSet();
                }
                catch (Exception e)
                {
                    logger.error("Failed to set up TcpSocketFactorySupport", e);
                    throw new IllegalStateException(
                            "Failed to set up TcpSocketFactorySupport", e);
                }
                tcpSocketFactoryMap.put(hashCode, socketFactorySupport);
                return socketFactorySupport;
            }

        }
    }
}
