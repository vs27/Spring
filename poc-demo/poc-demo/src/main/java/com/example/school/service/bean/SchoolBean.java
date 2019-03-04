package com.example.school.service.bean;

public class SchoolBean {

	private String senior;
	private String junior;

	public SchoolBean(String senior, String junior) {
		this.senior = senior;
		this.junior = junior;
	}

	public String getSenior() {
		return senior;
	}

	public void setSenior(String senior) {
		this.senior = senior;
	}

	public String getJunior() {
		return junior;
	}

	public void setJunior(String junior) {
		this.junior = junior;
	}
}
