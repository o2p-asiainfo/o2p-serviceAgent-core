package com.ailk.eaap.op2.serviceagent.saml;

import java.io.File;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.components.crypto.CryptoType;
import org.apache.ws.security.components.crypto.Merlin;
import org.apache.ws.security.util.Loader;

import com.ailk.eaap.op2.serviceagent.common.AuthSSLInitializationError;

public class KeyStoreUtil extends Merlin{

	private PrivateKey privateKey;
	private X509Certificate x509Certificate;
	
	
	private static String fileExtensionToKeystoreType(String fileExtension) {
	    if (fileExtension.equals("pk12"))
	      return "pkcs12";
	    if (fileExtension.equals("jck")) {
	      return "jceks";
	    }
	    return KeyStore.getDefaultType();
	}
	
	

	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(PrivateKey privateKey) {
		this.privateKey = privateKey;
	}

	public X509Certificate getX509Certificate() {
		return x509Certificate;
	}

	public void setX509Certificate(X509Certificate x509Certificate) {
		this.x509Certificate = x509Certificate;
	}

	@Override
	public PrivateKey getPrivateKey(String arg0, String arg1)
			throws WSSecurityException {
		// TODO Auto-generated method stub
		return this.getPrivateKey();
	}

	public static String getFileExtension(String fullName){
		String fileName = new File(fullName).getName();
		int dotIndex = fileName.lastIndexOf(46);
		return dotIndex == -1 ? "" : fileName.substring(dotIndex + 1);
	}
	

	
	@Override
	public X509Certificate[] getX509Certificates(CryptoType cryptoType)
			throws WSSecurityException {
		// TODO Auto-generated method stub
		return new X509Certificate[]{x509Certificate};
	}
	
	public static KeyStore loadKeyStore(String fileName,String sotrePassword) throws Exception {
		
		
			
		 String crypotFilePath = fileName;
	     String fileExtension = getFileExtension(crypotFilePath);
	     String keystoreType = fileExtensionToKeystoreType(fileExtension);

	     ClassLoader loader = Loader.getClassLoader(KeyStoreUtil.class);
	     InputStream input = Merlin.loadInputStream(loader, crypotFilePath);
	     KeyStore keyStore = KeyStore.getInstance(keystoreType);
	     char[] passwordArray = null;

	     if (sotrePassword!=null) {
	    	 passwordArray = sotrePassword.toCharArray();
	     }
	     keyStore.load(input, passwordArray);
	     return keyStore;
		
		
	}
	
	public  void loadKeyAndCertificate(String fileName,String sotrePassword,String alias,String password) throws Exception {
		try{
			KeyStore keyStore = loadKeyStore(fileName, sotrePassword);
			privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
			x509Certificate = (X509Certificate) keyStore.getCertificate(alias);
		}catch(Exception e ){
			throw new AuthSSLInitializationError("Load Keystore "+ fileName + ",exception: " + e.getMessage());
		}
		
	}
	
	
	
}
