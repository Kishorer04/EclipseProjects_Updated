package hashCode_Equals;

import java.util.HashSet;
import java.util.Set;

public class Employee2 {

	String name;
	int id;

	public Employee2(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {

		Employee2 employee1 = new Employee2("Raja", 121);
		Employee2 employee2 = new Employee2("Mohideen", 122);

		Set<Employee2> employees = new HashSet();
		employees.add(employee1);
		employees.add(employee2);
		System.out.println(employees);
	}

	@Override
	public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + id;
//     result = prime * result + ((name==null)?0:name.hashCode()); // Commenting this bcoz 
                                                                   // we want HashCode based
                                                                   // on id only to avoid
                                                                   // duplicates in the set
     return result;
	}
	

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)                        // Commenting bcoz all these are not needed
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Employee2 other =  (Employee2) obj;
		if (id != other.id) // Change 'id' to 'name' for comparison using name 
			                // instead of id. i.e. if(name!= other.name) 
			return false;
//		if (name == null) {                     // Commenting bcoz these are not needed
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name= " + name + ",id= " + id + " ";
	}

}
