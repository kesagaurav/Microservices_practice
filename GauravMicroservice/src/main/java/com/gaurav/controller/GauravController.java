package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.dto.EmployeeDto;
import com.gaurav.model.Employee;
import com.gaurav.service.EmployeeService;

@RestController
public class GauravController {
	@Autowired
	private EmployeeService service;
	@GetMapping("/gaurav")
	public ResponseEntity<String> getName(){
		return new ResponseEntity<String>("hello welcome to the gaurav spring-microservice tutorial", HttpStatus.OK);
	}
	@PostMapping("/employee")
	public ResponseEntity<Employee>  createEmployee(@RequestBody EmployeeDto edto) {

		if(edto!=null) {
			return new ResponseEntity<Employee>(service.createEmployee(edto), HttpStatus.CREATED);

		}else {
			return new ResponseEntity<Employee>(service.createEmployee(edto), HttpStatus.BAD_REQUEST);

		}
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		return new ResponseEntity<List<EmployeeDto>>(service.getAllEmployees(), HttpStatus.OK);
	}
}
