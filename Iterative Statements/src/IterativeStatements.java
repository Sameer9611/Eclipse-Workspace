
public class IterativeStatements {
	public static void main(String[] args) {
		IterativeStatements IterativeStatements1=new IterativeStatements();
		IterativeStatements1.forLoops();  // non static method (to have some variety)
		forLoops1();
		whileLoops();
		doWhileLoops();
		getBreak();
		getBreak1();
		getContinue();
	}
	public void forLoops() {
		for (int num=1 ; num<=100 ; num++) { //default value (if blank) for condition is TRUE (infinity)
			if (num%2==0) {
				System.out.println(num+" is even by for");
			}
			else {
				System.out.println(num+" is odd by for");
			}
		}
	}
	public static void forLoops1() {// a bit tricky but understood (game changes as print statement gets executed even if it checks the part)
		int x=0;              //(initialization;condition;increment/decrement)
		for(System.out.println("In initialization");x<3;System.out.println("In increment/decrement")) {
		System.out.println("In for loop body");
		x++; 
		}
	}
	public static void whileLoops() {
		int num=1;
		while(num<=100) { // just condition that to boolean
			if (num%2==0) {
				System.out.println(num+" is even by while");
			}
			else {
				System.out.println(num+" is odd by while");
			}
			num++;
		}
	}
	public static void doWhileLoops() {
		int num=101; // every thing works same as while loop,write body in do{},condition in while{};
		do {         //only difference is even if condition is false code will execute once(1st statement) 
			if (num%2==0) {
			System.out.println(num+" is even by do while");
			}
		  
		    else {
			System.out.println(num+" is odd by  do while");
		    }
			num++;
		}                 // even if int =101 and condition is <100 still prints 1st statement =101 is odd by do while
		while(num<=100);// just condition that to boolean;
		System.out.println("outside loop");
	}	
	public static void getBreak() {
		for(int a=0;a<=10;a++) {
			if(a==4) {
				break;//breaks the loop (hence prints till 3)
			}	
			else {
				System.out.println("The num is >> "+a);
			}
		}
		System.out.println("outside loop");
	}
	           //OR
	public static void getBreak1() {
		for(int a=0;a<=10;a++) {
			if(a==4) 
			break;//as '{}'is absent so 1 line will execute
			System.out.println("hello "+a); //this is  independent line
		}
		System.out.println("outside loop");
	}
	public static void getContinue() {
		for(int a=0;a<=10;a++) {
			if(a!=4) { // just prints 4 and get out the loop
				continue;//continue acts as skip. as all other numbers are not equal to 4 so condition is true as it skips!!!
			}	
			else {
				System.out.println("The num is >> "+a);
			}
		}
		System.out.println("outside loop");
	}
	
	
}


