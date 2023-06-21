package com.demo.comparable;
//comparable is in lang package(comparator is in util package)
//comparable>>compareTo , comparator>>compare
public class Student implements Comparable<Student> {//if genrics not given>>orverides>>public int compareTo(Object s)
	private String name;
	private int roll;
	private int marks;
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

	@Override//sorting ascending based on roll(for descending inter-change +1,-1)
	public int compareTo(Student s) {// this is a standard format (ratta maar)
		if(roll ==s.roll) {
			return 0;
		}
		else if(roll>s.roll) {
			return 1;
		}
		else {
			return -1;
		}
	}
//	@Override////sorting ascending based on marks
//	public int compareTo(Student s) {
//		if(marks ==s.marks) {
//			return 0;
//		}
//		else if(marks>s.marks) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
	
	
	
//	@Override
//	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);
//		
//	}
	
	
//	@Override
//	public int compareTo(Student s) {
//		if(name ==s.name) {          
//			return 0;
//		}
//		else if(name>s.name) {//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
//			return 1;		  ////cannot use for String
//		}
//		else {
//			return -1;
//		}
//	}



}
