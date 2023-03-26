import java.util.Scanner;
public class Armstrong {
	public void getSum1(int input) {
		int temp =input; // have to assign input value to temp,as it gets manupulted and use input value in if else condition
		int sum1=0;
		while(temp!=0) { // if input not equals 0 , enters loop
			int reminder = temp%10;
			sum1 = sum1+(reminder*reminder*reminder);
			temp = temp/10;
		}
		if (input==sum1) {
			System.out.println(input+" is a Armstrong number");
		}
		else {
			System.out.println(input+" is not a Armstrong number");
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter Number to check armstrong: ");
		Scanner sc = new Scanner(System.in);
		int input1=sc.nextInt();  // local variable is always final
		sc.close();
		Armstrong armstrong = new Armstrong();
		armstrong.getSum1(input1);
	}

}
