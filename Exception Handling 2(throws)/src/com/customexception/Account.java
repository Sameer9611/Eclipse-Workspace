//step2
package com.customexception;
// seperate class for validation
public class Account {
	private int balance= 20000;
	
	public int getBalance() {
		return this.balance;
	}
	public void withdrawal(int amount)  {
		if(amount>balance) {
			throw new InsufficientFund("you dont have sufficient balance");// throw new object of insufficientfund with argument// this object calls constructor(with string as parameter)
			//Exception in thread "main" com.customexception.InsufficientFund: you dont have sufficient balance
			//string is a custom Exception we have created
		}
		else {
			balance = balance -amount;
			System.out.println("balance remaining is "+balance);
		}
	}
	public static void main(String[] args)  {
		new Account().withdrawal(21000);//object of account//no parent call default constructor and keeps quiet
	}

}
// com.customexception.InsufficientFund: you dont have sufficient balance
//  (this is excpetion)                 :     (this is reason)

//                           compare

//java.lang.ArithmeticException: / by zero
//   (this is exception)       :   (reason)