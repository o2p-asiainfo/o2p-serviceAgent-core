package com.ailk.eaap.op2.serviceagent.protocol;

import java.io.Serializable;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.Service;

@org.springframework.stereotype.Service
public class HttpController extends ProtocolController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String getUpperSerVersion(MessageBO<?> messageBo, String pathInfo) {
		
		return null;
	}

	@Override
	public void initContractVersionKey(MessageBO<?> messageBo, String name)
			 {
		
		Service s = messageBo.getService();
		
		if(s != null) {
			
			ContractVersion cv = s.getContractVersion();
			
			if(cv != null) {
				
				messageBo.setContractVer(cv.getVersion());
			}
		}
	}

	@Override
	public void initServiceKey(MessageBO<?> messageBo, String serviceCode)
			 {
		
		messageBo.setServiceCode(serviceCode);
	}

}
