package com.gaurav.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Product;
import com.gaurav.service.ProductServic;

import jakarta.annotation.PostConstruct;

@RestController
public class ProductController{
	@PostMapping("/product")
	public ResponseEntity<String> addproduct(@RequestBody Product p) {
		return new ResponseEntity<String>("added sullcesfully",HttpStatus.CREATED);
	}

}
