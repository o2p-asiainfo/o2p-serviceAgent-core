package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import java.io.IOException;

public class SoftEndOfStreamException extends IOException {
	private static final long serialVersionUID = 7309907445617226978L;

	public SoftEndOfStreamException() {
		super();
	}

	public SoftEndOfStreamException(String message) {
		super(message);
	}
}
