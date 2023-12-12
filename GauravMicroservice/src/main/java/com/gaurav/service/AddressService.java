package com.gaurav.service;

import java.util.List;

import com.gaurav.dto.AddressDto;
import com.gaurav.exception.AddressNotFoundException;
import com.gaurav.model.Address;

public interface AddressService {

	Address createAddress(AddressDto dto) throws AddressNotFoundException;
	AddressDto getById(int aid) throws AddressNotFoundException;
	List<AddressDto> getAllAddress() throws AddressNotFoundException;
}
