package com.customexception;

public class NoteExample2 {
	public static void main(String[]args) {
		
		try {
			throw new NoteExample("lnvalid input");
		} 
		catch (NoteExample e) {  // we are catching the thrw here
			
			System.out.println(e);  // hence until we print it, we will not see that
		}
		
		
		
	}

}
