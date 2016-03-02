package com.woopt.api.model;

public class PartnerConsumerView {
	
	UserModel consumer;
	
	//loyalty card of the user for my shop
	private ShopLoyaltyCard shopLoyaltyCard;
	
	//loyalty program of the user for my shop
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	//User deals related to my shop
	private UserDealView userDeal;
	
	Cart cart;
	
	Chat[] chats;


}
