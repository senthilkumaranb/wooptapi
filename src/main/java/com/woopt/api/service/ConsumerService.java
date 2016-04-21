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
import com.woopt.api.model.Cart;
import com.woopt.api.model.Chat;
import com.woopt.api.model.Offer;
import com.woopt.api.model.Order;
import com.woopt.api.model.ShopLoyaltyCard;
import com.woopt.api.model.ShopLoyaltyProgram;
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
	
	private static final Logger LOGGER = Logger.getLogger(ShopService.class.getName());
	
	private ShopService shopService;
	
    public void setShopService(ShopService ss){
        this.shopService = ss;
    }
	
	public List<ConsumerViewModel> getMyFavShops(UserModel userModel){
		return null;
	}
	
	public ShopLoyaltyCard getMyShopLoyaltyCard(int userId, int shopId){
		return null;
	}
	
	public ShopLoyaltyProgram getMyShopLoyaltyProgram(int userId, int shopId){
		return null;
	}
	
	public List<Offer> getMyShopDeals(int userId, int shopId){
		return null;
	}
	
	public Cart getMyShopCart(int userId, int shopId){
		return null;
	}
	
	public List<Chat> getMyShopChat(int userId, int shopId){
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
	
	public Order createOrder(int userId, int shopId){
		return null;
	}
	
	public Order updateOrder(int userId, int shopId){
		return null;
	}
	
	public Order cancelOrder(int userId, int shopId){
		return null;
	}
	
	public Order addOffertoOrder(int userId, int shopId){
		return null;
	}
	


}
