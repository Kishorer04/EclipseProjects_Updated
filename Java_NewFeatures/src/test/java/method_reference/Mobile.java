package method_reference;

public class Mobile {
	
	int price;
	
	Mobile(int price){
	System.out.println("Constructor"+ price);	
	}

	public static void show(int value)
	{
		System.out.println(value);
	}
	
	public static void main(String[] args) {
	
//		Contract cc = new Contract() {
//			@Override
//			public void display(int no) {
//				System.out.println(no);
//				
//			}
//	             	};
	             	
//	           Contract cc = no-> System.out.println(no);
//	        	cc.display(34);
	        	
//	        	Mobile m = new Mobile();
//	        	Contract cc =m::show; //(or) Contract cc = new Mobile()::show;
//	        	cc.display(40);
		
		//If show() is static method then call using class name
//	        Contract cc = Mobile::show;
//	        cc.display(89);
		
		Contract cc = Mobile::new;
		cc.display(10000);
		
		
	       

	}

}
