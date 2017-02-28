package com.ailk.eaap.op2.serviceagent.common;

import org.dom4j.Document;
import org.dom4j.Node;

public final class MessageContext {

	private Document doc;


	private String reqOrRspFlag;

	private String cii;
	private String xmlStr;
	public String getCii() {
		return cii;
	}

	public String getReqOrResFlag() {
		return reqOrRspFlag;
	}

	public String getTotalMsg() {
		return doc.asXML();
	}

	public Document getAllDomDocument() {
		return doc;
	}

	private MessageContext() {

	}

	public static MessageContext newInstance(String cii, Document doc,
			String reqOrRspFlag,String xmlStr) {
		MessageContext ctx = new MessageContext();
		ctx.cii = cii;
		ctx.reqOrRspFlag = reqOrRspFlag;
		ctx.doc = doc;
		ctx.xmlStr = xmlStr;
		return ctx;
	}

	public Node getSvcNode() {
		return doc.getRootElement().selectSingleNode("./SvcCont");
	}

	public String getSvcMsg() {
		Node svcNode = getSvcNode();
		if (svcNode == null) {
			return "";
		} else {
			return svcNode.asXML();
		}
	}

	public String getTcpMsg() {
		Node tcpNode = getTcpNode();
		return tcpNode.asXML();
	}

	public Node getTcpNode() {
		return doc.getRootElement().selectSingleNode("./TcpCont");
	}

	public String getXmlStr() {
		return xmlStr;
	}

	public void setXmlStr(String xmlStr) {
		this.xmlStr = xmlStr;
	}
}
