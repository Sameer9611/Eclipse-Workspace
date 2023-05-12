package com.demo.functionalinterface;

@FunctionalInterface//now exactly only one abstract method is allowed else error
public interface FunctInterface {
	//till it has only 1 abstract interface,even without annotation, it acts as a functional interface
	public int getSum(int a,int b);

	//It can have any number of default,static methods but can contain only one abstract method
	//note: these are not access specifiers
	
	default void getSub(int a , int b) {
		System.out.println("(default method body from interface)substraction is>>"+(a-b));
	}
	
	static void getMulti(int a , int b) {
		System.out.println("(static method body from interface)Multiplication is>>"+(a*b));
	}
}
