package com.gaurav.dto;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.gaurav.model.Address;

import lombok.Data;

@Data
public class AddressDto {
	@Id
	@NotNull(message = "id is wrong")
	private int aid;
	@NotNull(message = "{address.state.absent}")
	@Pattern(regexp = "[a-z]{1,}",message = "{address.state.invalid}")
	private String state;
	@NotNull(message = "plz provide city")
	@Pattern(regexp = "[a-z]{1,}",message = "{address.city.invalid}")
	private String city;
	@NotNull(message = "{address.pincode.absent}")
	@Min(value=6,message = "pincode is invalid")
	private int pincode;
	@NotNull(message = "plz provide country")
	@Pattern(regexp = "[a-z]{1,}",message = "country should contain only alphabets")
	private String country;
	
	//converts entity into DTO
	public static AddressDto valueOf(Address address) {
		address=new Address();
		AddressDto aDto=new AddressDto();
		aDto.setCity(address.getCity());
		aDto.setState(address.getState());
		aDto.setPincode(address.getPincode());
		aDto.setCountry(address.getCountry());
		return aDto;
		
	}
	
	public Address value1(AddressDto dto) {
		Address a=new Address();
		a.setState(this.getState());
		a.setCountry(this.getCountry());
		a.setCity(this.getCity());
		a.setPincode(this.getPincode());
		return a;
	}
}
