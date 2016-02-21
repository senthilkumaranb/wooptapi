package com.woopt.api.entity;

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
@Table(name = "WOOPT_SHOP_TO_CATEGORIES")
public class ShopToCategoryEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_TO_CATEGORIES_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopToCategoriesId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "CATEGORY_ID")
	private int categoryId;
	
	@Column(name = "SHOP_TO_CATEGORIES_STATUS")
	private int shopToCategoriesStatus;

	/**
	 * @return the shopToCategoriesId
	 */
	public int getShopToCategoriesId() {
		return shopToCategoriesId;
	}

	/**
	 * @param shopToCategoriesId the shopToCategoriesId to set
	 */
	public void setShopToCategoriesId(int shopToCategoriesId) {
		this.shopToCategoriesId = shopToCategoriesId;
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
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the shopToCategoriesStatus
	 */
	public int getShopToCategoriesStatus() {
		return shopToCategoriesStatus;
	}

	/**
	 * @param shopToCategoriesStatus the shopToCategoriesStatus to set
	 */
	public void setShopToCategoriesStatus(int shopToCategoriesStatus) {
		this.shopToCategoriesStatus = shopToCategoriesStatus;
	}

	@Override
	public String toString() {
		return "ShopToCategories [shopToCategoriesId=" + shopToCategoriesId + ", shopId=" + shopId + ", categoryId="
				+ categoryId + ", shopToCategoriesStatus=" + shopToCategoriesStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryId;
		result = prime * result + shopId;
		result = prime * result + shopToCategoriesId;
		result = prime * result + shopToCategoriesStatus;
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
		if (!(obj instanceof ShopToCategoryEntity)) {
			return false;
		}
		ShopToCategoryEntity other = (ShopToCategoryEntity) obj;
		if (categoryId != other.categoryId) {
			return false;
		}
		if (shopId != other.shopId) {
			return false;
		}
		if (shopToCategoriesId != other.shopToCategoriesId) {
			return false;
		}
		if (shopToCategoriesStatus != other.shopToCategoriesStatus) {
			return false;
		}
		return true;
	}
}