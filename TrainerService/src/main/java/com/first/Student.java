package com.first;

public class Student {

	private int id;
	private int roll;
	private String name;
	private int fees;
	private int tid;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public Student(int roll, String name, int fees, int tid) {
		super();
		this.roll = roll;
		this.name = name;
		this.fees = fees;
		this.tid = tid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
