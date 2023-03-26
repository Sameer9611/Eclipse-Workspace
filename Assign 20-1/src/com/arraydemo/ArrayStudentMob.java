package com.arraydemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayStudentMob {	
	
	
	
	public static void main(String[] args) {
		ArrayList<Long> mob = new ArrayList<Long>(5);//5 or deafult will be 10 but will grow if we go on adding
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("Enter Student "+i+" Mobile number");
			Long input=sc.nextLong();
			mob.add(input);
		}
		
		System.out.println(mob);//[465132, 8465132, 8465132, 465132, 456132]

		
		System.out.println(mob.get(0));//465132

//		mob.iterator();
//		mob.listIterator(); both would work
//		on mob we use iterator method and store it in Iterrator class 
//		Iterator ir=mob.iterator();>>warnig:Iterator is a raw type. References to generic type Iterator<E> should be parameterized	
		
		Iterator<Long> ir=mob.iterator();
		
		System.out.println(ir);//java.util.ArrayList$Itr@42a57993
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
//			465132
//			465132
//			8465132
//			8465132
//			465132
//			456132

		}
		
		
		
		
		
	}
	

}
