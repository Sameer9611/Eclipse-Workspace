package com.demo;

public class StringDemo {
	
	public static void main(String[] args) {
	//1)String Literal: memory efficient--> performance improved
	String s1="Rohit";//1 obj in SCP(heap's part)
	String s2="Rohit";//same object refered with diff name
	String s3="Rohit";//same object refered with diff name
	String s4="Rohit";//same object refered with diff name
	String s5="Rohit";//same object refered with diff name
	System.out.println(s1.equals(s2));//true
	System.out.println(s2.equals(s5));//true
	System.out.println(s2.equals(s4));//true
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());// same hashcode cause same object 
	
	//2)By using New Keyword--->not efficient -->can have 2 objects with same string(in heap only)
	String s6=new String("sachin");//2obj>>1 heap(due to new),1 SCP("due to literial")
	String s7=new String("sachin");//1 obj -->heap(even tho it is already present)
	System.out.println(s6.equals(s7));//true as content is same even if reference names is diff(obj equals)
	System.out.println(s6.hashCode()+" new");
	System.out.println(s7.hashCode()+" new");//>as equals is true / hashcode is same
	String s8 ="sachin";//0 obj created-->already present in SCP(line17)
	String s9="sachin";
	String s10 =new String("Tendulkar");//2 obj created-->1 heap , 1 SCP
	System.out.println(s6.equals(s7)+" new");//true (content is tho obj are diff)
	System.out.println(s7.equals(s8)+" new");//True (content same even tho diff Areas)
	System.out.println((s6==s7)+" ==");//false//checks for pointings,if difference reference point same object returns true//else even if content is same can return false
	System.out.println((s8==s9)+" ==");//true// same objs in SCP with multiple reference hence true
	
	
	String s11 = "velocity";
	String s12 = new String("pune");
	s12=s11;//String s12=new String("velocity'); now s12 refers Velocity(in heap);s11 refers velocity(in SCP); pune gets deleted as chached gets cleared 
	System.out.println(s11);//velocity
	System.out.println(s12);//velocity
	System.out.println(s11.equals(s12)+" new");//content same(always true = used)
	System.out.println((s11==s12)+" new");//always true when = used
	System.out.println(s11.hashCode());
	System.out.println(s12.hashCode());//hashcode same due to =
	
	}
}
