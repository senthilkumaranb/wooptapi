package com.woopt.api.model;

import java.security.Timestamp;

public class Offer {
	
	//not all the fields shown to users, need field level access control, else have different view model
	private int offer_id;
	private String offer_name;
	private String offer_type;
	private String offer_code;
	private String offer_qr_code;
	private int offer_amount;
	private int offer_minimum_order;
	private Timestamp offer_start_date;
	private Timestamp offer_expire_date;
	private int offer_units;
	private int offer_zone_restriction;
	private int offer_units_per_zone;
	private int offer_per_user;
	private String offer_status;
	private String[] offer_zones;
	private String offer_description;
	private String offer_profilephoto;
	private String offer_photo;
	private String offer_product_id;
	private int offer_isinshopbillingsystem;
	private String offer_whocreated;
	private int offer_shopid;
	private int offer_manufacturerid;
	private int offer_available_units;
	
	private OfferUserPublish[] offerUserPublish;

}
