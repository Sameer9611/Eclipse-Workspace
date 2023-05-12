
public class OperatorTypes {  //class cannot be made static
	int Aaa = 23;
	int Bbb = 32;

	public static void main(String[]args) {
		OperatorTypes getAdd1 = new OperatorTypes();
		getAdd1.getAdd();
		getAddt();
		int b=10;
		double a = 3.3;
		double summ=a+b;
		System.out.println(summ);
		//float avg =b/a;
		//System.out.println(avg);
		
		int x =99;
		int y=999;
		String result = (x>y)?"x is greater":"y is greater";
		System.out.println(result);
		
	}
	public int getAdd(){
		int Add= Aaa+Bbb ;
		System.out.println("the addition is "+ (Add));
		return Add;
	}
	public static void getAddt(){ //2 option to get Aaa and Bbb into static method
		OperatorTypes getAdd1 = new OperatorTypes();// 1)is to make object here
		int Add= getAdd1.Aaa+getAdd1.Bbb ;            //2)or make global variable static
		System.out.println("the addition is "+ (Add));
	}
}


