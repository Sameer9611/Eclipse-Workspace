package com.demo;
// if wew want a xerox copy of a object ( no need to create a new) just clone it
public class CloneDemo implements Cloneable{
	int id;
	String name;
	
	public CloneDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "CloneDemo [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo cd1 = new CloneDemo(102,"sam");
		cd1.clone();//throws error to add" throws declaration"
		// want to store this object in cd2
		
		//CloneDemo cd2 =cd1.clone();//>>error>> cannot convert from object(cd1.clone()) to class(CloneDemo)
		                           // user type casting
		
		CloneDemo cd2 =(CloneDemo)cd1.clone();//>> typecasted>>>this means: CloneDemo cd2 = new CloneDemo(102,"sam");
		System.out.println(cd1);
		System.out.println(cd2);
		//cd1=cd2;>>> below becomes true if we make them equal
		System.out.println(cd1.hashCode());//even if it is cloned its hashcode does not match as reference is different
		System.out.println(cd2.hashCode());
		System.out.println(cd1.equals(cd2));
		
	}

	

}
