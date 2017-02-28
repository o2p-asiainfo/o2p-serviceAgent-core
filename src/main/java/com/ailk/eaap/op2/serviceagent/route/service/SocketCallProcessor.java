package com.ailk.eaap.op2.serviceagent.route.service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Timestamp;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpSSLContextSupport;
import com.ailk.eaap.op2.serviceagent.socket.tcp.connection.TcpConnectionFactoryBean;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.AbstractByteArraySerializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.ByteArrayCrLfSerializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.ByteArrayRawSerializer;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.util.ExceptionUtils;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

public class SocketCallProcessor implements EndpointProcessor
{
    private static final Log LOG = LogFactory.getLog(SocketCallProcessor.class);
    private IMemcacheManageServ cacheService;

    public IMemcacheManageServ getCacheService()
    {
        return cacheService;
    }

    public void setCacheService(IMemcacheManageServ cacheService)
    {
        this.cacheService = cacheService;
    }

    private TcpConnectionFactoryBean tcpFactory;

    @SuppressWarnings(
    { "unchecked", "rawtypes" })
    public MessageBO process(Endpoint endpoint, MessageBO msg)
    {
        String retString = "";
        TechImpl tech = null;
        Object obj = endpoint.getAttrMap().get(EndpointAttr.ServiceTechId);
        if (obj == null)
        {
            throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
                    ErrorDomain.ERROR_CODE_9999, ErrorDomain.tech_never_config);
        }
        else
        {
            String serTechId = obj.toString();
            try
            {
                tech = (TechImpl) cacheService.getKey(CacheKey.techImpl
                        + serTechId,msg.getTenant().getTenantId());
            }
            catch (Exception e)
            {
                // TODO: handle exception
                LOG.error("exception detail:"
                        + ExceptionUtils.populateExecption(e));
            }

            if (tech == null)
            {
                throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
                        ErrorDomain.ERROR_CODE_9999,
                        ErrorDomain.cannot_find_tech);
            }
            if (!tech.getSerTechStatus().equals(EOPDomain.ONLINE))
            {
                throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
                        ErrorDomain.ERROR_CODE_9042,
                        ErrorDomain.service_tech_status_unuseable);
            }
            Object host = tech.getAttrMap().get(EndpointAttr.IP_ADDRESS);
            Assert.notNull(host, "the serTechId=" + serTechId
                    + " host attr must not be null");
            Object port = tech.getAttrMap().get(EndpointAttr.PORT);
            Assert.notNull(port, "the serTechId=" + serTechId
                    + " port attr must not be null");
            Object charset = tech.getAttrMap().get(EndpointAttr.charset);
            Object isUseSSL = tech.getAttrMap().get(EndpointAttr.IS_USE_SSL);
            Object msgCodecType = tech.getAttrMap()
                    .get(EndpointAttr.TEXT_CODEC);
            isUseSSL = (isUseSSL != null ? isUseSSL.toString() : "N");
            msgCodecType = (msgCodecType != null ? msgCodecType.toString()
                    : "RAW");

            // 请求落地方时间
            if (msg.getSourceContractInteraction().getCenterFwd2DstTime() == null)
            {
                msg.getSourceContractInteraction().setCenterFwd2DstTime(
                        new Timestamp(System.currentTimeMillis()));
                msg.getSourceContractInteraction().setDstRecTime(
                        new Timestamp(System.currentTimeMillis()));
            }
            tcpFactory.setHost(host.toString());
            tcpFactory.setPort(Integer.valueOf(port.toString()));
            if ("Y".equalsIgnoreCase(isUseSSL.toString()))
            {
                Object trustStoreObj = tech.getAttrMap().get(
                        EndpointAttr.TRUST_STORE);
                Object trustStorePasswordObj = tech.getAttrMap().get(
                        EndpointAttr.TRUST_STORE_PASSWORD);
                Assert.notNull(trustStoreObj, "the serTechId=" + serTechId
                        + " ssl request trustStore attr must not be null");
                Assert.notNull(
                        trustStorePasswordObj,
                        "the serTechId="
                                + serTechId
                                + " ssl request trustStorePassword attr must not be null");
                String trustStore = trustStoreObj.toString();
                String trustStorePassword = trustStorePasswordObj.toString();
                DefaultTcpSSLContextSupport sslContextSupport = new DefaultTcpSSLContextSupport(
                        trustStore, trustStorePassword);
                tcpFactory.setSslContextSupport(sslContextSupport);
            }
            else if ("N".equalsIgnoreCase(isUseSSL.toString()))
            {
                tcpFactory.setSslContextSupport(null);
            }

            OutputStream outputStream = null;
            try
            {
                Socket socket = tcpFactory.getObject(tech.hashCode());
                outputStream = socket.getOutputStream();
                AbstractByteArraySerializer serializer;
                if ("RAW".equalsIgnoreCase(msgCodecType.toString()))
                {
                    serializer = new ByteArrayRawSerializer();
                }
                else if ("CRLF".equalsIgnoreCase(msgCodecType.toString()))
                {
                    serializer = new ByteArrayCrLfSerializer();
                }
                else
                {
                    serializer = new ByteArrayRawSerializer();
                }
                // 编码转换
                byte[] message = msg.getMsgBody().toString()
                        .getBytes((String) charset);
                serializer.serialize(message, outputStream);
                byte[] retInfo = serializer
                        .deserialize(socket.getInputStream());

                if (!ArrayUtils.isEmpty(retInfo))
                {
                    msg.setMsgBody(retInfo);
                    retString = new String(retInfo, "ISO-8859-1");
                }
                else
                {
                    throw new BusinessException(9999,
                            "o2p-serviceagent-core.9999", new String[]
                            { "SocketCallProcessor output nothing!! host="
                                    + host + ", port" + port }, null);
                }

                socket.close();
                msg.setMsgBody(retInfo);

            }
            catch (NumberFormatException e)
            {
                LOG.error("NumberFormatException", e);
                throw new BusinessException(9999, "o2p-serviceagent-core.9999",
                        new String[]
                        { "NumberFormatException host=" + host + ", port"
                                + port + ", retInfo=" + retString }, e);
            }
            catch (UnknownHostException e)
            {
                LOG.error("UnknownHostException", e);
                throw new BusinessException(9999, "o2p-serviceagent-core.9999",
                        new String[]
                        { "UnknownHostException host=" + host + ", port" + port
                                + ", retInfo=" + retString }, e);
            }
            catch (Exception e)
            {
                LOG.error("Exception", e);
                throw new BusinessException(9999, "o2p-serviceagent-core.9999",
                        new String[]
                        { "Exception host=" + host + ", port" + port
                                + ", retInfo=" + retString }, e);
            }
            finally
            {
                try
                {
                    if (outputStream != null)
                    {
                        outputStream.close();
                    }
                }
                catch (IOException e)
                {
                    LOG.error("exception detail:"
                            + ExceptionUtils.populateExecption(e));
                }
                // 接收落地方时间
                msg.getSourceContractInteraction().setDstReplyTime(
                        new Timestamp(System.currentTimeMillis()));
                msg.getSourceContractInteraction().setCenterRecDstTime(
                        new Timestamp(System.currentTimeMillis()));
            }
        }
        return msg;
    }

    public void clear()
    {
        // TODO Auto-generated method stub

    }

    public void subtraThreadNum(String servId)
    {
        // TODO Auto-generated method stub

    }

    public TcpConnectionFactoryBean getTcpFactory()
    {
        return tcpFactory;
    }

    public void setTcpFactory(TcpConnectionFactoryBean tcpFactory)
    {
        this.tcpFactory = tcpFactory;
    }

}
