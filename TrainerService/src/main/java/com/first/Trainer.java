package com.first;

import java.util.List;

public class Trainer {

	private int id;
	private String name;
	private String skills;
	private List<Student> students;
	
	
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int id, String name, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}
	public Trainer(int id, String name, String skills, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
