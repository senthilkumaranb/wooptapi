package com.woopt.api.model;

public class UserShopView {
	
	private Shop shop;
	
	private ShopInfo shopInfo;
	
	private ShopReview[] shopReview;
	
	//loyalty card of the user for this shop
	private ShopLoyaltyCard shopLoyaltyCard;
	
	//loyalty program of the user for this shop
	private ShopLoyaltyProgram shopLoyaltyProgram;
	
	//User deals related to this shop
	private UserDealView[] userDealViewModel;
	
	Cart cart;
	
	Chat[] chats;

}
