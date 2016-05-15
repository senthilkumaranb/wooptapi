package com.woopt.api.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
@Entity
@Table(name = "WOOPT_OFFER")
public class OfferEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OFFER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer offerId;
	
	@Column(name = "OFFER_NAME")
	private String offerName;
	
	@Column(name = "OFFER_TYPE")
	private String offerType;
	
	@Column(name = "OFFER_METHOD")
	private String offerMethod;
	
	@Column(name = "OFFER_CODE")
	private String offerCode;
	
	@Column(name = "OFFER_QR_CODE")
	private String offerQRCode;
	
	@Column(name = "OFFER_AMOUNT")
	private double offerAmount;
	
	@Column(name = "OFFER_MINIMUM_ORDER")
	private Integer offerMinimumOrder;
	
	@Column(name = "OFFER_START_DATE")
	private Timestamp offerStartDate;
	
	@Column(name = "OFFER_EXPIRE_DATE")
	private Timestamp offerExpireDate;
	
	@Column(name = "OFFER_UNITS")
	private Integer offerUnits;
	
	@Column(name = "OFFER_ZONE_RESTRICTION")
	private Integer offerZoneRestriction;
	
	@Column(name = "OFFER_UNITS_PER_ZONE")
	private Integer offerUnitsPerZone;
	
	@Column(name = "OFFER_PER_USER")
	private Integer offerPerUser;

	@Column(name = "OFFER_STATUS")
	private Integer offerStatus;
	
	@Column(name = "OFFER_ZONES")
	private String offerZones;
	
	@Column(name = "OFFER_DESCRIPTION")
	private String offerDescription;
	
	@Column(name = "OFFER_PROFILE_PHOTO")
	private String offerProfilePhoto;
	
	@Column(name = "OFFER_PHOTO")
	private String offerPhoto;
	
	@Column(name = "OFFER_PRODUCT_ID")
	private String productId;
	
	@Column(name = "OFFER_ISIN_SHOP_BILLING_SYSTEM")
	private Integer offerIsInShopBillingSystem;
	
	@Column(name = "OFFER_WHO_CREATED")
	private Integer offerWhoCreated;
	
	@Column(name = "SHOP_ID")
	private Integer shopId;
	
	@Column(name = "OFFER_MANUFACTUREID")
	private Integer manufactureId;
	
	@Column(name = "OFFER_AVAILABLE_UNITS")
	private Integer offerAvailableUnits;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public OfferEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
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

	public String getOfferMethod() {
		return offerMethod;
	}

	public void setOfferMethod(String offerMethod) {
		this.offerMethod = offerMethod;
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

	public Timestamp getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(Timestamp offerStartDate) {
		this.offerStartDate = offerStartDate;
	}

	public Timestamp getOfferExpireDate() {
		return offerExpireDate;
	}

	public void setOfferExpireDate(Timestamp offerExpireDate) {
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

	public String getOfferProfilePhoto() {
		return offerProfilePhoto;
	}

	public void setOfferProfilePhoto(String offerProfilePhoto) {
		this.offerProfilePhoto = offerProfilePhoto;
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

	public Integer getManufactureId() {
		return manufactureId;
	}

	public void setManufactureId(Integer manufactureId) {
		this.manufactureId = manufactureId;
	}

	public Integer getOfferAvailableUnits() {
		return offerAvailableUnits;
	}

	public void setOfferAvailableUnits(Integer offerAvailableUnits) {
		this.offerAvailableUnits = offerAvailableUnits;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "OfferEntity [offerId=" + offerId + ", offerName=" + offerName + ", offerType=" + offerType
				+ ", offerMethod=" + offerMethod + ", offerCode=" + offerCode + ", offerQRCode=" + offerQRCode
				+ ", offerAmount=" + offerAmount + ", offerMinimumOrder=" + offerMinimumOrder + ", offerStartDate="
				+ offerStartDate + ", offerExpireDate=" + offerExpireDate + ", offerUnits=" + offerUnits
				+ ", offerZoneRestriction=" + offerZoneRestriction + ", offerUnitsPerZone=" + offerUnitsPerZone
				+ ", offerPerUser=" + offerPerUser + ", offerStatus=" + offerStatus + ", offerZones=" + offerZones
				+ ", offerDescription=" + offerDescription + ", offerProfilePhoto=" + offerProfilePhoto
				+ ", offerPhoto=" + offerPhoto + ", productId=" + productId + ", offerIsInShopBillingSystem="
				+ offerIsInShopBillingSystem + ", offerWhoCreated=" + offerWhoCreated + ", shopId=" + shopId
				+ ", manufactureId=" + manufactureId + ", offerAvailableUnits=" + offerAvailableUnits
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	
}
