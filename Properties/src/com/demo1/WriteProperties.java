package com.demo1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;


public class WriteProperties {
	
	public static void main(String[] args) {
	
		try {
			FileOutputStream fos = new FileOutputStream("D:\\SOFTWARES\\ECLIPS\\workspace\\Properties\\src\\file2.properties");//give output to the blank or prewritten file
			Properties pro = new Properties();
			//no need to load as we dont want anything here ,just want to write to blank file
			pro.setProperty("my_baby", "sheru");
			pro.setProperty("url", "wwww.google.com");
			pro.save(fos, "done");//(outputstream,comment)  >>> comment = random comment>>dont have to load but save
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}

}
