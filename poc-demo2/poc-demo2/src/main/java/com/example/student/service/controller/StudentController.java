package com.example.student.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.service.model.StudentBean;
import com.example.student.service.repository.StudentDataRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentDataRepo repository;
	
	@GetMapping("/students")
	public List<StudentBean> retrieveAllStudents(){
		return repository.findAll();		
	}
	
	@PostMapping("/students")
	public ResponseEntity addstudent (@RequestBody StudentBean studentbean, @PathVariable long id) {
		//pathvariable says that the method should have URI 
		return null;
		
	}

}
