package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Topic extends Object {
	private String name;
	private String description;
	
	public Topic() {
	}
	
	public Topic(Long id, String code, String name, String description, Timestamp createdTime, Timestamp updatedTime) {
		super(id, code, createdTime, updatedTime);
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
