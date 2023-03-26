package com.synchronizationdemo;

public class AccountDetails implements Runnable {

	Account account = new Account();

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			withdrawal(1000);

			if (account.getBalance() <= 0) {
				System.out.println("Sorry, Your account is withdrawn and balance is 0");
			}
		}

	}

	public synchronized void withdrawal(int amount) {
//			synchronized(AccountDetails.class) {//watchout spelling:synchronized
//					>>>this is a not static block
//					>>>can be used to have some part to be synchronized instead of method
				
//			}
		
	
			if (account.getBalance() > amount) {
				System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);

			}
//if we dont sleep then first vivek will remove 5k then pradik will remove 5k then balance becomes 0
//but as method is small when 1st thread is called it gets executed before 2 nd thread gets called:so to mock the delay we use sleep:and then they interfere with eachother(check by removing snychronized
//but synchronized avoid this
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int remainingBalance = account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()//so this is bit new currentThread()
					+ " has successfully withdrawn the amount and remaining balance is>>" + remainingBalance);
		
		
		
		
	}

}
