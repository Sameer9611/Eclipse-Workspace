import java.io.Serializable;
// serializable is an interface
// if parent is serializable childs also become serializable
// just to show we have created parent child classes
public class Serial1 implements Serializable {
	static int x=69;// static makes it class related hence accessiable directly without objects
	int a=5;
	int b =6;// also can just declare>>constructor with args>>initialize through objects();
	 transient String name= "sam"; // if made transent cannot serialize the value and provides null when deserialized 
	@Override
	public String toString() {
		return "Serial1 [a=" + a + ", b=" + b + ", name=" + name + "]";
	}
	

}
// serialization and deserialization stores object and then retrives object 
//just like if a game we exit it in middle gets continued when open 
// there serialization deserialization happens