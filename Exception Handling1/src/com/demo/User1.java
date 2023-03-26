package com.demo;



public class User1 {
	
	public static void m1()  {
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		try{
			int i = 10/0;
			System.out.println("in try");//does not revert back
		}
		
		catch(Exception e){// Exception cha object provide krycha
			System.out.println(e); // commentout this and see result ;alternate code or solution
			// if we dont print 'e' we never get to see the exception code just ends normally
			//return;//>>check > even if we return m1() still finally gets reached;but 4th line not reached; but if we had multiple catch: they will not reach
		} 
		
		//System.out.println("middle of catch and finally"); >> error 
		finally {
			System.out.println("finally");
		}
		System.out.println("Fourth Line");//gets printed:as exception got handled
	}
	public static void main(String[] args) {
		m1();
	}


}
