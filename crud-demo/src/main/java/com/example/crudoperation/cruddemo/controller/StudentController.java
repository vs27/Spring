package com.example.crudoperation.cruddemo.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.crudoperation.cruddemo.exception.StudentNotFoundException;
import com.example.crudoperation.cruddemo.repository.StudentRepository;
import com.example.crudoperation.cruddemo.student.Student;

/**
 * @author Shylaja
 *
 */
@RestController //@ResponseBody + @Controller ==> Beans converted to Json / XML
public class StudentController {

	@Autowired
	StudentRepository repository;

	@GetMapping("/studentslist")
	public List<Student> retrieveAllStudents(){
		return repository.findAll();		
	}

	@GetMapping("/studentslist/{id}")
	public Student retrieveStudentById(@PathVariable long id ) { //@pathvariable is for initailisation of the id used below
		Optional<Student> student = repository.findById(id); //Optional got added while adding findby id method

		if(!student.isPresent()) 
			throw new StudentNotFoundException("id " + id);
		return student.get(); //get is a method of optional

	}

	@DeleteMapping("/studentslist/{id}")
	public void deleteById(@PathVariable long id) {
		repository.deleteById(id);
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/studentslist")
	public ResponseEntity createStudent(@RequestBody Student student) { //requestbody maps the stu details from req to bean
		Student saveStudent = repository.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(saveStudent.getId()).toUri();

		return ResponseEntity.created(location).build();		//reposne entity has the header that contanis the url of the creted resource
	}

	@PutMapping("/studentslist/{id}")
	public ResponseEntity updateStudent(@RequestBody Student student,@PathVariable long id) {
		Optional<Student> updated= repository.findById(id);
		if(!updated.isPresent()) 
			return ResponseEntity.notFound().build();
		student.setId(id);
		repository.save(student);
		return ResponseEntity.noContent().build(); // nocontent is for returning newly created resource

	}

}


