package com.ck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ck.model.Type;
import com.ck.service.TypeService;

@Controller
@RequestMapping("/type")
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	
	@GetMapping("/list")
	public String getAll(Model model) {
		model.addAttribute("types",typeService.findAll());
		return "list";
	}
	
	
	@GetMapping("/add")
	public String add() {
		
			
		
		return "add";
	}
	
	@PostMapping("/add")
	public String add(@ModelAttribute Type type) {

		typeService.save(type);
		return "redirect:/type/list";
	}
	
	
	@GetMapping("/update")
	public String update(Model model,@RequestParam int id) {	
		model.addAttribute("type",typeService.findbyId(id));
		return "update";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Type type) {

		typeService.save(type);
		return "redirect:/type/list";
	}
	
	@GetMapping("/delete")
	public String delete( @RequestParam int id) {
		
		typeService.delete(id);
		System.out.println("delete");
		
		
		
		return "redirect:/type/list";
	}
	

}
