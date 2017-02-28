/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:FlatFileReadEndpoint.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2015年1月26日下午4:13:58 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service;  

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang.StringUtils;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.batch.AbstractBatchEndpoint;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;

/** 
 * ClassName:FlatFileReadEndpoint  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月26日 下午4:13:58  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class FlatFileReaderEndpoint  extends AbstractBatchEndpoint{
	private static final Logger LOG = Logger.getLog(FlatFileReaderEndpoint.class);
	
	@Override
	public MessageBO process(Endpoint endpoint, MessageBO messageBo)
			 {
		
		String line = readLine(messageBo);
		
		if(LOG.isDebugEnabled()) {
			LOG.debug("Read line success. content="+line);
		}
		
		messageBo.setMsgBody(line);
		
		return messageBo;
	}
	
	public void doOpen(MessageBO messageBo) throws Exception  {
		
		if(messageBo.getExecutionContext().getReader() == null) {
		
			Endpoint endpoint = messageBo.getCurrryRouteEndpoint().getCurrentEndpoint();
			Object obj = endpoint.getAttrMap().get(EndpointAttr.LINK_FILE_DIR);
			BufferedReader reader = null;
			File file = null;
			//从下载端点传的路径
			if(messageBo.getMsgBody() != null) {
				
				Object objF = messageBo.getMsgBody();
					
				if(objF instanceof File[]) {
					
					file = ((File[])objF).length > 0 ? ((File[])objF)[0] : null;
				}
				else if(objF instanceof File) {
					
					file = (File)objF;
				}  
			}
			//在当前端点保存的路径
			if(file == null && obj != null && !StringUtils.isEmpty(obj.toString())) {
				file = new File(obj.toString());
				//保存文件变量
				File[] files = new File[1];
				files[0] = file;
				messageBo.setMsgBody(files);
			}
			
			if(file != null) {
				
				if(LOG.isDebugEnabled()) {
					LOG.debug("Flat file reader. file dir="+file.getPath());
				}
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(file.toString()),"GB2312"));
			} else {
				
				throw new BusinessException(9999, "Flat file reader. file is null.");
			}
			
			messageBo.getExecutionContext().setReader(reader);
			
			for (int i = 0; i < messageBo.getExecutionContext().getLinesToSkip(); i++) {
				readLine(messageBo);
			}
			
			//修改并发数
			Object tNObj = endpoint.getAttrMap().get(EndpointAttr.THREAD_NUM_LIMIT);
			if(tNObj != null && !StringUtils.isEmpty(tNObj.toString())) {
				messageBo.getExecutionContext().getQueue().updateThrottleLimit(Integer.parseInt(tNObj.toString()));
			}
		}
		
	}
	
	public String readLine(MessageBO messageBo) {
		
		int lineCount = messageBo.getExecutionContext().getLineCount();
		if(LOG.isDebugEnabled()) {
			LOG.debug("read count="+lineCount);
		}
		
		if (messageBo.getExecutionContext().getReader() == null) {
			throw new BusinessException(9999, "Reader must be open before it can be read.");
		}
		
		String line = null;

		try {
			line = messageBo.getExecutionContext().getReader().readLine();
			if (line == null) {
				return null;
			}
			lineCount++;
			messageBo.getExecutionContext().setLineCount(lineCount);
		}
		catch (IOException e) {
			throw new BusinessException(9999, "Unable to read from resource. lineCount="+lineCount, e);
		}
		return line;
	}

	@Override
	protected void doClose(MessageBO messageBo) throws Exception {

		messageBo.getExecutionContext().setLineCount(0);
		if (messageBo.getExecutionContext().getReader() != null) {
			messageBo.getExecutionContext().getReader().close();
		}
	}

	@Override
	protected void doRead(MessageBO messageBo) throws Exception {

		readLine(messageBo);
		
	}

}
