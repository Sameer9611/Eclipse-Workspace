package com.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

		set.add(12);
		set.add(40);
		set.add(30);
		set.add(10);
		set.add(50);
		set.add(30);//returns false if printed no error if duplicated added >just dont get added
		set.add(78);
		set.add(12);
		set.add(null);//onenull allowed as further acts as duplicates
		set.add(null);
		System.out.println(set);//[null, 50, 40, 10, 12, 30, 78]

		
		
		 Iterator<Integer> itr=set.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
		for(Integer i :set) {
			
		}
		 
		
		
		Set<String> set1 =  new HashSet();
		
		
		
		HashSet set2 = new HashSet<>(20, 0.80f);
		
		
		
		
	}

}
