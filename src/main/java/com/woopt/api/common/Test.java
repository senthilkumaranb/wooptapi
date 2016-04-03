package com.woopt.api.common;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test {
	
	public static void main(String[] args) {
		//SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy HH:mm:SSS");
		//java.util.Date date = new java.util.Date();
		//String strDate = formater.format(date);
		//System.out.println(strDate);
		
		final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:SS");
	    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	    final String utcTime = sdf.format(new Date());
	    System.out.println(utcTime);

		//Timestamp currentTimestamp = new Timestamp(new java.util.Date(utcTime).getTime());
		//System.out.println(currentTimestamp);
	}
}
