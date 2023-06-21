package practiceStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputStream {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Sameer\\Desktop\\trial.txt");
			Scanner scanner = new Scanner(fileInputStream);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
