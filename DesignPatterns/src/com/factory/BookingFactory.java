package com.factory;

public class BookingFactory {
	//having a interface as return type new() of its childs is the catch
	//also the method names are same in all childs just bodies are different as it is overridden from interface
	public Booking getTier(String input) {
		
		if(input.equalsIgnoreCase("First")) {
			return new Tier1(); 
		}
		else if(input.equalsIgnoreCase("Second")){
			return new Tier2();
		}
		else if(input.equalsIgnoreCase("Third")){
			return new Tier3();
		}
		
		throw new IllegalArgumentException("Invalid Input");//util this line gives complier time error as it wants a return outside if else
		
		

	}

}
