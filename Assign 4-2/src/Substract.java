import java.util.*;
public class Substract {
	public static void main(String[]args) {
		System.out.print("enter number1 here:");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		System.out.print("enter number 2here:");
		Scanner sc1 = new Scanner(System.in);
		int input2 = sc1.nextInt();
		Substract substract = new Substract();
		int output=substract.getSub(input1,input2);
		System.out.println("Substraction is>>"+output);
		
	}
	public int getSub(int a, int b) {
		int result=(a-b);
		return result;
	}
}
