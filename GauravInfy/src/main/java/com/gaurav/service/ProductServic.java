package com.gaurav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gaurav.model.Product;
import com.gaurav.repository.ProductRepository;

@Service
public class ProductServic {
	@Autowired
	private ProductRepository repo;
	
	public String addproduct(Product p) {
		p=repo.save(p);
		return "added successfully" + p.getProd_name();
	}
	
}
