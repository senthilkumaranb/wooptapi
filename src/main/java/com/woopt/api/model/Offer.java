package com.woopt.api.model;

import java.security.Timestamp;
import java.util.Arrays;

public class Offer {
	
	//not all the fields shown to users, need field level access control, else have different view model
	private int offerId;
	private String offerName;
	private String offerType;
	private String offerCode;
	private String offerQRCode;
	private int offerAmount;
	private int offerMinimumOrder;
	private Timestamp offerStartDate;
	private Timestamp offerExpireDate;
	private int offerUnits;
	private int offerZoneRestriction;
	private int offerUnitsPerZone;
	private int offerPerUser;
	private String offerStatus;
	private String[] offerZones;
	private String offerDescription;
	private String offerProfilephoto;
	private String offerPhoto;
	private String offerProductId;
	private int offerIsInShopBillingSystem;
	private String offerWhoCreated;
	private int offerShopId;
	private int offerManufacturerid;
	private int offerAvailableUnits;
	
	private OfferUserPublish[] offerUserPublish;

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

	public int getOfferAmount() {
		return offerAmount;
	}

	public void setOfferAmount(int offerAmount) {
		this.offerAmount = offerAmount;
	}

	public int getOfferMinimumOrder() {
		return offerMinimumOrder;
	}

	public void setOfferMinimumOrder(int offerMinimumOrder) {
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

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}

	public String[] getOfferZones() {
		return offerZones;
	}

	public void setOfferZones(String[] offerZones) {
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

	public String getOfferProductId() {
		return offerProductId;
	}

	public void setOfferProductId(String offerProductId) {
		this.offerProductId = offerProductId;
	}

	public int getOfferIsInShopBillingSystem() {
		return offerIsInShopBillingSystem;
	}

	public void setOfferIsInShopBillingSystem(int offerIsInShopBillingSystem) {
		this.offerIsInShopBillingSystem = offerIsInShopBillingSystem;
	}

	public String getOfferWhoCreated() {
		return offerWhoCreated;
	}

	public void setOfferWhoCreated(String offerWhoCreated) {
		this.offerWhoCreated = offerWhoCreated;
	}

	public int getOfferShopId() {
		return offerShopId;
	}

	public void setOfferShopId(int offerShopId) {
		this.offerShopId = offerShopId;
	}

	public int getOfferManufacturerid() {
		return offerManufacturerid;
	}

	public void setOfferManufacturerid(int offerManufacturerid) {
		this.offerManufacturerid = offerManufacturerid;
	}

	public int getOfferAvailableUnits() {
		return offerAvailableUnits;
	}

	public void setOfferAvailableUnits(int offerAvailableUnits) {
		this.offerAvailableUnits = offerAvailableUnits;
	}

	public OfferUserPublish[] getOfferUserPublish() {
		return offerUserPublish;
	}

	public void setOfferUserPublish(OfferUserPublish[] offerUserPublish) {
		this.offerUserPublish = offerUserPublish;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + offerAmount;
		result = prime * result + offerAvailableUnits;
		result = prime * result + ((offerCode == null) ? 0 : offerCode.hashCode());
		result = prime * result + ((offerDescription == null) ? 0 : offerDescription.hashCode());
		result = prime * result + ((offerExpireDate == null) ? 0 : offerExpireDate.hashCode());
		result = prime * result + offerId;
		result = prime * result + offerIsInShopBillingSystem;
		result = prime * result + offerManufacturerid;
		result = prime * result + offerMinimumOrder;
		result = prime * result + ((offerName == null) ? 0 : offerName.hashCode());
		result = prime * result + offerPerUser;
		result = prime * result + ((offerPhoto == null) ? 0 : offerPhoto.hashCode());
		result = prime * result + ((offerProductId == null) ? 0 : offerProductId.hashCode());
		result = prime * result + ((offerProfilephoto == null) ? 0 : offerProfilephoto.hashCode());
		result = prime * result + ((offerQRCode == null) ? 0 : offerQRCode.hashCode());
		result = prime * result + offerShopId;
		result = prime * result + ((offerStartDate == null) ? 0 : offerStartDate.hashCode());
		result = prime * result + ((offerStatus == null) ? 0 : offerStatus.hashCode());
		result = prime * result + ((offerType == null) ? 0 : offerType.hashCode());
		result = prime * result + offerUnits;
		result = prime * result + offerUnitsPerZone;
		result = prime * result + Arrays.hashCode(offerUserPublish);
		result = prime * result + ((offerWhoCreated == null) ? 0 : offerWhoCreated.hashCode());
		result = prime * result + offerZoneRestriction;
		result = prime * result + Arrays.hashCode(offerZones);
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
		Offer other = (Offer) obj;
		if (offerAmount != other.offerAmount)
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
		if (offerIsInShopBillingSystem != other.offerIsInShopBillingSystem)
			return false;
		if (offerManufacturerid != other.offerManufacturerid)
			return false;
		if (offerMinimumOrder != other.offerMinimumOrder)
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
		if (offerProfilephoto == null) {
			if (other.offerProfilephoto != null)
				return false;
		} else if (!offerProfilephoto.equals(other.offerProfilephoto))
			return false;
		if (offerQRCode == null) {
			if (other.offerQRCode != null)
				return false;
		} else if (!offerQRCode.equals(other.offerQRCode))
			return false;
		if (offerShopId != other.offerShopId)
			return false;
		if (offerStartDate == null) {
			if (other.offerStartDate != null)
				return false;
		} else if (!offerStartDate.equals(other.offerStartDate))
			return false;
		if (offerStatus == null) {
			if (other.offerStatus != null)
				return false;
		} else if (!offerStatus.equals(other.offerStatus))
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
		if (!Arrays.equals(offerUserPublish, other.offerUserPublish))
			return false;
		if (offerWhoCreated == null) {
			if (other.offerWhoCreated != null)
				return false;
		} else if (!offerWhoCreated.equals(other.offerWhoCreated))
			return false;
		if (offerZoneRestriction != other.offerZoneRestriction)
			return false;
		if (!Arrays.equals(offerZones, other.offerZones))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", offerName=" + offerName + ", offerType=" + offerType + ", offerCode="
				+ offerCode + ", offerQRCode=" + offerQRCode + ", offerAmount=" + offerAmount + ", offerMinimumOrder="
				+ offerMinimumOrder + ", offerStartDate=" + offerStartDate + ", offerExpireDate=" + offerExpireDate
				+ ", offerUnits=" + offerUnits + ", offerZoneRestriction=" + offerZoneRestriction
				+ ", offerUnitsPerZone=" + offerUnitsPerZone + ", offerPerUser=" + offerPerUser + ", offerStatus="
				+ offerStatus + ", offerZones=" + Arrays.toString(offerZones) + ", offerDescription=" + offerDescription
				+ ", offerProfilephoto=" + offerProfilephoto + ", offerPhoto=" + offerPhoto + ", offerProductId="
				+ offerProductId + ", offerIsInShopBillingSystem=" + offerIsInShopBillingSystem + ", offerWhoCreated="
				+ offerWhoCreated + ", offerShopId=" + offerShopId + ", offerManufacturerid=" + offerManufacturerid
				+ ", offerAvailableUnits=" + offerAvailableUnits + ", offerUserPublish="
				+ Arrays.toString(offerUserPublish) + "]";
	}
	
	
}
