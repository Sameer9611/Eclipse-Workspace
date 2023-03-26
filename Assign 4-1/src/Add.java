import java.util.*;
public class Add {
	static public  void main (String []args) {
		System.out.print("enter number1 here:");
		Scanner int1 = new Scanner(System.in);
		int a = int1.nextInt();
		System.out.print("enter number2 here:");
		Scanner int2 = new Scanner(System.in);
		int b = int2.nextInt();
		Add add = new Add();
		int sum=add.getAdd( a, b);// this is important(int sum=)
		System.out.println("The addition is >>> "+sum);
	}
	public int getAdd(int a,int b) {
	int result=(a+b);
	return result;
	}

}
