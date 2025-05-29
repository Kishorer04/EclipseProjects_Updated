package Common_Package;

public class Check_Break_Continue {

	public static void main(String[] args) {
		
		//for loop
		
//		for(int i=0;i<4;i++)
//		{
//			System.out.println("hello");
//			if(i==2)
//				break;
//			System.out.println("vanakam");
//		}
//		System.out.println("out of loop");
		
		
		//while loop
		
//		int i=0;
//		while(i<5)
//		{
//			System.out.println("hello");
//			if(i==2)
//				continue;
//			System.out.println("vanakam");
//			i++;
//		}
//		System.out.println("out of loop");

		
		
		//do-while loop
		int i=0;
		do {
			System.out.println("hello");
			if(i==2)
				break;
			System.out.println("vanakam");
			i++;
		}while(i<3);
		
		System.out.println("out of loop");
		
	}

}
