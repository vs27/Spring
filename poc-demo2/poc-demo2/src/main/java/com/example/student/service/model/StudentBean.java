package com.example.student.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentBean {

	@Id
	@GeneratedValue
	private long id;

	@Column(name="name")
	private String names;

	@Column(name="age")
	private int age;


	public StudentBean() {
		super();
	}
	
	public StudentBean(long id, String name, int age) {
		this.id = id;
		this.names = name;
		this.age = age;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return names;
	}

	public void setName(String name) {
		this.names = name;

	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
