/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:ExecutionContext.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.common 
 * Date:2015年1月26日上午10:20:17 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.common;  

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

import javax.xml.stream.XMLEventReader;

import com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue;
import com.ailk.eaap.op2.serviceagent.route.service.batch.xml.FragmentEventReader;
import com.asiainfo.foundation.exception.BusinessException;


/** 
 * ClassName:ExecutionContext  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月26日 上午10:20:17  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class ExecutionContext implements Serializable, Cloneable{

	/** 
	 * serialVersionUID:TODO. 
	 * @since JDK 1.6 
	 */  
	private static final long serialVersionUID = 1L;
	private String status;
	private int readCount = 0;
	private int commitCount;
	private String exitStatus;
	
	//批处理文件reader
	private transient BufferedReader reader;
	private int lineCount = 0;
	private int linesToSkip = 0;
	
	private int threadNumber = 4;
	
	private ThrottleLimitResultQueue queue;
	
	//xml参数
	private transient FragmentEventReader fragmentReader;

	private transient XMLEventReader eventReader;

	private transient InputStream inputStream;

	private String fragmentRootElementName;
	
	private transient XMLEventReader xmlReader;
	
	@Override
	public ExecutionContext clone()  {
		ExecutionContext  ec= null;
		
		try {
			ec = (ExecutionContext) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{e.getMessage()}, e);
		}
		
		return ec;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public XMLEventReader getXmlReader() {
		return xmlReader;
	}
	public void setXmlReader(XMLEventReader xmlReader) {
		this.xmlReader = xmlReader;
	}
	public int getCommitCount() {
		return commitCount;
	}

	public void setCommitCount(int commitCount) {
		this.commitCount = commitCount;
	}
	public String getExitStatus() {
		return exitStatus;
	}
	public void setExitStatus(String exitStatus) {
		this.exitStatus = exitStatus;
	}
	
	public void incrementCommitCount() {
		commitCount++;
	}
	
	public void incrementReadCount() {
		readCount++;
	} 
	
	public FragmentEventReader getFragmentReader() {
		return fragmentReader;
	}
	public void setFragmentReader(FragmentEventReader fragmentReader) {
		this.fragmentReader = fragmentReader;
	}
	public XMLEventReader getEventReader() {
		return eventReader;
	}
	public void setEventReader(XMLEventReader eventReader) {
		this.eventReader = eventReader;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public String getFragmentRootElementName() {
		return fragmentRootElementName;
	}
	public void setFragmentRootElementName(String fragmentRootElementName) {
		this.fragmentRootElementName = fragmentRootElementName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public BufferedReader getReader() {
		return reader;
	}

	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}
	
	public int getLineCount() {
		return lineCount;
	}
	public void setLineCount(int lineCount) {
		this.lineCount = lineCount;
	}
	public int getLinesToSkip() {
		return linesToSkip;
	}
	public void setLinesToSkip(int linesToSkip) {
		this.linesToSkip = linesToSkip;
	}
	public int getThreadNumber() {
		return threadNumber;
	}
	public ThrottleLimitResultQueue getQueue() {
		return queue;
	}
	public void setQueue(ThrottleLimitResultQueue queue) {
		this.queue = queue;
	}
	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	public void apply(int readCount) {
		commitCount += readCount;
	}
}
