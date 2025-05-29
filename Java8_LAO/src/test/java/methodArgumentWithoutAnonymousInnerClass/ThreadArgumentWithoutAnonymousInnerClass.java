package methodArgumentWithoutAnonymousInnerClass;

public class ThreadArgumentWithoutAnonymousInnerClass {

	public static void main(String[] args) {
		
		
		Thread thread = new Thread(new ThreadArgumentWithoutAnonymousInnerClassImpl());
		thread.start();
		
	}

}
