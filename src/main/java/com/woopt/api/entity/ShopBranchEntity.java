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
 * @author Sushil
 *
 */
@Entity
@Table(name = "WOOPT_SHOP_BRANCHES")
public class ShopBranchEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_BRANCHES_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopBranchesId;
	
	@Column(name = "SHOP_ID")
	private String shopId;
	
	@Column(name = "SHOP_BRANCHES_SHOP_ID")
	private int shopBranchesShopId;
	
	@Column(name = "SHOP_BRANCHES_STATUS")
	private int shopBranchesStatus;
	
	@Column(name = "SHOP_BRANCHES_MANAGER_ID")
	private int shopBranchesManagerId;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	/**
	 * @return the shopBranchesId
	 */
	public int getShopBranchesId() {
		return shopBranchesId;
	}

	/**
	 * @param shopBranchesId the shopBranchesId to set
	 */
	public void setShopBranchesId(int shopBranchesId) {
		this.shopBranchesId = shopBranchesId;
	}

	/**
	 * @return the shopId
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the shopBranchesShopId
	 */
	public int getShopBranchesShopId() {
		return shopBranchesShopId;
	}

	/**
	 * @param shopBranchesShopId the shopBranchesShopId to set
	 */
	public void setShopBranchesShopId(int shopBranchesShopId) {
		this.shopBranchesShopId = shopBranchesShopId;
	}

	/**
	 * @return the shopBranchesStatus
	 */
	public int getShopBranchesStatus() {
		return shopBranchesStatus;
	}

	/**
	 * @param shopBranchesStatus the shopBranchesStatus to set
	 */
	public void setShopBranchesStatus(int shopBranchesStatus) {
		this.shopBranchesStatus = shopBranchesStatus;
	}

	/**
	 * @return the shopBranchesManagerId
	 */
	public int getShopBranchesManagerId() {
		return shopBranchesManagerId;
	}

	/**
	 * @param shopBranchesManagerId the shopBranchesManagerId to set
	 */
	public void setShopBranchesManagerId(int shopBranchesManagerId) {
		this.shopBranchesManagerId = shopBranchesManagerId;
	}

	/**
	 * @return the createdDatetime
	 */
	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	/**
	 * @param createdDatetime the createdDatetime to set
	 */
	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	/**
	 * @return the lastUpdatedDatetime
	 */
	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	/**
	 * @param lastUpdatedDatetime the lastUpdatedDatetime to set
	 */
	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "ShopBranches [shopBranchesId=" + shopBranchesId + ", shopId=" + shopId + ", shopBranchesShopId="
				+ shopBranchesShopId + ", shopBranchesStatus=" + shopBranchesStatus + ", shopBranchesManagerId="
				+ shopBranchesManagerId + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + shopBranchesId;
		result = prime * result + shopBranchesManagerId;
		result = prime * result + shopBranchesShopId;
		result = prime * result + shopBranchesStatus;
		result = prime * result + ((shopId == null) ? 0 : shopId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ShopBranchEntity)) {
			return false;
		}
		ShopBranchEntity other = (ShopBranchEntity) obj;
		if (createdDatetime == null) {
			if (other.createdDatetime != null) {
				return false;
			}
		} else if (!createdDatetime.equals(other.createdDatetime)) {
			return false;
		}
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null) {
				return false;
			}
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime)) {
			return false;
		}
		if (shopBranchesId != other.shopBranchesId) {
			return false;
		}
		if (shopBranchesManagerId != other.shopBranchesManagerId) {
			return false;
		}
		if (shopBranchesShopId != other.shopBranchesShopId) {
			return false;
		}
		if (shopBranchesStatus != other.shopBranchesStatus) {
			return false;
		}
		if (shopId == null) {
			if (other.shopId != null) {
				return false;
			}
		} else if (!shopId.equals(other.shopId)) {
			return false;
		}
		return true;
	}
}