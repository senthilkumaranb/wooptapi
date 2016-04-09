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
@Table(name = "WOOPT_SHOP")
public class ShopEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopId;
	
	@Column(name = "SHOP_NAME")
	private String shopName;
	
	@Column(name = "SHOP_PROPRIETOR_ID")
	private int shopProprietorId;
	
	@Column(name = "SHOP_PHONE")
	private String shopPhone;
	
	@Column(name = "SHOP_MOBILE")
	private String shopMobile;
	
	@Column(name = "SHOP_PROFILE_PHOTO")
	private String shopProfilePhoto;
	
	@Column(name = "SHOP_PHOTOS")
	private String shopPhotos;
	
	@Column(name = "SHOP_EMAIL")
	private String shopEmail;
	
	@Column(name = "SHOP_ADDRESS_ID")
	private Integer shopAddressId;
	
	@Column(name = "SHOP_VERIFICATION_STATUS")
	private Integer shopVerificationStatus;
	
	@Column(name = "SHOP_STATUS")
	private String shopStatus;
	
	@Column(name = "SHOP_ISPARENT")
	private String shopIsparent;
	
	@Column(name = "SHOP_PARENT_ID")
	private Integer shopParentId;
	
	@Column(name = "SHOP_QR_CODE")
	private String shopQRCode;
	
	@Column(name = "SHOP_TYPE")
	private String shopType;
	
	@Column(name = "SHOP_SUBCRIPTION_TYPE")
	private String shopSubcriptionType;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

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
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * @return the shopProprietorId
	 */
	public int getShopProprietorId() {
		return shopProprietorId;
	}

	/**
	 * @param shopProprietorId the shopProprietorId to set
	 */
	public void setShopProprietorId(int shopProprietorId) {
		this.shopProprietorId = shopProprietorId;
	}

	/**
	 * @return the shopPhone
	 */
	public String getShopPhone() {
		return shopPhone;
	}

	/**
	 * @param shopPhone the shopPhone to set
	 */
	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	/**
	 * @return the shopMobile
	 */
	public String getShopMobile() {
		return shopMobile;
	}

	/**
	 * @param shopMobile the shopMobile to set
	 */
	public void setShopMobile(String shopMobile) {
		this.shopMobile = shopMobile;
	}

	/**
	 * @return the shopProfilePhoto
	 */
	public String getShopProfilePhoto() {
		return shopProfilePhoto;
	}

	/**
	 * @param shopProfilePhoto the shopProfilePhoto to set
	 */
	public void setShopProfilePhoto(String shopProfilePhoto) {
		this.shopProfilePhoto = shopProfilePhoto;
	}

	/**
	 * @return the shopPhotos
	 */
	public String getShopPhotos() {
		return shopPhotos;
	}

	/**
	 * @param shopPhotos the shopPhotos to set
	 */
	public void setShopPhotos(String shopPhotos) {
		this.shopPhotos = shopPhotos;
	}

	/**
	 * @return the shopEmail
	 */
	public String getShopEmail() {
		return shopEmail;
	}

	/**
	 * @param shopEmail the shopEmail to set
	 */
	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}

	/**
	 * @return the shopAddressId
	 */
	public int getShopAddressId() {
		return shopAddressId;
	}

	/**
	 * @param shopAddressId the shopAddressId to set
	 */
	public void setShopAddressId(int shopAddressId) {
		this.shopAddressId = shopAddressId;
	}

	/**
	 * @return the shopVerificationStatus
	 */
	public int getShopVerificationStatus() {
		return shopVerificationStatus;
	}

	/**
	 * @param shopVerificationStatus the shopVerificationStatus to set
	 */
	public void setShopVerificationStatus(int shopVerificationStatus) {
		this.shopVerificationStatus = shopVerificationStatus;
	}

	/**
	 * @return the shopStatus
	 */
	public String getShopStatus() {
		return shopStatus;
	}

	/**
	 * @param shopStatus the shopStatus to set
	 */
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	/**
	 * @return the shopIsparent
	 */
	public String getShopIsparent() {
		return shopIsparent;
	}

	/**
	 * @param shopIsparent the shopIsparent to set
	 */
	public void setShopIsparent(String shopIsparent) {
		this.shopIsparent = shopIsparent;
	}

	/**
	 * @return the shopParentId
	 */
	public int getShopParentId() {
		return shopParentId;
	}

	/**
	 * @param shopParentId the shopParentId to set
	 */
	public void setShopParentId(int shopParentId) {
		this.shopParentId = shopParentId;
	}

	/**
	 * @return the shopQRCode
	 */
	public String getShopQRCode() {
		return shopQRCode;
	}

	/**
	 * @param shopQRCode the shopQRCode to set
	 */
	public void setShopQRCode(String shopQRCode) {
		this.shopQRCode = shopQRCode;
	}

	/**
	 * @return the shopType
	 */
	public String getShopType() {
		return shopType;
	}

	/**
	 * @param shopType the shopType to set
	 */
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	/**
	 * @return the shopSubcriptionType
	 */
	public String getShopSubcriptionType() {
		return shopSubcriptionType;
	}

	/**
	 * @param shopSubcriptionType the shopSubcriptionType to set
	 */
	public void setShopSubcriptionType(String shopSubcriptionType) {
		this.shopSubcriptionType = shopSubcriptionType;
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

	
}