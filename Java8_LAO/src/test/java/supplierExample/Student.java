package supplierExample;

public class Student {
	
	private String name;
	private int percentage;
	
	
	Student(String name, int percentage)
	{
		this.name = name;
		this.percentage = percentage;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getPercentage() {
		return percentage;
	}
	
	
	
	public String toString() {
		return "Name:" + getName() + ", Percentage:" + getPercentage();
	}

}
