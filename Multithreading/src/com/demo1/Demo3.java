package com.demo1;
//It is a functional interface(java.lang). It can be used to create a thread. It has a single abstract method 'run'
//functional(has 1 method(ofcourse abstract)) is just another type like markup(has 0 methods:clonable,serializable)
public class Demo3 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			
			System.out.println(i);
		}
		
	}
	public void run(int s) {// how to call this no option, if int s removed>>error(duplicate)>>then int s where to give argu: in start()>>invalid
		System.out.println("in her");
		// so can only hav 1 run : other methods need to link to multiple threads through commands(methods) written here in "run" :interthread communication 
	}
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		//d.start();>>error>>have to create a Thread object and pass the object as parameter to it 
		Thread t = new Thread(d);//>>can create object directly as Thread class is present java.lang 
		t.start();
		//t.start();>>>No. After starting a thread, it can never be started again. 
		           //If you does so, an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception.		
	}

}
// use implements Runnable when want to extend this class to its parents(as multiple extends cannot be used)