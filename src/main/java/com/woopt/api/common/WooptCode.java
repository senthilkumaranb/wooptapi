package com.woopt.api.common;

/**
 * Woopt Constant Code
 * @author Sushil
 * 
 */
public class WooptCode {
	
	/** Global Status Code **/
	public static final int SUCCESS = 0;
	public static final int FAIL = -1;
	public static final int SYSTEM_ERROR = 9;
	public static final int INVALID_INPUT = 10;
	
	/** User Status Code **/
	public static final int INVALID_USERMODEL = 100;
	public static final int INVALID_FIRSTNAME = 101;
	public static final int INVALID_LASTNAME = 102;
	public static final int INVALID_MOBILENUMBER = 103;
	public static final int MOBILE_NUMBER_ALREADY_EXIST = 104;
	public static final int USER_STATUS_ACTIVE = 105;
	public static final int USER_STATUS_INACTIVE = 106;
	public static final int USER_STATUS_ALREADY_ACTIVE = 107;
	public static final int USER_STATUS_DELETED = 108;
	public static final int USER_STATUS_DOES_NOT_EXIST = 109;
	
	/** Device Status Code **/
	public static final int DEVICE_STATUS_ACTIVE = 200;
	public static final int DEVICE_STATUS_INACTIVE = 201;
	public static final int DEVICE_INVALID_IMEI = 202;
	public static final int DEVICE_INVALID_DEVICESERIALNO = 203;
	
	/** OTP Status Code **/
	public static final int OPT_NOT_YET_VALIDATED = 300;
	public static final int OPT_VALIDATED = 301;
	public static final int OPT_VALIDAT_FAILED = 302;
	
	/** TOKEN Status Code **/
	public static final int TOKEN_TYPE_ADMIN = 600;
	public static final int TOKEN_TYPE_SHOPKEEPER = 601;
	public static final int TOKEN_TYPE_SHOP_EMPLOYEE = 602;
	public static final int TOKEN_TYPE_USER = 603;
	public static final int TOKEN_INVALID = 604;
	public static final int TOKEN_VALID = 605;
	
	/** User CheckIn Code **/
	public static final int USER_CHECKIN_STATUS_ACTIVE = 1;
	public static final int USER_CHECKIN_STATUS_INACTIVE = 0;
	
	/** Offer **/
	public static final String OFFER_METHOD_GENERIC = "GENERIC";
	public static final String OFFER_METHOD_USER_SPECIFIC = "USER SPECIFIC";
	
	/** Cart Status **/
	public static final int CART_STATUS_ACTIVE = 1;
	public static final int CART_STATUS_INACTIVE = 0;
	
	/** Cart Item Status **/
	public static final int CARTITEM_STATUS_ACTIVE = 1;
	public static final int CARTITEM_STATUS_INACTIVE = 0;

	private WooptCode(){
	}
}