import java.util.Scanner;
public class Fibonacci {
	public static int getInput() {
			System.out.print("Enter Number of fibs you want: ");
			Scanner sc = new Scanner(System.in);
			int input=sc.nextInt();  // local variable is always final
			sc.close();
			return input;
	}
	public static void main(String[] args) {
		int i =1;
		int v1=0;
		int v2=1;
		int input = getInput();
		System.out.print(v1+",");
		System.out.print(v2+",");
	while(i<=(input- 2)) {
		int v3 = v1+v2;
		System.out.print(v3+",");
		v1=v2;
		v2=v3;
		i++;
		}
	}
	

}
