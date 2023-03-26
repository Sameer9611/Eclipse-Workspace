import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101, "falguni","pune"));
		emplist.add(new Employee(101, "yagami","mumbai"));
		emplist.add(new Employee(101, "abhi","banglore"));
		emplist.add(new Employee(101, "chaman","pune"));
		
		System.out.println("before sorting:");
		for (Employee employee : emplist) {
			System.out.println(emplist);
		}
		
		Collections.sort(emplist);
		System.out.println("After sorting");
		for (Employee employee : emplist) {
			System.out.println(emplist);
		}
		
		
		
		
	}

}
