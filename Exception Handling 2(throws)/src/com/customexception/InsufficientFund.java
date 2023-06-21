//step 1
package com.customexception;//RuntimeException present in java.lang hence directly availiable , no need to import

public class InsufficientFund extends RuntimeException{//always prefer unchecked exception //if checked exception taken :it tells to handle the exception 'throw' by trycatch to avoid this 
	public InsufficientFund(String message){//parameterized constructor
	super(message);// argument is a
	//again passed to super(),ie parent (RuntimeException)
	}
}
