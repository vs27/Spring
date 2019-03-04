package com.example.crudoperation.cruddemo.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Shylaja
 *
 */
@Entity
public class Student {

	@Id
	@GeneratedValue
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="subject")
	private String subject;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student (long id, String name, String subject) {
		this.id =id;
		this.name =name;
		this.subject = subject;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
