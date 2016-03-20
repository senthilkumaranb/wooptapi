package com.woopt.api.entity;

import java.security.Timestamp;

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
@Table(name = "WOOPT_USER_SHOP_VISIT")
public class UserShopVisitEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_SHOP_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userShopId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "USER_SHOP_STATUS")
	private int userShopStatus;
	
	@Column(name = "USER_SHOP_IS_FAVOURITE")
	private int userShopIsFavourite;
	
	@Column(name = "USER_SHOP_TOTAL_VISITS")
	private int userShopTotalVisits;
	
	@Column(name = "USER_SHOP_FIRST_VISITED")
	private Timestamp userShopFirstVisited;
	
	@Column(name = "USER_SHOP_LAST_VISITED")
	private Timestamp userShopLastVisited;

	@Column(name = "USER_SHOP_TOTAL_TRANSACTION")
	private int userShopTotalTransaction;
	
	@Column(name = "USER_SHOP_TOTAL_REDEEMED")
	private int userShopTotalRedeemed;
	
	@Column(name = "USER_SHOP_RATING")
	private int userShopRating;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getUserShopId() {
		return userShopId;
	}

	public void setUserShopId(int userShopId) {
		this.userShopId = userShopId;
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

	public int getUserShopStatus() {
		return userShopStatus;
	}

	public void setUserShopStatus(int userShopStatus) {
		this.userShopStatus = userShopStatus;
	}

	public int getUserShopIsFavourite() {
		return userShopIsFavourite;
	}

	public void setUserShopIsFavourite(int userShopIsFavourite) {
		this.userShopIsFavourite = userShopIsFavourite;
	}

	public int getUserShopTotalVisits() {
		return userShopTotalVisits;
	}

	public void setUserShopTotalVisits(int userShopTotalVisits) {
		this.userShopTotalVisits = userShopTotalVisits;
	}

	public Timestamp getUserShopFirstVisited() {
		return userShopFirstVisited;
	}

	public void setUserShopFirstVisited(Timestamp userShopFirstVisited) {
		this.userShopFirstVisited = userShopFirstVisited;
	}

	public Timestamp getUserShopLastVisited() {
		return userShopLastVisited;
	}

	public void setUserShopLastVisited(Timestamp userShopLastVisited) {
		this.userShopLastVisited = userShopLastVisited;
	}

	public int getUserShopTotalTransaction() {
		return userShopTotalTransaction;
	}

	public void setUserShopTotalTransaction(int userShopTotalTransaction) {
		this.userShopTotalTransaction = userShopTotalTransaction;
	}

	public int getUserShopTotalRedeemed() {
		return userShopTotalRedeemed;
	}

	public void setUserShopTotalRedeemed(int userShopTotalRedeemed) {
		this.userShopTotalRedeemed = userShopTotalRedeemed;
	}

	public int getUserShopRating() {
		return userShopRating;
	}

	public void setUserShopRating(int userShopRating) {
		this.userShopRating = userShopRating;
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
		return "UserShopVisitEntity [userShopId=" + userShopId + ", userId=" + userId + ", shopId=" + shopId
				+ ", userShopStatus=" + userShopStatus + ", userShopIsFavourite=" + userShopIsFavourite
				+ ", userShopTotalVisits=" + userShopTotalVisits + ", userShopFirstVisited=" + userShopFirstVisited
				+ ", userShopLastVisited=" + userShopLastVisited + ", userShopTotalTransaction="
				+ userShopTotalTransaction + ", userShopTotalRedeemed=" + userShopTotalRedeemed + ", userShopRating="
				+ userShopRating + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + shopId;
		result = prime * result + userId;
		result = prime * result + ((userShopFirstVisited == null) ? 0 : userShopFirstVisited.hashCode());
		result = prime * result + userShopId;
		result = prime * result + userShopIsFavourite;
		result = prime * result + ((userShopLastVisited == null) ? 0 : userShopLastVisited.hashCode());
		result = prime * result + userShopRating;
		result = prime * result + userShopStatus;
		result = prime * result + userShopTotalRedeemed;
		result = prime * result + userShopTotalTransaction;
		result = prime * result + userShopTotalVisits;
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
		UserShopVisitEntity other = (UserShopVisitEntity) obj;
		if (createdDatetime == null) {
			if (other.createdDatetime != null)
				return false;
		} else if (!createdDatetime.equals(other.createdDatetime))
			return false;
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null)
				return false;
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime))
			return false;
		if (shopId != other.shopId)
			return false;
		if (userId != other.userId)
			return false;
		if (userShopFirstVisited == null) {
			if (other.userShopFirstVisited != null)
				return false;
		} else if (!userShopFirstVisited.equals(other.userShopFirstVisited))
			return false;
		if (userShopId != other.userShopId)
			return false;
		if (userShopIsFavourite != other.userShopIsFavourite)
			return false;
		if (userShopLastVisited == null) {
			if (other.userShopLastVisited != null)
				return false;
		} else if (!userShopLastVisited.equals(other.userShopLastVisited))
			return false;
		if (userShopRating != other.userShopRating)
			return false;
		if (userShopStatus != other.userShopStatus)
			return false;
		if (userShopTotalRedeemed != other.userShopTotalRedeemed)
			return false;
		if (userShopTotalTransaction != other.userShopTotalTransaction)
			return false;
		if (userShopTotalVisits != other.userShopTotalVisits)
			return false;
		return true;
	}
	
	
	
}
