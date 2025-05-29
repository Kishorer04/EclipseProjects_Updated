package UserDefinedException;

public class VoterIDException extends Exception{

	public VoterIDException(int age) {
		System.out.println("Your age is"+ age);
	}
	
	
	public static void verifyAge(int age) {
		
		if(age<18) {
			
			try {
				
				throw new VoterIDException(age); 
			}
			catch(VoterIDException ve)
			{
				System.out.println("Please check ur age");
			}
			
			
		}
		
	}

	
	public static void main(String[] args) {
		
		VoterIDException.verifyAge(15);
		

	}

}
