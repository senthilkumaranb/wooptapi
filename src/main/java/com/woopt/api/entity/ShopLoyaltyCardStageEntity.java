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
@Table(name = "WOOPT_SHOP_LOYALTY_CARD_STAGE")
public class ShopLoyaltyCardStageEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopLoyaltyCardStageId;
	
	@Column(name = "SHOP_LOYALTY_CARD_ID")
	private int shopLoyaltyCardId;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_NO")
	private int shopLoyaltyCardStageNo;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_IS_REDEEMABLE")
	private int shopLoyaltyCardStageIsRedeemable;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_REWARD")
	private String shopLoyaltyCardStageReward;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_REWARD_PHOTO")
	private String shopLoyaltyCardStageRewardPhoto;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_STATUS")
	private int shopLoyaltyCardStageStatus;

	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getShopLoyaltyCardStageId() {
		return shopLoyaltyCardStageId;
	}

	public void setShopLoyaltyCardStageId(int shopLoyaltyCardStageId) {
		this.shopLoyaltyCardStageId = shopLoyaltyCardStageId;
	}

	public int getShopLoyaltyCardId() {
		return shopLoyaltyCardId;
	}

	public void setShopLoyaltyCardId(int shopLoyaltyCardId) {
		this.shopLoyaltyCardId = shopLoyaltyCardId;
	}

	public int getShopLoyaltyCardStageNo() {
		return shopLoyaltyCardStageNo;
	}

	public void setShopLoyaltyCardStageNo(int shopLoyaltyCardStageNo) {
		this.shopLoyaltyCardStageNo = shopLoyaltyCardStageNo;
	}

	public int getShopLoyaltyCardStageIsRedeemable() {
		return shopLoyaltyCardStageIsRedeemable;
	}

	public void setShopLoyaltyCardStageIsRedeemable(int shopLoyaltyCardStageIsRedeemable) {
		this.shopLoyaltyCardStageIsRedeemable = shopLoyaltyCardStageIsRedeemable;
	}

	public String getShopLoyaltyCardStageReward() {
		return shopLoyaltyCardStageReward;
	}

	public void setShopLoyaltyCardStageReward(String shopLoyaltyCardStageReward) {
		this.shopLoyaltyCardStageReward = shopLoyaltyCardStageReward;
	}

	public String getShopLoyaltyCardStageRewardPhoto() {
		return shopLoyaltyCardStageRewardPhoto;
	}

	public void setShopLoyaltyCardStageRewardPhoto(String shopLoyaltyCardStageRewardPhoto) {
		this.shopLoyaltyCardStageRewardPhoto = shopLoyaltyCardStageRewardPhoto;
	}

	public int getShopLoyaltyCardStageStatus() {
		return shopLoyaltyCardStageStatus;
	}

	public void setShopLoyaltyCardStageStatus(int shopLoyaltyCardStageStatus) {
		this.shopLoyaltyCardStageStatus = shopLoyaltyCardStageStatus;
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
		result = prime * result + shopLoyaltyCardId;
		result = prime * result + shopLoyaltyCardStageId;
		result = prime * result + shopLoyaltyCardStageIsRedeemable;
		result = prime * result + shopLoyaltyCardStageNo;
		result = prime * result + ((shopLoyaltyCardStageReward == null) ? 0 : shopLoyaltyCardStageReward.hashCode());
		result = prime * result
				+ ((shopLoyaltyCardStageRewardPhoto == null) ? 0 : shopLoyaltyCardStageRewardPhoto.hashCode());
		result = prime * result + shopLoyaltyCardStageStatus;
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
		ShopLoyaltyCardStageEntity other = (ShopLoyaltyCardStageEntity) obj;
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
		if (shopLoyaltyCardId != other.shopLoyaltyCardId)
			return false;
		if (shopLoyaltyCardStageId != other.shopLoyaltyCardStageId)
			return false;
		if (shopLoyaltyCardStageIsRedeemable != other.shopLoyaltyCardStageIsRedeemable)
			return false;
		if (shopLoyaltyCardStageNo != other.shopLoyaltyCardStageNo)
			return false;
		if (shopLoyaltyCardStageReward == null) {
			if (other.shopLoyaltyCardStageReward != null)
				return false;
		} else if (!shopLoyaltyCardStageReward.equals(other.shopLoyaltyCardStageReward))
			return false;
		if (shopLoyaltyCardStageRewardPhoto == null) {
			if (other.shopLoyaltyCardStageRewardPhoto != null)
				return false;
		} else if (!shopLoyaltyCardStageRewardPhoto.equals(other.shopLoyaltyCardStageRewardPhoto))
			return false;
		if (shopLoyaltyCardStageStatus != other.shopLoyaltyCardStageStatus)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopLoyaltyCardStageEntity [shopLoyaltyCardStageId=" + shopLoyaltyCardStageId + ", shopLoyaltyCardId="
				+ shopLoyaltyCardId + ", shopLoyaltyCardStageNo=" + shopLoyaltyCardStageNo
				+ ", shopLoyaltyCardStageIsRedeemable=" + shopLoyaltyCardStageIsRedeemable
				+ ", shopLoyaltyCardStageReward=" + shopLoyaltyCardStageReward + ", shopLoyaltyCardStageRewardPhoto="
				+ shopLoyaltyCardStageRewardPhoto + ", shopLoyaltyCardStageStatus=" + shopLoyaltyCardStageStatus
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

}
