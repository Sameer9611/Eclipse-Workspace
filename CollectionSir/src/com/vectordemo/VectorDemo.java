package com.vectordemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
       
		Vector v = new Vector<>();
		
		
		for(int i=1 ;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		v.add(11);
		System.out.println(v);
		System.out.println(v.capacity());
		
	}

}
