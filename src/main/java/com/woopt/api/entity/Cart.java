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
@Table(name = "WOOPT_CART")
public class Cart {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CART_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "SHOP_ID")
	private Integer shopId;
	
	@Column(name = "CONSUMER_ID")
	private Integer consumerId;
	
	@Column(name = "CART_STATUS")
	private Integer cartStatus;
	
	@Column(name = "CONSUMER_CHECKIN_ID")
	private Integer consumerCheckInId;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
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
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", shopId=" + shopId + ", consumerId=" + consumerId
				+ ", cartStatus=" + cartStatus + ", consumerCheckInId=" + consumerCheckInId + ", createdDatetime="
				+ createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	
}
