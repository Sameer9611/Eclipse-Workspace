import java.util.Scanner;

// prime num:has only 2 divisors:self and 1
public class PrimeNum {
	public static int getInput(){
	System.out.print("Enter Number here: ");
	Scanner sc = new Scanner(System.in);
	int input=sc.nextInt();  // local variable is always final
	sc.close();
	return input;
	}
	public static void main(String[] args) {
		int i =getInput() ;
		if(i>0) {
			if (i==1) {
				System.out.println("Number "+i+" is  not composite nor prime" );
			}
			else if(i==2 || i==3 || i==5 || i==7 ) {
				System.out.println("Number "+i+" is prime");	
			}
			else if (i%2==0 || i%3==0 || i%5==0 || i%7==0 ) {
				System.out.println("Number "+i+" is composite" );
			}
			else {
				System.out.println("Number "+i+" is prime");
			}
		}
		else {
			System.out.println("invalid input : enter number greater than 0");
		}
	}

}
