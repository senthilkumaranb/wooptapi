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
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_ID")
	private int shopLoyaltyProgramId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_STATUS")
	private int userToShopLoyaltyProgramStatus;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_CURRENT_STAGE")
	private int userToShopLoyaltyProgramCurrentStage;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getUserToShopLoyaltyProgramId() {
		return userToShopLoyaltyProgramId;
	}

	public void setUserToShopLoyaltyProgramId(int userToShopLoyaltyProgramId) {
		this.userToShopLoyaltyProgramId = userToShopLoyaltyProgramId;
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

	public int getShopLoyaltyProgramId() {
		return shopLoyaltyProgramId;
	}

	public void setShopLoyaltyProgramId(int shopLoyaltyProgramId) {
		this.shopLoyaltyProgramId = shopLoyaltyProgramId;
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
	
	

}
