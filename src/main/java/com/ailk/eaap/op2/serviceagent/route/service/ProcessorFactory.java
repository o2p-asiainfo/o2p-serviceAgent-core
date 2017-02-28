package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointSpec;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Jul 17, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class ProcessorFactory {

	private Map<String, EndpointProcessor> processorCache = new ConcurrentHashMap<String, EndpointProcessor>();
	private static final Logger LOG = Logger.getLogger(ProcessorFactory.class);
	private EndpointProcessor nodeDescValidateServ;
	private EndpointProcessor callEndpointProcessor;
	private EndpointProcessor jMSSenderEndpointProcessor;
	private EndpointProcessor jMSReceiverEndpointProcessor;

	private EndpointProcessor translateEndpointProcessor;
	private EndpointProcessor obscureProcessor;
	private EndpointProcessor generateTokenProcessor;
	private EndpointProcessor inProcessor;
	private EndpointProcessor authProcessor;
	private EndpointProcessor jdbcEndpointProcessor;
	private EndpointProcessor encryptProcessor;
	private EndpointProcessor asynProcessor;
	private EndpointProcessor batchParseProcessor;
	private EndpointProcessor circleEndpointProcessor;
	private EndpointProcessor accessTypeProcesssor;
	private EndpointProcessor socketCallProcesssor;
	private EndpointProcessor endProcessor;
	private EndpointProcessor mapEnrichProcessor;
	private EndpointProcessor orderDealProcessor;
	private EndpointProcessor interceptionProcessor;
	private EndpointProcessor templateReplaceProcessor;
	
	private EndpointProcessor fileChkProcessor;
	private EndpointProcessor fileAdapterProcessor;
    private EndpointProcessor zipFileEndPointProcessor;
    private EndpointProcessor fetchFileEndPointProcessor;
    private EndpointProcessor removeFileEndPointProcessor;
    private EndpointProcessor transformerProcessor;
	private EndpointProcessor dyncScriptEndpointProcessor;
	
	private EndpointProcessor downloadProcessor;
	private EndpointProcessor filePublishProcessor;
	private EndpointProcessor fileSubscribeProcessor;
	private EndpointProcessor fileMoveV2Processor;
	
	private EndpointProcessor dynamicJdbcProcessor;
	
	private EndpointProcessor pluginsCallProcessor;
	private EndpointProcessor flatFileReaderEndpoint;
	private EndpointProcessor fileRenameProcessor;
	private EndpointProcessor xmlFileReaderEndpoint;
	
	private EndpointProcessor jMSTopicProcessor;
	
	private EndpointProcessor jMSTopicProducerProcessor;
	
	public EndpointProcessor getProcessor(Endpoint endpoint){
		EndpointProcessor processor = null;
		String endpointSpec = endpoint.getEndpointSpecCode();
		LOG.debug(endpointSpec);
		processor = processorCache.get(endpointSpec.toLowerCase());		
		if(processor == null){
			processor = createProcessor(endpoint);
			if(processor != null) {
				processorCache.put(endpointSpec.toLowerCase(), processor);
			}
		}
		 
		return processor;
	}
	
	/**
	 * @param endpoint
	 * @return
	 */
	private EndpointProcessor createProcessor(Endpoint endpoint){
		String endpointSpec = endpoint.getEndpointSpecCode();
		LOG.debug(endpointSpec);
		if(EndpointSpec.BEGIN.equalsIgnoreCase(endpointSpec)){
			//...
			return inProcessor;
		}else if (EndpointSpec.IN.equalsIgnoreCase(endpointSpec)){
			
			return inProcessor;
		}
		else if(EndpointSpec.HTTPACCESS.equalsIgnoreCase(endpointSpec))		{
			
			return accessTypeProcesssor;
			
		} 
	
		else if(EndpointSpec.IBMMQACCESS.equalsIgnoreCase(endpointSpec)){			
			return accessTypeProcesssor;
		}
		else if(EndpointSpec.WEBSERVICEACCESS.equalsIgnoreCase(endpointSpec)){
			return accessTypeProcesssor;
			
		}
		else if(EndpointSpec.GOLDENGATEACCESS.equalsIgnoreCase(endpointSpec)){
			return accessTypeProcesssor;
		}
		else if(EndpointSpec.FTPACCESS.equalsIgnoreCase(endpointSpec)){
			return accessTypeProcesssor;
		}                    
		else if(EndpointSpec.SOCKETACCESS.equalsIgnoreCase(endpointSpec)){
			return socketCallProcesssor;
		}
		
		else if(EndpointSpec.EJBACCESS.equalsIgnoreCase(endpointSpec)){
			return accessTypeProcesssor;
		}
		
		else if(EndpointSpec.END.equalsIgnoreCase(endpointSpec)){
			return endProcessor;
		}
		else if(EndpointSpec.HTTP.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}
		
		else if(EndpointSpec.WEBSERVICE.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}
		else if(EndpointSpec.EJB.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}
		else if(EndpointSpec.FTP.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}
		else if(EndpointSpec.GOLDENGATE.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}
		else if(EndpointSpec.JMS.equalsIgnoreCase(endpointSpec)){
			return jMSSenderEndpointProcessor;
		}
		else if(EndpointSpec.IBMMQ.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}else if(EndpointSpec.CALL.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}
		else if(EndpointSpec.ASYNCALLBACK.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}else if(EndpointSpec.VALIDATE.equalsIgnoreCase(endpointSpec)){
			
			return nodeDescValidateServ;
		}else if(EndpointSpec.GenerateToken.equalsIgnoreCase(endpointSpec)){
			
			return generateTokenProcessor;
		}

		
		else if(EndpointSpec.JDBC.equalsIgnoreCase(endpointSpec)){			
			return  jdbcEndpointProcessor;
		}
		else if(EndpointSpec.TRANSFORMER.equalsIgnoreCase(endpointSpec)){	
			
			return translateEndpointProcessor;
		}
		else if(EndpointSpec.OBSCURE.equalsIgnoreCase(endpointSpec)){	
			
			return obscureProcessor;
		}
		else if(EndpointSpec.AUTH.equalsIgnoreCase(endpointSpec)){	
			
			return authProcessor;
		}
		else if(EndpointSpec.ENCRYPT.equalsIgnoreCase(endpointSpec)){	
			
			return encryptProcessor;
		}
		else if(EndpointSpec.ASYN.equalsIgnoreCase(endpointSpec)){
			return asynProcessor;
		}
		else if(EndpointSpec.BATCH_PRARSE.equalsIgnoreCase(endpointSpec)){
			return batchParseProcessor;
		}
		else if(EndpointSpec.CIRCLE.equalsIgnoreCase(endpointSpec)){
			return circleEndpointProcessor;
		}
		else if(EndpointSpec.ENRICH.equalsIgnoreCase(endpointSpec)){
			return mapEnrichProcessor;
		}else if(EndpointSpec.TUXEDOCALL.equalsIgnoreCase(endpointSpec)){
			return callEndpointProcessor;
		}
		else if(EndpointSpec.ORDER_DEAL.equalsIgnoreCase(endpointSpec)){
			return orderDealProcessor;
		}
		else if(EndpointSpec.Interception.equalsIgnoreCase(endpointSpec)){
			return interceptionProcessor;
		}
		else if(EndpointSpec.templateReplace.equalsIgnoreCase(endpointSpec)){
			return templateReplaceProcessor;
		}else if(EndpointSpec.FILE_CHECK.equalsIgnoreCase(endpointSpec)){
			LOG.debug("fileChkProcessor:"+fileChkProcessor);
			return fileChkProcessor;
		}else if(EndpointSpec.FILE_ADAPTER.equalsIgnoreCase(endpointSpec)){
			return fileAdapterProcessor;
		}else if(EndpointSpec.TRANSFORMERv2.equalsIgnoreCase(endpointSpec)){
			return transformerProcessor;
		} else if(EndpointSpec.ZIP_FILE_END.equalsIgnoreCase(endpointSpec)){
            return zipFileEndPointProcessor;
        } else if(EndpointSpec.FETCH_FILE_END.equalsIgnoreCase(endpointSpec)){
            return fetchFileEndPointProcessor;
        } else if(EndpointSpec.REMOVE_FILE_END.equalsIgnoreCase(endpointSpec)){
            return removeFileEndPointProcessor;
        }else if(EndpointSpec.DOWNLOAD_FILE.equalsIgnoreCase(endpointSpec)){
            return downloadProcessor;
        } else if(EndpointSpec.FILE_PUBLISH.equalsIgnoreCase(endpointSpec)){
			return filePublishProcessor;
		} else if(EndpointSpec.FILE_SUBSCRIBE.equalsIgnoreCase(endpointSpec)){
			return fileSubscribeProcessor;
		} else if(EndpointSpec.FILE_MOVEV2.equalsIgnoreCase(endpointSpec)){
			return fileMoveV2Processor;
		} else if(EndpointSpec.JDBC_INOUT.equalsIgnoreCase(endpointSpec)){
			return dynamicJdbcProcessor;
		} else if(EndpointSpec.PLUGINS_CALL_END.equalsIgnoreCase(endpointSpec)){
			return pluginsCallProcessor;
		} else if(EndpointSpec.FLAT_FILE_READER.equalsIgnoreCase(endpointSpec)){
			return flatFileReaderEndpoint;
		}else if(EndpointSpec.FILERENAME.equalsIgnoreCase(endpointSpec)){
			return fileRenameProcessor;
		}else if(EndpointSpec.XML_FILE_READER.equalsIgnoreCase(endpointSpec)){
			return xmlFileReaderEndpoint;
		}else if(EndpointSpec.JMSRECEIVE.equalsIgnoreCase(endpointSpec)){
			return jMSReceiverEndpointProcessor;
		}else if(EndpointSpec.JMSTOPICCONSUMER.equalsIgnoreCase(endpointSpec)){
			return jMSTopicProcessor;
		}else if(EndpointSpec.JMSTOPICPRODUCER.equalsIgnoreCase(endpointSpec)){
			return jMSTopicProducerProcessor;
		}
			
		return null;
	}
	
	/**
	 */
	public void clear(){		
		for(EndpointProcessor processor : processorCache.values()){
			processor.clear();
		}
		
		processorCache.clear();
	}
	
	public EndpointProcessor getDynamicJdbcProcessor() {
		return dynamicJdbcProcessor;
	}

	public void setDynamicJdbcProcessor(EndpointProcessor dynamicJdbcProcessor) {
		this.dynamicJdbcProcessor = dynamicJdbcProcessor;
	}

	public EndpointProcessor getMapEnrichProcessor() {
		return mapEnrichProcessor;
	}

	public void setMapEnrichProcessor(EndpointProcessor mapEnrichProcessor) {
		this.mapEnrichProcessor = mapEnrichProcessor;
	}

	

	public void setFlatFileReaderEndpoint(EndpointProcessor flatFileReaderEndpoint) {
		this.flatFileReaderEndpoint = flatFileReaderEndpoint;
	}

	public EndpointProcessor getTemplateReplaceProcessor() {
		return templateReplaceProcessor;
	}

	public void setTemplateReplaceProcessor(
			EndpointProcessor templateReplaceProcessor) {
		this.templateReplaceProcessor = templateReplaceProcessor;
	}

	public Map<String, EndpointProcessor> getProcessorCache() {
		return processorCache;
	}

	public void setProcessorCache(Map<String, EndpointProcessor> processorCache) {
		this.processorCache = processorCache;
	}


	public EndpointProcessor getInProcessor() {
		return inProcessor;
	}

	public void setInProcessor(EndpointProcessor inProcessor) {
		this.inProcessor = inProcessor;
	}

	public EndpointProcessor getAuthProcessor() {
		return authProcessor;
	}

	public void setAuthProcessor(EndpointProcessor authProcessor) {
		this.authProcessor = authProcessor;
	}

	public EndpointProcessor getBatchParseProcessor() {
		return batchParseProcessor;
	}

	public EndpointProcessor getInterceptionProcessor() {
		return interceptionProcessor;
	}

	public void setInterceptionProcessor(EndpointProcessor interceptionProcessor) {
		this.interceptionProcessor = interceptionProcessor;
	}

	public void setBatchParseProcessor(EndpointProcessor batchParseProcessor) {
		this.batchParseProcessor = batchParseProcessor;
	}

	public EndpointProcessor getAccessTypeProcesssor() {
		return accessTypeProcesssor;
	}

	public void setAccessTypeProcesssor(EndpointProcessor accessTypeProcesssor) {
		this.accessTypeProcesssor = accessTypeProcesssor;
	}

	public EndpointProcessor getEndProcessor() {
		return endProcessor;
	}

	public void setEndProcessor(EndpointProcessor endProcessor) {
		this.endProcessor = endProcessor;
	}

	public EndpointProcessor getTranslateEndpointProcessor() {
		return translateEndpointProcessor;
	}

	public void setTranslateEndpointProcessor(
			EndpointProcessor translateEndpointProcessor) {
		this.translateEndpointProcessor = translateEndpointProcessor;
	}

	public EndpointProcessor getNodeDescValidateServ() {
		return nodeDescValidateServ;
	}

	public void setNodeDescValidateServ(EndpointProcessor nodeDescValidateServ) {
		this.nodeDescValidateServ = nodeDescValidateServ;
	}



	public EndpointProcessor getJdbcEndpointProcessor() {
		return jdbcEndpointProcessor;
	}

	public void setJdbcEndpointProcessor(EndpointProcessor jdbcEndpointProcessor) {
		this.jdbcEndpointProcessor = jdbcEndpointProcessor;
	}

	public EndpointProcessor getCallEndpointProcessor() {
		return callEndpointProcessor;
	}

	public void setCallEndpointProcessor(EndpointProcessor callEndpointProcessor) {
		this.callEndpointProcessor = callEndpointProcessor;
	}

	public EndpointProcessor getObscureProcessor() {
		return obscureProcessor;
	}

	public void setObscureProcessor(EndpointProcessor obscureProcessor) {
		this.obscureProcessor = obscureProcessor;
	}

	public EndpointProcessor getGenerateTokenProcessor() {
		return generateTokenProcessor;
	}

	public void setGenerateTokenProcessor(EndpointProcessor generateTokenProcessor) {
		this.generateTokenProcessor = generateTokenProcessor;
	}

	public EndpointProcessor getEncryptProcessor() {
		return encryptProcessor;
	}

	public void setEncryptProcessor(EndpointProcessor encryptProcessor) {
		this.encryptProcessor = encryptProcessor;
	}

	public EndpointProcessor getAsynProcessor() {
		return asynProcessor;
	}

	public void setAsynProcessor(EndpointProcessor asynProcessor) {
		this.asynProcessor = asynProcessor;
	}

	public EndpointProcessor getCircleEndpointProcessor() {
		return circleEndpointProcessor;
	}

	public void setCircleEndpointProcessor(EndpointProcessor circleEndpointProcessor) {
		this.circleEndpointProcessor = circleEndpointProcessor;
	}

	public EndpointProcessor getOrderDealProcessor() {
		return orderDealProcessor;
	}

	public void setOrderDealProcessor(EndpointProcessor orderDealProcessor) {
		this.orderDealProcessor = orderDealProcessor;
	}

	public void setFileChkProcessor(EndpointProcessor fileChkProcessor) {
		this.fileChkProcessor = fileChkProcessor;
	}

	public void setFileAdapterProcessor(EndpointProcessor fileAdapterProcessor) {
		this.fileAdapterProcessor = fileAdapterProcessor;
	}

	public EndpointProcessor getTransformerProcessor() {
		return transformerProcessor;
	}

	public void setTransformerProcessor(EndpointProcessor transformerProcessor) {
		this.transformerProcessor = transformerProcessor;
	}

	public EndpointProcessor getSocketCallProcesssor() {
		return socketCallProcesssor;
	}

	public void setSocketCallProcesssor(EndpointProcessor socketCallProcesssor) {
		this.socketCallProcesssor = socketCallProcesssor;
	}

	public EndpointProcessor getDyncScriptEndpointProcessor() {
		return dyncScriptEndpointProcessor;
	}

	public void setDyncScriptEndpointProcessor(
			EndpointProcessor dyncScriptEndpointProcessor) {
		this.dyncScriptEndpointProcessor = dyncScriptEndpointProcessor;
	}

    public EndpointProcessor getZipFileEndPointProcessor() {
        return zipFileEndPointProcessor;
    }

    public void setZipFileEndPointProcessor(EndpointProcessor zipFileEndPointProcessor) {
        this.zipFileEndPointProcessor = zipFileEndPointProcessor;
    }

    public EndpointProcessor getFetchFileEndPointProcessor() {
        return fetchFileEndPointProcessor;
    }

    public void setFetchFileEndPointProcessor(EndpointProcessor fetchFileEndPointProcessor) {
        this.fetchFileEndPointProcessor = fetchFileEndPointProcessor;
    }

    public EndpointProcessor getRemoveFileEndPointProcessor() {
        return removeFileEndPointProcessor;
    }

    public void setRemoveFileEndPointProcessor(EndpointProcessor removeFileEndPointProcessor) {
        this.removeFileEndPointProcessor = removeFileEndPointProcessor;
    }

	public EndpointProcessor getDownloadProcessor() {
		return downloadProcessor;
	}

	public void setDownloadProcessor(EndpointProcessor downloadProcessor) {
		this.downloadProcessor = downloadProcessor;
	}

	public EndpointProcessor getFilePublishProcessor() {
		return filePublishProcessor;
	}

	public void setFilePublishProcessor(EndpointProcessor filePublishProcessor) {
		this.filePublishProcessor = filePublishProcessor;
	}

	public EndpointProcessor getFileSubscribeProcessor() {
		return fileSubscribeProcessor;
	}

	public void setFileSubscribeProcessor(EndpointProcessor fileSubscribeProcessor) {
		this.fileSubscribeProcessor = fileSubscribeProcessor;
	}

	public EndpointProcessor getFileMoveV2Processor() {
		return fileMoveV2Processor;
	}

	public void setFileMoveV2Processor(EndpointProcessor fileMoveV2Processor) {
		this.fileMoveV2Processor = fileMoveV2Processor;
	}

	public void setjMSSenderEndpointProcessor(
			EndpointProcessor jMSSenderEndpointProcessor) {
		this.jMSSenderEndpointProcessor = jMSSenderEndpointProcessor;
	}

	public EndpointProcessor getFileRenameProcessor() {
		return fileRenameProcessor;
	}

	public void setFileRenameProcessor(EndpointProcessor fileRenameProcessor) {
		this.fileRenameProcessor = fileRenameProcessor;
	}

	public void setXmlFileReaderEndpoint(EndpointProcessor xmlFileReaderEndpoint) {
		this.xmlFileReaderEndpoint = xmlFileReaderEndpoint;
	}

	public EndpointProcessor getPluginsCallProcessor() {
		return pluginsCallProcessor;
	}

	public void setPluginsCallProcessor(EndpointProcessor pluginsCallProcessor) {
		this.pluginsCallProcessor = pluginsCallProcessor;
	}
	
	public void setjMSReceiverEndpointProcessor(
			EndpointProcessor jMSReceiverEndpointProcessor) {
		this.jMSReceiverEndpointProcessor = jMSReceiverEndpointProcessor;
	}


	public EndpointProcessor getjMSTopicProducerProcessor() {
		return jMSTopicProducerProcessor;
	}

	public void setjMSTopicProducerProcessor(
			EndpointProcessor jMSTopicProducerProcessor) {
		this.jMSTopicProducerProcessor = jMSTopicProducerProcessor;
	}

	public EndpointProcessor getjMSTopicProcessor() {
		return jMSTopicProcessor;
	}

	public void setjMSTopicProcessor(EndpointProcessor jMSTopicProcessor) {
		this.jMSTopicProcessor = jMSTopicProcessor;
	}




}
