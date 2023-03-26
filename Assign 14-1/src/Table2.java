
public class Table2 {
	public static void main (String[]args) {
		for (int i= 2; i<=20; i++) { // for table from 2 to 20
			for (int j= 1; j<= 10; j++) {
				int tableValue =i*j;
				System.out.print(tableValue + "\t"); // '\t' stands for tab gap
			}
		System.out.println("") ;//starts new line 
		}
   }
}