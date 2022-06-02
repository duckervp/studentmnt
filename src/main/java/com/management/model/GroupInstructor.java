package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class GroupInstructor extends Object {

	private Teacher instructor;
	private ProjectGroup group;
	
	public GroupInstructor() {
		super();
	}

	public GroupInstructor(Long id, String code, Timestamp createdTime, Timestamp updatedTime) {
		super(id, code, createdTime, updatedTime);
	}

	public Teacher getInstructor() {
		return instructor;
	}

	public void setInstructor(Teacher instructor) {
		this.instructor = instructor;
	}

	public ProjectGroup getGroup() {
		return group;
	}

	public void setGroup(ProjectGroup group) {
		this.group = group;
	}
	
}
