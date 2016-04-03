package com.woopt.api.model;

import java.util.Arrays;

public class UserShopView {
	
	private Shop shop;
	
	private ShopInfo shopInfo;
	
	private ShopReview[] shopReview;
	
	//loyalty card of the user for this shop
	private ShopLoyaltyCard shopLoyaltyCard;
	
	//loyalty program of the user for this shop
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	//User deals related to this shop
	private UserDealView userDeals;
	
	Cart cart;
	
	Chat[] chats;

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

	public UserDealView getUserDeals() {
		return userDeals;
	}

	public void setUserDeals(UserDealView userDeals) {
		this.userDeals = userDeals;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Chat[] getChats() {
		return chats;
	}

	public void setChats(Chat[] chats) {
		this.chats = chats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		result = prime * result + Arrays.hashCode(chats);
		result = prime * result + ((shop == null) ? 0 : shop.hashCode());
		result = prime * result + ((shopInfo == null) ? 0 : shopInfo.hashCode());
		result = prime * result + ((shopLoyaltyCard == null) ? 0 : shopLoyaltyCard.hashCode());
		result = prime * result + ((shopLoyaltyProgram == null) ? 0 : shopLoyaltyProgram.hashCode());
		result = prime * result + Arrays.hashCode(shopReview);
		result = prime * result + ((userDeals == null) ? 0 : userDeals.hashCode());
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
		UserShopView other = (UserShopView) obj;
		if (cart == null) {
			if (other.cart != null)
				return false;
		} else if (!cart.equals(other.cart))
			return false;
		if (!Arrays.equals(chats, other.chats))
			return false;
		if (shop == null) {
			if (other.shop != null)
				return false;
		} else if (!shop.equals(other.shop))
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
		if (userDeals == null) {
			if (other.userDeals != null)
				return false;
		} else if (!userDeals.equals(other.userDeals))
			return false;
		return true;
	}
}