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
 * @author Sushil
 *
 */
@Entity
@Table(name = "WOOPT_ADDRESS")
public class AddressEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ADDRESS_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "ADDRESS_NAME")
	private String addressName;
	
	@Column(name = "ADDRESS_STREET1")
	private String addressStreet1;
	
	@Column(name = "ADDRESS_STREET2")
	private String addressStreet2;
	
	@Column(name = "ADDRESS_AREA")
	private String addressArea;
	
	@Column(name = "ADDRESS_CITY")
	private String addressCity;
	
	@Column(name = "ADDRESS_STATE")
	private String addressState;
	
	@Column(name = "ADDRESS_POSTCODE")
	private String addressPostcode;
	
	@Column(name = "ADDRESS_COUNTRY")
	private String addressCountry;
	
	@Column(name = "ADDRESS_ZONE")
	private String addressZone;
	
	@Column(name = "ADDRESS_LATITUDE")
	private String addressLatitude;
	
	@Column(name = "ADDRESS_LONGITUDE")
	private String addressLongitude;
	
	@Column(name = "ADDRESS_LANDMARK")
	private String addressLandmark;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the shopId
	 */
	public int getShopId() {
		return shopId;
	}

	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the addressName
	 */
	public String getAddressName() {
		return addressName;
	}

	/**
	 * @param addressName the addressName to set
	 */
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	/**
	 * @return the addressStreet1
	 */
	public String getAddressStreet1() {
		return addressStreet1;
	}

	/**
	 * @param addressStreet1 the addressStreet1 to set
	 */
	public void setAddressStreet1(String addressStreet1) {
		this.addressStreet1 = addressStreet1;
	}

	/**
	 * @return the addressStreet2
	 */
	public String getAddressStreet2() {
		return addressStreet2;
	}

	/**
	 * @param addressStreet2 the addressStreet2 to set
	 */
	public void setAddressStreet2(String addressStreet2) {
		this.addressStreet2 = addressStreet2;
	}

	/**
	 * @return the addressArea
	 */
	public String getAddressArea() {
		return addressArea;
	}

	/**
	 * @param addressArea the addressArea to set
	 */
	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
	}

	/**
	 * @return the addressCity
	 */
	public String getAddressCity() {
		return addressCity;
	}

	/**
	 * @param addressCity the addressCity to set
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	/**
	 * @return the addressState
	 */
	public String getAddressState() {
		return addressState;
	}

	/**
	 * @param addressState the addressState to set
	 */
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	/**
	 * @return the addressPostcode
	 */
	public String getAddressPostcode() {
		return addressPostcode;
	}

	/**
	 * @param addressPostcode the addressPostcode to set
	 */
	public void setAddressPostcode(String addressPostcode) {
		this.addressPostcode = addressPostcode;
	}

	/**
	 * @return the addressCountry
	 */
	public String getAddressCountry() {
		return addressCountry;
	}

	/**
	 * @param addressCountry the addressCountry to set
	 */
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	/**
	 * @return the addressZone
	 */
	public String getAddressZone() {
		return addressZone;
	}

	/**
	 * @param addressZone the addressZone to set
	 */
	public void setAddressZone(String addressZone) {
		this.addressZone = addressZone;
	}

	/**
	 * @return the addressLatitude
	 */
	public String getAddressLatitude() {
		return addressLatitude;
	}

	/**
	 * @param addressLatitude the addressLatitude to set
	 */
	public void setAddressLatitude(String addressLatitude) {
		this.addressLatitude = addressLatitude;
	}

	/**
	 * @return the addressLongitude
	 */
	public String getAddressLongitude() {
		return addressLongitude;
	}

	/**
	 * @param addressLongitude the addressLongitude to set
	 */
	public void setAddressLongitude(String addressLongitude) {
		this.addressLongitude = addressLongitude;
	}

	/**
	 * @return the addressLandmark
	 */
	public String getAddressLandmark() {
		return addressLandmark;
	}

	/**
	 * @param addressLandmark the addressLandmark to set
	 */
	public void setAddressLandmark(String addressLandmark) {
		this.addressLandmark = addressLandmark;
	}

	/**
	 * @return the createdDatetime
	 */
	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	/**
	 * @param createdDatetime the createdDatetime to set
	 */
	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	/**
	 * @return the lastUpdatedDatetime
	 */
	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	/**
	 * @param lastUpdatedDatetime the lastUpdatedDatetime to set
	 */
	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", userId=" + userId + ", shopId=" + shopId + ", addressName="
				+ addressName + ", addressStreet1=" + addressStreet1 + ", addressStreet2=" + addressStreet2
				+ ", addressArea=" + addressArea + ", addressCity=" + addressCity + ", addressState=" + addressState
				+ ", addressPostcode=" + addressPostcode + ", addressCountry=" + addressCountry + ", addressZone="
				+ addressZone + ", addressLatitude=" + addressLatitude + ", addressLongitude=" + addressLongitude
				+ ", addressLandmark=" + addressLandmark + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressArea == null) ? 0 : addressArea.hashCode());
		result = prime * result + ((addressCity == null) ? 0 : addressCity.hashCode());
		result = prime * result + ((addressCountry == null) ? 0 : addressCountry.hashCode());
		result = prime * result + addressId;
		result = prime * result + ((addressLandmark == null) ? 0 : addressLandmark.hashCode());
		result = prime * result + ((addressLatitude == null) ? 0 : addressLatitude.hashCode());
		result = prime * result + ((addressLongitude == null) ? 0 : addressLongitude.hashCode());
		result = prime * result + ((addressName == null) ? 0 : addressName.hashCode());
		result = prime * result + ((addressPostcode == null) ? 0 : addressPostcode.hashCode());
		result = prime * result + ((addressState == null) ? 0 : addressState.hashCode());
		result = prime * result + ((addressStreet1 == null) ? 0 : addressStreet1.hashCode());
		result = prime * result + ((addressStreet2 == null) ? 0 : addressStreet2.hashCode());
		result = prime * result + ((addressZone == null) ? 0 : addressZone.hashCode());
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + shopId;
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AddressEntity)) {
			return false;
		}
		AddressEntity other = (AddressEntity) obj;
		if (addressArea == null) {
			if (other.addressArea != null) {
				return false;
			}
		} else if (!addressArea.equals(other.addressArea)) {
			return false;
		}
		if (addressCity == null) {
			if (other.addressCity != null) {
				return false;
			}
		} else if (!addressCity.equals(other.addressCity)) {
			return false;
		}
		if (addressCountry == null) {
			if (other.addressCountry != null) {
				return false;
			}
		} else if (!addressCountry.equals(other.addressCountry)) {
			return false;
		}
		if (addressId != other.addressId) {
			return false;
		}
		if (addressLandmark == null) {
			if (other.addressLandmark != null) {
				return false;
			}
		} else if (!addressLandmark.equals(other.addressLandmark)) {
			return false;
		}
		if (addressLatitude == null) {
			if (other.addressLatitude != null) {
				return false;
			}
		} else if (!addressLatitude.equals(other.addressLatitude)) {
			return false;
		}
		if (addressLongitude == null) {
			if (other.addressLongitude != null) {
				return false;
			}
		} else if (!addressLongitude.equals(other.addressLongitude)) {
			return false;
		}
		if (addressName == null) {
			if (other.addressName != null) {
				return false;
			}
		} else if (!addressName.equals(other.addressName)) {
			return false;
		}
		if (addressPostcode == null) {
			if (other.addressPostcode != null) {
				return false;
			}
		} else if (!addressPostcode.equals(other.addressPostcode)) {
			return false;
		}
		if (addressState == null) {
			if (other.addressState != null) {
				return false;
			}
		} else if (!addressState.equals(other.addressState)) {
			return false;
		}
		if (addressStreet1 == null) {
			if (other.addressStreet1 != null) {
				return false;
			}
		} else if (!addressStreet1.equals(other.addressStreet1)) {
			return false;
		}
		if (addressStreet2 == null) {
			if (other.addressStreet2 != null) {
				return false;
			}
		} else if (!addressStreet2.equals(other.addressStreet2)) {
			return false;
		}
		if (addressZone == null) {
			if (other.addressZone != null) {
				return false;
			}
		} else if (!addressZone.equals(other.addressZone)) {
			return false;
		}
		if (createdDatetime == null) {
			if (other.createdDatetime != null) {
				return false;
			}
		} else if (!createdDatetime.equals(other.createdDatetime)) {
			return false;
		}
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null) {
				return false;
			}
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime)) {
			return false;
		}
		if (shopId != other.shopId) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}
}
