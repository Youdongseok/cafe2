package com.shop.cafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Product;
import com.shop.cafe.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("getAllProducts")
	public List<Product> getAllProducts() {
		try {
			return productService.getAllProducts();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
