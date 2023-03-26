
public class ConstructorTypes {
	int userId;   //class declared,constructor initialized object
	String userName;
	
	// ConstructorTypes(){   //default constructor>> created by default
	//  no code present                      (this will be invisible, called default constructor)
	//  }
	ConstructorTypes() { // modifier = default(modifier can be any public,protected,private(no final)
		//super(); also calls super if parent class exists else does not make sense
		userId=5;// we can type body     // but we have created this,and have no arguments,hence no argu constructor
		//though it does not have arguments we can initialize in body
	}
		
	public ConstructorTypes(int input1,String input2 ) { // modifier = public , parameterized constructor
		// as serial of arguments is not known have to assign them
		this.userId=input1;   //this.current class variables
	    this.userName=input2;  //same 
	}
	public ConstructorTypes(int input1) {
		this.userId = input1;
	}
	public void getStudent() {
		System.out.println("name of employee is "+userName+" and ID is "+userId);
	}
	public static void main(String[] args) {
		//ConstructorTypes constructortypes1 = new ConstructorTypes(); //this line or line 32// till date'()'this use to be blank in object
		// now  1)'ConstructorTypes()':will evoke a default constructor if any other constructor is not present
		//      2) but if no arg constructor is created by us; it will invoke that.
		//         so in our case 'no argument' construct . will get evoked.
		ConstructorTypes constructortypes2 = new ConstructorTypes(55,"sam");
		ConstructorTypes constructortypes3 = new ConstructorTypes(54,"jack");
		ConstructorTypes constructortypes4 = new ConstructorTypes(9611);
		 new ConstructorTypes().getStudent(); // goes to line 9 constructor and gets default valuesonstructorTypes constructortypes4 = new ConstructorTypes();
		  constructortypes2.getStudent();//constructor line 13
		  constructortypes3.getStudent();//constructor line 13
		  constructortypes4.getStudent();// this will call constructor with 1 argument line no.18 and gives null to string
		 // new ConstructorTypes("sam").getStudent();>> will give error cause only string counstructor does not exists.
	}
	

}
