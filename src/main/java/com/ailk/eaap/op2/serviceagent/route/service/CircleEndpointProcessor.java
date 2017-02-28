package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.RouteEndpoint;
public class CircleEndpointProcessor implements EndpointProcessor{

	private static final Logger logger = Logger.getLogger(CircleEndpointProcessor.class);
	private IRouteServ routeServ;
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		String path = (String)endpoint.getAttrMap().get(EndpointAttr.Path);
		logger.debug("cicle path"+path);
		Document xmldoc = (Document) msg.getMsgBody();
		List<Node> nodes = xmldoc.selectNodes(path);
		String parPath = null;
		if(nodes !=null && nodes.size()>0){
			Element parElement = nodes.get(0).getParent();
			parPath = parElement.getPath();
			for (Node node : nodes) {
				parElement.remove(node);
			}
		}
		String xml = xmldoc.asXML();
		if(nodes !=null && nodes.size()>0){
			RouteEndpoint routeEnd = msg.getCurrryRouteEndpoint();
			for (Node node : nodes) {
				try{
					Document document = DocumentHelper.parseText(xml);
					msg.setMsgBody(document);
					Element parElement = (Element) document.selectSingleNode(parPath);
					parElement.add(node);
					logger.debug("curryroute"+routeEnd.getCurrentEndpoint().getEndpointSpecCode());
					msg.setReqorrsp(EOPDomain.REQ_FLAG);
					routeServ.callEndpoint(routeEnd, msg);
				}catch(Exception e){
					logger.error(e.getStackTrace());
				}
				
			}
		}
		return msg;
		
		
		
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

	public IRouteServ getRouteServ() {
		return routeServ;
	}

	public void setRouteServ(IRouteServ routeServ) {
		this.routeServ = routeServ;
	}

}
