package com.woopt.api.model;

import java.util.Arrays;

public class Order {
	

	  private int userShopOrderId;
	  private int userId;
	  private int shopId;
	  private int userShopOrderTotalTransaction;
	  private int userShopOrderTotalRedeemed;
	  private int userShopOrderStatus;
	  private int userShopOrderNetTransaction;

	  private OrderCartOfferAdded[] orderCartOfferAdded;

	public int getUserShopOrderId() {
		return userShopOrderId;
	}

	public void setUserShopOrderId(int userShopOrderId) {
		this.userShopOrderId = userShopOrderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getUserShopOrderTotalTransaction() {
		return userShopOrderTotalTransaction;
	}

	public void setUserShopOrderTotalTransaction(int userShopOrderTotalTransaction) {
		this.userShopOrderTotalTransaction = userShopOrderTotalTransaction;
	}

	public int getUserShopOrderTotalRedeemed() {
		return userShopOrderTotalRedeemed;
	}

	public void setUserShopOrderTotalRedeemed(int userShopOrderTotalRedeemed) {
		this.userShopOrderTotalRedeemed = userShopOrderTotalRedeemed;
	}

	public int getUserShopOrderStatus() {
		return userShopOrderStatus;
	}

	public void setUserShopOrderStatus(int userShopOrderStatus) {
		this.userShopOrderStatus = userShopOrderStatus;
	}

	public int getUserShopOrderNetTransaction() {
		return userShopOrderNetTransaction;
	}

	public void setUserShopOrderNetTransaction(int userShopOrderNetTransaction) {
		this.userShopOrderNetTransaction = userShopOrderNetTransaction;
	}

	public OrderCartOfferAdded[] getOrderCartOfferAdded() {
		return orderCartOfferAdded;
	}

	public void setOrderCartOfferAdded(OrderCartOfferAdded[] orderCartOfferAdded) {
		this.orderCartOfferAdded = orderCartOfferAdded;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(orderCartOfferAdded);
		result = prime * result + shopId;
		result = prime * result + userId;
		result = prime * result + userShopOrderId;
		result = prime * result + userShopOrderNetTransaction;
		result = prime * result + userShopOrderStatus;
		result = prime * result + userShopOrderTotalRedeemed;
		result = prime * result + userShopOrderTotalTransaction;
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
		Order other = (Order) obj;
		if (!Arrays.equals(orderCartOfferAdded, other.orderCartOfferAdded))
			return false;
		if (shopId != other.shopId)
			return false;
		if (userId != other.userId)
			return false;
		if (userShopOrderId != other.userShopOrderId)
			return false;
		if (userShopOrderNetTransaction != other.userShopOrderNetTransaction)
			return false;
		if (userShopOrderStatus != other.userShopOrderStatus)
			return false;
		if (userShopOrderTotalRedeemed != other.userShopOrderTotalRedeemed)
			return false;
		if (userShopOrderTotalTransaction != other.userShopOrderTotalTransaction)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [userShopOrderId=" + userShopOrderId + ", userId=" + userId + ", shopId=" + shopId
				+ ", userShopOrderTotalTransaction=" + userShopOrderTotalTransaction + ", userShopOrderTotalRedeemed="
				+ userShopOrderTotalRedeemed + ", userShopOrderStatus=" + userShopOrderStatus
				+ ", userShopOrderNetTransaction=" + userShopOrderNetTransaction + ", orderCartOfferAdded="
				+ Arrays.toString(orderCartOfferAdded) + "]";
	}
	  
		  
}
