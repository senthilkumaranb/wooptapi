package com.woopt.api.model;

public class Order {
	
	private Integer orderId;
	
	private Integer orderType;
	
	private Integer orderMethod;
	
	private Integer consumerId;
	
	private Integer userId;
	
	private Integer shopId;
	
	private Double orderTotalTransaction;
	
	private Double orderTotalRedeemed;
	
	private Double orderNetTransaction;
	
	private Integer orderStatus;
	
	private Cart cart;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(Integer orderMethod) {
		this.orderMethod = orderMethod;
	}

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Double getOrderTotalTransaction() {
		return orderTotalTransaction;
	}

	public void setOrderTotalTransaction(Double orderTotalTransaction) {
		this.orderTotalTransaction = orderTotalTransaction;
	}

	public Double getOrderTotalRedeemed() {
		return orderTotalRedeemed;
	}

	public void setOrderTotalRedeemed(Double orderTotalRedeemed) {
		this.orderTotalRedeemed = orderTotalRedeemed;
	}

	public Double getOrderNetTransaction() {
		return orderNetTransaction;
	}

	public void setOrderNetTransaction(Double orderNetTransaction) {
		this.orderNetTransaction = orderNetTransaction;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		result = prime * result + ((consumerId == null) ? 0 : consumerId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderMethod == null) ? 0 : orderMethod.hashCode());
		result = prime * result + ((orderNetTransaction == null) ? 0 : orderNetTransaction.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((orderTotalRedeemed == null) ? 0 : orderTotalRedeemed.hashCode());
		result = prime * result + ((orderTotalTransaction == null) ? 0 : orderTotalTransaction.hashCode());
		result = prime * result + ((orderType == null) ? 0 : orderType.hashCode());
		result = prime * result + ((shopId == null) ? 0 : shopId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		if (cart == null) {
			if (other.cart != null)
				return false;
		} else if (!cart.equals(other.cart))
			return false;
		if (consumerId == null) {
			if (other.consumerId != null)
				return false;
		} else if (!consumerId.equals(other.consumerId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderMethod == null) {
			if (other.orderMethod != null)
				return false;
		} else if (!orderMethod.equals(other.orderMethod))
			return false;
		if (orderNetTransaction == null) {
			if (other.orderNetTransaction != null)
				return false;
		} else if (!orderNetTransaction.equals(other.orderNetTransaction))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (orderTotalRedeemed == null) {
			if (other.orderTotalRedeemed != null)
				return false;
		} else if (!orderTotalRedeemed.equals(other.orderTotalRedeemed))
			return false;
		if (orderTotalTransaction == null) {
			if (other.orderTotalTransaction != null)
				return false;
		} else if (!orderTotalTransaction.equals(other.orderTotalTransaction))
			return false;
		if (orderType == null) {
			if (other.orderType != null)
				return false;
		} else if (!orderType.equals(other.orderType))
			return false;
		if (shopId == null) {
			if (other.shopId != null)
				return false;
		} else if (!shopId.equals(other.shopId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderType=" + orderType + ", orderMethod=" + orderMethod
				+ ", consumerId=" + consumerId + ", userId=" + userId + ", shopId=" + shopId
				+ ", orderTotalTransaction=" + orderTotalTransaction + ", orderTotalRedeemed=" + orderTotalRedeemed
				+ ", orderNetTransaction=" + orderNetTransaction + ", orderStatus=" + orderStatus + ", cart=" + cart
				+ "]";
	}
	
		  
}
