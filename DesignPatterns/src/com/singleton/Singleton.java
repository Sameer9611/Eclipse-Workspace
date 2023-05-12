package com.singleton;
//The Java.lang.Cloneable interface is a marker interface.
//It was introduced in JDK 1.0. There is a method clone() in the Object class.
//Cloneable interface is implemented by a class to make Object.clone() method valid thereby making field-for-field copy. 
//This interface allows the implementing class to have its objects to be cloned instead of using a new operator.
public class Singleton implements Cloneable{
	
	private static  Singleton singletonObj;//made a field to make avaliable in if statement and static to call it in getinstance method
	
	
	private Singleton() {//private constructor makes it im-possible to create object directly outside this class also cannot extend this class due this
		super();

	}
	
	
	public  synchronized static Singleton getInstance() {//have always access this method to get object(made static so object is not required to call it)
		if(singletonObj==null) {// to make this (singletonObj)name availiable here have to make it a field 
		singletonObj = new Singleton();//if else actually restrictxsfrom creating new object every time
		return singletonObj;
		}
		else {
			return singletonObj;
		}
	}//also made thread safe so at a time one thread can acccess and multiple objects are not created
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super().clone();>>by default this comes
		return singletonObj;//returned the same Object
	}
	
	
	public static void main(String[] args) {
		Singleton singleton1 =Singleton.getInstance();
		System.out.println(singleton1.hashCode());//2018699554 before overriding clone method//after>>2018699554
		
		try {
			Singleton singleton2 = (Singleton) singleton1.clone();
			System.out.println(singleton2.hashCode());//1311053135 before overloading clone method//after>2018699554
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
