
public class Student {

	int mathsMarks=65;
	int chemistryMarks=98;
	int physicsMarks=99;
	public void getTotal() {// void has nothing as return class
		int total=  mathsMarks+ chemistryMarks + physicsMarks;
		System.out.println(total);
	}	
	public int getResult() { // if return class is int , always have to type return int at the end
		int result=  mathsMarks+ chemistryMarks + physicsMarks;
		return result;
	}
	public static void getStudentName() {
		System.out.println("Student name is ajay");
	}
	public void getDetails(int id, String name) {
		System.out.println("id is "+id);
		System.out.println("Name is " +name);		
	}
	public static void main(String[]args) {// we always need a main method to run the program
		Student student1= new Student();//need to create a object(student1)
		student1.getTotal();            //we want to recall are not from static
		int output = student1.getResult();
		System.out.println(output);
		student1.getDetails(101,"Sameer");
		
		getStudentName();//directly recalled without object creation
	         //or
        Student.getStudentName();	
	}	                    //as this method is in static.
}
