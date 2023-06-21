
public class Chaining_Constructor {
	  Chaining_Constructor(){
		this(34);
		System.out.println("no arg: parent constructor");
	}
	Chaining_Constructor(int i){
		this(34,"sam");
		System.out.println("int arg: parent constructor");
	}
	Chaining_Constructor(int i, String name){
		System.out.println("int,string: arg parent constructor");
	}

}
