package com.demo;

public  class Orange extends Fruit{
   
	String colour="orange";
	String taste= "sour sweet"; // if we make it final, or private error occurs in child class
	boolean isfruit=true;
	String shape="round";
	boolean isseedless=false;
	public static void main(String[] args) {
		Orange orange = new Orange();
		System.out.println(orange.colour);
		System.out.println(orange.taste);
		System.out.println(orange.shape);
		System.out.println(orange.isfruit);
		System.out.println(orange.isseedless);
	}

}
