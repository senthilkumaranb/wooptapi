package com.woopt.api.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
import com.woopt.api.model.Offer;
import com.woopt.api.model.Shop;
import com.woopt.api.model.ShopBranch;
import com.woopt.api.model.ShopInfo;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyProgram;
import com.woopt.api.model.ShopModel;
import com.woopt.api.model.ShopReview;
import com.woopt.api.model.UserModel;

@Service
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
	
	@Transactional
	public List<ShopModel> getShopModelsbyUser(int userId){
		
		List<ShopModel> shopModels = new ArrayList<ShopModel>();
		List<Shop> shops = new ArrayList<Shop>();
		shops = this.getShopbyUser(userId);
		
		for (Shop shop: shops){
			ShopModel shopModel = new ShopModel();
			int shopId = shop.getShopId();
			shopModel.setShop(shop);
			shopModel.setShopInfo(this.getShopInfo(shopId));
			
			List<ShopBranch> sb = this.getShopBranches(shopId);
			if (sb.size()!=0)
					shopModel.setShopBranches(sb);
			
			shopModels.add(shopModel);
			LOGGER.info("shopModel data >>>>> :" + shopModel);
			shopModel=null;
		}
		LOGGER.info("shopModels >>>>> :" + shopModels);
		return shopModels;
			
	}
	
	@Transactional
	public List<Shop> getShopbyUser(int userId){
		
		List<Shop> shops = new ArrayList<Shop>();
		List<ShopEntity> shopEntities = new ArrayList<ShopEntity>();
		
		try{
			shopEntities = shopDAO.getUserShops(userId);
		}
		catch (Exception e){
			LOGGER.info("getShopbyUser Exception :" + e.getMessage());
		}
		
		for (ShopEntity se: shopEntities) {
     	
        	//Shop
	        Shop shop=new Shop();
	        shop.setShopName(se.getShopName());
	        shop.setShopId(se.getShopId());
	        shops.add(shop);			
		}
		return shops;

	}
	
	@Transactional
	public ShopInfo getShopInfo(int shopId){
		LOGGER.info("Inside getShopInfo function...");
        ShopInfo shopInfo = new ShopInfo();
		ShopInfoEntity shopInfoEntity = new ShopInfoEntity();			
		shopInfoEntity = shopInfoDAO.list(shopId);
		shopInfo.setShopOpenStatus(shopInfoEntity.getShopOpenStatus());
		shopInfo.setShopOpeningHours(shopInfoEntity.getShopOpeningHours());
		shopInfo.setShopMainCategory(shopInfoEntity.getShopMainCategory());
		//shopInfo.setShopCategories(shopInfoEntity.getShopCategories());
		return shopInfo;
	}
	
	@Transactional
	public List<ShopBranch> getShopBranches(int shopId){
		LOGGER.info("Inside getShopBranches function...");
		List<ShopBranch> shopBranches = new ArrayList<ShopBranch>();
		List<ShopEntity> shopBranchEntities = new ArrayList<ShopEntity>();
		shopBranchEntities = shopDAO.getShopBranches(shopId);
		
		//Get all the shopReviewEntities records and add to ShopReview Model
		for (ShopEntity sbe: shopBranchEntities){
			
			ShopBranch shopBranch = new ShopBranch();
			shopBranch.setShopBranchesShopId(sbe.getShopId());
			shopBranch.setShopName(sbe.getShopName());
			shopBranch.setShopProprietorId(sbe.getShopProprietorId());
			shopBranch.setShopPhone(sbe.getShopPhone());
			shopBranch.setShopMobile(sbe.getShopMobile());
			shopBranch.setShopBranchesManagerId(sbe.getShopProprietorId());
			shopBranch.setShopBranchesStatus(sbe.getShopStatus());
			
			shopBranches.add(shopBranch);
			shopBranch = null;
		}
		return shopBranches;
	}
	
	public List<ShopReview> getShopReviews(int shopId){
		/*//ShopReviews
		List<ShopReview> shopReviews = new ArrayList<ShopReview>();
		List<ShopReviewEntity> shopReviewEntities = new ArrayList<ShopReviewEntity>();
		shopReviewEntities = shopReviewDAO.list(se.getShopId());
		
		//Get all the shopReviewEntities records and add to ShopReview Model
		for (ShopReviewEntity sre: shopReviewEntities){
			ShopReview shopReview = new ShopReview();
			shopReview.setShopReviewShopRating(sre.getShopReviewShopRating());
			shopReviews.add(shopReview);
		}*/
		return null;
	}
	
	public ShopLoyaltyCard getShopLoyaltyCard(int shopId){
		return null;
	}
	
	public ShopLoyaltyProgram getShopLoyaltyProgram(int shopId){
		return null;
	}
	
	public Offer getShopOffer(int shopId){
		return null;
	}
	
}
