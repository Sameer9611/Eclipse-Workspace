import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial2 extends Serial1 {
	int c=6;
	String s ="yes";
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -67900306606719022L;// added by suggestion
	public void getSerialization() {
		Serial1 e1 = new Serial1();//we can create a object of example1(Example1 e1 = new Example1();) without extending accrn to rules of access specifiers but to have diff refernce and object we need parent child relation
		Serial2 e2 = new Serial2();//local object can be serialized as parent is serializable
		System.out.println(e1+"e1 object");// help of to string ::Serial2 [a=5, b=6, name=sam]//"sam" prints but does not transient(before to string:Serial2@7852e922)
		System.out.println(e2+"e2 object");//Serial2 [c=6, s=yes, a=5, b=6, name=sam]e2 object
		FileOutputStream fos;
		ObjectOutputStream oos ;
		try {
			fos = new FileOutputStream("D:\\SOFTWARES\\ECLIPS\\workspace\\Serialization-deserialization\\src\\SerializationFile.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);//something gets printed in file.txt(filetype format)
			oos.writeObject(e2);
			fos.close();
			oos.close();// or oss.flush();
			System.out.println("Serialization done");
		} catch (Exception e) {//Exception catches every thing
			e.printStackTrace();
		}	
	}
	
	@Override
	public String toString() {
		return "Serial2 [c=" + c + ", s=" + s + ", a=" + a + ", b=" + b + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		new Serial2().getSerialization();
	}
}
