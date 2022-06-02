package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Major extends Object {
	private String name;
	private String phone;
	
	public Major() {
	}

	public Major(Long id) {
		super(id);
	}

	public Major(Long id, String code, Timestamp createdTime, Timestamp updatedTime, String name, String phone) {
		super(id, code, createdTime, updatedTime);
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
