package com.restAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.Services.CourseService;
import com.restAPI.entity.Course;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home(){
		return "Hellooo Ab!";			
	}
	
	//get Courses
	@GetMapping("/courses")
	public List<Course> getCourse(){
		return courseService.getCourse();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourses(@PathVariable String courseId) {
		return courseService.getCourses(Long.parseLong(courseId));	
		}
	
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course) {
		return courseService.addCourse(course); 
	}

}
