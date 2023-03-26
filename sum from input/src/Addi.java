import java.util.*;
public class Addi {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); //input class
		int a = sc.nextInt(); // sc.next only copies first unit
		int b = sc.nextInt(); // sc.nextline sc.nextint etc copies fully
		int sum = a+b ;
		System.out.print(sum);
	}

}
