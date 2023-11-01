package com.employee.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.webapp.model.Employee;
import com.employee.webapp.serviceIMPL.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl impl;
	
	
	@GetMapping("/")
		public String viewHomePage(Model model) {
		model.addAttribute("list", impl.getAllEmployee());
		return "index";
	}
	
	@GetMapping("/addnew")
	public String addNewEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "add";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		impl.save(employee);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
    public String updateForm(@PathVariable(value = "id") int id, Model model) {
        Employee employee = impl.getById(id);
        model.addAttribute("employee", employee);
        return "update";
    }
 
    @GetMapping("/delete/{id}")
    public String deleteThroughId(@PathVariable(value = "id") int id) {
        impl.deleteByID(id);
        return "redirect:/";
 
    }
}
