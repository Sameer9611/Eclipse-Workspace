package com.demo1;

public class Test {
	public static void main(String[] args) {
		// can use : UserEmpl u1 = new UserEmpl(); same output as both are same only
		           //or
		Example1 u1 = new UserEmpl2(); // Example1 u1 = new Example1: not possile as object cannot created be of interface
		System.out.println(Example1.a);
		u1.getData1();
		u1.getData2();
		u1.getData3();
		Example1.getData4();
		//u1.getData5();
	}

}
//can try all these:
/*interface can extend interface1 andinterface2
Interface can extends interface
Interface can extends the multiple interface
class extends class implements interface
class implements interface
class extends class implements interface1 and interface2
*/