package com.woopt.api.model;

public class UserDealView {
	
	private Offer userDeal;

	public Offer getUserDeal() {
		return userDeal;
	}

	public void setUserDeal(Offer userDeal) {
		this.userDeal = userDeal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		UserDealView other = (UserDealView) obj;
		if (userDeal == null) {
			if (other.userDeal != null)
				return false;
		} else if (!userDeal.equals(other.userDeal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserDealView [userDeal=" + userDeal + "]";
	}
	
	
}
