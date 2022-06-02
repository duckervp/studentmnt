package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Person extends Object {
	private String name;

	private Long majorId;

	private Major major;
	
	public Person() {
	}

	public Person(Long id) {
		super(id);
	}

	public Person(Long id, String code, Timestamp createdTime, Timestamp updatedTime, String name) {
		super(id, code, createdTime, updatedTime);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Long getMajorId() {
		return majorId;
	}

	public void setMajorId(Long majorId) {
		this.majorId = majorId;
	}
}
