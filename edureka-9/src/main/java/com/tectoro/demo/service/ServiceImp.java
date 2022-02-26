package com.tectoro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.demo.model.Employee;
import com.tectoro.demo.repository.EmployeeRepo;
@Service
public class ServiceImp implements ServiceInterface {
	@Autowired
	EmployeeRepo rep;
	

	@Override
	public void saveEmployee(Employee emp) {
			
		this.rep.save(emp);
				
	}


	@Override
	public List<Employee> getAll() {
		
		return rep.findAll();
	}



	@Override
	public void getId(int roll) {
		Optional<Employee> emp = rep.findById(roll);	
		if(emp.isPresent()==true)
		{
			emp.get();
		}
		
	}



	@Override
	public Employee update(int roll) {
		
		Optional<Employee> optional = rep.findById(roll);
		Employee employee=null;
		if(optional.isPresent()==true)
		{
			employee = optional.get();
		}
		else
		{
			throw new RuntimeException("Employee not found = "+roll);
		}
		
		return employee;
	}



	@Override
	public void delete(int roll) 
	{
		
		this.rep.deleteById(roll);	
		System.out.println("Prashanth");
		 		
	}


	




	
}
