package com.ailk.eaap.op2.serviceagent.saml;


import java.util.List;

import com.eviware.soapui.support.types.StringToStringMap;
public class SAMLEntry {

	private String jksFileName;
	private String storepass;
	private String provider;
	private boolean signed = true;
	
	private String samlVersion = "2.0";
	private String assertionType = "Authentication";
	private String confirmationMethod = "Sender vouches";
	private String crypto;
	private String issuer;
	private String subjectName;
	private String subjectQualifier;
	private String digestAlgorithm = "http://www.w3.org/2000/09/xmldsig#sha1";
	private String signatureAlgorithm = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
	private String attributeName;
	private String password;
	private String alias;
	private List<StringToStringMap> attributeValues;
	
	public SAMLEntry(String jksFileName,String storepass,String alias,String password,String subjectName){
		this.jksFileName = jksFileName;
		this.storepass = storepass;
		this.alias = alias;
		this.password = password;
		this.subjectName = subjectName;
	}
	public String getJksFileName() {
		return jksFileName;
	}
	public void setJksFileName(String jksFileName) {
		this.jksFileName = jksFileName;
	}
	public String getStorepass() {
		return storepass;
	}
	public void setStorepass(String storepass) {
		this.storepass = storepass;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public boolean isSigned() {
		return signed;
	}
	public void setSigned(boolean signed) {
		this.signed = signed;
	}
	public String getSamlVersion() {
		return samlVersion;
	}
	public void setSamlVersion(String samlVersion) {
		this.samlVersion = samlVersion;
	}
	public String getAssertionType() {
		return assertionType;
	}
	public void setAssertionType(String assertionType) {
		this.assertionType = assertionType;
	}
	public String getConfirmationMethod() {
		return confirmationMethod;
	}
	public void setConfirmationMethod(String confirmationMethod) {
		this.confirmationMethod = confirmationMethod;
	}
	public String getCrypto() {
		return crypto;
	}
	public void setCrypto(String crypto) {
		this.crypto = crypto;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectQualifier() {
		return subjectQualifier;
	}
	public void setSubjectQualifier(String subjectQualifier) {
		this.subjectQualifier = subjectQualifier;
	}
	public String getDigestAlgorithm() {
		return digestAlgorithm;
	}
	public void setDigestAlgorithm(String digestAlgorithm) {
		this.digestAlgorithm = digestAlgorithm;
	}
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}
	public void setSignatureAlgorithm(String signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public List<StringToStringMap> getAttributeValues() {
		return attributeValues;
	}
	public void setAttributeValues(List<StringToStringMap> attributeValues) {
		this.attributeValues = attributeValues;
	}
	
	
	
	
}
