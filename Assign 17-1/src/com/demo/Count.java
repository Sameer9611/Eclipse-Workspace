package com.demo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
	public void getFile(){
		int numbers=0;
		int vowels=0;
		try {
			FileInputStream fis = new FileInputStream("D:\\SOFTWARES\\ECLIPS\\workspace\\Assign 17-1\\src\\com\\demo\\letter.txt");
			Scanner sc = new Scanner(fis);
			
			while(sc.hasNextLine()) {// i typed (if) should use "while" loop (7 min wasted)
				String temp =sc.nextLine();
			
				for(int i =0;i < temp.length();i++) {
				char tempChar = temp.charAt(i);//charAt(index) returns dec(int) from ASCII table 
					if(tempChar==65||tempChar==97||tempChar==69||tempChar==101||tempChar==73||tempChar==105||tempChar==79||tempChar==111||tempChar==85||tempChar==117) {
					   //AaEeIiOoUu
						vowels++;
					}
					if(tempChar>=48 && tempChar<=57) {//0 to 9
					numbers++;
					}
				 
				}	
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		System.out.println("Total Vowels used>>>"+vowels);
		System.out.println("Total Numbers used>>>"+numbers);
		
	
	}
	public static void main(String[] args) {
		new Count().getFile();
		
	}
}
