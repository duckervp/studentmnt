package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Teacher extends Person {
	
	public Teacher() {
		
	}

	public Teacher(Long id) {
		super(id);
	}

	public Teacher(Long id, String code, Timestamp createdTime, Timestamp updatedTime, String name) {
		super(id, code, createdTime, updatedTime, name);
	}
	
}
