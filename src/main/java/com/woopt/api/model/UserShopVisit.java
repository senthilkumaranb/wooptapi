package com.woopt.api.model;

public class UserShopVisit {

	private int userId;
	private int shopId;
	private int userShopStatus;
	private int userShopIsFavourite;
	private int userShopNoOfVisits;
	private String userFirstVisted;
	private String userLastVisited;
	private int userShopTotalTransaction;
	private int userShopTotalRedeemed;
	private int userShopRating;

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

	public int getUserShopNoOfVisits() {
		return userShopNoOfVisits;
	}

	public void setUserShopNoOfVisits(int userShopNoOfVisits) {
		this.userShopNoOfVisits = userShopNoOfVisits;
	}

	public String getUserFirstVisted() {
		return userFirstVisted;
	}

	public void setUserFirstVisted(String userFirstVisted) {
		this.userFirstVisted = userFirstVisted;
	}

	public String getUserLastVisited() {
		return userLastVisited;
	}

	public void setUserLastVisited(String userLastVisited) {
		this.userLastVisited = userLastVisited;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopId;
		result = prime * result + ((userFirstVisted == null) ? 0 : userFirstVisted.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userLastVisited == null) ? 0 : userLastVisited.hashCode());
		result = prime * result + userShopIsFavourite;
		result = prime * result + userShopNoOfVisits;
		result = prime * result + userShopRating;
		result = prime * result + userShopStatus;
		result = prime * result + userShopTotalRedeemed;
		result = prime * result + userShopTotalTransaction;
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
		UserShopVisit other = (UserShopVisit) obj;
		if (shopId != other.shopId)
			return false;
		if (userFirstVisted == null) {
			if (other.userFirstVisted != null)
				return false;
		} else if (!userFirstVisted.equals(other.userFirstVisted))
			return false;
		if (userId != other.userId)
			return false;
		if (userLastVisited == null) {
			if (other.userLastVisited != null)
				return false;
		} else if (!userLastVisited.equals(other.userLastVisited))
			return false;
		if (userShopIsFavourite != other.userShopIsFavourite)
			return false;
		if (userShopNoOfVisits != other.userShopNoOfVisits)
			return false;
		if (userShopRating != other.userShopRating)
			return false;
		if (userShopStatus != other.userShopStatus)
			return false;
		if (userShopTotalRedeemed != other.userShopTotalRedeemed)
			return false;
		if (userShopTotalTransaction != other.userShopTotalTransaction)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserShopVisit [userId=" + userId + ", shopId=" + shopId + ", userShopStatus=" + userShopStatus
				+ ", userShopIsFavourite=" + userShopIsFavourite + ", userShopNoOfVisits=" + userShopNoOfVisits
				+ ", userFirstVisted=" + userFirstVisted + ", userLastVisited=" + userLastVisited
				+ ", userShopTotalTransaction=" + userShopTotalTransaction + ", userShopTotalRedeemed="
				+ userShopTotalRedeemed + ", userShopRating=" + userShopRating + "]";
	}
}