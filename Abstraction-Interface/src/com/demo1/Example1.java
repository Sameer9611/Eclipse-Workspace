package com.demo1;// generally projects starts with interface

// single interface can be implemented in multiple class also
// and print them seperately with different body of each class
public interface Example1 {// interface is like a class but not class
	/* every variable: is public static final by automation(can't see that)
	 * also as it is final cannot change values later, 
	 * hence cannot leave by just declaring; have to instantiate*/
	int a=5;//(public static final )
	//int b;-----> error :final has to be initialized
	
	 /*every method: in interface is public abstract hence called 100% abstraction(all useless)
	  * (from 1.8 version:default and static methods are allowed ie can have body ie. backward compability)
	  * (from 1.9 version: private allowed)
	 *hence, every interface needs least one implementation class to give body to abstract methods
	 *ie. no object creation possible(abstract class :no)*/
	void getData1();//(same as :"public abstract" by automation:cannot give body )
	void getData2();//(abstract only)
	public abstract void getData3();
	
	
	static void getData4() {
		System.out.println("1.8 feature: Default static method");
		//1.8: static can have body
	}
	
     // cannot have a constructor(abstract class:yes)
     // Example1(){
	     //---->error, cause global variables are already final
     // }
	
     
}
