package com.woopt.api.model;

import java.util.Arrays;

public class PartnerConsumerView {
	
	UserModel consumer;
	
	//loyalty card of the user for my shop
	private ShopLoyaltyCard shopLoyaltyCard;
	
	//loyalty program of the user for my shop
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	//User deals related to my shop
	private UserDealView userDeal;
	
	Cart cart;
	
	Chat[] chats;

	public UserModel getConsumer() {
		return consumer;
	}

	public void setConsumer(UserModel consumer) {
		this.consumer = consumer;
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

	public UserDealView getUserDeal() {
		return userDeal;
	}

	public void setUserDeal(UserDealView userDeal) {
		this.userDeal = userDeal;
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
		result = prime * result + ((consumer == null) ? 0 : consumer.hashCode());
		result = prime * result + ((shopLoyaltyCard == null) ? 0 : shopLoyaltyCard.hashCode());
		result = prime * result + ((shopLoyaltyProgram == null) ? 0 : shopLoyaltyProgram.hashCode());
		result = prime * result + ((userDeal == null) ? 0 : userDeal.hashCode());
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
		PartnerConsumerView other = (PartnerConsumerView) obj;
		if (cart == null) {
			if (other.cart != null)
				return false;
		} else if (!cart.equals(other.cart))
			return false;
		if (!Arrays.equals(chats, other.chats))
			return false;
		if (consumer == null) {
			if (other.consumer != null)
				return false;
		} else if (!consumer.equals(other.consumer))
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
		if (userDeal == null) {
			if (other.userDeal != null)
				return false;
		} else if (!userDeal.equals(other.userDeal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PartnerConsumerView [consumer=" + consumer + ", shopLoyaltyCard=" + shopLoyaltyCard
				+ ", shopLoyaltyProgram=" + shopLoyaltyProgram + ", userDeal=" + userDeal + ", cart=" + cart
				+ ", chats=" + Arrays.toString(chats) + "]";
	}
}