package com.ailk.eaap.op2.serviceagent.protocol;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;

public interface ISocketController {
	 boolean exchange(MessageBO<?> messageBo,  String pathInfo)  throws Exception;
}
