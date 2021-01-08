package com.example.demo.h2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Exam {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String courseName;
	private String marks;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Exam [id=" + id + ", courseName=" + courseName + ", marks=" + marks + "]";
	}
	public Exam(long id, String courseName, String marks) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.marks = marks;
	}
	
	

}
