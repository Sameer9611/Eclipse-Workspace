import java.util.Scanner;
public class MainProduct {
		public static void main(String[] args) {
			Product p = new Product();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Weight>>>");
			int weight=sc.nextInt();
			try {                   //without try we get red coloured exception with line where exception occured
			p.productCheck(weight);  //but after try and handling get one lined
			}
			catch(Exception e) {
				//System.out.println(e);// (or) e.printStackTrace();
				e.printStackTrace();
			}
			
//			p.productCheck(weight);
			
			}
}	
	
