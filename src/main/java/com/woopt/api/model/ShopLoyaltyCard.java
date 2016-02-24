package com.woopt.api.model;

import java.security.Timestamp;

public class ShopLoyaltyCard {
	
    private int shopLoyaltyCardId;
    
    private String shopLoyaltyCardName;
    
    private int shopLoyaltyCardIsSameForAllbranches;
    
    private int shopLoyaltyCardStatus;
    
    private Timestamp shopLoyaltyCardStartDate;
    
    private Timestamp shopLoyaltyCardExpiryDate;
    
    private String shopLoyaltyProgramType;
    
    private int shopLoyaltyCardNoOfStages;
    
    private ShopLoyaltyCardStage[] shopLoyaltyCardStage;

}
