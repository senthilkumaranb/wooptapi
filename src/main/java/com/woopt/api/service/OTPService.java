package com.woopt.api.service;

import java.util.Random;

public class OTPService {
	
	public static long generateNewOTP() {
		Random r = new Random( System.currentTimeMillis() );
		 return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
}