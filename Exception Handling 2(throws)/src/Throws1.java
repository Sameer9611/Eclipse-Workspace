
// throws generally used in checked Exc(gets suggested). but no error if used in unchecked Exc.
public class Throws1 {
	public static void m1() throws Exception {// we can manually have declared throws Exception(unchecked),can give multiple exceptions
		System.out.println("First Line");	  // this only delgates the handling resposibity to caller method
		System.out.println("Second Line");    // but in case of unchecked it doesnt matter if we  dont deligate we will not have compiler time error and can handle directly in callermethod
		System.out.println("Third Line");     //it runs the same; (check by removing throws)
											  // in case of checked exception: we have to deligate(even if error is not there(clone:using this class itself tells to Clonethrows CloneNOtSupportedException to avoid any future Consequences  )), and if Exception occurs needs to be handled :try catch.
		int i = 10/0;// unchecked exception
		
		System.out.println("Fourth Line");// never returns back to complete this,but executes code nicely
	}
	public static void m2() {
		System.out.println("m2 method");
	}
		public static void main(String[] args)throws Exception {
		try {
			m1();
			m2();// will not reach m2 as exception caught at m1();
		}
		catch (Exception e) {
			e.printStackTrace();//same>>> sout(e);
		}
		System.out.println("After Try,Catch");
	}
// incase of Clone(CloneNotSupported) it is checked exception , it just suggests that Exception might occur plz use throws or try catch
// throws: delgate it to caller method, but if no error it  method, allows program to run systematically	
// try catch: actually handles it
}
