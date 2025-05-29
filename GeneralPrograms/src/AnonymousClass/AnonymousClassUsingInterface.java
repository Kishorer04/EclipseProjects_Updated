package AnonymousClass;


interface ParentInterface{
	void interfaceMethod();
}



public class AnonymousClassUsingInterface {

	
	public static void main(String[] args) {
		
	ParentInterface parentInterface = new ParentInterface() {

		@Override
		public void interfaceMethod() {
			System.out.println("Interface method in AnonymousClass");
			
		}	
		
	};
	parentInterface.interfaceMethod();
		
	}
}
