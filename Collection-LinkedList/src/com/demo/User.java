package com.demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class User {
	//Iterable(I)>Collection(I)>List(I)>AbstractList(C)>AbstractSequentialList(C)>LinkedList(C)
	//insertion order preserved//duplicates allowed//null n no of times allowed
	//duplicates allowed
	//duplicates allowed//also implements Serializable,clonable,(no random access)>>hence worst choice for retrival
	//but best choice for insertion and delete at certain index(due linked nature)cause--->DS(datastructure)--double LinkedList
	//no default size in linkedlist(uses node)
	public static void main(String[] args) {
		LinkedList list1=new LinkedList<>();//raw type hnce hetrogenous>>cannot input size >>error
		list1.add("sam");
		list1.add("34");
		list1.add(null);
		list1.add("Jack");
		list1.add(0.5);
		System.out.println(list1);//[sam, 34, null, Jack, 0.5]

		list1.remove(2);
		System.out.println(list1);//[sam, 34, Jack, 0.5]
		
		list1.addFirst("john");//adds at first index>>and shifts other>>this method is present only present in LinkedList 
		System.out.println(list1);//[john, sam, 34, Jack, 0.5]

		list1.addLast(45);//add at last
		System.out.println(list1);//[john, sam, 34, Jack, 0.5, 45]

//		void addFirst(Object o);
//		void addLast(Object o);
//		getFirst();
//		getLast ();
//		removeFirst();
//		removeLast();
		ArrayList<String> list2= new ArrayList<>();
		list2.add("sachin");
		list2.add("dhoni");
		list2.add("john");
		list2.add("shreyas");
		
		//can add linkedlist to arrayList and viceversa(even tho data type is different)
		list2.addAll(list1);
		System.out.println(list2);//[sachin, dhoni, john, shreyas, john, sam, 34, Jack, 0.5, 45]
		list1.addAll(list2);
		System.out.println(list1);//[john, sam, 34, Jack, 0.5, 45, sachin, dhoni, john, shreyas, john, sam, 34, Jack, 0.5, 45]

	
	}
	
	

}
