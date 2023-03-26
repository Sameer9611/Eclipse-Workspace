import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		System.out.print("Enter Number here: ");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		Factorial factorial = new Factorial();
		int output1=factorial.getFactorial1(input1);
		System.out.println(output1);
		System.out.print("Enter Number here: ");
		int input2 = scanner.nextInt();
		int output2=factorial.getFactorial2(input2);
		System.out.println("The factorial of "+input2+" is "+output2);
		
		
	}
	public int getFactorial1(int number) {
		int fact1 =1;
		for(int i=1;i<=number;i++) {
			fact1 = fact1*i; 
		}
		return fact1;
	}
	public int getFactorial2(int number) {
		int fact2=1;
		int i = 1;
		while(i <=number) {
			fact2 = fact2*i;
			i =i+1;
		}
		return fact2;
	}
	
	

}
