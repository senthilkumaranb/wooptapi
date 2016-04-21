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
import com.woopt.api.model.ConsumerViewModel;
import com.woopt.api.model.ShopModel;
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
	
private static final Logger LOGGER = Logger.getLogger(ShopController.class.getName());
	
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
		String responseCode = WooptCode.SUCCESS;
		
		try{			
			if (null != userModel){
				//user = userModel.getUser();
				consumerShopModels = consumerService.getMyFavShops(userModel);
			}			
		}
		catch (Exception e){
			LOGGER.info("Exception :" + e.getMessage());
		} finally {
		}
	
		LOGGER.info("Return ShopModel:" + consumerShopModels);
		return new ResponseEntity<List<ConsumerViewModel>>(consumerShopModels, returnHeader, HttpStatus.OK);
	}

}
