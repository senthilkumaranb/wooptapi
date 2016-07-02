package com.woopt.api.model;

public class FamilyMember {
	
	private String userFirstname;
	private String userLastname;
	private String userMobile;
	private int familyMemberStatus;

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

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public int getFamilyMemberStatus() {
		return familyMemberStatus;
	}

	public void setFamilyMemberStatus(int familyMemberStatus) {
		this.familyMemberStatus = familyMemberStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + familyMemberStatus;
		result = prime * result + ((userFirstname == null) ? 0 : userFirstname.hashCode());
		result = prime * result + ((userLastname == null) ? 0 : userLastname.hashCode());
		result = prime * result + ((userMobile == null) ? 0 : userMobile.hashCode());
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
		FamilyMember other = (FamilyMember) obj;
		if (familyMemberStatus != other.familyMemberStatus)
			return false;
		if (userFirstname == null) {
			if (other.userFirstname != null)
				return false;
		} else if (!userFirstname.equals(other.userFirstname))
			return false;
		if (userLastname == null) {
			if (other.userLastname != null)
				return false;
		} else if (!userLastname.equals(other.userLastname))
			return false;
		if (userMobile == null) {
			if (other.userMobile != null)
				return false;
		} else if (!userMobile.equals(other.userMobile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FamilyMember [userFirstname=" + userFirstname + ", userLastname=" + userLastname + ", userMobile="
				+ userMobile + ", familyMemberStatus=" + familyMemberStatus + "]";
	}
}