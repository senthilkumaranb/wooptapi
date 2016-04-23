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
@Table(name = "WOOPT_USER_TO_SHOP_LOYALTY_PROGRAM")
public class UserToShopLoyaltyProgramEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_TO_SHOP_LOYALTY_CARD_PROGRAM_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userToShopLoyaltyProgramId;
	
	@Column(name = "CONSUMER_ID")
	private int consumerId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_ID")
	private int shopLoyaltyProgramId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_NAME")
	private String shopLoyaltyProgramName;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_STATUS")
	private int userToShopLoyaltyProgramStatus;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_CURRENT_STAGE")
	private int userToShopLoyaltyProgramCurrentStage;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_NO_OF_STAGES")
	private int userToShopLoyaltyProgramNoOfStages;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_START_DATE")
	private Timestamp userToShopLoyaltyProgramStartDate;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_EXPIRY_DATE")
	private Timestamp userToShopLoyaltyProgramExpiryDate;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public UserToShopLoyaltyProgramEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserToShopLoyaltyProgramId() {
		return userToShopLoyaltyProgramId;
	}

	public void setUserToShopLoyaltyProgramId(int userToShopLoyaltyProgramId) {
		this.userToShopLoyaltyProgramId = userToShopLoyaltyProgramId;
	}

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}

	public int getShopLoyaltyProgramId() {
		return shopLoyaltyProgramId;
	}

	public void setShopLoyaltyProgramId(int shopLoyaltyProgramId) {
		this.shopLoyaltyProgramId = shopLoyaltyProgramId;
	}

	public String getShopLoyaltyProgramName() {
		return shopLoyaltyProgramName;
	}

	public void setShopLoyaltyProgramName(String shopLoyaltyProgramName) {
		this.shopLoyaltyProgramName = shopLoyaltyProgramName;
	}

	public int getUserToShopLoyaltyProgramStatus() {
		return userToShopLoyaltyProgramStatus;
	}

	public void setUserToShopLoyaltyProgramStatus(int userToShopLoyaltyProgramStatus) {
		this.userToShopLoyaltyProgramStatus = userToShopLoyaltyProgramStatus;
	}

	public int getUserToShopLoyaltyProgramCurrentStage() {
		return userToShopLoyaltyProgramCurrentStage;
	}

	public void setUserToShopLoyaltyProgramCurrentStage(int userToShopLoyaltyProgramCurrentStage) {
		this.userToShopLoyaltyProgramCurrentStage = userToShopLoyaltyProgramCurrentStage;
	}

	public int getUserToShopLoyaltyProgramNoOfStages() {
		return userToShopLoyaltyProgramNoOfStages;
	}

	public void setUserToShopLoyaltyProgramNoOfStages(int userToShopLoyaltyProgramNoOfStages) {
		this.userToShopLoyaltyProgramNoOfStages = userToShopLoyaltyProgramNoOfStages;
	}

	public Timestamp getUserToShopLoyaltyProgramStartDate() {
		return userToShopLoyaltyProgramStartDate;
	}

	public void setUserToShopLoyaltyProgramStartDate(Timestamp userToShopLoyaltyProgramStartDate) {
		this.userToShopLoyaltyProgramStartDate = userToShopLoyaltyProgramStartDate;
	}

	public Timestamp getUserToShopLoyaltyProgramExpiryDate() {
		return userToShopLoyaltyProgramExpiryDate;
	}

	public void setUserToShopLoyaltyProgramExpiryDate(Timestamp userToShopLoyaltyProgramExpiryDate) {
		this.userToShopLoyaltyProgramExpiryDate = userToShopLoyaltyProgramExpiryDate;
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
		return "UserToShopLoyaltyProgramEntity [userToShopLoyaltyProgramId=" + userToShopLoyaltyProgramId
				+ ", consumerId=" + consumerId + ", shopLoyaltyProgramId=" + shopLoyaltyProgramId
				+ ", shopLoyaltyProgramName=" + shopLoyaltyProgramName + ", userToShopLoyaltyProgramStatus="
				+ userToShopLoyaltyProgramStatus + ", userToShopLoyaltyProgramCurrentStage="
				+ userToShopLoyaltyProgramCurrentStage + ", userToShopLoyaltyProgramNoOfStages="
				+ userToShopLoyaltyProgramNoOfStages + ", userToShopLoyaltyProgramStartDate="
				+ userToShopLoyaltyProgramStartDate + ", userToShopLoyaltyProgramExpiryDate="
				+ userToShopLoyaltyProgramExpiryDate + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}

	
	
}
