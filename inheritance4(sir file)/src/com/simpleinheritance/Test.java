package com.simpleinheritance;

public class Test {

	public static void main(String[] args) {

		// scenario 1
		
		 /* SBIBank sbiBank = new SBIBank();
		  System.out.println(sbiBank.x); //20
		  System.out.println(sbiBank.y); //40 
		  System.out.println(sbiBank.z); //50
		  
		  sbiBank.m1();//
		  sbiBank.m2();//SBI 
		  sbiBank.m3();
		 */

		// scenario 2

	/*	
		  RBIBank rbiBank = new RBIBank();
		  System.out.println(rbiBank.x);
		  System.out.println(rbiBank.y); //30 
		  // System.out.println(rbiBank.z);
		 
		 rbiBank.m1();
		 rbiBank.m2(); //RBI 
		 //rbiBank.m3();
		 
		 */

		// Scenario 3

		
	/*	  RBIBank rbiBank = new SBIBank();
		  
		  System.out.println(rbiBank.x);
		  System.out.println(rbiBank.y); //30 
		  //System.out.println(rbiBank.z);
		  
		  rbiBank.m1(); 
		  rbiBank.m2(); 
		  // rbiBank.m3();
		 */

		// scneraio -4

	/*	RBIBank rbiBank = new RBIBank();
		SBIBank sbiBank = new SBIBank();
		rbiBank = sbiBank; 
		// sbiBank = new SBIBank(); 
		//rbiBank = new SBIBank();

		System.out.println(rbiBank.x);
		System.out.println(rbiBank.y); // 30
		// System.out.println(rbiBank.z);

		rbiBank.m1();
		rbiBank.m2();
		//rbiBank.m3();*/
		
		// scneraio -5
		
		/*  int id=101;
		  Short s = (short)id;  //type casting -->narrowing
		  
		  int i =111;
		  long l =i; //type casting -->widening
		
		RBIBank rbiBank = new SBIBank();
		SBIBank sbiBank= new SBIBank();
		sbiBank= (SBIBank)rbiBank; //new SBIBank();  //type casting -->narrowing
		
		 System.out.println(sbiBank.x);
		 System.out.println(sbiBank.y); //40
		 System.out.println(sbiBank.z);
		 
		 sbiBank.m1();
		 sbiBank.m3();
		 sbiBank.m2();
		 */
		 
		

	}

}
