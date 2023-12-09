package com.ck.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ck.dao.ProductDAO;
import com.ck.entity.Product;
@Service
@Transactional
public class ProductService  implements  ProductDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public List<Product> findAll() {
		
		String sql= "SELECT * FROM PRODUCT";
		
		
		List<Product>  list = sessionFactory.getCurrentSession().createNativeQuery(sql,Product.class).
				getResultList();
		return list;
	}

	@Override
	public void add(Product type) {
		sessionFactory.getCurrentSession().persist(type);
		
	}

	@Override
	public void update(Product type) {
		sessionFactory.getCurrentSession().merge(type);
		
	}

	@Override
	public void delete(int id) {
		Product type  = findbyId(id);
		sessionFactory.getCurrentSession().delete(type);
		
	}

	@Override
	public Product findbyId(int id) {
		
		return sessionFactory.getCurrentSession().find(Product.class, id);
	}
}
