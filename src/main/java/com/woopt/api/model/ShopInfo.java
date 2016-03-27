package com.woopt.api.model;

import java.util.Arrays;

public class ShopInfo {
	
	private int shopOpenStatus;

	private String shopOpeningHours;

	private String shopMainCategory;
	
	private String[] shopCategories;

	private String shopDescription;
	
	private int shopChatStatus;
	
	private int shopFacebook;

	public int getShopOpenStatus() {
		return shopOpenStatus;
	}

	public void setShopOpenStatus(int shopOpenStatus) {
		this.shopOpenStatus = shopOpenStatus;
	}

	public String getShopOpeningHours() {
		return shopOpeningHours;
	}

	public void setShopOpeningHours(String shopOpeningHours) {
		this.shopOpeningHours = shopOpeningHours;
	}

	public String getShopMainCategory() {
		return shopMainCategory;
	}

	public void setShopMainCategory(String shopMainCategory) {
		this.shopMainCategory = shopMainCategory;
	}

	public String[] getShopCategories() {
		return shopCategories;
	}

	public void setShopCategories(String[] shopCategories) {
		this.shopCategories = shopCategories;
	}

	public String getShopDescription() {
		return shopDescription;
	}

	public void setShopDescription(String shopDescription) {
		this.shopDescription = shopDescription;
	}

	public int getShopChatStatus() {
		return shopChatStatus;
	}

	public void setShopChatStatus(int shopChatStatus) {
		this.shopChatStatus = shopChatStatus;
	}

	public int getShopFacebook() {
		return shopFacebook;
	}

	public void setShopFacebook(int shopFacebook) {
		this.shopFacebook = shopFacebook;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(shopCategories);
		result = prime * result + shopChatStatus;
		result = prime * result + ((shopDescription == null) ? 0 : shopDescription.hashCode());
		result = prime * result + shopFacebook;
		result = prime * result + ((shopMainCategory == null) ? 0 : shopMainCategory.hashCode());
		result = prime * result + shopOpenStatus;
		result = prime * result + ((shopOpeningHours == null) ? 0 : shopOpeningHours.hashCode());
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
		ShopInfo other = (ShopInfo) obj;
		if (!Arrays.equals(shopCategories, other.shopCategories))
			return false;
		if (shopChatStatus != other.shopChatStatus)
			return false;
		if (shopDescription == null) {
			if (other.shopDescription != null)
				return false;
		} else if (!shopDescription.equals(other.shopDescription))
			return false;
		if (shopFacebook != other.shopFacebook)
			return false;
		if (shopMainCategory == null) {
			if (other.shopMainCategory != null)
				return false;
		} else if (!shopMainCategory.equals(other.shopMainCategory))
			return false;
		if (shopOpenStatus != other.shopOpenStatus)
			return false;
		if (shopOpeningHours == null) {
			if (other.shopOpeningHours != null)
				return false;
		} else if (!shopOpeningHours.equals(other.shopOpeningHours))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopInfo [shopOpenStatus=" + shopOpenStatus + ", shopOpeningHours=" + shopOpeningHours
				+ ", shopMainCategory=" + shopMainCategory + ", shopCategories=" + Arrays.toString(shopCategories)
				+ ", shopDescription=" + shopDescription + ", shopChatStatus=" + shopChatStatus + ", shopFacebook="
				+ shopFacebook + "]";
	}
	
	

}
