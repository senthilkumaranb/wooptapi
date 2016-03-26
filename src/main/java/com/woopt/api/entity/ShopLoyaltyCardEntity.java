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
	private int shopLoyaltyCardId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_LOYALTY_CARD_NAME")
	private String shopLoyaltyCardName;
	
	@Column(name = "SHOP_LOYALTY_CARD_ISSAME_FOR_ALLBRANCHES")
	private int shopLoyaltyCardIsSameForAllBranches;
	
	@Column(name = "SHOP_LOYALTY_CARD_STATUS")
	private int shopLoyaltyCardStatus;
	
	@Column(name = "SHOP_LOYALTY_CARD_START_DATE")
	private Timestamp shopLoyaltyCardStartDate;
	
	@Column(name = "SHOP_LOYALTY_CARD_END_DATE")
	private Timestamp shopLoyaltyCardEndDate;

	@Column(name = "SHOP_LOYALTY_CARD_TYPE_ID")
	private int shopLoyaltyCardTypeId;
	
	@Column(name = "SHOP_LOYALTY_CARD_NO_OF_STAGES")
	private int shopLoyaltyCardNoOfStages;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getShopLoyaltyCardId() {
		return shopLoyaltyCardId;
	}

	public void setShopLoyaltyCardId(int shopLoyaltyCardId) {
		this.shopLoyaltyCardId = shopLoyaltyCardId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopLoyaltyCardName() {
		return shopLoyaltyCardName;
	}

	public void setShopLoyaltyCardName(String shopLoyaltyCardName) {
		this.shopLoyaltyCardName = shopLoyaltyCardName;
	}

	public int getShopLoyaltyCardIsSameForAllBranches() {
		return shopLoyaltyCardIsSameForAllBranches;
	}

	public void setShopLoyaltyCardIsSameForAllBranches(int shopLoyaltyCardIsSameForAllBranches) {
		this.shopLoyaltyCardIsSameForAllBranches = shopLoyaltyCardIsSameForAllBranches;
	}

	public int getShopLoyaltyCardStatus() {
		return shopLoyaltyCardStatus;
	}

	public void setShopLoyaltyCardStatus(int shopLoyaltyCardStatus) {
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

	public int getShopLoyaltyCardTypeId() {
		return shopLoyaltyCardTypeId;
	}

	public void setShopLoyaltyCardTypeId(int shopLoyaltyCardTypeId) {
		this.shopLoyaltyCardTypeId = shopLoyaltyCardTypeId;
	}

	public int getShopLoyaltyCardNoOfStages() {
		return shopLoyaltyCardNoOfStages;
	}

	public void setShopLoyaltyCardNoOfStages(int shopLoyaltyCardNoOfStages) {
		this.shopLoyaltyCardNoOfStages = shopLoyaltyCardNoOfStages;
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
		result = prime * result + shopId;
		result = prime * result + ((shopLoyaltyCardEndDate == null) ? 0 : shopLoyaltyCardEndDate.hashCode());
		result = prime * result + shopLoyaltyCardId;
		result = prime * result + shopLoyaltyCardIsSameForAllBranches;
		result = prime * result + ((shopLoyaltyCardName == null) ? 0 : shopLoyaltyCardName.hashCode());
		result = prime * result + shopLoyaltyCardNoOfStages;
		result = prime * result + ((shopLoyaltyCardStartDate == null) ? 0 : shopLoyaltyCardStartDate.hashCode());
		result = prime * result + shopLoyaltyCardStatus;
		result = prime * result + shopLoyaltyCardTypeId;
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
		ShopLoyaltyCardEntity other = (ShopLoyaltyCardEntity) obj;
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
		if (shopLoyaltyCardEndDate == null) {
			if (other.shopLoyaltyCardEndDate != null)
				return false;
		} else if (!shopLoyaltyCardEndDate.equals(other.shopLoyaltyCardEndDate))
			return false;
		if (shopLoyaltyCardId != other.shopLoyaltyCardId)
			return false;
		if (shopLoyaltyCardIsSameForAllBranches != other.shopLoyaltyCardIsSameForAllBranches)
			return false;
		if (shopLoyaltyCardName == null) {
			if (other.shopLoyaltyCardName != null)
				return false;
		} else if (!shopLoyaltyCardName.equals(other.shopLoyaltyCardName))
			return false;
		if (shopLoyaltyCardNoOfStages != other.shopLoyaltyCardNoOfStages)
			return false;
		if (shopLoyaltyCardStartDate == null) {
			if (other.shopLoyaltyCardStartDate != null)
				return false;
		} else if (!shopLoyaltyCardStartDate.equals(other.shopLoyaltyCardStartDate))
			return false;
		if (shopLoyaltyCardStatus != other.shopLoyaltyCardStatus)
			return false;
		if (shopLoyaltyCardTypeId != other.shopLoyaltyCardTypeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopLoyaltyCard [shopLoyaltyCardId=" + shopLoyaltyCardId + ", shopId=" + shopId
				+ ", shopLoyaltyCardName=" + shopLoyaltyCardName + ", shopLoyaltyCardIsSameForAllBranches="
				+ shopLoyaltyCardIsSameForAllBranches + ", shopLoyaltyCardStatus=" + shopLoyaltyCardStatus
				+ ", shopLoyaltyCardStartDate=" + shopLoyaltyCardStartDate + ", shopLoyaltyCardEndDate="
				+ shopLoyaltyCardEndDate + ", shopLoyaltyCardTypeId=" + shopLoyaltyCardTypeId
				+ ", shopLoyaltyCardNoOfStages=" + shopLoyaltyCardNoOfStages + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
	
}
