package com.demo1;
//similar type data can be collected and stored at one place
//indexwise//

public class User {
	public static void main(String[] args) {
	
// as we dont have any methods like .add() etc to add elements we have to directly change to in the origin hence fixed size	
	int[] marks =new int[5];//method:1>>we  have to tell no of elements in array else error
	marks[0]=1;
	marks[1]=12;
	marks[2]=13;
	marks[2]=14;//>>canoverride values
	marks[3]=13;//can have duplicates>insertion order is preserved
	//marks[4]=19; >>if commentout marks[4] will give it default value of int=0
	//marks[5]=1; // gives array out of bond//unchecked Exception
	int[] marks1 = {10,29,20,28,823};//method 2>>entered 5 data>>sets length to 5
	System.out.println(marks1);//[I@4e25154f>>have to print by iterating cannot print directly
	
	System.out.println(marks1.length);//5>>length of array
//	arrayname.length vs Stringname.length() vs ArrayListname.size()

	
	
	System.out.println(marks1[2]);//String:System.out.println(name.charAt(4));
	System.out.println("------------------------------------------------------");
		for (int i : marks1) {  // for:each loop itterates arrays(int i cause mark has int as datatype)
		System.out.println(i);
		}
	System.out.println("---------------------------------------------------");
	//possible
	User u1 = new User();
	User u2 = new User();
	User u3 = new User();
	User[] objs= {u1,u2,u3};
	System.out.println(objs);
		
	String[]name= {"sam","pramod"};
	System.out.println(name[0]);
	System.out.println(name);
	
	}
	
	
}

//declare

//1.Data_type[] array_name
//2.Data_type []array_name
//3.Data_type array_name[]
