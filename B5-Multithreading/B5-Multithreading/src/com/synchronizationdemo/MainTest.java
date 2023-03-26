package com.synchronizationdemo;

public class MainTest {

	public static void main(String[] args) {

		AccountDetails accountDetails = new AccountDetails();
//		accountDetails.run();>>>>>>main is going to withdraw 1000
//		                           main has successfully withdrawn the amount and remaining balance is>>9000
		Thread thread1 = new Thread(accountDetails);///also watchout where the implements is given
		Thread thread2 = new Thread(accountDetails);
		
		
		thread1.setName("Vivek");
		thread2.setName("Pradip");
		
		thread2.start();
		thread1.start();
	
		
		
	}

}
