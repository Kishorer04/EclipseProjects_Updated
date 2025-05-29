package predicateExamples;

public class StudentWithGetters {

	
	public String name;
	public double percentage;
	
	
	StudentWithGetters(String name, double percentage){
		this.name = name;
		this.percentage = percentage;
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
}
