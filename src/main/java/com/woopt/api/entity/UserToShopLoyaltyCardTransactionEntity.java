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
@Table(name = "WOOPT_USER_TO_SHOP_LOYALTY_CARD_TRANSACTION")
public class UserToShopLoyaltyCardTransactionEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_TRANSACTION_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userToShopLoyaltyCardTransactionId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_ID")
	private int userToShopLoyaltyCardId;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_ID")
	private int shopLoyaltyCardStageId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_ACHIEVED_DATETIME")
	private Timestamp userToShopLoyaltyCardAchievedDateTime;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_REDEEMABLE")
	private int userToShopLoyaltyCardRedeemable;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getUserToShopLoyaltyCardTransactionId() {
		return userToShopLoyaltyCardTransactionId;
	}

	public void setUserToShopLoyaltyCardTransactionId(int userToShopLoyaltyCardTransactionId) {
		this.userToShopLoyaltyCardTransactionId = userToShopLoyaltyCardTransactionId;
	}

	public int getUserToShopLoyaltyCardId() {
		return userToShopLoyaltyCardId;
	}

	public void setUserToShopLoyaltyCardId(int userToShopLoyaltyCardId) {
		this.userToShopLoyaltyCardId = userToShopLoyaltyCardId;
	}

	public int getShopLoyaltyCardStageId() {
		return shopLoyaltyCardStageId;
	}

	public void setShopLoyaltyCardStageId(int shopLoyaltyCardStageId) {
		this.shopLoyaltyCardStageId = shopLoyaltyCardStageId;
	}

	public Timestamp getUserToShopLoyaltyCardAchievedDateTime() {
		return userToShopLoyaltyCardAchievedDateTime;
	}

	public void setUserToShopLoyaltyCardAchievedDateTime(Timestamp userToShopLoyaltyCardAchievedDateTime) {
		this.userToShopLoyaltyCardAchievedDateTime = userToShopLoyaltyCardAchievedDateTime;
	}

	public int getUserToShopLoyaltyCardRedeemable() {
		return userToShopLoyaltyCardRedeemable;
	}

	public void setUserToShopLoyaltyCardRedeemable(int userToShopLoyaltyCardRedeemable) {
		this.userToShopLoyaltyCardRedeemable = userToShopLoyaltyCardRedeemable;
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
		result = prime * result + shopLoyaltyCardStageId;
		result = prime * result + ((userToShopLoyaltyCardAchievedDateTime == null) ? 0
				: userToShopLoyaltyCardAchievedDateTime.hashCode());
		result = prime * result + userToShopLoyaltyCardId;
		result = prime * result + userToShopLoyaltyCardRedeemable;
		result = prime * result + userToShopLoyaltyCardTransactionId;
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
		UserToShopLoyaltyCardTransactionEntity other = (UserToShopLoyaltyCardTransactionEntity) obj;
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
		if (shopLoyaltyCardStageId != other.shopLoyaltyCardStageId)
			return false;
		if (userToShopLoyaltyCardAchievedDateTime == null) {
			if (other.userToShopLoyaltyCardAchievedDateTime != null)
				return false;
		} else if (!userToShopLoyaltyCardAchievedDateTime.equals(other.userToShopLoyaltyCardAchievedDateTime))
			return false;
		if (userToShopLoyaltyCardId != other.userToShopLoyaltyCardId)
			return false;
		if (userToShopLoyaltyCardRedeemable != other.userToShopLoyaltyCardRedeemable)
			return false;
		if (userToShopLoyaltyCardTransactionId != other.userToShopLoyaltyCardTransactionId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserToShopLoyaltyCardTransactionEntity [userToShopLoyaltyCardTransactionId="
				+ userToShopLoyaltyCardTransactionId + ", userToShopLoyaltyCardId=" + userToShopLoyaltyCardId
				+ ", shopLoyaltyCardStageId=" + shopLoyaltyCardStageId + ", userToShopLoyaltyCardAchievedDateTime="
				+ userToShopLoyaltyCardAchievedDateTime + ", userToShopLoyaltyCardRedeemable="
				+ userToShopLoyaltyCardRedeemable + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}
	
		
	
}
