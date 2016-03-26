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
@Table(name = "WOOPT_SHOP_LOYALTY_PROGRAM_STAGE")
public class ShopLoyaltyProgramStageEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopLoyaltyProgramStageId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_ID")
	private int shopLoyaltyProgramId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_NO")
	private int shopLoyaltyProgramStageNo;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_NAME")
	private String shopLoyaltyProgramStageName;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_PROMOTION_ELIGIBILITY")
	private int shopLoyaltyProgramStagePromotionEligibility;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_DISCOUNT")
	private String shopLoyaltyProgramStageDiscount;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getShopLoyaltyProgramStageId() {
		return shopLoyaltyProgramStageId;
	}

	public void setShopLoyaltyProgramStageId(int shopLoyaltyProgramStageId) {
		this.shopLoyaltyProgramStageId = shopLoyaltyProgramStageId;
	}

	public int getShopLoyaltyProgramId() {
		return shopLoyaltyProgramId;
	}

	public void setShopLoyaltyProgramId(int shopLoyaltyProgramId) {
		this.shopLoyaltyProgramId = shopLoyaltyProgramId;
	}

	public int getShopLoyaltyProgramStageNo() {
		return shopLoyaltyProgramStageNo;
	}

	public void setShopLoyaltyProgramStageNo(int shopLoyaltyProgramStageNo) {
		this.shopLoyaltyProgramStageNo = shopLoyaltyProgramStageNo;
	}

	public String getShopLoyaltyProgramStageName() {
		return shopLoyaltyProgramStageName;
	}

	public void setShopLoyaltyProgramStageName(String shopLoyaltyProgramStageName) {
		this.shopLoyaltyProgramStageName = shopLoyaltyProgramStageName;
	}

	public int getShopLoyaltyProgramStagePromotionEligibility() {
		return shopLoyaltyProgramStagePromotionEligibility;
	}

	public void setShopLoyaltyProgramStagePromotionEligibility(int shopLoyaltyProgramStagePromotionEligibility) {
		this.shopLoyaltyProgramStagePromotionEligibility = shopLoyaltyProgramStagePromotionEligibility;
	}

	public String getShopLoyaltyProgramStageDiscount() {
		return shopLoyaltyProgramStageDiscount;
	}

	public void setShopLoyaltyProgramStageDiscount(String shopLoyaltyProgramStageDiscount) {
		this.shopLoyaltyProgramStageDiscount = shopLoyaltyProgramStageDiscount;
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
		result = prime * result + shopLoyaltyProgramId;
		result = prime * result
				+ ((shopLoyaltyProgramStageDiscount == null) ? 0 : shopLoyaltyProgramStageDiscount.hashCode());
		result = prime * result + shopLoyaltyProgramStageId;
		result = prime * result + ((shopLoyaltyProgramStageName == null) ? 0 : shopLoyaltyProgramStageName.hashCode());
		result = prime * result + shopLoyaltyProgramStageNo;
		result = prime * result + shopLoyaltyProgramStagePromotionEligibility;
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
		ShopLoyaltyProgramStageEntity other = (ShopLoyaltyProgramStageEntity) obj;
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
		if (shopLoyaltyProgramId != other.shopLoyaltyProgramId)
			return false;
		if (shopLoyaltyProgramStageDiscount == null) {
			if (other.shopLoyaltyProgramStageDiscount != null)
				return false;
		} else if (!shopLoyaltyProgramStageDiscount.equals(other.shopLoyaltyProgramStageDiscount))
			return false;
		if (shopLoyaltyProgramStageId != other.shopLoyaltyProgramStageId)
			return false;
		if (shopLoyaltyProgramStageName == null) {
			if (other.shopLoyaltyProgramStageName != null)
				return false;
		} else if (!shopLoyaltyProgramStageName.equals(other.shopLoyaltyProgramStageName))
			return false;
		if (shopLoyaltyProgramStageNo != other.shopLoyaltyProgramStageNo)
			return false;
		if (shopLoyaltyProgramStagePromotionEligibility != other.shopLoyaltyProgramStagePromotionEligibility)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopLoyaltyProgramStageEntity [shopLoyaltyProgramStageId=" + shopLoyaltyProgramStageId
				+ ", shopLoyaltyProgramId=" + shopLoyaltyProgramId + ", shopLoyaltyProgramStageNo="
				+ shopLoyaltyProgramStageNo + ", shopLoyaltyProgramStageName=" + shopLoyaltyProgramStageName
				+ ", shopLoyaltyProgramStagePromotionEligibility=" + shopLoyaltyProgramStagePromotionEligibility
				+ ", shopLoyaltyProgramStageDiscount=" + shopLoyaltyProgramStageDiscount + ", createdDatetime="
				+ createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
}
