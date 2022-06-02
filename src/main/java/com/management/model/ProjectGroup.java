package com.management.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class ProjectGroup extends Object {
	private Topic topic;
	
	public ProjectGroup() {
	}
	
	public ProjectGroup(Long id, String code, Timestamp createdTime, Timestamp updatedTime) {
		super(id, code, createdTime, updatedTime);
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
