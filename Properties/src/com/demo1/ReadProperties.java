package com.demo1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// a configuration file used to store the frequently chnaging data/fields which has .properties extension
//class>>>properties ; package util ; key = values format ; string data type
public class ReadProperties {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\SOFTWARES\\ECLIPS\\workspace\\Properties\\src\\file1.properties");//>>use inputstream when want to take inputs from prewritten file(just like we take input from sytem into the code)
			Properties pro = new Properties();//properties class cha object
			pro.load(fis);// have to load it
			String a=pro.getProperty("username");// then use getProperty("key");
			String b=pro.getProperty("password");
			System.out.println(a);
			System.out.println(b);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
