package interview_Java8_Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem1 {
	//Q1) Given a list of integers, find out all the even numbers exist in the list using Stream functions?
	
	public static void main(String[] args) {
		
		//conventional method
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
	
		List<Integer> numss= Arrays.asList(1,2,4,5,6,7,132,2,344);
	
		Stream<Integer> evennums=  numss.stream().filter(x->x%2==0);
		
		//evennums.forEach(x->System.out.println(x));//stream can only be used once
		evennums.forEach(System.out::println);
		
	}


}
