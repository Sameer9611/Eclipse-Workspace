package com.demo.predicate;

import java.util.function.Predicate;

public class PredicateExamples {
	 
	 public static void main(String[] args) {
		 
		//how can i create a object of an interface here which is illegial>>anynomous class comes in picture>>java creates a anynomus class implements that to Predicate, overrides the method and creates object of that anynomous class
		 //that is equivalent to predicateExample2.java
		Predicate<Integer> p1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t>10) {
					return true;
				}
				else {
					return false;
				}
			}
		};
	
		System.out.println(p1.test(9));//false
	
	System.out.println("***************************************");		 
	//as predicate is a functional interface lambda expression can be used
	//automatically catches the one agrument present in one abstract method ,by lambda expression we provide a body logic to that test method with return as true 
	Predicate<Integer> p2 = x->(x>10);//true condition else false
	System.out.println(p2.test(100));//true
	System.out.println(p2.test(7));//false

		
	
	};
		 
		 
	
		 
}
