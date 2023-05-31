package interview_Java8_Questions;

import java.util.Arrays;
import java.util.List;


public class Problem4 {
//Q4 Given the list of integers, find the first element of the list using Stream functions?
//Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?
//Q6 Given a list of integers, find the maximum value element present in it using Stream functions?

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		myList.stream().findFirst().ifPresent(x->System.out.println(x));
		
		
		long count =myList.stream().count();
		System.out.println(count);//9
		
		int max =myList.stream().max(Integer::compareTo).get();
		System.out.println(max);
		
	}


}
