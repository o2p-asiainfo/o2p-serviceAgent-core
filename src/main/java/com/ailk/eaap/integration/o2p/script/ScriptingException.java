package com.ailk.eaap.integration.o2p.script;

import com.ailk.eaap.integration.o2p.message.MessagingException;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/**
 * @author zhuangyq
 */
@SuppressWarnings("serial")
public class ScriptingException extends MessagingException{
	public ScriptingException(String description) {
		super(description);
	}
	public ScriptingException(MessageBO<?> message,int code,String description) {
		super(message,code,description);
	}
	
	public ScriptingException(String description, Throwable cause) {
		super(description, cause);
	}
}
