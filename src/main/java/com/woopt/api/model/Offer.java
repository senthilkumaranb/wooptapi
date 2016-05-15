package com.woopt.api.model;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class Offer {
	
	//not all the fields shown to users, need field level access control, else have different view model
	private Integer offerId;
	private String offerName;
	private String offerType;
	private String offerCode;
	private String offerQRCode;
	private double offerAmount;
	private Integer offerMinimumOrder;
	private String offerStartDate;
	private String offerExpireDate;
	private Integer offerUnits;
	private Integer offerZoneRestriction;
	private Integer offerUnitsPerZone;
	private Integer offerPerUser;
	private Integer offerStatus;
	private String offerZones;
	private String offerDescription;
	private String offerProfilephoto;
	private String offerPhoto;
	private String productId;
	private Integer offerIsInShopBillingSystem;
	private Integer offerWhoCreated;
	private Integer shopId;
	private Integer manufacturerid;
	private Integer offerAvailableUnits;
	
	private List<OfferUserPublish> offerUserPublish;

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getOfferQRCode() {
		return offerQRCode;
	}

	public void setOfferQRCode(String offerQRCode) {
		this.offerQRCode = offerQRCode;
	}

	public double getOfferAmount() {
		return offerAmount;
	}

	public void setOfferAmount(double offerAmount) {
		this.offerAmount = offerAmount;
	}

	public Integer getOfferMinimumOrder() {
		return offerMinimumOrder;
	}

	public void setOfferMinimumOrder(Integer offerMinimumOrder) {
		this.offerMinimumOrder = offerMinimumOrder;
	}

	public String getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(String offerStartDate) {
		this.offerStartDate = offerStartDate;
	}

	public String getOfferExpireDate() {
		return offerExpireDate;
	}

	public void setOfferExpireDate(String offerExpireDate) {
		this.offerExpireDate = offerExpireDate;
	}

	public Integer getOfferUnits() {
		return offerUnits;
	}

	public void setOfferUnits(Integer offerUnits) {
		this.offerUnits = offerUnits;
	}

	public Integer getOfferZoneRestriction() {
		return offerZoneRestriction;
	}

	public void setOfferZoneRestriction(Integer offerZoneRestriction) {
		this.offerZoneRestriction = offerZoneRestriction;
	}

	public Integer getOfferUnitsPerZone() {
		return offerUnitsPerZone;
	}

	public void setOfferUnitsPerZone(Integer offerUnitsPerZone) {
		this.offerUnitsPerZone = offerUnitsPerZone;
	}

	public Integer getOfferPerUser() {
		return offerPerUser;
	}

	public void setOfferPerUser(Integer offerPerUser) {
		this.offerPerUser = offerPerUser;
	}

	public Integer getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(Integer offerStatus) {
		this.offerStatus = offerStatus;
	}

	public String getOfferZones() {
		return offerZones;
	}

	public void setOfferZones(String offerZones) {
		this.offerZones = offerZones;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public String getOfferProfilephoto() {
		return offerProfilephoto;
	}

	public void setOfferProfilephoto(String offerProfilephoto) {
		this.offerProfilephoto = offerProfilephoto;
	}

	public String getOfferPhoto() {
		return offerPhoto;
	}

	public void setOfferPhoto(String offerPhoto) {
		this.offerPhoto = offerPhoto;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getOfferIsInShopBillingSystem() {
		return offerIsInShopBillingSystem;
	}

	public void setOfferIsInShopBillingSystem(Integer offerIsInShopBillingSystem) {
		this.offerIsInShopBillingSystem = offerIsInShopBillingSystem;
	}

	public Integer getOfferWhoCreated() {
		return offerWhoCreated;
	}

	public void setOfferWhoCreated(Integer offerWhoCreated) {
		this.offerWhoCreated = offerWhoCreated;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getManufacturerid() {
		return manufacturerid;
	}

	public void setManufacturerid(Integer manufacturerid) {
		this.manufacturerid = manufacturerid;
	}

	public Integer getOfferAvailableUnits() {
		return offerAvailableUnits;
	}

	public void setOfferAvailableUnits(Integer offerAvailableUnits) {
		this.offerAvailableUnits = offerAvailableUnits;
	}

	public List<OfferUserPublish> getOfferUserPublish() {
		return offerUserPublish;
	}

	public void setOfferUserPublish(List<OfferUserPublish> offerUserPublish) {
		this.offerUserPublish = offerUserPublish;
	}

	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", offerName=" + offerName + ", offerType=" + offerType + ", offerCode="
				+ offerCode + ", offerQRCode=" + offerQRCode + ", offerAmount=" + offerAmount + ", offerMinimumOrder="
				+ offerMinimumOrder + ", offerStartDate=" + offerStartDate + ", offerExpireDate=" + offerExpireDate
				+ ", offerUnits=" + offerUnits + ", offerZoneRestriction=" + offerZoneRestriction
				+ ", offerUnitsPerZone=" + offerUnitsPerZone + ", offerPerUser=" + offerPerUser + ", offerStatus="
				+ offerStatus + ", offerZones=" + offerZones + ", offerDescription=" + offerDescription
				+ ", offerProfilephoto=" + offerProfilephoto + ", offerPhoto=" + offerPhoto + ", productId=" + productId
				+ ", offerIsInShopBillingSystem=" + offerIsInShopBillingSystem + ", offerWhoCreated=" + offerWhoCreated
				+ ", shopId=" + shopId + ", manufacturerid=" + manufacturerid + ", offerAvailableUnits="
				+ offerAvailableUnits + ", offerUserPublish=" + offerUserPublish + "]";
	}


}