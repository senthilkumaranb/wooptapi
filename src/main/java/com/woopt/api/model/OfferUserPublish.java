package com.woopt.api.model;

public class OfferUserPublish {

	private int userId;
	private String offerUserPublishOfferCode;
	private String offerUserPublishMethod;
	private int offerUserPublishIsRedeemed;
	private String offerUserPublishDatetime;
	private String offerUserPublishDateOfRedeem;
	private int offerUserPublishRedeemShopId;
	private String offerUserPubilshRedeemMethod;
	private String offerUserPublishExpireDatetime;
	private int offerUserPublishIsShared;
	private int offerUserPublishStatus;
	private int offerUserPubilshWhoRedeemed;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public int getOfferUserPublishIsRedeemed() {
		return offerUserPublishIsRedeemed;
	}

	public void setOfferUserPublishIsRedeemed(int offerUserPublishIsRedeemed) {
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

	public int getOfferUserPublishRedeemShopId() {
		return offerUserPublishRedeemShopId;
	}

	public void setOfferUserPublishRedeemShopId(int offerUserPublishRedeemShopId) {
		this.offerUserPublishRedeemShopId = offerUserPublishRedeemShopId;
	}

	public String getOfferUserPubilshRedeemMethod() {
		return offerUserPubilshRedeemMethod;
	}

	public void setOfferUserPubilshRedeemMethod(String offerUserPubilshRedeemMethod) {
		this.offerUserPubilshRedeemMethod = offerUserPubilshRedeemMethod;
	}

	public String getOfferUserPublishExpireDatetime() {
		return offerUserPublishExpireDatetime;
	}

	public void setOfferUserPublishExpireDatetime(String offerUserPublishExpireDatetime) {
		this.offerUserPublishExpireDatetime = offerUserPublishExpireDatetime;
	}

	public int getOfferUserPublishIsShared() {
		return offerUserPublishIsShared;
	}

	public void setOfferUserPublishIsShared(int offerUserPublishIsShared) {
		this.offerUserPublishIsShared = offerUserPublishIsShared;
	}

	public int getOfferUserPublishStatus() {
		return offerUserPublishStatus;
	}

	public void setOfferUserPublishStatus(int offerUserPublishStatus) {
		this.offerUserPublishStatus = offerUserPublishStatus;
	}

	public int getOfferUserPubilshWhoRedeemed() {
		return offerUserPubilshWhoRedeemed;
	}

	public void setOfferUserPubilshWhoRedeemed(int offerUserPubilshWhoRedeemed) {
		this.offerUserPubilshWhoRedeemed = offerUserPubilshWhoRedeemed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((offerUserPubilshRedeemMethod == null) ? 0 : offerUserPubilshRedeemMethod.hashCode());
		result = prime * result + offerUserPubilshWhoRedeemed;
		result = prime * result
				+ ((offerUserPublishDateOfRedeem == null) ? 0 : offerUserPublishDateOfRedeem.hashCode());
		result = prime * result + ((offerUserPublishDatetime == null) ? 0 : offerUserPublishDatetime.hashCode());
		result = prime * result
				+ ((offerUserPublishExpireDatetime == null) ? 0 : offerUserPublishExpireDatetime.hashCode());
		result = prime * result + offerUserPublishIsRedeemed;
		result = prime * result + offerUserPublishIsShared;
		result = prime * result + ((offerUserPublishMethod == null) ? 0 : offerUserPublishMethod.hashCode());
		result = prime * result + ((offerUserPublishOfferCode == null) ? 0 : offerUserPublishOfferCode.hashCode());
		result = prime * result + offerUserPublishRedeemShopId;
		result = prime * result + offerUserPublishStatus;
		result = prime * result + userId;
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
		if (offerUserPubilshRedeemMethod == null) {
			if (other.offerUserPubilshRedeemMethod != null)
				return false;
		} else if (!offerUserPubilshRedeemMethod.equals(other.offerUserPubilshRedeemMethod))
			return false;
		if (offerUserPubilshWhoRedeemed != other.offerUserPubilshWhoRedeemed)
			return false;
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
		if (offerUserPublishIsRedeemed != other.offerUserPublishIsRedeemed)
			return false;
		if (offerUserPublishIsShared != other.offerUserPublishIsShared)
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
		if (offerUserPublishRedeemShopId != other.offerUserPublishRedeemShopId)
			return false;
		if (offerUserPublishStatus != other.offerUserPublishStatus)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OfferUserPublish [userId=" + userId + ", offerUserPublishOfferCode=" + offerUserPublishOfferCode
				+ ", offerUserPublishMethod=" + offerUserPublishMethod + ", offerUserPublishIsRedeemed="
				+ offerUserPublishIsRedeemed + ", offerUserPublishDatetime=" + offerUserPublishDatetime
				+ ", offerUserPublishDateOfRedeem=" + offerUserPublishDateOfRedeem + ", offerUserPublishRedeemShopId="
				+ offerUserPublishRedeemShopId + ", offerUserPubilshRedeemMethod=" + offerUserPubilshRedeemMethod
				+ ", offerUserPublishExpireDatetime=" + offerUserPublishExpireDatetime + ", offerUserPublishIsShared="
				+ offerUserPublishIsShared + ", offerUserPublishStatus=" + offerUserPublishStatus
				+ ", offerUserPubilshWhoRedeemed=" + offerUserPubilshWhoRedeemed + "]";
	}
}