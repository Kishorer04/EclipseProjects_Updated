package multithreading;

public class MultiThread2 extends Thread {
	
	public void run() {
		for(int i =1;i<=5;i++) {
			System.out.println("MultiThread****"+i);
		}
	}

	

}
