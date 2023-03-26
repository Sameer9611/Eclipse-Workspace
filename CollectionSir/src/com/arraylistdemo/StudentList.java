package com.arraylistdemo;

import java.util.ArrayList;

public class StudentList {
	
	public static ArrayList<Student>  getStudentList() {
		
		
		ArrayList<Student> list=  new ArrayList<>();
		list.add(new Student(101, "Vivek", 16));
		list.add(new Student(107, "Akash", 15));
		list.add(new Student(103, "Ankush", 17));
		list.add(new Student(104, "Nayan", 13));
		
		return list;
	}
	

	public static void main(String[] args) {
         getStudentList();
		
	}

}
