package lambda_expression;

public class Test2_w_lambda {
	
	public static void main(String[] args) {
		
	Thread  t = new Thread(
			
			              ()->{
			            	for(int i=0;i<5;i++)
			            		System.out.println("child "+i);
			                 }

			             );
		t.start();
	}

}
