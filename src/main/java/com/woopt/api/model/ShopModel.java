package com.woopt.api.model;

import java.util.Arrays;

public class ShopModel {
	
	private Shop shop;
	
	private ShopInfo shopInfo;
	
	private ShopBranch[] shopBranches;
	
	private ShopEmployee[] shopEmployee;
	
	private ShopReview[] shopReview;
	
	private ShopLoyaltyCard shopLoyaltyCard;
	
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	private Offer[] offer;

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

	public ShopBranch[] getShopBranches() {
		return shopBranches;
	}

	public void setShopBranches(ShopBranch[] shopBranches) {
		this.shopBranches = shopBranches;
	}

	public ShopEmployee[] getShopEmployee() {
		return shopEmployee;
	}

	public void setShopEmployee(ShopEmployee[] shopEmployee) {
		this.shopEmployee = shopEmployee;
	}

	public ShopReview[] getShopReview() {
		return shopReview;
	}

	public void setShopReview(ShopReview[] shopReview) {
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

	public Offer[] getOffer() {
		return offer;
	}

	public void setOffer(Offer[] offer) {
		this.offer = offer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(offer);
		result = prime * result + ((shop == null) ? 0 : shop.hashCode());
		result = prime * result + Arrays.hashCode(shopBranches);
		result = prime * result + Arrays.hashCode(shopEmployee);
		result = prime * result + ((shopInfo == null) ? 0 : shopInfo.hashCode());
		result = prime * result + ((shopLoyaltyCard == null) ? 0 : shopLoyaltyCard.hashCode());
		result = prime * result + ((shopLoyaltyProgram == null) ? 0 : shopLoyaltyProgram.hashCode());
		result = prime * result + Arrays.hashCode(shopReview);
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
		if (!Arrays.equals(offer, other.offer))
			return false;
		if (shop == null) {
			if (other.shop != null)
				return false;
		} else if (!shop.equals(other.shop))
			return false;
		if (!Arrays.equals(shopBranches, other.shopBranches))
			return false;
		if (!Arrays.equals(shopEmployee, other.shopEmployee))
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
		if (!Arrays.equals(shopReview, other.shopReview))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopModel [shop=" + shop + ", shopInfo=" + shopInfo + ", shopBranches=" + Arrays.toString(shopBranches)
				+ ", shopEmployee=" + Arrays.toString(shopEmployee) + ", shopReview=" + Arrays.toString(shopReview)
				+ ", shopLoyaltyCard=" + shopLoyaltyCard + ", shopLoyaltyProgram=" + shopLoyaltyProgram + ", offer="
				+ Arrays.toString(offer) + "]";
	}
	
	
	
}
