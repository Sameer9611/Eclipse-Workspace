import java.util.ArrayList;
import java.util.HashMap;

public class Employee2 {
	public static void main(String[] args) {
		Employee1 e1 =new Employee1();
		
		HashMap<Employee1,String> hashmap = new HashMap<Employee1,String>();
		hashmap.put(e1,e1.getSalary());
		
		System.out.println(hashmap);//{c1 [id=10, name=ram, salary=5000]=5000} 5000 is value got assigned to whole object(key)
		
		System.out.println(hashmap.get(e1));//5000//getting value of key 'co object'
	
		System.out.println(e1.getName());//ram
		
		
		
		
		
		
		
		System.out.println(getArrayList());//[45, 46, 47]
	}
	
	public static ArrayList<Integer> getArrayList(){//can return ArrayList or any class of collection
		 ArrayList<Integer> arraylist =  new ArrayList<Integer>();
		 arraylist.add(45);
		 arraylist.add(46);
		 arraylist.add(47);
		 return arraylist;
	}
	
	

}
