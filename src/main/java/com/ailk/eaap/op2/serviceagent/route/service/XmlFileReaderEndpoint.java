/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:XmlFileReaderEndpoint.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2015年2月3日上午10:41:18 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service;  

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.StartElement;

import org.apache.commons.lang.StringUtils;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.xml.stream.XmlEventStreamReader;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.batch.AbstractBatchEndpoint;
import com.ailk.eaap.op2.serviceagent.route.service.batch.xml.DefaultFragmentEventReader;
import com.ailk.eaap.op2.serviceagent.route.service.batch.xml.FragmentEventReader;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;

/** 
 * ClassName:XmlFileReaderEndpoint  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月3日 上午10:41:18  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class XmlFileReaderEndpoint   extends AbstractBatchEndpoint{
	private static final Logger LOG = Logger.getLog(XmlFileReaderEndpoint.class);
	


	/**
	 * Responsible for moving the cursor before the StartElement of the fragment
	 * root.
	 * 
	 * This implementation simply looks for the next corresponding element, it
	 * does not care about element nesting. You will need to override this
	 * method to correctly handle composite fragments.
	 * 
	 * @return <code>true</code> if next fragment was found,
	 * <code>false</code> otherwise.
	 */
	protected boolean moveCursorToNextFragment(MessageBO messageBo) {
		try {
			while (true) {
				
				while (messageBo.getExecutionContext().getFragmentReader().peek() != null && !messageBo.getExecutionContext().getFragmentReader().peek().isStartElement()) {
					messageBo.getExecutionContext().getFragmentReader().nextEvent();
				}
				if (messageBo.getExecutionContext().getFragmentReader().peek() == null) {
					return false;
				}
				QName startElementName = ((StartElement) messageBo.getExecutionContext().getFragmentReader().peek()).getName();
				if (startElementName.getLocalPart().equals(messageBo.getExecutionContext().getFragmentRootElementName())) {
					return true;
				}
				else {
					messageBo.getExecutionContext().getFragmentReader().nextEvent();
				}
			}
		}
		catch (XMLStreamException e) {
			throw new DataAccessResourceFailureException("Error while reading from event reader", e);
		}
	}


	@Override
	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {

		try {
			doRead(msg);
		} catch (Exception e) {
			
			throw new BusinessException(9999, "Unable to read from xml resource.", e);
		}
		
		return msg;
	}

	@Override
	protected void doOpen(MessageBO messageBo) throws Exception {
		
		if(messageBo.getExecutionContext().getFragmentReader() == null) {
			Endpoint endpoint = messageBo.getCurrryRouteEndpoint().getCurrentEndpoint();
			Object obj = endpoint.getAttrMap().get(EndpointAttr.LINK_FILE_DIR);
			
			FragmentEventReader fragmentReader = null;
			File file = null;
			//从下载端点传的路径
			if(messageBo.getMsgBody() != null) {
				
				Object objF = messageBo.getMsgBody();
					
				if(objF instanceof File[]) {
					
					file = ((File[])objF).length > 0 ? ((File[])objF)[0] : null;
				} else if(objF instanceof File) {
					
					file = (File)objF;
				} 
				
			}
			//端点属性获取文件路径
			if(file == null && obj != null && !StringUtils.isEmpty(obj.toString())) {
				
				file = new File(obj.toString());
				//保存文件变量
				File[] files = new File[1];
				files[0] = file;
				messageBo.setMsgBody(files);
			}
			
			if(file == null) {
				
				throw new BusinessException(9999, "Xml file reader. file is null.");
			} else {
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("Open the xml file reader. file dir="+file.getPath());
				}
			}
			
			InputStream inputStream = new FileInputStream(file);
			XMLEventReader eventReader = XMLInputFactory.newInstance().createXMLEventReader(inputStream,"GB2312");
			fragmentReader = new DefaultFragmentEventReader(eventReader);
			
			messageBo.getExecutionContext().setXmlReader(eventReader);
			messageBo.getExecutionContext().setFragmentReader(fragmentReader);
			
			//设置根节点
			Object rootObj = endpoint.getAttrMap().get(EndpointAttr.ROOT_ELEMENT_NAME);
			if(rootObj != null && !StringUtils.isEmpty(rootObj.toString())) {
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("xml file root element name="+rootObj.toString());
				}
				messageBo.getExecutionContext().setFragmentRootElementName(rootObj.toString());
			}
			
			//不支持多线程，修改并发数为1
			messageBo.getExecutionContext().getQueue().updateThrottleLimit(1);
			
		}
	}

	@Override
	protected void doClose(MessageBO messageBo) throws Exception {

		try {
			if (messageBo.getExecutionContext().getFragmentReader() != null) {
				messageBo.getExecutionContext().getFragmentReader().close();
			}
			if (messageBo.getExecutionContext().getInputStream() != null) {
				messageBo.getExecutionContext().getInputStream().close();
			}
		}
		finally {
			messageBo.getExecutionContext().setFragmentReader(null);
			messageBo.getExecutionContext().setInputStream(null);
		}
	}

	@Override
	protected void doRead(MessageBO messageBo) throws Exception {

		StringBuffer item = new StringBuffer();

		if (moveCursorToNextFragment(messageBo)) {
			messageBo.getExecutionContext().getFragmentReader().markStartFragment();
			XMLStreamReader streamReader = new XmlEventStreamReader(messageBo.getExecutionContext().getFragmentReader());
			while (streamReader.hasNext()) {
				
		        int eventType = streamReader.next();
		        if(eventType==XMLStreamConstants.START_ELEMENT){

		        	item.append("<"+streamReader.getLocalName()+">");
		        } else if(eventType == XMLStreamConstants.CHARACTERS ||
		                eventType == XMLStreamConstants.CDATA || eventType == XMLStreamConstants.SPACE ||
		                eventType == XMLStreamConstants.PROCESSING_INSTRUCTION) {
		        	
		        	item.append(streamReader.getText());
		        } else if(eventType==XMLStreamConstants.END_ELEMENT){
		        	
		        	item.append("</"+streamReader.getLocalName()+">");
		        }
		    }
			
			messageBo.getExecutionContext().getFragmentReader().markFragmentProcessed();
		}
		
		if(LOG.isDebugEnabled()) {
			
			LOG.debug("read xml file: "+item.toString());
		}
		
		messageBo.setMsgBody(item.toString());
	}

}
