package com.factory;

public class Tier3 implements Booking{

	@Override
	public void getDetails() {
		System.out.println("Tier 3: Price:3000 : Avaliable Seats:20");
	}

}
