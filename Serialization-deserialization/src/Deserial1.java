import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserial1 {//no need to implement deserializable
	public void getDeserialization() {
		try {
			FileInputStream fis = new FileInputStream("D:\\SOFTWARES\\ECLIPS\\workspace\\Serialization-deserialization\\src\\SerializationFile.txt");//always {""} use this else error>> hard to find error
			ObjectInputStream ois =new ObjectInputStream(fis);
			Object oj1= ois.readObject();// read object stream and store in object 'o'
			Object oj2= ois.readObject();//automatically reads next object and stores>>hence it is important to read the objects in same manner we serialized
			Serial1 s1 =(Serial1)oj1; // type casting object to class datatype//ie.instead of(Serial1 s1 = new Serial1();
			Serial2 s2 =(Serial2)oj2;// incase of multiple objects have to deserialize in the same way we did serialize
			System.out.println("deserialization done");
			System.out.println(s1);//Serial2 [a=5, b=6, name=null]//static fields(x) are class related not object related
			System.out.println(s2);//Serial2 [c=6, s=yes, a=5, b=6, name=null]
			System.out.println(s1.a);
			System.out.println(s1.b);//just ot show we have accesed the object from a file
			System.out.println(s1.name);
			System.out.println(s1.x);//this(static) can be acssed but not serialized 
			ois.close();
			} 
		 catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		new Deserial1().getDeserialization();
	}

}
