package com.demo;

public class User2 {
	public static void m1() {
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		int i = 10/0;//java.lang.ArithmeticException: / by zero
					 //at com.demo.User.m1(User.java:9)
		             //at com.demo.User.main(User.java:16)
		
		// the above info printed by default exception handler : it does not handles >> just prints
		
		System.out.println("Fourth Line");//does not reach here as it never reverts back
	}
	public static void main(String[] args) {
		try{m1(); // this handles the exception but does not go back to fourth line
		}         // series of checking for handler>> mistake method>> callermethods>> main method
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handle hou na hou ha finally block code run honar");// cleanup code//closing resource
		}
	}

}
