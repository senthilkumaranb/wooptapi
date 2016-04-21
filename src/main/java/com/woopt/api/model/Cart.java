package com.woopt.api.model;

import java.util.List;

public class Cart {
	
	private Integer cardId;
	
	private List<CartItem> cartItems;
	
	private Integer cartStatus;
	
	private Integer consumerCheckInId;

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public Integer getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(Integer cartStatus) {
		this.cartStatus = cartStatus;
	}

	public Integer getConsumerCheckInId() {
		return consumerCheckInId;
	}

	public void setConsumerCheckInId(Integer consumerCheckInId) {
		this.consumerCheckInId = consumerCheckInId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardId == null) ? 0 : cardId.hashCode());
		result = prime * result + ((cartItems == null) ? 0 : cartItems.hashCode());
		result = prime * result + ((cartStatus == null) ? 0 : cartStatus.hashCode());
		result = prime * result + ((consumerCheckInId == null) ? 0 : consumerCheckInId.hashCode());
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
		Cart other = (Cart) obj;
		if (cardId == null) {
			if (other.cardId != null)
				return false;
		} else if (!cardId.equals(other.cardId))
			return false;
		if (cartItems == null) {
			if (other.cartItems != null)
				return false;
		} else if (!cartItems.equals(other.cartItems))
			return false;
		if (cartStatus == null) {
			if (other.cartStatus != null)
				return false;
		} else if (!cartStatus.equals(other.cartStatus))
			return false;
		if (consumerCheckInId == null) {
			if (other.consumerCheckInId != null)
				return false;
		} else if (!consumerCheckInId.equals(other.consumerCheckInId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cart [cardId=" + cardId + ", cartItems=" + cartItems + ", cartStatus=" + cartStatus
				+ ", consumerCheckInId=" + consumerCheckInId + "]";
	}
		
}
