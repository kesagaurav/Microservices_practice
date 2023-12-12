package com.gaurav.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.dto.AddressDto;
import com.gaurav.exception.AddressNotFoundException;
import com.gaurav.model.Address;
import com.gaurav.service.AddressService;
@RestController
@Validated
public class AddressController {
	@Autowired
	public AddressService service;
	@PostMapping("/address")
	public ResponseEntity<Address> createAddress(@Valid @RequestBody AddressDto dto) throws AddressNotFoundException{
		if(dto!=null) {
			return new ResponseEntity<Address>(service.createAddress(dto), HttpStatus.CREATED);
		}else {
			return new ResponseEntity<Address>(service.createAddress(dto), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("/address/{aid}")
	public ResponseEntity<AddressDto> getAddressById(@PathVariable @NotNull(message = "id is wrong") int  aid) throws AddressNotFoundException{
			if(aid!=0) {
				return new ResponseEntity<AddressDto>(service.getById(aid), HttpStatus.BAD_REQUEST);

			}else {
				return new ResponseEntity<AddressDto>(service.getById(aid), HttpStatus.OK);

			}
		
	}
	
	
	@GetMapping("/addresss")
	public ResponseEntity<List<AddressDto>> getAllAddress() throws AddressNotFoundException{
		
			return new ResponseEntity<List<AddressDto>>(service.getAllAddress(),HttpStatus.OK);
		
	}
	
	
	
	
}
