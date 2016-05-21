package com.woopt.api.common;

public class WooptCode {
	
	/** Global Status Code **/
	public static final int SUCCESS = 0;
	public static final int FAIL = -1;
	public static final int SYSTEM_ERROR = 9;
	
	/** User Status Code **/
	public static final int INVALID_USERMODEL = 100;
	public static final int INVALID_FIRSTNAME = 101;
	public static final int INVALID_LASTNAME = 102;
	public static final int INVALID_MOBILENUMBER = 103;
	public static final int MOBILE_NUMBER_ALREADY_EXIST = 104;
	public static final int USER_DELETED = 105;
	public static final int USER_DOES_NOT_EXIST = 106;
	public static final int USER_ACTIVE = 107;
	public static final int USER_INACTIVE = 108;
	public static final int USER_ALREADY_ACTIVE = 109;
	
	/** Device Status Code **/
	public static final int DEVICE_STATUS_ACTIVE = 200;
	public static final int DEVICE_STATUS_INACTIVE = 201;
	public static final int DEVICE_INVALID_IMEI = 202;
	public static final int DEVICE_INVALID_DEVICESERIALNO = 203;
	
	/** OTP Status Code **/
	public static final int OPT_NOT_YET_VALIDATED = 10;
	public static final int OPT_VALIDATED = 11;
	
	/** TOKEN Status Code **/
	public static final int TOKEN_TYPE_ADMIN = 600;
	public static final int TOKEN_TYPE_SHOPKEEPER = 601;
	public static final int TOKEN_TYPE_SHOP_EMPLOYEE = 602;
	public static final int TOKEN_TYPE_USER = 603;
	public static final int TOKEN_INVALID = 604;
	public static final int TOKEN_VALID = 605;

	private WooptCode(){
	}
}