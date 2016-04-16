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
	private Integer offerAmount;
	private Integer offerMinimumOrder;
	private String offerStartDate;
	private String offerExpireDate;
	private Integer offerUnits;
	private Integer offerZoneRestriction;
	private Integer offerUnitsPerZone;
	private Integer offerPerUser;
	private String offerStatus;
	private String offerZones;
	private String offerDescription;
	private String offerProfilephoto;
	private String offerPhoto;
	private String offerProductId;
	private Integer offerIsInShopBillingSystem;
	private String offerWhoCreated;
	private Integer offerShopId;
	private Integer offerManufacturerid;
	private Integer offerAvailableUnits;
	private List<OfferUserPublish> offerUserPublish;
	
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
	public Integer getOfferAmount() {
		return offerAmount;
	}
	public void setOfferAmount(Integer offerAmount) {
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
	public String getOfferStatus() {
		return offerStatus;
	}
	public void setOfferStatus(String offerStatus) {
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
	public String getOfferProductId() {
		return offerProductId;
	}
	public void setOfferProductId(String offerProductId) {
		this.offerProductId = offerProductId;
	}
	public Integer getOfferIsInShopBillingSystem() {
		return offerIsInShopBillingSystem;
	}
	public void setOfferIsInShopBillingSystem(Integer offerIsInShopBillingSystem) {
		this.offerIsInShopBillingSystem = offerIsInShopBillingSystem;
	}
	public String getOfferWhoCreated() {
		return offerWhoCreated;
	}
	public void setOfferWhoCreated(String offerWhoCreated) {
		this.offerWhoCreated = offerWhoCreated;
	}
	public Integer getOfferShopId() {
		return offerShopId;
	}
	public void setOfferShopId(Integer offerShopId) {
		this.offerShopId = offerShopId;
	}
	public Integer getOfferManufacturerid() {
		return offerManufacturerid;
	}
	public void setOfferManufacturerid(Integer offerManufacturerid) {
		this.offerManufacturerid = offerManufacturerid;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((offerAmount == null) ? 0 : offerAmount.hashCode());
		result = prime * result + ((offerAvailableUnits == null) ? 0 : offerAvailableUnits.hashCode());
		result = prime * result + ((offerCode == null) ? 0 : offerCode.hashCode());
		result = prime * result + ((offerDescription == null) ? 0 : offerDescription.hashCode());
		result = prime * result + ((offerExpireDate == null) ? 0 : offerExpireDate.hashCode());
		result = prime * result + ((offerId == null) ? 0 : offerId.hashCode());
		result = prime * result + ((offerIsInShopBillingSystem == null) ? 0 : offerIsInShopBillingSystem.hashCode());
		result = prime * result + ((offerManufacturerid == null) ? 0 : offerManufacturerid.hashCode());
		result = prime * result + ((offerMinimumOrder == null) ? 0 : offerMinimumOrder.hashCode());
		result = prime * result + ((offerName == null) ? 0 : offerName.hashCode());
		result = prime * result + ((offerPerUser == null) ? 0 : offerPerUser.hashCode());
		result = prime * result + ((offerPhoto == null) ? 0 : offerPhoto.hashCode());
		result = prime * result + ((offerProductId == null) ? 0 : offerProductId.hashCode());
		result = prime * result + ((offerProfilephoto == null) ? 0 : offerProfilephoto.hashCode());
		result = prime * result + ((offerQRCode == null) ? 0 : offerQRCode.hashCode());
		result = prime * result + ((offerShopId == null) ? 0 : offerShopId.hashCode());
		result = prime * result + ((offerStartDate == null) ? 0 : offerStartDate.hashCode());
		result = prime * result + ((offerStatus == null) ? 0 : offerStatus.hashCode());
		result = prime * result + ((offerType == null) ? 0 : offerType.hashCode());
		result = prime * result + ((offerUnits == null) ? 0 : offerUnits.hashCode());
		result = prime * result + ((offerUnitsPerZone == null) ? 0 : offerUnitsPerZone.hashCode());
		result = prime * result + ((offerUserPublish == null) ? 0 : offerUserPublish.hashCode());
		result = prime * result + ((offerWhoCreated == null) ? 0 : offerWhoCreated.hashCode());
		result = prime * result + ((offerZoneRestriction == null) ? 0 : offerZoneRestriction.hashCode());
		result = prime * result + ((offerZones == null) ? 0 : offerZones.hashCode());
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
		if (offerAmount == null) {
			if (other.offerAmount != null)
				return false;
		} else if (!offerAmount.equals(other.offerAmount))
			return false;
		if (offerAvailableUnits == null) {
			if (other.offerAvailableUnits != null)
				return false;
		} else if (!offerAvailableUnits.equals(other.offerAvailableUnits))
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
		if (offerId == null) {
			if (other.offerId != null)
				return false;
		} else if (!offerId.equals(other.offerId))
			return false;
		if (offerIsInShopBillingSystem == null) {
			if (other.offerIsInShopBillingSystem != null)
				return false;
		} else if (!offerIsInShopBillingSystem.equals(other.offerIsInShopBillingSystem))
			return false;
		if (offerManufacturerid == null) {
			if (other.offerManufacturerid != null)
				return false;
		} else if (!offerManufacturerid.equals(other.offerManufacturerid))
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
		if (offerPerUser == null) {
			if (other.offerPerUser != null)
				return false;
		} else if (!offerPerUser.equals(other.offerPerUser))
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
		if (offerShopId == null) {
			if (other.offerShopId != null)
				return false;
		} else if (!offerShopId.equals(other.offerShopId))
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
		if (offerUnits == null) {
			if (other.offerUnits != null)
				return false;
		} else if (!offerUnits.equals(other.offerUnits))
			return false;
		if (offerUnitsPerZone == null) {
			if (other.offerUnitsPerZone != null)
				return false;
		} else if (!offerUnitsPerZone.equals(other.offerUnitsPerZone))
			return false;
		if (offerUserPublish == null) {
			if (other.offerUserPublish != null)
				return false;
		} else if (!offerUserPublish.equals(other.offerUserPublish))
			return false;
		if (offerWhoCreated == null) {
			if (other.offerWhoCreated != null)
				return false;
		} else if (!offerWhoCreated.equals(other.offerWhoCreated))
			return false;
		if (offerZoneRestriction == null) {
			if (other.offerZoneRestriction != null)
				return false;
		} else if (!offerZoneRestriction.equals(other.offerZoneRestriction))
			return false;
		if (offerZones == null) {
			if (other.offerZones != null)
				return false;
		} else if (!offerZones.equals(other.offerZones))
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
				+ offerStatus + ", offerZones=" + offerZones + ", offerDescription=" + offerDescription
				+ ", offerProfilephoto=" + offerProfilephoto + ", offerPhoto=" + offerPhoto + ", offerProductId="
				+ offerProductId + ", offerIsInShopBillingSystem=" + offerIsInShopBillingSystem + ", offerWhoCreated="
				+ offerWhoCreated + ", offerShopId=" + offerShopId + ", offerManufacturerid=" + offerManufacturerid
				+ ", offerAvailableUnits=" + offerAvailableUnits + ", offerUserPublish=" + offerUserPublish + "]";
	}
	
	

	
}