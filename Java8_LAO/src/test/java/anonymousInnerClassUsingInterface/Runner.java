package anonymousInnerClassUsingInterface;

public class Runner {

	public static void main(String[] args) {
		
		IParent obj = new IParent() {

			@Override
			public void findPartner() {
				System.out.println("Ma life ma rules from anonymous inner class");	
			}
		};
		
		obj.findPartner();
	}

}
