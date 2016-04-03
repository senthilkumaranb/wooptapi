package com.woopt.api.model;

import java.util.Arrays;

public class Shop {
	
	private int shopId;
	
	private String shopName;
	
	private int shopProprietorId;
	
	private String shopPhone;
	
	private String shopMobile;
	
	private String shopProfilePhoto;
	
	//this need to be updated in Entity as array of string
	private String[] shopPhotos;
	
	private String shopEmail;
	
	private Address shopAddress;
	
	private int shopVerificationStatus;
	
	private String shopStatus;
	
	private String shopIsparent;
	
	private int shopParentId;
	
	private String shopQRCode;
	
	private String shopType;
	
	private String shopSubcriptionType;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getShopProprietorId() {
		return shopProprietorId;
	}

	public void setShopProprietorId(int shopProprietorId) {
		this.shopProprietorId = shopProprietorId;
	}

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public String getShopMobile() {
		return shopMobile;
	}

	public void setShopMobile(String shopMobile) {
		this.shopMobile = shopMobile;
	}

	public String getShopProfilePhoto() {
		return shopProfilePhoto;
	}

	public void setShopProfilePhoto(String shopProfilePhoto) {
		this.shopProfilePhoto = shopProfilePhoto;
	}

	public String[] getShopPhotos() {
		return shopPhotos;
	}

	public void setShopPhotos(String[] shopPhotos) {
		this.shopPhotos = shopPhotos;
	}

	public String getShopEmail() {
		return shopEmail;
	}

	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}

	public Address getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(Address shopAddress) {
		this.shopAddress = shopAddress;
	}

	public int getShopVerificationStatus() {
		return shopVerificationStatus;
	}

	public void setShopVerificationStatus(int shopVerificationStatus) {
		this.shopVerificationStatus = shopVerificationStatus;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopIsparent() {
		return shopIsparent;
	}

	public void setShopIsparent(String shopIsparent) {
		this.shopIsparent = shopIsparent;
	}

	public int getShopParentId() {
		return shopParentId;
	}

	public void setShopParentId(int shopParentId) {
		this.shopParentId = shopParentId;
	}

	public String getShopQRCode() {
		return shopQRCode;
	}

	public void setShopQRCode(String shopQRCode) {
		this.shopQRCode = shopQRCode;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getShopSubcriptionType() {
		return shopSubcriptionType;
	}

	public void setShopSubcriptionType(String shopSubcriptionType) {
		this.shopSubcriptionType = shopSubcriptionType;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopProprietorId=" + shopProprietorId
				+ ", shopPhone=" + shopPhone + ", shopMobile=" + shopMobile + ", shopProfilePhoto=" + shopProfilePhoto
				+ ", shopPhotos=" + Arrays.toString(shopPhotos) + ", shopEmail=" + shopEmail + ", shopAddress="
				+ shopAddress + ", shopVerificationStatus=" + shopVerificationStatus + ", shopStatus=" + shopStatus
				+ ", shopIsparent=" + shopIsparent + ", shopParentId=" + shopParentId + ", shopQRCode=" + shopQRCode
				+ ", shopType=" + shopType + ", shopSubcriptionType=" + shopSubcriptionType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shopAddress == null) ? 0 : shopAddress.hashCode());
		result = prime * result + ((shopEmail == null) ? 0 : shopEmail.hashCode());
		result = prime * result + shopId;
		result = prime * result + ((shopIsparent == null) ? 0 : shopIsparent.hashCode());
		result = prime * result + ((shopMobile == null) ? 0 : shopMobile.hashCode());
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		result = prime * result + shopParentId;
		result = prime * result + ((shopPhone == null) ? 0 : shopPhone.hashCode());
		result = prime * result + Arrays.hashCode(shopPhotos);
		result = prime * result + ((shopProfilePhoto == null) ? 0 : shopProfilePhoto.hashCode());
		result = prime * result + shopProprietorId;
		result = prime * result + ((shopQRCode == null) ? 0 : shopQRCode.hashCode());
		result = prime * result + ((shopStatus == null) ? 0 : shopStatus.hashCode());
		result = prime * result + ((shopSubcriptionType == null) ? 0 : shopSubcriptionType.hashCode());
		result = prime * result + ((shopType == null) ? 0 : shopType.hashCode());
		result = prime * result + shopVerificationStatus;
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
		Shop other = (Shop) obj;
		if (shopAddress == null) {
			if (other.shopAddress != null)
				return false;
		} else if (!shopAddress.equals(other.shopAddress))
			return false;
		if (shopEmail == null) {
			if (other.shopEmail != null)
				return false;
		} else if (!shopEmail.equals(other.shopEmail))
			return false;
		if (shopId != other.shopId)
			return false;
		if (shopIsparent == null) {
			if (other.shopIsparent != null)
				return false;
		} else if (!shopIsparent.equals(other.shopIsparent))
			return false;
		if (shopMobile == null) {
			if (other.shopMobile != null)
				return false;
		} else if (!shopMobile.equals(other.shopMobile))
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		if (shopParentId != other.shopParentId)
			return false;
		if (shopPhone == null) {
			if (other.shopPhone != null)
				return false;
		} else if (!shopPhone.equals(other.shopPhone))
			return false;
		if (!Arrays.equals(shopPhotos, other.shopPhotos))
			return false;
		if (shopProfilePhoto == null) {
			if (other.shopProfilePhoto != null)
				return false;
		} else if (!shopProfilePhoto.equals(other.shopProfilePhoto))
			return false;
		if (shopProprietorId != other.shopProprietorId)
			return false;
		if (shopQRCode == null) {
			if (other.shopQRCode != null)
				return false;
		} else if (!shopQRCode.equals(other.shopQRCode))
			return false;
		if (shopStatus == null) {
			if (other.shopStatus != null)
				return false;
		} else if (!shopStatus.equals(other.shopStatus))
			return false;
		if (shopSubcriptionType == null) {
			if (other.shopSubcriptionType != null)
				return false;
		} else if (!shopSubcriptionType.equals(other.shopSubcriptionType))
			return false;
		if (shopType == null) {
			if (other.shopType != null)
				return false;
		} else if (!shopType.equals(other.shopType))
			return false;
		if (shopVerificationStatus != other.shopVerificationStatus)
			return false;
		return true;
	}	
}