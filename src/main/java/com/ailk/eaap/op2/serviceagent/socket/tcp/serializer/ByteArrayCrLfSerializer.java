package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Reads data in an InputStream to a byte[]; data must be terminated by \r\n
 * (not included in resulting byte[]).
 * Writes a byte[] to an OutputStream and adds \r\n.
 *
 * @author Gary Russell
 * @since 2.0
 */
public class ByteArrayCrLfSerializer extends AbstractByteArraySerializer {
	private final Log logger = LogFactory.getLog(this.getClass());
	private static final byte[] CRLF = "\r\n".getBytes();

	/**
	 * Reads the data in the inputstream to a byte[]. Data must be terminated
	 * by CRLF (\r\n). Throws a {@link SoftEndOfStreamException} if the stream
	 * is closed immediately after the \r\n (i.e. no data is in the process of
	 * being read).
	 */
	public byte[] deserialize(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[this.maxMessageSize];
		int n = this.fillToCrLf(inputStream, buffer);
		return this.copyToSizedArray(buffer, n);
	}

	public int fillToCrLf(InputStream inputStream, byte[] buffer)
			throws IOException, SoftEndOfStreamException {
		int n = 0;
		int bite;
		if (logger.isDebugEnabled()) {
			logger.debug("Available to read:" + inputStream.available());
		}
		while (true) {
			bite = inputStream.read();
			if (bite < 0 && n == 0) {
				throw new SoftEndOfStreamException("Stream closed between payloads");
			}
			checkClosure(bite);
			if (n > 0 && bite == '\n' && buffer[n-1] == '\r') {
				break;
			}
			buffer[n++] = (byte) bite;
			if (n >= this.maxMessageSize) {
				throw new IOException("CRLF not found before max message length: "
						+ this.maxMessageSize);
			}
		};
		// trim \r
		return n-1; 
	}

	/**
	 * Writes the byte[] to the stream and appends \r\n.
	 */
	public void serialize(byte[] bytes, OutputStream outputStream) throws IOException {
		outputStream.write(bytes);
		outputStream.write(CRLF);
		outputStream.flush();
	}

}
