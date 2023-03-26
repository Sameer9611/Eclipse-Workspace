import java.util.Stack;

public class ExampleStack {
	//Iterable(I)>Collection(I)>List(I)>AbstractList(C)>Vector(C)->Stack(C)--------------stack is child of Vector
	//designed based on First in Last Out(LIFO)>>just like shirts packed in bag
	public static void main(String[] args) {
		
		Stack s = new Stack();//even tho it is child of of vector>still cannot set size like LinkedList
		s.add(45);
		s.add("sam");
		s.add(null);
		s.add('s');
		System.out.println(s);//[45, sam, null, s]>>stores according to index>>so why FILO>>cause its basic methods pop,peek works on last or top member
		System.out.println(s.get(0));
		
		s.push(47);//just like add()>>pushing shirts in bag
		System.out.println(s);//[45, sam, null, s,47]
		
		System.out.println(s.pop());//47//returns and deletes top or last added member
		System.out.println(s);//[45, sam, null, s]
		
		System.out.println(s.peek());//s//only returns last or top inputed member
		
		System.out.println(s.indexOf('s'));//3
		System.out.println(s.search('s'));//1//he java.util.Stack.search(Object element) method in Java is used to search for an element in the stack and get its distance from the top. 
										  //This method starts the count of the position from 1
										  //else not found:-1
	}

}
