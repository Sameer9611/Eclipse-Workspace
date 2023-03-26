package com.demo1;

public class Demo2 extends Thread{
	public void run() {//public void run: have to type : does not tell us
			for(int i=0; i<10;i++) {
				try {
					Thread.sleep(500);// this just replicates the code is too long: to show that 2 threads get mixed
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}	
	}
	
	
	
	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2(); //also when to execute multiple threads is decided by Thread Scheduler
		d1.start();//so instead of completing 01234556789 then going to  another how does
		d2.start();// 00112233.. happens
	}

}
//As you know well that at a time only one thread is executed. If you sleep a thread for the specified time, the thread scheduler picks up another thread and so on.//Whenever the Thread.sleep() methods execute, it always halts the execution of the current thread.
//Whenever another thread does interruption while the current thread is already in the sleep mode, then the InterruptedException is thrown.
//If the system that is executing the threads is busy, then the actual sleeping time of the thread is generally more as compared to the time passed in arguments.
