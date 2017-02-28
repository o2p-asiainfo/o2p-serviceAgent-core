package com.ailk.eaap.op2.serviceagent.protocol;


import org.springframework.stereotype.Service;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;

@Service
public class SocketController extends ProtocolController implements ISocketController{


	@Override
	public String getUpperSerVersion(MessageBO<?> messageBo, String pathInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initContractVersionKey(MessageBO<?> messageBo, String name)
			 {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initServiceKey(MessageBO<?> messageBo, String name)
			 {
		// TODO Auto-generated method stub
		
	}
}
