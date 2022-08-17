package com.model;

public class Student {
	private int studNo;
	private String studName;
	private int age;
	private float mark;

	public Student() {
		super();
	}

	public Student(int studNo, String studName, int age, float mark) {
		super();
		this.studNo = studNo;
		this.studName = studName;
		this.age = age;
		this.mark = mark;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

}
