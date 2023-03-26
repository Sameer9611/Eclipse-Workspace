package com.overloading;
// cohirent data types used in overriding
public class User {

	void test(X x) { //"X Y,Z is datatype here(coherient) or same is condition
		System.out.println("X class");
	}

	void test(Y y) {
		System.out.println("Y class");
	}

	void test(Z z) {
		System.out.println("Z class");
	}

}
