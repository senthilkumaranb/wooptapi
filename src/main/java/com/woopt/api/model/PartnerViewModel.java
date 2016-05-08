package com.woopt.api.model;

import java.util.Arrays;
import java.util.List;

public class PartnerViewModel {
	
	Consumer consumer;
		
	//loyalty card of the user for my shop
	private ShopLoyaltyCard shopLoyaltyCard;
	
	//loyalty program of the user for my shop
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	//User deals related to my shop
	private List<Offer> userDeals;
	
	private ConsumerCheckIn consumerCheckIn;
	
	private Order order;
	
	List<Order> allOrders;
	
	private List<Chat> chats;

	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
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

	public List<Offer> getUserDeals() {
		return userDeals;
	}

	public void setUserDeals(List<Offer> userDeals) {
		this.userDeals = userDeals;
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
		result = prime * result + ((consumer == null) ? 0 : consumer.hashCode());
		result = prime * result + ((consumerCheckIn == null) ? 0 : consumerCheckIn.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((shopLoyaltyCard == null) ? 0 : shopLoyaltyCard.hashCode());
		result = prime * result + ((shopLoyaltyProgram == null) ? 0 : shopLoyaltyProgram.hashCode());
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
		PartnerViewModel other = (PartnerViewModel) obj;
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
		if (consumer == null) {
			if (other.consumer != null)
				return false;
		} else if (!consumer.equals(other.consumer))
			return false;
		if (consumerCheckIn == null) {
			if (other.consumerCheckIn != null)
				return false;
		} else if (!consumerCheckIn.equals(other.consumerCheckIn))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
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
		if (userDeals == null) {
			if (other.userDeals != null)
				return false;
		} else if (!userDeals.equals(other.userDeals))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PartnerViewModel [consumer=" + consumer + ", shopLoyaltyCard=" + shopLoyaltyCard
				+ ", shopLoyaltyProgram=" + shopLoyaltyProgram + ", userDeals=" + userDeals + ", consumerCheckIn="
				+ consumerCheckIn + ", order=" + order + ", allOrders=" + allOrders + ", chats=" + chats + "]";
	}
	

}