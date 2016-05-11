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
	private String userLastName;
	
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public Timestamp getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(Timestamp userDOB) {
		this.userDOB = userDOB;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserProfilePhoto() {
		return userProfilePhoto;
	}

	public void setUserProfilePhoto(String userProfilePhoto) {
		this.userProfilePhoto = userProfilePhoto;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserLoginMode() {
		return userLoginMode;
	}

	public void setUserLoginMode(int userLoginMode) {
		this.userLoginMode = userLoginMode;
	}

	public int getAddressId() {
		return AddressId;
	}

	public void setAddressId(int addressId) {
		AddressId = addressId;
	}

	public int getUserAuthorization() {
		return userAuthorization;
	}

	public void setUserAuthorization(int userAuthorization) {
		this.userAuthorization = userAuthorization;
	}

	public Timestamp getUserCreatedDatetime() {
		return userCreatedDatetime;
	}

	public void setUserCreatedDatetime(Timestamp userCreatedDatetime) {
		this.userCreatedDatetime = userCreatedDatetime;
	}

	public Timestamp getUserLastUpdateDatetime() {
		return userLastUpdateDatetime;
	}

	public void setUserLastUpdateDatetime(Timestamp userLastUpdateDatetime) {
		this.userLastUpdateDatetime = userLastUpdateDatetime;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AddressId;
		result = prime * result + deviceId;
		result = prime * result + userAuthorization;
		result = prime * result + ((userCreatedDatetime == null) ? 0 : userCreatedDatetime.hashCode());
		result = prime * result + ((userDOB == null) ? 0 : userDOB.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result + ((userGender == null) ? 0 : userGender.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userLastName == null) ? 0 : userLastName.hashCode());
		result = prime * result + ((userLastUpdateDatetime == null) ? 0 : userLastUpdateDatetime.hashCode());
		result = prime * result + userLoginMode;
		result = prime * result + ((userMobile == null) ? 0 : userMobile.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		result = prime * result + ((userProfilePhoto == null) ? 0 : userProfilePhoto.hashCode());
		result = prime * result + userStatus;
		return result;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userDOB=" + userDOB + ", userGender=" + userGender + ", userPhone=" + userPhone + ", userMobile="
				+ userMobile + ", userProfilePhoto=" + userProfilePhoto + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userLoginMode=" + userLoginMode + ", AddressId=" + AddressId
				+ ", userAuthorization=" + userAuthorization + ", userCreatedDatetime=" + userCreatedDatetime
				+ ", userLastUpdateDatetime=" + userLastUpdateDatetime + ", deviceId=" + deviceId + ", userStatus="
				+ userStatus + "]";
	}

	
}