package com.demo.functionalinterface;

public abstract class LambdaFeatures {
	
	public static void main(String[] args) {
		
	/*first we code the what operation want to conduct on arguments(ie. similar to providing body to by overriding,
	 * then we pass the arguments values*
	 * note:That method must have a return type(void not allowed)cause here we are not overriding and providing body hence to use that method for some output it must have a return type*/
		
		
	//only storing in interface, object of interface is not created (not allowed)	
	FunctInterface functInterface =(a,b)->(a+b);//also what if i hade multiple abstract method with 2 arguments of ints, but this will not happen cause Functional interface has only one abstract method
	System.out.println(functInterface.getSum(6, 7));
	//This lambda expression only works with functional Interface's method(in general , there are exceptions)
	
	

	
	
	
	
	
	
	
	}
	

}
