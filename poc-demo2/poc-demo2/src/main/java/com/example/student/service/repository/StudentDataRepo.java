package com.example.student.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.service.model.StudentBean;

/**
 * @author Shylaja
 *
 */
@Repository
public interface StudentDataRepo extends JpaRepository<StudentBean, Long>{ // add the bean class and the primary key here
	//StudentBean add(long id, String name, int age);
}
