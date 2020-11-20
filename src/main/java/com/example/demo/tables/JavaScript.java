package com.example.demo.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="javascript")
public class JavaScript {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int question_id;
	private String question_name;
	private String question_answer;
	
	
	
	public JavaScript() {

	}

	public JavaScript(int question_id, String question_name, String question_answer) {
		super();
		this.question_id = question_id;
		this.question_name = question_name;
		this.question_answer = question_answer;
	}

	public String getQuestion_answer() {
		return question_answer;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public String getQuestion_name() {
		return question_name;
	}

	public void setQuestion_answer(String question_answer) {
		this.question_answer = question_answer;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public void setQuestion_name(String question_name) {
		this.question_name = question_name;
	}

}
