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
@Table(name = "WOOPT_SHOP_LOYALTY_PROGRAM_STAGE")
public class ShopLoyaltyProgramStageEntity {
	
	/**
	 * 
	 */
	//@SuppressWarnings("unused")
	//private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer shopLoyaltyProgramStageId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_ID")
	private Integer shopLoyaltyProgramId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_NO")
	private Integer shopLoyaltyProgramStageNo;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_NAME")
	private String shopLoyaltyProgramStageName;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_PROMOTION_ELIGIBILITY")
	private Integer shopLoyaltyProgramStagePromotionEligibility;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_DISCOUNT")
	private String shopLoyaltyProgramStageDiscount;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public ShopLoyaltyProgramStageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ShopLoyaltyProgramStageEntity(Integer shopLoyaltyProgramStageNo, String shopLoyaltyProgramStageName,
			Integer shopLoyaltyProgramStagePromotionEligibility, String shopLoyaltyProgramStageDiscount) {
		super();
		this.shopLoyaltyProgramStageNo = shopLoyaltyProgramStageNo;
		this.shopLoyaltyProgramStageName = shopLoyaltyProgramStageName;
		this.shopLoyaltyProgramStagePromotionEligibility = shopLoyaltyProgramStagePromotionEligibility;
		this.shopLoyaltyProgramStageDiscount = shopLoyaltyProgramStageDiscount;
	}


	public Integer getShopLoyaltyProgramStageId() {
		return shopLoyaltyProgramStageId;
	}


	public void setShopLoyaltyProgramStageId(Integer shopLoyaltyProgramStageId) {
		this.shopLoyaltyProgramStageId = shopLoyaltyProgramStageId;
	}


	public Integer getShopLoyaltyProgramId() {
		return shopLoyaltyProgramId;
	}


	public void setShopLoyaltyProgramId(Integer shopLoyaltyProgramId) {
		this.shopLoyaltyProgramId = shopLoyaltyProgramId;
	}


	public Integer getShopLoyaltyProgramStageNo() {
		return shopLoyaltyProgramStageNo;
	}


	public void setShopLoyaltyProgramStageNo(Integer shopLoyaltyProgramStageNo) {
		this.shopLoyaltyProgramStageNo = shopLoyaltyProgramStageNo;
	}


	public String getShopLoyaltyProgramStageName() {
		return shopLoyaltyProgramStageName;
	}


	public void setShopLoyaltyProgramStageName(String shopLoyaltyProgramStageName) {
		this.shopLoyaltyProgramStageName = shopLoyaltyProgramStageName;
	}


	public Integer getShopLoyaltyProgramStagePromotionEligibility() {
		return shopLoyaltyProgramStagePromotionEligibility;
	}


	public void setShopLoyaltyProgramStagePromotionEligibility(Integer shopLoyaltyProgramStagePromotionEligibility) {
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
	public String toString() {
		return "ShopLoyaltyProgramStageEntity ["
				+ (shopLoyaltyProgramStageId != null ? "shopLoyaltyProgramStageId=" + shopLoyaltyProgramStageId + ", "
						: "")
				+ (shopLoyaltyProgramId != null ? "shopLoyaltyProgramId=" + shopLoyaltyProgramId + ", " : "")
				+ (shopLoyaltyProgramStageNo != null ? "shopLoyaltyProgramStageNo=" + shopLoyaltyProgramStageNo + ", "
						: "")
				+ (shopLoyaltyProgramStageName != null
						? "shopLoyaltyProgramStageName=" + shopLoyaltyProgramStageName + ", " : "")
				+ (shopLoyaltyProgramStagePromotionEligibility != null ? "shopLoyaltyProgramStagePromotionEligibility="
						+ shopLoyaltyProgramStagePromotionEligibility + ", " : "")
				+ (shopLoyaltyProgramStageDiscount != null
						? "shopLoyaltyProgramStageDiscount=" + shopLoyaltyProgramStageDiscount + ", " : "")
				+ (createdDatetime != null ? "createdDatetime=" + createdDatetime + ", " : "")
				+ (lastUpdatedDatetime != null ? "lastUpdatedDatetime=" + lastUpdatedDatetime : "") + "]";
	}

	
}
