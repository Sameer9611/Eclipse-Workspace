package com.demo.functions;

import java.util.function.Function;

public class FunctionalDemo2 {

	public static void main(String[] args) {
		
		//how i created object of interface even though, it is illegal
		Function<String, Integer> function1 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return t.length();//i have changed body
			}
		};
		System.out.println(function1.apply("Sameer"));//6
		
		System.out.println("****************************************************");
		
		Function<String, Integer> function2= x->(x.length());//x is 1st argument and body is the returning argurment it automatically identifies that.
		System.out.println(function2.apply("Sameerg"));//7
	}

}
