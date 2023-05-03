package com.restAPI.ServicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restAPI.Services.CourseService;
import com.restAPI.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java","Basic Java Course"));
		list.add(new Course(146,"PHP","Basic Php Course"));
		list.add(new Course(147,"C","Basic C Course"));
		list.add(new Course(148,"Python","Basic Python Course"));
		
	}

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourses(long coursesId) {
		// TODO Auto-generated method stub
		Course c = null;
		
		for(Course course : list) {
			if(course.getId() == coursesId) {			
				c = course;
				break;
			}
		}
		return c;
	}

	
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	

}
