package com.demo.d2;

import java.util.HashMap;

public class Xyz {
	public static boolean isPalindrome(String s) {
        String reverse="";
        String straight="";
        for(int i=s.length()-1;i>=0;i--){
            if('a'<=s.charAt(i)&&s.charAt(i)>='z'){
                reverse=reverse+s.charAt(i);
            }
            else if('A'<=s.charAt(i)&&s.charAt(i)>='Z') {
                reverse=reverse+s.charAt(i);

            }
            else if(0<=s.charAt(i)&&s.charAt(i)>=9) {
                reverse=reverse+s.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++){
        	 if('a'<=s.charAt(i)&&s.charAt(i)>='z'){
                 straight=straight+s.charAt(i);
             }
             else if('A'<=s.charAt(i)&&s.charAt(i)>='Z') {
                 straight=straight+s.charAt(i);

             }
             else if(0<=s.charAt(i)&&s.charAt(i)>=9) {
                 straight=straight+s.charAt(i);
             }
          
        }
        if(straight.equalsIgnoreCase(reverse)){
        	System.out.println(straight);
        	System.out.println(reverse);
            return true;
        }
        else{
        	System.out.println(straight);
        	System.out.println(reverse);
        	return false;
        }



        
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("+-"));
		
	}
	

}
