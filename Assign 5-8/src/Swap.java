
public class Swap {
	public static void main(String[] args) {
		int a = 35;
		int b = 59;
		int temp;
		System.out.println("before swaping:");
		System.out.println("int a : "+a);
		System.out.println("int b : "+b);
		
		temp=a; // a already 35, temp becomes 35
		a=b;   //  b already 59,a becomes 59 
		b=temp; // temp already 35,b becomes 35
		System.out.println("after swaping:");
		System.out.println("int a : "+a);
		System.out.println("int b : "+b);
	}

}
