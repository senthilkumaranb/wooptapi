package com.woopt.api.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.woopt.api.entity.FamilyEntity;
import com.woopt.api.service.FamilyService;

@Controller
@RequestMapping("/test")
public class TestData {

	private static final Logger LOGGER = Logger.getLogger(TestData.class.getName());
	
	@Autowired
	FamilyService familyService;
	
	@RequestMapping(value="/save", method = RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<FamilyEntity> saveFamilyEntity(@RequestBody FamilyEntity familyEntity, 
			UriComponentsBuilder ucBuilder, @RequestHeader HttpHeaders header) {
		
		LOGGER.info("calling /test/save api");
		LOGGER.info("familyEntity is : " + familyEntity);
		familyService.saveFamilyEntity(familyEntity);
		return new ResponseEntity<FamilyEntity>(familyEntity, HttpStatus.OK);
	}
}