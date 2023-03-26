import java.util.Scanner;

public class ReverseStringSir {
	public String getReverseString(String input) {
		String reverse = "" ;
		for (int i = input. length()-1;i>=0;i--) {
		reverse = reverse + input .charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		// Object creation for ReverseString class
		ReverseStringSir r = new ReverseStringSir();
		// Input value from user
		Scanner scanner = new Scanner(System. in) ;
		System. out.println("Enter the input string: ");
		String inputValue = scanner. nextLine();
		// Reverse of input string
		System.out.println("Reverse of '" + inputValue + "' is '"+r.getReverseString(inputValue)+"'");
	}

}
