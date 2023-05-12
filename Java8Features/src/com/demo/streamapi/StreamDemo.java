package com.demo.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		int i=0;
		while(i<=10) {
			nums.add(i);
			i++;
		}
		System.out.println(nums);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Stream<Integer> ss=nums.stream();
		//System.out.println(ss.count());//11>>stream can only be used once else error
		
		
		List<Integer> list=ss.filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(list);//[0, 2, 4, 6, 8, 10]
		
		long count = nums.stream().filter(xx->xx>=7).count();
		System.out.println(count);//4
		
		
		
		
	}

}
