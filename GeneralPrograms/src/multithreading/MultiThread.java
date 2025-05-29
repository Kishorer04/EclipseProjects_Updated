package multithreading;

public class MultiThread extends Thread
{
	public void run() {
		//Thread.yield();
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Multithread"+i);
		}
	}
	
	
	public void hello() {
		for(int i=1;i<=5;i++)
			System.out.println("Hello method"+i);
	}

}
