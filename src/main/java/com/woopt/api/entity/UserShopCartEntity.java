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
@Table(name = "WOOPT_USER_SHOP_CART")
public class UserShopCartEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_SHOP_CART_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userShopCartId;
	
	@Column(name = "USER_SHOP_ORDER_ID")
	private int userShopOrderId;
	
	@Column(name = "OFFER_USER_PUBLISH_ID")
	private int offerUserPublishId;
	
	@Column(name = "USER_SHOP_CART_OFFER_CODE")
	private String userShopCartOfferCode;
	
	@Column(name = "USER_SHOP_CART_OFFER_AMOUNT")
	private int userShopCartOfferAmount;
	
	@Column(name = "USER_SHOP_CART_OFFER_STATUS")
	private int userShopCartOfferStatus;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getUserShopCartId() {
		return userShopCartId;
	}

	public void setUserShopCartId(int userShopCartId) {
		this.userShopCartId = userShopCartId;
	}

	public int getUserShopOrderId() {
		return userShopOrderId;
	}

	public void setUserShopOrderId(int userShopOrderId) {
		this.userShopOrderId = userShopOrderId;
	}

	public int getOfferUserPublishId() {
		return offerUserPublishId;
	}

	public void setOfferUserPublishId(int offerUserPublishId) {
		this.offerUserPublishId = offerUserPublishId;
	}

	public String getUserShopCartOfferCode() {
		return userShopCartOfferCode;
	}

	public void setUserShopCartOfferCode(String userShopCartOfferCode) {
		this.userShopCartOfferCode = userShopCartOfferCode;
	}

	public int getUserShopCartOfferAmount() {
		return userShopCartOfferAmount;
	}

	public void setUserShopCartOfferAmount(int userShopCartOfferAmount) {
		this.userShopCartOfferAmount = userShopCartOfferAmount;
	}

	public int getUserShopCartOfferStatus() {
		return userShopCartOfferStatus;
	}

	public void setUserShopCartOfferStatus(int userShopCartOfferStatus) {
		this.userShopCartOfferStatus = userShopCartOfferStatus;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + offerUserPublishId;
		result = prime * result + userShopCartId;
		result = prime * result + userShopCartOfferAmount;
		result = prime * result + ((userShopCartOfferCode == null) ? 0 : userShopCartOfferCode.hashCode());
		result = prime * result + userShopCartOfferStatus;
		result = prime * result + userShopOrderId;
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
		UserShopCartEntity other = (UserShopCartEntity) obj;
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
		if (userShopCartId != other.userShopCartId)
			return false;
		if (userShopCartOfferAmount != other.userShopCartOfferAmount)
			return false;
		if (userShopCartOfferCode == null) {
			if (other.userShopCartOfferCode != null)
				return false;
		} else if (!userShopCartOfferCode.equals(other.userShopCartOfferCode))
			return false;
		if (userShopCartOfferStatus != other.userShopCartOfferStatus)
			return false;
		if (userShopOrderId != other.userShopOrderId)
			return false;
		return true;
	}
	
	
}
