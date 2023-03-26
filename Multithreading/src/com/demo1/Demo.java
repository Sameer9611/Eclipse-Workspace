package com.demo1;
//Thread class in java.lang package: not a abstract method as it overrides 
//run() method from Runable interface(has 1 method(abstract by default:run()) hence cannot be abstract but overides with empty body;
public class Demo extends Thread{
	public void run() {//public void run: have to type : does not tell us
		for(int i=0; i<10;i++) {
			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		//d.run();//0123456789 acts as a normally called method:d acts as normal object reference of object of class Demo
		d1.start();//0123456789 acts as a object of Thread class and Start calls run
		
		System.out.println("-----------------------------------------------------------");// as this takes less time to print this gets printed first
		System.out.println(d1.getId());//11// 
		System.out.println(d1.getName());//Thread-0 >>name
		d1.setName("sam");
		System.out.println(d1.getName());//sam >>> names the thread
		System.out.println(d1.getPriority());//5//The thread priority ranges from 1 to 10, while the default priority value of a thread is 5.
		d1.setPriority(2);//The larger the integer, the higher the priority. The thread scheduler uses this integer from each thread to determine which one should be allowed to execute
		System.out.println(d1.getPriority());//10
		System.out.println(d1.hashCode());//hashcode of object>>same only
		System.out.println(d1);//Thread[sam,10,]>>>[name,priority]>>prints without toString

		
		//so all these methods .getId,name,Priority gives Error if we remove Extends thread ya need to create object and then call methods
		
	}
	

}
