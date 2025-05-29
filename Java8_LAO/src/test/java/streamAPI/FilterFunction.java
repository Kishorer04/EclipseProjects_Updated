package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterFunction {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,3,4,27,8,6);
		
		
		List<Integer> evenNum = nums.stream()
		.filter(n->n%2==0)              //Intermediate function
		.collect(Collectors.toList());  //Terminal function
		
		evenNum.forEach(n->System.out.println(n)); //Terminal function
		
		
//		for(Integer eN : evenNum)
//			System.out.println(eN);

	}

}
