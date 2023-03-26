package com.demo.d2;

import java.util.HashSet;

public class HelloWorld {
    public static void main(String[] args) {
       String name="samEer";
       String namelow=name.toLowerCase();
       HashSet <Character> name1 = new HashSet<Character>();
       
        for(int i=0 ; i <namelow.length();i++){
            for(int j=i+1;j<namelow.length();j++){
                if(namelow.charAt(i)==namelow.charAt(j)){
                	char input =namelow.charAt(i);
                    name1.add(input);
                }
            }
        }
        System.out.println("Duplicate aplhabets are:"+name1);
        
        //added this comment to check how can i commit
    }
}
