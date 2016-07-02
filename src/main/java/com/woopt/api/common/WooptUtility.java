package com.woopt.api.common;

import com.woopt.api.entity.AddressEntity;
import com.woopt.api.entity.DeviceEntity;
import com.woopt.api.entity.FamilyEntity;
import com.woopt.api.entity.UserEntity;
import com.woopt.api.model.Address;
import com.woopt.api.model.Device;
import com.woopt.api.model.FamilyMember;
import com.woopt.api.model.User;

public class WooptUtility {
	
	public static User getUserFromUserEntity(UserEntity userEntity) {
		User user = null;
		if (null != userEntity) {
			user = new User();
			user.setUserId(userEntity.getUserId());
			user.setUserFirstName(userEntity.getUserFirstName());
			user.setUserLastName(userEntity.getUserLastName());
			user.setUserDOB(DateUtility.dateToString(userEntity.getUserDOB()));
			user.setUserGender(userEntity.getUserGender());
			user.setUserPhone(userEntity.getUserPhone());
			user.setUserMobile(userEntity.getUserMobile());
			user.setUserProfilePhoto(userEntity.getUserProfilePhoto());
			user.setUserEmail(userEntity.getUserEmail());
			user.setUserLoginMode(userEntity.getUserLoginMode());
		}
		return user;
	}
	
	public static Device getDeviceFromDeviceEntity(DeviceEntity deviceEntity) {
		Device device = null;
		if (null != deviceEntity) {
			device = new Device();
			device.setDeviceId(deviceEntity.getDeviceId());
			device.setDeviceImei(deviceEntity.getDeviceIMEI());
			device.setDeviceMac(deviceEntity.getDeviceMAC());
			device.setDeviceSerialNo(deviceEntity.getDeviceSerialNo());
			device.setDeviceStatus(deviceEntity.getDeviceStatus());
			device.setDeviceToken(deviceEntity.getDeviceToken());
			device.setDevicePhone(deviceEntity.getDevicePhone());
		}
		return device;
	}
	
	public static Address getAddressFromAddressEntity(AddressEntity addressEntity) {
		Address address = null;
		if (null != addressEntity){
			address = new Address();
			address.setAddressId(addressEntity.getAddressId());
			address.setUserId(addressEntity.getUserId());
			address.setShopId(addressEntity.getShopId());
			address.setAddressName(addressEntity.getAddressName());
			address.setAddressStreet1(addressEntity.getAddressStreet1());
			address.setAddressStreet2(addressEntity.getAddressStreet2());
			address.setAddressArea(addressEntity.getAddressArea());
			address.setAddressCity(addressEntity.getAddressCity());
			address.setAddressState(addressEntity.getAddressState());
			address.setAddressPostcode(addressEntity.getAddressPostcode());
			address.setAddressCountry(addressEntity.getAddressCountry());
			address.setAddressZone(addressEntity.getAddressZone());
			address.setAddressLatitude(addressEntity.getAddressLatitude());
			address.setAddressLongitude(addressEntity.getAddressLongitude());
			address.setAddressLandmark(addressEntity.getAddressLandmark());
			address.setCreatedDatetime(DateUtility.dateToString(addressEntity.getCreatedDatetime()));
			address.setLastUpdatedDatetime(DateUtility.dateToString(addressEntity.getLastUpdatedDatetime()));
		}
		return address;
	}
	
	public static FamilyMember getFamilyMemberFromFamilyEntity(FamilyEntity familyEntity){
		FamilyMember familyMember = null;
		if (null != familyEntity) {
			familyMember = new FamilyMember();
			
			
		}
		return familyMember;
	}
}
















