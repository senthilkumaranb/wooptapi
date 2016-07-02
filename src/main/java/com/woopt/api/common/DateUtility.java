package com.woopt.api.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtility {

	private static final String DATE_FORMATE_STRING = "dd-MM-yyyy HH:mm:ss.SSS";

	public static String getUTCDate() throws ParseException {
		Date currentTime = new Date();
		System.out.println("1*****Current India Time : " + currentTime);
		DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_FORMATE_STRING);
		DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
		String utcTime = DATE_FORMAT.format(currentTime);
		return utcTime;
	}

	public static String getLocalDate(String timeZone, String date) {
		DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_FORMATE_STRING);
		DATE_FORMAT.setTimeZone(TimeZone.getTimeZone(timeZone));
		return DATE_FORMAT.format(date);
	}
	
	public static Date stringToDate(String strdate) {
		Date date = null;
		try {
			DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_FORMATE_STRING);
			if (null != strdate && strdate.length() != 0) {
				date = DATE_FORMAT.parse(strdate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String dateToString(Date date) {
		String strDate = null;
		try {
			
			DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_FORMATE_STRING);
			if (null != date) {
				strDate = DATE_FORMAT.format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strDate;
	}

	public static void main(String[] args) {
		String utcDateStr = null;
		
		try {
			utcDateStr = DateUtility.getUTCDate();
			System.out.println("2*****Current UTC Time : " + utcDateStr);
			//DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_FORMATE_STRING);
			String localDateStr = getLocalDate("UTC+05:30", utcDateStr);
			System.out.println("3*****Current India Time : " + localDateStr);
			
			/*Calendar now = Calendar.getInstance();
			TimeZone timeZone = now.getTimeZone();
			System.out.println(timeZone.getID());
			System.out.println(timeZone.getDSTSavings());*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}