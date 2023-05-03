package com.restAPI.Services;

import java.util.List;

import com.restAPI.entity.Course;

public interface CourseService {

	public List<Course> getCourse();
	public Course getCourses(long coursesId);
	public Course addCourse(Course course);
}
