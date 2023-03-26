package com.demo;
public class Test {
	public static Student getStudentObj() { 
		Student s = new Student(123,"sam");// object of other class can be created in this class
		example(s);// we can also provide object as argument 
		return s;
	}
	
	public static Student getStudentObj1() {
		int x =321; // if we return String x = "sam" will give error as no such constructor exists.
		return new Student(x);//calls constuctor fro Student reprints: roll 321 name :null
		                      // works same as line 4
		                      
	}

	
	public static void example(Student x) {// datatype of object is Student
		//just example
	}
	public static void main(String[] args) {
		Student s =getStudentObj();
		System.out.println(s);//Student [rollNo=123, name=sam] // tostring is present where actual variables are present
		Student s1 =getStudentObj1();//Student[rollNo=321,name=null]
		System.out.println(s1);
	}
	
	
}
	
