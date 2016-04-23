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
@Table(name = "WOOPT_SHOP_LOYALTY_PROGRAM")
public class ShopLoyaltyProgramEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_LOYALTY_PROGRAM_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopLoyaltyProgramId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_NAME")
	private String shopLoyaltyProgramName;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STATUS")
	private int shopLoyaltyProgramStatus;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_START_DATE")
	private Timestamp shopLoyaltyProgramStartDate;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_EXPIRY_DATE")
	private Timestamp shopLoyaltyProgramExpiryDate;

	@Column(name = "SHOP_LOYALTY_PROGRAM_TYPE_ID")
	private int shopLoyaltyProgramTypeId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_NO_OF_STAGES")
	private int shopLoyaltyProgramNoOfStages;
	
	@Column(name = "SHOP_LOYALTY_CARD_VALIDITY")
	private Integer shopLoyaltyCardValidity;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;
	
	public ShopLoyaltyProgramEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShopLoyaltyProgramEntity(int shopLoyaltyProgramId, String shopLoyaltyProgramName,
			int shopLoyaltyProgramStatus, int shopLoyaltyProgramTypeId, int shopLoyaltyProgramNoOfStages) {
		super();
		this.shopLoyaltyProgramId = shopLoyaltyProgramId;
		this.shopLoyaltyProgramName = shopLoyaltyProgramName;
		this.shopLoyaltyProgramStatus = shopLoyaltyProgramStatus;
		this.shopLoyaltyProgramTypeId = shopLoyaltyProgramTypeId;
		this.shopLoyaltyProgramNoOfStages = shopLoyaltyProgramNoOfStages;
	}

	public int getShopLoyaltyProgramId() {
		return shopLoyaltyProgramId;
	}

	public void setShopLoyaltyProgramId(int shopLoyaltyProgramId) {
		this.shopLoyaltyProgramId = shopLoyaltyProgramId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopLoyaltyProgramName() {
		return shopLoyaltyProgramName;
	}

	public void setShopLoyaltyProgramName(String shopLoyaltyProgramName) {
		this.shopLoyaltyProgramName = shopLoyaltyProgramName;
	}

	public int getShopLoyaltyProgramStatus() {
		return shopLoyaltyProgramStatus;
	}

	public void setShopLoyaltyProgramStatus(int shopLoyaltyProgramStatus) {
		this.shopLoyaltyProgramStatus = shopLoyaltyProgramStatus;
	}

	public Timestamp getShopLoyaltyProgramStartDate() {
		return shopLoyaltyProgramStartDate;
	}

	public void setShopLoyaltyProgramStartDate(Timestamp shopLoyaltyProgramStartDate) {
		this.shopLoyaltyProgramStartDate = shopLoyaltyProgramStartDate;
	}

	public Timestamp getShopLoyaltyProgramExpiryDate() {
		return shopLoyaltyProgramExpiryDate;
	}

	public void setShopLoyaltyProgramExpiryDate(Timestamp shopLoyaltyProgramExpiryDate) {
		this.shopLoyaltyProgramExpiryDate = shopLoyaltyProgramExpiryDate;
	}

	public int getShopLoyaltyProgramTypeId() {
		return shopLoyaltyProgramTypeId;
	}

	public void setShopLoyaltyProgramTypeId(int shopLoyaltyProgramTypeId) {
		this.shopLoyaltyProgramTypeId = shopLoyaltyProgramTypeId;
	}

	public int getShopLoyaltyProgramNoOfStages() {
		return shopLoyaltyProgramNoOfStages;
	}

	public void setShopLoyaltyProgramNoOfStages(int shopLoyaltyProgramNoOfStages) {
		this.shopLoyaltyProgramNoOfStages = shopLoyaltyProgramNoOfStages;
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
		return "ShopLoyaltyProgramEntity [shopLoyaltyProgramId=" + shopLoyaltyProgramId + ", shopId=" + shopId
				+ ", shopLoyaltyProgramName=" + shopLoyaltyProgramName + ", shopLoyaltyProgramStatus="
				+ shopLoyaltyProgramStatus + ", shopLoyaltyProgramStartDate=" + shopLoyaltyProgramStartDate
				+ ", shopLoyaltyProgramExpiryDate=" + shopLoyaltyProgramExpiryDate + ", shopLoyaltyProgramTypeId="
				+ shopLoyaltyProgramTypeId + ", shopLoyaltyProgramNoOfStages=" + shopLoyaltyProgramNoOfStages
				+ ", shopLoyaltyCardValidity=" + shopLoyaltyCardValidity + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
	
}
