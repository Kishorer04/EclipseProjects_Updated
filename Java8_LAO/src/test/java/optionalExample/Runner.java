package optionalExample;

public class Runner {

	public static void main(String[] args) {
		Person adam = new Person("Adam",new Car("Civic", new Insurance("Geico")));
		
		System.out.println(adam.getCarInsuranceName(adam));
		
		
		Person john = new Person("John",null);
	    
		System.out.println(john.getCarInsuranceName(john));
	}
	
}
