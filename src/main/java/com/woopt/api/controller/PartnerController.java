package com.woopt.api.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import com.woopt.api.model.Cart;
import com.woopt.api.model.ConsumerCheckIn;
import com.woopt.api.model.ConsumerViewModel;
import com.woopt.api.model.Offer;
import com.woopt.api.model.Order;
import com.woopt.api.model.PartnerViewModel;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyCardStage;
import com.woopt.api.model.ShopLoyaltyProgram;
import com.woopt.api.model.ShopLoyaltyProgramStage;
import com.woopt.api.model.ShopModel;
import com.woopt.api.model.User;
import com.woopt.api.model.UserModel;
import com.woopt.api.service.ConsumerService;
import com.woopt.api.service.PartnerService;



/**
 * REST Controller Implementation
 * Spring REST provides REST implementation
 * @author Senthil
 *
 */
@RestController
@RequestMapping("/partner")
public class PartnerController {
	
	private static final Logger LOGGER = Logger.getLogger(PartnerController.class.getName());
	
	private PartnerService partnerService;
	
    @Autowired
    @Qualifier(value="partnerService")
    public void setPartnerService(PartnerService ps){
        this.partnerService = ps;
    }
    
    @RequestMapping(value = "/consumers", method = RequestMethod.GET, headers="Accept=application/json")
   	public ResponseEntity<List<PartnerViewModel>> partnerView( 
   			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
    	
   		HttpHeaders returnHeader = new HttpHeaders();
   		User user = null;
   		
   		Integer shopId = Integer.parseInt(header.get("shopId").get(0));

   		List<PartnerViewModel> partnerViewModels = new ArrayList<PartnerViewModel>();
   		int responseCode = WooptCode.SUCCESS;
   		
   		try{			
   			if (shopId!=null){
   				//user = userModel.getUser();
   				partnerViewModels = partnerService.getConsumers(shopId);
   			}			
   		}
   		catch (Exception e){
   			LOGGER.info("Exception :" + e.getMessage());
   		} finally {
   		}
   	
   		LOGGER.info("Return ShopModel:" + partnerViewModels);
   		return new ResponseEntity<List<PartnerViewModel>>(partnerViewModels, returnHeader, HttpStatus.OK);
   	}
    
    //API to search for customers
    @RequestMapping(value = "/consumers/search", method = RequestMethod.POST, headers="Accept=application/json")
   	public ResponseEntity<List<PartnerViewModel>> customerSearch(@RequestBody ShopModel shopModel, 
   			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
    	
    	return null;
    	
    }
    
	//API to check in consumer
	@RequestMapping(value = "/checkinConsumer", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<ConsumerCheckIn> checkInPost(@RequestBody ConsumerCheckIn consumerCheckIn, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /checkinConsumer api");
		LOGGER.info("Input User:" + consumerCheckIn);
		HttpHeaders returnHeader = new HttpHeaders();
		int consumerId = Integer.parseInt(header.get("consumerId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != consumerCheckIn){
				//user = userModel.getUser();
				consumerCheckIn = partnerService.checkInConsumer(consumerId);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return CheckInModel:" + consumerCheckIn);
		return new ResponseEntity<ConsumerCheckIn>(consumerCheckIn, returnHeader, HttpStatus.OK);
	}
	
	//Shop Loyalty Card related rest services go here
	
	//API to update shop loyalty card
	@RequestMapping(value = "/consumer/lcard", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyCard> lcardPUT(@RequestBody ShopLoyaltyCard shopLoyaltyCard, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	
	//API to update shop loyalty card stage
	@RequestMapping(value = "/consumer/lcard/stage", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyCardStage> lcardStagePUT(@RequestBody ShopLoyaltyCardStage shopLoyaltyCardStage, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /consumer/lcard/stage api");
		HttpHeaders returnHeader = new HttpHeaders();
		
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != shopLoyaltyCardStage){
				//user = userModel.getUser();
				shopLoyaltyCardStage = partnerService.updateUserShopLoyaltyCardStage(shopLoyaltyCardStage);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return CheckInModel:" + shopLoyaltyCardStage);
		return new ResponseEntity<ShopLoyaltyCardStage>(shopLoyaltyCardStage, returnHeader, HttpStatus.OK);
	}
	
	//Shop Loyalty Program related rest services go here

	//API to update shop loyalty program
	@RequestMapping(value = "/consumer/lprogram", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyProgram> lprogramPUT(@RequestBody ShopLoyaltyProgram shopLoyaltyProgram, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	
	//API to update shop loyalty program stage
	@RequestMapping(value = "/consumer/lprogram/stage", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<ShopLoyaltyProgramStage> lprogramStagePOST(@RequestBody ShopLoyaltyProgramStage shopLoyaltyProgramStage, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	
  	//Offer related services go here
  	
  	//API to redeem an offer
  	@RequestMapping(value = "/consumer/offer/redeem", method = RequestMethod.POST, headers="Accept=application/json")
  	public ResponseEntity<Cart> offerRedeemPOST(@RequestBody Offer offer, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		return null;
  	}

	//Order and Cart related rest services go here
	
	//API to create User Cart
	@RequestMapping(value = "/consumer/cart", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<Cart> cartPOST(@RequestBody Cart cart, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	
	//API to update User Cart
	@RequestMapping(value = "/consumer/cart", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<Cart> cartPUT(@RequestBody Cart cart, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	
	//API to create User Order
	@RequestMapping(value = "/consumer/order", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<Order> orderPOST(@RequestBody Cart cart, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /consumer/order api");
		HttpHeaders returnHeader = new HttpHeaders();
		
		Order order = new Order();
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != cart){
				//user = userModel.getUser();
				order = partnerService.createOrder(cart);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return order :" + order);
		return new ResponseEntity<Order>(order, returnHeader, HttpStatus.OK);
	}
	
	//API to update User Order
	@RequestMapping(value = "/consumer/order", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<Order> orderPUT(@RequestBody Cart cart, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		return null;
	}
	

}
