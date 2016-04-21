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
@Table(name = "WOOPT_CONSUMER")
public class ConsumerEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CONSUMER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consumerId;
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "SHOP_ID")
	private Integer shopId;
	
	@Column(name = "CONSUMER_STATUS")
	private Integer consumerStatus;
	
	@Column(name = "CONSUMER_IS_FAVOURITE")
	private Integer consumerIsFavourite;
	
	@Column(name = "CONSUMER_TOTAL_VISITS")
	private Integer consumerTotalVisits;
	
	@Column(name = "CONSUMER_FIRST_VISITED")
	private Timestamp consumerFirstVisited;
	
	@Column(name = "CONSUMER_LAST_VISITED")
	private Timestamp consumerLastVisited;

	@Column(name = "CONSUMER_TOTAL_TRANSACTION")
	private Double consumerTotalTransaction;
	
	@Column(name = "CONSUMER_TOTAL_REDEEMED")
	private Double consumerTotalRedeemed;
	
	@Column(name = "CONSUMER_SHOP_RATING")
	private Integer consumerShopRating;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public ConsumerEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public Integer getConsumerStatus() {
		return consumerStatus;
	}

	public void setConsumerStatus(Integer consumerStatus) {
		this.consumerStatus = consumerStatus;
	}

	public Integer getConsumerIsFavourite() {
		return consumerIsFavourite;
	}

	public void setConsumerIsFavourite(Integer consumerIsFavourite) {
		this.consumerIsFavourite = consumerIsFavourite;
	}

	public Integer getConsumerTotalVisits() {
		return consumerTotalVisits;
	}

	public void setConsumerTotalVisits(Integer consumerTotalVisits) {
		this.consumerTotalVisits = consumerTotalVisits;
	}

	public Timestamp getConsumerFirstVisited() {
		return consumerFirstVisited;
	}

	public void setConsumerFirstVisited(Timestamp consumerFirstVisited) {
		this.consumerFirstVisited = consumerFirstVisited;
	}

	public Timestamp getConsumerLastVisited() {
		return consumerLastVisited;
	}

	public void setConsumerLastVisited(Timestamp consumerLastVisited) {
		this.consumerLastVisited = consumerLastVisited;
	}

	public Double getConsumerTotalTransaction() {
		return consumerTotalTransaction;
	}

	public void setConsumerTotalTransaction(Double consumerTotalTransaction) {
		this.consumerTotalTransaction = consumerTotalTransaction;
	}

	public Double getConsumerTotalRedeemed() {
		return consumerTotalRedeemed;
	}

	public void setConsumerTotalRedeemed(Double consumerTotalRedeemed) {
		this.consumerTotalRedeemed = consumerTotalRedeemed;
	}

	public Integer getConsumerShopRating() {
		return consumerShopRating;
	}

	public void setConsumerShopRating(Integer consumerShopRating) {
		this.consumerShopRating = consumerShopRating;
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
		return "ConsumerEntity [consumerId=" + consumerId + ", userId=" + userId + ", shopId=" + shopId
				+ ", consumerStatus=" + consumerStatus + ", consumerIsFavourite=" + consumerIsFavourite
				+ ", consumerTotalVisits=" + consumerTotalVisits + ", consumerFirstVisited=" + consumerFirstVisited
				+ ", consumerLastVisited=" + consumerLastVisited + ", consumerTotalTransaction="
				+ consumerTotalTransaction + ", consumerTotalRedeemed=" + consumerTotalRedeemed
				+ ", consumerShopRating=" + consumerShopRating + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

}
