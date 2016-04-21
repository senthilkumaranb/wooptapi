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
@Table(name = "WOOPT_SHOP_LOYALTY_CARD")
public class ShopLoyaltyCardEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_LOYALTY_CARD_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer shopLoyaltyCardId;
	
	@Column(name = "SHOP_ID")
	private Integer shopId;
	
	@Column(name = "SHOP_LOYALTY_CARD_NAME")
	private String shopLoyaltyCardName;
	
	@Column(name = "SHOP_LOYALTY_CARD_ISSAME_FOR_ALLBRANCHES")
	private Integer shopLoyaltyCardIsSameForAllBranches;
	
	@Column(name = "SHOP_LOYALTY_CARD_STATUS")
	private Integer shopLoyaltyCardStatus;
	
	@Column(name = "SHOP_LOYALTY_CARD_START_DATE")
	private Timestamp shopLoyaltyCardStartDate;
	
	@Column(name = "SHOP_LOYALTY_CARD_END_DATE")
	private Timestamp shopLoyaltyCardEndDate;

	@Column(name = "SHOP_LOYALTY_CARD_TYPE_ID")
	private Integer shopLoyaltyCardTypeId;
	
	@Column(name = "SHOP_LOYALTY_CARD_NO_OF_STAGES")
	private Integer shopLoyaltyCardNoOfStages;
	
	@Column(name = "SHOP_LOYALTY_CARD_VALIDITY")
	private Integer shopLoyaltyCardValidity;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;
	
	public ShopLoyaltyCardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getShopLoyaltyCardId() {
		return shopLoyaltyCardId;
	}

	public void setShopLoyaltyCardId(Integer shopLoyaltyCardId) {
		this.shopLoyaltyCardId = shopLoyaltyCardId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopLoyaltyCardName() {
		return shopLoyaltyCardName;
	}

	public void setShopLoyaltyCardName(String shopLoyaltyCardName) {
		this.shopLoyaltyCardName = shopLoyaltyCardName;
	}

	public Integer getShopLoyaltyCardIsSameForAllBranches() {
		return shopLoyaltyCardIsSameForAllBranches;
	}

	public void setShopLoyaltyCardIsSameForAllBranches(Integer shopLoyaltyCardIsSameForAllBranches) {
		this.shopLoyaltyCardIsSameForAllBranches = shopLoyaltyCardIsSameForAllBranches;
	}

	public Integer getShopLoyaltyCardStatus() {
		return shopLoyaltyCardStatus;
	}

	public void setShopLoyaltyCardStatus(Integer shopLoyaltyCardStatus) {
		this.shopLoyaltyCardStatus = shopLoyaltyCardStatus;
	}

	public Timestamp getShopLoyaltyCardStartDate() {
		return shopLoyaltyCardStartDate;
	}

	public void setShopLoyaltyCardStartDate(Timestamp shopLoyaltyCardStartDate) {
		this.shopLoyaltyCardStartDate = shopLoyaltyCardStartDate;
	}

	public Timestamp getShopLoyaltyCardEndDate() {
		return shopLoyaltyCardEndDate;
	}

	public void setShopLoyaltyCardEndDate(Timestamp shopLoyaltyCardEndDate) {
		this.shopLoyaltyCardEndDate = shopLoyaltyCardEndDate;
	}

	public Integer getShopLoyaltyCardTypeId() {
		return shopLoyaltyCardTypeId;
	}

	public void setShopLoyaltyCardTypeId(Integer shopLoyaltyCardTypeId) {
		this.shopLoyaltyCardTypeId = shopLoyaltyCardTypeId;
	}

	public Integer getShopLoyaltyCardNoOfStages() {
		return shopLoyaltyCardNoOfStages;
	}

	public void setShopLoyaltyCardNoOfStages(Integer shopLoyaltyCardNoOfStages) {
		this.shopLoyaltyCardNoOfStages = shopLoyaltyCardNoOfStages;
	}

	public Integer getShopLoyaltyCardValidity() {
		return shopLoyaltyCardValidity;
	}

	public void setShopLoyaltyCardValidity(Integer shopLoyaltyCardValidity) {
		this.shopLoyaltyCardValidity = shopLoyaltyCardValidity;
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
		return "ShopLoyaltyCardEntity [shopLoyaltyCardId=" + shopLoyaltyCardId + ", shopId=" + shopId
				+ ", shopLoyaltyCardName=" + shopLoyaltyCardName + ", shopLoyaltyCardIsSameForAllBranches="
				+ shopLoyaltyCardIsSameForAllBranches + ", shopLoyaltyCardStatus=" + shopLoyaltyCardStatus
				+ ", shopLoyaltyCardStartDate=" + shopLoyaltyCardStartDate + ", shopLoyaltyCardEndDate="
				+ shopLoyaltyCardEndDate + ", shopLoyaltyCardTypeId=" + shopLoyaltyCardTypeId
				+ ", shopLoyaltyCardNoOfStages=" + shopLoyaltyCardNoOfStages + ", shopLoyaltyCardValidity="
				+ shopLoyaltyCardValidity + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}

	
}
