package com.gaurav.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.dto.AddressDto;
import com.gaurav.dto.EmployeeDto;
import com.gaurav.exception.AddressNotFoundException;
import com.gaurav.exception.EmployeeNotFoundException;
import com.gaurav.model.Address;
import com.gaurav.repository.AddressRepository;
import com.gaurav.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository repo;

	@Override
	public Address createAddress(AddressDto dto) throws AddressNotFoundException {
		// TODO Auto-generated method stub
		Address a = new Address();
		AddressDto valueOf2 = dto.valueOf(a);
		Address valueOf = dto.value1(dto);
		return repo.save(valueOf);
	}

	@Override
	public AddressDto getById(int aid) throws AddressNotFoundException{
		// TODO Auto-generated method stub
		Address a1= repo.findById(aid).orElseThrow(()->new AddressNotFoundException("employee is not present with id " + aid));
		Address a2=repo.findById(a1.getAid()).get();
		AddressDto dto=AddressDto.valueOf(a2);
		
		
		//AddressDto a2=AddressDto.valueOf(a1);
		return dto;
	}

	@Override
	public List<AddressDto> getAllAddress() throws AddressNotFoundException{
		// TODO Auto-generated method stub
		List<Address> address=repo.findAll();
		List<AddressDto> dto1=new ArrayList<>();
		address.forEach(e->{
			AddressDto dto=new AddressDto();
			dto.setState(e.getState());
			dto.setCity(e.getCity());
			dto.setCountry(e.getCountry());
			dto.setPincode(e.getPincode());
			dto1.add(dto);
		});
		

		return dto1;
	}

}
