package com.factory;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter tier here:");
		String input =scanner.next();
		
		BookingFactory bookingFactory = new BookingFactory();
		bookingFactory.getTier(input).getDetails();
		//also the method names(getDetails()) are same in all childs just bodies are different

		scanner.close();
	}

}
