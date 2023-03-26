package com.overloading;

public class Demo {

	public void getAddition(int a, int b) {
		System.out.println(" int , int ");
		int sum = a + b;
		System.out.println("Addition is>>" + sum);
	}

	public void getAddition(int a, int b, int c) {
		System.out.println(" int , int , int ");
		int sum = a + b + c;
		System.out.println("Addition is>>" + sum);
	}

	void getAddition(float a, int b) {
		System.out.println("float, int");
		float sum = a + b;
		System.out.println("Addition is>>" + sum);
	}

	public float getAddition(int a, float b) {
		System.out.println(" int, float");
		float sum = a + b;
		System.out.println("Addition is>>" + sum);
		return sum;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();

		demo.getAddition(80.5f, 25);
		demo.getAddition(10, 20, 30);
		demo.getAddition(10, 55.78f);
	}

}
