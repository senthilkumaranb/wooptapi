package com.woopt.api.service;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.*;

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
import com.woopt.api.dao.impl.ShopLoyaltyCardDAOImpl;
import com.woopt.api.entity.ShopBranchEntity;
import com.woopt.api.entity.ShopEntity;
import com.woopt.api.entity.ShopInfoEntity;
import com.woopt.api.entity.ShopLoyaltyCardEntity;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;
import com.woopt.api.entity.ShopReviewEntity;
import com.woopt.api.model.Offer;
import com.woopt.api.model.Shop;
import com.woopt.api.model.ShopBranch;
import com.woopt.api.model.ShopInfo;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyCardStage;
import com.woopt.api.model.ShopLoyaltyProgram;
import com.woopt.api.model.ShopModel;
import com.woopt.api.model.ShopReview;
import com.woopt.api.model.UserModel;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class ShopService {
	
	private static final Logger LOGGER = Logger.getLogger(ShopService.class.getName());
	
	ObjectMapper mapper = new ObjectMapper();
	
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
			
			ShopLoyaltyCard shopLoyaltyCard = this.getShopLoyaltyCard(shopId);
			if (shopLoyaltyCard!=null)
				shopModel.setShopLoyaltyCard(shopLoyaltyCard);
			
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
		
	
		Gson gson = new Gson();
		String jsonShops = gson.toJson(shopEntities, new TypeToken<List<ShopEntity>>() {}.getType());
		LOGGER.info("!!!!!!!!!!!!!!! Json Shop Entities !!!!!!!!!!!!!!!!" + jsonShops);
		
		shops = gson.fromJson(jsonShops, new TypeToken<List<Shop>>() {}.getType());
		LOGGER.info("!!!!!!!!!!!!!!! Jackson Json conversion !!!!!!!!!!!!!!!!11" + shops);

		/*String jsonShops=null;
		try {
			jsonShops = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(shopEntities);
			LOGGER.info("!!!!!!!!!!!!!!! Json Shop Entities !!!!!!!!!!!!!!!!" + jsonShops);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			shops = mapper.readValue(jsonShops, new TypeReference<List<Shop>>(){});
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


		/*for (ShopEntity se: shopEntities) {
     	
        	//Shop
	        Shop shop=new Shop();
	        shop.setShopName(se.getShopName());
	        shop.setShopId(se.getShopId());
	        shops.add(shop);			
		}*/
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
		
		Gson gson = new Gson();
		String jsonShopBranches = gson.toJson(shopBranchEntities, new TypeToken<List<ShopEntity>>() {}.getType());
		LOGGER.info("!!!!!!!!!!!!!!! Json Shop Entities !!!!!!!!!!!!!!!!" + jsonShopBranches);
		
		shopBranches = gson.fromJson(jsonShopBranches, new TypeToken<List<ShopBranch>>() {}.getType());
		LOGGER.info("!!!!!!!!!!!!!!! Jackson Json conversion !!!!!!!!!!!!!!!!11" + shopBranches);
		
		//Get all the shopReviewEntities records and add to ShopReview Model
		/*for (ShopEntity sbe: shopBranchEntities){
			
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
		}*/
		
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
	
	@Transactional
	public ShopLoyaltyCard getShopLoyaltyCard(int shopId){
		ShopLoyaltyCard shopLoyaltyCard = new ShopLoyaltyCard();
		List<ShopLoyaltyCardStage> shopLoyaltyCardStages = new ArrayList<ShopLoyaltyCardStage>();

		ShopLoyaltyCardEntity shopLoyaltyCardEntity = new ShopLoyaltyCardEntity();
		shopLoyaltyCardEntity = shopLoyaltyCardDAO.getbyShopId(shopId);
		
		//Set the ShopLoyaltyCard model
		if (shopLoyaltyCardEntity!=null){
			shopLoyaltyCard.setShopLoyaltyCardId(shopLoyaltyCardEntity.getShopLoyaltyCardId());
			shopLoyaltyCard.setShopLoyaltyCardName(shopLoyaltyCardEntity.getShopLoyaltyCardName());
			
			LOGGER.info("ShopLoyaltyCard...." + shopLoyaltyCard);
			
			List<ShopLoyaltyCardStageEntity> shopLoyaltyCardStageEntities = new ArrayList<ShopLoyaltyCardStageEntity>();
			shopLoyaltyCardStageEntities = shopLoyaltyCardStageDAO.getbyId(shopLoyaltyCardEntity.getShopLoyaltyCardId());
			
			for (ShopLoyaltyCardStageEntity sse: shopLoyaltyCardStageEntities){
				ShopLoyaltyCardStage shopLoyaltyCardStage = new ShopLoyaltyCardStage();
				shopLoyaltyCardStage.setShopLoyaltyCardStageNo(sse.getShopLoyaltyCardStageId());
				shopLoyaltyCardStage.setShopLoyaltyCardStageIsRedeemable(sse.getShopLoyaltyCardStageIsRedeemable());
				shopLoyaltyCardStage.setShopLoyaltyCardStageReward(sse.getShopLoyaltyCardStageReward());
				shopLoyaltyCardStage.setShopLoyaltyCardStageRewardPhoto(sse.getShopLoyaltyCardStageRewardPhoto());
				shopLoyaltyCardStage.setShopLoyaltyCardStageStatus(sse.getShopLoyaltyCardStageStatus());
				shopLoyaltyCardStages.add(shopLoyaltyCardStage);
				shopLoyaltyCardStage = null;
			}

			shopLoyaltyCard.setShopLoyaltyCardStage(shopLoyaltyCardStages);
			return shopLoyaltyCard;
		} 
		else {
			return null;
		}
		
	}
	
	public ShopLoyaltyProgram getShopLoyaltyProgram(int shopId){
		return null;
	}
	
	public Offer getShopOffer(int shopId){
		return null;
	}
	
}
