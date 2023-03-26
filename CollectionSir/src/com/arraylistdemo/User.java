package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class User {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Nayan");
		list1.add("Priyay");
		list1.add("Mayur");
		list1.add("Sejal");
		list1.add("Kajal");
		list1.add("Pawan");
		list1.add("Yash");

		System.out.println("without sorting>>" +list1);
		
		Collections.sort(list1);
		System.out.println("After sorting>>" +list1);

	}

}
