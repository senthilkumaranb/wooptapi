package com.woopt.api.model;

import java.util.Arrays;
import java.util.List;

public class ShopLoyaltyProgram {
	
	private int shopLoyaltyProgramId;
	
    private String shopLoyaltyProgramName;
    
    private String shopLoyaltyProgramType;
    
    private int shopLoyaltyProgramNoOfStages;
    
    private ShopLoyaltyProgramStage shopLoyaltyProgramCurrentStage;

    private List<ShopLoyaltyProgramStage> shopLoyaltyProgramStage;

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

	public String getShopLoyaltyProgramType() {
		return shopLoyaltyProgramType;
	}

	public void setShopLoyaltyProgramType(String shopLoyaltyProgramType) {
		this.shopLoyaltyProgramType = shopLoyaltyProgramType;
	}

	public int getShopLoyaltyProgramNoOfStages() {
		return shopLoyaltyProgramNoOfStages;
	}

	public void setShopLoyaltyProgramNoOfStages(int shopLoyaltyProgramNoOfStages) {
		this.shopLoyaltyProgramNoOfStages = shopLoyaltyProgramNoOfStages;
	}

	public ShopLoyaltyProgramStage getShopLoyaltyProgramCurrentStage() {
		return shopLoyaltyProgramCurrentStage;
	}

	public void setShopLoyaltyProgramCurrentStage(ShopLoyaltyProgramStage shopLoyaltyProgramCurrentStage) {
		this.shopLoyaltyProgramCurrentStage = shopLoyaltyProgramCurrentStage;
	}

	public List<ShopLoyaltyProgramStage> getShopLoyaltyProgramStage() {
		return shopLoyaltyProgramStage;
	}

	public void setShopLoyaltyProgramStage(List<ShopLoyaltyProgramStage> shopLoyaltyProgramStage) {
		this.shopLoyaltyProgramStage = shopLoyaltyProgramStage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((shopLoyaltyProgramCurrentStage == null) ? 0 : shopLoyaltyProgramCurrentStage.hashCode());
		result = prime * result + shopLoyaltyProgramId;
		result = prime * result + ((shopLoyaltyProgramName == null) ? 0 : shopLoyaltyProgramName.hashCode());
		result = prime * result + shopLoyaltyProgramNoOfStages;
		result = prime * result + ((shopLoyaltyProgramStage == null) ? 0 : shopLoyaltyProgramStage.hashCode());
		result = prime * result + ((shopLoyaltyProgramType == null) ? 0 : shopLoyaltyProgramType.hashCode());
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
		ShopLoyaltyProgram other = (ShopLoyaltyProgram) obj;
		if (shopLoyaltyProgramCurrentStage == null) {
			if (other.shopLoyaltyProgramCurrentStage != null)
				return false;
		} else if (!shopLoyaltyProgramCurrentStage.equals(other.shopLoyaltyProgramCurrentStage))
			return false;
		if (shopLoyaltyProgramId != other.shopLoyaltyProgramId)
			return false;
		if (shopLoyaltyProgramName == null) {
			if (other.shopLoyaltyProgramName != null)
				return false;
		} else if (!shopLoyaltyProgramName.equals(other.shopLoyaltyProgramName))
			return false;
		if (shopLoyaltyProgramNoOfStages != other.shopLoyaltyProgramNoOfStages)
			return false;
		if (shopLoyaltyProgramStage == null) {
			if (other.shopLoyaltyProgramStage != null)
				return false;
		} else if (!shopLoyaltyProgramStage.equals(other.shopLoyaltyProgramStage))
			return false;
		if (shopLoyaltyProgramType == null) {
			if (other.shopLoyaltyProgramType != null)
				return false;
		} else if (!shopLoyaltyProgramType.equals(other.shopLoyaltyProgramType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopLoyaltyProgram [shopLoyaltyProgramId=" + shopLoyaltyProgramId + ", shopLoyaltyProgramName="
				+ shopLoyaltyProgramName + ", shopLoyaltyProgramType=" + shopLoyaltyProgramType
				+ ", shopLoyaltyProgramNoOfStages=" + shopLoyaltyProgramNoOfStages + ", shopLoyaltyProgramCurrentStage="
				+ shopLoyaltyProgramCurrentStage + ", shopLoyaltyProgramStage=" + shopLoyaltyProgramStage + "]";
	}
}