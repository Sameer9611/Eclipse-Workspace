package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	/*	ArrayList arrayList = new ArrayList<>(); //<> generic
		arrayList.add(10);
		arrayList.add("Nayan");
		arrayList.add(101);
		arrayList.add("Sejal");
		arrayList.add(null);
		arrayList.add('c');
		arrayList.add("Nayan");
		arrayList.add(null);
		arrayList.add(null);*/
		
		/*System.out.println(arrayList.get(3));
		System.out.println(arrayList.size());
		System.out.println(arrayList.contains("Sejal"));
		*/
		
		//1st way
		/*Iterator itr=arrayList.iterator();
		while(itr.hasNext()) {
		//	System.out.println(itr.next());
		}*/
		
		//2nd way
		
	/*	for(Object o: arrayList) {
			System.out.println(o);
		}*/
		
		//3rd way
		
	//arrayList.forEach((i)->System.out.println(i));	
		
		
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(15);
		arrayList.add(30);
		arrayList.add(35);
		arrayList.add(29);
		arrayList.add(17);
		
		
		/*Iterator<Integer> itr=arrayList.iterator();
		
		while(itr.hasNext()) {
			int i=itr.next();
			if(i%2==0) {
				System.out.println("Even no>>" +i);
			}
			else {
				System.out.println("Odd no>>" +i);
			}
			
		}*/
		
		for(Integer i :arrayList ) {
			
			if(i%2==0) {
				System.out.println("Even no>>" +i);
			}
			else {
				System.out.println("Odd no>>" +i);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		/*List list = new Vector(); //loosly coupled
		 list.add(10);
		 list.add(20);
		 list.add(300);
		
		
		ArrayList al = new ArrayList<>(); //tightly coupled
		*/

	}

}
