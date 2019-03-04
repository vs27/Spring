package com.example.crudoperation.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudoperation.cruddemo.student.Student;
/**
 * @author Shylaja
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
