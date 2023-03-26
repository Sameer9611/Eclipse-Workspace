package com.demo;

import java.util.ArrayList;

public class Ballons {
	
	public static void main(String[] args) {
		
		ArrayList<String> colourBallons= new ArrayList <String>();
		colourBallons.add("Red");
		colourBallons.add("Blue");
		colourBallons.add("Green");
		colourBallons.add("Red");
		colourBallons.add("Blue");
		colourBallons.add("Red");
		colourBallons.add("Blue");
		colourBallons.add("Green");
		System.out.println(colourBallons);//[Red, Blue, Green, Red, Blue, Red, Blue, Green]
		
		
		ArrayList<String> colourBallons1= new ArrayList <String>();
		int i=0;
		while(i<colourBallons.size()) {
			String s =colourBallons.get(i);
			if(s.charAt(0)=='R') {
				colourBallons1.add(s);	
			}
			i++;
		}
		int j=0;
		while(j<colourBallons.size()) {
			String s =colourBallons.get(j);
			 if(s.charAt(0)=='B') {
				colourBallons1.add(s);
			}
			j++;
		}
		int k=0;
		while(k<colourBallons.size()) {
			String s =colourBallons.get(k);
			if(s.charAt(0)=='G') {
				colourBallons1.add(s);
			}
			k++;
		}
			
		
		System.out.println(colourBallons1);
		
		
	}

}
