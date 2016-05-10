package com.woopt.api.model;

public class ShopEmployee {
	
	private int shopEmployeeId;
	
	private User user;
	
	private int shopEmployeeStatus;
	
	private String shopEmployeeRole;

	public int getShopEmployeeId() {
		return shopEmployeeId;
	}

	public void setShopEmployeeId(int shopEmployeeId) {
		this.shopEmployeeId = shopEmployeeId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getShopEmployeeStatus() {
		return shopEmployeeStatus;
	}

	public void setShopEmployeeStatus(int shopEmployeeStatus) {
		this.shopEmployeeStatus = shopEmployeeStatus;
	}

	public String getShopEmployeeRole() {
		return shopEmployeeRole;
	}

	public void setShopEmployeeRole(String shopEmployeeRole) {
		this.shopEmployeeRole = shopEmployeeRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopEmployeeId;
		result = prime * result + ((shopEmployeeRole == null) ? 0 : shopEmployeeRole.hashCode());
		result = prime * result + shopEmployeeStatus;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		ShopEmployee other = (ShopEmployee) obj;
		if (shopEmployeeId != other.shopEmployeeId)
			return false;
		if (shopEmployeeRole == null) {
			if (other.shopEmployeeRole != null)
				return false;
		} else if (!shopEmployeeRole.equals(other.shopEmployeeRole))
			return false;
		if (shopEmployeeStatus != other.shopEmployeeStatus)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopEmployee [shopEmployeeId=" + shopEmployeeId + ", user=" + user + ", shopEmployeeStatus="
				+ shopEmployeeStatus + ", shopEmployeeRole=" + shopEmployeeRole + "]";
	}

	
}