import java.util.HashMap;
import java.util.HashSet;
/*
 myntra-->Categories--categories      //map


categories-->"Mens"--MensSection
		     "Ladies"--LadiesSection     //map
		     "Kids"--KidsSection

mensSection-->1)Jeans
		      2)Tshirt     //list
		      3)Shirts

ladiesSection-->1)Makeup Kit
			    2)Jeans       //list
			    3)Tops

kidsSection-->1)Toys
		      2)Caps    //list 
		      3)Ball
*/



public class ShopingApp {
	
	public static void main(String[] args) {
		
		HashSet<String> mensSection = new HashSet<String>();
		mensSection.add("Jeans");
		mensSection.add("TShirt");
		mensSection.add("Shirt");
		
		HashSet<String>ladiesSection = new HashSet<String>();
		ladiesSection.add("Makeup Kit");
		ladiesSection.add("Jeans");
		ladiesSection.add("Tops");
		
		HashSet<String>kidsSection = new HashSet<String>();
		kidsSection.add("Toys");
		kidsSection.add("Caps");
		kidsSection.add("Ball");
		
		HashMap<String,HashSet<String>> categories = new HashMap<String,HashSet<String>> ();
		categories.put("Mens",mensSection);
		categories.put("Ladies",ladiesSection);
		categories.put("Kids",kidsSection);
		
		
		
		HashMap<String,	HashMap<String,HashSet<String>>> Myntra = new HashMap<String,	HashMap<String,HashSet<String>>> ();
		Myntra.put("Categories", categories);
		
		System.out.println(Myntra);
		//{Categories={Mens=[Shirt, Jeans, TShirt], Ladies=[Makeup Kit, Jeans, Tops], Kids=[Ball, Toys, Caps]}}


		
	}

}
