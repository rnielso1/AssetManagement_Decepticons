package com.decepticons.assetManagement.services.protocols;

import java.util.List;

import com.decepticons.assetManagement.entity.Employee;


public interface IEmployeeService {

	public List<Employee> findAll();

	public Employee findById(int Id);
	public void save (Employee employee);
	public void deleteById(int id);
}
