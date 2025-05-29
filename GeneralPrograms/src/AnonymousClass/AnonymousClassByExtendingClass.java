package AnonymousClass;

class ParentClass {
	void parentMethod() {
		System.out.println("Parent method");
	}
}


public class AnonymousClassByExtendingClass {

	public static void main(String[] args) {
	
		ParentClass parentClass = new ParentClass() {
			
			@Override
			void parentMethod() {
				System.out.println("Parent method in anonymous class");
			}
		
		};
		
		

	}

}
