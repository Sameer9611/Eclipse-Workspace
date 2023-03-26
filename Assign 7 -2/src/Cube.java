import java.util.Scanner;
public class Cube {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number here:");
		int input = sc.nextInt();
		Cube cube = new Cube();
		int result =cube.getNumberCube(input);
		System.out.println("Cube of "+input+" is "+result);
	}
	
	public int getNumberCube(int num) {
		int output = num*num*num;
		return output;
	}

}
