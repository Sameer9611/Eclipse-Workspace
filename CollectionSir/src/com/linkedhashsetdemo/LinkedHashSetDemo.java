package com.linkedhashsetdemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		//insertion order reserved>>duplicated not allowed
		LinkedHashSet<String>  set = new LinkedHashSet<>();
		set.add("Nayan");
		set.add("Pranav");
		set.add("Sejal");
		set.add("Akash");
		set.add("Abhik");
		set.add("Sejal");
		set.add("Kiran");
		set.add(null);
		set.add(null);
		
		System.out.println(set);//[Nayan, Pranav, Sejal, Akash, Abhik, Kiran, null]

	}

}
