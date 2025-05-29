package methodArgumentWithoutAnonymousInnerClass;

public class  ThreadArgumentWithoutAnonymousInnerClassImpl implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Thread helper..");
		
	}

	
	

}
