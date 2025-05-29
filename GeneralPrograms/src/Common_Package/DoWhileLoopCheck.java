package Common_Package;

public class DoWhileLoopCheck {

	public static void main(String[] args) {
		
		int i = 0;
		do {
			System.out.println("Hello");
			i++;
			System.out.println(i);
			if(i==3)
			break;
			
		}while(i<5);
		System.out.println("came out of loop");

	}

}
