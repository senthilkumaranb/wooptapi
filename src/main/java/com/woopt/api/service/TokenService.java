package com.woopt.api.service;

import org.apache.log4j.Logger;

import com.woopt.api.common.DateUtility;

public class TokenService {

	private static final Logger LOGGER = Logger.getLogger(TokenService.class.getName());
	
	public static String generateNewToken(String userId, String deviceId) throws Exception {
		StringBuilder token = new StringBuilder();
		token.append(userId+","+deviceId+","+DateUtility.getUTCDate());
		return EncryptionService.encrypt(token.toString());
	}
	
	public static boolean isValidToken(String encryptedToken) {
		boolean result = false;
		try {
			String plainToken = EncryptionService.decrypt(encryptedToken);
			LOGGER.info("Inside isValidToken - plainToken is:" + plainToken);
			//TODO write login to validate Token
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static long getUserId(String encryptedToken) {
		long userId = 0;
		try {
			String plainToken = EncryptionService.decrypt(encryptedToken);
			String[] tokenArray = plainToken.split(",");
			userId = Long.parseLong(tokenArray[0]);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userId;
	}
	
	public static long getDeviceId(String encryptedToken) {
		long deviceId = 0;
		try {
			String plainToken = EncryptionService.decrypt(encryptedToken);
			String[] tokenArray = plainToken.split(",");
			deviceId = Long.parseLong(tokenArray[1]);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deviceId;
	}
	
	public static void main(String[] args)  throws Exception {
		String encryptedToken = generateNewToken("32", "19");
		System.out.println("encryptedToken:" + encryptedToken);
		boolean result = TokenService.isValidToken(encryptedToken);
		System.out.println("Is token valid :" + result);
	}
}