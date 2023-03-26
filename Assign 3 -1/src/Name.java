
public class Name {
	public static void main(String[] args) {
		Name getstudentName1 = new Name();
	   String s = getstudentName1.getstudentName("Sameer Pramod Ghogare");
		System.out.println("Name is>> "+ s);
	}
	public String getstudentName(String name) {
		return name;
	}
}