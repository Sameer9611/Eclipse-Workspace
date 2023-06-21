package com.treesetdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet set = new TreeSet<>();
		
		set.add("Nayan");
		set.add("Pranav");
		set.add("Sejal");
		set.add("Akash");
		set.add("Abhik");
		set.add("Sejal");
		set.add("Kiran");		
		System.out.println(set);//[Abhik, Akash, Kiran, Nayan, Pranav, Sejal]

		 
		
		Set<Integer> set1=  new TreeSet();
	     set1.add(10);
	     set1.add(40);
	     set1.add(30);
	     set1.add(50);
	     set1.add(70);
	     set1.add(20);
	     set1.add(80);
	  
	  System.out.println(set1);//[10, 20, 30, 40, 50, 70, 80]

	  
	  
	}
}
