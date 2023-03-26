import java.util.Scanner;
public class Checker {
	public static void main(String[] args) {
		getChecker();// no need to call getInput as it is present in getChecker	
	}
	public static  int getInput() {
		System.out.print("Enter Number Here:");
		Scanner scanner = new Scanner(System.in);
		int input =scanner.nextInt();
		return input;
		
		
	}
	public static void getChecker() {
		int i=getInput(); // 
		if(i<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is positive");
		}
	}


}
