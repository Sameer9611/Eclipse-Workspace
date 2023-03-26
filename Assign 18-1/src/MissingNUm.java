
public class MissingNUm {
	public static void main(String[] args) {
		int []a= {1,1,2,4,5,3,7,8,9,10,11,12};
		for(int i =1;i<=9;i++) {//checking for 1 to 9 number
			int count=0;
			for(int j =0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
				}	
			}
			if(count==0) {
				System.out.println("missing num is "+i);
			}
		}
	}


}
