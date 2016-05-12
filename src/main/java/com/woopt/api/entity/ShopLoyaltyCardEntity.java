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
	private Integer shopLoyaltyCardIsSameForAllbranches;
					
	@Column(name = "SHOP_LOYALTY_CARD_STATUS")
	private Integer shopLoyaltyCardStatus;
	
	@Column(name = "SHOP_LOYALTY_CARD_START_DATE")
	private Timestamp shopLoyaltyCardStartDate;
	
	@Column(name = "SHOP_LOYALTY_CARD_EXPIRY_DATE")
	private Timestamp shopLoyaltyCardExpiryDate;

	@Column(name = "SHOP_LOYALTY_CARD_TYPE")
	private String shopLoyaltyCardTypeId;
	
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

	public Integer getShopLoyaltyCardIsSameForAllbranches() {
		return shopLoyaltyCardIsSameForAllbranches;
	}

	public void setShopLoyaltyCardIsSameForAllbranches(Integer shopLoyaltyCardIsSameForAllbranches) {
		this.shopLoyaltyCardIsSameForAllbranches = shopLoyaltyCardIsSameForAllbranches;
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

	public Timestamp getShopLoyaltyCardExpiryDate() {
		return shopLoyaltyCardExpiryDate;
	}

	public void setShopLoyaltyCardExpiryDate(Timestamp shopLoyaltyCardExpiryDate) {
		this.shopLoyaltyCardExpiryDate = shopLoyaltyCardExpiryDate;
	}

	public String getShopLoyaltyCardTypeId() {
		return shopLoyaltyCardTypeId;
	}

	public void setShopLoyaltyCardTypeId(String shopLoyaltyCardTypeId) {
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
				+ ", shopLoyaltyCardName=" + shopLoyaltyCardName + ", shopLoyaltyCardIsSameForAllbranches="
				+ shopLoyaltyCardIsSameForAllbranches + ", shopLoyaltyCardStatus=" + shopLoyaltyCardStatus
				+ ", shopLoyaltyCardStartDate=" + shopLoyaltyCardStartDate + ", shopLoyaltyCardExpiryDate="
				+ shopLoyaltyCardExpiryDate + ", shopLoyaltyCardTypeId=" + shopLoyaltyCardTypeId
				+ ", shopLoyaltyCardNoOfStages=" + shopLoyaltyCardNoOfStages + ", shopLoyaltyCardValidity="
				+ shopLoyaltyCardValidity + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}
	
}
