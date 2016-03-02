package com.woopt.api.model;

public class ShopLoyaltyProgram {
	
	private int shopLoyaltyProgramId;
	
    private String shopLoyaltyProgramName;
    
    private String shopLoyaltyProgramType;
    
    private int shopLoyaltyProgramNoOfStages;
    
    private ShopLoyaltyProgramStage shopLoyaltyProgramCurrentStage;

    private ShopLoyaltyProgramStage[] shopLoyaltyProgramStage;
}
