package com.gaurav.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GauravController {
	@GetMapping("/welcome")
	public String welcome() {
		LocalDate localDate = LocalDate.now();
		System.out.println("date is " + localDate);
		String mess=localDate.getDayOfWeek().toString().toLowerCase();
		System.out.println("mess");
		return "welcome to \t +" +  mess + "sale";
	}
}
