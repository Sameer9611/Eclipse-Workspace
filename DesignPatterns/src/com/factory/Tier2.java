package com.factory;

public class Tier2 implements Booking{

	@Override
	public void getDetails() {
		System.out.println("Tier 2: Price:2000 : Avaliable Seats:50");
	}

}
