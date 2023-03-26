package com.demo;

public class Grapes extends Fruit {//making of child class
	String colour="green";
	String taste= "sour"; // if we make it final, or private error occurs in child class
	boolean isfruit=true;
	String shape="oval";
	boolean isseedless=true;

	public static void main(String[] args) {
		
		Grapes grapes = new Grapes();
		System.out.println(grapes.colour);
		System.out.println(grapes.taste);
		System.out.println(grapes.shape);
		System.out.println(grapes.isseedless);
		System.out.println(grapes.isfruit);
		}
}
