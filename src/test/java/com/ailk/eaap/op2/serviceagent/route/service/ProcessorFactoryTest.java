package com.ailk.eaap.op2.serviceagent.route.service;

import static org.junit.Assert.assertNotNull;

import java.util.IdentityHashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ProcessorFactoryTest</code> contains tests for the class <code>{@link ProcessorFactory}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午8:08
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ProcessorFactoryTest {
	/**
	 * Run the ProcessorFactory() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testProcessorFactory_1()
		throws Exception {
		ProcessorFactory result = new ProcessorFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testClear_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		fixture.clear();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testClear_2()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		fixture.clear();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the EndpointProcessor getAccessTypeProcesssor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetAccessTypeProcesssor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getAccessTypeProcesssor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getAsynProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetAsynProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getAsynProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getAuthProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetAuthProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getAuthProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getBatchParseProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetBatchParseProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getBatchParseProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getCallEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetCallEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getCallEndpointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getCircleEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetCircleEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getCircleEndpointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getDownloadProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetDownloadProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getDownloadProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getDynamicJdbcProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetDynamicJdbcProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getDynamicJdbcProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getDyncScriptEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetDyncScriptEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getDyncScriptEndpointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getEncryptProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetEncryptProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getEncryptProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getEndProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetEndProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getEndProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getFetchFileEndPointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetFetchFileEndPointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getFetchFileEndPointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getFileMoveV2Processor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetFileMoveV2Processor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getFileMoveV2Processor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getFilePublishProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetFilePublishProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getFilePublishProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getFileRenameProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetFileRenameProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getFileRenameProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getFileSubscribeProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetFileSubscribeProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getFileSubscribeProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getGenerateTokenProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetGenerateTokenProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getGenerateTokenProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getHttpEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetHttpEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the EndpointProcessor getInProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetInProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getInProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getInterceptionProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetInterceptionProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getInterceptionProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getJdbcEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetJdbcEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getJdbcEndpointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getMapEnrichProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetMapEnrichProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getMapEnrichProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getNodeDescValidateServ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetNodeDescValidateServ_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getNodeDescValidateServ();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getObscureProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetObscureProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getObscureProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getOrderDealProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetOrderDealProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getOrderDealProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getPluginsCallProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetPluginsCallProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getPluginsCallProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}


	/**
	 * Run the Map<String, EndpointProcessor> getProcessorCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetProcessorCache_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		Map<String, EndpointProcessor> result = fixture.getProcessorCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getRemoveFileEndPointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetRemoveFileEndPointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getRemoveFileEndPointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getSocketCallProcesssor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetSocketCallProcesssor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getSocketCallProcesssor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getTemplateReplaceProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetTemplateReplaceProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getTemplateReplaceProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getTransformerProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetTransformerProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getTransformerProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getTranslateEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetTranslateEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getTranslateEndpointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the EndpointProcessor getWebserviceEndpointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetWebserviceEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());


		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the EndpointProcessor getZipFileEndPointProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testGetZipFileEndPointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());

		EndpointProcessor result = fixture.getZipFileEndPointProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
		assertNotNull(result);
	}

	/**
	 * Run the void setAccessTypeProcesssor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetAccessTypeProcesssor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor accessTypeProcesssor = new FlatFileReaderEndpoint();

		fixture.setAccessTypeProcesssor(accessTypeProcesssor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setAsynProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetAsynProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor asynProcessor = new FlatFileReaderEndpoint();

		fixture.setAsynProcessor(asynProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setAuthProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetAuthProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor authProcessor = new FlatFileReaderEndpoint();

		fixture.setAuthProcessor(authProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setBatchParseProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetBatchParseProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor batchParseProcessor = new FlatFileReaderEndpoint();

		fixture.setBatchParseProcessor(batchParseProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setCallEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetCallEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor callEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setCallEndpointProcessor(callEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setCircleEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetCircleEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor circleEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setCircleEndpointProcessor(circleEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setDownloadProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetDownloadProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor downloadProcessor = new FlatFileReaderEndpoint();

		fixture.setDownloadProcessor(downloadProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setDynamicJdbcProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetDynamicJdbcProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor dynamicJdbcProcessor = new FlatFileReaderEndpoint();

		fixture.setDynamicJdbcProcessor(dynamicJdbcProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setDyncScriptEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetDyncScriptEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor dyncScriptEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setDyncScriptEndpointProcessor(dyncScriptEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setEncryptProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetEncryptProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor encryptProcessor = new FlatFileReaderEndpoint();

		fixture.setEncryptProcessor(encryptProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setEndProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetEndProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor endProcessor = new FlatFileReaderEndpoint();

		fixture.setEndProcessor(endProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFetchFileEndPointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFetchFileEndPointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor fetchFileEndPointProcessor = new FlatFileReaderEndpoint();

		fixture.setFetchFileEndPointProcessor(fetchFileEndPointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFileAdapterProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFileAdapterProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor fileAdapterProcessor = new FlatFileReaderEndpoint();

		fixture.setFileAdapterProcessor(fileAdapterProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFileChkProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFileChkProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor fileChkProcessor = new FlatFileReaderEndpoint();

		fixture.setFileChkProcessor(fileChkProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFileMoveProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFileMoveProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor fileMoveProcessor = new FlatFileReaderEndpoint();


		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFileMoveV2Processor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFileMoveV2Processor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor fileMoveV2Processor = new FlatFileReaderEndpoint();

		fixture.setFileMoveV2Processor(fileMoveV2Processor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFilePublishProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFilePublishProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor filePublishProcessor = new FlatFileReaderEndpoint();

		fixture.setFilePublishProcessor(filePublishProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFileRenameProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFileRenameProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor fileRenameProcessor = new FlatFileReaderEndpoint();

		fixture.setFileRenameProcessor(fileRenameProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFileSubscribeProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFileSubscribeProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor fileSubscribeProcessor = new FlatFileReaderEndpoint();

		fixture.setFileSubscribeProcessor(fileSubscribeProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setFlatFileReaderEndpoint(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetFlatFileReaderEndpoint_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor flatFileReaderEndpoint = new FlatFileReaderEndpoint();

		fixture.setFlatFileReaderEndpoint(flatFileReaderEndpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setGenerateTokenProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetGenerateTokenProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor generateTokenProcessor = new FlatFileReaderEndpoint();

		fixture.setGenerateTokenProcessor(generateTokenProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setHttpEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetHttpEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor httpEndpointProcessor = new FlatFileReaderEndpoint();


		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setInProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetInProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor inProcessor = new FlatFileReaderEndpoint();

		fixture.setInProcessor(inProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setInterceptionProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetInterceptionProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor interceptionProcessor = new FlatFileReaderEndpoint();

		fixture.setInterceptionProcessor(interceptionProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setJdbcEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetJdbcEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor jdbcEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setJdbcEndpointProcessor(jdbcEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setMapEnrichProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetMapEnrichProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor mapEnrichProcessor = new FlatFileReaderEndpoint();

		fixture.setMapEnrichProcessor(mapEnrichProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setNodeDescValidateServ(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetNodeDescValidateServ_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor nodeDescValidateServ = new FlatFileReaderEndpoint();

		fixture.setNodeDescValidateServ(nodeDescValidateServ);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setObscureProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetObscureProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor obscureProcessor = new FlatFileReaderEndpoint();

		fixture.setObscureProcessor(obscureProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setOrderDealProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetOrderDealProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor orderDealProcessor = new FlatFileReaderEndpoint();

		fixture.setOrderDealProcessor(orderDealProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setPluginsCallProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetPluginsCallProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor pluginsCallProcessor = new FlatFileReaderEndpoint();

		fixture.setPluginsCallProcessor(pluginsCallProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setProcessorCache(Map<String,EndpointProcessor>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetProcessorCache_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		Map<String, EndpointProcessor> processorCache = new IdentityHashMap();

		fixture.setProcessorCache(processorCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setRemoveFileEndPointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetRemoveFileEndPointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor removeFileEndPointProcessor = new FlatFileReaderEndpoint();

		fixture.setRemoveFileEndPointProcessor(removeFileEndPointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setSocketCallProcesssor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetSocketCallProcesssor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor socketCallProcesssor = new FlatFileReaderEndpoint();

		fixture.setSocketCallProcesssor(socketCallProcesssor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setTemplateReplaceProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetTemplateReplaceProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor templateReplaceProcessor = new FlatFileReaderEndpoint();

		fixture.setTemplateReplaceProcessor(templateReplaceProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setTransformerProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetTransformerProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor transformerProcessor = new FlatFileReaderEndpoint();

		fixture.setTransformerProcessor(transformerProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setTranslateEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetTranslateEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor translateEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setTranslateEndpointProcessor(translateEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setWebserviceEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetWebserviceEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor webserviceEndpointProcessor = new FlatFileReaderEndpoint();


		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setXmlFileReaderEndpoint(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetXmlFileReaderEndpoint_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor xmlFileReaderEndpoint = new FlatFileReaderEndpoint();

		fixture.setXmlFileReaderEndpoint(xmlFileReaderEndpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setZipFileEndPointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetZipFileEndPointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor zipFileEndPointProcessor = new FlatFileReaderEndpoint();

		fixture.setZipFileEndPointProcessor(zipFileEndPointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setjMSReceiverEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetjMSReceiverEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor jMSReceiverEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setjMSReceiverEndpointProcessor(jMSReceiverEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Run the void setjMSSenderEndpointProcessor(EndpointProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Test
	public void testSetjMSSenderEndpointProcessor_1()
		throws Exception {
		ProcessorFactory fixture = new ProcessorFactory();
		fixture.setFileAdapterProcessor(new FlatFileReaderEndpoint());
		fixture.setAsynProcessor(new FlatFileReaderEndpoint());
		fixture.setDownloadProcessor(new FlatFileReaderEndpoint());
		fixture.setAccessTypeProcesssor(new FlatFileReaderEndpoint());
		
		fixture.setFlatFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setCallEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileRenameProcessor(new FlatFileReaderEndpoint());
		fixture.setBatchParseProcessor(new FlatFileReaderEndpoint());
		fixture.setDyncScriptEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setFileMoveV2Processor(new FlatFileReaderEndpoint());
		fixture.setEndProcessor(new FlatFileReaderEndpoint());
		fixture.setInProcessor(new FlatFileReaderEndpoint());
		fixture.setGenerateTokenProcessor(new FlatFileReaderEndpoint());
		fixture.setTemplateReplaceProcessor(new FlatFileReaderEndpoint());
		fixture.setSocketCallProcesssor(new FlatFileReaderEndpoint());
		fixture.setJdbcEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setNodeDescValidateServ(new FlatFileReaderEndpoint());
		fixture.setFilePublishProcessor(new FlatFileReaderEndpoint());
		fixture.setTransformerProcessor(new FlatFileReaderEndpoint());
		fixture.setTranslateEndpointProcessor(new FlatFileReaderEndpoint());
		
		fixture.setPluginsCallProcessor(new FlatFileReaderEndpoint());
		fixture.setDynamicJdbcProcessor(new FlatFileReaderEndpoint());
		fixture.setXmlFileReaderEndpoint(new FlatFileReaderEndpoint());
		fixture.setProcessorCache(new IdentityHashMap());
		fixture.setMapEnrichProcessor(new FlatFileReaderEndpoint());
		fixture.setOrderDealProcessor(new FlatFileReaderEndpoint());
		fixture.setInterceptionProcessor(new FlatFileReaderEndpoint());
		
		fixture.setEncryptProcessor(new FlatFileReaderEndpoint());
		fixture.setFileChkProcessor(new FlatFileReaderEndpoint());
		fixture.setFileSubscribeProcessor(new FlatFileReaderEndpoint());
		fixture.setRemoveFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setZipFileEndPointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSReceiverEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setObscureProcessor(new FlatFileReaderEndpoint());
		fixture.setCircleEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setjMSSenderEndpointProcessor(new FlatFileReaderEndpoint());
		fixture.setAuthProcessor(new FlatFileReaderEndpoint());
		fixture.setFetchFileEndPointProcessor(new FlatFileReaderEndpoint());
		EndpointProcessor jMSSenderEndpointProcessor = new FlatFileReaderEndpoint();

		fixture.setjMSSenderEndpointProcessor(jMSSenderEndpointProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ProcessorFactory
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:08
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProcessorFactoryTest.class);
	}
}