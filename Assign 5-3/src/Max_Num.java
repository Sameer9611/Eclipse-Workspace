
public class Max_Num {
	
	public static void main(String[] args) {
		int num1= 10;
		int num2= 10;
		int num3= 11;
		
		if ((num1>num2)&&(num1 > num3)){
				System.out.println(num1 +" greater");
		}
		else if ((num3>num1)&&(num3 > num2)){
			System.out.println(num3+" is greater");
		}
		else if ((num3>num1)&&(num3 > num2)){
			System.out.println(num2+" is greater");
		}
		else {
			System.out.println("invalid input");
		}
	}

}
