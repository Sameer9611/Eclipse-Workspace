package com.demo1;
                            // extends Example1,Example2 ie. multiple inheritance is not supported here
public abstract class Test extends Example2{// error until we provide implementation to inherited abstract method 
                                 //implementation is nothing but having a body to a method
	@Override
	public void m2() {  
		System.out.println("Abstract method(m2) got implemented in child class of  parent Example2 abstract class");
		
	}
// will not show error even if m3 method id not here cause we made this class(Test) abstract
// as now object cannot be created as it is abstract we extend this class to another non abstract class
// and override m3 method there
	

}
