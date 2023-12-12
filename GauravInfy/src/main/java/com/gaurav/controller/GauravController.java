package com.gaurav.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GauravController {
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		
		HttpHeaders headers=new HttpHeaders();
		headers.set("AppName", "gaurav");
		return new ResponseEntity<String>("hello welcome to response entity section", headers, HttpStatus.OK);
		
		
	}
}
