package com.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crudapp.entity.Student;
import com.crudapp.service.StudentService;

@Controller
public class MyController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Student> liststudent = studentService.getAllStudents();
		model.addAttribute("liststudent",liststudent);
		System.out.print("get/");
		return "index";
	}
	
	@GetMapping("/new")
	public String addStudent(Model model) {
		model.addAttribute("student",new Student());
		return "new";
	}
	
	@PostMapping("/save")
	public String saveStudents(@ModelAttribute("student") Student student) {
		studentService.save(student);
		return "redirect:/";
	}
	 @RequestMapping("/edit/{id}")
	public ModelAndView showEditPage(@PathVariable(name = "id") Long id) {
		ModelAndView mv = new ModelAndView("new");
		Student std = studentService.getStudent(id);
		mv.addObject(std);
		return mv;
	}
	@RequestMapping	("/delete/{id}")
	public String deleteStudent(@PathVariable(name = "id") long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}
}
