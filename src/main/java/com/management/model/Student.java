package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {
	private Timestamp dob;
	private Float score;
	
	public Student() {
	}
	
	public Student(Long id, String code, String name, Timestamp dob, Float score, Timestamp createdTime,
			Timestamp updatedTime) {
		super(id, code, createdTime, updatedTime, name);
		this.dob = dob;
		this.score = score;
	}

	public Timestamp getDob() {
		return dob;
	}

	public void setDob(Timestamp dob) {
		this.dob = dob;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}
	
}
