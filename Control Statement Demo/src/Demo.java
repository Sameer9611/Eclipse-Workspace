
public class Demo {
	
	
	public static void main(String[]args) {
		Demo getIfElse1 =new Demo();
		getIfElse1.getIfElse();
		getIfElseLadder();
		getNestedIf();
		getSwitch();
		
	}
	
	
	
	public void getIfElse(){
		int x=56;
		int y =47;
		
		if (x>y) {
			System.out.println("x is greater");
		}
		else {
			System.out.println("y is greater");
		}
	}
	
	
	
	public static void getIfElseLadder() {
			int marks= 0;
		//A grade 71-100,B grade 61-70, C grade 0-60
		if (marks >= 71 && marks<=100) {
			System.out.println("A Grade");	
		}
		else if (marks>=61 && marks <=70) {
			System.out.println(" B Grade");	
		}
		else if ( marks>=0 && marks<=60) {
			System.out.println("C Grade");	
		}
		else  {
			System.out.println("Wrong input");
			System.out.println("plz type within range");
			
		}	
	}
	
	
	
	public static void getNestedIf() {
		int marks= 49;		
		if (marks>25) {
			if (marks>50) {
				if (marks>75) {
					System.out.println("Congratulations");
				}
				else {  System.out.println("soory less than 75 marks"); // can use else here
				}
			}
			else {System.out.println("soory less than  50 marks");
			}
		}
		else {System.out.println("soory less than 25 marks");
		}
	}
	
	
	
	
	public static void getSwitch() {
		int month = 3;
		switch (month) {
		case 1 :  // variable data type(int method) and case label(1) should be same datatype
			System.out.println("jan");
			break;
		case 2 :
			System.out.println("feb");
			break;
		case 3 :
			System.out.println("mar"); // if break is not given to all cases prints after 3,even deafault prints
			break;
		case 4 :
			System.out.println("apr");
			break;
		default: // default can be placed anywhere
			System.out.println("out of range");
		case 5 :
			System.out.println("may");
			break;
			
		case 6 :
			System.out.println("jun");
			break;
		case 7 :
			System.out.println("jul");
			break;
		case 8 :
			System.out.println("aug");
			break;
		case 9 :
			System.out.println("sep");
			break;
		case 10 :
			System.out.println("oct");
			break;
		case 11 :
			System.out.println("nov");
			break;
		case 12 :
			System.out.println("dec");
			break;
		}
	}
	
}
