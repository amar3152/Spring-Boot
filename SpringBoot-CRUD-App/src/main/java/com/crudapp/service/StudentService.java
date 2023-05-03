package com.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.entity.Student;
import com.crudapp.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
		}

	public void save(Student student) {
		studentRepo.save(student);
	}
	
	public Student getStudent(Long id) {
		return studentRepo.findById(id).get();
	}
	
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}
}

