package com.alvaro.projects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alvaro.projects.model.services.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	private IProductService productService;

	@GetMapping("/book")
	public String getAll(Model m) {
		m.addAttribute("products", productService.findAll());
		return "book/index";
	}
	
}
