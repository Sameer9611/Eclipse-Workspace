package com.singleton;

public class Run{
	public static void main(String[] args) {
		Singleton singleton1 =Singleton.getInstance();
		System.out.println(singleton1.hashCode());//2018699554
		
		Singleton singleton2 =Singleton.getInstance();
		System.out.println(singleton2.hashCode());//2018699554
		
		
		
		
		
	}

}
