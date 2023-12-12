package com.gaurav.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GauravController {
	@GetMapping("/gaurav")
	public ResponseEntity<String>  getName() {
		HttpHeaders headers=new HttpHeaders();
		headers.set("GauravApp", "response");
		return new ResponseEntity<>("hi welcome to the response entity session",headers, HttpStatus.ACCEPTED);
		
	}
}
