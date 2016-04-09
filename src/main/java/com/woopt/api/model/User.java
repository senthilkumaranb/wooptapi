package com.woopt.api.model;

public class User {
	
	private int userId;
	
	private String userFirstname;
	
	private String userLastname;
	
	private String userDOB;
	
	private String userGender;
	
	private String userPhone;
	
	private String userMobile;
	
	private String userProfilePhoto;
	
	private String userEmail;
	
	private int userLoginMode;

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstname() {
		return userFirstname;
	}

	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}

	public String getUserLastname() {
		return userLastname;
	}

	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	public String getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(String userDOB) {
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

	public int getUserLoginMode() {
		return userLoginMode;
	}

	public void setUserLoginMode(int userLoginMode) {
		this.userLoginMode = userLoginMode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userDOB == null) ? 0 : userDOB.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userFirstname == null) ? 0 : userFirstname.hashCode());
		result = prime * result + ((userGender == null) ? 0 : userGender.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userLastname == null) ? 0 : userLastname.hashCode());
		result = prime * result + userLoginMode;
		result = prime * result + ((userMobile == null) ? 0 : userMobile.hashCode());
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		result = prime * result + ((userProfilePhoto == null) ? 0 : userProfilePhoto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userDOB == null) {
			if (other.userDOB != null)
				return false;
		} else if (!userDOB.equals(other.userDOB))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userFirstname == null) {
			if (other.userFirstname != null)
				return false;
		} else if (!userFirstname.equals(other.userFirstname))
			return false;
		if (userGender == null) {
			if (other.userGender != null)
				return false;
		} else if (!userGender.equals(other.userGender))
			return false;
		if (userId != other.userId)
			return false;
		if (userLastname == null) {
			if (other.userLastname != null)
				return false;
		} else if (!userLastname.equals(other.userLastname))
			return false;
		if (userLoginMode != other.userLoginMode)
			return false;
		if (userMobile == null) {
			if (other.userMobile != null)
				return false;
		} else if (!userMobile.equals(other.userMobile))
			return false;
		if (userPhone == null) {
			if (other.userPhone != null)
				return false;
		} else if (!userPhone.equals(other.userPhone))
			return false;
		if (userProfilePhoto == null) {
			if (other.userProfilePhoto != null)
				return false;
		} else if (!userProfilePhoto.equals(other.userProfilePhoto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstname=" + userFirstname + ", userLastname=" + userLastname
				+ ", userDOB=" + userDOB + ", userGender=" + userGender + ", userPhone=" + userPhone + ", userMobile="
				+ userMobile + ", userProfilePhoto=" + userProfilePhoto + ", userEmail=" + userEmail
				+ ", userLoginMode=" + userLoginMode + "]";
	}
}