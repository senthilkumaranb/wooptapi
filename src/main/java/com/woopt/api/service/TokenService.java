package com.woopt.api.service;

import org.springframework.http.HttpHeaders;

import com.woopt.api.common.DateUtility;

public class TokenService {

	public static String generateNewToken(String userId, String deviceId) throws Exception {
		StringBuilder token = new StringBuilder();
		token.append(userId+","+deviceId+","+DateUtility.getUTCDate());
		return EncryptionService.encrypt(token.toString());
	}
	
	public static boolean isValidToken(HttpHeaders header) {
		boolean result = false;
		try {
			String encryptedToken = null;
			String plainToken = EncryptionService.decrypt(encryptedToken);
			System.out.println("plainToken:" + plainToken);
			//TODO write login to validate Token
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static long getUserId(String token) {
		return 1001;
	}
	
	public static String getDeviceId(String token) {
		return "device1001";
	}
	
	public static void main(String[] args)  throws Exception {
		String encryptedToken = generateNewToken("1001", "device1001");
		System.out.println("encryptedToken:" + encryptedToken);
		//TokenService.isValidToken(encryptedToken);
	}
}