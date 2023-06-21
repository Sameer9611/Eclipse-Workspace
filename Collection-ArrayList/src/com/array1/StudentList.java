//Example of storing Objects in ArrayList


package com.array1;

import java.util.ArrayList;

public class StudentList {
	
	public ArrayList<Student> getStudentList(){//this shows we can returun a arraylist also
		//it expects the object of ArrayList<Student>
		ArrayList<Student> mylist = new ArrayList<>();
		Student s = new Student("sam",21,50);
		mylist.add(s);
		mylist.add(new Student("ajay",22,60));
		mylist.add(new Student("sanjay",23,70));
		return mylist;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new StudentList().getStudentList());//before toString at fields//[com.array1.Student@7852e922, com.array1.Student@4e25154f, com.array1.Student@70dea4e]
		
		//After toString//[Student [name=sam, roll=21, marks=50], Student [name=ajay, roll=22, marks=60], Student [name=sanjay, roll=23, marks=70]]

		
	}

}
