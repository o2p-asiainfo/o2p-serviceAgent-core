package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 
 * @author 颖勤
 *
 */
public abstract class AbstractByteArraySerializer implements Serializer<byte[]>, Deserializer<byte[]> {

	protected int maxMessageSize = 2048;

	private final Log logger = LogFactory.getLog(this.getClass());

	/**
	 * The maximum supported message size for this serializer.
	 * Default 2048.
	 * @return The max message size.
	 */
	public int getMaxMessageSize() {
		return maxMessageSize;
	}

	/**
	 * The maximum supported message size for this serializer.
	 * Default 2048.
	 * @param maxMessageSize The max message size.
	 */
	public void setMaxMessageSize(int maxMessageSize) {
		this.maxMessageSize = maxMessageSize;
	}

	protected void checkClosure(int bite) throws IOException {
		if (bite < 0) {
			logger.debug("Socket closed during message assembly");
			throw new IOException("Socket closed during message assembly");
		}
	}

	/**
	 * Copy size bytes to a new buffer exactly size bytes long.
	 * @param buffer The buffer containing the data.
	 * @param size The number of bytes to copy.
	 * @return The new buffer, or the buffer parameter if it is
	 * already the correct size.
	 */
	protected byte[] copyToSizedArray(byte[] buffer, int size) {
		if (size == buffer.length) {
			return buffer;
		}
		byte[] assembledData = new byte[size];
		System.arraycopy(buffer, 0, assembledData, 0, size);
		return assembledData;
	}

}
