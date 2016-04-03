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
@Table(name = "WOOPT_OFFER_NOTIFICATION")
public class OfferNotificationEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OFFER_NOTIFICATION_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int offerNotificationId;
	
	@Column(name = "OFFER_ID")
	private int offerId;
	
	@Column(name = "OFFER_NOTIFICATION_TYPE")
	private int offerNotificationType;
	
	@Column(name = "OFFER_NOTIFICATION_DATETIME")
	private Timestamp offerNotificationDateTime;
	
	@Column(name = "OFFER_NOTIFICATION_ZONE")
	private String offerNotificationZone;
	
	@Column(name = "OFFER_NOTIFICATION_STATUS")
	private int offerNotificationStatus;
	
	@Column(name = "OFFER_NOTIFICATION_ALLOWED_MESSAGES")
	private int offerNotificationAllowedMessages;
	
	@Column(name = "OFFER_NOTIFICATION_NO_OF_MESSAGES")
	private int offerNotificationNoOfMessages;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getOfferNotificationId() {
		return offerNotificationId;
	}

	public void setOfferNotificationId(int offerNotificationId) {
		this.offerNotificationId = offerNotificationId;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public int getOfferNotificationType() {
		return offerNotificationType;
	}

	public void setOfferNotificationType(int offerNotificationType) {
		this.offerNotificationType = offerNotificationType;
	}

	public Timestamp getOfferNotificationDateTime() {
		return offerNotificationDateTime;
	}

	public void setOfferNotificationDateTime(Timestamp offerNotificationDateTime) {
		this.offerNotificationDateTime = offerNotificationDateTime;
	}

	public String getOfferNotificationZone() {
		return offerNotificationZone;
	}

	public void setOfferNotificationZone(String offerNotificationZone) {
		this.offerNotificationZone = offerNotificationZone;
	}

	public int getOfferNotificationStatus() {
		return offerNotificationStatus;
	}

	public void setOfferNotificationStatus(int offerNotificationStatus) {
		this.offerNotificationStatus = offerNotificationStatus;
	}

	public int getOfferNotificationAllowedMessages() {
		return offerNotificationAllowedMessages;
	}

	public void setOfferNotificationAllowedMessages(int offerNotificationAllowedMessages) {
		this.offerNotificationAllowedMessages = offerNotificationAllowedMessages;
	}

	public int getOfferNotificationNoOfMessages() {
		return offerNotificationNoOfMessages;
	}

	public void setOfferNotificationNoOfMessages(int offerNotificationNoOfMessages) {
		this.offerNotificationNoOfMessages = offerNotificationNoOfMessages;
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
		return "OfferNotificationEntity [offerNotificationId=" + offerNotificationId + ", offerId=" + offerId
				+ ", offerNotificationType=" + offerNotificationType + ", offerNotificationDateTime="
				+ offerNotificationDateTime + ", offerNotificationZone=" + offerNotificationZone
				+ ", offerNotificationStatus=" + offerNotificationStatus + ", offerNotificationAllowedMessages="
				+ offerNotificationAllowedMessages + ", offerNotificationNoOfMessages=" + offerNotificationNoOfMessages
				+ ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + offerId;
		result = prime * result + offerNotificationAllowedMessages;
		result = prime * result + ((offerNotificationDateTime == null) ? 0 : offerNotificationDateTime.hashCode());
		result = prime * result + offerNotificationId;
		result = prime * result + offerNotificationNoOfMessages;
		result = prime * result + offerNotificationStatus;
		result = prime * result + offerNotificationType;
		result = prime * result + ((offerNotificationZone == null) ? 0 : offerNotificationZone.hashCode());
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
		OfferNotificationEntity other = (OfferNotificationEntity) obj;
		if (createdDatetime == null) {
			if (other.createdDatetime != null)
				return false;
		} else if (!createdDatetime.equals(other.createdDatetime))
			return false;
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null)
				return false;
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime))
			return false;
		if (offerId != other.offerId)
			return false;
		if (offerNotificationAllowedMessages != other.offerNotificationAllowedMessages)
			return false;
		if (offerNotificationDateTime == null) {
			if (other.offerNotificationDateTime != null)
				return false;
		} else if (!offerNotificationDateTime.equals(other.offerNotificationDateTime))
			return false;
		if (offerNotificationId != other.offerNotificationId)
			return false;
		if (offerNotificationNoOfMessages != other.offerNotificationNoOfMessages)
			return false;
		if (offerNotificationStatus != other.offerNotificationStatus)
			return false;
		if (offerNotificationType != other.offerNotificationType)
			return false;
		if (offerNotificationZone == null) {
			if (other.offerNotificationZone != null)
				return false;
		} else if (!offerNotificationZone.equals(other.offerNotificationZone))
			return false;
		return true;
	}
	
	
}
