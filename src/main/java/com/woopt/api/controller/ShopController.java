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
		String responseCode = WooptCode.SUCCESS;
		
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

}
