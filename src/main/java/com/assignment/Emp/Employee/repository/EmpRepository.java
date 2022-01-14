package com.assignment.Emp.Employee.repository;

import org.springframework.stereotype.Repository;
import com.assignment.Emp.Employee.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmpRepository {
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		return employee;
	}

	public String add(Employee emp) {
		employee.add(emp);
		return "Record successfully added";
	}

	public String edit(Employee emp) {
		
		employee.stream().filter(e -> e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
			e.setEnterpriseId(emp.getEnterpriseId());
			e.setName(emp.getName());
			e.setDateOfBirth(emp.getDateOfBirth());
			e.setDateOfJoining(emp.getDateOfJoining());
			e.setSalary(emp.getSalary());
			
		});
		
		return "Record updated successfully";
	}

	public String delete(int empNo) {
		employee.remove(empNo-1);
		return "Record Deleted";
	}

}
