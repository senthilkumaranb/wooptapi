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
	private int offerId;
	
	@Column(name = "OFFER_NAME")
	private String offerName;
	
	@Column(name = "OFFER_TYPE")
	private String offerType;
	
	@Column(name = "OFFER_METHOD")
	private String offerMethod;
	
	@Column(name = "OFFER_CODE")
	private String offerCode;
	
	@Column(name = "OFFER_QR_CODE")
	private String offerQrCode;
	
	@Column(name = "OFFER_AMOUNT")
	private String offerAmount;
	
	@Column(name = "OFFER_MINIMUM_ORDER")
	private String offerMinimumOrder;
	
	@Column(name = "OFFER_START_DATE")
	private Timestamp offerStartDate;
	
	@Column(name = "OFFER_EXPIRE_DATE")
	private Timestamp offerExpireDate;
	
	@Column(name = "OFFER_UNITS")
	private int offerUnits;
	
	@Column(name = "OFFER_ZONE_RESTRICTION")
	private int offerZoneRestriction;
	
	@Column(name = "OFFER_UNITS_PER_ZONE")
	private int offerUnitsPerZone;
	
	@Column(name = "OFFER_PER_USER")
	private int offerPerUser;

	@Column(name = "OFFER_STATUS")
	private int offerStatus;
	
	@Column(name = "OFFER_ZONES")
	private String offerZones;
	
	@Column(name = "OFFER_DESCRIPTION")
	private String offerDescription;
	
	@Column(name = "OFFER_PROFILE_PHOTO")
	private String offerProfilePhoto;
	
	@Column(name = "OFFER_PHOTO")
	private String offerPhoto;
	
	@Column(name = "OFFER_PRODUCT_ID")
	private String offerProductId;
	
	@Column(name = "OFFER_ISIN_SHOP_BILLING_SYSTEM")
	private String offerIsInShopBillingSystem;
	
	@Column(name = "OFFER_WHO_CREATED")
	private int offerWhoCreated;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "OFFER_MANUFACTUREID")
	private int offerManufactureId;
	
	@Column(name = "OFFER_AVAILABLE_UNITS")
	private int offerAvailableUnits;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

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

	public String getOfferQrCode() {
		return offerQrCode;
	}

	public void setOfferQrCode(String offerQrCode) {
		this.offerQrCode = offerQrCode;
	}

	public String getOfferAmount() {
		return offerAmount;
	}

	public void setOfferAmount(String offerAmount) {
		this.offerAmount = offerAmount;
	}

	public String getOfferMinimumOrder() {
		return offerMinimumOrder;
	}

	public void setOfferMinimumOrder(String offerMinimumOrder) {
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

	public int getOfferUnits() {
		return offerUnits;
	}

	public void setOfferUnits(int offerUnits) {
		this.offerUnits = offerUnits;
	}

	public int getOfferZoneRestriction() {
		return offerZoneRestriction;
	}

	public void setOfferZoneRestriction(int offerZoneRestriction) {
		this.offerZoneRestriction = offerZoneRestriction;
	}

	public int getOfferUnitsPerZone() {
		return offerUnitsPerZone;
	}

	public void setOfferUnitsPerZone(int offerUnitsPerZone) {
		this.offerUnitsPerZone = offerUnitsPerZone;
	}

	public int getOfferPerUser() {
		return offerPerUser;
	}

	public void setOfferPerUser(int offerPerUser) {
		this.offerPerUser = offerPerUser;
	}

	public int getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(int offerStatus) {
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

	public String getOfferProductId() {
		return offerProductId;
	}

	public void setOfferProductId(String offerProductId) {
		this.offerProductId = offerProductId;
	}

	public String getOfferIsInShopBillingSystem() {
		return offerIsInShopBillingSystem;
	}

	public void setOfferIsInShopBillingSystem(String offerIsInShopBillingSystem) {
		this.offerIsInShopBillingSystem = offerIsInShopBillingSystem;
	}

	public int getOfferWhoCreated() {
		return offerWhoCreated;
	}

	public void setOfferWhoCreated(int offerWhoCreated) {
		this.offerWhoCreated = offerWhoCreated;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getOfferManufactureId() {
		return offerManufactureId;
	}

	public void setOfferManufactureId(int offerManufactureId) {
		this.offerManufactureId = offerManufactureId;
	}

	public int getOfferAvailableUnits() {
		return offerAvailableUnits;
	}

	public void setOfferAvailableUnits(int offerAvailableUnits) {
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
				+ ", offerMethod=" + offerMethod + ", offerCode=" + offerCode + ", offerQrCode=" + offerQrCode
				+ ", offerAmount=" + offerAmount + ", offerMinimumOrder=" + offerMinimumOrder + ", offerStartDate="
				+ offerStartDate + ", offerExpireDate=" + offerExpireDate + ", offerUnits=" + offerUnits
				+ ", offerZoneRestriction=" + offerZoneRestriction + ", offerUnitsPerZone=" + offerUnitsPerZone
				+ ", offerPerUser=" + offerPerUser + ", offerStatus=" + offerStatus + ", offerZones=" + offerZones
				+ ", offerDescription=" + offerDescription + ", offerProfilePhoto=" + offerProfilePhoto
				+ ", offerPhoto=" + offerPhoto + ", offerProductId=" + offerProductId + ", offerIsInShopBillingSystem="
				+ offerIsInShopBillingSystem + ", offerWhoCreated=" + offerWhoCreated + ", shopId=" + shopId
				+ ", offerManufactureId=" + offerManufactureId + ", offerAvailableUnits=" + offerAvailableUnits
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + ((offerAmount == null) ? 0 : offerAmount.hashCode());
		result = prime * result + offerAvailableUnits;
		result = prime * result + ((offerCode == null) ? 0 : offerCode.hashCode());
		result = prime * result + ((offerDescription == null) ? 0 : offerDescription.hashCode());
		result = prime * result + ((offerExpireDate == null) ? 0 : offerExpireDate.hashCode());
		result = prime * result + offerId;
		result = prime * result + ((offerIsInShopBillingSystem == null) ? 0 : offerIsInShopBillingSystem.hashCode());
		result = prime * result + offerManufactureId;
		result = prime * result + ((offerMethod == null) ? 0 : offerMethod.hashCode());
		result = prime * result + ((offerMinimumOrder == null) ? 0 : offerMinimumOrder.hashCode());
		result = prime * result + ((offerName == null) ? 0 : offerName.hashCode());
		result = prime * result + offerPerUser;
		result = prime * result + ((offerPhoto == null) ? 0 : offerPhoto.hashCode());
		result = prime * result + ((offerProductId == null) ? 0 : offerProductId.hashCode());
		result = prime * result + ((offerProfilePhoto == null) ? 0 : offerProfilePhoto.hashCode());
		result = prime * result + ((offerQrCode == null) ? 0 : offerQrCode.hashCode());
		result = prime * result + ((offerStartDate == null) ? 0 : offerStartDate.hashCode());
		result = prime * result + offerStatus;
		result = prime * result + ((offerType == null) ? 0 : offerType.hashCode());
		result = prime * result + offerUnits;
		result = prime * result + offerUnitsPerZone;
		result = prime * result + offerWhoCreated;
		result = prime * result + offerZoneRestriction;
		result = prime * result + ((offerZones == null) ? 0 : offerZones.hashCode());
		result = prime * result + shopId;
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
		OfferEntity other = (OfferEntity) obj;
		if (createdDatetime == null) {
			if (other.createdDatetime != null)
				return false;
		} else if (!createdDatetime.equals(other.createdDatetime))
			return false;
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null)
				return false;
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime))
			return false;
		if (offerAmount == null) {
			if (other.offerAmount != null)
				return false;
		} else if (!offerAmount.equals(other.offerAmount))
			return false;
		if (offerAvailableUnits != other.offerAvailableUnits)
			return false;
		if (offerCode == null) {
			if (other.offerCode != null)
				return false;
		} else if (!offerCode.equals(other.offerCode))
			return false;
		if (offerDescription == null) {
			if (other.offerDescription != null)
				return false;
		} else if (!offerDescription.equals(other.offerDescription))
			return false;
		if (offerExpireDate == null) {
			if (other.offerExpireDate != null)
				return false;
		} else if (!offerExpireDate.equals(other.offerExpireDate))
			return false;
		if (offerId != other.offerId)
			return false;
		if (offerIsInShopBillingSystem == null) {
			if (other.offerIsInShopBillingSystem != null)
				return false;
		} else if (!offerIsInShopBillingSystem.equals(other.offerIsInShopBillingSystem))
			return false;
		if (offerManufactureId != other.offerManufactureId)
			return false;
		if (offerMethod == null) {
			if (other.offerMethod != null)
				return false;
		} else if (!offerMethod.equals(other.offerMethod))
			return false;
		if (offerMinimumOrder == null) {
			if (other.offerMinimumOrder != null)
				return false;
		} else if (!offerMinimumOrder.equals(other.offerMinimumOrder))
			return false;
		if (offerName == null) {
			if (other.offerName != null)
				return false;
		} else if (!offerName.equals(other.offerName))
			return false;
		if (offerPerUser != other.offerPerUser)
			return false;
		if (offerPhoto == null) {
			if (other.offerPhoto != null)
				return false;
		} else if (!offerPhoto.equals(other.offerPhoto))
			return false;
		if (offerProductId == null) {
			if (other.offerProductId != null)
				return false;
		} else if (!offerProductId.equals(other.offerProductId))
			return false;
		if (offerProfilePhoto == null) {
			if (other.offerProfilePhoto != null)
				return false;
		} else if (!offerProfilePhoto.equals(other.offerProfilePhoto))
			return false;
		if (offerQrCode == null) {
			if (other.offerQrCode != null)
				return false;
		} else if (!offerQrCode.equals(other.offerQrCode))
			return false;
		if (offerStartDate == null) {
			if (other.offerStartDate != null)
				return false;
		} else if (!offerStartDate.equals(other.offerStartDate))
			return false;
		if (offerStatus != other.offerStatus)
			return false;
		if (offerType == null) {
			if (other.offerType != null)
				return false;
		} else if (!offerType.equals(other.offerType))
			return false;
		if (offerUnits != other.offerUnits)
			return false;
		if (offerUnitsPerZone != other.offerUnitsPerZone)
			return false;
		if (offerWhoCreated != other.offerWhoCreated)
			return false;
		if (offerZoneRestriction != other.offerZoneRestriction)
			return false;
		if (offerZones == null) {
			if (other.offerZones != null)
				return false;
		} else if (!offerZones.equals(other.offerZones))
			return false;
		if (shopId != other.shopId)
			return false;
		return true;
	}
	
	
}
