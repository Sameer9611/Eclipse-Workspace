
public class HomeLoan extends Loan  {
	int loanNo=101;// want to call this // if this was static(line 8)
	
	public void getLoanData() { // overridden
		System.out.println("User class child method");
		super.getLoanData();//prints: "Loan class parent method"// non static so legal
		//System.out.println(loanNo);>> able to call directly anywhere in class without this keyword
	}
	public void test() {// this keyword can call variable method from class in any method of that class
		int loanNo= 300; // local variable with local scope with in method
		System.out.println(loanNo);//300
		
		HomeLoan homeloan= new HomeLoan();
		System.out.println(homeloan.loanNo);//101: old method of calling class level data or method
	
		System.out.println(this.loanNo); //101 new method :this
		
		
		//this.test(); : can use in non static : causes infinte loop here
		
		this.getLoanData();// prints :"User class child method".// in case of multiple overloded methods; it will call base on  variables
	
		// super>>>>>>>
		
		Loan loan = new Loan();//old method//object of parent class or Loan loan = new HomeLoan();
		System.out.println(loan.loanNo);//50  >>calling parent class variable 
		//System.out.println(Loan.loanNo);>> if variable was static it could have call like this >> no need of super
		
		
		System.out.println(super.loanNo); //50//new method
		
		
		
		
	} 
	public static void main(String[] args) {
		HomeLoan homeloan= new HomeLoan();
		homeloan.test();   // old method :to call object creation and calling but have to use it
	
		//this.test();error >> but cannot use it here: cannot use in static method
		
		Loan loan = new Loan();
		loan.getLoanData(); //prints: "Loan class parent method"//
		//old method of calling parent method by creating object
		
		//super.getLoanData();>> error>>super not used in static context>> but can call in any other non static method
	
	}
	
}
