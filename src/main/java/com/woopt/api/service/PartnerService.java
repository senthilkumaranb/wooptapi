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
import com.woopt.api.dao.ConsumerDAO;
import com.woopt.api.dao.UserDAO;
import com.woopt.api.entity.ConsumerEntity;
import com.woopt.api.entity.UserEntity;
import com.woopt.api.model.Consumer;
import com.woopt.api.model.PartnerViewModel;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyProgram;

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
			ShopLoyaltyCard shopLoyaltyCard = consumerService.getUserShopLoyaltyCard(consumerId);
			partnerView.setShopLoyaltyCard(shopLoyaltyCard);
			
			// Populate consumer loyalty program to partner view
			ShopLoyaltyProgram shopLoyaltyProgram = consumerService.getUserShopLoyaltyProgram(consumerId);
			partnerView.setShopLoyaltyProgram(shopLoyaltyProgram);
			
			//partnerView.setConsumerCheckIn(consumerCheckIn);
			
			//partnerView.setUserDeals(userDeals);
			
			//partnerView.setOrder(order);
			
			//partnerView.setChats(chats);
			
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

}
