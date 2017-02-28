package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import java.io.IOException;
import java.io.OutputStream;

public interface Serializer<T> {

	/**
	 * Write an object of type T to the given OutputStream.
	 * <p>Note: Implementations should not close the given OutputStream
	 * (or any decorators of that OutputStream) but rather leave this up
	 * to the caller.
	 * @param object the object to serialize
	 * @param outputStream the output stream
	 * @throws IOException in case of errors writing to the stream
	 */
	void serialize(T object, OutputStream outputStream) throws IOException;

}
