package check_package2;

public class Employee  {

//	public static void main(String[] args) {
//		
//         //Method 1 (Normal as usual)
//		Employee emp = new Employee();
//		emp.maintainTime();
//		
//	}
//		@Override
//		public void maintainTime() {
//			System.out.println("Maintaing time");
//			
//		}	
//}	
	
	//Method 2 (Anonymous inner class implemented through interface)

//	public static void main(String[] args) {
//		
//	Rules r = new Rules() {
//
//		@Override
//		public void maintainTime() {
//			System.out.println("Maintaining time");
//			
//		}
//	};		 
//		 
//	r.maintainTime();
//		
//	                 
//}
//}


//Method 3 (Since Rules is a Functional Interface, we are implementing lambda)
public static void main(String[] args) {
	Rules emp = ()->{
    System.out.println("Maintaining time");
    };
emp.maintainTime();

}
}





	
