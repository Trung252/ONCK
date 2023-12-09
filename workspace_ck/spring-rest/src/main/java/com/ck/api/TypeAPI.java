package com.ck.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ck.entity.Type;
import com.ck.service.TypeService;

@RestController

public class TypeAPI {
	
	@Autowired
	private TypeService typeService;
	
	
	@GetMapping("/types")
	public List<Type> getAll() {
		
		return typeService.findAll();
	}
 	
	@PostMapping("/types")
	public void  add(@RequestBody Type type) {
		typeService.add(type);
		System.out.println("add");
	}
	
	@PutMapping("/types")
	public void update(@RequestBody Type type) {
		typeService.update(type);
		System.out.println("update");
	}
 	
	@GetMapping("/types/{id}")
	public Type find(@PathVariable int id) {
		
		return typeService.findbyId(id);
	}
	
	@DeleteMapping("/types/{id}")
	public void delete(@PathVariable int id) {
		
		typeService.delete(id);
		System.out.println("delete");
	}
	

}
