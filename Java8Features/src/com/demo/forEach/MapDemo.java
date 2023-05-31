package com.demo.forEach;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<String, String> names=new HashMap<String, String>();
		names.put("sameer", "ghogare");
		names.put("shanaya","godbole");
		names.put("sarang", "patil");
		
		System.out.println(names);//{sameer=ghogare, shanaya=godbole, sarang=patil}
		
		//foreach can be used to itterate
		names.forEach((a,b)->System.out.println("key is>>"+a+" value is>>"+b));
		//most simple method to itterate a map else iterator .entryset,hasnext,next,keyset,getvalue(key)
		
		
	}

}
