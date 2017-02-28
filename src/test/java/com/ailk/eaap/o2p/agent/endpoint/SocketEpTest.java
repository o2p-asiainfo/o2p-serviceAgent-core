package com.ailk.eaap.o2p.agent.endpoint;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.net.SocketFactory;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.SocketCallProcessor;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.ByteArrayRawSerializer;
import com.ailk.eaap.op2.bo.Endpoint;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;


public class SocketEpTest {
	private ApplicationContext ctx;
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext(new String[]{
				"spring/eaap-op2-common-spring.xml","eaap-op2-endpoint-spring-test.xml"});
	}
	@Test
	public void test() throws Exception{
		IMemcacheManageServ cacheService =  (IMemcacheManageServ)ctx.getBean("cacheService");
		cacheService.addByModuleName(CacheKey.MODULE_TECH_IMPL,null);
		SocketCallProcessor socketCallProcessor = (SocketCallProcessor) ctx.getBean("socketEndpoint");
		MessageBO<byte[]> msg = new MessageBO<byte[]>();
		msg.setMsgBody("PRIV,014890WUDI0039HJEM_GB1        ".getBytes());
		Endpoint endpoint = new Endpoint();
		Map<String, Object> attrMap = new HashMap();
		attrMap.put("servicetechid", 800001009);
		endpoint.setAttrMap(attrMap );
		socketCallProcessor.process(endpoint , msg);
		System.out.println(new String(msg.getMsgBody()));
	}
	@Test
	public void test2() throws UnknownHostException, IOException{
		Socket socket = SocketFactory.getDefault().createSocket("127.0.0.1", 1235);
		ByteArrayRawSerializer byteSerializer = new ByteArrayRawSerializer();
		OutputStream outputStream = socket.getOutputStream();
		byteSerializer.serialize("hellll \r".getBytes(), outputStream);
		InputStream inputStream = socket.getInputStream();
		byte[] ret = byteSerializer.deserialize(inputStream);
		inputStream.close();
		outputStream.close();
		socket.close();
		System.out.println(new String(ret));
	}
}
