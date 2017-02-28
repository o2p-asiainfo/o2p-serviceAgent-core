package com.ailk.eaap.op2.serviceagent.common;





public final class MessageContextUtil {
	private static final int RESPONSE_DESC_LENGTH = 512;
	
	private MessageContextUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String getRespHead(String requestHead,String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID){
		
		if("RequestHead".equals(requestHead)){
			return buildResponseHeadMsg(rspTime, rspType, rspCode, rspDesc, transactionID);
		}else{
			return buildResponseTcpMsg(rspTime, rspType, rspCode, rspDesc, transactionID);
		}
	}
	
	private static String buildResponseTcpMsg(String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID) {
		StringBuffer buffer = new StringBuffer(200);
		buffer.append("<?xml version=\"1.0\" encoding=\""
				+ EOPDomain.CHARSET_UTF8 + "\"?>");
		buffer.append("<ContractRoot>");
		buffer.append("<TcpCont>");

		buffer.append("<ActionCode>");
		buffer.append(EOPDomain.RSP_FLAG);
		buffer.append("</ActionCode>");

		buffer.append("<TransactionID>");
		if (transactionID == null
				|| transactionID.equals(EOPDomain.EMPTY_STRING)) {
			buffer.append(EOPDomain.ERROR_TRASACTION_ID);
		} else{
			buffer.append(transactionID);
		}
		buffer.append("</TransactionID>");

		buffer.append("<RspTime>");
		buffer.append(rspTime);
		buffer.append("</RspTime>");

		buffer.append("<Response>");

		buffer.append("<RspType>");
		buffer.append(rspType);
		buffer.append("</RspType>");

		buffer.append("<RspCode>");
		buffer.append(rspCode);
		buffer.append("</RspCode>");

		if (rspDesc!=null && rspDesc.length() > MessageContextUtil.RESPONSE_DESC_LENGTH){
			rspDesc = rspDesc.substring(0,
					MessageContextUtil.RESPONSE_DESC_LENGTH);
		}
		buffer.append("<RspDesc>");
		buffer.append(rspDesc);
		buffer.append("</RspDesc>");

		buffer.append("</Response>");

		buffer.append("</TcpCont>");
		buffer.append("</ContractRoot>");
		return buffer.toString();
	}

	private static String buildResponseHeadMsg(String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID) {
		StringBuffer buffer = new StringBuffer(200);
		buffer.append("<?xml version=\"1.0\" encoding=\""
				+ EOPDomain.CHARSET_UTF8 + "\"?>");
		buffer.append("<ContractRoot>");
		buffer.append("<ResponseHead>");

		buffer.append("<TransactionID>");
		if (transactionID == null
				|| transactionID.equals(EOPDomain.EMPTY_STRING)) {
			buffer.append(EOPDomain.ERROR_TRASACTION_ID);
		} else{
			buffer.append(transactionID);
		}
		buffer.append("</TransactionID>");

		buffer.append("<RspTime>");
		buffer.append(rspTime);
		buffer.append("</RspTime>");

		buffer.append("<RspType>");
		buffer.append(rspType);
		buffer.append("</RspType>");

		buffer.append("<RspCode>");
		buffer.append(rspCode);
		buffer.append("</RspCode>");

		if (rspDesc!=null && rspDesc.length() > MessageContextUtil.RESPONSE_DESC_LENGTH){
			rspDesc = rspDesc.substring(0,
					MessageContextUtil.RESPONSE_DESC_LENGTH);
		}
		buffer.append("<RspDesc>");
		buffer.append(rspDesc);
		buffer.append("</RspDesc>");

		buffer.append("</ResponseHead>");
		buffer.append("</ContractRoot>");
		return buffer.toString();
	}


}
