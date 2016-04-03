package com.woopt.api.model;

public class OrderCartOfferAdded {
	
	private UserDealView userDeal;
	private int userShopOrderCartOfferStatus;
	
	public UserDealView getUserDeal() {
		return userDeal;
	}
	public void setUserDeal(UserDealView userDeal) {
		this.userDeal = userDeal;
	}
	public int getUserShopOrderCartOfferStatus() {
		return userShopOrderCartOfferStatus;
	}
	public void setUserShopOrderCartOfferStatus(int userShopOrderCartOfferStatus) {
		this.userShopOrderCartOfferStatus = userShopOrderCartOfferStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userDeal == null) ? 0 : userDeal.hashCode());
		result = prime * result + userShopOrderCartOfferStatus;
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
		OrderCartOfferAdded other = (OrderCartOfferAdded) obj;
		if (userDeal == null) {
			if (other.userDeal != null)
				return false;
		} else if (!userDeal.equals(other.userDeal))
			return false;
		if (userShopOrderCartOfferStatus != other.userShopOrderCartOfferStatus)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "OrderCartOfferAdded [userDeal=" + userDeal + ", userShopOrderCartOfferStatus="
				+ userShopOrderCartOfferStatus + "]";
	}
}