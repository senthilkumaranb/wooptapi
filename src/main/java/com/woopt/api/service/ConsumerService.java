package com.woopt.api.service;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.woopt.api.common.WooptCode;
import com.woopt.api.dao.CartDAO;
import com.woopt.api.dao.CartItemDAO;
import com.woopt.api.dao.ConsumerCheckInDAO;
import com.woopt.api.dao.ConsumerDAO;
import com.woopt.api.dao.OfferDAO;
import com.woopt.api.dao.OfferUserPublishDAO;
import com.woopt.api.dao.OrderDAO;
import com.woopt.api.dao.ShopDAO;
import com.woopt.api.dao.ShopInfoDAO;
import com.woopt.api.dao.ShopLoyaltyProgramStageDAO;
import com.woopt.api.dao.UserToShopLoyaltyCardDAO;
import com.woopt.api.dao.UserToShopLoyaltyCardStageDAO;
import com.woopt.api.dao.UserToShopLoyaltyProgramDAO;
import com.woopt.api.dao.UserToShopLoyaltyProgramStageDAO;
import com.woopt.api.entity.CartEntity;
import com.woopt.api.entity.CartItemEntity;
import com.woopt.api.entity.ConsumerCheckInEntity;
import com.woopt.api.entity.ConsumerEntity;
import com.woopt.api.entity.OfferEntity;
import com.woopt.api.entity.OfferUserPublishEntity;
import com.woopt.api.entity.OrderEntity;
import com.woopt.api.entity.ShopEntity;
import com.woopt.api.entity.ShopInfoEntity;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;
import com.woopt.api.entity.ShopLoyaltyProgramEntity;
import com.woopt.api.entity.ShopLoyaltyProgramStageEntity;
import com.woopt.api.entity.UserToShopLoyaltyCardEntity;
import com.woopt.api.entity.UserToShopLoyaltyCardStageEntity;
import com.woopt.api.entity.UserToShopLoyaltyProgramEntity;
import com.woopt.api.entity.UserToShopLoyaltyProgramStageEntity;
import com.woopt.api.model.Cart;
import com.woopt.api.model.CartItem;
import com.woopt.api.model.Chat;
import com.woopt.api.model.Consumer;
import com.woopt.api.model.ConsumerCheckIn;
import com.woopt.api.model.Offer;
import com.woopt.api.model.OfferUserPublish;
import com.woopt.api.model.Order;
import com.woopt.api.model.Shop;
import com.woopt.api.model.ShopBranch;
import com.woopt.api.model.ShopInfo;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyCardStage;
import com.woopt.api.model.ShopLoyaltyProgram;
import com.woopt.api.model.ShopLoyaltyProgramStage;
import com.woopt.api.model.ShopModel;
import com.woopt.api.model.UserModel;
import com.woopt.api.model.ConsumerViewModel;


/**
 * Service Implementation for ConsumerController
 * calls DAO
 * @author Senthil
 *
 */
@Service
public class ConsumerService {
	
	private static final Logger LOGGER = Logger.getLogger(ConsumerService.class.getName());
	
	@Autowired
	private ShopService shopService;
    
    @Autowired
    ConsumerDAO consumerDAO;
    
    @Autowired
    ShopDAO shopDAO;
    
    @Autowired
    ShopInfoDAO shopInfoDAO;
    
    @Autowired
    UserToShopLoyaltyCardDAO userToShopLoyaltyCardDAO;
    
    @Autowired
    UserToShopLoyaltyCardStageDAO userToShopLoyaltyCardStageDAO;
    
    @Autowired
    UserToShopLoyaltyProgramDAO userToShopLoyaltyProgramDAO;
    
    @Autowired
    UserToShopLoyaltyProgramStageDAO userToShopLoyaltyProgramStageDAO;
    
    @Autowired
    OfferDAO offerDAO;
    
    @Autowired
    ShopLoyaltyProgramStageDAO shopLoyaltyProgramStageDAO;
    
    @Autowired
    ConsumerCheckInDAO consumerCheckInDAO;
    
    @Autowired
    OfferUserPublishDAO offerUserPublishDAO;
    
    @Autowired
    OrderDAO orderDAO;
    
    @Autowired
    CartDAO cartDAO;
    
    @Autowired
    CartItemDAO cartItemDAO;
    
    //USER FAVOURITE SHOP RELATED FUNCTIONS GO HERE
	
    //function to get user favourite shops by userId
	public List<ConsumerViewModel> getMyFavShops(int userId){
		
		List<ConsumerViewModel> consumerViewModel = new ArrayList<ConsumerViewModel>();
		
		//get all the fav shops of this user
		List<Shop> favShops = new ArrayList<Shop>();
		List<Consumer> consumers = new ArrayList<Consumer>();
		
		consumers = this.getConsumerByUser(userId);
		
		for (Consumer c: consumers){
			int consumerId = c.getConsumerId();
			int shopId = c.getShopId();
			ConsumerViewModel consumerView = new ConsumerViewModel();
			
			consumerView.setConsumer(c);
			
			LOGGER.info("!!!!!!! calling Shop Details !!!!!!!!" + c);
			consumerView.setShop(this.getShopbyShopId(shopId));
			
			LOGGER.info("!!!!!!! calling ShopInfo !!!!!!!!");
			consumerView.setShopInfo(this.getUserShopInfo(shopId));
			
			LOGGER.info("!!!!!!! calling User Shop Loyalty Card !!!!!!!!");
			consumerView.setShopLoyaltyCard(this.getUserShopLoyaltyCard(consumerId,shopId));
			
			LOGGER.info("!!!!!!! calling User Shop Loyalty Program !!!!!!!!");
			consumerView.setShopLoyaltyProgram(this.getUserShopLoyaltyProgram(consumerId,shopId));
			
			LOGGER.info("!!!!!!! calling Shop Offer !!!!!!!!");
			//offers are not based on consumer ID
			consumerView.setOffers(this.getUserShopOffers(userId, shopId));
			
			LOGGER.info("!!!!!!! calling Shop Order !!!!!!!!");
			//consumerView.setOrder(this.getUserShopOrder(consumerId));
			
			consumerView.setConsumerCheckIn(this.getUserCheckIn(consumerId));
			
			consumerViewModel.add(consumerView);
			
			consumerView=null;
		}
		
		return consumerViewModel;
	}
	
	//function to get the fav shop list from consumer table
	public List<Consumer> getConsumerByUser(int userId){
		
		List<Consumer> consumers = new ArrayList<Consumer>();
		List<ConsumerEntity> consumerEntities = new ArrayList<ConsumerEntity>();
	
		consumerEntities = consumerDAO.getFavShops(userId);

		//Convert from Consumer Entity to Consumer DTO
		Gson gson = new Gson();
		String jsonConsumers = gson.toJson(consumerEntities, new TypeToken<List<ConsumerEntity>>() {}.getType());
		consumers = gson.fromJson(jsonConsumers, new TypeToken<List<Consumer>>() {}.getType());
		
		return consumers;
		
	}
	
	public Shop getShopbyShopId(int shopId){
		LOGGER.info("Inside getShopInfo function...");
		Shop shop = new Shop();
		ShopEntity shopEntity = new ShopEntity();
		
		shopEntity = shopDAO.getShopbyShopId(shopId);

		Gson gson = new Gson();
		String jsonShops = gson.toJson(shopEntity, ShopEntity.class);
		shop = gson.fromJson(jsonShops, Shop.class);
		return shop;
	}
	
	public ShopInfo getUserShopInfo(int shopId){
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
	
	public ShopLoyaltyCard getUserShopLoyaltyCard(int consumerId, int shopId){
		LOGGER.info("Inside getUserShopLoyaltyCard function...");
		ShopLoyaltyCard shopLoyaltyCard = new ShopLoyaltyCard();
		UserToShopLoyaltyCardEntity userShopLoyaltyCardEntity = new UserToShopLoyaltyCardEntity();
		userShopLoyaltyCardEntity = userToShopLoyaltyCardDAO.getbyConsumerId(consumerId);
		
		if (userShopLoyaltyCardEntity!=null){
			//Gson gson = new Gson();
			//String jsonUserShopCardEntity = gson.toJson(userShopLoyaltyCardEntity, UserToShopLoyaltyCardEntity.class);
			//shopLoyaltyCard = gson.fromJson(jsonUserShopCardEntity, ShopLoyaltyCard.class);
			shopLoyaltyCard.setShopLoyaltyCardId(userShopLoyaltyCardEntity.getUserToShopLoyaltyCardId());
			shopLoyaltyCard.setShopLoyaltyCardName(userShopLoyaltyCardEntity.getShopLoyaltyCardName());
			
			
			List<UserToShopLoyaltyCardStageEntity> userShopLoyaltyCardStageEntities = new ArrayList<UserToShopLoyaltyCardStageEntity>();
			userShopLoyaltyCardStageEntities = userToShopLoyaltyCardStageDAO.getbyCardId(userShopLoyaltyCardEntity.getShopLoyaltyCardId());
			
			if(userShopLoyaltyCardStageEntities.size()!=0){
				List<ShopLoyaltyCardStage> userShopLoyaltyCardStages = new ArrayList<ShopLoyaltyCardStage>();
				//String jsonUserShopCardStageEntity = gson.toJson(userShopLoyaltyCardStageEntities, new TypeToken<List<UserToShopLoyaltyProgramStageEntity>>() {}.getType());
				//userShopLoyaltyCardStages = gson.fromJson(jsonUserShopCardStageEntity, new TypeToken<List<ShopLoyaltyCardStage>>() {}.getType());
				
				for (UserToShopLoyaltyCardStageEntity ucard: userShopLoyaltyCardStageEntities){
					ShopLoyaltyCardStage shopLoyaltyCardStage = new ShopLoyaltyCardStage();
					shopLoyaltyCardStage.setShopLoyaltyCardStageId(ucard.getUserToShopLoyaltyCardStageId());
					shopLoyaltyCardStage.setShopLoyaltyCardStageNo(ucard.getShopLoyaltyCardStageId());
					shopLoyaltyCardStage.setShopLoyaltyCardStageIsRedeemable(ucard.getShopLoyaltyCardStageIsRedeemable());
					shopLoyaltyCardStage.setShopLoyaltyCardStageReward(ucard.getShopLoyaltyCardStageReward());
					shopLoyaltyCardStage.setShopLoyaltyCardStageRewardPhoto(ucard.getShopLoyaltyCardStageRewardPhoto());
					shopLoyaltyCardStage.setShopLoyaltyCardStageStatus(ucard.getUserToShopLoyaltyCardStageStatus());
					userShopLoyaltyCardStages.add(shopLoyaltyCardStage);
					shopLoyaltyCardStage = null;
				}
				
				shopLoyaltyCard.setShopLoyaltyCardStage(userShopLoyaltyCardStages);
			}
			return shopLoyaltyCard;
		}
		else {
			shopLoyaltyCard = shopService.getShopLoyaltyCard(shopId);
			return null;
		}
	}
	
	public ShopLoyaltyProgram getUserShopLoyaltyProgram(int consumerId,int shopId){
		LOGGER.info("Inside getUserShopLoyaltyProgram function...");
		ShopLoyaltyProgram shopLoyaltyProgram = new ShopLoyaltyProgram();
		UserToShopLoyaltyProgramEntity userShopLoyaltyProgramEntity = new UserToShopLoyaltyProgramEntity();
		userShopLoyaltyProgramEntity = userToShopLoyaltyProgramDAO.getbyConsumerId(consumerId);
		
		if (userShopLoyaltyProgramEntity!=null){
			shopLoyaltyProgram.setShopLoyaltyProgramId(userShopLoyaltyProgramEntity.getUserToShopLoyaltyProgramId());
			shopLoyaltyProgram.setShopLoyaltyProgramName(userShopLoyaltyProgramEntity.getShopLoyaltyProgramName());
			
			List<UserToShopLoyaltyProgramStageEntity> userShopLoyaltyProgramStageEntities = new ArrayList<UserToShopLoyaltyProgramStageEntity>();
			userShopLoyaltyProgramStageEntities = userToShopLoyaltyProgramStageDAO.getbyCardId(userShopLoyaltyProgramEntity.getShopLoyaltyProgramId());
			
			if(userShopLoyaltyProgramStageEntities.size()!=0){
				List<ShopLoyaltyProgramStage> shopLoyaltyProgramStages = new ArrayList<ShopLoyaltyProgramStage>();
				
				for (UserToShopLoyaltyProgramStageEntity upg: userShopLoyaltyProgramStageEntities) {
					ShopLoyaltyProgramStage shopLoyaltyProgramStage = new ShopLoyaltyProgramStage();
					shopLoyaltyProgramStage.setShopLoyaltyProgramStageNo(upg.getUserToShopLoyaltyProgramStageId());
					
					ShopLoyaltyProgramStage slpg = new ShopLoyaltyProgramStage();
					slpg = shopService.getShopLoyaltyProgramStage(upg.getShopLoyaltyProgramStageId());
					
					shopLoyaltyProgramStage.setShopLoyaltyProgramStageName(slpg.getShopLoyaltyProgramStageName());
					shopLoyaltyProgramStage.setShopLoyaltyProgramStagePromotionEligibility(slpg.getShopLoyaltyProgramStagePromotionEligibility());
					
					shopLoyaltyProgramStages.add(shopLoyaltyProgramStage);
					shopLoyaltyProgramStage=null;
				}
				
				shopLoyaltyProgram.setShopLoyaltyProgramStage(shopLoyaltyProgramStages);
			}

		}
		else {
			shopLoyaltyProgram = shopService.getShopLoyaltyProgram(shopId);

		}
		return shopLoyaltyProgram;
	}
	
/*	public ShopLoyaltyProgramStage getShopLoyaltyProgramStage(int shopLoyaltyProgramStageId){
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
	}*/
	
	public List<Offer> getUserShopOffers(int userId, int shopId){
		List<Offer> shopOffers = new ArrayList<Offer>();
		List<OfferEntity> shopOfferEntities = new ArrayList<OfferEntity>();
		shopOfferEntities = offerDAO.getbyShopId(shopId);
		
		Gson gson = new Gson();
		String jsonOfferEntities = gson.toJson(shopOfferEntities, new TypeToken<List<OfferEntity>>() {}.getType());
		shopOffers = gson.fromJson(jsonOfferEntities, new TypeToken<List<Offer>>() {}.getType());
		
		return shopOffers;
	}
	
	public List<Offer> getUserOffers(int userId){
		
		List<Offer> userOffers = new ArrayList<Offer>();

		OfferEntity offerEntity = new OfferEntity();
		
		List<OfferUserPublish> offerUserPublishList = new ArrayList<OfferUserPublish>();
		offerUserPublishList = this.getPublishedOffersbyUser(userId);
		
		for (OfferUserPublish op: offerUserPublishList) {
			Offer offer = new Offer();
			offerEntity = offerDAO.findById(op.getOfferId());
			
			Gson gson = new Gson();
			String jsonOffer = gson.toJson(offerEntity, OfferEntity.class);
			offer = gson.fromJson(jsonOffer, Offer.class);
			offer.setOfferUserPublish(offerUserPublishList);
			userOffers.add(offer);
			offer=null;
		}
		
		return userOffers;
	}
	
	//function to get users published offer list
	public List<OfferUserPublish> getPublishedOffersbyUser(int userId){
		LOGGER.info("----- inside getPublishedShopOffersbyUser -----");
		List<OfferUserPublish> offerUserPublishList = new ArrayList<OfferUserPublish>();
		List<OfferUserPublishEntity> offerUserPublishEntities = new ArrayList<OfferUserPublishEntity>();
		
		try{
			offerUserPublishEntities = offerUserPublishDAO.getbyUserId(userId);
		
			Gson gson = new Gson();
			String jsonOfferPublish = gson.toJson(offerUserPublishEntities, new TypeToken<List<OfferUserPublishEntity>>() {}.getType());
			offerUserPublishList = gson.fromJson(jsonOfferPublish, new TypeToken<List<OfferUserPublish>>() {}.getType());
			LOGGER.info("----- offerUserPublishList -----" + offerUserPublishList);
			return offerUserPublishList;
		}
		catch (Exception e){
			LOGGER.info("----- Exception -----" + e.getMessage());
			return null;
		}
		
	}
	
	//Check In related functions go here
	public ConsumerCheckIn userCheckIn(int consumerId){
		ConsumerCheckIn consumerCheckIn = new ConsumerCheckIn();
		ConsumerCheckInEntity consumerCheckInEntity = new ConsumerCheckInEntity();
		
		consumerCheckInEntity.setConsumerCheckInId(null);
		consumerCheckInEntity.setConsumerId(consumerId);
		consumerCheckInEntity.setConsumerCheckInStatus(WooptCode.USER_CHECKIN_STATUS_ACTIVE);
		
		consumerCheckInEntity = consumerCheckInDAO.save(consumerCheckInEntity);
		
		Gson gson = new Gson();
		String jsonConsumerCheckIn = gson.toJson(consumerCheckInEntity, ConsumerCheckInEntity.class);
		consumerCheckIn = gson.fromJson(jsonConsumerCheckIn, ConsumerCheckIn.class);
		
		return consumerCheckIn;
	}
	
	public ConsumerCheckIn getUserCheckIn(int consumerId){
		ConsumerCheckIn consumerCheckIn = new ConsumerCheckIn();
		ConsumerCheckInEntity consumerCheckInEntity = new ConsumerCheckInEntity();
		
		consumerCheckInEntity = consumerCheckInDAO.getConsumerCheckInbyUser(consumerId);
		
		Gson gson = new Gson();
		String jsonConsumerCheckIn = gson.toJson(consumerCheckInEntity, ConsumerCheckInEntity.class);
		consumerCheckIn = gson.fromJson(jsonConsumerCheckIn, ConsumerCheckIn.class);
		
		return consumerCheckIn;
	}
	
	//Redeem offer and cart related functions go here
	
	public Cart redeemOffer(Offer offer, int consumerId){
		
		LOGGER.info(" ---Inside redeemOffer ----");
		
		Cart cart = new Cart();
		CartItem cartItem = new CartItem();
		
		LOGGER.info("consumerId----" + consumerId);
		
		ConsumerEntity consumerEntity = new ConsumerEntity();
		consumerEntity = consumerDAO.findById(consumerId);
		LOGGER.info("consumerEntity----" + consumerEntity);
		
		Integer userId=consumerEntity.getUserId();
		
		cartItem = this.createCartItem(offer,userId);
		LOGGER.info("createCartItem----" + cartItem);
		
		//Check any existing cart present for the given shop
		cart = this.getCartbyConsumerId(consumerId);
		
		//Create Cart if cart not present
		if(cart==null) {
			LOGGER.info("cart not present, hence creating");
			cart=this.createCart(consumerId);
		}
		LOGGER.info("cart----"+cart);
		
		//Add Offer to the cart
		cart = this.addCartItem(cart, cartItem);

		return cart;
	}
	
	public CartItem createCartItem(Offer offer, int userId){
		
		CartItem cartItem = new CartItem();
		CartItemEntity cartItemEntity = new CartItemEntity();
		OfferUserPublish offerUserPublish = new OfferUserPublish();
		
		LOGGER.info("offer.getOfferMethod() ----" + offer.getOfferMethod());
		
		//creating user specific instance in user publish table to track generic redeem
		//If it is not generic, there should already be user specific instance created
		if(offer.getOfferUserPublish().size()==0){
			if((offer.getOfferMethod().equals(WooptCode.OFFER_METHOD_GENERIC))){
				LOGGER.info("Offer User Publish is null, creating an instance of generic offer for user----");
				List<OfferUserPublish> offerUserPublishList = new ArrayList<OfferUserPublish>();
				offerUserPublish = shopService.publishShopOfferbyUser(offer, userId);
				offerUserPublishList.add(offerUserPublish);
				offer.setOfferUserPublish(offerUserPublishList);
			} 
		}
		
		offerUserPublish = offer.getOfferUserPublish().get(0);
		LOGGER.info("offerUserPublish----" + offerUserPublish);
		
		//int offerId = offer.getOfferId();
		int offerUserPublishId;
		
		offerUserPublishId = offerUserPublish.getOfferUserPublishId();
		
		/*try {
			offerUserPublishId = offer.getOfferUserPublish().get(0).getOfferUserPublishId();
		}
		catch (Exception e){
			offerUserPublishId = offerId;
		}*/

		cartItemEntity.setOfferUserPublishId(offerUserPublishId);
		cartItemEntity.setCartItemStatus(WooptCode.CARTITEM_STATUS_ACTIVE);
		
		//cartItemEntity = cartItemDAO.save(cartItemEntity);
		
		Gson gson = new Gson();
		String jsonCartItemEntity = gson.toJson(cartItemEntity, CartItemEntity.class);
		cartItem = gson.fromJson(jsonCartItemEntity, CartItem.class);
		
		cartItem.setOffer(offer);
		
		return cartItem;
		
	}
	
	
	public Cart createCart(int consumerId){
		
		Cart cart = new Cart();
		CartEntity cartEntity = new CartEntity();
		
		cartEntity.setConsumerId(consumerId);
		cartEntity.setCartStatus(WooptCode.CART_STATUS_ACTIVE);
		
		cartEntity = cartDAO.save(cartEntity);
		
		Gson gson = new Gson();
		String jsonCartEntity = gson.toJson(cartEntity, CartEntity.class);
		cart = gson.fromJson(jsonCartEntity, Cart.class);
		
		return cart;
	}
	
	//Create CartItem entity and add cartItems
	public Cart addCartItem(Cart cart, CartItem cartItem){
		
		CartItemEntity cartItemEntity = new CartItemEntity();
		
		try {
			cartItemEntity.setCartId(cart.getCartId());
			cartItemEntity.setCartItemStatus(cartItem.getCartItemStatus());
			
			int offerId = cartItem.getOffer().getOfferId();
			int offerUserPublishId;
			try {
				offerUserPublishId = cartItem.getOffer().getOfferUserPublish().get(0).getOfferUserPublishId();
			}
			catch (Exception e){
				offerUserPublishId = offerId;
			}
			cartItemEntity.setOfferUserPublishId(offerUserPublishId);
			
			cartItemEntity = cartItemDAO.save(cartItemEntity);
			
			cartItem.setCartItemId(cartItemEntity.getCartItemId());
			cartItem.setCartId(cart.getCartId());
			
			LOGGER.info("cartItemEntity----"+cartItemEntity);		
			LOGGER.info("cartItem----"+cartItem);
	
			List<CartItem> cartItems = new ArrayList<CartItem>();
			List<CartItem> cartNewItems = new ArrayList<CartItem>();
			
			cartItems = cart.getCartItems();
			LOGGER.info("cartItems----"+cartItems);
			
			if(cartItems.size()!=0) {
				LOGGER.info("before assignment ----");
				cartNewItems = cartItems;
				LOGGER.info("cartNewItems----"+cartNewItems);
			}

			LOGGER.info("before new sssignment ----");
			cartNewItems.add(cartItem);
			LOGGER.info("cartNewItems----"+cartNewItems);
			
			cart.setCartItems(cartNewItems);
			
			LOGGER.info("cart:----"+cart);
			
			return cart;
		}
		catch (Exception e){
			LOGGER.info("addCartItem Exception ----"+e.getMessage());
		}
		return null;
	
	}
	
	public int removeCartItem(CartItem cartItem){
		
		CartItemEntity cartItemEntity = new CartItemEntity();
		
		Gson gson = new Gson();
		String jsonCartItemEntity = gson.toJson(cartItem, CartItem.class);
		cartItemEntity = gson.fromJson(jsonCartItemEntity, CartItemEntity.class);
		
		Integer cartItemStatus=0;
		cartItemEntity.setCartItemStatus(cartItemStatus);
		
		try {
			cartItemEntity = cartItemDAO.update(cartItemEntity);
			return WooptCode.SUCCESS;
		}
		catch (Exception e){
			return WooptCode.FAIL;
		}		

	}
	
	public Cart cancelCart(int cartId){
		return null;
	}
	
	public Cart getCartbyConsumerId(int consumerId){
		Cart cart = new Cart();
		CartEntity cartEntity = new CartEntity();
		
		try{
			cartEntity = cartDAO.getActiveCartbyConsumerId(consumerId);
			
			if(cartEntity!=null){
				Gson gson = new Gson();
				String jsonCartEntity = gson.toJson(cartEntity, CartEntity.class);
				cart = gson.fromJson(jsonCartEntity, Cart.class);
				
				//update cart model with cart items
				List<CartItem> cartItems = new ArrayList<CartItem>();
				cartItems = this.getCartItemsbyCart(cart.getCartId());
				
				if (cartItems.size()!=0)
						cart.setCartItems(cartItems);
				
				LOGGER.info("getCart ----" + cart);
				return cart;
			}
		}
		catch (Exception e){
			LOGGER.info("getCartbyConsumerId Exception ----" + e.getMessage());
		}

		return null;

	}
	
	public Cart getCartbyCartId(int cartId){
		Cart cart = new Cart();
		CartEntity cartEntity = new CartEntity();
		
		cartEntity = cartDAO.findById(cartId);
		
		Gson gson = new Gson();
		String jsonCartEntity = gson.toJson(cartEntity, CartEntity.class);
		cart = gson.fromJson(jsonCartEntity, Cart.class);
		
		//Update cart model with cart items
		cart.setCartItems(this.getCartItemsbyCart(cart.getCartId()));
		
		return cart;
	}
	
	public List<CartItem> getCartItemsbyCart(int cartId){
		
		List<CartItem> cartItems = new ArrayList<CartItem>();
		
		List<CartItemEntity> cartItemEntities = new ArrayList<CartItemEntity>();
		cartItemEntities = cartItemDAO.getbyCartId(cartId);
		
		for (CartItemEntity ce: cartItemEntities) {
			CartItem cartItem = new CartItem();
			cartItem.setCartItemId(ce.getCartItemId());
			cartItem.setCartId(ce.getCartId());
			cartItem.setCartItemStatus(ce.getCartItemStatus());
			cartItem.setOffer(this.getPublishedOffer(ce.getOfferUserPublishId()));
			cartItems.add(cartItem);
			cartItem=null;
		}
		
		return cartItems;
	}
	
	//function to get shop offer list
	public Offer getPublishedOffer(int offerUserPublishId){
		Offer offer = new Offer();
		OfferEntity offerEntity = new OfferEntity();
		
		OfferUserPublish offerUserPublish = new OfferUserPublish();
		List<OfferUserPublish> offerUserPublishList = new ArrayList<OfferUserPublish>();
		
		offerUserPublish = this.getOfferUserPublishbyId(offerUserPublishId);
		
		offerEntity = offerDAO.findById(offerUserPublish.getOfferId());
		
		Gson gson = new Gson();
		String jsonOfferEntities = gson.toJson(offerEntity, OfferEntity.class);
		offer = gson.fromJson(jsonOfferEntities, Offer.class);
		
		offerUserPublishList.add(offerUserPublish);
		offer.setOfferUserPublish(offerUserPublishList);
		
		return offer;
	}
	
	//function to get shop offer list
	public OfferUserPublish getOfferUserPublishbyId(int offerUserPublishId){
		LOGGER.info("----- inside getPublishedShopOffersbyUser -----");
		OfferUserPublish offerUserPublish = new OfferUserPublish();
		OfferUserPublishEntity offerUserPublishEntity = new OfferUserPublishEntity();
		
		try{
			offerUserPublishEntity = offerUserPublishDAO.findById(offerUserPublishId);
		
			Gson gson = new Gson();
			String jsonOfferPublish = gson.toJson(offerUserPublishEntity, OfferUserPublishEntity.class);
			offerUserPublish = gson.fromJson(jsonOfferPublish, OfferUserPublish.class);
			
			LOGGER.info("----- offerUserPublishList -----" + offerUserPublish);
			return offerUserPublish;
		}
		catch (Exception e){
			LOGGER.info("----- Exception -----" + e.getMessage());
			return null;
		}
	}
	
	public Order createOrder(int shopId,int userId, Cart cart){
		Order order = new Order();
		OrderEntity orderEntity = new OrderEntity();

		orderEntity.setShopId(shopId);
		orderEntity.setUserId(userId);
		orderEntity.setCartId(cart.getCartId());
		int orderStatus=1;
		orderEntity.setOrderStatus(orderStatus);
		
		Timestamp currentTimestamp = new Timestamp(new java.util.Date().getTime());
		orderEntity.setCreatedDatetime(currentTimestamp);

		orderEntity = orderDAO.save(orderEntity);
		
		Gson gson = new Gson();
		String jsonOrderEntity = gson.toJson(orderEntity, OrderEntity.class);
		order = gson.fromJson(jsonOrderEntity, Order.class);
		
		order.setCart(cart);
		
		return order;
	}
	
	public Order updateOrder(int orderId){
		return null;
	}
	
	public Order cancelOrder(int orderId){
		return null;
	}
	
	
	public Order getOrder(int consumerId){
		
		Order shopOrder = new Order();
		OrderEntity orderEntity = new OrderEntity();
		
		orderEntity = orderDAO.getActiveOrder(consumerId);
		
		int cartId = orderEntity.getCartId();
		
		Gson gson = new Gson();
		String jsonOrderEntity= gson.toJson(orderEntity, OrderEntity.class);
		shopOrder = gson.fromJson(jsonOrderEntity, Order.class);

		//GetCart and initialize here
		shopOrder.setCart(this.getCartbyCartId(cartId));
		
		return shopOrder;
	}
	
	public List<Order> getUserShopPastOrders(int consumerId){
		return null;
	}
	
	
	public List<Chat> getUserShopChat(int userId, int shopId){
		return null;
	}
	
	public ConsumerViewModel getUserShopCheckIn(int userId, int shopId){
		return null;
	}
	
	public ConsumerViewModel doUserShopCheckIn(int userId, int shopId){
		return null;
	}
	
	public List<Chat> createChat(int userId, int shopId){
		return null;
	}
	
	public Chat sendChatMessage(int userId, int chatId){
		return null;
	}


}
