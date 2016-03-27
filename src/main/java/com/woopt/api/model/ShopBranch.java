package com.woopt.api.model;

public class ShopBranch {
	
	private int shopBranchesShopId;
	
	private String shopName;
	
	private int shopProprietorId;
	
	private String shopPhone;
	
	private String shopMobile;

	private int shopBranchesStatus;
	
	private int shopBranchesManagerId;

	public int getShopBranchesShopId() {
		return shopBranchesShopId;
	}

	public void setShopBranchesShopId(int shopBranchesShopId) {
		this.shopBranchesShopId = shopBranchesShopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getShopProprietorId() {
		return shopProprietorId;
	}

	public void setShopProprietorId(int shopProprietorId) {
		this.shopProprietorId = shopProprietorId;
	}

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public String getShopMobile() {
		return shopMobile;
	}

	public void setShopMobile(String shopMobile) {
		this.shopMobile = shopMobile;
	}

	public int getShopBranchesStatus() {
		return shopBranchesStatus;
	}

	public void setShopBranchesStatus(int shopBranchesStatus) {
		this.shopBranchesStatus = shopBranchesStatus;
	}

	public int getShopBranchesManagerId() {
		return shopBranchesManagerId;
	}

	public void setShopBranchesManagerId(int shopBranchesManagerId) {
		this.shopBranchesManagerId = shopBranchesManagerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopBranchesManagerId;
		result = prime * result + shopBranchesShopId;
		result = prime * result + shopBranchesStatus;
		result = prime * result + ((shopMobile == null) ? 0 : shopMobile.hashCode());
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		result = prime * result + ((shopPhone == null) ? 0 : shopPhone.hashCode());
		result = prime * result + shopProprietorId;
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
		ShopBranch other = (ShopBranch) obj;
		if (shopBranchesManagerId != other.shopBranchesManagerId)
			return false;
		if (shopBranchesShopId != other.shopBranchesShopId)
			return false;
		if (shopBranchesStatus != other.shopBranchesStatus)
			return false;
		if (shopMobile == null) {
			if (other.shopMobile != null)
				return false;
		} else if (!shopMobile.equals(other.shopMobile))
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		if (shopPhone == null) {
			if (other.shopPhone != null)
				return false;
		} else if (!shopPhone.equals(other.shopPhone))
			return false;
		if (shopProprietorId != other.shopProprietorId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopBranch [shopBranchesShopId=" + shopBranchesShopId + ", shopName=" + shopName + ", shopProprietorId="
				+ shopProprietorId + ", shopPhone=" + shopPhone + ", shopMobile=" + shopMobile + ", shopBranchesStatus="
				+ shopBranchesStatus + ", shopBranchesManagerId=" + shopBranchesManagerId + "]";
	}
	
	
}
