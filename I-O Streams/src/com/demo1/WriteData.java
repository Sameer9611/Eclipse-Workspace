package com.demo1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
	public static void main(String[] args) {
		
		Scanner sc=null;//Scanner sc; >> have to initialize to null else error in finally block(sc not initialized)
		try {
			System.out.println("plz write here>>");
			sc =new Scanner(System.in);
			//FileOutputStream fis = new FileOutputStream ("D:\\JAVA notes\\2023-02-14 i-o streams\\BlankFile.txt"); >> no need of outputstream as we directly use its child class Filewriter
			// still we dont know the use of FileOutputStream>>fileoutputstream used in serialization, properties file
			FileWriter fw = new FileWriter("D:\\JAVA notes\\2023-02-14 i-o streams\\BlankFile.txt");
			while(sc.hasNextLine()) { 
					//fw.write("hey sam"); //>>>>> can directly be used to write string in file; use multiple fw.write("xyz \n") to print on new line
				fw.write(sc.nextLine());  // as for to print on console we use (system.out .println)  here to write in file we use: (fw.write)  
				fw.close();//have to close here cannot make it main method level
			}
		} 
		catch (IOException e) {
				
				e.printStackTrace();
		}
		finally {
			sc.close();//if 15: not accesible here // so line:13:make it method level
			
		}// generally we close resources in finally
		
	    // fis object is not accesible here:
	}

}
	// always keep streams out of loops