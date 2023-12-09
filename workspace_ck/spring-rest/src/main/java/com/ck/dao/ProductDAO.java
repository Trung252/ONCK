package com.ck.dao;

import java.util.List;

import com.ck.entity.Product;

public interface ProductDAO {
	
	
	public List<Product> findAll();
	
	
	public void add(Product product);
	
	
	public void update(Product product);
	
	
	
	public void delete(int id);
	
	
   public  Product findbyId(int id);
}
