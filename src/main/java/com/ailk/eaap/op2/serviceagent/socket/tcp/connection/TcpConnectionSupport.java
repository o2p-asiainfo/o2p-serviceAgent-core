package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Deserializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Serializer;

public interface TcpConnectionSupport {

	/**
	 * Closes this connection.
	 */
	abstract void close();

	abstract void send(MessageBO<byte[]> message) throws Exception;

	abstract Object getPayload() throws Exception;

	abstract Deserializer<?> getDeserializer();

	abstract String getConnectionId();

	abstract void setDeserializer(Deserializer<?> deserializer);

	abstract void setSerializer(Serializer<?> serializer);

	abstract boolean isOpen();

}