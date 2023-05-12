package com.demo.d1;

public class c1{
	
	
	public static void main(String[] args) {
		int [] num= {2,3,7,9,19};
		int max=num[0];
		for(int i =0; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println(max);

	}
	protected void protectedMethod() {
		
	}
	public void publicMethod() {
		
	}
}

