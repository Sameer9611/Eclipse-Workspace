package com.demo.functionalinterface;

public class Features implements FunctInterface{
	public static void main(String[] args) {
		FunctInterface functInterface = new Features();//loosely coupled
		functInterface.getSub(2, 4);
		functInterface.getSum(4, 6);
		//default and abstract method needs objects of implementing class to call
		//object of interface can never be created as it is not supported
		
		
		//static method can only be called direclty
		FunctInterface.getMulti(3, 5);

}

	@Override//for lambda example return type taken int,else void would have worked
	public int getSum(int a, int b) {
		
		int sum=a+b;
		System.out.println("(overidden abstract method class body)sum is >>"+(sum));		
		return sum;//just to satisfy condtion
	}

	
}
