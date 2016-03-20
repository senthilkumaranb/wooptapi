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
 * @author Senthil
 *
 */
@Entity
@Table(name = "WOOPT_OFFER_USER_PUBLISH")
public class OfferUserPublishEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OFFER_USER_PUBLISH_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int offerUserPublishId;
	
	@Column(name = "OFFER_ID")
	private int offerId;
	
	@Column(name = "OFFER_ZONE_SCOPE_ID")
	private int offerZoneScopeId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "OFFER_USER_PUBLISH_OFFER_CODE")
	private String offerUserPublishOfferCode;
	
	@Column(name = "OFFER_USER_PUBLISH_METHOD")
	private String offerUserPublishMethod;
	
	@Column(name = "OFFER_USER_PUBLISH_IS_REDEEMED")
	private int offerUserPublishIsRedeemed;
	
	@Column(name = "OFFER_USER_PUBLISH_DATETIME")
	private Timestamp offerUserPublishDateTime;
	
	@Column(name = "OFFER_USER_PUBLISH_REDEEM_DATE")
	private Timestamp offerUserPublishRedeemDate;
	
	@Column(name = "OFFER_USER_PUBLISH_REDEEM_SHOP_ID")
	private int offerUserPublishRedeemShopId;
	
	@Column(name = "OFFER_USER_PUBLISH_REDEEM_METHOD")
	private int offerUserPublishRedeemMethod;
	
	@Column(name = "OFFER_USER_PUBLISH_EXPIRE_DATETIME")
	private Timestamp offerUserPublishExpireDateTime;
	
	@Column(name = "OFFER_USER_PUBLISH_IS_SHARED")
	private int offerUserPublishIsShared;
	
	@Column(name = "OFFER_USER_PUBLISH_STATUS")
	private int offerUserPublishStatus;
	
	@Column(name = "OFFER_USER_PUBLISH_WHO_REDEEMED")
	private int offerUserPublishWhoRedeemed;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getOfferUserPublishId() {
		return offerUserPublishId;
	}

	public void setOfferUserPublishId(int offerUserPublishId) {
		this.offerUserPublishId = offerUserPublishId;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public int getOfferZoneScopeId() {
		return offerZoneScopeId;
	}

	public void setOfferZoneScopeId(int offerZoneScopeId) {
		this.offerZoneScopeId = offerZoneScopeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getOfferUserPublishOfferCode() {
		return offerUserPublishOfferCode;
	}

	public void setOfferUserPublishOfferCode(String offerUserPublishOfferCode) {
		this.offerUserPublishOfferCode = offerUserPublishOfferCode;
	}

	public String getOfferUserPublishMethod() {
		return offerUserPublishMethod;
	}

	public void setOfferUserPublishMethod(String offerUserPublishMethod) {
		this.offerUserPublishMethod = offerUserPublishMethod;
	}

	public int getOfferUserPublishIsRedeemed() {
		return offerUserPublishIsRedeemed;
	}

	public void setOfferUserPublishIsRedeemed(int offerUserPublishIsRedeemed) {
		this.offerUserPublishIsRedeemed = offerUserPublishIsRedeemed;
	}

	public Timestamp getOfferUserPublishDateTime() {
		return offerUserPublishDateTime;
	}

	public void setOfferUserPublishDateTime(Timestamp offerUserPublishDateTime) {
		this.offerUserPublishDateTime = offerUserPublishDateTime;
	}

	public Timestamp getOfferUserPublishRedeemDate() {
		return offerUserPublishRedeemDate;
	}

	public void setOfferUserPublishRedeemDate(Timestamp offerUserPublishRedeemDate) {
		this.offerUserPublishRedeemDate = offerUserPublishRedeemDate;
	}

	public int getOfferUserPublishRedeemShopId() {
		return offerUserPublishRedeemShopId;
	}

	public void setOfferUserPublishRedeemShopId(int offerUserPublishRedeemShopId) {
		this.offerUserPublishRedeemShopId = offerUserPublishRedeemShopId;
	}

	public int getOfferUserPublishRedeemMethod() {
		return offerUserPublishRedeemMethod;
	}

	public void setOfferUserPublishRedeemMethod(int offerUserPublishRedeemMethod) {
		this.offerUserPublishRedeemMethod = offerUserPublishRedeemMethod;
	}

	public Timestamp getOfferUserPublishExpireDateTime() {
		return offerUserPublishExpireDateTime;
	}

	public void setOfferUserPublishExpireDateTime(Timestamp offerUserPublishExpireDateTime) {
		this.offerUserPublishExpireDateTime = offerUserPublishExpireDateTime;
	}

	public int getOfferUserPublishIsShared() {
		return offerUserPublishIsShared;
	}

	public void setOfferUserPublishIsShared(int offerUserPublishIsShared) {
		this.offerUserPublishIsShared = offerUserPublishIsShared;
	}

	public int getOfferUserPublishStatus() {
		return offerUserPublishStatus;
	}

	public void setOfferUserPublishStatus(int offerUserPublishStatus) {
		this.offerUserPublishStatus = offerUserPublishStatus;
	}

	public int getOfferUserPublishWhoRedeemed() {
		return offerUserPublishWhoRedeemed;
	}

	public void setOfferUserPublishWhoRedeemed(int offerUserPublishWhoRedeemed) {
		this.offerUserPublishWhoRedeemed = offerUserPublishWhoRedeemed;
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
		return "OfferUserPublishEntity [offerUserPublishId=" + offerUserPublishId + ", offerId=" + offerId
				+ ", offerZoneScopeId=" + offerZoneScopeId + ", userId=" + userId + ", offerUserPublishOfferCode="
				+ offerUserPublishOfferCode + ", offerUserPublishMethod=" + offerUserPublishMethod
				+ ", offerUserPublishIsRedeemed=" + offerUserPublishIsRedeemed + ", offerUserPublishDateTime="
				+ offerUserPublishDateTime + ", offerUserPublishRedeemDate=" + offerUserPublishRedeemDate
				+ ", offerUserPublishRedeemShopId=" + offerUserPublishRedeemShopId + ", offerUserPublishRedeemMethod="
				+ offerUserPublishRedeemMethod + ", offerUserPublishExpireDateTime=" + offerUserPublishExpireDateTime
				+ ", offerUserPublishIsShared=" + offerUserPublishIsShared + ", offerUserPublishStatus="
				+ offerUserPublishStatus + ", offerUserPublishWhoRedeemed=" + offerUserPublishWhoRedeemed
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + offerId;
		result = prime * result + ((offerUserPublishDateTime == null) ? 0 : offerUserPublishDateTime.hashCode());
		result = prime * result
				+ ((offerUserPublishExpireDateTime == null) ? 0 : offerUserPublishExpireDateTime.hashCode());
		result = prime * result + offerUserPublishId;
		result = prime * result + offerUserPublishIsRedeemed;
		result = prime * result + offerUserPublishIsShared;
		result = prime * result + ((offerUserPublishMethod == null) ? 0 : offerUserPublishMethod.hashCode());
		result = prime * result + ((offerUserPublishOfferCode == null) ? 0 : offerUserPublishOfferCode.hashCode());
		result = prime * result + ((offerUserPublishRedeemDate == null) ? 0 : offerUserPublishRedeemDate.hashCode());
		result = prime * result + offerUserPublishRedeemMethod;
		result = prime * result + offerUserPublishRedeemShopId;
		result = prime * result + offerUserPublishStatus;
		result = prime * result + offerUserPublishWhoRedeemed;
		result = prime * result + offerZoneScopeId;
		result = prime * result + userId;
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
		OfferUserPublishEntity other = (OfferUserPublishEntity) obj;
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
		if (offerId != other.offerId)
			return false;
		if (offerUserPublishDateTime == null) {
			if (other.offerUserPublishDateTime != null)
				return false;
		} else if (!offerUserPublishDateTime.equals(other.offerUserPublishDateTime))
			return false;
		if (offerUserPublishExpireDateTime == null) {
			if (other.offerUserPublishExpireDateTime != null)
				return false;
		} else if (!offerUserPublishExpireDateTime.equals(other.offerUserPublishExpireDateTime))
			return false;
		if (offerUserPublishId != other.offerUserPublishId)
			return false;
		if (offerUserPublishIsRedeemed != other.offerUserPublishIsRedeemed)
			return false;
		if (offerUserPublishIsShared != other.offerUserPublishIsShared)
			return false;
		if (offerUserPublishMethod == null) {
			if (other.offerUserPublishMethod != null)
				return false;
		} else if (!offerUserPublishMethod.equals(other.offerUserPublishMethod))
			return false;
		if (offerUserPublishOfferCode == null) {
			if (other.offerUserPublishOfferCode != null)
				return false;
		} else if (!offerUserPublishOfferCode.equals(other.offerUserPublishOfferCode))
			return false;
		if (offerUserPublishRedeemDate == null) {
			if (other.offerUserPublishRedeemDate != null)
				return false;
		} else if (!offerUserPublishRedeemDate.equals(other.offerUserPublishRedeemDate))
			return false;
		if (offerUserPublishRedeemMethod != other.offerUserPublishRedeemMethod)
			return false;
		if (offerUserPublishRedeemShopId != other.offerUserPublishRedeemShopId)
			return false;
		if (offerUserPublishStatus != other.offerUserPublishStatus)
			return false;
		if (offerUserPublishWhoRedeemed != other.offerUserPublishWhoRedeemed)
			return false;
		if (offerZoneScopeId != other.offerZoneScopeId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
	
}
