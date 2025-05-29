package DynamicBinding;

public class Staff extends CEO {
	
	
	public static void main(String[] args) {
		CEO s = new Staff();  // Dynamic Binding //Parent class reference pointing to Child class memory
		s.work();    
		s.display();
//		s.attendMeetings(); //Cannot call this method bcoz this is child class method
	}
	
	public void work() {
		System.out.println("Working in Chennai");
	}

	public void display() {
		System.out.println("Display in Staff");
	}
	public void attendMeetings() {
		System.out.println("Staff meeting");
	}

}
