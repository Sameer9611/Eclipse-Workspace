package com.demo.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		
		StringJoiner names = new StringJoiner("#");
		names.add("sam");//cannot add to string like this
		names.add("virat");
		names.add("shan");
		names.add("vivek");

		System.out.println(names);
		//sam#virat#shan#vivek
		//sam,virat,shan,vivek
	}
	
	



}
 