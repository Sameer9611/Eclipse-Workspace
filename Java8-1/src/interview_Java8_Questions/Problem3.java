package interview_Java8_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {
	
	//Q3:How to find duplicate elements in a given integers list in java using Stream functions?
	
	public static void main(String[] args) {
		//List<Integer> nums= new ArrayList<Integer>();
		//nums.add(1);  class java.util.ArrayList
		
		
		List<Integer> nums= Arrays.asList(1,2,3,4,4,5,6,6,10);
		//System.out.println(nums.getClass()); //class java.util.Arrays$ArrayList
		Set<Integer> uniqueNums = new HashSet<Integer>();
		nums.stream().filter(x->!uniqueNums.add(x))//The add() method of the Set returns true if the element is not already in the set, and false otherwise. Therefore, the !set.add(n) expression will return true for elements that are already in the set, indicating that they are duplicates.
		.forEach(x->System.out.println(x));//4,6
		System.out.println(uniqueNums);//[1, 2, 3, 4, 5, 6, 10]
	
	}

}
//so ! just reverses the output of add method , yet add all unique nums to set, but filters the nums inside the stream with the ! condtion and then we itreate the stream