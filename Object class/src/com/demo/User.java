package com.demo;
//object class: by default parent class of all, as it contains methods commonly used
// so gets inherited to all
public class User {
	int id;
	String name;
	
	public User(int id, String name) {
		super();// by default but no significance here
		this.id = id;
		this.name = name;
	}
	

	@Override// has it also present in object class which is parent and we overide here
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		User user = new User(101,"sam");// created parameterized const. so can give arguments here
		User user1 = new User(101,"sam");
		User user2= new User(101,"sam");
		
		
		
		System.out.println(user.getClass());//prints:class com.demo.User
		System.out.println(user.getClass().getSimpleName());//print:User// class name
		System.out.println(user.getClass().getName());//print:com.demo.User//package class name
	
		System.out.println(user);//1//prints: com.demo.User@7852e922 if toString method is not created from source
		//System.out.println(user.toString());//2// both have same output:                                 
		
		System.out.println(user.hashCode());//prints:2018699554
		System.out.println(user1.hashCode());//prints:1311053135 // even object value are same (unique ints)
		System.out.println(user2.hashCode());//prints:118352462
		
		System.out.println(user1.equals(user2));//false// even content same but as reference is different(in case of string equals(). checks for content)(== checks for reference)
		//System.out.println((user1==user2)+"xx");
		user1=user2; // user1 is made equal to user2(ie. ob
		//System.out.println(user1);//com.demo.User@70dea4e when to string is removed this gets print and it is same now
		//System.out.println(user2);//com.demo.User@70dea4e irrespective of variables
		
		System.out.println(user1.hashCode());//118352462 hashcode same
		System.out.println(user2.hashCode());//118352462
		System.out.println(user1.equals(user2));//true
		
		
	}

	

}


/*Object class: these have various methods in it:
 * 1. getClass():getClass.variouscommand(); gives details of objects (in 1000 line code)
 * 2.toString():string representation of object
 * 
 * 3.equals(): return type:boolean; checks equivalance of 2 objects
 * 			   - checks for reference of objects,not contents(in strings content)
 * 4.hashcode():returntype:int;unique code for every object
 * 		as	equals and hashCode is used together:
 * 		it has some contracts:
 * 		1) 2 object references are same(hence hashcode are same) (user1=user2) equals is true(line 40)
 * 		2) but if 2 objects are not equal but we cannot guarrantee there hashcode will be different	(0.00001%)
 * 		3) if hashcodes are same (ie. equals is true) we cannot say output will be same, as 2 objects 99.99% have different hashcodes but 0.01% can have same hashcode but differnt arguments and diff output yet equals is true
 * 		4) if hashcode not same ;equals will be false
 * 5.clone():  instead of creating another object(diff name) with same parameters we use clone to create a object
 * any many other.
 * 6.notify();
 * 7.notiftAll();
 * 8.wait();
 * 9.finalize();
 */
