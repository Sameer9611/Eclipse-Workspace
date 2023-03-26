package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountryMap {
	public static void main(String[] args) {
		ArrayList<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Mumbai");
		Maharashtra.add("Pune");
		Maharashtra.add("Nagpur");
		ArrayList<String> Karnataka = new ArrayList<String>();
		Karnataka.add("Bangalore");
		Karnataka.add("Mysore");
		ArrayList<String> MadhyaPradesh = new ArrayList<String>();
		MadhyaPradesh.add("Bhopal");
		MadhyaPradesh.add("Indore");
		
		HashMap<String, ArrayList<String>> states = new HashMap<String, ArrayList<String>>();
		states.put("Maharashtra", Maharashtra);
		states.put("Karnataka", Karnataka);
		states.put("Madhya Pradesh", MadhyaPradesh);
		System.out.println(states);//{Karnataka=[Bangalore, Mysore], Madhya Pradesh=[Bhopal, Indore], Maharashtra=[Mumbai, Pune, Nagpur]}
								   //as we can see India is not printed
		
		System.out.println("------------------------------------------------------------------------");
		
		HashMap<String, HashMap<String, ArrayList<String>>> India = new HashMap<String, HashMap<String, ArrayList<String>>>();
		India.put("India",states );
		System.out.println(India);
		
		System.out.println("------------------------------------------------------------------------");

		
		Set<String> keys =India.keySet();
		for(String s:keys) {
			System.out.println(s);
			System.out.println(India.get(s));
		}
		

	}

}
