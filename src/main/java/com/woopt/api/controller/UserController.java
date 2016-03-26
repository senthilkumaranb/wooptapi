package com.woopt.api.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.woopt.api.common.Validate;
import com.woopt.api.dao.DeviceDAO;
import com.woopt.api.dao.UserDAO;
import com.woopt.api.entity.UserEntity;
import com.woopt.api.model.Device;
import com.woopt.api.model.User;
import com.woopt.api.model.UserModel;

/**
 * REST Controller Implementation
 * Spring REST provides REST implementation
 * @author Sushil
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	DeviceDAO deviceDAO;
	
	@RequestMapping(value = "/regusr/", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<String> registerUser(@RequestBody UserModel userModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		
		User user = userModel.getUser();
		Device device = userModel.getDevice();
		
		String mobileNo = null;
		String firstName = null;
		String imei = null;
		
		try {
			
			/**
			 * Validate input
			 **/
			if (null != user && user.getUserMobile() != null) {
				mobileNo = user.getUserMobile();
				
				if (!Validate.validateMobileNumber(mobileNo)) {
					//return error code that invalid Mobile number. 
				}
			}
			
			if (user.getUserFirstname() != null) {
				firstName = user.getUserFirstname();
				
				if (!Validate.validateFirstName(firstName)) {
					//return error code that invalid Name. 
				}
			}
			
			if (null != device && device.getDeviceImei() != null) {
				imei = device.getDeviceImei();
				
				if (!Validate.validateIMEI(imei)) {
					//return error code that invalid Name. 
				}
			}
			
			/**
			 * Verify duplicate User Mobile & Device
			 * -- Null has been verified
			 */
			if (userDAO.findByMobile(mobileNo) != null) {
				
				// return error code that 
			}
			
			
		} catch (Exception e) {
			
		}
		
		
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUserFirstName(user.getUserFirstname());
		
		
		return null;
	}
	
		
	
	
	@RequestMapping(value = "/createUser/", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<String> createUser(@RequestBody UserEntity user, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		
		System.out.println("++++++ inside createUser method..");
		int userId = user.getUserId();
		LOGGER.info("++++ userId : "  + userId);
		
		LOGGER.info("++++ User Object : "  + user);
		
		System.out.println("1111++++++ " + header.toString());
		
		HttpHeaders headers = new HttpHeaders();
	    headers.add("token", "tokenStringdasdas");
	    headers.add("responseCode", "30");
	    
		return new ResponseEntity<String>(headers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/signup/{username}", method = RequestMethod.GET,headers="Accept=application/json")
	public ResponseEntity<String> registerNewUser(@PathVariable("username") String username ) {
		
		System.out.println("************** passed User Name is : " + username);
		LOGGER.info("************** passed User Name is : " + username);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/test/", method = RequestMethod.POST,headers="Accept=application/json")
	public ResponseEntity<String> test(@PathVariable("username") String json ) {
		System.out.println("************** test json : " + json);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}
	
}
