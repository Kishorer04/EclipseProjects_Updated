package supplierExample;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample {

	
	public void usingAnonymousClass() {
		
		 Supplier supplier = new Supplier() {
				
		        public Object get() {
				Calendar calendar= Calendar.getInstance();
				return calendar.getTime();
			}
			
		};
		
		System.out.println(supplier.get());
		
	}
	
	
	public void usingLamda() {
		
		Supplier supplier = () -> {
			                        Calendar calendar = Calendar.getInstance();
			                        return calendar.getTime();
				
		                           };
		                           
		System.out.println(supplier.get());
		
	}
	
	
	public static void main(String[] args) {
		SupplierExample se = new SupplierExample();
		se.usingAnonymousClass();
		se.usingLamda();
	     
	}

}
