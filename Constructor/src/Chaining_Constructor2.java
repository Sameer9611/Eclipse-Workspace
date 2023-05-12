
public class Chaining_Constructor2 extends Chaining_Constructor  {
	
	Chaining_Constructor2(){
		this(101);
		System.out.println("no arg: child class constructor");
	}
	Chaining_Constructor2(int i){ 
		this(101,"sam");
		System.out.println("int arg: child class constructor");

	}
	Chaining_Constructor2(int i, String name){
		//super();// >>> even though if we keep this blank any constructor blank "super(); is present
		// and calls blank constructor form parentclass
		// and if parent class is not present nothing happens
		// if parent class does not have no arg const, then we have to call paremitirized const, else error
		System.out.println("int , string arg: child class constructor");
	}
	
	
	
	public static void main(String[] args) {
		Chaining_Constructor2 obj = new Chaining_Constructor2();
	}
}
