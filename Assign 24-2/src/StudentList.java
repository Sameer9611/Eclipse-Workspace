import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	public static void main(String[] args) {
		ArrayList<Student> studentlist =new ArrayList<Student>();
		studentlist.add(new Student(101,"sameer", "pune"));
		studentlist.add(new Student(102,"vivek", "satara"));
		studentlist.add(new Student(101,"chandu", "pune"));
		studentlist.add(new Student(101,"avinash", "mumbai"));
		System.out.println("before sorting");
		for (Student student : studentlist) {
			System.out.println(student);
		}
		Collections.sort(studentlist, new StudentNameComparator());;
		System.out.println("after sorting");
		for (Student student : studentlist) {
			System.out.println(student);
		}
		
	}

}
