package com.ailk.eaap.op2.serviceagent.saml;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.message.WSSecHeader;
import org.apache.ws.security.message.WSSecSAMLToken;
import org.apache.ws.security.saml.WSSecSignatureSAML;
import org.apache.ws.security.saml.ext.AssertionWrapper;
import org.apache.ws.security.saml.ext.SAMLParms;
import org.apache.ws.security.util.WSSecurityUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.asiainfo.foundation.exception.BusinessException;
import com.eviware.soapui.impl.wsdl.support.wss.saml.callback.SAML1CallbackHandler;
import com.eviware.soapui.impl.wsdl.support.wss.saml.callback.SAML2CallbackHandler;
import com.eviware.soapui.impl.wsdl.support.wss.saml.callback.SAMLCallbackHandler;
import com.eviware.soapui.support.types.StringToStringMap;
import com.eviware.soapui.support.xml.XmlUtils;

public class SAMLEntryOutgoing {


	
	public static String processOutgoing(String xml,SAMLEntry entry) throws Exception {
		Document soapDocument = XmlUtils.parseXml(xml);
		Element header = WSSecurityUtil.findWsseSecurityHeaderBlock(soapDocument, soapDocument.getDocumentElement(), false);
		while (header != null) {
		    header.getParentNode().removeChild(header);
		    header = WSSecurityUtil.findWsseSecurityHeaderBlock(soapDocument, soapDocument.getDocumentElement(), false);
		}
		WSSecHeader secHeader = new WSSecHeader();
		secHeader.setMustUnderstand(false);
		secHeader.insertSecurityHeader(soapDocument);
		process(secHeader, soapDocument,entry);
		
		StringWriter writer = new StringWriter();
	    XmlUtils.serialize(soapDocument, writer);
		
	    return writer.toString();
	}
	
	private static void process(WSSecHeader secHeader, Document doc,SAMLEntry entry) {
		try{
			SAMLParms samlParms = new SAMLParms();
			SAMLCallbackHandler callbackHandler = null;
			if (!entry.isSigned()) {
				WSSecSAMLToken wsSecSAMLToken = new WSSecSAMLToken();
				if (entry.getSamlVersion().equals("1.1")){
					callbackHandler = new SAML1CallbackHandler(entry.getAssertionType(), entry.getConfirmationMethod());
				}else if (entry.getSamlVersion().equals("2.0")){
					callbackHandler = new SAML2CallbackHandler(entry.getAssertionType(), entry.getConfirmationMethod());
				}else {
					throw new IllegalArgumentException("Not a valid SAML version");
				}
				
				AssertionWrapper assertion = createAssertion( samlParms, callbackHandler,entry);
				wsSecSAMLToken.build(doc, assertion, secHeader);
			}else{
				
				WSSecSignatureSAML wsSecSignatureSAML = new WSSecSignatureSAML();
				
				KeyStoreUtil ke = new KeyStoreUtil();
		        ke.loadKeyAndCertificate(entry.getJksFileName(), entry.getStorepass(), entry.getAlias(), entry.getPassword());
		        if (entry.getSamlVersion().equals("1.1")) {
		        	callbackHandler = new SAML1CallbackHandler(ke, entry.getAlias(), entry.getAssertionType(), entry.getConfirmationMethod());
		        }else if (entry.getSamlVersion().equals("2.0")) {
		        	callbackHandler = new SAML2CallbackHandler(ke, entry.getAlias(), entry.getAssertionType(), entry.getConfirmationMethod());
		        }else{
		        	throw new IllegalArgumentException("Not a valid SAML version");
		        }
		        
		        AssertionWrapper assertion = createAssertion(samlParms, callbackHandler,entry);
		        assertion.signAssertion(entry.getAlias(), entry.getPassword(), ke, false);
		        wsSecSignatureSAML.setUserInfo(entry.getAlias(), entry.getPassword());
		        if (entry.getConfirmationMethod().equals("Sender vouches")) {
		        	wsSecSignatureSAML.setKeyIdentifierType(1);
		        	wsSecSignatureSAML.build(doc, null, assertion, ke, entry.getAlias(), entry.getPassword(), secHeader);
		        }else if (entry.getConfirmationMethod().equals("Holder-of-key")) {
		        	wsSecSignatureSAML.setDigestAlgo(entry.getDigestAlgorithm());
		        	if (entry.getAssertionType().equals("Authentication")) {
		        		wsSecSignatureSAML.setKeyIdentifierType(1);
		        		wsSecSignatureSAML.setSignatureAlgorithm(entry.getSignatureAlgorithm());
		        	}else if (entry.getAssertionType().equals("Attribute")){
		        		wsSecSignatureSAML.setKeyIdentifierType(3);
		        		wsSecSignatureSAML.setSignatureAlgorithm(entry.getSignatureAlgorithm());
		        		byte[] ephemeralKey = callbackHandler.getEphemeralKey();
		        		wsSecSignatureSAML.setSecretKey(ephemeralKey);
		        	}
		        	wsSecSignatureSAML.build(doc, ke, assertion, null, null, null, secHeader);
		        	
		        }
			}
		}catch(Exception e ){
			
			throw new BusinessException(9281, "9281.SECURITY.ENCRY.ERROR", new String[]{}, e);
		}
		
	}
	
	private static AssertionWrapper createAssertion( SAMLParms samlParms, SAMLCallbackHandler callbackHandler,SAMLEntry entry) throws WSSecurityException{
		if (entry.getAssertionType().equals("Attribute")) {
			callbackHandler.setCustomAttributeName(entry.getAttributeName());
			callbackHandler.setCustomAttributeValues(extractValueColumnValues(entry.getAttributeValues()));
		}
		callbackHandler.setIssuer(entry.getIssuer());
		callbackHandler.setSubjectName(entry.getSubjectName());
		callbackHandler.setSubjectQualifier(entry.getSubjectQualifier());
		samlParms.setCallbackHandler(callbackHandler);
		return new AssertionWrapper(samlParms);
	}
	
	private static List<String> extractValueColumnValues(List<StringToStringMap> table){
		List firstColumnValues = new ArrayList();
		for (StringToStringMap row : table) {
			String columnValue = (String)row.get("value");
			firstColumnValues.add(columnValue);
		}
		return firstColumnValues;
	}
}
