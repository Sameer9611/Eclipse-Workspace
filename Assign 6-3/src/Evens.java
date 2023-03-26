
public class Evens {
	public static void main(String[]args) {
		getEven();
		
	}
	public static void getEven() {
		int i=50;
		while(i<=75) {
			if (i%2==0) {
				System.out.println(i+" is even number");
			}
			//else {
				//System.out.println(i+" is odd number");
			//}
			i++;
		}
	}
}
