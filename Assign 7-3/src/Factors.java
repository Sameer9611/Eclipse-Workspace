import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number Here:");
		int inputData = sc.nextInt();
		Factors factors= new Factors();
		factors.getFactors(inputData);
	}
	public void getFactors(int input) {
		int i=1;
		System.out.print("Factors of "+input+" are:");
		while(i<=input) {
			if(input%i==0) {
				if (i<input) {
					int output_i=i;
					System.out.print(output_i+",");
				}
				else {
					int output_i=i;
					System.out.print(output_i+".");
				}
			}
			i++;
		}
		
	}

}
