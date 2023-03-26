package com.demo;

public class Student {
	int rollNo;
	String name;
	public Student(int rollNo, String name) {// constructor
		//super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public Student(int rollNo) {// constructor
		//super();
		this.rollNo = rollNo;
		
	}
	
	public static Student  getStudentObj() { // returntype is Student(class name)  ie. it wants to return object of this class
		Student s = new Student(101,"sam");// can also call another constructor with single argument
		return s;// every time i can call this method and get a readymade object
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";// how rollNo is directly avaliable here dont know
	}

	public static void main(String[] args) {
		//s1=getStudent(); // method output of getStudent is stored in s1
		                   //this will give error; need a data type for s1 hence
		Student s1 = getStudentObj();// s or s1 would work ; get the same object again and again
		//System.out.println(s1);//com.demo.Student@7852e922(before tostring)
		System.out.println(s1);//Student [rollNo=101, name=sam]
	} 

}
