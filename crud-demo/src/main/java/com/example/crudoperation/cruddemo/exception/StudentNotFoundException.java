package com.example.crudoperation.cruddemo.exception;

/**
 * @author Shylaja
 *
 */
@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException {
	
 public StudentNotFoundException (String ex) {
	 super (ex);
 }
}
