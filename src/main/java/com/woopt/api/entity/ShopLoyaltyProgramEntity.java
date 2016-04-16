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
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_END_DATE")
	private Timestamp shopLoyaltyProgramEndDate;

	@Column(name = "SHOP_LOYALTY_PROGRAM_TYPE_ID")
	private int shopLoyaltyProgramTypeId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_NO_OF_STAGES")
	private int shopLoyaltyProgramNoOfStages;
	
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

	public Timestamp getShopLoyaltyProgramEndDate() {
		return shopLoyaltyProgramEndDate;
	}

	public void setShopLoyaltyProgramEndDate(Timestamp shopLoyaltyProgramEndDate) {
		this.shopLoyaltyProgramEndDate = shopLoyaltyProgramEndDate;
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
		result = prime * result + ((shopLoyaltyProgramEndDate == null) ? 0 : shopLoyaltyProgramEndDate.hashCode());
		result = prime * result + shopLoyaltyProgramId;
		result = prime * result + ((shopLoyaltyProgramName == null) ? 0 : shopLoyaltyProgramName.hashCode());
		result = prime * result + shopLoyaltyProgramNoOfStages;
		result = prime * result + ((shopLoyaltyProgramStartDate == null) ? 0 : shopLoyaltyProgramStartDate.hashCode());
		result = prime * result + shopLoyaltyProgramStatus;
		result = prime * result + shopLoyaltyProgramTypeId;
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
		ShopLoyaltyProgramEntity other = (ShopLoyaltyProgramEntity) obj;
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
		if (shopLoyaltyProgramEndDate == null) {
			if (other.shopLoyaltyProgramEndDate != null)
				return false;
		} else if (!shopLoyaltyProgramEndDate.equals(other.shopLoyaltyProgramEndDate))
			return false;
		if (shopLoyaltyProgramId != other.shopLoyaltyProgramId)
			return false;
		if (shopLoyaltyProgramName == null) {
			if (other.shopLoyaltyProgramName != null)
				return false;
		} else if (!shopLoyaltyProgramName.equals(other.shopLoyaltyProgramName))
			return false;
		if (shopLoyaltyProgramNoOfStages != other.shopLoyaltyProgramNoOfStages)
			return false;
		if (shopLoyaltyProgramStartDate == null) {
			if (other.shopLoyaltyProgramStartDate != null)
				return false;
		} else if (!shopLoyaltyProgramStartDate.equals(other.shopLoyaltyProgramStartDate))
			return false;
		if (shopLoyaltyProgramStatus != other.shopLoyaltyProgramStatus)
			return false;
		if (shopLoyaltyProgramTypeId != other.shopLoyaltyProgramTypeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopLoyaltyProgramEntity [shopLoyaltyProgramId=" + shopLoyaltyProgramId + ", shopId=" + shopId
				+ ", shopLoyaltyProgramName=" + shopLoyaltyProgramName + ", shopLoyaltyProgramStatus="
				+ shopLoyaltyProgramStatus + ", shopLoyaltyProgramStartDate=" + shopLoyaltyProgramStartDate
				+ ", shopLoyaltyProgramEndDate=" + shopLoyaltyProgramEndDate + ", shopLoyaltyProgramTypeId="
				+ shopLoyaltyProgramTypeId + ", shopLoyaltyProgramNoOfStages=" + shopLoyaltyProgramNoOfStages
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	
}
