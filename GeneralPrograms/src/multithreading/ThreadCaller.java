package multithreading;



public class ThreadCaller {

	public static void main(String[] args) {
		MultiThread mt=new MultiThread();
		MultiThread2 mt2=new MultiThread2();
	    System.out.println(mt.getPriority());	
		mt.start();
		mt2.start();
		//System.out.println(mt2.getName());
	
//		try {
//			mt2.join(2000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
		
		for(int i=1;i<=5;i++) {
			//mt.interrupt();
			System.out.println("ThreadCaller"+i);
		}
	}

}
