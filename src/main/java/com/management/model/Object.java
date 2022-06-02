package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Object {
	private Long id;
	private String code;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	
	public Object() {
	}

	public Object(Long id) {
		this.id = id;
	}

	public Object(Long id, String code, Timestamp createdTime, Timestamp updatedTime) {
		this.id = id;
		this.code = code;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}
}
