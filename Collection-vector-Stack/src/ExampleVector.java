import java.util.Vector;

public class ExampleVector {
	//java 1.0 --->legacy classs-->not used much
	//Iterable(I)>Collection(I)>List(I)>AbstractList(C)>Vector(C)
	//insertion order preserved//duplicates allowed//null n no of times allowed
	//duplicates allowed//also implements Serializable,clonable,Randomaaacess(marker)>>DS-->Growable array
	//best choice for retrival>>>>worst for adding or deleting>it does its work but takes time 
	//all same like Arraylist below differences
	
    //vector default size=10-->extending capcity-->new_cap=old_cap*2
	//Vector methods are Sychronized -->hence vector objects is Threadsafe(1thread at time)==>low performance
	//Arraylist is not Sychronized-->not threadsafe==>high performance
	public static void main(String[] args) {
		Vector<Integer> marks =new Vector<Integer>();
		marks.add(34);
		marks.add(45);
		marks.add(34345);
		marks.add(344);
		marks.add(3455);
		System.out.println(marks);

	}

}
