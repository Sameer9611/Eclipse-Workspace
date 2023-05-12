package com.demo.functions;

import java.util.function.Function;

public class FunctionDemo implements Function<String, Integer> {
	
	//simlar to Predicate>>but here can return anything>>ie body can be be returning any thing boalean or int or string
	@Override
	public Integer apply(String t) {
		return t.length();
	}
	
	
	public static void main(String[] args) {
		FunctionDemo demo = new FunctionDemo();
		
		System.out.println(demo.apply("sam"));//3	
	}

	

}
