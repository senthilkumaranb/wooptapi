package com.woopt.api.model;

public class User {
	
	private String userFirstname;
	
	private String userLastname;
	
	private String userDOB;
	
	private String userGender;
	
	private String userPhone;
	
	private String userMobile;
	
	private String userProfilePhoto;
	
	private String userEmail;

	/**
	 * @return the userFirstname
	 */
	public String getUserFirstname() {
		return userFirstname;
	}

	/**
	 * @param userFirstname the userFirstname to set
	 */
	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
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
	public String getUserDOB() {
		return userDOB;
	}

	/**
	 * @param userDOB the userDOB to set
	 */
	public void setUserDOB(String userDOB) {
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

	@Override
	public String toString() {
		return "User [userFirstname=" + userFirstname + ", userLastname=" + userLastname + ", userDOB=" + userDOB
				+ ", userGender=" + userGender + ", userPhone=" + userPhone + ", userMobile=" + userMobile
				+ ", userProfilePhoto=" + userProfilePhoto + ", userEmail=" + userEmail + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userDOB == null) ? 0 : userDOB.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userFirstname == null) ? 0 : userFirstname.hashCode());
		result = prime * result + ((userGender == null) ? 0 : userGender.hashCode());
		result = prime * result + ((userLastname == null) ? 0 : userLastname.hashCode());
		result = prime * result + ((userMobile == null) ? 0 : userMobile.hashCode());
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
		if (userFirstname == null) {
			if (other.userFirstname != null) {
				return false;
			}
		} else if (!userFirstname.equals(other.userFirstname)) {
			return false;
		}
		if (userGender == null) {
			if (other.userGender != null) {
				return false;
			}
		} else if (!userGender.equals(other.userGender)) {
			return false;
		}
		if (userLastname == null) {
			if (other.userLastname != null) {
				return false;
			}
		} else if (!userLastname.equals(other.userLastname)) {
			return false;
		}
		if (userMobile == null) {
			if (other.userMobile != null) {
				return false;
			}
		} else if (!userMobile.equals(other.userMobile)) {
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