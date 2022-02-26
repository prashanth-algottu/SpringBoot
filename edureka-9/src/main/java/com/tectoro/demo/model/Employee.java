package com.tectoro.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Naveen")
public class Employee {

	@Id
	@Column(name="roll")
	private int roll;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private String salary;
	@Column(name="company")
	private String company;
	
	
	
	
	
	
	
	
	public Employee(int roll, String name, String salary, String company) {
		super();
		this.roll = roll;
		this.name = name;
		this.salary = salary;
		this.company = company;
	}





	public int getRoll() {
		return roll;
	}
	
	
	
	
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Employee() {
		super();
		
	}
	
	
	
	
	
}
