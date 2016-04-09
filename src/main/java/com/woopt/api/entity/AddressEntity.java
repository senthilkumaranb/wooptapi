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

	
}
