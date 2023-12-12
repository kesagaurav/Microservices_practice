package com.gaurav.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.dto.EmployeeDto;
import com.gaurav.model.Employee;
import com.gaurav.repository.EmployeeRepository;
import com.gaurav.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	// Logger logger=(Logger) LoggerFactory.logger(this.getClass());
	@Autowired
	public EmployeeRepository repo;

	@Override
	public Employee createEmployee(EmployeeDto edto) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		EmployeeDto value = edto.value(e1);
		Employee value1 = edto.value1(value);
		return repo.save(value1);
	}

	@Override
	public EmployeeDto getById(int id) {
		// TODO Auto-generated method stub
		Employee edto = repo.findById(id).get();
		EmployeeDto edto1 = new EmployeeDto();
		return edto1.value(edto);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<EmployeeDto> employee = new ArrayList<>();
		List<EmployeeDto> collect = employee.stream().map(t -> t).collect(Collectors.toList());

		return collect;

	}
}
