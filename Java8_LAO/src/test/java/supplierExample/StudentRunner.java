package supplierExample;

import java.util.List;
import java.util.ArrayList;
import java.util.function.*;

public class StudentRunner {

	public static void main(String[] args) {
	
		List<Student> list =  new ArrayList<Student>();
		
		list.add(new Student("Kishore", 23));
		list.add(new Student("Ramya", 30));
		list.add(new Student("Kiran", 59));
		
		
	    Consumer con = input -> System.out.println(input);
	    list.forEach(con);
	    
	    
	    Supplier<List<Student>> sup = () -> {
	    	                  return list;
	                         };
	                         
	     System.out.println(sup.get());
		

	}

}
