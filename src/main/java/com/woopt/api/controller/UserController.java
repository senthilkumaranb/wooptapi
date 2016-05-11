package com.woopt.api.controller;

import java.sql.Timestamp;
import java.util.Date;

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
import com.woopt.api.common.WooptCode;
import com.woopt.api.dao.DeviceDAO;
import com.woopt.api.dao.UserDAO;
import com.woopt.api.entity.DeviceEntity;
import com.woopt.api.entity.UserEntity;
import com.woopt.api.model.Device;
import com.woopt.api.model.User;
import com.woopt.api.model.UserModel;
import com.woopt.api.service.OTPService;

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
	
	@RequestMapping(value = "/join", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling /api/user/join api");
		LOGGER.info("Input UserMode:" + userModel);
		HttpHeaders returnHeader = new HttpHeaders();
		User user = null;
		Device device = null;
		String responseCode = WooptCode.SUCCESS;
		
		try {
			
			if (null != userModel) {
				user = userModel.getUser();
				device = userModel.getDevice();
			}
			String firstName = null;
			String mobileNo = null;
			String imei = null;
			String deviceSerialNo = null;
			
			if (null != user) {
				//Validate inputs
				firstName = user.getUserFirstName();
				mobileNo = user.getUserMobile();
				
				if (!Validate.validateFirstName(firstName)) {
					LOGGER.error("Invalid UserModel");
					responseCode = WooptCode.INVALID_FIRSTNAME;
					throw new Exception();
				}else if (!Validate.validateMobileNumber(mobileNo)) {
					LOGGER.error("Invalid UserModel");
					responseCode = WooptCode.INVALID_MOBILENUMBER;
					throw new Exception(); 
				}
			} else {
				LOGGER.error("Invalid UserModel");
				responseCode = WooptCode.INVALID_USERMODE;
				throw new Exception();
			}
			
			if (null != device) {
				imei = device.getDeviceImei();
				deviceSerialNo = device.getDeviceSerialNo();
				
				if (!Validate.validateIMEI(imei)) {
					LOGGER.error("Invalid UserModel");
					responseCode = WooptCode.INVALID_IMEI;
					throw new Exception();
				}
				
				if (!Validate.validateIMEI(deviceSerialNo)) {
					LOGGER.error("Invalid UserModel");
					responseCode = WooptCode.INVALID_DEVICESERIALNO;
					throw new Exception();
				}
			}
			
			if (userDAO.findByMobile(mobileNo) != null) {
				//Verify duplicate User Mobile & Device
				LOGGER.warn("Mobile number already exist");
				responseCode = WooptCode.MOBILE_NUMBER_ALREADY_EXIST;
				throw new Exception();
			} else {
				UserEntity userEntity = new UserEntity();
				DeviceEntity deviceEntity = new DeviceEntity();
				
				Timestamp currentTimestamp = new Timestamp(new java.util.Date().getTime());
				
				userEntity.setUserFirstName(firstName);
				userEntity.setUserMobile(mobileNo);
				userEntity.setUserCreatedDatetime(currentTimestamp);
				userEntity.setUserLastUpdateDatetime(currentTimestamp);
				deviceEntity.setDeviceIMEI(imei);
				deviceEntity.setDeviceSerialNo(deviceSerialNo);
				long newOTP = OTPService.generateNewOTP();
				deviceEntity.setDeviceOTP(newOTP+"");
				deviceEntity.setDeviceOTPStatus(WooptCode.OPT_NOT_YET_VALIDATED);
				deviceEntity.setDeviceOTPTimestamp(currentTimestamp);
				
				//TODO Send OPT to user using SMS service.
				//newOTP
				
				//Inserting user and device entities
				userDAO.save(userEntity);
				deviceDAO.save(deviceEntity);
			}
		} catch (Exception e) {
			LOGGER.error("Inside catch block, e.getMessage() is: " + e.getMessage());
			
			if (e.getMessage() != null) {
				responseCode = WooptCode.SYSTEM_ERROR;
			}
		} finally {
			returnHeader.add("responseCode", responseCode);
		}
		LOGGER.info("Return UserModel:" + userModel);
		return new ResponseEntity<UserModel>(userModel, returnHeader, HttpStatus.OK);
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
