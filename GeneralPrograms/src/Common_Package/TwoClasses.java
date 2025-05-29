package Common_Package;


public class TwoClasses {

	public static void main(String[] args) {
		System.out.println("Main method hello");
		
		SecondClass secondClass = new SecondClass();
		
		secondClass.call();
		
	}
}
	
	   class SecondClass {
		public void call() {
			System.out.println("Calling");
		}
	}

