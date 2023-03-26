
public class Static_Keyword {
	int x = 9611;          //saved in heap memory after object creation// these are global(instance) variables
	static int y = 4041;   // saved in heap memory before object creation
	
	public static void main(String[] args) {
		//System.out.println(x); //error cause it is not saved yet to memory
		Static_Keyword static_keyword1 =new Static_Keyword();
		y=4042; //directly accessible(due to static variable)or can write static_keyword1.y
		static_keyword1.x=9612; //using object
		System.out.println(static_keyword1.x);//prints 9612
		System.out.println(y);//print 4042
		
		Static_Keyword static_keyword2 =new Static_Keyword();
		System.out.println(static_keyword2.x);//prints 9611>>as default global variable provides seperate copies(hence changes dont carry forward
		System.out.println(y);//prints 4042>>(change occurs as static variable provides common copy(1 unique copy)like attendance sheet(signs carry forward)
		 
		Static_Keyword static_keyword3 =new Static_Keyword();
		System.out.println(static_keyword3.x++);//prints 9611
		System.out.println(--y);//prints 4041
		Static_Keyword static_keyword4 =new Static_Keyword();
		System.out.println(static_keyword4.x--);//prints 9611
		System.out.println(static_keyword4.y--);//prints 4041
		Static_Keyword static_keyword5 =new Static_Keyword();
		System.out.println(static_keyword5.x++);//prints 9611
		System.out.println(++y);//prints 4041
		
		
	}
	
	
}
