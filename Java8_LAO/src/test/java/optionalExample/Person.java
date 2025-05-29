package optionalExample;

public class Person {

	private String name;
	private Car car;
	
	public Person(String name, Car car)
	{
		super();
		this.name=name;
		this.car=car;
	
		
	}
	
	
	public String getName() {
		return name;
		
	}
	
	public Car getCar() {
		return car;
	}
	
	public String getCarInsuranceName(Person person) {
		
//		Car c = person.getCar();
//		System.out.println(c);
//		Insurance i =c.getInsurance();
//		return i.getName();
		
		return person.getCar().getInsurance().getName();
	}
	
	
}
