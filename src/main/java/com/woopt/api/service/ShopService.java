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

import com.woopt.api.common.WooptCode;
import com.woopt.api.dao.OfferDAO;
import com.woopt.api.dao.ShopBranchDAO;
import com.woopt.api.dao.ShopDAO;
import com.woopt.api.dao.ShopEmployeeDAO;
import com.woopt.api.dao.ShopInfoDAO;
import com.woopt.api.dao.ShopLoyaltyCardDAO;
import com.woopt.api.dao.ShopLoyaltyCardStageDAO;
import com.woopt.api.dao.ShopLoyaltyProgramDAO;
import com.woopt.api.dao.ShopLoyaltyProgramStageDAO;
import com.woopt.api.dao.ShopReviewDAO;
import com.woopt.api.dao.impl.ShopLoyaltyCardDAOImpl;
import com.woopt.api.entity.OfferEntity;
import com.woopt.api.entity.ShopBranchEntity;
import com.woopt.api.entity.ShopEmployeeEntity;
import com.woopt.api.entity.ShopEntity;
import com.woopt.api.entity.ShopInfoEntity;
import com.woopt.api.entity.ShopLoyaltyCardEntity;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;
import com.woopt.api.entity.ShopLoyaltyProgramEntity;
import com.woopt.api.entity.ShopLoyaltyProgramStageEntity;
import com.woopt.api.entity.ShopReviewEntity;
import com.woopt.api.model.Offer;
import com.woopt.api.model.Shop;
import com.woopt.api.model.ShopBranch;
import com.woopt.api.model.ShopEmployee;
import com.woopt.api.model.ShopInfo;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyCardStage;
import com.woopt.api.model.ShopLoyaltyProgram;
import com.woopt.api.model.ShopLoyaltyProgramStage;
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

/**
 * Service Implementation for ShopController
 * calls DAO
 * @author Senthil
 *
 */
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
	
	@Autowired
	ShopLoyaltyProgramDAO shopLoyaltyProgramDAO;
	
	@Autowired
	ShopLoyaltyProgramStageDAO shopLoyaltyProgramStageDAO;
	
	@Autowired
	OfferDAO offerDAO;
	
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
			
			ShopLoyaltyProgram shopLoyaltyProgram = this.getShopLoyaltyProgram(shopId);
			if (shopLoyaltyProgram!=null)
				shopModel.setShopLoyaltyProgram(shopLoyaltyProgram);
			
			List<Offer> shopOffers = this.getShopOffer(shopId);
			if (shopOffers.size()!=0)
				shopModel.setOffer(shopOffers);
			
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
		ShopLoyaltyProgram shopLoyaltyProgram = new ShopLoyaltyProgram();
		ShopLoyaltyProgramEntity shopLoyaltyProgramEntity = new ShopLoyaltyProgramEntity();
		shopLoyaltyProgramEntity = shopLoyaltyProgramDAO.getbyShopId(shopId);
		
		if (shopLoyaltyProgramEntity!=null){
			Gson gson = new Gson();
			String jsonShopProgramEntity = gson.toJson(shopLoyaltyProgramEntity, ShopLoyaltyProgramEntity.class);
			LOGGER.info("!!!!!!!!!!!!!!! Json Shop Program Entities !!!!!!!!!!!!!!!!" + jsonShopProgramEntity);
			
			shopLoyaltyProgram = gson.fromJson(jsonShopProgramEntity, ShopLoyaltyProgram.class);
			LOGGER.info("!!!!!!!!!!!!!!! Jackson Json Loyalty Program conversion !!!!!!!!!!!!!!!!11" + shopLoyaltyProgram);
			
			List<ShopLoyaltyProgramStageEntity> shopLoyaltyProgramStageEntities = new ArrayList<ShopLoyaltyProgramStageEntity>();
			shopLoyaltyProgramStageEntities = shopLoyaltyProgramStageDAO.getbyId(shopLoyaltyProgramEntity.getShopLoyaltyProgramId());
			
			if(shopLoyaltyProgramStageEntities.size()!=0){
				String jsonShopProgramStageEntity = gson.toJson(shopLoyaltyProgramStageEntities, new TypeToken<List<ShopLoyaltyProgramStageEntity>>() {}.getType());
				List<ShopLoyaltyProgramStage> shopLoyaltyProgramStages = new ArrayList<ShopLoyaltyProgramStage>();
				shopLoyaltyProgramStages = gson.fromJson(jsonShopProgramStageEntity, new TypeToken<List<ShopLoyaltyProgramStage>>() {}.getType());
				shopLoyaltyProgram.setShopLoyaltyProgramStage(shopLoyaltyProgramStages);
			}
			return shopLoyaltyProgram;
		}
		else {
			return null;
		}
	}
	
	public List<Offer> getShopOffer(int shopId){
		List<Offer> shopOffers = new ArrayList<Offer>();
		List<OfferEntity> shopOfferEntities = new ArrayList<OfferEntity>();
		shopOfferEntities = offerDAO.getbyShopId(shopId);
		
		Gson gson = new Gson();
		String jsonOfferEntities = gson.toJson(shopOfferEntities, new TypeToken<List<OfferEntity>>() {}.getType());
		shopOffers = gson.fromJson(jsonOfferEntities, new TypeToken<List<Offer>>() {}.getType());
		
		return shopOffers;
	}
	
	// function to add a new shop model
	@Transactional
	public List<ShopModel> addShopModel(ShopModel shopModel){
		
		String returnCode;
		Shop shop = new Shop();
		shop = shopModel.getShop();
		int shopId = this.addShop(shop);
		shop.setShopId(shopId);
		
		returnCode = this.addShopInfo(shopModel.getShopInfo(), shopId);
		
		for (ShopBranch sb: shopModel.getShopBranches()){
			returnCode = this.addShopBranch(sb);
		}
		
		for (ShopEmployee se: shopModel.getShopEmployee()){
			returnCode = this.addShopEmployee(se);
		}
		
		returnCode = this.addShopLoyaltyCard(shopModel.getShopLoyaltyCard());
		
		returnCode = this.addShopLoyaltyProgram(shopModel.getShopLoyaltyProgram());
		
		for (Offer so: shopModel.getOffer()) {
			returnCode = this.addShopOffer(so);
		}

		return null;
	}
	
	// function to add a new shop
	@Transactional
	public int addShop(Shop shop){
		
		ShopEntity shopEntity = new ShopEntity();
		Gson gson = new Gson();
		String jsonShopEntity = gson.toJson(shop, Shop.class);
		shopEntity = gson.fromJson(jsonShopEntity, ShopEntity.class);
		LOGGER.info("!!!!!! shopEntity !!!!!!" + shopEntity);
		try {
			int shopId = shopDAO.save(shopEntity);
			return shopId;
		}
		catch (Exception e){
			return -1;
		}

	}
	
	// function to add a new shop info
	@Transactional
	public String addShopInfo(ShopInfo shopInfo, int shopId){
		ShopInfoEntity shopInfoEntity = new ShopInfoEntity();
		Gson gson = new Gson();
		String jsonShopInfoEntity = gson.toJson(shopInfo, ShopInfo.class);
		shopInfoEntity = gson.fromJson(jsonShopInfoEntity, ShopInfoEntity.class);
		shopInfoEntity.setShopId(shopId);
		try {
			shopInfoDAO.save(shopInfoEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	// function to add a new shop Branch
	public String addShopBranch(ShopBranch shopBranch){
		ShopBranchEntity shopBranchEntity = new ShopBranchEntity();
		Gson gson = new Gson();
		String jsonShopBranchEntity = gson.toJson(shopBranch, ShopBranch.class);
		shopBranchEntity = gson.fromJson(jsonShopBranchEntity, ShopBranchEntity.class);
		try {
			shopBranchDAO.save(shopBranchEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	// function to add a new shop Employee
	public String addShopEmployee(ShopEmployee shopEmployee){
		ShopEmployeeEntity shopEmployeeEntity = new ShopEmployeeEntity();
		Gson gson = new Gson();
		String jsonShopEmployeeEntity = gson.toJson(shopEmployee, ShopEmployee.class);
		shopEmployeeEntity = gson.fromJson(jsonShopEmployeeEntity, ShopEmployeeEntity.class);
		try {
			shopEmployeeDAO.save(shopEmployeeEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	// function to add a new shop loyalty card
	public String addShopLoyaltyCard(ShopLoyaltyCard shopLoyaltyCard){
		ShopLoyaltyCardEntity shopLoyaltyCardEntity = new ShopLoyaltyCardEntity();
		Gson gson = new Gson();
		String jsonShopLoyaltyCardEntity = gson.toJson(shopLoyaltyCard, ShopLoyaltyCard.class);
		shopLoyaltyCardEntity = gson.fromJson(jsonShopLoyaltyCardEntity, ShopLoyaltyCardEntity.class);
		try {
			shopLoyaltyCardDAO.save(shopLoyaltyCardEntity);
			
			for (ShopLoyaltyCardStage stage: shopLoyaltyCard.getShopLoyaltyCardStage()){
				ShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity = new ShopLoyaltyCardStageEntity();
				String jsonShopLoyaltyCardStageEntity = gson.toJson(stage, ShopLoyaltyCardStage.class);
				shopLoyaltyCardStageEntity = gson.fromJson(jsonShopLoyaltyCardStageEntity, ShopLoyaltyCardStageEntity.class);
				shopLoyaltyCardStageDAO.save(shopLoyaltyCardStageEntity);
			}
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	// function to add a new shop loyalty program
	public String addShopLoyaltyProgram(ShopLoyaltyProgram shopLoyaltyProgram){
		ShopLoyaltyProgramEntity shopLoyaltyProgramEntity = new ShopLoyaltyProgramEntity();
		Gson gson = new Gson();
		String jsonShopLoyaltyProgramEntity = gson.toJson(shopLoyaltyProgram, ShopLoyaltyProgram.class);
		shopLoyaltyProgramEntity = gson.fromJson(jsonShopLoyaltyProgramEntity, ShopLoyaltyProgramEntity.class);
		try {
			shopLoyaltyProgramDAO.save(shopLoyaltyProgramEntity);
			for (ShopLoyaltyProgramStage stage: shopLoyaltyProgram.getShopLoyaltyProgramStage()){
				ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity = new ShopLoyaltyProgramStageEntity();
				String jsonShopLoyaltyProgramStageEntity = gson.toJson(stage, ShopLoyaltyProgramStage.class);
				shopLoyaltyProgramStageEntity = gson.fromJson(jsonShopLoyaltyProgramStageEntity, ShopLoyaltyProgramStageEntity.class);
				shopLoyaltyProgramStageDAO.save(shopLoyaltyProgramStageEntity);
			}
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	// function to add a new shop offer
	public String addShopOffer(Offer shopOffer){
		OfferEntity offerEntity = new OfferEntity();
		Gson gson = new Gson();
		String jsonOffer = gson.toJson(shopOffer, Offer.class);
		offerEntity = gson.fromJson(jsonOffer, OfferEntity.class);
		try {
			offerDAO.save(offerEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	
	// function to update shop model
	public List<ShopModel> updateShopModel(ShopModel shopModel){
		String returnCode;
		Shop shop = new Shop();
		shop = shopModel.getShop();
		shop = this.updateShop(shop);
		
		return null;
	}
		
	// function to update shop
	public Shop updateShop(Shop shop){
		ShopEntity shopEntity = new ShopEntity();
		Gson gson = new Gson();
		String jsonShopEntity = gson.toJson(shop, Shop.class);
		shopEntity = gson.fromJson(jsonShopEntity, ShopEntity.class);
		LOGGER.info("!!!!!! shopEntity !!!!!!" + shopEntity);
		try {
			shopDAO.update(shopEntity);
			return shop;
		}
		catch (Exception e){
			return shop;
		}
	}
		
	// function to update shopInfo
	public ShopInfo updateShopInfo(ShopInfo shopInfo){
		return null;
	}
		
	// function to update a new shop Branch
	public ShopBranch updateShopBranch(ShopBranch shopBranch){
		return null;
	}
		
	// function to update shop Employee
	public ShopEmployee updateShopEmployee(ShopEmployee shopEmployee){
		return null;
	}
		
		
	// function to update shop loyalty card
	public ShopLoyaltyCard updateShopLoyaltyCard(ShopLoyaltyCard shopLoyaltyCard){
		return null;
	}
	
	// function to update shop loyalty card
	public ShopLoyaltyCardStage updateShopLoyaltyCard(ShopLoyaltyCardStage shopLoyaltyCardStage){
		return null;
	}
		
	// function to update shop loyalty program
	public ShopLoyaltyProgram updateShopLoyaltyProgram(ShopLoyaltyProgram shopLoyaltyProgram){
		return null;
	}
		
	// function to add a new shop offer
	public Integer updateShopOffer(Offer shopOffer){
		return null;
	}
	
}
