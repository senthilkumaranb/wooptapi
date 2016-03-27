package com.woopt.api.model;

import java.security.Timestamp;

public class UserCheckIn {
	
	private int userId;
	private int shopId;
	private Timestamp userShopCheckinDatetime;
	private Timestamp userShopCheckinMethodName;
	private int userShopCheckinStatus;
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
	public Timestamp getUserShopCheckinDatetime() {
		return userShopCheckinDatetime;
	}
	public void setUserShopCheckinDatetime(Timestamp userShopCheckinDatetime) {
		this.userShopCheckinDatetime = userShopCheckinDatetime;
	}
	public Timestamp getUserShopCheckinMethodName() {
		return userShopCheckinMethodName;
	}
	public void setUserShopCheckinMethodName(Timestamp userShopCheckinMethodName) {
		this.userShopCheckinMethodName = userShopCheckinMethodName;
	}
	public int getUserShopCheckinStatus() {
		return userShopCheckinStatus;
	}
	public void setUserShopCheckinStatus(int userShopCheckinStatus) {
		this.userShopCheckinStatus = userShopCheckinStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopId;
		result = prime * result + userId;
		result = prime * result + ((userShopCheckinDatetime == null) ? 0 : userShopCheckinDatetime.hashCode());
		result = prime * result + ((userShopCheckinMethodName == null) ? 0 : userShopCheckinMethodName.hashCode());
		result = prime * result + userShopCheckinStatus;
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
		UserCheckIn other = (UserCheckIn) obj;
		if (shopId != other.shopId)
			return false;
		if (userId != other.userId)
			return false;
		if (userShopCheckinDatetime == null) {
			if (other.userShopCheckinDatetime != null)
				return false;
		} else if (!userShopCheckinDatetime.equals(other.userShopCheckinDatetime))
			return false;
		if (userShopCheckinMethodName == null) {
			if (other.userShopCheckinMethodName != null)
				return false;
		} else if (!userShopCheckinMethodName.equals(other.userShopCheckinMethodName))
			return false;
		if (userShopCheckinStatus != other.userShopCheckinStatus)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "UserCheckIn [userId=" + userId + ", shopId=" + shopId + ", userShopCheckinDatetime="
				+ userShopCheckinDatetime + ", userShopCheckinMethodName=" + userShopCheckinMethodName
				+ ", userShopCheckinStatus=" + userShopCheckinStatus + "]";
	}
	
	
}
