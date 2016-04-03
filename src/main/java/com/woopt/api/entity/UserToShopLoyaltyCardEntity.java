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
@Table(name = "WOOPT_USER_TO_SHOP_LOYALTY_CARD")
public class UserToShopLoyaltyCardEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userToShopLoyaltyCardId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_LOYALTY_CARD_ID")
	private int shopLoyaltyCardId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_STATUS")
	private int userToShopLoyaltyCardStatus;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_CURRENT_STAGE")
	private int userToShopLoyaltyCardCurrentStage;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getUserToShopLoyaltyCardId() {
		return userToShopLoyaltyCardId;
	}

	public void setUserToShopLoyaltyCardId(int userToShopLoyaltyCardId) {
		this.userToShopLoyaltyCardId = userToShopLoyaltyCardId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getShopLoyaltyCardId() {
		return shopLoyaltyCardId;
	}

	public void setShopLoyaltyCardId(int shopLoyaltyCardId) {
		this.shopLoyaltyCardId = shopLoyaltyCardId;
	}

	public int getUserToShopLoyaltyCardStatus() {
		return userToShopLoyaltyCardStatus;
	}

	public void setUserToShopLoyaltyCardStatus(int userToShopLoyaltyCardStatus) {
		this.userToShopLoyaltyCardStatus = userToShopLoyaltyCardStatus;
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
	
	
	public int getUserToShopLoyaltyCardCurrentStage() {
		return userToShopLoyaltyCardCurrentStage;
	}

	public void setUserToShopLoyaltyCardCurrentStage(int userToShopLoyaltyCardCurrentStage) {
		this.userToShopLoyaltyCardCurrentStage = userToShopLoyaltyCardCurrentStage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + shopId;
		result = prime * result + shopLoyaltyCardId;
		result = prime * result + userId;
		result = prime * result + userToShopLoyaltyCardCurrentStage;
		result = prime * result + userToShopLoyaltyCardId;
		result = prime * result + userToShopLoyaltyCardStatus;
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
		UserToShopLoyaltyCardEntity other = (UserToShopLoyaltyCardEntity) obj;
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
		if (shopId != other.shopId)
			return false;
		if (shopLoyaltyCardId != other.shopLoyaltyCardId)
			return false;
		if (userId != other.userId)
			return false;
		if (userToShopLoyaltyCardCurrentStage != other.userToShopLoyaltyCardCurrentStage)
			return false;
		if (userToShopLoyaltyCardId != other.userToShopLoyaltyCardId)
			return false;
		if (userToShopLoyaltyCardStatus != other.userToShopLoyaltyCardStatus)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserToShopLoyaltyCardEntity [userToShopLoyaltyCardId=" + userToShopLoyaltyCardId + ", userId=" + userId
				+ ", shopId=" + shopId + ", shopLoyaltyCardId=" + shopLoyaltyCardId + ", userToShopLoyaltyCardStatus="
				+ userToShopLoyaltyCardStatus + ", userToShopLoyaltyCardCurrentStage="
				+ userToShopLoyaltyCardCurrentStage + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}
	
	
}
