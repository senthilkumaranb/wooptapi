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
@Table(name = "WOOPT_USER_TO_SHOP_LOYALTY_PROGRAM_STAGE")
public class UserToShopLoyaltyProgramStageEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_STAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userToShopLoyaltyProgramStageId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_ID")
	private int userToShopLoyaltyProgramId;
	
	@Column(name = "SHOP_LOYALTY_PROGRAM_STAGE_ID")
	private int shopLoyaltyProgramStageId;
	
	@Column(name = "USER_TO_SHOP_LOYALTY_PROGRAM_STAGE_ACHIEVED_DATETIME")
	private Timestamp userToShopLoyaltyProgramStageAchievedDateTime;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public UserToShopLoyaltyProgramStageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserToShopLoyaltyProgramStageId() {
		return userToShopLoyaltyProgramStageId;
	}

	public void setUserToShopLoyaltyProgramStageId(int userToShopLoyaltyProgramStageId) {
		this.userToShopLoyaltyProgramStageId = userToShopLoyaltyProgramStageId;
	}

	public int getUserToShopLoyaltyProgramId() {
		return userToShopLoyaltyProgramId;
	}

	public void setUserToShopLoyaltyProgramId(int userToShopLoyaltyProgramId) {
		this.userToShopLoyaltyProgramId = userToShopLoyaltyProgramId;
	}

	public int getShopLoyaltyProgramStageId() {
		return shopLoyaltyProgramStageId;
	}

	public void setShopLoyaltyProgramStageId(int shopLoyaltyProgramStageId) {
		this.shopLoyaltyProgramStageId = shopLoyaltyProgramStageId;
	}

	public Timestamp getUserToShopLoyaltyProgramStageAchievedDateTime() {
		return userToShopLoyaltyProgramStageAchievedDateTime;
	}

	public void setUserToShopLoyaltyProgramStageAchievedDateTime(Timestamp userToShopLoyaltyProgramStageAchievedDateTime) {
		this.userToShopLoyaltyProgramStageAchievedDateTime = userToShopLoyaltyProgramStageAchievedDateTime;
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
		return "UserToShopLoyaltyProgramStageEntity [userToShopLoyaltyProgramStageId=" + userToShopLoyaltyProgramStageId
				+ ", userToShopLoyaltyProgramId=" + userToShopLoyaltyProgramId + ", shopLoyaltyProgramStageId="
				+ shopLoyaltyProgramStageId + ", userToShopLoyaltyProgramStageAchievedDateTime="
				+ userToShopLoyaltyProgramStageAchievedDateTime + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	

}
