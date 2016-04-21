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
@Table(name = "WOOPT_USER_TO_SHOP_LOYALTY_CARD")
public class UserToShopLoyaltyCardEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userToShopLoyaltyCardId;
	
	@Column(name = "CONSUMER_ID")
	private Integer consumerId;
	
	@Column(name = "SHOP_LOYALTY_CARD_ID")
	private Integer shopLoyaltyCardId;
	
	@Column(name = "SHOP_LOYALTY_CARD_NAME")
	private String shopLoyaltyCardName;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_STATUS")
	private Integer userToShopLoyaltyCardStatus;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_START_DATE")
	private Timestamp userToShopLoyaltyCardStartDate;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_EXPIRY_DATE")
	private Timestamp userToShopLoyaltyCardExpiryDate;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_CURRENT_STAGE")
	private Integer userToShopLoyaltyCardCurrentStage;
	
	@Column(name = "SHOP_LOYALTY_CARD_NO_OF_STAGES")
	private Integer shopLoyaltyCardNoOfStages;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public UserToShopLoyaltyCardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUserToShopLoyaltyCardId() {
		return userToShopLoyaltyCardId;
	}

	public void setUserToShopLoyaltyCardId(Integer userToShopLoyaltyCardId) {
		this.userToShopLoyaltyCardId = userToShopLoyaltyCardId;
	}

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public Integer getShopLoyaltyCardId() {
		return shopLoyaltyCardId;
	}

	public void setShopLoyaltyCardId(Integer shopLoyaltyCardId) {
		this.shopLoyaltyCardId = shopLoyaltyCardId;
	}

	public String getShopLoyaltyCardName() {
		return shopLoyaltyCardName;
	}

	public void setShopLoyaltyCardName(String shopLoyaltyCardName) {
		this.shopLoyaltyCardName = shopLoyaltyCardName;
	}

	public Integer getUserToShopLoyaltyCardStatus() {
		return userToShopLoyaltyCardStatus;
	}

	public void setUserToShopLoyaltyCardStatus(Integer userToShopLoyaltyCardStatus) {
		this.userToShopLoyaltyCardStatus = userToShopLoyaltyCardStatus;
	}

	public Timestamp getUserToShopLoyaltyCardStartDate() {
		return userToShopLoyaltyCardStartDate;
	}

	public void setUserToShopLoyaltyCardStartDate(Timestamp userToShopLoyaltyCardStartDate) {
		this.userToShopLoyaltyCardStartDate = userToShopLoyaltyCardStartDate;
	}

	public Timestamp getUserToShopLoyaltyCardExpiryDate() {
		return userToShopLoyaltyCardExpiryDate;
	}

	public void setUserToShopLoyaltyCardExpiryDate(Timestamp userToShopLoyaltyCardExpiryDate) {
		this.userToShopLoyaltyCardExpiryDate = userToShopLoyaltyCardExpiryDate;
	}

	public Integer getUserToShopLoyaltyCardCurrentStage() {
		return userToShopLoyaltyCardCurrentStage;
	}

	public void setUserToShopLoyaltyCardCurrentStage(Integer userToShopLoyaltyCardCurrentStage) {
		this.userToShopLoyaltyCardCurrentStage = userToShopLoyaltyCardCurrentStage;
	}

	public Integer getShopLoyaltyCardNoOfStages() {
		return shopLoyaltyCardNoOfStages;
	}

	public void setShopLoyaltyCardNoOfStages(Integer shopLoyaltyCardNoOfStages) {
		this.shopLoyaltyCardNoOfStages = shopLoyaltyCardNoOfStages;
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
		return "UserToShopLoyaltyCardEntity [userToShopLoyaltyCardId=" + userToShopLoyaltyCardId + ", consumerId="
				+ consumerId + ", shopLoyaltyCardId=" + shopLoyaltyCardId + ", shopLoyaltyCardName="
				+ shopLoyaltyCardName + ", userToShopLoyaltyCardStatus=" + userToShopLoyaltyCardStatus
				+ ", userToShopLoyaltyCardStartDate=" + userToShopLoyaltyCardStartDate
				+ ", userToShopLoyaltyCardExpiryDate=" + userToShopLoyaltyCardExpiryDate
				+ ", userToShopLoyaltyCardCurrentStage=" + userToShopLoyaltyCardCurrentStage
				+ ", shopLoyaltyCardNoOfStages=" + shopLoyaltyCardNoOfStages + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
	
}
