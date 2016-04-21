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
@Table(name = "WOOPT_CART_ITEM")
public class CartItemEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CART_ITEM_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartItemId;
	
	@Column(name = "CART_ID")
	private Integer cardId;
	
	@Column(name = "OFFER_USER_PUBLISH_ID")
	private Integer offerUserPublishId;
	
	@Column(name = "CART_ITEM_OFFER_CODE")
	private String cartItemOfferCode;
	
	@Column(name = "CART_ITEM_OFFER_AMOUNT")
	private Integer cartItemOfferAmount;
	
	@Column(name = "CART_ITEM_STATUS")
	private Integer cartItemStatus;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public CartItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Integer cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public Integer getOfferUserPublishId() {
		return offerUserPublishId;
	}

	public void setOfferUserPublishId(Integer offerUserPublishId) {
		this.offerUserPublishId = offerUserPublishId;
	}

	public String getCartItemOfferCode() {
		return cartItemOfferCode;
	}

	public void setCartItemOfferCode(String cartItemOfferCode) {
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
		return "CartItemEntity [cartItemId=" + cartItemId + ", cardId=" + cardId + ", offerUserPublishId="
				+ offerUserPublishId + ", cartItemOfferCode=" + cartItemOfferCode + ", cartItemOfferAmount="
				+ cartItemOfferAmount + ", cartItemStatus=" + cartItemStatus + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
}
