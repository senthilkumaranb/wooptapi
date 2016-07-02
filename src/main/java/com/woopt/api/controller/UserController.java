package com.woopt.api.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.woopt.api.common.WooptCode;
import com.woopt.api.model.FamilyMember;
import com.woopt.api.model.UserModel;
import com.woopt.api.service.UserService;

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
	UserService userServive;
	
	@RequestMapping(value = "/join", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userModel, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ) {
		LOGGER.info("calling api POST /api/user/join");
		LOGGER.info("Input UserMode:" + userModel);
		int responseCode = userServive.joinNewUser(userModel);
		LOGGER.info("responseCode:" + responseCode);
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("responseCode", responseCode+"");
		return new ResponseEntity<UserModel>(userModel, returnHeader, HttpStatus.OK);
	}

	@RequestMapping(value = "/getIn", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<String> getIn(@RequestBody UserModel userModel, UriComponentsBuilder ucBuilder, 
			@RequestHeader HttpHeaders header ) {
		LOGGER.info("Calling POST /api/user/getIn");
		int result = userServive.updateOTP(userModel, header);
		String token = "";
		if (result == WooptCode.SUCCESS){
			token = userServive.getUserToken(userModel);
		}
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("Token", token);
		returnHeader.add("Responsecode", result+"");
		LOGGER.info("/api/user/getIn returnHeader:" + returnHeader);
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/userProfile", method = RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<UserModel> userProfileGET(UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		//TODO check this api after adding following
		//1. Add some family member and check it
		//2. Add address and check it once again
		//3. Add part of Family and check it once again
		//4. Add myServices and check it once again
		System.out.println("Calling GET /api/user/userProfile/");
		UserModel returnUserModel = userServive.getUserProfile(header);
		if (null != returnUserModel){
			header.add("responseCode", WooptCode.SUCCESS+"");
		}else{
			header.add("responseCode", WooptCode.FAIL+"");
		}
		return new ResponseEntity<UserModel>(returnUserModel, header, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/userProfile", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<String> userProfilePOST(@RequestBody UserModel userModel, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling POST /api/user/userProfile/");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/userProfile", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<String> userProfilePUT(@RequestBody UserModel userModel, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling PUT /api/user/userProfile/");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/userProfile", method = RequestMethod.DELETE, headers="Accept=application/json")
	public ResponseEntity<String> userProfileDELETE(@RequestBody UserModel userModel, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling DELETE /api/user/userProfile/");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/familyMembers", method = RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<String> familyMembersGET(@RequestBody List<FamilyMember> familyMemberList, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling GET /api/user/familyMembers");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/familyMembers", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<String> familyMembersPOST(@RequestBody List<FamilyMember> familyMemberList, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling POST /api/user/familyMembers");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/familyMembers", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<String> familyMembersPUT(@RequestBody List<FamilyMember> familyMemberList, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling PUT /api/user/familyMembers");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/familyMembers", method = RequestMethod.DELETE, headers="Accept=application/json")
	public ResponseEntity<String> familyMembersDELETE(@RequestBody List<FamilyMember> familyMemberList, UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling DELETE /api/user/familyMembers");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}

	@RequestMapping(value = "/myServices", method = RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<String> myServicesGET(UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){//Header will contain mobile no.
		System.out.println("Calling GET /api/user/myServices");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}

	@RequestMapping(value = "/myServices", method = RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<String> myServicesPUT(UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header ){
		System.out.println("Calling PUT /api/user/myServices");
		HttpHeaders returnHeader = new HttpHeaders();
		returnHeader.add("token", "tokenStringdasdas");
		returnHeader.add("responseCode", "30");
		return new ResponseEntity<String>(returnHeader, HttpStatus.OK);
	}

	/*@RequestMapping(value = "/signup/{username}", method = RequestMethod.GET,headers="Accept=application/json")
	public ResponseEntity<String> registerNewUser(@PathVariable("username") String username ) {
		
		System.out.println("************** passed User Name is : " + username);
		LOGGER.info("************** passed User Name is : " + username);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}*/
	
	/*@RequestMapping(value = "/test/", method = RequestMethod.POST,headers="Accept=application/json")
	public ResponseEntity<String> test(@PathVariable("username") String json ) {
		System.out.println("************** test json : " + json);
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}*/
}