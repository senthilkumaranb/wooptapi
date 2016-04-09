package com.woopt.api.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.woopt.api.common.WooptCode;
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
import com.woopt.api.model.Device;
import com.woopt.api.model.Shop;
import com.woopt.api.model.ShopBranch;
import com.woopt.api.model.ShopInfo;
import com.woopt.api.model.ShopModel;
import com.woopt.api.model.ShopReview;
import com.woopt.api.model.User;
import com.woopt.api.model.UserModel;
import com.woopt.api.service.ShopService;


/**
 * REST Controller Implementation
 * Spring REST provides REST implementation
 * @author Senthil
 *
 */
@RestController
@RequestMapping("/shop")
public class ShopController {
	
	private static final Logger LOGGER = Logger.getLogger(ShopController.class.getName());
	
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
	
	
	@RequestMapping(value = "/myshops", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<ShopModel>> getShopDetails(@RequestBody UserModel userModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /api/shop/myshops api");
		LOGGER.info("Input User:" + userModel);
		HttpHeaders returnHeader = new HttpHeaders();
		User user = null;
		//ShopModel shopModel=null;
		List<ShopModel> shopModels = new ArrayList<ShopModel>();
		String responseCode = WooptCode.SUCCESS;
		
		try{
			
			if (null != userModel){
				user = userModel.getUser();
				LOGGER.info("Calling getmyShop funtion to get shop list for the user :" + user.getUserId());
				//to test
				List<ShopEntity> shopEntities = new ArrayList<ShopEntity>();
				
				LOGGER.info("Inside getmyshop function with userID" + user.getUserId());
				
				try{
					LOGGER.info("calling getusershops function ");
					shopEntities = shopDAO.getUserShops(user.getUserId());
				}
				catch (Exception e){
					LOGGER.info("Exception :" + e.getMessage());
				}
		        
				LOGGER.info("ShopEntities Shop Name: " + shopEntities.get(0).getShopName());
				//test end
				//shopModels = new ShopService().getMyShops(user.getUserId());
				
				for (ShopEntity se: shopEntities) {
		        	
		        	ShopModel shopModel = new ShopModel();
		        	
		        	LOGGER.info("Inside for loop....");
		        	//Shop
			        Shop shop=new Shop();
			        shop.setShopName(se.getShopName());
			        shop.setShopId(se.getShopId());
			        
			        shopModel.setShop(shop);
			        LOGGER.info("shopModel Shop Name: " + shopModel.getShop().getShopName());
			       
			        //ShopInfo
			        ShopInfo shopInfo = new ShopInfo();
					ShopInfoEntity shopInfoEntity = new ShopInfoEntity();			
					shopInfoEntity = shopInfoDAO.list(se.getShopId());
					shopInfo.setShopOpenStatus(shopInfoEntity.getShopOpenStatus());
					shopInfo.setShopOpeningHours(shopInfoEntity.getShopOpeningHours());
					shopInfo.setShopMainCategory(shopInfoEntity.getShopMainCategory());
					//shopInfo.setShopCategories(shopInfoEntity.getShopCategories());
					
			        shopModel.setShopInfo(shopInfo);
			        LOGGER.info("shopModel ShopInfo Opening hours: " + shopModel.getShopInfo().getShopOpeningHours());
					
					/*//ShopBranches
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
					}*/
					
					shopModels.add(shopModel);
					
					shopModel = null;

		        }
		        //shops.add(shop);
			}
			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
	LOGGER.info("Return ShopModel:" + shopModels);
	return new ResponseEntity<List<ShopModel>>(shopModels, returnHeader, HttpStatus.OK);
	}

}
