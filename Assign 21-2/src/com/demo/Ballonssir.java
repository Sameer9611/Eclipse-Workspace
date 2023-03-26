package com.demo;

import java.util.LinkedList;

public class Ballonssir {
	public static void main(String[] args) {
		LinkedList<String> colourBallons= new LinkedList <String>();
		colourBallons.add("Red");
		colourBallons.add("Blue");
		colourBallons.add("Green");
		colourBallons.add("Red");
		colourBallons.add("Blue");
		colourBallons.add("Red");
		colourBallons.add("Blue");
		colourBallons.add("Green");
		System.out.println(colourBallons);//[Red, Blue, Green, Red, Blue, Red, Blue, Green]
		
		
		LinkedList<String> colourBallons1= new LinkedList <String>();

		for(String s : colourBallons) {
			if(s.equals("Red")) {//in case of string .equals()purely checks for content ,'==' checks for pointing to objects
				colourBallons1.add(s);
			}
		}
		for(String s : colourBallons) {
			if(s.equals("Blue")) {
				colourBallons1.add(s);
			}
		}
		for(String s : colourBallons) {
			if(s.equals("Green")) {
				colourBallons1.add(s);
			}
		}
		System.out.println(colourBallons1);
		
	}

}
