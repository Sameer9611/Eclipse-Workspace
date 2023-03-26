package com.demo1;

public class Test2 extends Test {
	@Override
	public void m3() {
		System.out.println("m3 method overrided here");
		
	}
	public static void main(String[] args) {
		Test2 test2 = new Test2();// can also be Example2 ex2 =new Test(); reference become parent and stores there		
		test2.m2();
		//Example2 example2 =new Example2(); // object cannot be created of abstract class
		test2.m1(); // have to call this method via child class test only
		test2.name="sameer";
		Test2.a=5; //inherited by test(static) or can use Example2.a =5;
		// can print them now 
		test2.variables();
	}


	

}
