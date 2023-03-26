
public class Test {
	public static void main(String[] args) {
		//case1
		
		//reference child class(stored in child class,called here in test) = object of child class (allowed)
		SBIbank sbibank1 = new SBIbank(); // old technique(but now written in another class (test)
		System.out.println("case 1");
		System.out.println(sbibank1.x);// p: 20
		System.out.println(sbibank1.y);//p: 40 y is in both child and parent(but will access of child)(reference pn apla,object pn apla)
		System.out.println(sbibank1.z);//p: 50
		sbibank1.m1();//p:RBI class m1 method
		sbibank1.m2();//p:SBI class m2 method  //overriding method,.both have same method,will access the method of class whose object is created(here,new SBIbank();
		sbibank1.m3();//p:SBI class m3 method
		System.out.println("----------------------------------------------------------");
	
		
	
	 	//case2
	
		RBIbank rbibank2 = new RBIbank();//old technique (but now written in another class (test)	
		System.out.println("case 2");
		System.out.println(rbibank2.x);//20
		System.out.println(rbibank2.y);//30(reference pn bapacha, object pn bapacha, tychich manmami)(40 will not accessed cause it have y and child will also not give)
		//System.out.println(rbibank1.z); not accessible as no mention of child class in line 20(by default also child will not give) 
		
		rbibank2.m1();//RBI class m1 method
		rbibank2.m2();//RBI class m2 method overriding method
		//rbibank1.m3(); method not accessible as no mention of child class in line 20(by default also child will not give) 
		System.out.println("----------------------------------------------------------");
	
		
		//case3
		//SBIbank rbibank3 = new RBIbank(); ----> not possible so not taken
		RBIbank rbibank3 = new SBIbank();//apn(SBI) bapachya(RBI) gharat ahe ata 
		System.out.println("case 3");
		System.out.println(rbibank3.x);//20
		System.out.println(rbibank3.y);//30(overriding dont work here)
		
		rbibank3.m1();//RBI
		rbibank3.m2();//SBI //method overriding:object jyacha tech access 
		//rbibank3.m3()// not accessible (apn bapa chya ghari ahe so to aple seperate plans ek chalu det nhie apla to)
	
		//System.out.println(rbibank3.z);//not accessible(apn bapa chya ghari ahe so to aple seperate plans ek chalu det nhie apla to)
		System.out.println("----------------------------------------------------------");
		
		
		
		
		//case4
		
		RBIbank rbibank4 = new RBIbank();
		SBIbank sbibank4 = new SBIbank();
		rbibank4 = sbibank4;
		//ie.
		//RBIbank rbibank4= new SBIbank(); -->bit jambling 
		//similar to case 3
		System.out.println("case 4");
		System.out.println(rbibank4.x);//20
		System.out.println(rbibank4.y);//30(overriding dont work here)
		//System.out.println(rbibank4.z);//not accessible(apn bapa chya ghari ahe so to aple seperate plans ek chalu det nhie apla to)
		
		rbibank4.m1();//RBI
		rbibank4.m2();//SBI //method overriding:object jyacha tech access 
		//rbibank4.m3()// not accessible (apn bapa chya ghari ahe so to aple seperate plans ek chalu det nhie apla to)
		System.out.println("----------------------------------------------------------");
		
		//case5
		RBIbank rbibank5 = new RBIbank(); // same objects of case4
		SBIbank sbibank5 = new SBIbank();
		//sbibank5=rbibank5;--->typecasting syntax error
		sbibank4 =(SBIbank)rbibank4;//----->narrowing
		// ie. SBibank sbibank4 = new SBIbank();
		// same as condition case 1
		System.out.println("case 5");
		System.out.println(sbibank1.x);// p: 20
		System.out.println(sbibank1.y);//p: 40 y is in both child and parent(but will access of child)(reference pn apla,object pn apla)
		System.out.println(sbibank1.z);//p: 50
		sbibank1.m1();//p:RBI class m1 method
		sbibank1.m2();//p:SBI class m2 method  //overriding method,.both have same method,will access the method of class whose object is created(here,new SBIbank();
		sbibank1.m3();//p:SBI class m3 method
		System.out.println("----------------------------------------------------------");
	
		
	
		
		//case6
		RBIbank rbibank6 = new SBIbank();
		SBIbank sbibank6 = new SBIbank();
		//sbibank6 = rbibank6;//--> (left side sbi(child) is not allowed,so error) gives error(invalid narrowing syntax)(narrowing? long ---> int is narrow typecasting)
		//ie.
		//SBIbank sbibank6 = new SBIbank(); ---> even though this is translation but not allowed.(atleast side rbi ojectname)
		sbibank6=(SBIbank)rbibank6; //-->compare line 47,ribank4 is told to be SBIbank for some time by narrow type casting
		//ie. again conditon becomes case 1 : SBIbank sbibank1 = new SBIbank();  
		System.out.println("case 6");
		System.out.println(sbibank6.x);// p:20
		System.out.println(sbibank6.y);//p:40
		System.out.println(sbibank6.z);//p: 50
		sbibank6.m1();//p:RBI class m1 method
		sbibank6.m2();//p:SBI class m2 method  //overriding method,.both have same method,will access the method of class whose object is created(here,new SBIbank();
		sbibank6.m3();//p:SBI class m3 method
		System.out.println("-------------------------------");
		
		//case7
		RBIbank rbibank7 = new SBIbank(); // objects same as case6
		SBIbank sbibank7 = new SBIbank();
		rbibank7 = sbibank7;
		//ie. RBIbank rbibank7 = new SBIbank(); 
		// similar to case3
		System.out.println(rbibank2.x);//20
		System.out.println(rbibank2.y);//30(refenrence pn bapacha, object pn bapacha, tychich manmami)(40 will not accessed cause it have y and child will also not give)
		//System.out.println(rbibank1.z); not accessible as no mention of child class in line 20(by default also child will not give) 
		
		rbibank7.m1();//RBI class m1 method
		rbibank7.m2();//SBI class m2 method
		//rbibank1.m3(); method not accessible as no mention of child class in line 20(by default also child will not give) 
		System.out.println("----------------------------------------------------------");
	
		
		
		int id =103;
		short s = (short)id;  //---> narrow typecasting sytaxx
		
		short ss =104;
		long l = ss; //type casing with not narrowing(widening)
		// small(short) gets stored in big(long)
		
		/*reference jycha sangada tych:
		parent reference:(sangada parent cha)/ all other not accesible
		child refernce:(sangada parent +child cha)

		variable ,values pn sanghada valyachya(common or non comman, no matter)

		method values pn sanghada valyachya
		( exception:common method values matra object(method override hote so, values hot nhiet) chya)

		basic priciple: child ref = parent obj (error)

		 */
		
		
	
	
	
	
	
	}
		

}
