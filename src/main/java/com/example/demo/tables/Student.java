package com.example.demo.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	private String fname;
	private String lname;
	@Id
	private String email_id;
	private String college;

	public Student() {

	}

	public Student(String fname, String lname, String email_id, String college) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email_id = email_id;
		this.college = college;
	}

	public String getCollege() {
		return college;
	}

	public String getEmail_id() {
		return email_id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
