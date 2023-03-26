
public class Object_Count {
	static int count; // ie. count = 0
	
	Object_Count(){  // constructor with default AS. 
		count++;
	}
	public static void getObjectCount() { // static int is accessible directly in static methods
		System.out.println("Number of objects are: "+count);
	}
	public static void main(String[] args) {
		Object_Count object_count1=new Object_Count();
		Object_Count object_count2 =new Object_Count();
		Object_Count object_count3= new Object_Count();
		Object_Count object_count4= new Object_Count();
		getObjectCount();
	}
}
/* flow of code:
 * as multiple objects can call same constructor if arguments type as same
 * here, both objects and constructor have no arguments hence, they all can call same constructor again and again
 * as every object goes back to constructor count increases by +1
 *and get stored in static int count(single copy)
 *then we just print that number
*/
