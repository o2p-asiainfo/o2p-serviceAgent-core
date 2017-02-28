package com.ailk.eaap.op2.serviceagent.common;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class Cryptogram {

	private static final String Algorithm = "DESede";
	private static Log log = LogFactory.getLog(Cryptogram.class);

	private Cryptogram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static byte[] encryptMode(byte[] keybyte, byte[] src) {
		try {
			
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			log.error(e1.getStackTrace());
		} catch (javax.crypto.NoSuchPaddingException e2) {
			log.error(e2.getStackTrace());
		} catch (java.lang.Exception e3) {
			log.error(e3.getStackTrace());
		}
		return null;
	}

	public static byte[] decryptMode(byte[] keybyte, byte[] src) {
		try {
			
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.DECRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			log.error(e1.getStackTrace());
		} catch (javax.crypto.NoSuchPaddingException e2) {
			log.error(e2.getStackTrace());
		} catch (java.lang.Exception e3) {
			log.error(e3.getStackTrace());
		}
		return null;
	}
}
