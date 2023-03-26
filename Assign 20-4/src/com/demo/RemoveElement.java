package com.demo;

import java.util.ArrayList;

public class RemoveElement {
	
	public static void main(String[] args) {
		ArrayList<String> city =new ArrayList<String>();
		city.add("Mumbai");
		city.add("Pune");
		city.add("Bangalore");
		city.add("Hydrabad");
		city.add("Mumbai");
		System.out.println(city);//[mumbai, pune, Bangalore, Hydrabad, Mumbai]
		
		for(int i=0;i<city.size();i++) {
		city.remove("Mumbai");//removes first occuring>>hence loop
		}
		System.out.println(city);//[Pune, Bangalore, Hydrabad]
	}

}
