package com.woopt.api.model;

import java.util.List;

public class Cart {
	
	private Integer cartId;
	
	private List<CartItem> cartItems;
	
	private Integer consumerId;
	
	private Integer cartType;
	
	private Integer cartStatus;
	
	private Integer consumerCheckInId;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public Integer getCartType() {
		return cartType;
	}

	public void setCartType(Integer cartType) {
		this.cartType = cartType;
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
		result = prime * result + ((cartId == null) ? 0 : cartId.hashCode());
		result = prime * result + ((cartItems == null) ? 0 : cartItems.hashCode());
		result = prime * result + ((cartStatus == null) ? 0 : cartStatus.hashCode());
		result = prime * result + ((cartType == null) ? 0 : cartType.hashCode());
		result = prime * result + ((consumerCheckInId == null) ? 0 : consumerCheckInId.hashCode());
		result = prime * result + ((consumerId == null) ? 0 : consumerId.hashCode());
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
		if (cartId == null) {
			if (other.cartId != null)
				return false;
		} else if (!cartId.equals(other.cartId))
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
		if (cartType == null) {
			if (other.cartType != null)
				return false;
		} else if (!cartType.equals(other.cartType))
			return false;
		if (consumerCheckInId == null) {
			if (other.consumerCheckInId != null)
				return false;
		} else if (!consumerCheckInId.equals(other.consumerCheckInId))
			return false;
		if (consumerId == null) {
			if (other.consumerId != null)
				return false;
		} else if (!consumerId.equals(other.consumerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartItems=" + cartItems + ", consumerId=" + consumerId + ", cartType="
				+ cartType + ", cartStatus=" + cartStatus + ", consumerCheckInId=" + consumerCheckInId + "]";
	}

		
}
