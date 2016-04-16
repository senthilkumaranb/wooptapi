package com.woopt.api.model;

public class ShopLoyaltyProgramStage {
	
    private Integer shopLoyaltyProgramStageNo;
    
    private String shopLoyaltyProgramStageName;
    
    private Integer shopLoyaltyProgramStagePromotionEligibility;
    
    private String shopLoyaltyProgramStageDiscount;

	public Integer getShopLoyaltyProgramStageNo() {
		return shopLoyaltyProgramStageNo;
	}

	public void setShopLoyaltyProgramStageNo(Integer shopLoyaltyProgramStageNo) {
		this.shopLoyaltyProgramStageNo = shopLoyaltyProgramStageNo;
	}

	public String getShopLoyaltyProgramStageName() {
		return shopLoyaltyProgramStageName;
	}

	public void setShopLoyaltyProgramStageName(String shopLoyaltyProgramStageName) {
		this.shopLoyaltyProgramStageName = shopLoyaltyProgramStageName;
	}

	public Integer getShopLoyaltyProgramStagePromotionEligibility() {
		return shopLoyaltyProgramStagePromotionEligibility;
	}

	public void setShopLoyaltyProgramStagePromotionEligibility(Integer shopLoyaltyProgramStagePromotionEligibility) {
		this.shopLoyaltyProgramStagePromotionEligibility = shopLoyaltyProgramStagePromotionEligibility;
	}

	public String getShopLoyaltyProgramStageDiscount() {
		return shopLoyaltyProgramStageDiscount;
	}

	public void setShopLoyaltyProgramStageDiscount(String shopLoyaltyProgramStageDiscount) {
		this.shopLoyaltyProgramStageDiscount = shopLoyaltyProgramStageDiscount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((shopLoyaltyProgramStageDiscount == null) ? 0 : shopLoyaltyProgramStageDiscount.hashCode());
		result = prime * result + ((shopLoyaltyProgramStageName == null) ? 0 : shopLoyaltyProgramStageName.hashCode());
		result = prime * result + ((shopLoyaltyProgramStageNo == null) ? 0 : shopLoyaltyProgramStageNo.hashCode());
		result = prime * result + ((shopLoyaltyProgramStagePromotionEligibility == null) ? 0
				: shopLoyaltyProgramStagePromotionEligibility.hashCode());
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
		if (shopLoyaltyProgramStageDiscount == null) {
			if (other.shopLoyaltyProgramStageDiscount != null)
				return false;
		} else if (!shopLoyaltyProgramStageDiscount.equals(other.shopLoyaltyProgramStageDiscount))
			return false;
		if (shopLoyaltyProgramStageName == null) {
			if (other.shopLoyaltyProgramStageName != null)
				return false;
		} else if (!shopLoyaltyProgramStageName.equals(other.shopLoyaltyProgramStageName))
			return false;
		if (shopLoyaltyProgramStageNo == null) {
			if (other.shopLoyaltyProgramStageNo != null)
				return false;
		} else if (!shopLoyaltyProgramStageNo.equals(other.shopLoyaltyProgramStageNo))
			return false;
		if (shopLoyaltyProgramStagePromotionEligibility == null) {
			if (other.shopLoyaltyProgramStagePromotionEligibility != null)
				return false;
		} else
			if (!shopLoyaltyProgramStagePromotionEligibility.equals(other.shopLoyaltyProgramStagePromotionEligibility))
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