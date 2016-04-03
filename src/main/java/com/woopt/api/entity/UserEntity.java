package com.woopt.api.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
@Entity
@Table(name="WOOPT_USER")
public class UserEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "USER_FIRSTNAME")
	private String userFirstName;
	
	@Column(name = "USER_LASTNAME")
	private String userLastname;
	
	@Column(name = "USER_DOB")
	private Timestamp userDOB;
	
	@Column(name = "USER_GENDER")
	private String userGender;
	
	@Column(name = "USER_PHONE")
	private String userPhone;
	
	@Column(name = "USER_MOBILE")
	private String userMobile;
	
	@Column(name = "USER_PROFILE_PHOTO")
	private String userProfilePhoto;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;
	
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	
	@Column(name = "USER_LOGIN_MODE")
	private int userLoginMode;

	@Column(name = "ADDRESS_ID")
	private int AddressId;
	
	@Column(name = "USER_AUTHORIZATION")
	private int userAuthorization;
	
	@Column(name = "USER_CREATED_DATETIME")
	private Timestamp userCreatedDatetime;
	
	@Column(name = "USER_LAST_UPDATE_DATETIME")
	private Timestamp userLastUpdateDatetime;
	
	@Column(name = "DEVICE_ID")
	private int deviceId;
	
	@Column(name = "USER_STATUS")
	private int userStatus;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userFirstName
	 */
	public String getUserFirstName() {
		return userFirstName;
	}

	/**
	 * @param userFirstName the userFirstName to set
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * @return the userLastname
	 */
	public String getUserLastname() {
		return userLastname;
	}

	/**
	 * @param userLastname the userLastname to set
	 */
	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	/**
	 * @return the userDOB
	 */
	public Timestamp getUserDOB() {
		return userDOB;
	}

	/**
	 * @param userDOB the userDOB to set
	 */
	public void setUserDOB(Timestamp userDOB) {
		this.userDOB = userDOB;
	}

	/**
	 * @return the userGender
	 */
	public String getUserGender() {
		return userGender;
	}

	/**
	 * @param userGender the userGender to set
	 */
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	/**
	 * @return the userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone the userPhone to set
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the userMobile
	 */
	public String getUserMobile() {
		return userMobile;
	}

	/**
	 * @param userMobile the userMobile to set
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	/**
	 * @return the userProfilePhoto
	 */
	public String getUserProfilePhoto() {
		return userProfilePhoto;
	}

	/**
	 * @param userProfilePhoto the userProfilePhoto to set
	 */
	public void setUserProfilePhoto(String userProfilePhoto) {
		this.userProfilePhoto = userProfilePhoto;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the userLoginMode
	 */
	public int getUserLoginMode() {
		return userLoginMode;
	}

	/**
	 * @param userLoginMode the userLoginMode to set
	 */
	public void setUserLoginMode(int userLoginMode) {
		this.userLoginMode = userLoginMode;
	}

	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return AddressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}

	/**
	 * @return the userAuthorization
	 */
	public int getUserAuthorization() {
		return userAuthorization;
	}

	/**
	 * @param userAuthorization the userAuthorization to set
	 */
	public void setUserAuthorization(int userAuthorization) {
		this.userAuthorization = userAuthorization;
	}

	/**
	 * @return the userCreatedDatetime
	 */
	public Timestamp getUserCreatedDatetime() {
		return userCreatedDatetime;
	}

	/**
	 * @param userCreatedDatetime the userCreatedDatetime to set
	 */
	public void setUserCreatedDatetime(Timestamp userCreatedDatetime) {
		this.userCreatedDatetime = userCreatedDatetime;
	}

	/**
	 * @return the userLastUpdateDatetime
	 */
	public Timestamp getUserLastUpdateDatetime() {
		return userLastUpdateDatetime;
	}

	/**
	 * @param userLastUpdateDatetime the userLastUpdateDatetime to set
	 */
	public void setUserLastUpdateDatetime(Timestamp userLastUpdateDatetime) {
		this.userLastUpdateDatetime = userLastUpdateDatetime;
	}

	/**
	 * @return the deviceId
	 */
	public int getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the userStatus
	 */
	public int getUserStatus() {
		return userStatus;
	}

	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
}