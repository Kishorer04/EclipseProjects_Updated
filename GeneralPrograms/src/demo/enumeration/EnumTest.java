package demo.enumeration;

public class EnumTest {

	public static void main(String[] args) {
		
		
		EnumDemo[] ed= EnumDemo.values();
		
		//for-each
		for(EnumDemo e:ed)
		{
			System.out.println(e+"-->"+e.ordinal());
		}
		
		System.out.println("Hello "+EnumDemo.WEDNESDAY);
		 EnumDemo c = EnumDemo.THURSDAY;
	   System.out.println("Hi "+c);
		
	    
	}
	

}
