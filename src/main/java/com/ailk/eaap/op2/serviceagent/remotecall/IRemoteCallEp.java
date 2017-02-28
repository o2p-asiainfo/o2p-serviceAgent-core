package com.ailk.eaap.op2.serviceagent.remotecall;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;

public interface IRemoteCallEp {
	
	MessageBO remoteCall(Endpoint remoteEndpoint,MessageBO bo);

}
