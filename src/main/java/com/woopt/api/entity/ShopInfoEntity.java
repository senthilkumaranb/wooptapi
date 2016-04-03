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
@Table(name = "WOOPT_SHOP_INFO")
public class ShopInfoEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_INFO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopInfoId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_OPEN_STATUS")
	private int shopOpenStatus;
	
	@Column(name = "SHOP_OPENING_HOURS")
	private String shopOpeningHours;
	
	@Column(name = "SHOP_MAIN_CATEGORY")
	private String shopMainCategory;
	
	@Column(name = "SHOP_CATEGORIES")
	private String shopCategories;
	
	@Column(name = "SHOP_DESCRIPTION")
	private String shopDescription;
	
	@Column(name = "SHOP_CHAT_STATUS")
	private int shopChatStatus;
	
	@Column(name = "SHOP_FACEBOOK")
	private int shopFacebook;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	/**
	 * @return the shopInfoId
	 */
	public int getShopInfoId() {
		return shopInfoId;
	}

	/**
	 * @param shopInfoId the shopInfoId to set
	 */
	public void setShopInfoId(int shopInfoId) {
		this.shopInfoId = shopInfoId;
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
	 * @return the shopOpenStatus
	 */
	public int getShopOpenStatus() {
		return shopOpenStatus;
	}

	/**
	 * @param shopOpenStatus the shopOpenStatus to set
	 */
	public void setShopOpenStatus(int shopOpenStatus) {
		this.shopOpenStatus = shopOpenStatus;
	}

	/**
	 * @return the shopOpeningHours
	 */
	public String getShopOpeningHours() {
		return shopOpeningHours;
	}

	/**
	 * @param shopOpeningHours the shopOpeningHours to set
	 */
	public void setShopOpeningHours(String shopOpeningHours) {
		this.shopOpeningHours = shopOpeningHours;
	}

	/**
	 * @return the shopMainCategory
	 */
	public String getShopMainCategory() {
		return shopMainCategory;
	}

	/**
	 * @param shopMainCategory the shopMainCategory to set
	 */
	public void setShopMainCategory(String shopMainCategory) {
		this.shopMainCategory = shopMainCategory;
	}

	/**
	 * @return the shopCategories
	 */
	public String getShopCategories() {
		return shopCategories;
	}

	/**
	 * @param shopCategories the shopCategories to set
	 */
	public void setShopCategories(String shopCategories) {
		this.shopCategories = shopCategories;
	}

	/**
	 * @return the shopDescription
	 */
	public String getShopDescription() {
		return shopDescription;
	}

	/**
	 * @param shopDescription the shopDescription to set
	 */
	public void setShopDescription(String shopDescription) {
		this.shopDescription = shopDescription;
	}

	/**
	 * @return the shopChatStatus
	 */
	public int getShopChatStatus() {
		return shopChatStatus;
	}

	/**
	 * @param shopChatStatus the shopChatStatus to set
	 */
	public void setShopChatStatus(int shopChatStatus) {
		this.shopChatStatus = shopChatStatus;
	}

	/**
	 * @return the shopFacebook
	 */
	public int getShopFacebook() {
		return shopFacebook;
	}

	/**
	 * @param shopFacebook the shopFacebook to set
	 */
	public void setShopFacebook(int shopFacebook) {
		this.shopFacebook = shopFacebook;
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
		return "ShopInfo [shopInfoId=" + shopInfoId + ", shopId=" + shopId + ", shopOpenStatus=" + shopOpenStatus
				+ ", shopOpeningHours=" + shopOpeningHours + ", shopMainCategory=" + shopMainCategory
				+ ", shopCategories=" + shopCategories + ", shopDescription=" + shopDescription + ", shopChatStatus="
				+ shopChatStatus + ", shopFacebook=" + shopFacebook + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + ((shopCategories == null) ? 0 : shopCategories.hashCode());
		result = prime * result + shopChatStatus;
		result = prime * result + ((shopDescription == null) ? 0 : shopDescription.hashCode());
		result = prime * result + shopFacebook;
		result = prime * result + shopId;
		result = prime * result + shopInfoId;
		result = prime * result + ((shopMainCategory == null) ? 0 : shopMainCategory.hashCode());
		result = prime * result + shopOpenStatus;
		result = prime * result + ((shopOpeningHours == null) ? 0 : shopOpeningHours.hashCode());
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
		if (!(obj instanceof ShopInfoEntity)) {
			return false;
		}
		ShopInfoEntity other = (ShopInfoEntity) obj;
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
		if (shopCategories == null) {
			if (other.shopCategories != null) {
				return false;
			}
		} else if (!shopCategories.equals(other.shopCategories)) {
			return false;
		}
		if (shopChatStatus != other.shopChatStatus) {
			return false;
		}
		if (shopDescription == null) {
			if (other.shopDescription != null) {
				return false;
			}
		} else if (!shopDescription.equals(other.shopDescription)) {
			return false;
		}
		if (shopFacebook != other.shopFacebook) {
			return false;
		}
		if (shopId != other.shopId) {
			return false;
		}
		if (shopInfoId != other.shopInfoId) {
			return false;
		}
		if (shopMainCategory == null) {
			if (other.shopMainCategory != null) {
				return false;
			}
		} else if (!shopMainCategory.equals(other.shopMainCategory)) {
			return false;
		}
		if (shopOpenStatus != other.shopOpenStatus) {
			return false;
		}
		if (shopOpeningHours == null) {
			if (other.shopOpeningHours != null) {
				return false;
			}
		} else if (!shopOpeningHours.equals(other.shopOpeningHours)) {
			return false;
		}
		return true;
	}
}