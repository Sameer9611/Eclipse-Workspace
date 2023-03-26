package com.demo.d1;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		
		int [] arr = {7, 4, 6, 9, 11, 17, 12};
		//int [] arr1=new int[arr.length];
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		
		
//		for(int i=0;i<arr.length;i++){
//
//			for(int j =i+1; j<arr.length;j++){
//				int temp=0;
//				if(arr[i]>arr[j]){
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			System.out.println(arr[i]);
//
//		}
////		for(int i : arr1) {
////			System.out.println(i);
////		}
		
	}

}
