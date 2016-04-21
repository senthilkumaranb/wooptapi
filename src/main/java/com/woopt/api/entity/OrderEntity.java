package com.woopt.api.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
@Entity
@Table(name = "WOOPT_ORDER")
public class OrderEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	
	@Column(name = "ORDER_TYPE")
	private Integer orderType;
	
	@Column(name = "ORDER_METHOD")
	private String orderMethod;
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "SHOP_ID")
	private Integer shopId;
	
	@Column(name = "CONSUMER_ID")
	private Integer consumerId;

	@Column(name = "ORDER_TOTAL_TRANSACTION")
	private Double orderTotalTransaction;
		
	@Column(name = "ORDER_TOTAL_REDEEMED")
	private Double orderTotalRedeemed;
	
	@Column(name = "ORDER_NET_TRANSACTION")
	private Double orderNetTransaction;
	
	@Column(name = "ORDER_STATUS")
	private Integer orderStatus;
	
	@Column(name = "CART_ID")
	private Integer cartId;

	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
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

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
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

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", orderType=" + orderType + ", orderMethod=" + orderMethod
				+ ", userId=" + userId + ", shopId=" + shopId + ", consumerId=" + consumerId
				+ ", orderTotalTransaction=" + orderTotalTransaction + ", orderTotalRedeemed=" + orderTotalRedeemed
				+ ", orderNetTransaction=" + orderNetTransaction + ", orderStatus=" + orderStatus + ", cartId=" + cartId
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
}
