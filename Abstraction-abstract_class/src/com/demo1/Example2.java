package com.demo1;

public abstract class Example2 { // by if method is abstract then bound to have abstract class,else error
	public String name;//  can have any type of variables(declare/initialize/private/static/public)                     
	static int a;
	public int b=6;
	//private int b; not accessible outside, use setter getter here and acces them
	
public Example2(){ // even though there is no object still constructors can be made cause global variables are not final
		
	}

	public void m1() {
		System.out.println("This is a concrete method");
		// general or concrete method 
	}
	public abstract void m2();   // abstract method: never has a body(else error)
	public abstract void m3(); 
	
	protected void variables() {
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		//Example2 e2 =new Example2();//cannot create objects of abstract class only be inherited

	}
}
	
	
