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
import com.woopt.api.dao.UserDAO;
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
import com.woopt.api.entity.UserEntity;
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
import com.woopt.api.model.User;
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
	
	@Autowired
	UserDAO userDAO;
	
	//SHOP MODEL RELATED FUNCTIONS GO HERE
	
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
	
	// function to update shop model
	public List<ShopModel> updateShopModel(ShopModel shopModel){
		String returnCode;
		Shop shop = new Shop();
		shop = shopModel.getShop();
		shop = this.updateShop(shop);
		
		return null;
	}
	
	//SHOP RELATED FUNCTIONS GO HERE
	
	//function to get all shops owned by user
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

		return shops;

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
	
	//SHOPINFO RELATED FUNCTIONS GO HERE
	
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
	
		
	// function to update shopInfo
	public ShopInfo updateShopInfo(ShopInfo shopInfo){
		return null;
	}
	
	//SHOP BRANCHES RELATED FUNCTIONS GO HERE
	
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
		
	// function to update a new shop Branch
	public ShopBranch updateShopBranch(ShopBranch shopBranch){
		return null;
	}
	
	//SHOP EMPLOYEE RELATED FUNCTIONS GO HERE
	
	@Transactional
	public List<ShopEmployee> getShopEmployees(int shopId){
		List<ShopEmployee> shopEmployees = new ArrayList<ShopEmployee>();
		List<ShopEmployeeEntity> shopEmployeeEntities = new ArrayList<ShopEmployeeEntity>();
		shopEmployeeEntities = shopEmployeeDAO.getEmployeesbyShopId(shopId);
		
		for(ShopEmployeeEntity e: shopEmployeeEntities){
			ShopEmployee shopEmployee = new ShopEmployee();
			shopEmployee.setShopEmployeeId(e.getShopEmployeeId());
			shopEmployee.setUser(this.getShopUser(e.getUserId()));
			shopEmployee.setShopEmployeeRole(e.getShopEmployeeRole());
			shopEmployee.setShopEmployeeStatus(e.getShopEmployeeStatus());
			shopEmployee=null;
			shopEmployees.add(shopEmployee);
		}

		return shopEmployees;
	}

	public User getShopUser(int userId){
		
		User user = new User();
		UserEntity userEntity = new UserEntity();
		
		userEntity = userDAO.findById(userId);
		Gson gson = new Gson();
		String jsonUser = gson.toJson(userEntity, UserEntity.class);
		user = gson.fromJson(jsonUser, User.class);
	
		return user;
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
	
	// function to update shop Employee
	public ShopEmployee updateShopEmployee(ShopEmployee shopEmployee,int shopId){
		ShopEmployeeEntity shopEmployeeEntity = new ShopEmployeeEntity();
		Gson gson = new Gson();
		String jsonShopEmpEntity = gson.toJson(shopEmployee, ShopEmployee.class);
		shopEmployeeEntity = gson.fromJson(jsonShopEmpEntity, ShopEmployeeEntity.class);
		
		shopEmployeeEntity.setShopId(shopId);
		shopEmployeeEntity.setUserId(shopEmployee.getUser().getUserId());
	
		LOGGER.info("!!!!!! shopEntity !!!!!!" + shopEmployeeEntity);
		try {
			shopEmployeeDAO.update(shopEmployeeEntity);
			return shopEmployee;
		}
		catch (Exception e){
			return null;
		}
	}
	
	//SHOP LOYALTY CARD FUNCTIONS GO HERE
	
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
		
		
	// function to update shop loyalty card
	public String updateShopLoyaltyCard(ShopLoyaltyCard shopLoyaltyCard){
		ShopLoyaltyCardEntity shopLoyaltyCardEntity = new ShopLoyaltyCardEntity();
		Gson gson = new Gson();
		String jsonShopLoyaltyCardEntity = gson.toJson(shopLoyaltyCard, ShopLoyaltyCard.class);
		shopLoyaltyCardEntity = gson.fromJson(jsonShopLoyaltyCardEntity, ShopLoyaltyCardEntity.class);
		try {
			shopLoyaltyCardDAO.update(shopLoyaltyCardEntity);
			
			for (ShopLoyaltyCardStage stage: shopLoyaltyCard.getShopLoyaltyCardStage()){
				ShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity = new ShopLoyaltyCardStageEntity();
				String jsonShopLoyaltyCardStageEntity = gson.toJson(stage, ShopLoyaltyCardStage.class);
				shopLoyaltyCardStageEntity = gson.fromJson(jsonShopLoyaltyCardStageEntity, ShopLoyaltyCardStageEntity.class);
				shopLoyaltyCardStageDAO.update(shopLoyaltyCardStageEntity);
			}
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	// function to update shop loyalty card Stage
	public String updateShopLoyaltyCardStage(ShopLoyaltyCardStage shopLoyaltyCardStage){
		Gson gson = new Gson();
		try {
			ShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity = new ShopLoyaltyCardStageEntity();
			String jsonShopLoyaltyCardStageEntity = gson.toJson(shopLoyaltyCardStage, ShopLoyaltyCardStage.class);
			shopLoyaltyCardStageEntity = gson.fromJson(jsonShopLoyaltyCardStageEntity, ShopLoyaltyCardStageEntity.class);
			shopLoyaltyCardStageDAO.update(shopLoyaltyCardStageEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
		
	
	//SHOP LOYALTY PROGRAM RELATED FUNCTIONS GO HERE
	
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
			shopLoyaltyProgramStageEntities = shopLoyaltyProgramStageDAO.getbyProgramId(shopLoyaltyProgramEntity.getShopLoyaltyProgramId());
			
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
	
	public ShopLoyaltyProgramStage getShopLoyaltyProgramStage(int shopLoyaltyProgramStageId){
		ShopLoyaltyProgramStageEntity slpe = new ShopLoyaltyProgramStageEntity();
		slpe = shopLoyaltyProgramStageDAO.findById(shopLoyaltyProgramStageId);
		ShopLoyaltyProgramStage shopLoyaltyProgramStage = new ShopLoyaltyProgramStage();
		if (slpe!=null) {
			shopLoyaltyProgramStage.setShopLoyaltyProgramStageNo(slpe.getShopLoyaltyProgramStageId());
			shopLoyaltyProgramStage.setShopLoyaltyProgramStageName(slpe.getShopLoyaltyProgramStageName());
			shopLoyaltyProgramStage.setShopLoyaltyProgramStageDiscount(slpe.getShopLoyaltyProgramStageDiscount());
			shopLoyaltyProgramStage.setShopLoyaltyProgramStagePromotionEligibility(slpe.getShopLoyaltyProgramStagePromotionEligibility());
		}
		return shopLoyaltyProgramStage;
	}
	
	//Function to get shoploaylty program stages
	//currently not used
	public List<ShopLoyaltyProgramStage> getShopLoyaltyProgramStages(int shopLoyaltyProgramId){
		List<ShopLoyaltyProgramStageEntity> shopLoyaltyProgramStageEntities = new ArrayList<ShopLoyaltyProgramStageEntity>();
		shopLoyaltyProgramStageEntities = shopLoyaltyProgramStageDAO.getbyProgramId(shopLoyaltyProgramId);
		
		List<ShopLoyaltyProgramStage> shopLoyaltyProgramStages = new ArrayList<ShopLoyaltyProgramStage>();
		
		for (ShopLoyaltyProgramStageEntity slpe: shopLoyaltyProgramStageEntities){
			ShopLoyaltyProgramStage shopLoyaltyProgramStage = new ShopLoyaltyProgramStage();
			shopLoyaltyProgramStage.setShopLoyaltyProgramStageNo(slpe.getShopLoyaltyProgramStageId());
			shopLoyaltyProgramStage.setShopLoyaltyProgramStageName(slpe.getShopLoyaltyProgramStageName());
			shopLoyaltyProgramStage.setShopLoyaltyProgramStageDiscount(slpe.getShopLoyaltyProgramStageDiscount());
			shopLoyaltyProgramStage.setShopLoyaltyProgramStagePromotionEligibility(slpe.getShopLoyaltyProgramStagePromotionEligibility());
			shopLoyaltyProgramStages.add(shopLoyaltyProgramStage);
			shopLoyaltyProgramStage=null;
		}
		return shopLoyaltyProgramStages;
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
	
	// function to update shop loyalty program
	public String updateShopLoyaltyProgram(ShopLoyaltyProgram shopLoyaltyProgram){
		ShopLoyaltyProgramEntity shopLoyaltyProgramEntity = new ShopLoyaltyProgramEntity();
		Gson gson = new Gson();
		String jsonShopLoyaltyProgramEntity = gson.toJson(shopLoyaltyProgram, ShopLoyaltyProgram.class);
		shopLoyaltyProgramEntity = gson.fromJson(jsonShopLoyaltyProgramEntity, ShopLoyaltyProgramEntity.class);
		try {
			shopLoyaltyProgramDAO.update(shopLoyaltyProgramEntity);
			for (ShopLoyaltyProgramStage stage: shopLoyaltyProgram.getShopLoyaltyProgramStage()){
				ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity = new ShopLoyaltyProgramStageEntity();
				String jsonShopLoyaltyProgramStageEntity = gson.toJson(stage, ShopLoyaltyProgramStage.class);
				shopLoyaltyProgramStageEntity = gson.fromJson(jsonShopLoyaltyProgramStageEntity, ShopLoyaltyProgramStageEntity.class);
				shopLoyaltyProgramStageDAO.update(shopLoyaltyProgramStageEntity);
			}
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
		
	
	//function to update shop loyalty program stage
	public String updateShopLoyaltyProgramStage(ShopLoyaltyProgramStage shopLoyaltyProgramStage){
		Gson gson = new Gson();
		try{
			ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity = new ShopLoyaltyProgramStageEntity();
			String jsonShopLoyaltyProgramStageEntity = gson.toJson(shopLoyaltyProgramStage, ShopLoyaltyProgramStage.class);
			shopLoyaltyProgramStageEntity = gson.fromJson(jsonShopLoyaltyProgramStageEntity, ShopLoyaltyProgramStageEntity.class);
			shopLoyaltyProgramStageDAO.update(shopLoyaltyProgramStageEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	//Offer related functions go here
	
	//function to get shop offer list
	public List<Offer> getShopOffer(int shopId){
		List<Offer> shopOffers = new ArrayList<Offer>();
		List<OfferEntity> shopOfferEntities = new ArrayList<OfferEntity>();
		shopOfferEntities = offerDAO.getbyShopId(shopId);
		
		Gson gson = new Gson();
		String jsonOfferEntities = gson.toJson(shopOfferEntities, new TypeToken<List<OfferEntity>>() {}.getType());
		shopOffers = gson.fromJson(jsonOfferEntities, new TypeToken<List<Offer>>() {}.getType());
		
		return shopOffers;
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
		
	// function to add a new shop offer
	public String updateShopOffer(Offer shopOffer){
		OfferEntity offerEntity = new OfferEntity();
		Gson gson = new Gson();
		String jsonOffer = gson.toJson(shopOffer, Offer.class);
		offerEntity = gson.fromJson(jsonOffer, OfferEntity.class);
		try {
			offerDAO.update(offerEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}
	}
	
	// function to publish Shop Offer
	public String publishShopOffer(Offer shopOffer){
		return null;
	}
	
	//SHOP REVIEW RELATED FUNCTIONS GO HERE
	
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
	
	
}
