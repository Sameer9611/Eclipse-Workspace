package com.demo1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// copy content from lec 19 clone().txt to BlankText1.txt
public class WriteData2 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis =new FileInputStream("D:\\JAVA notes\\2023-02-07 object class\\Lec 19 clone() method.txt");// new stream just like 'System.in'
			Scanner sc = new Scanner(fis);
			FileWriter fw =new FileWriter("D:\\JAVA notes\\2023-02-14 i-o streams\\BlankFile2.txt");
			while(sc.hasNextLine()) {
					fw.write(sc.nextLine()+"\n");	
					
			}
			sc.close();
			fw.close();
		}			
		catch (IOException e) { // this also handles filenotfound exception
					e.printStackTrace();
		}
		
	}
	

}
