package com.ailk.eaap.op2.serviceagent.validate.service;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.MsgParseUtil;
import com.ailk.eaap.op2.serviceagent.common.ShaUtil;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.linkage.rainbow.util.StringUtil;

public final class EncryptSign  {

	private static final Logger log = Logger.getLogger(EncryptSign.class);
	
	private EncryptSign() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static String encrypt(String encryptType, String charset, String key,
			MessageBO messageBo, String express)  {
		// TODO Auto-generated method stub
		try{
			
				String transid = messageBo.getTransactionID();
				
				String svcbody = CommonUtil.getMatchPatternStr(messageBo.getOrgReqMsg(), "(<SvcCont>(.*?)</SvcCont>)");
				String reqStr = "";
				StringBuffer sb = new StringBuffer("");
				//如果按照原来方式截取报文为空，那么根据配置的节点路径来取报文
				if(StringUtils.isEmpty(svcbody)) {
					//express可能是多个节点组合，如：“/ContractRoot/TcpCont/TransactionID&&/ContractRoot/SvcCont1”
					if(!StringUtils.isEmpty(express)) {
						String[] paths = express.split("&&");
						for(String subPath : paths) {
							if(!StringUtils.isEmpty(subPath)) {
								//由于msgBody是具体对象，有可能改变报文值，所以要使用原始报文
								if("msgBody".equalsIgnoreCase(subPath)) {
									subPath = "srcPlayload";
								}
								if("transactionID".equalsIgnoreCase(subPath)) {
									subPath = "transactionID";
								}
								sb.append(MsgParseUtil.getMsgByPath(messageBo, subPath));
							}
							
						}
					}
					reqStr = sb.toString();
					//默认为body
					if(StringUtils.isEmpty(reqStr)) {
						reqStr = messageBo.toString();
					}
				} else {
					reqStr = transid+svcbody;
				}
				
				if (!StringUtils.isEmpty(key)) {
					reqStr = reqStr + key;
				}
				reqStr = new String(reqStr.getBytes(EOPDomain.CHARSET_UTF8));
				if(log.isDebugEnabled()) {
					log.debug("reqStr="+reqStr);
				}
				if (encryptType.equalsIgnoreCase(EOPDomain.MD5)) {
					return StringUtil.Md5(reqStr);
				} else if (encryptType.equalsIgnoreCase(EOPDomain.THREEDES)) {
					return StringUtil.threeDES(reqStr, key);
				}else if(encryptType.equalsIgnoreCase(EOPDomain.SHA256)) {
					return ShaUtil.sha256(reqStr);
				}else if(encryptType.equalsIgnoreCase(EOPDomain.SHA384)) {
					return ShaUtil.sha384(reqStr);
				}else if(encryptType.equalsIgnoreCase(EOPDomain.SHA512)) {
					return ShaUtil.sha512(reqStr);
				}
		}catch(UnsupportedEncodingException e){
			log.error("EncryptSign UnsupportedEncodingException error",e);
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9002,ErrorDomain.charset_trans_error+e);
		}catch(Exception e){
			log.error("EncryptSign Unknow error",e);
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.encrypt_error+e);
		}
		return null;
		
		
	}
	
	public static String mapSort(MessageBO messageBo){
		
		
		ContractFormat bodyFormat = messageBo.getContractVersion().getReqContractFormat();
		Map<String,Object> map = new Hashtable<String,Object>();
		
		
		map.putAll(mapApend(bodyFormat,messageBo));
		
		
		
		TreeMap<String,Object> tree = new TreeMap<String, Object>(map);
		StringBuffer stb = new StringBuffer();
        for (Map.Entry<String, Object> m : tree.entrySet()) {
        	String key = m.getKey();
        	stb.append(key);
        	if(tree.get(key)==null){
        		stb.append("");
        	}else{
        		stb.append(m.getValue());
        	}
        	
        }
		return stb.toString();
		
	}
	
	public static Map<String,Object> mapApend(ContractFormat format ,MessageBO messageBo){
		
		
		Map<String,Object> map = new Hashtable();
		if(format!=null){
			List<NodeDesc> nodedescs = format.getNodeDescs();
			if(nodedescs!=null){
				
				for (NodeDesc nodeDesc : nodedescs) {
					if(nodeDesc.getIsNeedSign()!=null && nodeDesc.getIsNeedSign().equals("Y")){
						if(messageBo.getMessageMap().get(nodeDesc.getNodeCode()) != null){
							map.put(nodeDesc.getNodeCode(), messageBo.getMessageMap().get(nodeDesc.getNodeCode()));
						}
					}
				}
				
			}
		}else{
			
			if(messageBo.getMessageMap()!=null && !messageBo.getMessageMap().isEmpty()){
				Set<String> key = messageBo.getMessageMap().keySet();
		        for (Iterator it = key.iterator(); it.hasNext();) {
		            String mapKey = (String) it.next();
		            
		            String value = messageBo.getMessageMap().get(mapKey).toString();
		            
		            if(!InType.Sign.equals(mapKey) && !"Version".equals(mapKey) && !"".equals(value)){
		            	map.put(mapKey.trim(), value.trim());
		            }
		            
		        }
		        
			}
		}
		
		return map;
	}
	
}
