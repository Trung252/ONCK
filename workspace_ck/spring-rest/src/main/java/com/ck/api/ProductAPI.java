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

import com.ck.entity.Product;
import com.ck.service.ProductService;

@RestController
public class ProductAPI {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/products")
	public List<Product> getAll() {
		
		return productService.findAll();
	}
 	
	@PostMapping("/products")
	public void  add(@RequestBody Product product) {
		productService.add(product);
		System.out.println("add");
	}
	
	@PutMapping("/products")
	public void update(@RequestBody Product product) {
		productService.update(product);
		System.out.println("update");
	}
 	
	@GetMapping("/products/{id}")
	public Product find(@PathVariable int id) {
		
		return productService.findbyId(id);
	}
	
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable int id) {
		
		productService.delete(id);
		System.out.println("delete");
	}
	

}
