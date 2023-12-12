package com.gaurav.service;

import com.gaurav.dto.EmployeeDto;
import com.gaurav.model.Employee;

import java.util.*;
public interface EmployeeService {

	public Employee createEmployee(EmployeeDto edto);
	public EmployeeDto getById(int id);
	public void update();
	public void delete();
	public List<EmployeeDto> getAllEmployees();
}
