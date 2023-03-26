package com.demo1;

import java.io.FileInputStream;// need to import else error
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) {
//		try {
//			FileInputStream fis = new FileInputStream ("D:\\JAVA notes\\2023-02-14 i-o streams\\for_i-o.txt");//add path as argument then will show error to handle exception file not found
//			Scanner sc = new Scanner(fis);																	  // need to give argument(file) else error
//			System.out.println(sc.nextLine());//this will just print full 1 line//sc.next() prints just 1 word
//		} catch (FileNotFoundException e) {                                                     			  // then use try catch
//			e.printStackTrace();
//		}
		
		Scanner sc=null;//Scanner sc; >> have to initialize to null else error in finally block(sc not initialized)
		
		try {
			FileInputStream fis = new FileInputStream ("D:\\JAVA notes\\2023-02-14 i-o streams\\for_i-o.txt");//add path as argument then will show error to handle exception file not found
			sc =new Scanner(fis);//21//Scanner sc = new Scanner(fis);	// file given as input																  // need to give argument(file) else error
			while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {                                                     			  // then use try catch
			e.printStackTrace();//this prints exception if file not found
		}
		finally {
			sc.close();//if 21: not accesible here // so line:17:make it method level
		}// generally we close resources in finally
		
	// fis object is not accesible here:
	}

}
