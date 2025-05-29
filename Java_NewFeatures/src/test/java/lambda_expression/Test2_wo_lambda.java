package lambda_expression;

public class Test2_wo_lambda {
	
	public static void main(String[] args) {
		
		//without lambda
		Thread t = new Thread(
				             new Runnable() {

								@Override
								public void run() {
									
								for(int i=0;i<5;i++)
								{
									System.out.println("Child "+ i);	
								}	
								}

				             }

				            );
		t.start();
//		t.run();

	}
         
}
