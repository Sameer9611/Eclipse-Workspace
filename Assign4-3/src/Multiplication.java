import java.util.Scanner;
public class Multiplication {
	public static void main(String[]args) {
		System.out.print("enter number1 here:");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		System.out.print("enter number 2here:");
		Scanner sc1 = new Scanner(System.in);
		int input2 = sc1.nextInt();
		Multiplication  multiplication = new  Multiplication();
		int output= multiplication.getMult(input1,input2);
		System.out.println(" Multiplication is>>"+output);
		
	}
	public int getMult(int a, int b) {
		int result=(a*b);
		return result;
	}

}

