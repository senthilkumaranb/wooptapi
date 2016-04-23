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
@Table(name = "WOOPT_USER_TO_SHOP_LOYALTY_CARD_STAGE")
public class UserToShopLoyaltyCardStageEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_STAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userToShopLoyaltyCardStageId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_ID")
	private Integer userToShopLoyaltyCardId;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_ID")
	private Integer shopLoyaltyCardStageId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_ACHIEVED_DATETIME")
	private Timestamp userToShopLoyaltyCardAchievedDateTime;
	
	@Column(name = "SHOP_LOYALTY_CARD_IS_REDEEMABLE")
	private Integer shopLoyaltyCardIsRedeemable;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_REWARD")
	private String shopLoyaltyCardStageReward;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_REWARD_PHOTO")
	private String shopLoyaltyCardStageRewardPhoto;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_STAGE_STATUS")
	private Integer userToShopLoyaltyCardStageStatus;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;
	
	public UserToShopLoyaltyCardStageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUserToShopLoyaltyCardStageId() {
		return userToShopLoyaltyCardStageId;
	}

	public void setUserToShopLoyaltyCardStageId(Integer userToShopLoyaltyCardStageId) {
		this.userToShopLoyaltyCardStageId = userToShopLoyaltyCardStageId;
	}

	public Integer getUserToShopLoyaltyCardId() {
		return userToShopLoyaltyCardId;
	}

	public void setUserToShopLoyaltyCardId(Integer userToShopLoyaltyCardId) {
		this.userToShopLoyaltyCardId = userToShopLoyaltyCardId;
	}

	public Integer getShopLoyaltyCardStageId() {
		return shopLoyaltyCardStageId;
	}

	public void setShopLoyaltyCardStageId(Integer shopLoyaltyCardStageId) {
		this.shopLoyaltyCardStageId = shopLoyaltyCardStageId;
	}

	public Timestamp getUserToShopLoyaltyCardAchievedDateTime() {
		return userToShopLoyaltyCardAchievedDateTime;
	}

	public void setUserToShopLoyaltyCardAchievedDateTime(Timestamp userToShopLoyaltyCardAchievedDateTime) {
		this.userToShopLoyaltyCardAchievedDateTime = userToShopLoyaltyCardAchievedDateTime;
	}

	public Integer getShopLoyaltyCardIsRedeemable() {
		return shopLoyaltyCardIsRedeemable;
	}

	public void setShopLoyaltyCardIsRedeemable(Integer shopLoyaltyCardIsRedeemable) {
		this.shopLoyaltyCardIsRedeemable = shopLoyaltyCardIsRedeemable;
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

	public Integer getUserToShopLoyaltyCardStageStatus() {
		return userToShopLoyaltyCardStageStatus;
	}

	public void setUserToShopLoyaltyCardStageStatus(Integer userToShopLoyaltyCardStageStatus) {
		this.userToShopLoyaltyCardStageStatus = userToShopLoyaltyCardStageStatus;
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
		return "UserToShopLoyaltyCardStageEntity [userToShopLoyaltyCardStageId=" + userToShopLoyaltyCardStageId
				+ ", userToShopLoyaltyCardId=" + userToShopLoyaltyCardId + ", shopLoyaltyCardStageId="
				+ shopLoyaltyCardStageId + ", userToShopLoyaltyCardAchievedDateTime="
				+ userToShopLoyaltyCardAchievedDateTime + ", shopLoyaltyCardIsRedeemable=" + shopLoyaltyCardIsRedeemable
				+ ", shopLoyaltyCardStageReward=" + shopLoyaltyCardStageReward + ", shopLoyaltyCardStageRewardPhoto="
				+ shopLoyaltyCardStageRewardPhoto + ", userToShopLoyaltyCardStageStatus="
				+ userToShopLoyaltyCardStageStatus + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}
	

}
