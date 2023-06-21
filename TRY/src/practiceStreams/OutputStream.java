package practiceStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class OutputStream {

	public static void main(String[] args) {
		
		String name="sameer ghogare is danger";
		byte[] name1= name.getBytes();
		FileOutputStream fileOutputStream;
		
		try {
			 fileOutputStream= new FileOutputStream("C:\\Users\\Sameer\\Desktop\\trial.txt");
			 fileOutputStream.write(name1);
			 System.out.println("data has been written");
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
