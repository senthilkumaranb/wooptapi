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
@Table(name = "WOOPT_SHOP_BRANCHES")
public class ShopBranchEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_BRANCHES_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopBranchesId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_BRANCHES_SHOP_ID")
	private int shopBranchesShopId;
	
	@Column(name = "SHOP_BRANCHES_STATUS")
	private int shopBranchesStatus;
	
	@Column(name = "SHOP_BRANCHES_MANAGER_ID")
	private int shopBranchesManagerId;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	/**
	 * @return the shopBranchesId
	 */
	public int getShopBranchesId() {
		return shopBranchesId;
	}

	/**
	 * @param shopBranchesId the shopBranchesId to set
	 */
	public void setShopBranchesId(int shopBranchesId) {
		this.shopBranchesId = shopBranchesId;
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
	 * @return the shopBranchesShopId
	 */
	public int getShopBranchesShopId() {
		return shopBranchesShopId;
	}

	/**
	 * @param shopBranchesShopId the shopBranchesShopId to set
	 */
	public void setShopBranchesShopId(int shopBranchesShopId) {
		this.shopBranchesShopId = shopBranchesShopId;
	}

	/**
	 * @return the shopBranchesStatus
	 */
	public int getShopBranchesStatus() {
		return shopBranchesStatus;
	}

	/**
	 * @param shopBranchesStatus the shopBranchesStatus to set
	 */
	public void setShopBranchesStatus(int shopBranchesStatus) {
		this.shopBranchesStatus = shopBranchesStatus;
	}

	/**
	 * @return the shopBranchesManagerId
	 */
	public int getShopBranchesManagerId() {
		return shopBranchesManagerId;
	}

	/**
	 * @param shopBranchesManagerId the shopBranchesManagerId to set
	 */
	public void setShopBranchesManagerId(int shopBranchesManagerId) {
		this.shopBranchesManagerId = shopBranchesManagerId;
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