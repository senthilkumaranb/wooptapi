package com.woopt.api.model;

public class ShopLoyaltyProgram {
	
	private int shopLoyaltyProgramId;
	
    private int shopId;
    
    private String shopLoyaltyProgramName;
    
    private String shopLoyaltyProgramType;
    
    private int shopLoyaltyProgramNoOfStages;
    
    private ShopLoyaltyProgramStage[] shopLoyaltyProgramStage;
    
    private ShopLoyaltyProgramStage shopLoyaltyProgramCurrentStage;

}
