package com.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	public ArrayList<Student> getStudentList(){//this shows we can returun a arraylist also
		//it expects the object of ArrayList<Student>
		ArrayList<Student> list = new ArrayList<>();
		Student s = new Student("sam",21,50);
		list.add(new Student("ajay",2,60));
		list.add(new Student("sanjay",23,70));
		//Collections.sort(list, new RollComparator());//this gives error cannot sort>>1)comparable 2)comparator
		Collections.sort(list, new nameComparator());
		return list;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(new StudentList().getStudentList());//before toString at fields//[com.array1.Student@7852e922, com.array1.Student@4e25154f, com.array1.Student@70dea4e]
		
		//After toString//[Student [name=sam, roll=21, marks=50], Student [name=ajay, roll=22, marks=60], Student [name=sanjay, roll=23, marks=70]]

		
	}

}
