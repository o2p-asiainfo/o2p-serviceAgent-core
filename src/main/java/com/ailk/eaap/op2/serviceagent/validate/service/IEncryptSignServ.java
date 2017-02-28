package com.ailk.eaap.op2.serviceagent.validate.service;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;


public interface IEncryptSignServ {

	String encrypt(String encryptType,String charset,String sign,MessageBO messageBo) ;
	
}
