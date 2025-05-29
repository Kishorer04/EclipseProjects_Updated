package static_default_predicate_demo;

public class Employee implements Contract, Contract2 {

	public static void main(String[] args) {
		
     Contract emp = new Employee();
     emp.calculate_Salary(800,300);
     Contract.staticTest(); //Can only call with interface name
//     Employee.staticTest();// cannot call with class name
                           // so static methods in interface belong only to interface
     

	}

	@Override
	public void calculate_Salary(int a, int b) {
		// TODO Auto-generated method stub
		Contract.super.calculate_Salary(a, b);
		Contract2.super.calculate_Salary(a, b);
	}

}
