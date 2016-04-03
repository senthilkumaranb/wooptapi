package com.woopt.api.entity;

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
@Table(name = "WOOPT_OFFER_ZONE_SCOPE")
public class OfferZoneScopeEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OFFER_ZONE_SCOPE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int offerZoneScopeId;
	
	@Column(name = "OFFER_ID")
	private int offerId;
	
	@Column(name = "ZONE_ID")
	private int zoneId;

	public int getOfferZoneScopeId() {
		return offerZoneScopeId;
	}

	public void setOfferZoneScopeId(int offerZoneScopeId) {
		this.offerZoneScopeId = offerZoneScopeId;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public int getZoneId() {
		return zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	@Override
	public String toString() {
		return "OfferZoneScopeEntity [offerZoneScopeId=" + offerZoneScopeId + ", offerId=" + offerId + ", zoneId="
				+ zoneId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + offerId;
		result = prime * result + offerZoneScopeId;
		result = prime * result + zoneId;
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
		OfferZoneScopeEntity other = (OfferZoneScopeEntity) obj;
		if (offerId != other.offerId)
			return false;
		if (offerZoneScopeId != other.offerZoneScopeId)
			return false;
		if (zoneId != other.zoneId)
			return false;
		return true;
	}
	
	
}
