package com.event.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	Environment environment; 


	@PostMapping
	public String createProduct() {

		return "Product created";
	}
	
    @GetMapping
	public String getProduct() {

		return "Get Product port : "+environment.getProperty("local.server.port");
	}
    
    @PutMapping
	public String updateProduct() {

		return "Update Product";
	}
    
    @DeleteMapping
	public String deleteProduct() {

		return "Delete Product";
	}

}
