import java.util.*;
public class Conditionals {
	public static void main(String[]args) {
		System.out.print("Enter age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("adult");
		} 
		else {
			System.out.println("not adult");
			
		}
	}
}
