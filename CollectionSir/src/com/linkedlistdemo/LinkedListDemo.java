package com.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

LinkedList list=  new LinkedList<>();
		
    list.add(101);
    list.add(null);
    list.add(101);
    list.add("Nayan");
    list.add(null);
    
    System.out.println(list);
    list.addFirst(111);
    System.out.println(list);

	}

}
