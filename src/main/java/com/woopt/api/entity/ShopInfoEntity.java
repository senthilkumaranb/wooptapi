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
@Table(name = "WOOPT_SHOP_INFO")
public class ShopInfoEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_INFO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopInfoId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_OPEN_STATUS")
	private Integer shopOpenStatus;
	
	@Column(name = "SHOP_OPENING_HOURS")
	private String shopOpeningHours;
	
	@Column(name = "SHOP_MAIN_CATEGORY")
	private String shopMainCategory;
	
	@Column(name = "SHOP_CATEGORIES")
	private String shopCategories;
	
	@Column(name = "SHOP_DESCRIPTION")
	private String shopDescription;
	
	@Column(name = "SHOP_CHAT_STATUS")
	private Integer shopChatStatus;
	
	@Column(name = "SHOP_FACEBOOK")
	private String shopFacebook;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	/**
	 * @return the shopInfoId
	 */
	public int getShopInfoId() {
		return shopInfoId;
	}

	/**
	 * @param shopInfoId the shopInfoId to set
	 */
	public void setShopInfoId(int shopInfoId) {
		this.shopInfoId = shopInfoId;
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
	 * @return the shopOpenStatus
	 */
	public int getShopOpenStatus() {
		return shopOpenStatus;
	}

	/**
	 * @param shopOpenStatus the shopOpenStatus to set
	 */
	public void setShopOpenStatus(int shopOpenStatus) {
		this.shopOpenStatus = shopOpenStatus;
	}

	/**
	 * @return the shopOpeningHours
	 */
	public String getShopOpeningHours() {
		return shopOpeningHours;
	}

	/**
	 * @param shopOpeningHours the shopOpeningHours to set
	 */
	public void setShopOpeningHours(String shopOpeningHours) {
		this.shopOpeningHours = shopOpeningHours;
	}

	/**
	 * @return the shopMainCategory
	 */
	public String getShopMainCategory() {
		return shopMainCategory;
	}

	/**
	 * @param shopMainCategory the shopMainCategory to set
	 */
	public void setShopMainCategory(String shopMainCategory) {
		this.shopMainCategory = shopMainCategory;
	}

	/**
	 * @return the shopCategories
	 */
	public String getShopCategories() {
		return shopCategories;
	}

	/**
	 * @param shopCategories the shopCategories to set
	 */
	public void setShopCategories(String shopCategories) {
		this.shopCategories = shopCategories;
	}

	/**
	 * @return the shopDescription
	 */
	public String getShopDescription() {
		return shopDescription;
	}

	/**
	 * @param shopDescription the shopDescription to set
	 */
	public void setShopDescription(String shopDescription) {
		this.shopDescription = shopDescription;
	}

	/**
	 * @return the shopChatStatus
	 */
	public int getShopChatStatus() {
		return shopChatStatus;
	}

	/**
	 * @param shopChatStatus the shopChatStatus to set
	 */
	public void setShopChatStatus(int shopChatStatus) {
		this.shopChatStatus = shopChatStatus;
	}

	/**
	 * @return the shopFacebook
	 */
	public String getShopFacebook() {
		return shopFacebook;
	}

	/**
	 * @param shopFacebook the shopFacebook to set
	 */
	public void setShopFacebook(String shopFacebook) {
		this.shopFacebook = shopFacebook;
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