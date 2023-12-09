package com.ck.dao;

import java.util.List;

import com.ck.entity.Type;

public interface TypeDAO{
	public List<Type> findAll();
	
	
	public void add(Type type);
	
	
	public void update(Type type);
	
	
	
	public void delete(int id);
	
	
   public  Type findbyId(int id);
}
