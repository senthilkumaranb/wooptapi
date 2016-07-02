package com.woopt.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woopt.api.common.WooptUtility;
import com.woopt.api.dao.FamilyDAO;
import com.woopt.api.entity.FamilyEntity;
import com.woopt.api.model.FamilyMember;

@Service
public class FamilyService {
	
	@Autowired
	FamilyDAO familyDAO;
	
	public void saveFamilyEntity(FamilyEntity familyEntity){
		familyDAO.save(familyEntity);
	}
	
	public List<FamilyMember> getFamilyMemberListByUserId(long userId){
		List<FamilyEntity> familyEntityList = familyDAO.findByFamilyHeadId(userId);
		List<FamilyMember> familyMemberList = new ArrayList<FamilyMember>();
		for(FamilyEntity familyEntity: familyEntityList){
			FamilyMember familyMember = WooptUtility.getFamilyMemberFromFamilyEntity(familyEntity);
			familyMemberList.add(familyMember);
		}
		return familyMemberList;
	}
}