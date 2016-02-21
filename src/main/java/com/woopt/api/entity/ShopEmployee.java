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
 * @author Sushil
 *
 */
@Entity
@Table(name = "WOOPT_SHOP_EMPLOYEE")
public class ShopEmployee {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_EMPLOYEE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopEmployeeId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_EMPLOYEE_STATUS")
	private int shopEmployeeStatus;
	
	@Column(name = "SHOP_EMPLOYEE_ROLE")
	private String shopEmployeeRole;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	/**
	 * @return the shopEmployeeId
	 */
	public int getShopEmployeeId() {
		return shopEmployeeId;
	}

	/**
	 * @param shopEmployeeId the shopEmployeeId to set
	 */
	public void setShopEmployeeId(int shopEmployeeId) {
		this.shopEmployeeId = shopEmployeeId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the shopId
	 */
	public int getShopId() {
		return shopId;
	}

	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the shopEmployeeStatus
	 */
	public int getShopEmployeeStatus() {
		return shopEmployeeStatus;
	}

	/**
	 * @param shopEmployeeStatus the shopEmployeeStatus to set
	 */
	public void setShopEmployeeStatus(int shopEmployeeStatus) {
		this.shopEmployeeStatus = shopEmployeeStatus;
	}

	/**
	 * @return the shopEmployeeRole
	 */
	public String getShopEmployeeRole() {
		return shopEmployeeRole;
	}

	/**
	 * @param shopEmployeeRole the shopEmployeeRole to set
	 */
	public void setShopEmployeeRole(String shopEmployeeRole) {
		this.shopEmployeeRole = shopEmployeeRole;
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
		return "ShopEmployee [shopEmployeeId=" + shopEmployeeId + ", userId=" + userId + ", shopId=" + shopId
				+ ", shopEmployeeStatus=" + shopEmployeeStatus + ", shopEmployeeRole=" + shopEmployeeRole
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + shopEmployeeId;
		result = prime * result + ((shopEmployeeRole == null) ? 0 : shopEmployeeRole.hashCode());
		result = prime * result + shopEmployeeStatus;
		result = prime * result + shopId;
		result = prime * result + userId;
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
		if (!(obj instanceof ShopEmployee)) {
			return false;
		}
		ShopEmployee other = (ShopEmployee) obj;
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
		if (shopEmployeeId != other.shopEmployeeId) {
			return false;
		}
		if (shopEmployeeRole == null) {
			if (other.shopEmployeeRole != null) {
				return false;
			}
		} else if (!shopEmployeeRole.equals(other.shopEmployeeRole)) {
			return false;
		}
		if (shopEmployeeStatus != other.shopEmployeeStatus) {
			return false;
		}
		if (shopId != other.shopId) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}
}	