package com.demo.d1;
//dummy change made by another programmer,another change
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
		
		
		c1 c1 =  new c1();
		c1.protectedMethod();//accessible
	}
	
	
	

}
