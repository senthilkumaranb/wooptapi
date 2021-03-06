package com.woopt.api.model;

import java.util.Arrays;
import java.util.List;

public class ShopModel {
	
	private Shop shop;
	
	private ShopInfo shopInfo;
	
	private List<ShopBranch> shopBranches;
	
	private List<ShopEmployee> shopEmployee;
	
	private List<ShopReview> shopReview;
	
	private ShopLoyaltyCard shopLoyaltyCard;
	
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	private List<Offer> offer;

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public ShopInfo getShopInfo() {
		return shopInfo;
	}

	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public List<ShopBranch> getShopBranches() {
		return shopBranches;
	}

	public void setShopBranches(List<ShopBranch> shopBranches) {
		this.shopBranches = shopBranches;
	}

	public List<ShopEmployee> getShopEmployee() {
		return shopEmployee;
	}

	public void setShopEmployee(List<ShopEmployee> shopEmployee) {
		this.shopEmployee = shopEmployee;
	}

	public List<ShopReview> getShopReview() {
		return shopReview;
	}

	public void setShopReview(List<ShopReview> shopReview) {
		this.shopReview = shopReview;
	}

	public ShopLoyaltyCard getShopLoyaltyCard() {
		return shopLoyaltyCard;
	}

	public void setShopLoyaltyCard(ShopLoyaltyCard shopLoyaltyCard) {
		this.shopLoyaltyCard = shopLoyaltyCard;
	}

	public ShopLoyaltyProgram getShopLoyaltyProgram() {
		return shopLoyaltyProgram;
	}

	public void setShopLoyaltyProgram(ShopLoyaltyProgram shopLoyaltyProgram) {
		this.shopLoyaltyProgram = shopLoyaltyProgram;
	}

	public List<Offer> getOffer() {
		return offer;
	}

	public void setOffer(List<Offer> offer) {
		this.offer = offer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((offer == null) ? 0 : offer.hashCode());
		result = prime * result + ((shop == null) ? 0 : shop.hashCode());
		result = prime * result + ((shopBranches == null) ? 0 : shopBranches.hashCode());
		result = prime * result + ((shopEmployee == null) ? 0 : shopEmployee.hashCode());
		result = prime * result + ((shopInfo == null) ? 0 : shopInfo.hashCode());
		result = prime * result + ((shopLoyaltyCard == null) ? 0 : shopLoyaltyCard.hashCode());
		result = prime * result + ((shopLoyaltyProgram == null) ? 0 : shopLoyaltyProgram.hashCode());
		result = prime * result + ((shopReview == null) ? 0 : shopReview.hashCode());
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
		ShopModel other = (ShopModel) obj;
		if (offer == null) {
			if (other.offer != null)
				return false;
		} else if (!offer.equals(other.offer))
			return false;
		if (shop == null) {
			if (other.shop != null)
				return false;
		} else if (!shop.equals(other.shop))
			return false;
		if (shopBranches == null) {
			if (other.shopBranches != null)
				return false;
		} else if (!shopBranches.equals(other.shopBranches))
			return false;
		if (shopEmployee == null) {
			if (other.shopEmployee != null)
				return false;
		} else if (!shopEmployee.equals(other.shopEmployee))
			return false;
		if (shopInfo == null) {
			if (other.shopInfo != null)
				return false;
		} else if (!shopInfo.equals(other.shopInfo))
			return false;
		if (shopLoyaltyCard == null) {
			if (other.shopLoyaltyCard != null)
				return false;
		} else if (!shopLoyaltyCard.equals(other.shopLoyaltyCard))
			return false;
		if (shopLoyaltyProgram == null) {
			if (other.shopLoyaltyProgram != null)
				return false;
		} else if (!shopLoyaltyProgram.equals(other.shopLoyaltyProgram))
			return false;
		if (shopReview == null) {
			if (other.shopReview != null)
				return false;
		} else if (!shopReview.equals(other.shopReview))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopModel [shop=" + shop + ", shopInfo=" + shopInfo + ", shopBranches=" + shopBranches
				+ ", shopEmployee=" + shopEmployee + ", shopReview=" + shopReview + ", shopLoyaltyCard="
				+ shopLoyaltyCard + ", shopLoyaltyProgram=" + shopLoyaltyProgram + ", offer=" + offer + "]";
	}

	
}