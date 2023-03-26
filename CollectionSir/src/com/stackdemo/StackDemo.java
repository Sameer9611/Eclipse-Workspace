package com.stackdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack stack = new Stack<>();
		stack.push("Jeans");
		stack.push("Shirts");
		stack.push("T-Shirts");
		stack.push("joggers");
		stack.push("Towels");

		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("HandTowels"));
	}

}
