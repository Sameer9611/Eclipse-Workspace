package com.factory;

public class Tier1 implements Booking{

	@Override
	public void getDetails() {
		System.out.println("Tier 1: Price:1000 : Avaliable Seats:100");
	}

}
