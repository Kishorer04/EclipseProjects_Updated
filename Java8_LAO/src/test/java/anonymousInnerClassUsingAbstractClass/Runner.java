package anonymousInnerClassUsingAbstractClass;

public class Runner {

	public static void main(String[] args) {
		
		Parent obj = new Parent() {

			@Override
			public void findPartner() {
				System.out.println("Find Partner from anonymous inner class");
				
			}	
		};
		
		obj.findPartner();
		
		Child p = new Child();
		p.educate();
		p.leaveAssests();
		p.findPartner();
		
	}

}
