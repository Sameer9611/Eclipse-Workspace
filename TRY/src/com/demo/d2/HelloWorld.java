package com.demo.d2;

import java.util.HashSet;

public class HelloWorld {
    public static void main(String[] args) {
       String name="narayan";
       HashSet <Character> name1 = new HashSet<Character>();
       
        for(int i=0 ; i <name.length();i++){
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                	char input =name.charAt(i);
                    name1.add(input);
                }
            }
        }
        System.out.println("Duplicate aplhabets are:"+name1);
    }
}

