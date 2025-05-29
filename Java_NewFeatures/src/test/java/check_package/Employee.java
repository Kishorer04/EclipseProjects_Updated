package check_package;

public class Employee implements Contract  {

	public static void main(String[] args) {
		
     Contract emp = new Employee();
     emp.calculate_Salary(800,300);
                
//		Contract.staticTest();    //Can only call with interface name
//     Employee.staticTest();	  // cannot call with class name
                                  // so static methods in interface belong only to interface  
	}
}
