package com.ailk.eaap.integration.o2p.message;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/**
 * 
 * @author zhuangyq
 *
 */
@SuppressWarnings("serial")
public class MessagingException extends RuntimeException{
	private volatile MessageBO<?> failedMessage;
	private int code;
	public MessagingException(MessageBO<?> message) {
		super();
		this.failedMessage = message;
	}
	public MessagingException(String description) {
		super(description);
		this.failedMessage = null;
	}
	public MessagingException(String description, Throwable cause) {
		super(description, cause);
		this.failedMessage = null;
	}
	public MessageBO<?> getFailedMessage() {
		return this.failedMessage;
	}
	
	public MessagingException(MessageBO<?> message, String description, Throwable cause) {
		super(description, cause);
		this.failedMessage = message;
	}
	
	public MessagingException(MessageBO<?> message, String description) {
		super(description);
		this.failedMessage = message;
	}
	public MessagingException(MessageBO<?> message,int code, String description){
		super(description);
		this.failedMessage = message;
		this.code =  code;
	}
	public void setFailedMessage(MessageBO<?> message) {
		this.failedMessage = message;
	}
	public int getCode() {
		return code;
	}
	
}
