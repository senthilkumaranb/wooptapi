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
@Table(name = "WOOPT_USER_SHOP_CHECKIN")
public class UserShopCheckInEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_SHOP_CHECKIN_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userShopCheckInId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "USER_SHOP_CHECKIN_DATETIME")
	private Timestamp userShopCheckInDatetime;
	
	@Column(name = "USER_SHOP_CHECKIN_METHOD")
	private String userShopCheckInMethod;
	
	@Column(name = "USER_SHOP_CHECKIN_STATUS")
	private int userShopCheckInStatus;
	
	@Column(name = "USER_SHOP_CHECKIN_SOURCEPAGE")
	private String userShopCheckInSourcePage;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getUserShopCheckInId() {
		return userShopCheckInId;
	}

	public void setUserShopCheckInId(int userShopCheckInId) {
		this.userShopCheckInId = userShopCheckInId;
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

	public Timestamp getUserShopCheckInDatetime() {
		return userShopCheckInDatetime;
	}

	public void setUserShopCheckInDatetime(Timestamp userShopCheckInDatetime) {
		this.userShopCheckInDatetime = userShopCheckInDatetime;
	}

	public int getUserShopCheckInMethod() {
		return userShopCheckInMethod;
	}

	public void setUserShopCheckInMethod(int userShopCheckInMethod) {
		this.userShopCheckInMethod = userShopCheckInMethod;
	}

	public int getUserShopCheckInStatus() {
		return userShopCheckInStatus;
	}

	public void setUserShopCheckInStatus(int userShopCheckInStatus) {
		this.userShopCheckInStatus = userShopCheckInStatus;
	}

	public int getUserShopCheckInSourcePage() {
		return userShopCheckInSourcePage;
	}

	public void setUserShopCheckInSourcePage(int userShopCheckInSourcePage) {
		this.userShopCheckInSourcePage = userShopCheckInSourcePage;
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
		return "UserShopCheckInEntity [userShopCheckInId=" + userShopCheckInId + ", userId=" + userId + ", shopId="
				+ shopId + ", userShopCheckInDatetime=" + userShopCheckInDatetime + ", userShopCheckInMethod="
				+ userShopCheckInMethod + ", userShopCheckInStatus=" + userShopCheckInStatus
				+ ", userShopCheckInSourcePage=" + userShopCheckInSourcePage + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + shopId;
		result = prime * result + userId;
		result = prime * result + ((userShopCheckInDatetime == null) ? 0 : userShopCheckInDatetime.hashCode());
		result = prime * result + userShopCheckInId;
		result = prime * result + userShopCheckInMethod;
		result = prime * result + userShopCheckInSourcePage;
		result = prime * result + userShopCheckInStatus;
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
		UserShopCheckInEntity other = (UserShopCheckInEntity) obj;
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
		if (userShopCheckInDatetime == null) {
			if (other.userShopCheckInDatetime != null)
				return false;
		} else if (!userShopCheckInDatetime.equals(other.userShopCheckInDatetime))
			return false;
		if (userShopCheckInId != other.userShopCheckInId)
			return false;
		if (userShopCheckInMethod != other.userShopCheckInMethod)
			return false;
		if (userShopCheckInSourcePage != other.userShopCheckInSourcePage)
			return false;
		if (userShopCheckInStatus != other.userShopCheckInStatus)
			return false;
		return true;
	}
	
		
}
