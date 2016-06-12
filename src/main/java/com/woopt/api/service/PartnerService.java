package com.woopt.api.service;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.json.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.woopt.api.common.WooptCode;
import com.woopt.api.dao.ConsumerDAO;
import com.woopt.api.dao.OrderDAO;
import com.woopt.api.dao.UserDAO;
import com.woopt.api.dao.UserToShopLoyaltyCardStageDAO;
import com.woopt.api.entity.ConsumerCheckInEntity;
import com.woopt.api.entity.ConsumerEntity;
import com.woopt.api.entity.OrderEntity;
import com.woopt.api.entity.ShopLoyaltyCardEntity;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;
import com.woopt.api.entity.UserEntity;
import com.woopt.api.entity.UserToShopLoyaltyCardEntity;
import com.woopt.api.entity.UserToShopLoyaltyCardStageEntity;
import com.woopt.api.entity.UserToShopLoyaltyProgramEntity;
import com.woopt.api.entity.UserToShopLoyaltyProgramStageEntity;
import com.woopt.api.model.Cart;
import com.woopt.api.model.Consumer;
import com.woopt.api.model.ConsumerCheckIn;
import com.woopt.api.model.Order;
import com.woopt.api.model.PartnerViewModel;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyCardStage;
import com.woopt.api.model.ShopLoyaltyProgram;
import com.woopt.api.model.ShopLoyaltyProgramStage;

/**
 * Service Implementation for ConsumerController
 * calls DAO
 * @author Senthil
 *
 */
@Service
public class PartnerService {
	
	private static final Logger LOGGER = Logger.getLogger(PartnerViewModel.class.getName());
	
	@Autowired
	private ConsumerService consumerService;
	
	@Autowired
	private ConsumerDAO consumerDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private UserToShopLoyaltyCardStageDAO userToShopLoyaltyCardStageDAO;
	
	@Autowired
	private OrderDAO orderDAO;
	
	public List<PartnerViewModel> getConsumers(int shopId){
		
		List<PartnerViewModel> partnerViewModels = new ArrayList<PartnerViewModel>();
		
		List<Consumer> consumers = new ArrayList<Consumer>();
		
		consumers = this.getConsumersByShop(shopId);
		
		for (Consumer c: consumers){
			
			Integer consumerId = c.getConsumerId();
			Integer userId = c.getUserId();
			
			c = this.getConsumerFullDetails(c);
			
			PartnerViewModel partnerView = new PartnerViewModel();
			
			partnerView.setConsumer(c);
			
			// Populate consumer loyalty card to partner view
			ShopLoyaltyCard shopLoyaltyCard = consumerService.getUserShopLoyaltyCard(consumerId,shopId);
			partnerView.setShopLoyaltyCard(shopLoyaltyCard);
			
			// Populate consumer loyalty program to partner view
			ShopLoyaltyProgram shopLoyaltyProgram = consumerService.getUserShopLoyaltyProgram(consumerId,shopId);
			partnerView.setShopLoyaltyProgram(shopLoyaltyProgram);
			
			//partnerView.setConsumerCheckIn(consumerCheckIn);
			
			//partnerView.setUserDeals(userDeals);
			
			//partnerView.setOrder(order);
			
			//partnerView.setChats(chats);
			
			partnerViewModels.add(partnerView);
			
			partnerView = null;
			
		}
		
		return partnerViewModels;
	}
	
	//function to get the shop consumer list from consumer table
	public List<Consumer> getConsumersByShop(int shopId){
		
		List<Consumer> consumers = new ArrayList<Consumer>();
		List<ConsumerEntity> consumerEntities = new ArrayList<ConsumerEntity>();
	
		consumerEntities = consumerDAO.getShopConsumers(shopId);

		//Convert from Consumer Entity to Consumer DTO
		Gson gson = new Gson();
		String jsonConsumers = gson.toJson(consumerEntities, new TypeToken<List<ConsumerEntity>>() {}.getType());
		consumers = gson.fromJson(jsonConsumers, new TypeToken<List<Consumer>>() {}.getType());
		
		return consumers;
	}
	
	public Consumer getConsumerFullDetails(Consumer c){
		
		UserEntity userEntity = new UserEntity();
		userEntity = userDAO.findById(c.getUserId());
		
		if (userEntity!=null){
			String userFirstName = userEntity.getUserFirstName();
			String userLastname = userEntity.getUserLastName();
			String userMobile = userEntity.getUserMobile();
			String userPhone = userEntity.getUserPhone();
			String userPhoto = userEntity.getUserProfilePhoto();
			String userGender = userEntity.getUserGender();
			String userEmail = userEntity.getUserEmail();
			
			c.setUserFirstname(userFirstName);
			c.setUserLastname(userLastname);
			c.setUserMobile(userMobile);
			c.setUserPhone(userPhone);
			c.setUserPhone(userPhone);
			c.setUserGender(userGender);
			c.setUserEmail(userEmail);
			
		}

		return c;
	}
	
	//Check In related functions go here
	public ConsumerCheckIn checkInConsumer(int consumerId){
		ConsumerCheckIn consumerCheckIn = new ConsumerCheckIn();
		consumerCheckIn = consumerService.userCheckIn(consumerId);
		return consumerCheckIn;
	}
	
	//Consumer loyalty card updated related details go here
	// function to update shop loyalty card
	public ShopLoyaltyCardStage updateUserShopLoyaltyCardStage(ShopLoyaltyCardStage shopLoyaltyCardStage){
		
		LOGGER.info(" Inside updateUserShopLoyaltyCardStage");
		UserToShopLoyaltyCardStageEntity userLoyaltyCardStageEntity = new UserToShopLoyaltyCardStageEntity();
		
		try {
			userLoyaltyCardStageEntity.setUserToShopLoyaltyCardStageId(shopLoyaltyCardStage.getShopLoyaltyCardStageId());
			userLoyaltyCardStageEntity.setUserToShopLoyaltyCardStageStatus(shopLoyaltyCardStage.getShopLoyaltyCardStageStatus());
			
			//userLoyaltyCardStageEntity.setUserToShopLoyaltyCardAchievedDateTime(userToShopLoyaltyCardAchievedDateTime);
			
			userToShopLoyaltyCardStageDAO.update(userLoyaltyCardStageEntity);
			return shopLoyaltyCardStage;
		}
		catch (Exception e){
			LOGGER.info("----- Exception -----" + e.getMessage());
			return null;
		}

	}
	
	//Consumer loyalty program updated related details go here
	// function to update shop loyalty card
	public ShopLoyaltyProgram updateUserShopLoyaltyProgram(ShopLoyaltyProgram shopLoyaltyProgram, int consumerId){

		UserToShopLoyaltyProgramEntity userLoyaltyProgramEntity = new UserToShopLoyaltyProgramEntity();
		UserToShopLoyaltyProgramStageEntity userLoyaltyProgramStageEntity = new UserToShopLoyaltyProgramStageEntity();
		
		ConsumerEntity consumerEntity = consumerDAO.findById(consumerId);
		
		int shopId = consumerEntity.getShopId();
		double totalTransaction = consumerEntity.getConsumerTotalTransaction();	
		int totalVisits = consumerEntity.getConsumerTotalVisits();
		
		String programType = shopLoyaltyProgram.getShopLoyaltyProgramType();
		
		ShopLoyaltyProgramStage currentStage = shopLoyaltyProgram.getShopLoyaltyProgramCurrentStage();
		
		List<ShopLoyaltyProgramStage>  shopLoyaltyProgramStages = shopLoyaltyProgram.getShopLoyaltyProgramStage();
		boolean promote = false;
		
		if (programType==WooptCode.LOYALTY_PROGRAM_BYTRANSACTION) {
			for (ShopLoyaltyProgramStage stage: shopLoyaltyProgramStages) {
					if (promote) {
						//do the promotion here
						shopLoyaltyProgram.setShopLoyaltyProgramCurrentStage(stage);
						break;
					}
					if (currentStage.getShopLoyaltyProgramStageId() <= stage.getShopLoyaltyProgramStageId()) {
						if (totalTransaction > stage.getShopLoyaltyProgramStagePromotionEligibility()) {
							//promote to next stage;
							promote=true;
						}
					}
			}
		}	
		return shopLoyaltyProgram;

	}

	//Order related functions go here
	public Order createOrder(Cart cart){
		
		OrderEntity orderEntity = new OrderEntity();
		Order order = new Order();
		
		int consumerId = cart.getConsumerId();
		
		ConsumerEntity consumerEntity = new ConsumerEntity();
		consumerEntity = consumerDAO.findById(consumerId);
		
		int userId = consumerEntity.getUserId();
		int shopId = consumerEntity.getShopId();
		int cartId = cart.getCartId();
		
		orderEntity.setCartId(cartId);
		orderEntity.setConsumerId(cart.getConsumerId());
		orderEntity.setUserId(userId);
		
		int orderStatus = WooptCode.ORDER_CONFIRMED;
		
		orderEntity.setOrderStatus(orderStatus);
		
		orderEntity = orderDAO.save(orderEntity);
		
		//Convert from Consumer Entity to Consumer DTO
		Gson gson = new Gson();
		String jsonOrder = gson.toJson(orderEntity, OrderEntity.class);
		order = gson.fromJson(jsonOrder, Order.class);
		
		order.setCart(cart);
		
		return order;
	}

		

}
