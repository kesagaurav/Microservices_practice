package com.gaurav.dto;

import com.gaurav.model.Company;

import lombok.Data;

@Data
public class CompanyDto {
	private String cName;
	private String location;
	private double salary;
	
	public  Company value(CompanyDto c) {
		Company cdto=new Company();
		cdto.setCName(this.cName);
		cdto.setLocation(this.location);
		cdto.setSalary(this.salary);
		return cdto;
	}
}
