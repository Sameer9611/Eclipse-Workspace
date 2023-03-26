import java.util.*;
public class Conditionals {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int rem = x%2;
		
		if (rem==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}
}
 