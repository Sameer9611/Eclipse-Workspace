import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;;


public class StringArrayList {
	
	public ArrayList<String>  inputCities() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 cities here:");
		
		ArrayList<String>cities=new ArrayList<>();//ArrayList<String>cities=new ArrayList<String>();>>>would also work
		
		for(int i=1; i<=5;i++) {
			String input = sc.next();
			cities.add(input);
		}
		return cities;
	}
	public static void main(String[] args) {
		
		StringArrayList sal =new StringArrayList();		
		
		Iterator<String> ir =sal.inputCities().iterator();//Iterator ir =sal.inputCities().iterator();>>>check this
		while(ir.hasNext()) {
			System.out.println(ir.next());
			
		}
		
	}

}
