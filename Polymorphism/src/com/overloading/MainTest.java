package com.overloading;

public class MainTest {

	public static void main(String[] args) {

		User user = new User();

		X x = new X();
		Y y = new Y();
		Z z = new Z();
		
	    user.test(x); // X class
		user.test(y); //Y class
		user.test(z); //Z class

		
		X x1 = new Y();
		Y y1 = new Z();
		X x2 = new Y();
		
		
		user.test(x1); //X class
		user.test(y1); //Y class   no effect of object (reference decides (chap polymorphism page :5)
		user.test(x2);// X class
		
		
		
		
	}

}
