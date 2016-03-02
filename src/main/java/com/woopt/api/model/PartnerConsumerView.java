package com.woopt.api.model;

public class PartnerConsumerView {
	
	User user;
	
	//loyalty card of the user for my shop
	private ShopLoyaltyCard shopLoyaltyCard;
	
	//loyalty program of the user for my shop
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	//User deals related to my shop
	private UserDealView[] userDealViewModel;
	
	Cart cart;
	
	Chat[] chats;


}
