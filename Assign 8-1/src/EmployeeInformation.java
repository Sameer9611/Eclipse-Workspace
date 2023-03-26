import java.util.Scanner;
public class EmployeeInformation {// for getting input
	public static void main(String[] args) {
		EmployeeInformation ei = new EmployeeInformation();
		System.out.println("Enter no. of students:");
		Scanner sc5 = new Scanner(System.in);
		int count =sc5.nextInt();
		for(int i=1;count>=i;i++){
			System.out.println("Enter Student Details:");
		    ei.getUserInput();//getEmployeeInformation() gets call also by this and also arguments got passed
		}
	}
	public void getUserInput() {
		Employee employee =new Employee();// public most accessible
		Scanner sc1 = new Scanner(System.in);
		System.out.print("enter first name:");
		employee.firstName =sc1.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("\nenter last name:");
		employee.lastName=sc1.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.print("\nenter city:");
		employee.city=sc1.next();
		Scanner sc4 = new Scanner(System.in);
		System.out.print("\nenter mobile number:");
		employee.mobileNumber=sc1.nextLong();                                                            // static variable
		getEmployeeInformation(employee.firstName,employee.lastName,employee.city,employee.mobileNumber,Employee.country);// passing variables from 1 method to arguments in athor
		
	}
	public void getEmployeeInformation(String fName,String fLastName,String fCity,long fMobnum,String fcountry){
	System.out.println("Student Information:");
	System.out.println("First Name: "+fName);
	System.out.println("Student Information: "+fLastName);
	System.out.println("Student Information: "+fCity);
	System.out.println("Student Information: "+fMobnum);
	System.out.println("Student Information: "+fMobnum);
	}

	

}
