package com.demo1;

public abstract class UserEmpl implements Example1,Example2{// gives error until implementing unimplemented methods in Example1

	@Override
	public void getData1() {
		System.out.println("getData1 method");
		
	}

	@Override
	public void getData2() {
		System.out.println("getData2 method");
		
	}
    //if we comment out this implementation, error will occur as all implementation are not done
	// so to data3 can be implemented in new class by making this class abstract
	// and making object of that class and called all methods as all gets inherited to last

	public void getData5() {
		System.out.println("getData5 method from another interface by multiple iheritanace");
		//no ambiquity cause no body, while multiple inheritance in other cases creates ambiquity
	}
	
	@Override
	public void getData3() {
		System.out.println("getData3* method");
		
	}
	

}
