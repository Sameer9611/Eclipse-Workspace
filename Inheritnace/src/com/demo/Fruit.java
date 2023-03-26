package com.demo;

public class Fruit {
	String colour;
	String taste; // if we make it final, or private error occurs in child class
	boolean isfruit=true;
	String shape;
	boolean isseedless=true;

}
//only point of this code is that only by making a class child
// and creating the object of that class itself 
// and by using the class.name we can recall parent class variables
//ie. we make a child class and due it is a child it gets all property of parent

// it just another class (don't get confused as if it is nested class)
//parent class is different,and child class is different(public private logic will also be applicable)
// we can get every thing form parent ,by using objects(child objects)
// but we cannot get anything from child class to parent class by using objects(parent obj).
// also same member if present in parent and child some rules differ.