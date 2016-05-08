package com.woopt.api.model;

public class CartItem {
	
	private Integer cartItemId;
	
	private Integer cartId;
	
	private Offer offer;
	
	private Integer cartItemOfferCode;
	
	private Integer cartItemOfferAmount;
	
	private Integer cartItemStatus;

	public Integer getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Integer cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Integer getCartItemOfferCode() {
		return cartItemOfferCode;
	}

	public void setCartItemOfferCode(Integer cartItemOfferCode) {
		this.cartItemOfferCode = cartItemOfferCode;
	}

	public Integer getCartItemOfferAmount() {
		return cartItemOfferAmount;
	}

	public void setCartItemOfferAmount(Integer cartItemOfferAmount) {
		this.cartItemOfferAmount = cartItemOfferAmount;
	}

	public Integer getCartItemStatus() {
		return cartItemStatus;
	}

	public void setCartItemStatus(Integer cartItemStatus) {
		this.cartItemStatus = cartItemStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartId == null) ? 0 : cartId.hashCode());
		result = prime * result + ((cartItemId == null) ? 0 : cartItemId.hashCode());
		result = prime * result + ((cartItemOfferAmount == null) ? 0 : cartItemOfferAmount.hashCode());
		result = prime * result + ((cartItemOfferCode == null) ? 0 : cartItemOfferCode.hashCode());
		result = prime * result + ((cartItemStatus == null) ? 0 : cartItemStatus.hashCode());
		result = prime * result + ((offer == null) ? 0 : offer.hashCode());
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
		CartItem other = (CartItem) obj;
		if (cartId == null) {
			if (other.cartId != null)
				return false;
		} else if (!cartId.equals(other.cartId))
			return false;
		if (cartItemId == null) {
			if (other.cartItemId != null)
				return false;
		} else if (!cartItemId.equals(other.cartItemId))
			return false;
		if (cartItemOfferAmount == null) {
			if (other.cartItemOfferAmount != null)
				return false;
		} else if (!cartItemOfferAmount.equals(other.cartItemOfferAmount))
			return false;
		if (cartItemOfferCode == null) {
			if (other.cartItemOfferCode != null)
				return false;
		} else if (!cartItemOfferCode.equals(other.cartItemOfferCode))
			return false;
		if (cartItemStatus == null) {
			if (other.cartItemStatus != null)
				return false;
		} else if (!cartItemStatus.equals(other.cartItemStatus))
			return false;
		if (offer == null) {
			if (other.offer != null)
				return false;
		} else if (!offer.equals(other.offer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", cartId=" + cartId + ", offer=" + offer + ", cartItemOfferCode="
				+ cartItemOfferCode + ", cartItemOfferAmount=" + cartItemOfferAmount + ", cartItemStatus="
				+ cartItemStatus + "]";
	}
	

}
