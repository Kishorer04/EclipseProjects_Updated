package function_consumer;

import java.util.function.Consumer;

public class Consumer_Implementation implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}

}
