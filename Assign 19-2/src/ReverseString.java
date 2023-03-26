import java.util.Scanner;

public class ReverseString {
	public String getReverseString(String Reverse) {
		String y="";//initialze like this""
		for(int i=Reverse.length()-1;i>=0;i--) {
			String x = Reverse.substring(i, i+1);
			y=y.concat(x);
		}
		
		return y;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x=sc.nextLine();
		String xx=new ReverseString().getReverseString(x);
		System.out.println(xx);
		
		
	}

}
