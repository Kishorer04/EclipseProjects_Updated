package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
		
		Integer result= nums.stream()
		.reduce(0,(sum,elements)->sum+elements);
		
		System.out.println(result);
		
		//reduce is a terminal function
		//identity - initial value
		//accumulator - accumulator is a lambda expression/function that accumulates(joins) the values i.e. addition or multiplication
		
		
		//The above code is equivalent to:
		int sum = 0;
		for(Integer value: nums)
			sum+=value;
		
		System.out.println(sum);
		
		
	///////////////////////////////////////
    // Identity is not mandatory.
	// Suppose if we don't have identity, the reduce() will return an Optional object
    /*		
     Suppose if we have an empty list i.e. it will be an empty stream, we won't perform any operation with the empty stream so obviously the initial value 
	 will be nothing (not even 0). So in that case the stream is empty. Because the stream is empty the reduce() will return an Optional object.
	 Whenever the stream is empty, Optional concept will get in.
     */
	// If the reduce() is without a identity(initial) value the reduce() will return an Optional object. Why? Because it doesn't know what to return since
    // we don't have an initial value and the stream is empty.
    // There is an overloaded method for reduce() i.e. reduce() with identity and reduce() without identity.
		
		
		List<Integer> numss = Arrays.asList(1,2,3,4,5,6,7);
		
		Optional<Integer> res = numss.stream()
		.reduce((summ,elements)-> summ+elements);
		System.out.println(res.get());
		
		

	}

}
