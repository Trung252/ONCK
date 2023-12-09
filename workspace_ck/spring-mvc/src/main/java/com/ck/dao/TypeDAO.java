package com.ck.dao;

import java.util.List;

import com.ck.model.Type;

public interface TypeDAO{
	public List<Type> findAll();
	
	
	public void save(Type type);
	
	
	
	public void delete(int id);
	
	
   public  Type findbyId(int id);
}
