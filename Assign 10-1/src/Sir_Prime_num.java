// not proof for 1 and 0
import java.util.Scanner;
public class Sir_Prime_num {
	public static int getInput(){
	System.out.print("Enter Number here: ");
	Scanner sc = new Scanner(System.in);
	int input=sc.nextInt();  // local variable is always final
	sc.close();
	return input;
	
	}
	
	public static void main(String[] args) {
		int input = getInput();
		int count =0;
		if( input>1) {//ie>2,3,4...
			for(int i=1;i<=input;i++) {
				if (input%i == 0) {
					count++;
				}
			}
			if (count>2) {
				System.out.println(input+" is not prime");
			}
			else {
				System.out.println(input+" is prime");
			}
			
		}
		else {
			System.out.println("invalid input : number must be greater than 0 and 1");
		}
		
		
	}

}
