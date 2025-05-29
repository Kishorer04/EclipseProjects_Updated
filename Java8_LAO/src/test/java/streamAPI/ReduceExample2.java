package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample2 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6,4,55,32,19,3);
		
		//not using identity
		
		Optional<Integer> maxValue = nums.stream()
		.reduce((num1,num2)->Math.max(num1, num2));
		System.out.println(maxValue.get());
		
		//or
		
		Optional<Integer> maxValue1 = nums.stream()
		.reduce(Integer::max);
		System.out.println(maxValue1.get());
		
		Optional<Integer> minValue = nums.stream()
		.reduce((num1,num2)->Math.min(num1, num2));
		System.out.println(minValue.get());
		
		//or
		
		Optional<Integer> minValue1 = nums.stream()
		.reduce(Math::min);
		System.out.println(minValue1.get());
		
		
		long count = nums.stream()
		.count();
		System.out.println(count);
		

	}

}
