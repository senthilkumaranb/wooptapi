package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.FamilyEntity;

public interface FamilyDAO {

	public void save(FamilyEntity family);
	
	public List<FamilyEntity> list();
	
	public FamilyEntity findById(long familyId);
	
	public List<FamilyEntity> findByFamilyHeadId(long familyHeadId);
	
	public List<FamilyEntity> findByFamilyMemberId(long familyMemberId);
	
	public void  delete(long familyId);
	
	public void  updateFamily(FamilyEntity family);
}
