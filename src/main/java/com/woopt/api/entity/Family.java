package com.woopt.api.entity;

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
@Table(name = "WOOPT_FAMILY")
public class Family {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "FAMILY_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int familyId;
	
	@Column(name = "FAMILY_HEAD_ID")
	private int familyHeadId;
	
	@Column(name = "FAMILY_MEMBER_ID")
	private int familyMemberId;
	
	@Column(name = "FAMILY_MEMBER_STATUS")
	private int familyMemberStatus;

	/**
	 * @return the familyId
	 */
	public int getFamilyId() {
		return familyId;
	}

	/**
	 * @param familyId the familyId to set
	 */
	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	/**
	 * @return the familyHeadId
	 */
	public int getFamilyHeadId() {
		return familyHeadId;
	}

	/**
	 * @param familyHeadId the familyHeadId to set
	 */
	public void setFamilyHeadId(int familyHeadId) {
		this.familyHeadId = familyHeadId;
	}

	/**
	 * @return the familyMemberId
	 */
	public int getFamilyMemberId() {
		return familyMemberId;
	}

	/**
	 * @param familyMemberId the familyMemberId to set
	 */
	public void setFamilyMemberId(int familyMemberId) {
		this.familyMemberId = familyMemberId;
	}

	/**
	 * @return the familyMemberStatus
	 */
	public int getFamilyMemberStatus() {
		return familyMemberStatus;
	}

	/**
	 * @param familyMemberStatus the familyMemberStatus to set
	 */
	public void setFamilyMemberStatus(int familyMemberStatus) {
		this.familyMemberStatus = familyMemberStatus;
	}

	@Override
	public String toString() {
		return "Family [familyId=" + familyId + ", familyHeadId=" + familyHeadId + ", familyMemberId=" + familyMemberId
				+ ", familyMemberStatus=" + familyMemberStatus + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + familyHeadId;
		result = prime * result + familyId;
		result = prime * result + familyMemberId;
		result = prime * result + familyMemberStatus;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Family)) {
			return false;
		}
		Family other = (Family) obj;
		if (familyHeadId != other.familyHeadId) {
			return false;
		}
		if (familyId != other.familyId) {
			return false;
		}
		if (familyMemberId != other.familyMemberId) {
			return false;
		}
		if (familyMemberStatus != other.familyMemberStatus) {
			return false;
		}
		return true;
	}
}