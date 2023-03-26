
public class Demo {
	public static void main(String[] args) {
		String name =" Hi i am sam and friends call me sam ";
		String name1="hi I am Sam";
		String name2="hi i am sam";
		System.out.println(name.charAt(4));//i
		System.out.println(name.concat(" i am from bavda"));//hi i am sami am from bavda//it does not manumulate orignal just add to print here(buffer can be append)
		System.out.println(name.equals(name1));//false//checks for content
		System.out.println(name1.equalsIgnoreCase(name2));//true
		System.out.println(name.substring(5));//am sam(5=a)
		System.out.println(name.substring(8, 11));//start (index,end index+1)(s=8,m=10)
		System.out.println(name.length());//11(includes spaces also)
		System.out.println(name.replace('s', 't'));// Hi i am tam and friendt call me tam //' 'can only have 1 character in between 
		System.out.println(name.replace("sam", "jack"));//Hi i am jack and friends call me jack
		System.out.println(name.replaceAll("sam", "john"));//Hi i am john and friends call me john
		System.out.println(name.replaceFirst("sam", "john"));//replaces only first sam:Hi i am john and friends call me sam
		System.out.println(name.toLowerCase());//hi i am sam and friends call me sam(watch h)
		System.out.println(name.toUpperCase());//HI I AM SAM AND FRIENDS CALL ME SAM
		System.out.println(name.trim());//removes blanks if present at start or end
		System.out.println(name.indexOf('i'));//2//returns -1 if i not present
		System.out.println(name.lastIndexOf('i'));//19//returns -1 if i not present
		System.out.println(name.hashCode());//-2137257222
		if(name.charAt(1)=='H') {
			System.out.println("h at 1");
		}
	}

}
