package com.demo.d2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TEmp {
	public static void main(String[] args) {
		int[] temperatures= {30,40,50,60};
		System.out.println(temperatures);
        int length=temperatures.length;
        System.out.println(length);
        int[] tempgap= new int[4];
      
        
        for(int i =0;i<temperatures.length ;i++){
        	 List<Integer> xyz =new LinkedList<Integer>();
        	 int count=0;
            for(int j=i+1;j<temperatures.length;j++){
            	
                if(temperatures[i]<temperatures[j]){
                	count=count+1;
                  xyz.add(count);
                }
            }
            tempgap[i]=xyz.get(0);   
        }
        for(int i :tempgap) {
		System.out.println(i);
        }
	}
}