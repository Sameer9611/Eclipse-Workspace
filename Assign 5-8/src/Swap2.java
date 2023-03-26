
public class Swap2 {
	static int a = 5;
	static int b = 10;
	
	public static void main(String[] args) {
		System.out.println("before swaping: a="+a+" b= "+b);
		a=a*b; // a=5*10, a=50
		b= a/b; //b=50/10, b=5
		a=a/b; // a= 50/5, a=10
		System.out.println("before swaping: a="+a+" b= "+b);
	}

}
