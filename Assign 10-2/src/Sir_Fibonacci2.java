import java.util.Scanner;
public class Sir_Fibonacci2 {
	public static int getInput() {
		System.out.print("Enter Number of fibs you want: ");
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();  // local variable is always final
		sc.close();
		return input;
	}
	public static void main(String[] args) {
		int input=getInput();
		int value1=0;
		int value2=1;
		for(int i=1;i<=input;i++) {
			System.out.print(value1+",");
			int temp=value1;
			value1=value1+value2;
			value2=temp;
		}		
	}
}
