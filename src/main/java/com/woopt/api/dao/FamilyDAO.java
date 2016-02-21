package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.Family;

public interface FamilyDAO {

	public void save(Family family);
	
	public List<Family> list();
	
	public Family findById(long familyId);
	
	public void  delete(long familyId);
	
	public void  updateFamily(Family family);
}
