package com.woopt.api.model;

import java.security.Timestamp;

public class Offer {
	
	//not all the fields shown to users, need field level access control, else have different view model
	private int offerId;
	private String offerName;
	private String offerType;
	private String offerCode;
	private String offerQRCode;
	private int offerAmount;
	private int offerMinimumOrder;
	private Timestamp offerStartDate;
	private Timestamp offerExpireDate;
	private int offerUnits;
	private int offerZoneRestriction;
	private int offerUnitsPerZone;
	private int offerPerUser;
	private String offerStatus;
	private String[] offerZones;
	private String offerDescription;
	private String offerProfilephoto;
	private String offerPhoto;
	private String offerProductId;
	private int offerIsInShopBillingSystem;
	private String offerWhoCreated;
	private int offerShopId;
	private int offerManufacturerid;
	private int offerAvailableUnits;
	
	private OfferUserPublish[] offerUserPublish;

}
