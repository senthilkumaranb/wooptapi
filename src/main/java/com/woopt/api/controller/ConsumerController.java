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
import com.woopt.api.model.CartItem;
import com.woopt.api.model.ConsumerCheckIn;
import com.woopt.api.model.ConsumerViewModel;
import com.woopt.api.model.Offer;
import com.woopt.api.model.Order;
import com.woopt.api.model.User;
import com.woopt.api.model.UserModel;
import com.woopt.api.service.ConsumerService;

/**
 * Consumer REST Controller Implementation
 * Consumer controller provides User Shop view details
 * @author Senthil
 *
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
private static final Logger LOGGER = Logger.getLogger(ConsumerController.class.getName());
	
	private ConsumerService consumerService;
	
    @Autowired
    @Qualifier(value="consumerService")
    public void setConsumerService(ConsumerService cs){
        this.consumerService = cs;
    }
    
    @RequestMapping(value = "/favshops", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<ConsumerViewModel>> favShops(@RequestBody UserModel userModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /api/consumer/favshops api");
		LOGGER.info("Input User:" + userModel);
		HttpHeaders returnHeader = new HttpHeaders();
		User user = null;

		List<ConsumerViewModel> consumerShopModels = new ArrayList<ConsumerViewModel>();
		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != userModel){
				//user = userModel.getUser();
				consumerShopModels = consumerService.getMyFavShops(userModel.getUser().getUserId());
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return ShopModel:" + consumerShopModels);
		return new ResponseEntity<List<ConsumerViewModel>>(consumerShopModels, returnHeader, HttpStatus.OK);
	}
    
    //API to list the near by shops
    @RequestMapping(value = "/shops", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<List<ConsumerViewModel>> nearbyShops(@RequestBody UserModel userModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
    	return null;
    	
    	//to handle nearby, location and by categories
    }
    
    
    //Customer Check In related APIs go here
    
    //API to check in consumer
  	@RequestMapping(value = "/checkin/atshop", method = RequestMethod.POST, headers="Accept=application/json")
  	public ResponseEntity<ConsumerCheckIn> checkInPost(@RequestBody ConsumerCheckIn consumerCheckIn, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		
  		//Method parameter to be set 
  		//at shop
  		//qr
  		//code
  		//auto
  		LOGGER.info("calling /checkin/atshop api");
		LOGGER.info("Input User:" + consumerCheckIn);
		HttpHeaders returnHeader = new HttpHeaders();
		int consumerId = Integer.parseInt(header.get("consumerId").get(0));

		int responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != consumerCheckIn){
				//user = userModel.getUser();
				consumerCheckIn = consumerService.userCheckIn(consumerId);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return CheckInModel:" + consumerCheckIn);
		return new ResponseEntity<ConsumerCheckIn>(consumerCheckIn, returnHeader, HttpStatus.OK);
  	}

  	//Offer related services go here
  	
  	//API to get offer for the users including generic offers
  	@RequestMapping(value = "/offer", method = RequestMethod.POST, headers="Accept=application/json")
  	public ResponseEntity<List<Offer>> offerPOST(@RequestBody UserModel userModel, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		LOGGER.info("calling /api/consumer/offer api");
		LOGGER.info("Input User:" + userModel);
		HttpHeaders returnHeader = new HttpHeaders();
		
		List<Offer> userOffers = new ArrayList<Offer>();
		try{			
			if (null != userModel){
				//user = userModel.getUser();
				userOffers = consumerService.getUserOffers(userModel.getUser().getUserId());
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return ShopModel:" + userOffers);
		return new ResponseEntity<List<Offer>>(userOffers, returnHeader, HttpStatus.OK);
  	}
  	
  	//API to redeem an offer
  	@RequestMapping(value = "/offer/redeem", method = RequestMethod.POST, headers="Accept=application/json")
  	public ResponseEntity<Cart> offerRedeemPOST(@RequestBody Offer offer, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		LOGGER.info("calling /api/offer/redeem api");
		LOGGER.info("Input offer:" + offer);
		
		HttpHeaders returnHeader = new HttpHeaders();
		int consumerId = Integer.parseInt(header.get("consumerId").get(0));
		//int consumerId=1;
		
		Cart cart = new Cart();
		
		try{			
			if (null != offer){
				cart = consumerService.redeemOffer(offer, consumerId);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return cart :" + cart);
		return new ResponseEntity<Cart>(cart, returnHeader, HttpStatus.OK);
  	}
  	
  	//API to share an offer
  	@RequestMapping(value = "/offer/share", method = RequestMethod.POST, headers="Accept=application/json")
  	public ResponseEntity<Cart> offerSharePOST(@RequestBody Offer offer, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		return null;
  	}
  	
  	//Order and Cart related rest services go here
  	
  	//API to get User Cart for the shop
  	@RequestMapping(value = "/cart", method = RequestMethod.GET, headers="Accept=application/json")
  	public ResponseEntity<Cart> cartGET( 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		LOGGER.info("calling /api/consumer/cart api");
		LOGGER.info("Header-----:" + header);
		
		HttpHeaders returnHeader = new HttpHeaders();
		int consumerId = Integer.parseInt(header.get("consumerId").get(0));
		
		Cart cart = new Cart();
		
		try{			
			if (consumerId>0){
				cart = consumerService.getCartbyConsumerId(consumerId);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return cart :" + cart);
		return new ResponseEntity<Cart>(cart, returnHeader, HttpStatus.OK);
  	}
  	
  	//API to update User Cart
  	@RequestMapping(value = "/cart", method = RequestMethod.PUT, headers="Accept=application/json")
  	public ResponseEntity<Cart> cartPUT(@RequestBody Cart cart, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		return null;
  	}
  	
 	//API to update User Cart Item
  	@RequestMapping(value = "/cart/cartitem", method = RequestMethod.PUT, headers="Accept=application/json")
  	public ResponseEntity<Integer> cartItemPUT(@RequestBody CartItem cartItem, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		LOGGER.info("calling /api/consumer/cart/cartitem api");
		
		HttpHeaders returnHeader = new HttpHeaders();
		Integer rc=0;
		
		try{	
			rc = consumerService.removeCartItem(cartItem);
			//cart = consumerService.getCartbyConsumerId(consumerId);		
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return cart :" + rc);
		return new ResponseEntity<Integer>(returnHeader, HttpStatus.OK);
  	}
  	
  	//API to create User Order
  	@RequestMapping(value = "/consumer/order", method = RequestMethod.POST, headers="Accept=application/json")
  	public ResponseEntity<Order> orderPOST(@RequestBody Cart cart, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		return null;
  	}
  	
  	//API to update User Order
  	@RequestMapping(value = "/consumer/order", method = RequestMethod.PUT, headers="Accept=application/json")
  	public ResponseEntity<Order> orderPUT(@RequestBody Cart cart, 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		return null;
  	}
  	
  	//API to get User Order
  	@RequestMapping(value = "/consumer/order", method = RequestMethod.GET, headers="Accept=application/json")
  	public ResponseEntity<Order> orderGET( 
  			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
  		return null;
  	}

}
