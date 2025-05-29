package Common_Package;

public class MultiplyCharacters {

	public static void main(String[] args) {
		
//		String s="b3c4";
//		for(int j=0;j<s.length();j=j+2) {
//			
//		char a=s.charAt(j);
//		char b=s.charAt(j+1);
//		System.out.println("b value "+b);
//		int z=b;
//		System.out.println("z value "+z);
//	    int c=Character.getNumericValue(b);
//				
//          for(int i=0;i<z;i++) {
//        	  System.out.print(a);
//          }
//		}
		char a='a';
		//ASCII value
		int m= a;
		System.out.println("ASCII value "+m);
		
		//Numeric value
		int n= Character.getNumericValue(a);
		System.out.println("Numeric value "+n);
		
//	    int t=Integer.parseInt(String.valueOf(a));
//	    System.out.println("Parse value "+t);
//		
		
		char p='3';
		//ASCII value
		int o = p;
		System.out.println("ASCII value "+o);
		
		//Numeric Value
		int i=Character.getNumericValue(p);
		System.out.println("Numeric value "+i);
		
		
		int b=123;
//		System.out.println(Integer.parseInt(b));
		System.out.println(Integer.valueOf(b));
		System.out.println(String.valueOf(b));
		
		

		
				
	}
}

