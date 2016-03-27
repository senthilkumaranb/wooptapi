package com.woopt.api.model;

import java.security.Timestamp;
import java.util.Arrays;

public class ShopLoyaltyCard {
	
    private int shopLoyaltyCardId;
    
    private String shopLoyaltyCardName;
    
    private int shopLoyaltyCardIsSameForAllbranches;
    
    private int shopLoyaltyCardStatus;
    
    private Timestamp shopLoyaltyCardStartDate;
    
    private Timestamp shopLoyaltyCardExpiryDate;
    
    private String shopLoyaltyProgramType;
    
    private int shopLoyaltyCardNoOfStages;
    
    private ShopLoyaltyCardStage[] shopLoyaltyCardStage;

	public int getShopLoyaltyCardId() {
		return shopLoyaltyCardId;
	}

	public void setShopLoyaltyCardId(int shopLoyaltyCardId) {
		this.shopLoyaltyCardId = shopLoyaltyCardId;
	}

	public String getShopLoyaltyCardName() {
		return shopLoyaltyCardName;
	}

	public void setShopLoyaltyCardName(String shopLoyaltyCardName) {
		this.shopLoyaltyCardName = shopLoyaltyCardName;
	}

	public int getShopLoyaltyCardIsSameForAllbranches() {
		return shopLoyaltyCardIsSameForAllbranches;
	}

	public void setShopLoyaltyCardIsSameForAllbranches(int shopLoyaltyCardIsSameForAllbranches) {
		this.shopLoyaltyCardIsSameForAllbranches = shopLoyaltyCardIsSameForAllbranches;
	}

	public int getShopLoyaltyCardStatus() {
		return shopLoyaltyCardStatus;
	}

	public void setShopLoyaltyCardStatus(int shopLoyaltyCardStatus) {
		this.shopLoyaltyCardStatus = shopLoyaltyCardStatus;
	}

	public Timestamp getShopLoyaltyCardStartDate() {
		return shopLoyaltyCardStartDate;
	}

	public void setShopLoyaltyCardStartDate(Timestamp shopLoyaltyCardStartDate) {
		this.shopLoyaltyCardStartDate = shopLoyaltyCardStartDate;
	}

	public Timestamp getShopLoyaltyCardExpiryDate() {
		return shopLoyaltyCardExpiryDate;
	}

	public void setShopLoyaltyCardExpiryDate(Timestamp shopLoyaltyCardExpiryDate) {
		this.shopLoyaltyCardExpiryDate = shopLoyaltyCardExpiryDate;
	}

	public String getShopLoyaltyProgramType() {
		return shopLoyaltyProgramType;
	}

	public void setShopLoyaltyProgramType(String shopLoyaltyProgramType) {
		this.shopLoyaltyProgramType = shopLoyaltyProgramType;
	}

	public int getShopLoyaltyCardNoOfStages() {
		return shopLoyaltyCardNoOfStages;
	}

	public void setShopLoyaltyCardNoOfStages(int shopLoyaltyCardNoOfStages) {
		this.shopLoyaltyCardNoOfStages = shopLoyaltyCardNoOfStages;
	}

	public ShopLoyaltyCardStage[] getShopLoyaltyCardStage() {
		return shopLoyaltyCardStage;
	}

	public void setShopLoyaltyCardStage(ShopLoyaltyCardStage[] shopLoyaltyCardStage) {
		this.shopLoyaltyCardStage = shopLoyaltyCardStage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shopLoyaltyCardExpiryDate == null) ? 0 : shopLoyaltyCardExpiryDate.hashCode());
		result = prime * result + shopLoyaltyCardId;
		result = prime * result + shopLoyaltyCardIsSameForAllbranches;
		result = prime * result + ((shopLoyaltyCardName == null) ? 0 : shopLoyaltyCardName.hashCode());
		result = prime * result + shopLoyaltyCardNoOfStages;
		result = prime * result + Arrays.hashCode(shopLoyaltyCardStage);
		result = prime * result + ((shopLoyaltyCardStartDate == null) ? 0 : shopLoyaltyCardStartDate.hashCode());
		result = prime * result + shopLoyaltyCardStatus;
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
		ShopLoyaltyCard other = (ShopLoyaltyCard) obj;
		if (shopLoyaltyCardExpiryDate == null) {
			if (other.shopLoyaltyCardExpiryDate != null)
				return false;
		} else if (!shopLoyaltyCardExpiryDate.equals(other.shopLoyaltyCardExpiryDate))
			return false;
		if (shopLoyaltyCardId != other.shopLoyaltyCardId)
			return false;
		if (shopLoyaltyCardIsSameForAllbranches != other.shopLoyaltyCardIsSameForAllbranches)
			return false;
		if (shopLoyaltyCardName == null) {
			if (other.shopLoyaltyCardName != null)
				return false;
		} else if (!shopLoyaltyCardName.equals(other.shopLoyaltyCardName))
			return false;
		if (shopLoyaltyCardNoOfStages != other.shopLoyaltyCardNoOfStages)
			return false;
		if (!Arrays.equals(shopLoyaltyCardStage, other.shopLoyaltyCardStage))
			return false;
		if (shopLoyaltyCardStartDate == null) {
			if (other.shopLoyaltyCardStartDate != null)
				return false;
		} else if (!shopLoyaltyCardStartDate.equals(other.shopLoyaltyCardStartDate))
			return false;
		if (shopLoyaltyCardStatus != other.shopLoyaltyCardStatus)
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
		return "ShopLoyaltyCard [shopLoyaltyCardId=" + shopLoyaltyCardId + ", shopLoyaltyCardName="
				+ shopLoyaltyCardName + ", shopLoyaltyCardIsSameForAllbranches=" + shopLoyaltyCardIsSameForAllbranches
				+ ", shopLoyaltyCardStatus=" + shopLoyaltyCardStatus + ", shopLoyaltyCardStartDate="
				+ shopLoyaltyCardStartDate + ", shopLoyaltyCardExpiryDate=" + shopLoyaltyCardExpiryDate
				+ ", shopLoyaltyProgramType=" + shopLoyaltyProgramType + ", shopLoyaltyCardNoOfStages="
				+ shopLoyaltyCardNoOfStages + ", shopLoyaltyCardStage=" + Arrays.toString(shopLoyaltyCardStage) + "]";
	}
    
    
}
