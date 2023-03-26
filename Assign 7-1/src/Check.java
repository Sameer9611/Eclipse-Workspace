import java.util.Scanner;
public class Check {
	
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter input here: ");
	String input = scanner.nextLine();
	int characterNo =input.charAt(0);//charAt(index) returns dec(number) from ASCII table 
	getCheck(characterNo,input);
	}

	public static void getCheck(int characterNo,String input) {
		if (97<=characterNo && characterNo <= 122) {
			System.out.println("The input "+input+" is a small alphabet");
		}
		else if (65<=characterNo && characterNo <= 90) {
			System.out.println("The input "+input+" is a Capital alphabet");
		}
		else if (48<=characterNo && characterNo <= 57) {
			System.out.println("The input "+input+" is a Number");
		}
		else if (32==characterNo) {
			System.out.println("The input"+input+"is space ");
		}
		else {
			System.out.println("The input "+input+" is a Special character");
		}
	
	}
}
