package com.woopt.api.service;

import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woopt.api.common.Validate;
import com.woopt.api.common.WooptCode;
import com.woopt.api.dao.DeviceDAO;
import com.woopt.api.dao.UserDAO;
import com.woopt.api.entity.DeviceEntity;
import com.woopt.api.entity.UserEntity;
import com.woopt.api.model.UserModel;

@Service
public class UserService {
	
	private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());
	
	ObjectMapper mapper = new ObjectMapper();
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	DeviceDAO deviceDAO;
	
	public int joinNewUser(UserModel userModel) {
		LOGGER.info("Envoking UserService.joinNewUser method");
		LOGGER.info("Passed userModel is:" + userModel);
		int returnCode = WooptCode.SYSTEM_ERROR;
		try {
			LOGGER.info("Validating userModel model values");
			if (null != userModel && null != userModel.getUser()) {
				if (!Validate.validateFirstName(userModel.getUser().getUserFirstName())) {
					LOGGER.error("Invalid UserModel");
					returnCode = WooptCode.INVALID_FIRSTNAME;
					throw new Exception();
				}else if (!Validate.validateMobileNumber(userModel.getUser().getUserMobile())) {
					LOGGER.error("Invalid UserModel");
					returnCode = WooptCode.INVALID_MOBILENUMBER;
					throw new Exception(); 
				}
			} else {
				LOGGER.error("Invalid UserModel");
				returnCode = WooptCode.INVALID_USERMODEL;
				throw new Exception();
			}
			LOGGER.info("Validating device model values");
			if (null != userModel.getDevice()) {
				if (!Validate.validateIMEI(userModel.getDevice().getDeviceImei())) {
					LOGGER.error("Invalid UserModel");
					returnCode = WooptCode.DEVICE_INVALID_IMEI;
					throw new Exception();
				}
				if (!Validate.validateIMEI(userModel.getDevice().getDeviceSerialNo())) {
					LOGGER.error("Invalid UserModel");
					returnCode = WooptCode.DEVICE_INVALID_DEVICESERIALNO;
					throw new Exception();
				}
			}
			if (userDAO.findByMobile(userModel.getUser().getUserMobile()) != null) {
				LOGGER.warn("Mobile number already exist");
				returnCode = WooptCode.MOBILE_NUMBER_ALREADY_EXIST;
				throw new Exception();
			} else {
				UserEntity userEntity = new UserEntity();
				DeviceEntity deviceEntity = new DeviceEntity();
				Timestamp currentTimestamp = new Timestamp(new java.util.Date().getTime());
				int newOTP = OTPService.generateOpt();
				userEntity.setUserFirstName(userModel.getUser().getUserFirstName());
				userEntity.setUserMobile(userModel.getUser().getUserMobile());
				userEntity.setUserCreatedDatetime(currentTimestamp);
				userEntity.setUserLastUpdateDatetime(currentTimestamp);
				
				deviceEntity.setDeviceStatus(WooptCode.DEVICE_STATUS_ACTIVE);
				deviceEntity.setDeviceIMEI(userModel.getDevice().getDeviceImei());
				deviceEntity.setDeviceSerialNo(userModel.getDevice().getDeviceSerialNo());
				deviceEntity.setDeviceOTP(newOTP+"");
				deviceEntity.setDeviceOTPStatus(WooptCode.OPT_NOT_YET_VALIDATED);
				deviceEntity.setDeviceOTPTimestamp(currentTimestamp);
				userDAO.save(userEntity);
				deviceDAO.save(deviceEntity);
				OTPService.sendOTP(newOTP, userModel.getUser().getUserMobile());
				LOGGER.info("userEntity:" + userEntity);
				LOGGER.info("deviceEntity:" + deviceEntity);
				LOGGER.info("newOTP:" + newOTP);
				returnCode = WooptCode.SUCCESS;
			}
		} catch (Exception e) {
			LOGGER.error("Inside catch block, e.getMessage() is: " + e.getMessage());
			e.getMessage();
		}
		return returnCode;
	}
	
	public int updateOTP(UserModel userModel, HttpHeaders header){
		int result = WooptCode.SYSTEM_ERROR;
		String mobileNumber = null;
		String OTP = null;
		long userId = 0;
		try {
			if (null != header && null != header.get("otp") 
					&& null != userModel && null != userModel.getUser() 
					&& null != userModel.getUser().getUserMobile()) {
				OTP = header.get("otp").get(0);
				mobileNumber = userModel.getUser().getUserMobile();
				UserEntity userEntity = userDAO.findByMobile(mobileNumber);
				if (null == userEntity || userEntity.getUserStatus() == WooptCode.USER_DELETED){
					return WooptCode.USER_DOES_NOT_EXIST;
				}else if(userEntity.getUserStatus() == WooptCode.USER_ACTIVE){
					return  WooptCode.USER_ALREADY_ACTIVE;
				}else{
					userId = userEntity.getUserId(); 
				}
				if (null != header && null != header.get("otp") && null != header.get("otp").get(0)){
					OTP = header.get("otp").get(0);
				}else{
					//Write Logic to check OTP in Device table and update the table.
				}
				
			}
			result = WooptCode.SUCCESS;
		} catch (Exception e) {
			
		}
		return result;
	}
	
}






