package com.woopt.api.service;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class EncryptionService {
	
	private static final String ALGORITHM = "AES";
	private static final String KEY = "1Wbfg647arfDEJ79";

	public static String encrypt(String plainText) throws Exception {
		Key key = generateKey();
		Cipher cipher = Cipher.getInstance(EncryptionService.ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedByteValue = cipher.doFinal(plainText.getBytes("utf-8"));
		String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
		return encryptedValue64;
	}

	public static String decrypt(String encryptedText) throws Exception {
		Key key = generateKey();
		Cipher cipher = Cipher.getInstance(EncryptionService.ALGORITHM);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decryptedValue64 = new BASE64Decoder().decodeBuffer(encryptedText);
		byte[] decryptedByteValue = cipher.doFinal(decryptedValue64);
		String decryptedValue = new String(decryptedByteValue, "utf-8");
		return decryptedValue;
	}

	private static Key generateKey() throws Exception {
		Key key = new SecretKeySpec(EncryptionService.KEY.getBytes(), EncryptionService.ALGORITHM);
		return key;
	}
}