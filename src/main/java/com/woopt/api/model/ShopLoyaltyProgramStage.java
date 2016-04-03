package com.woopt.api.model;

public class ShopLoyaltyProgramStage {
	
    private int shopLoyaltyProgramStageNo;
    
    private String shopLoyaltyProgramStageName;
    
    private int shopLoyaltyProgramStagePromotionEligibility;
    
    private int shopLoyaltyProgramStageDiscount;

	public int getShopLoyaltyProgramStageNo() {
		return shopLoyaltyProgramStageNo;
	}

	public void setShopLoyaltyProgramStageNo(int shopLoyaltyProgramStageNo) {
		this.shopLoyaltyProgramStageNo = shopLoyaltyProgramStageNo;
	}

	public String getShopLoyaltyProgramStageName() {
		return shopLoyaltyProgramStageName;
	}

	public void setShopLoyaltyProgramStageName(String shopLoyaltyProgramStageName) {
		this.shopLoyaltyProgramStageName = shopLoyaltyProgramStageName;
	}

	public int getShopLoyaltyProgramStagePromotionEligibility() {
		return shopLoyaltyProgramStagePromotionEligibility;
	}

	public void setShopLoyaltyProgramStagePromotionEligibility(int shopLoyaltyProgramStagePromotionEligibility) {
		this.shopLoyaltyProgramStagePromotionEligibility = shopLoyaltyProgramStagePromotionEligibility;
	}

	public int getShopLoyaltyProgramStageDiscount() {
		return shopLoyaltyProgramStageDiscount;
	}

	public void setShopLoyaltyProgramStageDiscount(int shopLoyaltyProgramStageDiscount) {
		this.shopLoyaltyProgramStageDiscount = shopLoyaltyProgramStageDiscount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopLoyaltyProgramStageDiscount;
		result = prime * result + ((shopLoyaltyProgramStageName == null) ? 0 : shopLoyaltyProgramStageName.hashCode());
		result = prime * result + shopLoyaltyProgramStageNo;
		result = prime * result + shopLoyaltyProgramStagePromotionEligibility;
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
		ShopLoyaltyProgramStage other = (ShopLoyaltyProgramStage) obj;
		if (shopLoyaltyProgramStageDiscount != other.shopLoyaltyProgramStageDiscount)
			return false;
		if (shopLoyaltyProgramStageName == null) {
			if (other.shopLoyaltyProgramStageName != null)
				return false;
		} else if (!shopLoyaltyProgramStageName.equals(other.shopLoyaltyProgramStageName))
			return false;
		if (shopLoyaltyProgramStageNo != other.shopLoyaltyProgramStageNo)
			return false;
		if (shopLoyaltyProgramStagePromotionEligibility != other.shopLoyaltyProgramStagePromotionEligibility)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopLoyaltyProgramStage [shopLoyaltyProgramStageNo=" + shopLoyaltyProgramStageNo
				+ ", shopLoyaltyProgramStageName=" + shopLoyaltyProgramStageName
				+ ", shopLoyaltyProgramStagePromotionEligibility=" + shopLoyaltyProgramStagePromotionEligibility
				+ ", shopLoyaltyProgramStageDiscount=" + shopLoyaltyProgramStageDiscount + "]";
	}   
}