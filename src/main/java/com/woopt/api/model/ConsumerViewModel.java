package com.woopt.api.model;

import java.util.List;

public class ConsumerViewModel {
	
	private Shop shop;
	
	private ShopInfo shopInfo;
	
	private List<ShopReview> shopReview;
	
	//loyalty card of the user for this shop
	private ShopLoyaltyCard shopLoyaltyCard;
	
	//loyalty program of the user for this shop
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	//User deals related to this shop
	private List<Offer> offers;
	
	private ConsumerCheckIn consumerCheckIn;
	
	Order order;
	
	List<Order> allOrders;
	
	List<Chat> chats;

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

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public ConsumerCheckIn getConsumerCheckIn() {
		return consumerCheckIn;
	}

	public void setConsumerCheckIn(ConsumerCheckIn consumerCheckIn) {
		this.consumerCheckIn = consumerCheckIn;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Order> getAllOrders() {
		return allOrders;
	}

	public void setAllOrders(List<Order> allOrders) {
		this.allOrders = allOrders;
	}

	public List<Chat> getChats() {
		return chats;
	}

	public void setChats(List<Chat> chats) {
		this.chats = chats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allOrders == null) ? 0 : allOrders.hashCode());
		result = prime * result + ((chats == null) ? 0 : chats.hashCode());
		result = prime * result + ((consumerCheckIn == null) ? 0 : consumerCheckIn.hashCode());
		result = prime * result + ((offers == null) ? 0 : offers.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((shop == null) ? 0 : shop.hashCode());
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
		ConsumerViewModel other = (ConsumerViewModel) obj;
		if (allOrders == null) {
			if (other.allOrders != null)
				return false;
		} else if (!allOrders.equals(other.allOrders))
			return false;
		if (chats == null) {
			if (other.chats != null)
				return false;
		} else if (!chats.equals(other.chats))
			return false;
		if (consumerCheckIn == null) {
			if (other.consumerCheckIn != null)
				return false;
		} else if (!consumerCheckIn.equals(other.consumerCheckIn))
			return false;
		if (offers == null) {
			if (other.offers != null)
				return false;
		} else if (!offers.equals(other.offers))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
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
		if (shopReview == null) {
			if (other.shopReview != null)
				return false;
		} else if (!shopReview.equals(other.shopReview))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConsumerViewModel [shop=" + shop + ", shopInfo=" + shopInfo + ", shopReview=" + shopReview
				+ ", shopLoyaltyCard=" + shopLoyaltyCard + ", shopLoyaltyProgram=" + shopLoyaltyProgram + ", offers="
				+ offers + ", consumerCheckIn=" + consumerCheckIn + ", order=" + order + ", allOrders=" + allOrders
				+ ", chats=" + chats + "]";
	}


}