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
 * @author Senthil
 *
 */
@Entity
@Table(name = "WOOPT_OFFER_USER_PUBLISH_SHARED")
public class OfferUserPublishSharedEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OFFER_USER_PUBLISH_SHARED_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int offerUserPublishSharedId;
	
	@Column(name = "OFFER_USER_PUBLISH_ID")
	private int offerUserPublishId;
	
	@Column(name = "OFFER_USER_PUBLISH_SHARED_USER")
	private int offerUserPublishSharedUser;
	
	@Column(name = "OFFER_USER_PUBLISH_SHARED_STATUS")
	private int offerUserPublishSharedStatus;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getOfferUserPublishSharedId() {
		return offerUserPublishSharedId;
	}

	public void setOfferUserPublishSharedId(int offerUserPublishSharedId) {
		this.offerUserPublishSharedId = offerUserPublishSharedId;
	}

	public int getOfferUserPublishId() {
		return offerUserPublishId;
	}

	public void setOfferUserPublishId(int offerUserPublishId) {
		this.offerUserPublishId = offerUserPublishId;
	}

	public int getOfferUserPublishSharedUser() {
		return offerUserPublishSharedUser;
	}

	public void setOfferUserPublishSharedUser(int offerUserPublishSharedUser) {
		this.offerUserPublishSharedUser = offerUserPublishSharedUser;
	}

	public int getOfferUserPublishSharedStatus() {
		return offerUserPublishSharedStatus;
	}

	public void setOfferUserPublishSharedStatus(int offerUserPublishSharedStatus) {
		this.offerUserPublishSharedStatus = offerUserPublishSharedStatus;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "OfferUserPublishSharedEntity [offerUserPublishSharedId=" + offerUserPublishSharedId
				+ ", offerUserPublishId=" + offerUserPublishId + ", offerUserPublishSharedUser="
				+ offerUserPublishSharedUser + ", offerUserPublishSharedStatus=" + offerUserPublishSharedStatus
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + offerUserPublishId;
		result = prime * result + offerUserPublishSharedId;
		result = prime * result + offerUserPublishSharedStatus;
		result = prime * result + offerUserPublishSharedUser;
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
		OfferUserPublishSharedEntity other = (OfferUserPublishSharedEntity) obj;
		if (createdDatetime == null) {
			if (other.createdDatetime != null)
				return false;
		} else if (!createdDatetime.equals(other.createdDatetime))
			return false;
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null)
				return false;
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime))
			return false;
		if (offerUserPublishId != other.offerUserPublishId)
			return false;
		if (offerUserPublishSharedId != other.offerUserPublishSharedId)
			return false;
		if (offerUserPublishSharedStatus != other.offerUserPublishSharedStatus)
			return false;
		if (offerUserPublishSharedUser != other.offerUserPublishSharedUser)
			return false;
		return true;
	}
	
	
}
