import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number here:");
		int input=sc.nextInt();
		Reverse reverse = new Reverse();
		int output = reverse.getReverseNumber(input);
		System.out.println("Reverse num is>>>>"+output);
	}
	public int getReverseNumber(int num) {
		int reverse =0;
		while(num!=0) {
			reverse = reverse * 10;
			reverse = reverse + num% 10;
			num = num/10;
		}
		
		return reverse;
	}

}
