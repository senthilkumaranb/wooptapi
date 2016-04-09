package com.woopt.api.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.woopt.api.dao.ShopBranchDAO;
import com.woopt.api.dao.ShopDAO;
import com.woopt.api.dao.ShopEmployeeDAO;
import com.woopt.api.dao.ShopInfoDAO;
import com.woopt.api.dao.ShopLoyaltyCardDAO;
import com.woopt.api.dao.ShopLoyaltyCardStageDAO;
import com.woopt.api.dao.ShopReviewDAO;
import com.woopt.api.entity.ShopBranchEntity;
import com.woopt.api.entity.ShopEntity;
import com.woopt.api.entity.ShopInfoEntity;
import com.woopt.api.entity.ShopReviewEntity;
import com.woopt.api.model.Shop;
import com.woopt.api.model.ShopBranch;
import com.woopt.api.model.ShopInfo;
import com.woopt.api.model.ShopModel;
import com.woopt.api.model.ShopReview;
import com.woopt.api.model.UserModel;

public class ShopService {
	
	private static final Logger LOGGER = Logger.getLogger(ShopService.class.getName());
	
	@Autowired
	ShopDAO shopDAO;
	
	@Autowired
	ShopInfoDAO shopInfoDAO;
	
	@Autowired
	ShopBranchDAO shopBranchDAO;
	
	@Autowired
	ShopEmployeeDAO shopEmployeeDAO;
	
	@Autowired
	ShopReviewDAO shopReviewDAO;
	
	@Autowired
	ShopLoyaltyCardDAO shopLoyaltyCardDAO;
	
	@Autowired
	ShopLoyaltyCardStageDAO shopLoyaltyCardStageDAO;
	
	public List<ShopModel> getMyShops(int userId){
		
		List<ShopModel> shopModels = new ArrayList<ShopModel>();
		
		List<ShopEntity> shopEntities = new ArrayList<ShopEntity>();
		
		LOGGER.info("Inside getmyshop function with userID" + userId);
		
		try{
			LOGGER.info("calling getusershops function ");
			shopEntities = shopDAO.getUserShops(userId);
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		}
        
		LOGGER.info("ShopEntities records: " + shopEntities);
		
        for (ShopEntity se: shopEntities) {
        	
        	ShopModel shopModel = new ShopModel();
        	
        	//Shop
	        Shop shop=new Shop();
	        shop.setShopName(se.getShopName());
	        shop.setShopId(se.getShopId());
	        
	        shopModel.setShop(shop);
	       
	        //ShopInfo
	        ShopInfo shopInfo = new ShopInfo();
			ShopInfoEntity shopInfoEntity = new ShopInfoEntity();			
			shopInfoEntity = shopInfoDAO.list(se.getShopId());
			shopInfo.setShopOpenStatus(shopInfoEntity.getShopOpenStatus());
			shopInfo.setShopOpeningHours(shopInfoEntity.getShopOpeningHours());
			shopInfo.setShopMainCategory(shopInfoEntity.getShopMainCategory());
			//shopInfo.setShopCategories(shopInfoEntity.getShopCategories());
			
	        shopModel.setShopInfo(shopInfo);
			
			//ShopBranches
			List<ShopBranch> shopBranches = new ArrayList<ShopBranch>();
			List<ShopBranchEntity> shopBranchEntities = new ArrayList<ShopBranchEntity>();
			shopBranchEntities = shopBranchDAO.list(se.getShopId());
			
			//Get all the shopReviewEntities records and add to ShopReview Model
			for (ShopBranchEntity sbe: shopBranchEntities){
				ShopBranch shopBranch = new ShopBranch();
				shopBranch.setShopName(shopDAO.getShopName(sbe.getShopId()));
				shopBranches.add(shopBranch);
			}
			
			shopModel.setShopBranches(shopBranches);

			
			//ShopReviews
			List<ShopReview> shopReviews = new ArrayList<ShopReview>();
			List<ShopReviewEntity> shopReviewEntities = new ArrayList<ShopReviewEntity>();
			shopReviewEntities = shopReviewDAO.list(se.getShopId());
			
			//Get all the shopReviewEntities records and add to ShopReview Model
			for (ShopReviewEntity sre: shopReviewEntities){
				ShopReview shopReview = new ShopReview();
				shopReview.setShopReviewShopRating(sre.getShopReviewShopRating());
				shopReviews.add(shopReview);
			}
			
			shopModels.add(shopModel);

        }
        //shops.add(shop);
		return shopModels;
	}
	
}
