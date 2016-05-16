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
@Table(name = "WOOPT_OFFER_USER_PUBLISH")
public class OfferUserPublishEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OFFER_USER_PUBLISH_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer offerUserPublishId;
	
	@Column(name = "OFFER_ID")
	private Integer offerId;
	
	@Column(name = "OFFER_ZONE_SCOPE_ID")
	private Integer offerZoneScopeId;
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "OFFER_USER_PUBLISH_OFFER_CODE")
	private String offerUserPublishOfferCode;
	
	@Column(name = "OFFER_USER_PUBLISH_QR_CODE")
	private String offerUserPublishQRCode;
	
	@Column(name = "OFFER_USER_PUBLISH_METHOD")
	private String offerUserPublishMethod;
	
	@Column(name = "OFFER_USER_PUBLISH_IS_REDEEMED")
	private Integer offerUserPublishIsRedeemed;
	
	@Column(name = "OFFER_USER_PUBLISH_DATETIME")
	private Timestamp offerUserPublishDateTime;
	
	@Column(name = "OFFER_USER_PUBLISH_REDEEM_DATE")
	private Timestamp offerUserPublishRedeemDate;
	
	@Column(name = "OFFER_USER_PUBLISH_REDEEM_SHOP_ID")
	private Integer offerUserPublishRedeemShopId;
	
	@Column(name = "OFFER_USER_PUBLISH_REDEEM_METHOD")
	private Integer offerUserPublishRedeemMethod;
	
	@Column(name = "OFFER_USER_PUBLISH_EXPIRE_DATETIME")
	private Timestamp offerUserPublishExpireDateTime;
	
	@Column(name = "OFFER_USER_PUBLISH_IS_SHARED")
	private Integer offerUserPublishIsShared;
	
	@Column(name = "OFFER_USER_PUBLISH_STATUS")
	private Integer offerUserPublishStatus;
	
	@Column(name = "OFFER_USER_PUBLISH_WHO_REDEEMED")
	private Integer offerUserPublishWhoRedeemed;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public OfferUserPublishEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOfferUserPublishId() {
		return offerUserPublishId;
	}

	public void setOfferUserPublishId(Integer offerUserPublishId) {
		this.offerUserPublishId = offerUserPublishId;
	}

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public Integer getOfferZoneScopeId() {
		return offerZoneScopeId;
	}

	public void setOfferZoneScopeId(Integer offerZoneScopeId) {
		this.offerZoneScopeId = offerZoneScopeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOfferUserPublishOfferCode() {
		return offerUserPublishOfferCode;
	}

	public void setOfferUserPublishOfferCode(String offerUserPublishOfferCode) {
		this.offerUserPublishOfferCode = offerUserPublishOfferCode;
	}
	

	public String getOfferUserPublishQRCode() {
		return offerUserPublishQRCode;
	}

	public void setOfferUserPublishQRCode(String offerUserPublishQRCode) {
		this.offerUserPublishQRCode = offerUserPublishQRCode;
	}

	public String getOfferUserPublishMethod() {
		return offerUserPublishMethod;
	}

	public void setOfferUserPublishMethod(String offerUserPublishMethod) {
		this.offerUserPublishMethod = offerUserPublishMethod;
	}

	public Integer getOfferUserPublishIsRedeemed() {
		return offerUserPublishIsRedeemed;
	}

	public void setOfferUserPublishIsRedeemed(Integer offerUserPublishIsRedeemed) {
		this.offerUserPublishIsRedeemed = offerUserPublishIsRedeemed;
	}

	public Timestamp getOfferUserPublishDateTime() {
		return offerUserPublishDateTime;
	}

	public void setOfferUserPublishDateTime(Timestamp offerUserPublishDateTime) {
		this.offerUserPublishDateTime = offerUserPublishDateTime;
	}

	public Timestamp getOfferUserPublishRedeemDate() {
		return offerUserPublishRedeemDate;
	}

	public void setOfferUserPublishRedeemDate(Timestamp offerUserPublishRedeemDate) {
		this.offerUserPublishRedeemDate = offerUserPublishRedeemDate;
	}

	public Integer getOfferUserPublishRedeemShopId() {
		return offerUserPublishRedeemShopId;
	}

	public void setOfferUserPublishRedeemShopId(Integer offerUserPublishRedeemShopId) {
		this.offerUserPublishRedeemShopId = offerUserPublishRedeemShopId;
	}

	public Integer getOfferUserPublishRedeemMethod() {
		return offerUserPublishRedeemMethod;
	}

	public void setOfferUserPublishRedeemMethod(Integer offerUserPublishRedeemMethod) {
		this.offerUserPublishRedeemMethod = offerUserPublishRedeemMethod;
	}

	public Timestamp getOfferUserPublishExpireDateTime() {
		return offerUserPublishExpireDateTime;
	}

	public void setOfferUserPublishExpireDateTime(Timestamp offerUserPublishExpireDateTime) {
		this.offerUserPublishExpireDateTime = offerUserPublishExpireDateTime;
	}

	public Integer getOfferUserPublishIsShared() {
		return offerUserPublishIsShared;
	}

	public void setOfferUserPublishIsShared(Integer offerUserPublishIsShared) {
		this.offerUserPublishIsShared = offerUserPublishIsShared;
	}

	public Integer getOfferUserPublishStatus() {
		return offerUserPublishStatus;
	}

	public void setOfferUserPublishStatus(Integer offerUserPublishStatus) {
		this.offerUserPublishStatus = offerUserPublishStatus;
	}

	public Integer getOfferUserPublishWhoRedeemed() {
		return offerUserPublishWhoRedeemed;
	}

	public void setOfferUserPublishWhoRedeemed(Integer offerUserPublishWhoRedeemed) {
		this.offerUserPublishWhoRedeemed = offerUserPublishWhoRedeemed;
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
		return "OfferUserPublishEntity [offerUserPublishId=" + offerUserPublishId + ", offerId=" + offerId
				+ ", offerZoneScopeId=" + offerZoneScopeId + ", userId=" + userId + ", offerUserPublishOfferCode="
				+ offerUserPublishOfferCode + ", offerUserPublishQRCode=" + offerUserPublishQRCode
				+ ", offerUserPublishMethod=" + offerUserPublishMethod + ", offerUserPublishIsRedeemed="
				+ offerUserPublishIsRedeemed + ", offerUserPublishDateTime=" + offerUserPublishDateTime
				+ ", offerUserPublishRedeemDate=" + offerUserPublishRedeemDate + ", offerUserPublishRedeemShopId="
				+ offerUserPublishRedeemShopId + ", offerUserPublishRedeemMethod=" + offerUserPublishRedeemMethod
				+ ", offerUserPublishExpireDateTime=" + offerUserPublishExpireDateTime + ", offerUserPublishIsShared="
				+ offerUserPublishIsShared + ", offerUserPublishStatus=" + offerUserPublishStatus
				+ ", offerUserPublishWhoRedeemed=" + offerUserPublishWhoRedeemed + ", createdDatetime="
				+ createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

}
