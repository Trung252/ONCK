package com.ck.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ck.dao.TypeDAO;
import com.ck.model.Type;

@Service

public class TypeService implements TypeDAO {
	@Autowired
	private RestTemplate restTemplate;

	private String url;

	public TypeService(RestTemplate restTemplate, @Value("${url1}") String url) {
		super();
		this.restTemplate = restTemplate;
		this.url = url;
	}

	@Override
	public List<Type> findAll() {

		Type[] types = restTemplate.getForEntity(url, Type[].class).getBody();
		return Arrays.asList(types);

	}

	@Override
	public void delete(int id) {
		restTemplate.delete(url + id);

	}

	@Override
	public Type findbyId(int id) {

		return restTemplate.getForEntity(url + id, Type.class).getBody();
	}

	@Override
	public void save(Type type) {
		if (type.getId() != 0) { 
			restTemplate.put(url, type);
		}
		restTemplate.postForObject(url, type, Type.class);

	}

}
