package com.woopt.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.woopt.api.common.WooptCode;
import com.woopt.api.model.Offer;
import com.woopt.api.model.OfferUserPublish;
import com.woopt.api.model.ShopEmployee;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyCardStage;
import com.woopt.api.model.ShopLoyaltyProgram;
import com.woopt.api.model.ShopLoyaltyProgramStage;
import com.woopt.api.model.ShopModel;
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
	
	private ShopService shopService;
	
    @Autowired
    @Qualifier(value="shopService")
    public void setShopService(ShopService ss){
        this.shopService = ss;
    }
		
	
	@RequestMapping(value = "/myshops", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<ShopModel>> getShops(@RequestBody UserModel userModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /api/shop/myshops api");
		LOGGER.info("Input User:" + userModel);
		HttpHeaders returnHeader = new HttpHeaders();
		User user = null;

		List<ShopModel> shopModels = new ArrayList<ShopModel>();
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != userModel){
				user = userModel.getUser();
				LOGGER.info("Calling getShopModelsbyUser funtion to get shop list for the user :" + user.getUserId());
				shopModels = shopService.getShopModelsbyUser(user.getUserId());		       
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return ShopModel:" + shopModels);
		return new ResponseEntity<List<ShopModel>>(shopModels, returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<ShopModel>> addShops(@RequestBody ShopModel shopModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /api/shop/add api");
		LOGGER.info("Input User:" + shopModel);
		
		//LOGGER.info(">>>>>>" + header.get("shopId"));
		
		HttpHeaders returnHeader = new HttpHeaders();
		User user = null;

		List<ShopModel> shopModels = new ArrayList<ShopModel>();
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopModel){
				//user = userModel.getUser();
				shopModels = shopService.addShopModel(shopModel);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return ShopModel:" + shopModels);
		return new ResponseEntity<List<ShopModel>>(shopModels, returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<ShopModel>> updateShops(@RequestBody ShopModel shopModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /api/shop/update api");
		LOGGER.info("Input User:" + shopModel);
		HttpHeaders returnHeader = new HttpHeaders();
		User user = null;

		List<ShopModel> shopModels = new ArrayList<ShopModel>();
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopModel){
				//user = userModel.getUser();
				shopModels = shopService.updateShopModel(shopModel);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return ShopModel:" + shopModels);
		return new ResponseEntity<List<ShopModel>>(shopModels, returnHeader, HttpStatus.OK);
	}
	
	//Shop Employee related rest services go here
	
	//API to add new shop employee
	@RequestMapping(value = "/employee", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<ShopEmployee>> employeePOST(@RequestBody ShopEmployee shopEmployee, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		
		HttpHeaders returnHeader = new HttpHeaders();
			
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));
		LOGGER.info("shopId value :" + shopId);

		List<ShopEmployee> shopEmployees = new ArrayList<ShopEmployee>();
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopEmployee){
				//user = userModel.getUser();
				shopEmployee = shopService.addShopEmployee(shopId,shopEmployee);
				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
		
		LOGGER.info("SHOP Employee ############# :" + shopEmployee);
		shopEmployees = shopService.getShopEmployees(shopId);
	
		LOGGER.info("Return ShopEmployees:" + shopEmployees);
		return new ResponseEntity<List<ShopEmployee>>(shopEmployees, returnHeader, HttpStatus.OK);
	}
	
	//API to get shop employee by id
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<List<ShopEmployee>> employeeGET(@RequestBody ShopEmployee shopEmployee, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	
	//API to get update employee
	@RequestMapping(value = "/employee", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<List<ShopEmployee>> employeePUT(@RequestBody ShopEmployee shopEmployee, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("ShopId").get(0));
		
		List<ShopEmployee> shopEmployees = new ArrayList<ShopEmployee>();
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopEmployee){
				//user = userModel.getUser();
				shopEmployee = shopService.updateShopEmployee(shopId, shopEmployee);
				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
		
		shopEmployees = shopService.getShopEmployees(shopId);
	
		LOGGER.info("Return ShopEmployees:" + shopEmployees);
		return new ResponseEntity<List<ShopEmployee>>(shopEmployees, returnHeader, HttpStatus.OK);
	}
	
	//Shop Loyalty Card related rest services go here
	
	//API to add new shop loyalty card
	@RequestMapping(value = "/lcard", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyCard> lcardPOST(@RequestBody ShopLoyaltyCard shopLoyaltyCard, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopLoyaltyCard){
				LOGGER.info("Inside shopLoyaltyCard....");
				shopLoyaltyCard = shopService.addShopLoyaltyCard(shopLoyaltyCard,shopId);
				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return shopLoyaltyCard !!!!!!!!:" + shopLoyaltyCard);
		return new ResponseEntity<ShopLoyaltyCard>(shopLoyaltyCard, returnHeader, HttpStatus.OK);
	}
	

	//API to update shop loyalty card
	@RequestMapping(value = "/lcard", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyCard> lcardPUT(@RequestBody ShopLoyaltyCard shopLoyaltyCard, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopLoyaltyCard){
				LOGGER.info("Inside shopLoyaltyCard....");
				shopLoyaltyCard = shopService.updateShopLoyaltyCard(shopLoyaltyCard,shopId);				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return shopLoyaltyCard !!!!!!!!:" + shopLoyaltyCard);
		return new ResponseEntity<ShopLoyaltyCard>(shopLoyaltyCard, returnHeader, HttpStatus.OK);
	}
	
	//API to update shop loyalty card stage
	@RequestMapping(value = "/lcard/stage", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyCardStage> lcardStagePUT(@RequestBody ShopLoyaltyCardStage shopLoyaltyCardStage, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopLoyaltyCardStage){
				shopLoyaltyCardStage = shopService.updateShopLoyaltyCardStage(shopLoyaltyCardStage);				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return shopLoyaltyCard !!!!!!!!:" + shopLoyaltyCardStage);
		return new ResponseEntity<ShopLoyaltyCardStage>(shopLoyaltyCardStage, returnHeader, HttpStatus.OK);
	}
	
	//Shop Loyalty Program related rest services go here

	//API to add new shop loyalty program
	@RequestMapping(value = "/lprogram", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyProgram> lprogramPOST(@RequestBody ShopLoyaltyProgram shopLoyaltyProgram, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopLoyaltyProgram){
				LOGGER.info("Inside shopLoyaltyProgram....");
				shopLoyaltyProgram = shopService.addShopLoyaltyProgram(shopLoyaltyProgram,shopId);				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return shopLoyaltyProgram !!!!!!!!:" + shopLoyaltyProgram);
		return new ResponseEntity<ShopLoyaltyProgram>(shopLoyaltyProgram, returnHeader, HttpStatus.OK);
	}
	

	//API to update shop loyalty program
	@RequestMapping(value = "/lprogram", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyProgram> lprogramPUT(@RequestBody ShopLoyaltyProgram shopLoyaltyProgram, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopLoyaltyProgram){
				LOGGER.info("Inside shopLoyaltyProgram....");
				shopLoyaltyProgram = shopService.updateShopLoyaltyProgram(shopLoyaltyProgram,shopId);				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return shopLoyaltyProgram !!!!!!!!:" + shopLoyaltyProgram);
		return new ResponseEntity<ShopLoyaltyProgram>(shopLoyaltyProgram, returnHeader, HttpStatus.OK);
	}
	
	//API to update shop loyalty program stage
	@RequestMapping(value = "/lprogram/stage", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyProgramStage> lprogramStagePOST(@RequestBody ShopLoyaltyProgramStage shopLoyaltyProgramStage, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopLoyaltyProgramStage){
				LOGGER.info("Inside ShopLoyaltyProgramStage....");
				shopLoyaltyProgramStage = shopService.updateShopLoyaltyProgramStage(shopLoyaltyProgramStage);				
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return shopLoyaltyProgram !!!!!!!!:" + shopLoyaltyProgramStage);
		return new ResponseEntity<ShopLoyaltyProgramStage>(shopLoyaltyProgramStage, returnHeader, HttpStatus.OK);
	}
	
	//Offer related rest services go here
	
	//API to add new offer
	@RequestMapping(value = "/offer", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<Offer>> offerPOST(@RequestBody Offer offer, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));
		
		LOGGER.debug("Inside offer api....");

		int responseCode = WooptCode.SUCCESS;
		List<Offer> offers = new ArrayList<Offer>();
		
		try{			
			if (null != offer){
				LOGGER.debug("Inside offer...." + offer);
				offer = shopService.addShopOffer(offer,shopId);
				
				//offers = shopService.getShopOffer(shopId);
			}			
		}
		catch (Exception e){
			LOGGER.error("----- Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return shopLoyaltyProgram !!!!!!!!:" + offer);
		return new ResponseEntity<List<Offer>>(offers, returnHeader, HttpStatus.OK);
	}
	
	//API to update offer
	@RequestMapping(value = "/offer", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<List<Offer>> offerPUT(@RequestBody Offer offer, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	
	//API to publish offer
	@RequestMapping(value = "/offer/publish", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<Offer> offerPublishPUT(@RequestBody Offer offer, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != offer){

				int str = shopService.publishShopOffer(offer,shopId);

			}			
		}
		catch (Exception e){
			LOGGER.error("----- Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return offer !!!!!!!!:" + offer);
		return new ResponseEntity<Offer>(offer, returnHeader, HttpStatus.OK);
	}
	
	//API to get published offer
	@RequestMapping(value = "/offer/published", method = RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<List<OfferUserPublish>> offerPublishGET(
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		HttpHeaders returnHeader = new HttpHeaders();
		
		//Getting the shopId from request header
		int shopId = Integer.parseInt(header.get("shopId").get(0));
		int userId = Integer.parseInt(header.get("userId").get(0));

		List<OfferUserPublish> offerUserPublishList = new ArrayList<OfferUserPublish>();

		int responseCode = WooptCode.SUCCESS;
		
		try{			

				offerUserPublishList = shopService.getPublishedShopOffersbyUser(userId, shopId);
			
		}
		catch (Exception e){
			LOGGER.error("----- Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return offer !!!!!!!!:" + offerUserPublishList);
		return new ResponseEntity<List<OfferUserPublish>>(offerUserPublishList, returnHeader, HttpStatus.OK);
	}


}
