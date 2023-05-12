package com.demo.predicate;

import java.util.function.Predicate;

public class PredicateExample2 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t>10) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		PredicateExample2 example2 = new PredicateExample2();
		System.out.println(example2.test(100));//true
	}

	
		
	
	
	

}
