package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ByteArrayRawSerializer extends AbstractByteArraySerializer{
	private final Log logger = LogFactory.getLog(this.getClass());
	public void serialize(byte[] bytes, OutputStream outputStream)
			throws IOException {
		outputStream.write(bytes);
		outputStream.flush();
	}

	public byte[] deserialize(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[this.maxMessageSize];
		int n = 0;
		int bite = 0;
		if (logger.isDebugEnabled()) {
			logger.debug("Available to read:" + inputStream.available());
		}
		while (bite >= 0) {
			bite = inputStream.read();
			if (bite < 0) {
				if (n == 0) {
					throw new SoftEndOfStreamException("Stream closed between payloads");
				}
				break;
			}
			buffer[n++] = (byte) bite;
			if (n >= this.maxMessageSize) {
				throw new IOException("Socket was not closed before max message length: "
						+ this.maxMessageSize);
			}
		};
		byte[] assembledData = new byte[n];
		System.arraycopy(buffer, 0, assembledData, 0, n);
		return assembledData;
	}
}
