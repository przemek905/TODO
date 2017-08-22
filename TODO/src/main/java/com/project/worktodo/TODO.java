package com.project.worktodo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TODO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;

	private boolean complete = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String text) {
		this.title = text;
	}

	public boolean getComplete() {
		return complete;
	}

	public void setComplete(boolean isCompleted) {
		this.complete = isCompleted;
	}

}
