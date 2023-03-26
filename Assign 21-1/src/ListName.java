import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListName {
	
	public List getListName() {
		ArrayList<String> name =new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Students:");
		int i=sc.nextInt();
		int j =1;
		while(j<=i) {
			System.out.print("Enter Name "+j+":");
			String nameInput=sc.next();
			name.add(nameInput);
			j++;
		}
		return name;
	}
	public static void main(String[] args) {
		List list=new ListName().getListName();
		Collections.sort(list);//remind of collections.sort() in case of lists
		Collections.reverse(list);//or can iterate the list to get a String of reverse names
		System.out.println(list);
	}
//	System.out.print("List in descending order>>")
//	for (int i = asendingList.size()-1;i>=0;i--)
//	System.out.print(asendingList.get(i) +" ");

}
