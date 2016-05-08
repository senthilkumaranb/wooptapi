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
import com.woopt.api.dao.CartDAO;
import com.woopt.api.dao.CartItemDAO;
import com.woopt.api.dao.ConsumerDAO;
import com.woopt.api.dao.OfferDAO;
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
import com.woopt.api.entity.ConsumerEntity;
import com.woopt.api.entity.OfferEntity;
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
import com.woopt.api.model.Offer;
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
    OrderDAO orderDAO;
    
    @Autowired
    CartDAO cartDAO;
    
    @Autowired
    CartItemDAO cartItemDAO;
	
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
			
			LOGGER.info("!!!!!!! calling Shop Details !!!!!!!!" + c);
			consumerView.setShop(this.getShopbyShopId(shopId));
			
			LOGGER.info("!!!!!!! calling ShopInfo !!!!!!!!");
			consumerView.setShopInfo(this.getUserShopInfo(shopId));
			
			LOGGER.info("!!!!!!! calling User Shop Loyalty Card !!!!!!!!");
			consumerView.setShopLoyaltyCard(this.getUserShopLoyaltyCard(consumerId));
			
			LOGGER.info("!!!!!!! calling User Shop Loyalty Program !!!!!!!!");
			consumerView.setShopLoyaltyProgram(this.getUserShopLoyaltyProgram(consumerId));
			
			LOGGER.info("!!!!!!! calling Shop Offer !!!!!!!!");
			//offers are not based on consumer ID
			consumerView.setOffers(this.getUserShopOffers(userId, shopId));
			
			LOGGER.info("!!!!!!! calling Shop Order !!!!!!!!");
			//consumerView.setOrder(this.getUserShopOrder(consumerId));
			
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
	
	public ShopLoyaltyCard getUserShopLoyaltyCard(int consumerId){
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
					shopLoyaltyCardStage.setShopLoyaltyCardStageNo(ucard.getUserToShopLoyaltyCardStageId());
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
			return null;
		}
	}
	
	public ShopLoyaltyProgram getUserShopLoyaltyProgram(int consumerId){
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
			return shopLoyaltyProgram;
		}
		else {
			return null;
		}
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
	
	
	public Cart createCart(int consumerId){
		
		Cart cart = new Cart();
		CartEntity cartEntity = new CartEntity();
		
		cartEntity.setConsumerId(consumerId);
		
		cartEntity = cartDAO.save(cartEntity);
		
		Gson gson = new Gson();
		String jsonCartEntity = gson.toJson(cartEntity, CartEntity.class);
		cart = gson.fromJson(jsonCartEntity, Cart.class);
		
		return cart;
	}
	
	public Cart addCartItem(Cart cart, CartItem cartItem){
		
		CartItemEntity cartItemEntity = new CartItemEntity();
		
		cartItemEntity.setCardId(cart.getCardId());
		cartItemEntity.setOfferUserPublishId(cartItem.getOffer().getOfferUserPublish().get(0).getOfferUserPublishId());
		Integer cartItemStatus=1;
		cartItemEntity.setCartItemStatus(cartItemStatus);
		
		cartItemEntity = cartItemDAO.save(cartItemEntity);
		
		Gson gson = new Gson();
		String jsonCartItemEntity = gson.toJson(cartItemEntity, CartEntity.class);
		cartItem = gson.fromJson(jsonCartItemEntity, CartItem.class);
		
		List<CartItem> cartItems = new ArrayList<CartItem>();
		cartItems = cart.getCartItems();
		cartItems.add(cartItem);
		
		cart.setCartItems(cartItems);
		
		return cart;
	
	}
	
	public Cart removeCartItem(Cart cart, CartItem cartItem){
		CartItemEntity cartItemEntity = new CartItemEntity();
		
		cartItemEntity.setCardId(cart.getCardId());
		cartItemEntity.setOfferUserPublishId(cartItem.getOffer().getOfferUserPublish().get(0).getOfferUserPublishId());
		Integer cartItemStatus=0;
		cartItemEntity.setCartItemStatus(cartItemStatus);
		
		cartItemEntity = cartItemDAO.save(cartItemEntity);
		
		Gson gson = new Gson();
		String jsonCartItemEntity = gson.toJson(cartItemEntity, CartEntity.class);
		cartItem = gson.fromJson(jsonCartItemEntity, CartItem.class);
		
		List<CartItem> cartItems = new ArrayList<CartItem>();
		cartItems = cart.getCartItems();
		cartItems.add(cartItem);
		
		cart.setCartItems(cartItems);
		
		return cart;
	}
	
	public Cart cancelCart(int cartId){
		return null;
	}
	
	public Cart getCartbyConsumerId(int consumerId){
		Cart cart = new Cart();
		CartEntity cartEntity = new CartEntity();
		
		cartEntity = cartDAO.getActiveCartbyConsumerId(consumerId);
		
		Gson gson = new Gson();
		String jsonCartEntity = gson.toJson(cartEntity, CartEntity.class);
		cart = gson.fromJson(jsonCartEntity, Cart.class);
		
		//update cart model with cart items
		cart.setCartItems(this.getCartItems(cart.getCardId()));
		
		return cart;
	}
	
	public Cart getCartbyCartId(int cartId){
		Cart cart = new Cart();
		CartEntity cartEntity = new CartEntity();
		
		cartEntity = cartDAO.findById(cartId);
		
		Gson gson = new Gson();
		String jsonCartEntity = gson.toJson(cartEntity, CartEntity.class);
		cart = gson.fromJson(jsonCartEntity, Cart.class);
		
		//Update cart model with cart items
		cart.setCartItems(this.getCartItems(cart.getCardId()));
		
		return cart;
	}
	
	public List<CartItem> getCartItems(int cartId){
		
		List<CartItem> cartItems = new ArrayList<CartItem>();
		
		List<CartItemEntity> cartItemEntities = new ArrayList<CartItemEntity>();
		cartItemEntities = cartItemDAO.getbyCartId(cartId);
		
		Gson gson = new Gson();
		String jsonCartItemEntity = gson.toJson(cartItemEntities, new TypeToken<List<CartItemEntity>>() {}.getType());
		cartItems = gson.fromJson(jsonCartItemEntity, new TypeToken<List<CartItem>>() {}.getType());
		
		return cartItems;
	}
	
	public Order createOrder(int shopId,int userId, Cart cart){
		Order order = new Order();
		OrderEntity orderEntity = new OrderEntity();

		orderEntity.setShopId(shopId);
		orderEntity.setUserId(userId);
		orderEntity.setCartId(cart.getCardId());
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
