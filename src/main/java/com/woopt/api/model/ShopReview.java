package com.woopt.api.model;

import java.security.Timestamp;

public class ShopReview {
	
	private String shopReviewUserName;

	private String shopReviewUserPhone;

	private String shopReviewUserCity;
	
	private String shopReviewDescription;

	private Timestamp shopReviewDatetime;
	
	private int shopReviewReads;
	
	private int shopReviewShopRating;
	
	private int shopReviewLikesNo;
	
	private String lastUpdatedDatetime;

	public String getShopReviewUserName() {
		return shopReviewUserName;
	}

	public void setShopReviewUserName(String shopReviewUserName) {
		this.shopReviewUserName = shopReviewUserName;
	}

	public String getShopReviewUserPhone() {
		return shopReviewUserPhone;
	}

	public void setShopReviewUserPhone(String shopReviewUserPhone) {
		this.shopReviewUserPhone = shopReviewUserPhone;
	}

	public String getShopReviewUserCity() {
		return shopReviewUserCity;
	}

	public void setShopReviewUserCity(String shopReviewUserCity) {
		this.shopReviewUserCity = shopReviewUserCity;
	}

	public String getShopReviewDescription() {
		return shopReviewDescription;
	}

	public void setShopReviewDescription(String shopReviewDescription) {
		this.shopReviewDescription = shopReviewDescription;
	}

	public Timestamp getShopReviewDatetime() {
		return shopReviewDatetime;
	}

	public void setShopReviewDatetime(Timestamp shopReviewDatetime) {
		this.shopReviewDatetime = shopReviewDatetime;
	}

	public int getShopReviewReads() {
		return shopReviewReads;
	}

	public void setShopReviewReads(int shopReviewReads) {
		this.shopReviewReads = shopReviewReads;
	}

	public int getShopReviewShopRating() {
		return shopReviewShopRating;
	}

	public void setShopReviewShopRating(int shopReviewShopRating) {
		this.shopReviewShopRating = shopReviewShopRating;
	}

	public int getShopReviewLikesNo() {
		return shopReviewLikesNo;
	}

	public void setShopReviewLikesNo(int shopReviewLikesNo) {
		this.shopReviewLikesNo = shopReviewLikesNo;
	}

	public String getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	public void setLastUpdatedDatetime(String lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + ((shopReviewDatetime == null) ? 0 : shopReviewDatetime.hashCode());
		result = prime * result + ((shopReviewDescription == null) ? 0 : shopReviewDescription.hashCode());
		result = prime * result + shopReviewLikesNo;
		result = prime * result + shopReviewReads;
		result = prime * result + shopReviewShopRating;
		result = prime * result + ((shopReviewUserCity == null) ? 0 : shopReviewUserCity.hashCode());
		result = prime * result + ((shopReviewUserName == null) ? 0 : shopReviewUserName.hashCode());
		result = prime * result + ((shopReviewUserPhone == null) ? 0 : shopReviewUserPhone.hashCode());
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
		ShopReview other = (ShopReview) obj;
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null)
				return false;
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime))
			return false;
		if (shopReviewDatetime == null) {
			if (other.shopReviewDatetime != null)
				return false;
		} else if (!shopReviewDatetime.equals(other.shopReviewDatetime))
			return false;
		if (shopReviewDescription == null) {
			if (other.shopReviewDescription != null)
				return false;
		} else if (!shopReviewDescription.equals(other.shopReviewDescription))
			return false;
		if (shopReviewLikesNo != other.shopReviewLikesNo)
			return false;
		if (shopReviewReads != other.shopReviewReads)
			return false;
		if (shopReviewShopRating != other.shopReviewShopRating)
			return false;
		if (shopReviewUserCity == null) {
			if (other.shopReviewUserCity != null)
				return false;
		} else if (!shopReviewUserCity.equals(other.shopReviewUserCity))
			return false;
		if (shopReviewUserName == null) {
			if (other.shopReviewUserName != null)
				return false;
		} else if (!shopReviewUserName.equals(other.shopReviewUserName))
			return false;
		if (shopReviewUserPhone == null) {
			if (other.shopReviewUserPhone != null)
				return false;
		} else if (!shopReviewUserPhone.equals(other.shopReviewUserPhone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopReview [shopReviewUserName=" + shopReviewUserName + ", shopReviewUserPhone=" + shopReviewUserPhone
				+ ", shopReviewUserCity=" + shopReviewUserCity + ", shopReviewDescription=" + shopReviewDescription
				+ ", shopReviewDatetime=" + shopReviewDatetime + ", shopReviewReads=" + shopReviewReads
				+ ", shopReviewShopRating=" + shopReviewShopRating + ", shopReviewLikesNo=" + shopReviewLikesNo
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
	
}
