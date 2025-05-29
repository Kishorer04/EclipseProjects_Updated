package Common_Package;

public class EnumDemo {
	enum Day{
		SUNDAY("S"),MONDAY("M"),TUESDAY("T"),WEDNESDAY("W"),THURSDAY("TH"),FRIDAY("F"),SATURDAY("SA");
	
	String abb;
	
	Day(String a){
		abb=a;
	}
	
	
	String getabb() {
		return abb;
	}
	  
	}
	public static void main(String[] args) {
		
	Day d=Day.TUESDAY;
	System.out.println(d);
	System.out.println(d.getabb());

	}

}
