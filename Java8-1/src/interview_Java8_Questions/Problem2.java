package interview_Java8_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem2 {
//Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,23,123,23,123,23,145);
		Stream<Integer> ss=nums.stream().filter(x->x.toString().startsWith("1"));
		ss.forEach(x->System.out.println(x));
	}
}

/*website Answer
  
  public static void main(String args[]) {
 
    List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
    myList.stream()
          .map(s -> s + "") // Convert integer to String
          .filter(s -> s.startsWith("1"))
          .forEach(System.out::println);
*/