package consumerExample;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	
	public void usingAnonymousClass() {
		Consumer<String> c1 = new Consumer<String>() {

			@Override
			public void accept(String input) {
             System.out.println(input + " is a word");
			}
			
		};
		
		c1.accept("Nanri");
	}
	
	public void usingLambda() {
		
		Consumer<String> con1 = input -> System.out.println(input+ " is a word");
		
		Consumer<String> con2 = input -> System.out.println(input+ " di mapla is an emotion");
		
		con1.andThen(con2).accept("Vanakam");
	}

	public static void main(String[] args) {
		ConsumerDemo c = new ConsumerDemo();
		c.usingLambda();
		c.usingAnonymousClass();
		
	}

}
