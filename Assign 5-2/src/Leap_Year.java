
public class Leap_Year {
	public static void main(String[] args) {
		float input = 401;
		getLeap1(input);
		getLeap2(input); 
	}
	public static void getLeap1(float year) {
		if( (year%400==0)) {
			System.out.println("my method:leap year");
		}
		else if ((year%100==0)){
			System.out.println(" my method:not a leap year");
		}
		else if (year%4==0) {
			System.out.println("my method:leap year");
		}
		else {
			System.out.println("my method:not a leap year");
		}

	}
	public static void getLeap2(float year) {
		if (((year % 4 ==0)&&(year % 100!=0))||
			(year % 400 ==0)){
			System.out.println("sir solution:leap year");
		}
	   else {
		   System.out.println("sir solution:not leap year");
	   }
	}
}
