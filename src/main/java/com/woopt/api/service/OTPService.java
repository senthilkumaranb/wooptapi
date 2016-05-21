package com.woopt.api.service;

import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;

import com.woopt.api.common.WooptCode;
import com.woopt.api.model.UserModel;

public class OTPService {
	
	private static final Logger LOGGER = Logger.getLogger(OTPService.class.getName());
	
	public static int generateOpt() {
		Random r = new Random( System.currentTimeMillis() );
		 return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
	
	public static boolean sendOTP(int newOTP, String mobileNumber) {
		boolean result = false;
		try {
			LOGGER.info("Sending OPT to Mobile Number " + mobileNumber);
			//Call SMS service to send OTP
			LOGGER.info("Sending OPT to Mobile Number " + mobileNumber + " success.");
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Sending OPT to Mobile Number " + mobileNumber + " failed.");
		}
		return result;
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(OTPService.generateOpt());
		}
	}
}