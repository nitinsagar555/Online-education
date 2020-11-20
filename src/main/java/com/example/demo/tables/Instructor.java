package com.example.demo.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {

	@Id
	private String email_id;
	private String fname;
	private String lname;
	private String gender;
	private String qualification;
	private String field_experiance;
	private String contact;

	public Instructor() {

	}

	public Instructor(String email_id, String fname, String lname, String gender, String qualification,
			String field_experiance, String contact) {
		super();
		this.email_id = email_id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.qualification = qualification;
		this.field_experiance = field_experiance;
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}

	public String getEmail_id() {
		return email_id;
	}

	public String getField_experiance() {
		return field_experiance;
	}

	public String getFname() {
		return fname;
	}

	public String getGender() {
		return gender;
	}

	public String getLname() {
		return lname;
	}

	public String getQualification() {
		return qualification;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void setField_experiance(String field_experiance) {
		this.field_experiance = field_experiance;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}
