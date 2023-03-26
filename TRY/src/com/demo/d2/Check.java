package com.demo.d2;

public class Check {
	public static void main(String[] args) {
		String name ="Naman";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i-- ) {
			rev=rev+name.charAt(i);//not adding but overridng the string rev
			System.out.println(rev);
		}
		if(rev.equalsIgnoreCase(name)) {
			System.out.println("is Palandrome");
		}
		else {
			System.out.println("not a palandorme");
		}
	}

}
