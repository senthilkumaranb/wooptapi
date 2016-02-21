package com.woopt.api.model;

public class FamilyMember {
	
	private String user_firstname;
	
	private String user_lastname;
	
	private String user_mobile;
	
	private int family_member_status;

	/**
	 * @return the user_firstname
	 */
	public String getUser_firstname() {
		return user_firstname;
	}

	/**
	 * @param user_firstname the user_firstname to set
	 */
	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	/**
	 * @return the user_lastname
	 */
	public String getUser_lastname() {
		return user_lastname;
	}

	/**
	 * @param user_lastname the user_lastname to set
	 */
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	/**
	 * @return the user_mobile
	 */
	public String getUser_mobile() {
		return user_mobile;
	}

	/**
	 * @param user_mobile the user_mobile to set
	 */
	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}

	/**
	 * @return the family_member_status
	 */
	public int getFamily_member_status() {
		return family_member_status;
	}

	/**
	 * @param family_member_status the family_member_status to set
	 */
	public void setFamily_member_status(int family_member_status) {
		this.family_member_status = family_member_status;
	}

	@Override
	public String toString() {
		return "FamilyMember [user_firstname=" + user_firstname + ", user_lastname=" + user_lastname + ", user_mobile="
				+ user_mobile + ", family_member_status=" + family_member_status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + family_member_status;
		result = prime * result + ((user_firstname == null) ? 0 : user_firstname.hashCode());
		result = prime * result + ((user_lastname == null) ? 0 : user_lastname.hashCode());
		result = prime * result + ((user_mobile == null) ? 0 : user_mobile.hashCode());
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
		if (!(obj instanceof FamilyMember)) {
			return false;
		}
		FamilyMember other = (FamilyMember) obj;
		if (family_member_status != other.family_member_status) {
			return false;
		}
		if (user_firstname == null) {
			if (other.user_firstname != null) {
				return false;
			}
		} else if (!user_firstname.equals(other.user_firstname)) {
			return false;
		}
		if (user_lastname == null) {
			if (other.user_lastname != null) {
				return false;
			}
		} else if (!user_lastname.equals(other.user_lastname)) {
			return false;
		}
		if (user_mobile == null) {
			if (other.user_mobile != null) {
				return false;
			}
		} else if (!user_mobile.equals(other.user_mobile)) {
			return false;
		}
		return true;
	}
}
