package com.demo;
// Exception:abnormalcondition that disturbs entire flow of code
// Exception handling: objective:to normally terminate program(even if abnormality still exists)
public class User {
	
	public static void m1()  {
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		int i = 10/0;//throws can never be fetched (but can used) here cause this is runtime exception
		//java.lang.ArithmeticException: / by zero
		//at com.demo.User.m1(User.java:9)
		//at com.demo.User.main(User.java:16)
		
		// the above info printed by default exception handler : it does not handles >> just prints
		
		System.out.println("Fourth Line");//does not reach here if exception not handled
	}
	public static void main(String[] args) {
		m1();
	}
}
