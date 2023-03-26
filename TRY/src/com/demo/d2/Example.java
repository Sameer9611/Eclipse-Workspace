package com.demo.d2;

public class Example {
	

	public void m1(Object object) {
		System.out.println("in object object");
	}
	public void m1(Character object) {
	System.out.println("in String object");
	}
	public static void main(String[] args) {
		Example ex = new Example();
		ex.m1(null);
	}

}
