package biExamples;

import java.util.function.BiConsumer;

public class biConsumerDemo {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> add = (num1,num2)->System.out.println(num1+num2);
		add.accept(1, 2);
		
		BiConsumer<Integer, Integer> mul = (num1,num2)->System.out.println(num1*num2);
		mul.accept(1, 2);
		
		add.andThen(mul).accept(1, 2);
		

	}

}
