package com.woopt.api.model;

import java.util.Arrays;

public class Cart {
	
	Order[] order;
	
	private UserCheckIn userCheckIn;

	public Order[] getOrder() {
		return order;
	}

	public void setOrder(Order[] order) {
		this.order = order;
	}

	public UserCheckIn getUserCheckIn() {
		return userCheckIn;
	}

	public void setUserCheckIn(UserCheckIn userCheckIn) {
		this.userCheckIn = userCheckIn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(order);
		result = prime * result + ((userCheckIn == null) ? 0 : userCheckIn.hashCode());
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
		if (!Arrays.equals(order, other.order))
			return false;
		if (userCheckIn == null) {
			if (other.userCheckIn != null)
				return false;
		} else if (!userCheckIn.equals(other.userCheckIn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cart [order=" + Arrays.toString(order) + ", userCheckIn=" + userCheckIn + "]";
	}
	
		
}
