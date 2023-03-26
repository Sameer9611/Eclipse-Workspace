package com.demo;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
//this is my method in notes ther some other method
public class SortValue {
	public static void main(String[] args) {
		Map<String, Integer> name = new HashMap<String,Integer>();
		name.put("Ram", 3);
		name.put("Sohan", 2);
		name.put("Ashok", 1);
		name.put("Ajay", 2);
		name.put("Prasanna", 5);
		
		Set<String> set =name.keySet();
		LinkedList<Integer> listnum = new LinkedList<Integer>();
		LinkedList<String> listname = new LinkedList<String>();
		
		for (String i : set) {
			listname.add(i);
			Integer s=name.get(i);
			listnum.add(s);	
			
		}
		Collections.sort(listnum);
		System.out.println(listnum);//[1, 2, 2, 3, 5]
		System.out.println(listname);//[Prasanna, Ashok, Sohan, Ajay, Ram]


		Map<String, Integer> sortedName = new LinkedHashMap<String,Integer>();//linked needed to keep the insertion order preserved
		
		
		for(int i=0;i<listnum.size();i++) {
			for(int j =0;j<listname.size();j++) {
				if(listnum.get(i)==name.get(listname.get(j))) {
					sortedName.put(listname.get(j),listnum.get(i));
				}
				
			}
		}
		System.out.println(sortedName);//{Ashok=1, Sohan=2, Ram=3, Prasanna=5, Ajay=6}
		//sorting key= values according to values ascending order

		
		
				
		
	}

}
