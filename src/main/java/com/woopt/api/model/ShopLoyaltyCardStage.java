package com.woopt.api.model;

public class ShopLoyaltyCardStage {
	
	private int shopLoyaltyCardStageNo;
	
    private int shopLoyaltyCardStageIsRedeemable;
    
    private String shopLoyaltyCardStageReward;
    
    private String shopLoyaltyCardStageRewardPhoto;
    
    private int shopLoyaltyCardStageStatus;

	public int getShopLoyaltyCardStageNo() {
		return shopLoyaltyCardStageNo;
	}

	public void setShopLoyaltyCardStageNo(int shopLoyaltyCardStageNo) {
		this.shopLoyaltyCardStageNo = shopLoyaltyCardStageNo;
	}

	public int getShopLoyaltyCardStageIsRedeemable() {
		return shopLoyaltyCardStageIsRedeemable;
	}

	public void setShopLoyaltyCardStageIsRedeemable(int shopLoyaltyCardStageIsRedeemable) {
		this.shopLoyaltyCardStageIsRedeemable = shopLoyaltyCardStageIsRedeemable;
	}

	public String getShopLoyaltyCardStageReward() {
		return shopLoyaltyCardStageReward;
	}

	public void setShopLoyaltyCardStageReward(String shopLoyaltyCardStageReward) {
		this.shopLoyaltyCardStageReward = shopLoyaltyCardStageReward;
	}

	public String getShopLoyaltyCardStageRewardPhoto() {
		return shopLoyaltyCardStageRewardPhoto;
	}

	public void setShopLoyaltyCardStageRewardPhoto(String shopLoyaltyCardStageRewardPhoto) {
		this.shopLoyaltyCardStageRewardPhoto = shopLoyaltyCardStageRewardPhoto;
	}

	public int getShopLoyaltyCardStageStatus() {
		return shopLoyaltyCardStageStatus;
	}

	public void setShopLoyaltyCardStageStatus(int shopLoyaltyCardStageStatus) {
		this.shopLoyaltyCardStageStatus = shopLoyaltyCardStageStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopLoyaltyCardStageIsRedeemable;
		result = prime * result + shopLoyaltyCardStageNo;
		result = prime * result + ((shopLoyaltyCardStageReward == null) ? 0 : shopLoyaltyCardStageReward.hashCode());
		result = prime * result
				+ ((shopLoyaltyCardStageRewardPhoto == null) ? 0 : shopLoyaltyCardStageRewardPhoto.hashCode());
		result = prime * result + shopLoyaltyCardStageStatus;
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
		ShopLoyaltyCardStage other = (ShopLoyaltyCardStage) obj;
		if (shopLoyaltyCardStageIsRedeemable != other.shopLoyaltyCardStageIsRedeemable)
			return false;
		if (shopLoyaltyCardStageNo != other.shopLoyaltyCardStageNo)
			return false;
		if (shopLoyaltyCardStageReward == null) {
			if (other.shopLoyaltyCardStageReward != null)
				return false;
		} else if (!shopLoyaltyCardStageReward.equals(other.shopLoyaltyCardStageReward))
			return false;
		if (shopLoyaltyCardStageRewardPhoto == null) {
			if (other.shopLoyaltyCardStageRewardPhoto != null)
				return false;
		} else if (!shopLoyaltyCardStageRewardPhoto.equals(other.shopLoyaltyCardStageRewardPhoto))
			return false;
		if (shopLoyaltyCardStageStatus != other.shopLoyaltyCardStageStatus)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShopLoyaltyCardStage [shopLoyaltyCardStageNo=" + shopLoyaltyCardStageNo
				+ ", shopLoyaltyCardStageIsRedeemable=" + shopLoyaltyCardStageIsRedeemable
				+ ", shopLoyaltyCardStageReward=" + shopLoyaltyCardStageReward + ", shopLoyaltyCardStageRewardPhoto="
				+ shopLoyaltyCardStageRewardPhoto + ", shopLoyaltyCardStageStatus=" + shopLoyaltyCardStageStatus + "]";
	}
    
    

}
