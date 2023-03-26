package com.array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//javaversion-->1.2
//Iterable(I)>Collection(I)>List(I)>AbstractList(C)>ArrayList(C)
//insertion order preserved//duplicates allowed//null n no of times allowed
//duplicates allowed//also implements Serializable,clonable,Randomaaacess(marker)>>DS-->Growable array
//best choice for retrival>>>>worst for adding or deleting>it does its work but takes time 
//deafult size=10---extended formulas 1.7version:(new cap=((old_cap/3)*2)+1)   1.8version new_cap=old_cap+old_cap>>1(rightshift 1)10+10/2raise1=15
//DS-->arraylist->resizable or growable array
 public class Arrray {
	
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		//list1= {"sam","pramod"};>>does not work
		list1.add("sam");
		list1.add("priya");
		list1.add("prachi");//index preserved
		list1.add("prachi");//duplicates allowed
		list1.add("sejal");		
		list1.add(null);//null allowed

		ArrayList<String> list2= new ArrayList<>();
		list2.add("sachin");
		list2.add("dhoni");
		list2.add("john");
		list2.add("shreyas");
		System.out.println(list2.indexOf("sachin")+" index");//>>only possible in lists as insertion is only preserved here(exception linkeshashset:cannot use here even tho insertion order is preserved)
		
		Collections.sort(list2);//something different>>justlike treeset
		System.out.println(list2);//sorts according to alphabets[dhoni, john, sachin, shreyas]
		
		ArrayList<String> list3= new ArrayList<>();
		list3.addAll(list1);//addAll(collection cha object ie. like list1)
		list3.addAll(list2); 
		System.out.println(list3);
		
		list3.remove(3);
		System.out.println(list3);//removes prachi>>can use remove>
		//but not recomended to usearraylist for such purpose.
		
		System.out.println(list3.get(3));//sejal
		
		System.out.println(list3.size());//9
		
		System.out.println(list3.contains("sachin"));//true>>takes Object o
		
		System.out.println(list3.containsAll(list2));//true>>takes Collection c
	
		
		//method 1:of itteration
		Iterator<String> ir =list3.iterator();//>>Iterator ir =list3.iterator(); >> would work but tells to initialize the generic
		System.out.println(ir);//java.util.ArrayList$Itr@7852e922
		while(ir.hasNext()) {//hasnext,next works on iterator 
			System.out.println(ir.next());
//			sam
//			priya
//			prachi
//			sejal
//			null
//			sachin
//			dhoni
		}
		
		//method 2:of itteration
		for (String s : list3) {//if Arraylist list3 is Hetrogenious use Object o> as it is parent of everything
			System.out.println(s);
//			sam
//			priya
//			prachi
//			sejal
//			null
//			sachin
//			dhoni
		}
		
		//method 3 : list3 .foreach() with lambda
		list3.forEach( i->System.out.println(i));//any letter(i) will print its contents(can use any other than sout)//		list3.forEach((String i)->System.out.println(i));//any letter(i) will print its contents(can use any other than sout)

//			sam
//			priya
//			prachi
//			sejal
//			null
//			sachin
//			dhoni

		//how to sychronize arraylist
		
		ArrayList<String> list4= new ArrayList<>();
		List<String> al=Collections.synchronizedList(list4);//ArrayList<String>  al=(ArrayList<String>)Collections.synchronizedList(list4);
		//now 'al' is thread safe or Synchronized												//need typecasting to do this
																								
		
//		List<String> list =new ArrayList<String>();--->lossly coupled(note:List is a interface) we have done this earlier(parent child object)
//		ArrayList<String> list1= new ArrayList<>();--->tightly coupled
		
	 
	
	
	}

}
