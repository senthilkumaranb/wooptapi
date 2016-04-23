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
	private Integer shopLoyaltyCardStageId;
	
	@Column(name = "SHOP_LOYALTY_CARD_ID")
	private Integer shopLoyaltyCardId;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_NO")
	private Integer shopLoyaltyCardStageNo;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_IS_REDEEMABLE")
	private Integer shopLoyaltyCardStageIsRedeemable;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_REWARD")
	private String shopLoyaltyCardStageReward;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_REWARD_PHOTO")
	private String shopLoyaltyCardStageRewardPhoto;
	
	@Column(name = "SHOP_LOYALTY_CARD_STAGE_STATUS")
	private Integer shopLoyaltyCardStageStatus;

	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public ShopLoyaltyCardStageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getShopLoyaltyCardStageId() {
		return shopLoyaltyCardStageId;
	}

	public void setShopLoyaltyCardStageId(Integer shopLoyaltyCardStageId) {
		this.shopLoyaltyCardStageId = shopLoyaltyCardStageId;
	}

	public Integer getShopLoyaltyCardId() {
		return shopLoyaltyCardId;
	}

	public void setShopLoyaltyCardId(Integer shopLoyaltyCardId) {
		this.shopLoyaltyCardId = shopLoyaltyCardId;
	}

	public Integer getShopLoyaltyCardStageNo() {
		return shopLoyaltyCardStageNo;
	}

	public void setShopLoyaltyCardStageNo(Integer shopLoyaltyCardStageNo) {
		this.shopLoyaltyCardStageNo = shopLoyaltyCardStageNo;
	}

	public Integer getShopLoyaltyCardStageIsRedeemable() {
		return shopLoyaltyCardStageIsRedeemable;
	}

	public void setShopLoyaltyCardStageIsRedeemable(Integer shopLoyaltyCardStageIsRedeemable) {
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

	public Integer getShopLoyaltyCardStageStatus() {
		return shopLoyaltyCardStageStatus;
	}

	public void setShopLoyaltyCardStageStatus(Integer shopLoyaltyCardStageStatus) {
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
	public String toString() {
		return "ShopLoyaltyCardStageEntity [shopLoyaltyCardStageId=" + shopLoyaltyCardStageId + ", shopLoyaltyCardId="
				+ shopLoyaltyCardId + ", shopLoyaltyCardStageNo=" + shopLoyaltyCardStageNo
				+ ", shopLoyaltyCardStageIsRedeemable=" + shopLoyaltyCardStageIsRedeemable
				+ ", shopLoyaltyCardStageReward=" + shopLoyaltyCardStageReward + ", shopLoyaltyCardStageRewardPhoto="
				+ shopLoyaltyCardStageRewardPhoto + ", shopLoyaltyCardStageStatus=" + shopLoyaltyCardStageStatus
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	

}
