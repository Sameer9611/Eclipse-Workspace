package com.demo.OptionalClass;
//It is a public final class and used to deal with Null Pointer Exception inJava application 
import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		String [] names =new String[5];
		
		names[0]="sam";
		names[1]="tam";
		names[2]="tgam";
		names[3]="sfam";
		//names[4]="sam";>>not saved hence null

		
		for(int i =0; i<5;i++) {
			//System.out.println(names[i]);
			/*sam
			tam
			tgam
			sfam
			null*/
		}
		
		/*
		int length =names[4].length();
		System.out.println(length);
		
		
		Exception in thread "main" java.lang.NullPointerException
		at com.demo.OptionalClass.Demo.main(Demo.java:23)
		 */
		
		//<<<hence use this>>>>
		
		Optional<String> namecheckedfornull = Optional.ofNullable(names[4]);
		if(namecheckedfornull.isPresent()) {
			int length1 =names[4].length();
			System.out.println(length1);
		}
		else {
			System.out.println("String value is not present");
		}
		
	}

}
