package com.woletrs.AnnotationConfigApplicationContext.pojos;

public class Student {

	private int id;
	private String name;

	public Student() {
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {

		return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

}
