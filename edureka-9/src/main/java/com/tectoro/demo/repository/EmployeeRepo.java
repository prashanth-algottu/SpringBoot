package com.tectoro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.demo.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
