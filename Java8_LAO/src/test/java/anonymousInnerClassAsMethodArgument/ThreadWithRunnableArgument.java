package anonymousInnerClassAsMethodArgument;

public class ThreadWithRunnableArgument {

	public static void main(String[] args) {
		
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0; i<5; i++)
				{
					System.out.println("Anonymous inner class method argument example");
				}
			}
			
		});
		
		thread.start();
		
		
		
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i=0; i<5; i++)
//				{
//					System.out.println("Anonymous inner class method argument example");
//				}
//				
//			}	
//		}).start();

	}

}
