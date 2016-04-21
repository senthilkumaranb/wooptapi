package com.woopt.api.model;

public class OfferUserPublish {

	private Integer offerUserPublishId;
	private Integer userId;
	private String offerUserPublishOfferCode;
	private String offerUserPublishMethod;
	private Integer offerUserPublishIsRedeemed;
	private String offerUserPublishDatetime;
	private String offerUserPublishDateOfRedeem;
	private Integer offerUserPublishRedeemShopId;
	private String offerUserPublishRedeemMethod;
	private String offerUserPublishExpireDatetime;
	private Integer offerUserPublishIsShared;
	private Integer offerUserPublishStatus;
	private Integer offerUserPublishWhoRedeemed;
	public Integer getOfferUserPublishId() {
		return offerUserPublishId;
	}
	public void setOfferUserPublishId(Integer offerUserPublishId) {
		this.offerUserPublishId = offerUserPublishId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getOfferUserPublishOfferCode() {
		return offerUserPublishOfferCode;
	}
	public void setOfferUserPublishOfferCode(String offerUserPublishOfferCode) {
		this.offerUserPublishOfferCode = offerUserPublishOfferCode;
	}
	public String getOfferUserPublishMethod() {
		return offerUserPublishMethod;
	}
	public void setOfferUserPublishMethod(String offerUserPublishMethod) {
		this.offerUserPublishMethod = offerUserPublishMethod;
	}
	public Integer getOfferUserPublishIsRedeemed() {
		return offerUserPublishIsRedeemed;
	}
	public void setOfferUserPublishIsRedeemed(Integer offerUserPublishIsRedeemed) {
		this.offerUserPublishIsRedeemed = offerUserPublishIsRedeemed;
	}
	public String getOfferUserPublishDatetime() {
		return offerUserPublishDatetime;
	}
	public void setOfferUserPublishDatetime(String offerUserPublishDatetime) {
		this.offerUserPublishDatetime = offerUserPublishDatetime;
	}
	public String getOfferUserPublishDateOfRedeem() {
		return offerUserPublishDateOfRedeem;
	}
	public void setOfferUserPublishDateOfRedeem(String offerUserPublishDateOfRedeem) {
		this.offerUserPublishDateOfRedeem = offerUserPublishDateOfRedeem;
	}
	public Integer getOfferUserPublishRedeemShopId() {
		return offerUserPublishRedeemShopId;
	}
	public void setOfferUserPublishRedeemShopId(Integer offerUserPublishRedeemShopId) {
		this.offerUserPublishRedeemShopId = offerUserPublishRedeemShopId;
	}
	public String getOfferUserPublishRedeemMethod() {
		return offerUserPublishRedeemMethod;
	}
	public void setOfferUserPublishRedeemMethod(String offerUserPublishRedeemMethod) {
		this.offerUserPublishRedeemMethod = offerUserPublishRedeemMethod;
	}
	public String getOfferUserPublishExpireDatetime() {
		return offerUserPublishExpireDatetime;
	}
	public void setOfferUserPublishExpireDatetime(String offerUserPublishExpireDatetime) {
		this.offerUserPublishExpireDatetime = offerUserPublishExpireDatetime;
	}
	public Integer getOfferUserPublishIsShared() {
		return offerUserPublishIsShared;
	}
	public void setOfferUserPublishIsShared(Integer offerUserPublishIsShared) {
		this.offerUserPublishIsShared = offerUserPublishIsShared;
	}
	public Integer getOfferUserPublishStatus() {
		return offerUserPublishStatus;
	}
	public void setOfferUserPublishStatus(Integer offerUserPublishStatus) {
		this.offerUserPublishStatus = offerUserPublishStatus;
	}
	public Integer getOfferUserPublishWhoRedeemed() {
		return offerUserPublishWhoRedeemed;
	}
	public void setOfferUserPublishWhoRedeemed(Integer offerUserPublishWhoRedeemed) {
		this.offerUserPublishWhoRedeemed = offerUserPublishWhoRedeemed;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((offerUserPublishDateOfRedeem == null) ? 0 : offerUserPublishDateOfRedeem.hashCode());
		result = prime * result + ((offerUserPublishDatetime == null) ? 0 : offerUserPublishDatetime.hashCode());
		result = prime * result
				+ ((offerUserPublishExpireDatetime == null) ? 0 : offerUserPublishExpireDatetime.hashCode());
		result = prime * result + ((offerUserPublishId == null) ? 0 : offerUserPublishId.hashCode());
		result = prime * result + ((offerUserPublishIsRedeemed == null) ? 0 : offerUserPublishIsRedeemed.hashCode());
		result = prime * result + ((offerUserPublishIsShared == null) ? 0 : offerUserPublishIsShared.hashCode());
		result = prime * result + ((offerUserPublishMethod == null) ? 0 : offerUserPublishMethod.hashCode());
		result = prime * result + ((offerUserPublishOfferCode == null) ? 0 : offerUserPublishOfferCode.hashCode());
		result = prime * result
				+ ((offerUserPublishRedeemMethod == null) ? 0 : offerUserPublishRedeemMethod.hashCode());
		result = prime * result
				+ ((offerUserPublishRedeemShopId == null) ? 0 : offerUserPublishRedeemShopId.hashCode());
		result = prime * result + ((offerUserPublishStatus == null) ? 0 : offerUserPublishStatus.hashCode());
		result = prime * result + ((offerUserPublishWhoRedeemed == null) ? 0 : offerUserPublishWhoRedeemed.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		OfferUserPublish other = (OfferUserPublish) obj;
		if (offerUserPublishDateOfRedeem == null) {
			if (other.offerUserPublishDateOfRedeem != null)
				return false;
		} else if (!offerUserPublishDateOfRedeem.equals(other.offerUserPublishDateOfRedeem))
			return false;
		if (offerUserPublishDatetime == null) {
			if (other.offerUserPublishDatetime != null)
				return false;
		} else if (!offerUserPublishDatetime.equals(other.offerUserPublishDatetime))
			return false;
		if (offerUserPublishExpireDatetime == null) {
			if (other.offerUserPublishExpireDatetime != null)
				return false;
		} else if (!offerUserPublishExpireDatetime.equals(other.offerUserPublishExpireDatetime))
			return false;
		if (offerUserPublishId == null) {
			if (other.offerUserPublishId != null)
				return false;
		} else if (!offerUserPublishId.equals(other.offerUserPublishId))
			return false;
		if (offerUserPublishIsRedeemed == null) {
			if (other.offerUserPublishIsRedeemed != null)
				return false;
		} else if (!offerUserPublishIsRedeemed.equals(other.offerUserPublishIsRedeemed))
			return false;
		if (offerUserPublishIsShared == null) {
			if (other.offerUserPublishIsShared != null)
				return false;
		} else if (!offerUserPublishIsShared.equals(other.offerUserPublishIsShared))
			return false;
		if (offerUserPublishMethod == null) {
			if (other.offerUserPublishMethod != null)
				return false;
		} else if (!offerUserPublishMethod.equals(other.offerUserPublishMethod))
			return false;
		if (offerUserPublishOfferCode == null) {
			if (other.offerUserPublishOfferCode != null)
				return false;
		} else if (!offerUserPublishOfferCode.equals(other.offerUserPublishOfferCode))
			return false;
		if (offerUserPublishRedeemMethod == null) {
			if (other.offerUserPublishRedeemMethod != null)
				return false;
		} else if (!offerUserPublishRedeemMethod.equals(other.offerUserPublishRedeemMethod))
			return false;
		if (offerUserPublishRedeemShopId == null) {
			if (other.offerUserPublishRedeemShopId != null)
				return false;
		} else if (!offerUserPublishRedeemShopId.equals(other.offerUserPublishRedeemShopId))
			return false;
		if (offerUserPublishStatus == null) {
			if (other.offerUserPublishStatus != null)
				return false;
		} else if (!offerUserPublishStatus.equals(other.offerUserPublishStatus))
			return false;
		if (offerUserPublishWhoRedeemed == null) {
			if (other.offerUserPublishWhoRedeemed != null)
				return false;
		} else if (!offerUserPublishWhoRedeemed.equals(other.offerUserPublishWhoRedeemed))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OfferUserPublish [offerUserPublishId=" + offerUserPublishId + ", userId=" + userId
				+ ", offerUserPublishOfferCode=" + offerUserPublishOfferCode + ", offerUserPublishMethod="
				+ offerUserPublishMethod + ", offerUserPublishIsRedeemed=" + offerUserPublishIsRedeemed
				+ ", offerUserPublishDatetime=" + offerUserPublishDatetime + ", offerUserPublishDateOfRedeem="
				+ offerUserPublishDateOfRedeem + ", offerUserPublishRedeemShopId=" + offerUserPublishRedeemShopId
				+ ", offerUserPublishRedeemMethod=" + offerUserPublishRedeemMethod + ", offerUserPublishExpireDatetime="
				+ offerUserPublishExpireDatetime + ", offerUserPublishIsShared=" + offerUserPublishIsShared
				+ ", offerUserPublishStatus=" + offerUserPublishStatus + ", offerUserPublishWhoRedeemed="
				+ offerUserPublishWhoRedeemed + "]";
	}

	
}