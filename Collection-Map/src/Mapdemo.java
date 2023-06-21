import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//-version->1.2
//-key Value
//-Data stored on based of key hence it should be unique
//-insertion order is not preserved
//-if key is duplictae>no error>but it overides the value of key and stores only one key but can have duplicate values(ofcourse)
//-null key and null value possible(both null also possible)
//-insertion order is not preserved
//-set,list>>add();
//-Map>>Object Put();
//-Default capacity->16
//-New capacity->16*2(at o.75 deafult fill ratio)ie at 13
//can change default capacity but cannot getcapcity
//cannot get index even due to index collison reason;also random insertion even tho index is used internally
public class Mapdemo {
	
	public static void main(String[] args) {
	HashMap hm = new HashMap();	
	hm.put("sam", 1);//possible if raw type
	//hm.put(2, "john");//possible as not genrics
	hm.put(null, null);//only 1 null as key allowed
	hm.put("john",2 );
	hm.put("nayan",2);//value can be duplicate no problem
	hm.put("vivek", 3);
	hm.put("vivan", 4);
	hm.put("anirudh", 5);
	hm.put("anirudh", 6);//duplicate gets overridden
	
	System.out.println(hm);//{null=null,vivan=4, vivek=4, john=2, anirudh=6, sam=1, nayan=2}
	System.out.println(hm.entrySet());//[null=null,vivan=4, vivek=4, john=2, anirudh=6, sam=1, nayan=2]-->set of Entries
	System.out.println(hm.get("sam"));//1
	System.out.println(hm.getOrDefault("sa", "notfound"));//notfound// get or deafault
	System.out.println(hm.size());//7//getting capacity has no method
	
	
	System.out.println(hm.keySet());//returns the set of keys>>>as single items non duplicate,no insertion order[null, vivan, vivek, john, anirudh, sam, nayan]
	
	Set<String>set=hm.keySet();//returns a settype(any) data so stored in set
	Iterator<String> ir=set.iterator();//now can itterate keys and get values by>1)while2)foreach
									// or use Entey set and access values from 1)while 2)foreach
	while(ir.hasNext()) {
		String s = ir.next();
		System.out.println("key is>>>"+s);
		System.out.println("value is>>>"+hm.get(s));//look on 'hm' we can access get method not on 'ir'
//		key is>>>null
//		value is>>>null
//		key is>>>vivan
//		value is>>>4
//		key is>>>vivek
//		value is>>>3
//		key is>>>john
//		value is>>>2
//		key is>>>anirudh
//		value is>>>6
//		key is>>>sam
//		value is>>>1
//		key is>>>nayan
//		value is>>>2
		
	}
	System.out.println("-------------------------------------------------------");
	Set<String>set1=hm.keySet();
	for(String s:set1) {
		System.out.println("key is>>>"+s);
		System.out.println("value is>>>"+hm.get(s));
//		key is>>>null
//		value is>>>null
//		key is>>>vivan
//		value is>>>4
//		key is>>>vivek
//		value is>>>3
//		key is>>>john
//		value is>>>2
//		key is>>>anirudh
//		value is>>>6
//		key is>>>sam
//		value is>>>1
//		key is>>>nayan
//		value is>>>2
	}
	System.out.println("--------------------------------------------------------");
	
	Set<Entry> set2=hm.entrySet();//>>>Set<Entry<String,Integer> set2=hm.entrySet();----incase of homogenous
	//hm is a hashmap converitng to entryset and string it in Set of Entry<> generics
	Iterator<Entry> ir2 =set2.iterator();//>>>Iterator<Entry<String,Integer>>ir2=set2.iterator();
	
	while(ir2.hasNext()) {
		Entry entry =ir2.next();//>>>Entry entry<String,Integer> =ir2.next();
		System.out.println("key is>>>"+entry.getKey());
		System.out.println("value is>>>"+entry.getValue());
//		keyy is>>>null
//		value is>>>null
//		keyy is>>>vivan
//		value is>>>4
//		keyy is>>>vivek
//		value is>>>3
//		keyy is>>>john
//		value is>>>2
//		keyy is>>>anirudh
//		value is>>>6
//		keyy is>>>sam
//		value is>>>1
//		keyy is>>>nayan
//		value is>>>2
	}
	for (Entry entry : set2) {
		System.out.println("key iss>>>"+entry.getKey());
		System.out.println("value iss>>>"+entry.getValue());
//		key iss>>>null
//		value iss>>>null
//		key iss>>>vivan
//		value iss>>>4
//		key iss>>>vivek
//		value iss>>>3
//		key iss>>>john
//		value iss>>>2
//		key iss>>>anirudh
//		value iss>>>6
//		key iss>>>sam
//		value iss>>>1
//		key iss>>>nayan
//		value iss>>>2
		
		

		
		
	}
	
	
	
	//direct itteration of key and value by .forEach((datatye1 d1,datatype2 d2)->lambda sout) method
	HashMap<Integer,String> hashmap = new HashMap<Integer,String>();//homogenous
	hashmap.put(1,"one");
	hashmap.put(2, "two");
	//System.out.println(h);//{}
	hashmap.forEach(( i, s)->System.out.println("key is "+i+" and value is "+s));//key is 1 and value is one //hashmap.forEach(( Integer i,String s)->System.out.println("key is "+i+" and value is "+s));>>could also work
																				//key is 2 and value is two


	}

}

//Constructors -
//
// 1.HashMap hs = new HashMap();
//   default capacity = 16
//   default fill ratio = 0.75
//
// 2.HashMap hs = new HashMap(int initial_cap);
//    HashMap hs= new HashMap(20);
//
// 3.HashMap hs = new HashMap (int initial_cap, float fill ratio);
//
// 4.  1.HashMap hs = new HashMap(Map m);>>why not Collection c>>here we deal with key value key value 
//

