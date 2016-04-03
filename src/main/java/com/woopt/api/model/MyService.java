package com.woopt.api.model;

public class MyService {
	
	private int shopId;
	
	private String shopName;
	
    private String shopAddressArea;
    
    private String shopAddressCity;
    
    private int shopStatus;
    
    private int shopVerificationStatus;
    
    private int shopOpenStatus;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddressArea() {
		return shopAddressArea;
	}

	public void setShopAddressArea(String shopAddressArea) {
		this.shopAddressArea = shopAddressArea;
	}

	public String getShopAddressCity() {
		return shopAddressCity;
	}

	public void setShopAddressCity(String shopAddressCity) {
		this.shopAddressCity = shopAddressCity;
	}

	public int getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(int shopStatus) {
		this.shopStatus = shopStatus;
	}

	public int getShopVerificationStatus() {
		return shopVerificationStatus;
	}

	public void setShopVerificationStatus(int shopVerificationStatus) {
		this.shopVerificationStatus = shopVerificationStatus;
	}

	public int getShopOpenStatus() {
		return shopOpenStatus;
	}

	public void setShopOpenStatus(int shopOpenStatus) {
		this.shopOpenStatus = shopOpenStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shopAddressArea == null) ? 0 : shopAddressArea.hashCode());
		result = prime * result + ((shopAddressCity == null) ? 0 : shopAddressCity.hashCode());
		result = prime * result + shopId;
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		result = prime * result + shopOpenStatus;
		result = prime * result + shopStatus;
		result = prime * result + shopVerificationStatus;
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
		MyService other = (MyService) obj;
		if (shopAddressArea == null) {
			if (other.shopAddressArea != null)
				return false;
		} else if (!shopAddressArea.equals(other.shopAddressArea))
			return false;
		if (shopAddressCity == null) {
			if (other.shopAddressCity != null)
				return false;
		} else if (!shopAddressCity.equals(other.shopAddressCity))
			return false;
		if (shopId != other.shopId)
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		if (shopOpenStatus != other.shopOpenStatus)
			return false;
		if (shopStatus != other.shopStatus)
			return false;
		if (shopVerificationStatus != other.shopVerificationStatus)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyService [shopId=" + shopId + ", shopName=" + shopName + ", shopAddressArea=" + shopAddressArea
				+ ", shopAddressCity=" + shopAddressCity + ", shopStatus=" + shopStatus + ", shopVerificationStatus="
				+ shopVerificationStatus + ", shopOpenStatus=" + shopOpenStatus + "]";
	}  
}