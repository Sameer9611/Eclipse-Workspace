package com.demo.comparator;

public class Student {
	String name;
	int roll;
	int marks;
	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}

//	@Override
//	public int compare(Student o1, Student o2) {//here have 2 arguments
//		return o1.name.compareTo(o2.name);
//	}
//dont impelemnt comparator here>>dont override here>>create a new class
}
