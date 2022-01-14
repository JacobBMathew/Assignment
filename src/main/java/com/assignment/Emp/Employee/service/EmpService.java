package com.assignment.Emp.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.assignment.Emp.Employee.entity.*;
import com.assignment.Emp.Employee.repository.*;

@Service
public class EmpService {
	@Autowired
	EmpRepository empRepository;

	
	public List<Employee> getAll(){
		return empRepository.getAll();
	}


	public String add(Employee emp) {
		
		return empRepository.add(emp);
	}


	public String edit(Employee emp) {
		// TODO Auto-generated method stub
		return empRepository.edit(emp);
	}


	public String delete(int empNo) {
		return empRepository.delete(empNo);
	}
}
