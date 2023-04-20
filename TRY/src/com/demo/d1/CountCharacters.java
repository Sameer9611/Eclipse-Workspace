package com.demo.d1;

public class CountCharacters {
	
	public static void main(String[] args) {
		String name="sameer Ghogare";
		int count=0;
		for(int i =0 ; i<name.length();i++) {
			if(name.charAt(i)>='a'|| name.charAt(i)>='z' ) {
				count++;
			}
			else if(name.charAt(i)>='A'|| name.charAt(i)>='Z') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
