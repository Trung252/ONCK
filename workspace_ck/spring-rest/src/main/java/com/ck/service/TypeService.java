package com.ck.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ck.dao.TypeDAO;
import com.ck.entity.Type;
@Service
@Transactional
public class TypeService  implements  TypeDAO  {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public List<Type> findAll() {
		
		String sql= "SELECT * FROM TYPE";
		
		
		List<Type>  list = sessionFactory.getCurrentSession().createNativeQuery(sql,Type.class).
				getResultList();
		return list;
	}

	@Override
	public void add(Type type) {
		sessionFactory.getCurrentSession().persist(type);
		
	}

	@Override
	public void update(Type type) {
		sessionFactory.getCurrentSession().merge(type);
		
	}

	@Override
	public void delete(int id) {
		Type type  = findbyId(id);
		sessionFactory.getCurrentSession().delete(type);
		
	}

	@Override
	public Type findbyId(int id) {
		
		return sessionFactory.getCurrentSession().find(Type.class, id);
	}

}
