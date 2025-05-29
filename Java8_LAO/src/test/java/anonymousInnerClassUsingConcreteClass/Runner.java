package anonymousInnerClassUsingConcreteClass;

public class Runner {

	public static void main(String[] args) {
		
		Parent child = new Parent() {  //Anonymous inner class starts here
			
			public void findPartner() {
				System.out.println("Ma life ma rules from Anonymous Inner class");
			}
			
		};   //Anonymous inner class ends here
		
		child.educate();
		child.leaveAssests();
		child.findPartner();
		
		Parent parent = new Parent();
		parent.findPartner();
		
		Child parent1 = new Child();
		parent1.findPartner();
		
	}
}
