package com.woopt.api.entity;

import java.security.Timestamp;

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
public class User {

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
	private int userCreatedDatetime;
	
	@Column(name = "USER_LAST_UPDATE_DATETIME")
	private int userLastUpdateDatetime;
	
	@Column(name = "DEVICE_ID")
	private int deviceId;

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
	public int getUserCreatedDatetime() {
		return userCreatedDatetime;
	}

	/**
	 * @param userCreatedDatetime the userCreatedDatetime to set
	 */
	public void setUserCreatedDatetime(int userCreatedDatetime) {
		this.userCreatedDatetime = userCreatedDatetime;
	}

	/**
	 * @return the userLastUpdateDatetime
	 */
	public int getUserLastUpdateDatetime() {
		return userLastUpdateDatetime;
	}

	/**
	 * @param userLastUpdateDatetime the userLastUpdateDatetime to set
	 */
	public void setUserLastUpdateDatetime(int userLastUpdateDatetime) {
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastname=" + userLastname
				+ ", userDOB=" + userDOB + ", userGender=" + userGender + ", userPhone=" + userPhone + ", userMobile="
				+ userMobile + ", userProfilePhoto=" + userProfilePhoto + ", userEmail=" + userEmail
				+ ", userLoginMode=" + userLoginMode + ", AddressId=" + AddressId + ", userAuthorization="
				+ userAuthorization + ", userCreatedDatetime=" + userCreatedDatetime + ", userLastUpdateDatetime="
				+ userLastUpdateDatetime + ", deviceId=" + deviceId + ", getUserId()=" + getUserId()
				+ ", getUserFirstName()=" + getUserFirstName() + ", getUserLastname()=" + getUserLastname()
				+ ", getUserDOB()=" + getUserDOB() + ", getUserGender()=" + getUserGender() + ", getUserPhone()="
				+ getUserPhone() + ", getUserMobile()=" + getUserMobile() + ", getUserProfilePhoto()="
				+ getUserProfilePhoto() + ", getUserEmail()=" + getUserEmail() + ", getUserPassword()="
				+ getUserPassword() + ", getUserLoginMode()=" + getUserLoginMode() + ", getAddressId()="
				+ getAddressId() + ", getUserAuthorization()=" + getUserAuthorization() + ", getUserCreatedDatetime()="
				+ getUserCreatedDatetime() + ", getUserLastUpdateDatetime()=" + getUserLastUpdateDatetime()
				+ ", getDeviceId()=" + getDeviceId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AddressId;
		result = prime * result + deviceId;
		result = prime * result + userAuthorization;
		result = prime * result + userCreatedDatetime;
		result = prime * result + ((userDOB == null) ? 0 : userDOB.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result + ((userGender == null) ? 0 : userGender.hashCode());
		result = prime * result + userId;
		result = prime * result + userLastUpdateDatetime;
		result = prime * result + ((userLastname == null) ? 0 : userLastname.hashCode());
		result = prime * result + userLoginMode;
		result = prime * result + ((userMobile == null) ? 0 : userMobile.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		result = prime * result + ((userProfilePhoto == null) ? 0 : userProfilePhoto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		if (AddressId != other.AddressId) {
			return false;
		}
		if (deviceId != other.deviceId) {
			return false;
		}
		if (userAuthorization != other.userAuthorization) {
			return false;
		}
		if (userCreatedDatetime != other.userCreatedDatetime) {
			return false;
		}
		if (userDOB == null) {
			if (other.userDOB != null) {
				return false;
			}
		} else if (!userDOB.equals(other.userDOB)) {
			return false;
		}
		if (userEmail == null) {
			if (other.userEmail != null) {
				return false;
			}
		} else if (!userEmail.equals(other.userEmail)) {
			return false;
		}
		if (userFirstName == null) {
			if (other.userFirstName != null) {
				return false;
			}
		} else if (!userFirstName.equals(other.userFirstName)) {
			return false;
		}
		if (userGender == null) {
			if (other.userGender != null) {
				return false;
			}
		} else if (!userGender.equals(other.userGender)) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		if (userLastUpdateDatetime != other.userLastUpdateDatetime) {
			return false;
		}
		if (userLastname == null) {
			if (other.userLastname != null) {
				return false;
			}
		} else if (!userLastname.equals(other.userLastname)) {
			return false;
		}
		if (userLoginMode != other.userLoginMode) {
			return false;
		}
		if (userMobile == null) {
			if (other.userMobile != null) {
				return false;
			}
		} else if (!userMobile.equals(other.userMobile)) {
			return false;
		}
		if (userPassword == null) {
			if (other.userPassword != null) {
				return false;
			}
		} else if (!userPassword.equals(other.userPassword)) {
			return false;
		}
		if (userPhone == null) {
			if (other.userPhone != null) {
				return false;
			}
		} else if (!userPhone.equals(other.userPhone)) {
			return false;
		}
		if (userProfilePhoto == null) {
			if (other.userProfilePhoto != null) {
				return false;
			}
		} else if (!userProfilePhoto.equals(other.userProfilePhoto)) {
			return false;
		}
		return true;
	}
}