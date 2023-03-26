
public class ArrayToString {
	public static void main(String[] args) {
		System.out.println(new ArrayToString().convert());
	} 
	public String convert() {
		char[]nameLetters= {'s','a','m','e','e','r'};
		int[]xyz= {1,2,3,4,5,6};
		
		//String name="nameLetters";>>error>>nameLetters acts as just a word
		String name=new String(nameLetters);//constructor types
		return name;
		//can be array of anything byte ,String(error) ,byte(int>>error no such constructor allowed) 
	}

}
