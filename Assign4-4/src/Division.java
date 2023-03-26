import java.util.Scanner;

public class Division {
	public static void main(String[]args) {
		System.out.print("enter number1 here:");
		Scanner sc = new Scanner(System.in);
		double input1 = sc.nextDouble();
		System.out.print("enter number 2here:");
		Scanner sc1 = new Scanner(System.in);
		double input2 = sc1.nextDouble();
		Division  division = new  Division();
		double output= division.getDiv(input1,input2);
		System.out.println(" Division is>>"+output);
		
	}
	public double getDiv(double a, double b) {
		double result=(a/b);
		return result;
	}

}
