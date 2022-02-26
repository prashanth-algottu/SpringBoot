package com.tectoro.demo.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.tectoro.demo.model.Employee;
import com.tectoro.demo.repository.EmployeeRepo;
import com.tectoro.demo.service.ServiceImp;
import com.tectoro.demo.service.ServiceInterface;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	 ServiceInterface interface1;
	@Autowired
	EmployeeRepo rep;

	@RequestMapping("/")
	public String hello() {
		return "index";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("emp") Employee emp) {
		interface1.saveEmployee(emp);
		return "redirect:/";

	}
	
	@GetMapping("/adding")
	public String addingPage(Model model)
	
	{
		Employee employee=new Employee();
		
    	model.addAttribute("employee", employee);
		return "add";
	}
	
	
	@GetMapping("/showStudentPage")
	public String studentsViewHomePage(Model model) {
		model.addAttribute("data", interface1.getAll());
		return "viewdetaiils";
	}
	
	
	@GetMapping("/update/{roll}")
	public String update( @PathVariable(value = "roll") int roll, Model model )
	{
		 Employee employee = interface1.update(roll);
		 model.addAttribute("employee",  employee);
		return "update";
	}
	
	@GetMapping("/deleteById/{roll}")
	public String delete( @PathVariable(value = "roll") int roll)
	{
		this.interface1.delete(roll);
		return "redirect:/";
	}
	
	
	
	
	

	

	@GetMapping("/view/{roll}")
	public String viewStudent(@PathVariable(value = "roll") int roll, Model model) {
		model.addAttribute("data", rep.getById(roll));

		this.interface1.getId(roll);
		return "viewdetaiils";
	}

	// studentDeleteById/{id}"
	/// studentDeleteById/{id}

}
