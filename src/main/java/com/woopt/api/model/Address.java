package com.woopt.api.model;

public class Address {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	private String addressName;
	
	private String addressStreet1;
	
	private String addressStreet2;
	
	private String addressArea;
	
	private String addressCity;
	
	private String addressState;
	
	private String addressPostcode;
	
	private String addressCountry;
	
	private String addressLandmark;
	
	private String addressLatitude;
	
	private String addressLongitude;


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

	@Override
	public String toString() {
		return "AddressModel [addressName=" + addressName + ", addressStreet1=" + addressStreet1 + ", addressStreet2="
				+ addressStreet2 + ", addressArea=" + addressArea + ", addressCity=" + addressCity + ", addressState="
				+ addressState + ", addressPostcode=" + addressPostcode + ", addressCountry=" + addressCountry
				+ ", addressLandmark=" + addressLandmark + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressArea == null) ? 0 : addressArea.hashCode());
		result = prime * result + ((addressCity == null) ? 0 : addressCity.hashCode());
		result = prime * result + ((addressCountry == null) ? 0 : addressCountry.hashCode());
		result = prime * result + ((addressLandmark == null) ? 0 : addressLandmark.hashCode());
		result = prime * result + ((addressName == null) ? 0 : addressName.hashCode());
		result = prime * result + ((addressPostcode == null) ? 0 : addressPostcode.hashCode());
		result = prime * result + ((addressState == null) ? 0 : addressState.hashCode());
		result = prime * result + ((addressStreet1 == null) ? 0 : addressStreet1.hashCode());
		result = prime * result + ((addressStreet2 == null) ? 0 : addressStreet2.hashCode());
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
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
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
		if (addressLandmark == null) {
			if (other.addressLandmark != null) {
				return false;
			}
		} else if (!addressLandmark.equals(other.addressLandmark)) {
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
		return true;
	}
}
