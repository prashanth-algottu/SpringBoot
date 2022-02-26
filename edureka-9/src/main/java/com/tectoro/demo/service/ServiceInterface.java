package com.tectoro.demo.service;

import java.util.List;

import com.tectoro.demo.model.Employee;

public interface ServiceInterface {
	
	public void saveEmployee(Employee emp);
	
	public List<Employee>  getAll();
	public void getId(int roll);
	public Employee update( int roll );
	public void delete(int roll);
	

}
